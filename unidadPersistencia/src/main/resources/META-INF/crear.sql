CREATE TABLE Noticia (
    titulo VARCHAR(255) PRIMARY KEY,
    autor VARCHAR(255),
    fecha DATE
);

CREATE TABLE Comentario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    texto TEXT,
    autor VARCHAR(255),
    noticia_titulo VARCHAR(255),
    FOREIGN KEY (noticia_titulo) REFERENCES Noticia(titulo)
);