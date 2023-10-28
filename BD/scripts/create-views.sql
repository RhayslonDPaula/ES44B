-- TUDO ERRADO NESSAS VIEWS

-- View para exibir a quantidade de cortes por cliente.
CREATE VIEW cortes_por_cliente AS
SELECT cli_id, cli_nome,
	(SELECT COUNT(cor_idCliente) 
		FROM cortes co, cliente c
		WHERE cli_id = cor_idCliente
		) as qtdCorte,
	sum(cor_valorTotal) as ValorTotal
FROM cliente c, cortes co
WHERE cor_idCliente = cli_id
GROUP BY cli_id;

-- View para exibir a qunatidade de compras realizadas pelos clientes
CREATE VIEW compras_por_cliente AS
SELECT c.ven_idCliente,
	c.qtd as qtdCompras,
    sum(ven_valorTotal) as ValorTotal
FROM cliente cl, venda v
WHERE cli_id = v.ven_idCliente
GROUP BY c.ven_idCliente;

SELECT * from vendas_mes_atual;

-- View para exibir a quantidade de vendas de um funcionario no mes atual
CREATE VIEW vendas_mes_atual AS
SELECT v.fun_id, fun_nome, fun_cargo, 
	(
    SELECT COUNT(v.fun_id)
    FROM venda v, funcionario f
    WHERE v.fun_id = f.fun_id
    ) as qtdVendas, 
	SUM(ven_valorTotal) as ValorTotal
FROM funcionario f, venda v
WHERE f.fun_id = v.fun_id and 
	(ven_dataVenda between DATE_FORMAT(NOW() ,'%Y-%m-01') 
		and DATE_ADD(DATE_FORMAT(NOW() ,'%Y-%m-01'), INTERVAL 30 DAY))
GROUP BY v.fun_id;