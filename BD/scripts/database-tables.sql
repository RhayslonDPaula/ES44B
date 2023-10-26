CREATE DATABASE IF NOT EXISTS barber; -- cria o database barber
USE barber; -- Usa o database barber

-- Cria tabela cliente
CREATE TABLE IF NOT EXISTS cliente(
	cli_id INT NOT NULL PRIMARY KEY,
    cli_nome VARCHAR(45) NOT NULL,
    cli_idade INT,
    cli_telefone1 VARCHAR(11),
    cli_telefone2 VARCHAR(11),
    cli_cidade VARCHAR(30),
    cli_endereco VARCHAR(50)
);

-- cria database funcionario com uma regrinha 
CREATE TABLE IF NOT EXISTS funcionario(
	fun_id INT NOT NULL PRIMARY KEY,
    fun_nome VARCHAR(45) NOT NULL,
    fun_cargo VARCHAR(15) NOT NULL,
    fun_nivelAcesso INT NOT NULL, -- 1: basic user, 2: Can add somethings, 3: admin level
    fun_nascimento INT,
    fun_telefone1 VARCHAR(11),
    fun_telefone2 VARCHAR(11),
    fun_cidade VARCHAR(30),
    fun_endereco VARCHAR(50),
    CONSTRAINT chk_fun_nivelAcesso CHECK(fun_nivelAcesso BETWEEN 1 AND 3)
    -- A constraint acima determina que apenas sejam aceitos os valores 1, 2 e 3.
);

CREATE TABLE IF NOT EXISTS produtos(
	pro_id INT NOT NULL PRIMARY KEY,
    pro_nome VARCHAR(45) NOT NULL,
    pro_categoria VARCHAR(15) NOT NULL,
    pro_quantidade INT,
    pro_preco FLOAT,
    pro_fabricacao DATE,
    pro_vencimento DATE
);
