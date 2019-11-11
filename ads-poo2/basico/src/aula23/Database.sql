-- Criar Banco escoladb
create database escoladb;
use escoladb;

-- Criar tabela aluno
CREATE TABLE aluno (
  id int(11) PRIMARY KEY AUTO_INCREMENT,
  ra char(15) NOT NULL,
  nome varchar(100) NOT NULL,
  curso varchar(50) NOT NULL,
  nascimento date DEFAULT NULL,
  telefone char(25) DEFAULT NULL
);