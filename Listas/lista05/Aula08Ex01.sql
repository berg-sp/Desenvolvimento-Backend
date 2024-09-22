create database aula_sql;
use aula_sql;
CREATE TABLE curso (id INT PRIMARY KEY, area VARCHAR(45), dataInicio DATE);
CREATE TABLE aluno (matricula CHAR(4) PRIMARY KEY, nome VARCHAR(45));
ALTER TABLE curso ADD COLUMN professor VARCHAR(45);
select * from curso;
describe curso;
INSERT INTO curso VALUES (1, 'programação', '2024-10-01', 'Davi'), 
						(2, 'administração', '2025-01-01', 'Mateus');
select * from aluno;
INSERT INTO aluno VALUES ('A001', 'Miguel'), 
						('A002', 'Jorge');
INSERT INTO aluno VALUES ('B001', 'Murilo');
ALTER TABLE aluno ADD COLUMN fkCurso INT;
describe aluno;
ALTER TABLE aluno ADD CONSTRAINT fkCursoAluno FOREIGN KEY (fkCurso) REFERENCES curso(id);
UPDATE aluno SET fkCurso = 1;
UPDATE aluno SET fkCurso = 1 WHERE matricula = ‘A001’ OR matricula = ‘A002’;
