
USE barber;
 
-- View para exibir a quantidade de cortes por cliente.
CREATE VIEW vw_cortes_por_cliente AS
	SELECT c.cli_id, cli_nome, qtdCortes,
		sum(cor_valorTotal) as ValorTotal
	FROM cliente c, cortes co,
		(SELECT cli_id, COUNT(cor_idCliente) qtdCortes
			FROM cortes co, cliente c
			WHERE cli_id = cor_idCliente
			GROUP BY cli_id
		) AS qc
	WHERE cor_idCliente = c.cli_id and cor_idCliente = qc.cli_id
	GROUP BY cli_id;
    /*Aquele select no from é para simular uma tabela, a qual retorna o id e as compras por cada id.
		Com ela eu consigo comparar os id na tabela de venda e na tabela simulada, assim eu consigo
		a quantidade de vendas por cada id.
	*/


-- View para exibir a quantidade de compras realizadas pelos clientes
CREATE VIEW vw_compras_por_cliente AS
SELECT ven_idCliente, qtdCompras,
    sum(ven_valorTotal) as ValorTotal
FROM cliente cl, venda v,
	(SELECT cli_id, COUNT(ven_idCliente) qtdCompras
    FROM venda v, cliente c
    WHERE ven_idCliente = c.cli_id
    GROUP BY cli_id
    ) AS qc
WHERE cl.cli_id = v.ven_idCliente AND ven_idCliente = qc.cli_id
GROUP BY ven_idCliente;
	
    
-- View para exibir a quantidade de vendas de um funcionario no mes atual
CREATE VIEW vw_vendas_mes_atual AS
	SELECT v.fun_id, fun_nome, fun_cargo, qtdVendas,
		SUM(ven_valorTotal) as ValorTotal
	FROM funcionario f, venda v,
		(SELECT v.fun_id, COUNT(v.fun_id) qtdVendas
		FROM venda v, funcionario f
		WHERE v.fun_id = f.fun_id
		GROUP BY v.fun_id
		) AS qv
	WHERE f.fun_id = v.fun_id and v.fun_id = qv.fun_id and 
		(ven_dataVenda between DATE_FORMAT(NOW() ,'%Y-%m-01') 
			and DATE_ADD(DATE_FORMAT(NOW() ,'%Y-%m-01'), INTERVAL 30 DAY))
	GROUP BY v.fun_id;
	
    /* A lógica das datas consiste em comparar a data da venda com o intervalo de tempo determinado.
		O intervalo é do primeiro dia do mês até 30 dias depois dele. O primeiro DATE_FORMAT formata o dia
		do mês atual para primeiro dia. O segundo faz a mesma formação e, com a func DATE_ADD, adiciona 
		30 dias partindo do dia 1. Então iremos verificar se a data da venda está dentro (between) desse intervalo.
	*/
