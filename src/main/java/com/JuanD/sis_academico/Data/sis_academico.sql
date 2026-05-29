create database sis_academico;
use sis_academico;

CREATE TABLE aprendices (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    nombre   VARCHAR(100) NOT NULL,
    correo   VARCHAR(100) NOT NULL UNIQUE,
    programa VARCHAR(150) NOT NULL,
    ficha    VARCHAR(20)
);

INSERT INTO aprendices (nombre, correo, programa, ficha) VALUES
    ('Juan David',   'juan@sena.edu.co',    'Análisis y Desarrollo de Software', '2758369'),
    ('Laura Gómez',  'laura@sena.edu.co',   'Gestión de Redes',                  '2758370'),
    ('Carlos Ruiz',  'carlos@sena.edu.co',  'Análisis y Desarrollo de Software', '2758369');
    
    SELECT * FROM aprendices;
