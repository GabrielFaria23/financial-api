CREATE TABLE pessoa (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    logradouro VARCHAR(30),
    numero VARCHAR(30),
    complemento VARCHAR(30),
    bairro VARCHAR(30),
    cep VARCHAR(30),
    cidade VARCHAR(30),
    estado VARCHAR(30),
	ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ("Gabriel", "Rua 1", "1", "casa", "bairro 2",
    "34434444", "Pimenta", "Minas Gerais", true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ("Marcos", "Rua 2", "2", "casa", "bairro 3",
    "34434444", "Pains", "Minas Gerais", true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ("Maria", "Rua 3", "3", "casa", "bairro 4",
    "34434444", "Piumhi", "Minas Gerais", true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ("Carlos", "Rua 4", "4", "casa", "bairro 5",
    "34434444", "São Paulo", "São Paulo", false);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ("Guilherme", "Rua 5", "5", "casa", "bairro 6",
    "34434444", "Formiga", "Minas Gerais", false);

