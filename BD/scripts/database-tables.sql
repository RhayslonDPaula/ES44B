/*
DROP DATABASE barber
*/
CREATE DATABASE IF NOT EXISTS barber; -- cria o database barber

USE barber; -- Usa o database barber para criar as tables

-- Cria tabela cliente
CREATE TABLE IF NOT EXISTS cliente(
	cli_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Not null com auto increment é redundante, mas coloquei porque eu quis.
    cli_nome VARCHAR(45) NOT NULL,
    cli_idade INT,
    cli_telefone1 VARCHAR(11),
    cli_telefone2 VARCHAR(11),
    cli_cidade VARCHAR(30),
    cli_endereco VARCHAR(50)
);

-- cria database funcionario com uma regrinha 
CREATE TABLE IF NOT EXISTS funcionario(
	fun_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fun_nome VARCHAR(45) NOT NULL,
    fun_cargo VARCHAR(15) NOT NULL,
    fun_nivelAcesso INT NOT NULL,
    fun_nascimento DATE,
    fun_telefone1 VARCHAR(11),
    fun_telefone2 VARCHAR(11),
    fun_cidade VARCHAR(30),
    fun_endereco VARCHAR(50),
    CONSTRAINT chk_fun_nivelAcesso CHECK(fun_nivelAcesso BETWEEN 1 AND 3)
    /* A constraint acima determina que apenas sejam aceitos os valores 1, 2 e 3 
	   no nivel de acesso, sendo eles: 1: basic user, 2: Can add somethings, 3: admin level
	*/
);

CREATE TABLE IF NOT EXISTS produtos(
	pro_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pro_nome VARCHAR(45) NOT NULL,
    pro_marca VARCHAR(15),
    pro_categoria VARCHAR(15) NOT NULL,
    pro_quantidade INT,
    pro_preco FLOAT,
    pro_fabricacao DATE,
    pro_vencimento DATE
);

CREATE TABLE IF NOT EXISTS venda(
	ven_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fun_id INT,
    ven_idCliente INT,
    ven_dataVenda DATE,
    ven_valorTotal FLOAT,
    CONSTRAINT fk_ven_fun_id -- nomeia a constraint de FK. FK_[nomeTabela]_[nomechave].
    FOREIGN KEY(fun_id)
    REFERENCES funcionario(fun_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS venda_produtos(
	ven_id INT,
    pro_id INT,
    CONSTRAINT fk_ven_pro_ven_id 
    FOREIGN KEY(ven_id)
    REFERENCES venda(ven_id) ON DELETE SET NULL,
    CONSTRAINT fk_ven_pro_pro_id
    FOREIGN KEY(pro_id)
    REFERENCES produtos(pro_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS servicos(
	ser_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ser_nomeServico VARCHAR(30) NOT NULL,
    ser_categoria VARCHAR(15),
    ser_duracaoServico INT
);

CREATE TABLE IF NOT EXISTS cortes(
	cor_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fun_id INT,
    cor_idCliente INT,
    cor_dataCorte DATE,
    cor_valorTotal FLOAT,
    CONSTRAINT fk_cor_fun_id
    FOREIGN KEY(fun_id) 
    REFERENCES funcionario(fun_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS cortes_servicos(
	cor_id INT,
    ser_id INT,
    CONSTRAINT fk_cor_ser_cor_id
    FOREIGN KEY(cor_id)
    REFERENCES cortes(cor_id) ON DELETE SET NULL,
    CONSTRAINT fk_cor_ser_ser_id
    FOREIGN KEY(ser_id)
    REFERENCES servicos(ser_id) ON DELETE SET NULL
);

/*

-- INSERTS PARA TESTAR O BANCO E SUAS CONSTRAINTS
INSERT INTO cliente(cli_nome, cli_idade, cli_telefone1, cli_cidade, cli_endereco)
VALUES('Jorge', 26, '43912345678', 'Leópolis', 'Rua Leleu da Capixaba, 99');

INSERT INTO cliente(cli_nome, cli_idade, cli_telefone1, cli_cidade, cli_endereco)
VALUES('Janja', 35, '43912345678', 'Distrito Federal', '3 poderes, 3');

INSERT INTO funcionario(fun_nome, fun_cargo, fun_nivelAcesso, fun_nascimento, fun_telefone1, 
	fun_cidade, fun_endereco)
VALUES('Paulo', 'admin', 3, '2001-12-07', '43912345678', 'Cornélio Procópio', 'Rua 1, 99');

INSERT INTO funcionario(fun_nome, fun_cargo, fun_nivelAcesso, fun_nascimento, fun_telefone1, 
	fun_cidade, fun_endereco)
VALUES('Emma', 'admin', 3, '1998-01-01', '43912345678', 'Cornélio Procópio', 'Rua 2, 100');

INSERT INTO funcionario(fun_nome, fun_cargo, fun_nivelAcesso, fun_nascimento, fun_telefone1, 
	fun_cidade, fun_endereco)
VALUES('Rhay', 'admin', 3, '1994-01-01', '43912345678', 'Andirá', 'Rua 3, 101');

INSERT INTO produtos(pro_nome, pro_marca, pro_categoria, pro_quantidade, pro_preco, 
	pro_fabricacao, pro_vencimento)
VALUES('Shampoo para cachos 1', 'SalonLine', 'Shampoos', 3, 14.50, '2023-10-28', '2024-10-28');

INSERT INTO venda(fun_id, ven_idCliente, ven_dataVenda, ven_valorTotal)
VALUES(1, 1, '2023-10-26', 14.50);

INSERT INTO venda(fun_id, ven_idCliente, ven_dataVenda, ven_valorTotal)
VALUES(2, 2, '2023-10-26', 14.50);

INSERT INTO venda(fun_id, ven_idCliente, ven_dataVenda, ven_valorTotal)
VALUES(3, 1, '2023-10-26', 14.50);

INSERT INTO venda_produtos
VALUES(1, 1);

INSERT INTO venda_produtos
VALUES(2, 1);

INSERT INTO venda_produtos
VALUES(3, 1);

INSERT INTO servicos(ser_nomeServico, ser_categoria, ser_duracaoServico)
VALUES('Corte de Cabelo', 'Cabelo', 25);

INSERT INTO cortes(fun_id, cor_idCliente, cor_dataCorte, cor_valorTotal)
VALUES(1, 1, '2023-10-26', 25);

INSERT INTO cortes_servicos
VALUES(1, 1)

*/