create database DBEspacio;

use DBEspacio;

create table espacios(
	id_espacio int auto_increment,
    tiempoCesion int,
    numeroPlantas int,
    metrosCuadrados int,
    accesibilidad varchar(255),
    direccion varchar(255),
    propietario varchar(255),
    cantidadHabitaciones int,
    tieneComedor boolean,
    danComida boolean,
    tieneInternet boolean,
    primary key(id_espacio)
);

create table habitaciones(
	id_habitacion int auto_increment,
    metrosCuadrados int,
    cantidadCamas int,
    tieneBano boolean,
    plantaBaja boolean,
    id_espacio int,
    primary key (id_habitacion),
    foreign key (id_espacio) references espacios(id_espacio)
);

create table sanitarios(
	dni varchar(255),
    nombre varchar(255),
    apellidos varchar(255),
    edad int,
    titulacion varchar(255),
    dondeTrabaja varchar(255),
    tiempoEstancia int,
    fechaEntrada date,
    fechaSalida date,
    id_espacio int,
    primary key (dni),
    foreign key (id_espacio) references espacios(id_espacio)
);

create table personal(
	dni varchar(255),
    nombre varchar(255),
    apellidos varchar(255),
    edad int,
    funcion varchar(255),
    tiempoEstancia int,
    fechaAlta date,
    fechaBaja date,
    id_espacio int,
    primary key (dni),
    foreign key (id_espacio) references espacios(id_espacio)
);