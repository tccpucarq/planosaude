CREATE TABLE pessoa(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome varchar(50) UNIQUE NOT NULL,
	CPF BIGINT(11) NOT NULL,
	id_endereco BIGINT(20) NOT NULL,
	FOREIGN KEY (id_endereco) REFERENCES endereco(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, cpf, id_endereco) values ('Ricardo Silva', 34697659845, 1);
INSERT INTO pessoa (nome, cpf, id_endereco) values ('Andre Serqueira', 34677659845, 2);
INSERT INTO pessoa (nome, cpf, id_endereco) values ('Luis Loyola', 34677659846, 3 );
INSERT INTO pessoa (nome, cpf, id_endereco) values ('Amanda Trigo', 34677659846, 4);