-- Crear la tabla producto
CREATE TABLE microserviciopedido.producto (
    id_producto INT AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    stock INT NOT NULL,
    precio_unitario DOUBLE NOT NULL,
    PRIMARY KEY (id_producto)
);

-- Insertar datos en la tabla producto
INSERT INTO microserviciopedido.producto (nombre, descripcion, stock, precio_unitario) VALUES 
('Aspiradora', 'Aspiradora robot inteligente', '25', '250.00'),
('Horno', 'Horno eléctrico multifunción', '15', '200.00'),
('Silla', 'Silla ergonómica de oficina', 50, 45.00);

-- Crear la tabla pedido
CREATE TABLE microserviciopedido.pedido (
    id_pedido INT AUTO_INCREMENT,
    comprador VARCHAR(255) NULL,
    nombre_producto VARCHAR(255) NULL,
    unidades INT NOT NULL,
    fecha_pedido DATE NOT NULL,
    precio_total DOUBLE NOT NULL,
    PRIMARY KEY (id_pedido)
);

-- Insertar datos en la tabla pedido
INSERT INTO microserviciopedido.pedido (comprador, nombre_producto, unidades, fecha_pedido, precio_total) VALUES
('Juan Perez', 'Mesa', 2, '2024-05-01', 300.00),
('Ana Gomez', 'Microondas', 1, '2024-05-03', 80.00),
('Carlos Ruiz', 'Silla', 4, '2024-05-05', 180.00);
