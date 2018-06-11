CREATE TABLE curso (
  idcurso SERIAL,
  nome varchar(30) NOT NULL,
  PRIMARY KEY (idcurso)
) ;

-- Dumping data for table pesquisa.entrevistado: ~16 rows (approximately)

INSERT INTO curso (nome) VALUES
	('Ciência da Computação'),
	('Direito'),
	('Filosofia');
