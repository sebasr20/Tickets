USE tickets_duoc;

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS estadio;
DROP TABLE IF EXISTS ubicacionEstadio;
DROP TABLE IF EXISTS equipo;
DROP TABLE IF EXISTS estado;
DROP TABLE IF EXISTS evento;
DROP TABLE IF EXISTS ticketCliente;
DROP TABLE IF EXISTS usuario;
SET FOREIGN_KEY_CHECKS=1;

create table categoria (
  idCategoria int not null AUTO_INCREMENT,
  nombreCategoria varchar(45) not null,
  PRIMARY KEY(idCategoria)
);

create table cliente (
  rutCliente varchar(15) not null,
  nombre varchar(45) not null,
  appaterno varchar(45) not null,
  apmaterno varchar(45) not null,
  idCategoria int,
  PRIMARY KEY(rutCliente),
  FOREIGN KEY (idCategoria) REFERENCES Categoria(idCategoria)
);

create table estadio (
  idEstadio int not null AUTO_INCREMENT,
  nombreEstadio varchar(45) not null,
  PRIMARY KEY(idEstadio)
);

create table ubicacionEstadio (
  idUbicacion int not null AUTO_INCREMENT,
  nombreUbicacion varchar(45) not null,
  idEstadio int,
  PRIMARY KEY(idUbicacion),
  FOREIGN KEY (idEstadio) REFERENCES Estadio(idEstadio)
);

create table equipo (
  idEquipo int not null AUTO_INCREMENT,
  nombreEquipo varchar(45) not null,
  PRIMARY KEY(idEquipo)
);

create table Evento (
  idEvento int not null AUTO_INCREMENT,
  equipoLocal varchar(45) not null,
  descripcionEvento varchar(45) not null,
  jornadaEvento int not null,
  fechaEvento date NOT null,
  horaEvento varchar(10) not null,
  estadoEvento bit not null,
  idVisita int,
  PRIMARY KEY(idEvento),
  FOREIGN KEY (idVisita) REFERENCES Equipo(idEquipo)
);

create table ticketCliente (
  idTicket int not null AUTO_INCREMENT,
  precioTicket int not null,
  rutCliente varchar(45),
  fechaCompra TIMESTAMP not null,
  idEstadio int,
  idUbicacion int,
  idEvento int,
  PRIMARY KEY(idTicket),
  FOREIGN KEY (rutCliente) REFERENCES Cliente(rutCliente),
  FOREIGN KEY (idEstadio) REFERENCES Estadio(idEstadio),
  FOREIGN KEY (idUbicacion) REFERENCES ubicacionEstadio(idUbicacion),
  FOREIGN KEY (idEvento) REFERENCES Evento(idEvento)
);

INSERT INTO categoria (nombreCategoria) VALUES('Socio');
INSERT INTO categoria (nombreCategoria) VALUES('Niño');
INSERT INTO categoria (nombreCategoria) VALUES('Normal');


INSERT INTO equipo (nombreEquipo) VALUES('Audax Italiano');
INSERT INTO equipo (nombreEquipo) VALUES('Cobresal');
INSERT INTO equipo (nombreEquipo) VALUES('Curicó Unido');
INSERT INTO equipo (nombreEquipo) VALUES('Deportes Antofagasta');
INSERT INTO equipo (nombreEquipo) VALUES('Deportes La Serena');
INSERT INTO equipo (nombreEquipo) VALUES('Deportes Melipilla');
INSERT INTO equipo (nombreEquipo) VALUES('Everton');
INSERT INTO equipo (nombreEquipo) VALUES('Huachipato');
INSERT INTO equipo (nombreEquipo) VALUES('Ñublense');
INSERT INTO equipo (nombreEquipo) VALUES("O'Higgins");
INSERT INTO equipo (nombreEquipo) VALUES('Palestino');
INSERT INTO equipo (nombreEquipo) VALUES('Santiago Wanderers');
INSERT INTO equipo (nombreEquipo) VALUES('Unión Española');
INSERT INTO equipo (nombreEquipo) VALUES('Unión La Calera');
INSERT INTO equipo (nombreEquipo) VALUES('Universidad Católica');
INSERT INTO equipo (nombreEquipo) VALUES('Universidad de Chile');

INSERT INTO estadio (nombreEstadio) VALUES('Estadio Monumental David Arellano');

INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Rapa Nui', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Oceano', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Cordillera', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Caupolican', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Galvarino', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Lautaro', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Tucapel', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Arica', 1);
INSERT INTO ubicacionestadio (nombreUbicacion, idEstadio) VALUES('Magallanes', 1);