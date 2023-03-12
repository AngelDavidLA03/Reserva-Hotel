/* 
CREACION DE BASE DE DATOS db_AgenciaInmobiliaria
INTEGRANTES:
- KEVIN ALAN FLORES REYNA - 20660053
- ANGEL DAVID LOPEZ ALVAREZ - 20660062
*/

CREATE DATABASE db_Hotel;

USE db_Hotel;

/* TABLA CLIENTE */
CREATE TABLE Cliente (codClient VARCHAR(10) PRIMARY KEY NOT NULL COMMENT 'Formado por letra inicial de su nombre(s), apellidos y fecha de registro', 
	nomClient VARCHAR(24) NOT NULL, 
	apClient VARCHAR(16) NOT NULL, 
	amClient VARCHAR(16) NOT NULL,
	telfClient VARCHAR(18) NOT NULL, 
	emailClient VARCHAR(128) NOT NULL,
	tipoClient VARCHAR(10) NOT NULL COMMENT 'Solo permitir valores como Habitual y Esporadico',
	curpClient VARCHAR(18) NULL COMMENT 'Solo para clientes mexicanos',
	numPasaporteClient VARCHAR(10) NULL COMMENT 'Solo para clientes extranjeros',
	isPagExternas BOOLEAN NOT NULL COMMENT 'Usar solo cuando la reserva se hizo por paginas de reservacion, 0 = No, 1 = Si') ENGINE=INNODB;
	
/* TABLA DE ESPECIALIZACION HABITUAL */
CREATE TABLE Habitual(codClientH VARCHAR(10) PRIMARY KEY NOT NULL COMMENT 'Formado por letra inicial de su nombre(s), apellidos y fecha de registro',
	descuentoH INT(3) NOT NULL COMMENT 'Porcentaje de descuento (tomar el valor dividido entre 100 para evitar errores)',
	calleH VARCHAR(21) NOT NULL, 
	numExtH INT(3) NOT NULL, 
	colH VARCHAR(15) NOT NULL, 
	cpH INT(5) NOT NULL, 
	ciudadH VARCHAR(15) NOT NULL) ENGINE=INNODB;

/* TABLA DE ESPECIALIZACION ESPORADICO */
CREATE TABLE Esporadico(codClientE VARCHAR(10) PRIMARY KEY NOT NULL COMMENT 'Formado por letra inicial de su nombre(s), apellidos y fecha de registro') ENGINE=INNODB;

/* TABLA DE RELACION CLIENTE - HABITUAL */
CREATE TABLE IsACH (codClient VARCHAR(10) NOT NULL UNIQUE, 
	codClientH VARCHAR(10) NOT NULL UNIQUE) ENGINE=INNODB;

ALTER TABLE IsACH ADD CONSTRAINT FK_codClient_ISACH FOREIGN KEY (codClient) REFERENCES Cliente(codClient) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE IsACH ADD CONSTRAINT FK_codClientH_ISACH FOREIGN KEY (codClientH) REFERENCES Habitual(codClientH) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE RELACION CLIENTE - ESPORADICO */
CREATE TABLE IsACE (codClient VARCHAR(10) NOT NULL UNIQUE, 
	codClientE VARCHAR(10) NOT NULL UNIQUE) ENGINE=INNODB;

ALTER TABLE IsACE ADD CONSTRAINT FK_codClient_ISACE FOREIGN KEY (codClient) REFERENCES Cliente(codClient) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE IsACE ADD CONSTRAINT FK_codClientE_ISACE FOREIGN KEY (codClientE) REFERENCES Esporadico(codClientE) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE PRODUCTO */
CREATE TABLE Producto (codProducto INT(4) PRIMARY KEY NOT NULL,
	nomProduct VARCHAR(32) NOT NULL,
	unidadMedida VARCHAR(4) NOT NULL COMMENT 'Abreviacion de la unidad de medida utilizada en el producto',
	precio DECIMAL(7,2) NOT NULL,
	stock INT(3) NOT NULL,
	cantidadUM INT(4) NOT NULL COMMENT 'Cantidad de la unidad de medida utilizada en el producto') ENGINE=INNODB;
	
/* TABLA DE RELACION PRODUCTO - CLIENTE DE TIPO M -M */
CREATE TABLE Comprar (codProducto INT(4) NOT NULL, 
	codClient VARCHAR(10) NOT NULL) ENGINE=INNODB;

ALTER TABLE Comprar ADD CONSTRAINT FK_codProducto_Comprar FOREIGN KEY (codProducto) REFERENCES Producto(codProducto) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE Comprar ADD CONSTRAINT FK_codClient_Comprar FOREIGN KEY (codClient) REFERENCES Cliente(codClient) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE RECEPCIONISTA */
CREATE TABLE Recepcionista (recID VARCHAR(10) PRIMARY KEY NOT NULL COMMENT 'Formado por letra inicial de su nombre(s), apellidos y fecha de contratacion',
	nomRec VARCHAR(24) NOT NULL, 
	apRec VARCHAR(16) NOT NULL, 
	amRec VARCHAR(16) NOT NULL,
	calleRec VARCHAR(21) NOT NULL, 
	numExtRec INT(3) NOT NULL, 
	colRec VARCHAR(15) NOT NULL, 
	cpRec INT(5) NOT NULL, 
	ciudadRec VARCHAR(15) NOT NULL,
	rolRec VARCHAR(6) NOT NULL COMMENT 'Solo permitir valores como Normal y Admin',
	passRec VARCHAR(16) NOT NULL) ENGINE=INNODB;

