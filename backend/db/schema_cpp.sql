CREATE SCHEMA cadastro_positivo_do_pecuarista;

CREATE TABLE admins_cadastro_positivo(
    id SERIAL PRIMARY KEY,
    cpf VARCHAR (255) NOT NULL,
    senha VARCHAR (255) NOT NULL,
    login VARCHAR (255) NOT NULL
);

CREATE TABLE pecuarista(
    id SERIAL PRIMARY KEY,
    cnpj VARCHAR(255),
    nome VARCHAR (255),
    car VARCHAR (255)
);

CREATE TABLE frigorifico(
    id SERIAL PRIMARY KEY,
    cnpj VARCHAR(255),
    status BOOLEAN
);

CREATE TABLE cadastro_positivo(
    id SERIAL PRIMARY KEY,
    id_pecuarista INTEGER NOT NULL,
    score INTEGER
);

CREATE TABLE documentos(
    id SERIAL PRIMARY KEY,
    id_cadastro_positivo INTEGER NOT NULL,
    valor INTEGER,
    situacao VARCHAR(255),
    tipo VARCHAR(255),

    CONSTRAINT fk_id_cadastro_positivo FOREIGN KEY (id_cadastro_positivo) REFERENCES cadastro_positivo
);

ALTER TABLE cadastro_positivo ADD CONSTRAINT fk_id_pecuarista FOREIGN KEY (id_pecuarista) REFERENCES pecuarista;
