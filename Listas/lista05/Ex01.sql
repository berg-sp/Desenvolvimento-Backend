create database db_empresa_eventos;
use db_empresa_eventos;
create table tb_empresa_eventos (id INT primary key, nome VARCHAR(255), localizacao varchar(255), preco_ingresso decimal(6,2));
insert into tb_empresa_eventos values (1, 'Raul', 'Bahia', 120.00);
insert into tb_empresa_eventos values (2, 'Gilberto', 'Minas Gerais', 125.00);