/* TABLA DE RELACION RECEPCIONISTA - CLIENTE DE TIPO M - 1 */
CREATE TABLE Atender(recID VARCHAR(10) NOT NULL UNIQUE,
	codClient VARCHAR(10) NOT NULL) ENGINE=INNODB;
	
ALTER TABLE Atender ADD CONSTRAINT FK_recID_Atender FOREIGN KEY (recID) REFERENCES Recepcionista(recID) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE Atender ADD CONSTRAINT FK_codClient_Atender FOREIGN KEY (codClient) REFERENCES Cliente(codClient) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE HOTEL */
CREATE TABLE Hotel(codigoHotel INT(1) PRIMARY KEY NOT NULL,
	telfHotel VARCHAR(18) NOT NULL,
	calleHotel VARCHAR(21) NOT NULL, 
	numExtHotel INT(3) NOT NULL, 
	cpHotel INT(5) NOT NULL, 
	ciudadHotel VARCHAR(15) NOT NULL) ENGINE=INNODB;
	
/* TABLA DE RELACION HOTEL - RECEPCIONISTA DE TIPO M - 1 */
CREATE TABLE Trabajar(codigoHotel INT(1) NOT NULL UNIQUE,
	recID VARCHAR(10) NOT NULL) ENGINE=INNODB;

ALTER TABLE Trabajar ADD CONSTRAINT FK_recID_Trabajar FOREIGN KEY (recID) REFERENCES Recepcionista(recID) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE Trabajar ADD CONSTRAINT FK_codigoHotel_Trabajar FOREIGN KEY (codigoHotel) REFERENCES Hotel(codigoHotel) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE HABITACION */
CREATE TABLE Habitacion(numHab INT(3) PRIMARY KEY NOT NULL COMMENT 'Cada habitacion comenzara con un multiplo de su piso, seguido del numero de habitacion (ejemplo, piso 1, habitacion 1 = 101)',
	tipoHab VARCHAR(11) NOT NULL COMMENT 'Solo permitir valores como Simple, Doble y Matrimonial',
	pisoHab INT(1) NOT NULL,
	costoHab DECIMAL(7,2) NOT NULL,
	caracteristicasHab VARCHAR(64) NOT NULL COMMENT 'Anotaciones sobre las caracteristicas generales de la habitacion') ENGINE=INNODB;
	
/* TABLA DE RELACION HABITACION - CLIENTE DE TIPO M - M*/
CREATE TABLE Reservar(codClient VARCHAR(10) NOT NULL,
	numHab INT(3) NOT NULL,
	fechaReserv DATE NOT NULL,
	horaReserv TIME NOT NULL,
	diasReserv INT(2) NOT NULL) ENGINE=INNODB;
	
ALTER TABLE Reservar ADD CONSTRAINT FK_codClient_Reservar FOREIGN KEY (codClient) REFERENCES Cliente(codClient) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE Reservar ADD CONSTRAINT FK_numHab_Reservar FOREIGN KEY (numHab) REFERENCES Habitacion(numHab) ON DELETE CASCADE ON UPDATE CASCADE;
	
/* TABLA DE ESPECIALIZACION SIMPLE */
CREATE TABLE Simple(numHabS INT(3) PRIMARY KEY NOT NULL) ENGINE = INNODB;

/* TABLA DE ESPECIALIZACION DOBLE */
CREATE TABLE Doble(numHabD INT(3) PRIMARY KEY NOT NULL) ENGINE = INNODB;

/* TABLA DE ESPECIALIZACION MATRIMONIAL */
CREATE TABLE Matrimonial(numHabM INT(3) PRIMARY KEY NOT NULL) ENGINE = INNODB;

/* TABLA DE RELACION HABITACION - SIMPLE */
CREATE TABLE IsAHS (numHab INT(3) NOT NULL UNIQUE,
	numHabS INT(3) NOT NULL UNIQUE) ENGINE=INNODB;

ALTER TABLE IsAHS ADD CONSTRAINT FK_numHab_ISAHS FOREIGN KEY (numHab) REFERENCES Habitacion(numHab) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE IsAHS ADD CONSTRAINT FK_numHabS_ISAHS FOREIGN KEY (numHabS) REFERENCES Simple(numHabS) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE RELACION HABITACION - DOBLE */
CREATE TABLE IsAHD (numHab INT(3) NOT NULL UNIQUE,
	numHabD INT(3) NOT NULL UNIQUE) ENGINE=INNODB;

ALTER TABLE IsAHD ADD CONSTRAINT FK_numHab_ISAHD FOREIGN KEY (numHab) REFERENCES Habitacion(numHab) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE IsAHD ADD CONSTRAINT FK_numHabD_ISAHD FOREIGN KEY (numHabD) REFERENCES Doble(numHabD) ON DELETE CASCADE ON UPDATE CASCADE;

/* TABLA DE RELACION HABITACION - MATRIMONIAL */
CREATE TABLE IsAHM (numHab INT(3) NOT NULL UNIQUE,
	numHabM INT(3) NOT NULL UNIQUE) ENGINE=INNODB;

ALTER TABLE IsAHM ADD CONSTRAINT FK_numHab_ISAHM FOREIGN KEY (numHab) REFERENCES Habitacion(numHab) ON DELETE CASCADE ON UPDATE CASCADE; 
ALTER TABLE IsAHM ADD CONSTRAINT FK_numHabM_ISAHM FOREIGN KEY (numHabM) REFERENCES Matrimonial(numHabM) ON DELETE CASCADE ON UPDATE CASCADE;