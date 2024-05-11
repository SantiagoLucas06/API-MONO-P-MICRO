CREATE TABLE Usuario (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         nome VARCHAR(255) NOT NULL,
                         email VARCHAR(255) NOT NULL UNIQUE,
                         senha VARCHAR(255) NOT NULL
);

CREATE TABLE Meme (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      titulo VARCHAR(255) NOT NULL,
                      imagem VARCHAR(255) NOT NULL,
                      autor_id INT NOT NULL,
                      data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                      FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);

CREATE TABLE CategoriaMeme (
                               id INT PRIMARY KEY AUTO_INCREMENT,
                               nome VARCHAR(255) NOT NULL,
                               descricao TEXT
);

CREATE TABLE MemeCategoria (
                               meme_id INT,
                               categoria_id INT,
                               PRIMARY KEY (meme_id, categoria_id),
                               FOREIGN KEY (meme_id) REFERENCES Meme(id),
                               FOREIGN KEY (categoria_id) REFERENCES CategoriaMeme(id)
);