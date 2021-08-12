
DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	trabajo enum('bombero', 'programador', 'camarero')
);

insert into empleados (nombre, apellido, trabajo)values('Jose','Marin', 'programador');
insert into empleados (nombre, apellido, trabajo)values('Izan','Abad', 'programador');
insert into empleados (nombre, apellido, trabajo)values('Julio','Sanchez', 'bombero');
insert into empleados (nombre, apellido, trabajo)values('David','Martinez', 'camarero');
insert into empleados (nombre, apellido, trabajo)values('Pedro','Piedra', 'bombero');