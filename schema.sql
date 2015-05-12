CREATE TABLE sala (
	id_sala integer NOT NULL,
	id_sede int8 NOT NULL,
	capacidad int8 NOT NULL,
	Nombre varchar(20) NOT NULL,
	actual int8 NOT NULL
);
ALTER TABLE sala ADD CONSTRAINT pk_id_sala PRIMARY KEY(id_sala);
CREATE TABLE sede (
	id_sede int8 NOT NULL,
	nombre varchar(30) NOT NULL,
	telefono varchar(20) NOT NULL,
	direccion varchar(30) NOT NULL,
	correo varchar(20) NOT NULL,
	FK_ciudad_id_ciudad varchar(5) NOT NULL
);
ALTER TABLE sede ADD CONSTRAINT pk_id_sede PRIMARY KEY(id_sede);
CREATE TABLE equipo (
	id_equipo varchar(20) NOT NULL,
	id_sala integer NOT NULL,
	FK_tipo_equipo_id_tipo_equipo varchar(3) NOT NULL,
	modelo varchar(30) NOT NULL,
	FK_marca_id_marca varchar(5) NOT NULL
);
ALTER TABLE equipo ADD CONSTRAINT pk_id_equipo PRIMARY KEY(id_equipo);
CREATE TABLE ciudad (
	id_ciudad varchar(5) NOT NULL,
	ciudad varchar(20) NOT NULL,
	id_departamento varchar(2) NOT NULL
);
ALTER TABLE ciudad ADD CONSTRAINT pk_id_ciudad PRIMARY KEY(id_ciudad);
CREATE TABLE persona (
	id_persona integer NOT NULL,
	nombres varchar(30) NOT NULL,
	apellidos varchar(30) NOT NULL,
	direccion varchar(10) NOT NULL,
	correo varchar(50) NOT NULL
);
ALTER TABLE persona ADD CONSTRAINT pk_id_persona PRIMARY KEY(id_persona);
CREATE TABLE administra (
	id_persona integer NOT NULL,
	id_sala integer NOT NULL,
	fecha_entrada timestamp NOT NULL,
	fecha_salida timestamp
);
ALTER TABLE administra ADD CONSTRAINT pk_administra PRIMARY KEY(id_persona,id_sala,fecha_entrada);
CREATE TABLE prestamo_equipo (
	id_equipo varchar(20) NOT NULL,
	id_persona integer NOT NULL,
	fecha_prestamo timestamp NOT NULL,
	fecha_devolucion timestamp NOT NULL
);
ALTER TABLE prestamo_equipo ADD CONSTRAINT pk_prestamo_cubiculo PRIMARY KEY(id_equipo,id_persona,fecha_prestamo);
CREATE TABLE departamento (
	id_departamento varchar(2) NOT NULL,
	nombre varchar(25) NOT NULL
);
ALTER TABLE departamento ADD CONSTRAINT pk_departamento PRIMARY KEY(id_departamento);
CREATE TABLE licencia (
	Id_licencia varchar(100) NOT NULL,
	producto varchar(50) NOT NULL,
	cantidad_actual smallint NOT NULL,
	cupo smallint NOT NULL,
	fecha_expiraccion timestamp NOT NULL
);
ALTER TABLE licencia ADD CONSTRAINT pk_licencia PRIMARY KEY(Id_licencia);
CREATE TABLE licencia_equipo (
	id_licencia varchar(100) NOT NULL,
	id_equipo varchar(20) NOT NULL,
	fecha_instalacion timestamp NOT NULL
);
ALTER TABLE licencia_equipo ADD CONSTRAINT pk_licencia_equipo PRIMARY KEY(id_licencia,id_equipo);
CREATE TABLE rol (
	id_rol varchar(2) NOT NULL,
	nombre varchar(20) NOT NULL
);
ALTER TABLE rol ADD CONSTRAINT pk_id_rol PRIMARY KEY(id_rol);
CREATE TABLE rol_persona (
	fecha_inicio timestamp NOT NULL,
	fecha_finalizacion timestamp,
	id_persona integer NOT NULL,
	id_rol varchar(2) NOT NULL
);
ALTER TABLE rol_persona ADD CONSTRAINT pk_rol_persona PRIMARY KEY(id_persona,id_rol,fecha_inicio);
CREATE TABLE tipo_equipo (
	id_tipo_equipo varchar(3) NOT NULL,
	descripcion varchar(30) NOT NULL
);
ALTER TABLE tipo_equipo ADD CONSTRAINT pk_id_tipo_equipo PRIMARY KEY(id_tipo_equipo);
CREATE TABLE marca (
	id_marca varchar(5) NOT NULL,
	descripcion varchar(20) NOT NULL
);
ALTER TABLE marca ADD CONSTRAINT pk_id_marca PRIMARY KEY(id_marca);
CREATE TABLE mantenimiento (
	id_mantenimiento varchar(3) NOT NULL,
	descripcion varchar(20) NOT NULL
);
ALTER TABLE mantenimiento ADD CONSTRAINT pk_mantenimiento PRIMARY KEY(id_mantenimiento);
CREATE TABLE equipo_mantenimiento (
	fecha date NOT NULL,
	FK_equipo_id_equipo varchar(20) NOT NULL,
	FK_mantenimiento_id_mantenimiento varchar(3) NOT NULL,
	motivo varchar(110)
);
ALTER TABLE equipo_mantenimiento ADD CONSTRAINT pk_equipo_mantenimiento PRIMARY KEY(fecha,FK_equipo_id_equipo,FK_mantenimiento_id_mantenimiento);
ALTER TABLE sala ADD CONSTRAINT fk_id_sede FOREIGN KEY (id_sede) REFERENCES sede(id_sede) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE administra ADD CONSTRAINT fk_id_sala FOREIGN KEY (id_sala) REFERENCES sala(id_sala) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE administra ADD CONSTRAINT fk_id_persona_administra FOREIGN KEY (id_persona) REFERENCES persona(id_persona) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE prestamo_equipo ADD CONSTRAINT fk_id_persona_prestamo FOREIGN KEY (id_persona) REFERENCES persona(id_persona) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE ciudad ADD CONSTRAINT fk_departamento_ciudad FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE licencia_equipo ADD CONSTRAINT fk_equipo_lic FOREIGN KEY (id_equipo) REFERENCES equipo(id_equipo) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE licencia_equipo ADD CONSTRAINT fk_licencia_licencia_equipo FOREIGN KEY (id_licencia) REFERENCES licencia(Id_licencia) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE equipo ADD CONSTRAINT fk_sala_equipo FOREIGN KEY (id_sala) REFERENCES sala(id_sala) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE prestamo_equipo ADD CONSTRAINT fk_equipo_prestamo FOREIGN KEY (id_equipo) REFERENCES equipo(id_equipo) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE sede ADD CONSTRAINT fk_ciudad_sede FOREIGN KEY (FK_ciudad_id_ciudad) REFERENCES ciudad(id_ciudad) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE rol_persona ADD CONSTRAINT fk_persona_rol_persona FOREIGN KEY (id_persona) REFERENCES persona(id_persona) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE rol_persona ADD CONSTRAINT fk_rol_rol_persona FOREIGN KEY (id_rol) REFERENCES rol(id_rol) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE equipo ADD CONSTRAINT fk_tipo_equipo_equipo FOREIGN KEY (FK_tipo_equipo_id_tipo_equipo) REFERENCES tipo_equipo(id_tipo_equipo) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE equipo ADD CONSTRAINT fk_marca_equipo FOREIGN KEY (FK_marca_id_marca) REFERENCES marca(id_marca) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE equipo_mantenimiento ADD CONSTRAINT fk_equipo_equipo_mantenimiento FOREIGN KEY (FK_equipo_id_equipo) REFERENCES equipo(id_equipo) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE equipo_mantenimiento ADD CONSTRAINT fk_mantenimiento_equipo_mantenimiento FOREIGN KEY (FK_mantenimiento_id_mantenimiento) REFERENCES mantenimiento(id_mantenimiento) ON DELETE CASCADE ON UPDATE CASCADE;
