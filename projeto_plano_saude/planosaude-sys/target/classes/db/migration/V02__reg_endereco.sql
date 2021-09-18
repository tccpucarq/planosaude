
CREATE TABLE endereco(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	rua VARCHAR(100) NOT NULL,
	numero INTEGER NOT NULL,
	cidade VARCHAR(100) NOT NULL,
	CEP VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO endereco (rua,numero,cidade,CEP) values ('andromeda', 100, 'Pouso Alegre', '08664-240');
INSERT INTO endereco (rua,numero,cidade,CEP) values ('rosas', 200, 'S. Paulo', '08664-200');
INSERT INTO endereco (rua,numero,cidade,CEP) values ('margaridas', 250, 'S. Carlos', '08664-300');
INSERT INTO endereco (rua,numero,cidade,CEP) values ('louvadeus', 350, 'Campinas', '08664-400');
