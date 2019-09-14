DROP TABLE IF EXISTS empleado;

CREATE TABLE empleado (
    id BIGINT IDENTITY PRIMARY KEY,
    apellido VARCHAR(50),
    nombre VARCHAR(50),
    cuil BIGINT
);

INSERT INTO empleado VALUES (1, 'francella', 'pepe', 203231232);
INSERT INTO empleado VALUES (2, 'fuse', 'dardo', 2323232323);