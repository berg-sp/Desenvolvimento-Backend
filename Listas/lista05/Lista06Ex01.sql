create database db_escola_tech;
use db_escola_tech;
create table tb_endereco (id int auto_increment primary key, logradouro varchar(255), bairro varchar(255), numero int, uf char(2), pais varchar(255));
create table tb_filial (id int auto_increment primary key, nome varchar(255), cnpj char(14), id_endereco int);
describe tb_filial;
drop database db_escola_tech;
delete from tb_filial;
ALTER TABLE aluno ADD CONSTRAINT fkCursoAluno FOREIGN KEY (fkCurso) REFERENCES curso(id);
alter table tb_filial add constraint id_endereco foreign key (fkid_endereco) references tb_endereco(id);