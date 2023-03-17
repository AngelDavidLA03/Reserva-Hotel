/* 
CREACION DE PROCEDIMIENTOS db_AgenciaInmobiliaria
INTEGRANTES:
- KEVIN ALAN FLORES REYNA - 20660053
- ANGEL DAVID LOPEZ ALVAREZ - 20660062
*/


/* PROCEDIMIENTO UTILIZADO PARA CONTROLAR EL ACCESO AL PROGRAMA */
CREATE DEFINER=`root`@`localhost` PROCEDURE `LOGINrec`(
	IN `emp` VARCHAR(10),
	IN `pass` VARCHAR(16)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA CONTROLAR EL ACCESO AL PROGRAMA'
SELECT COUNT(recID) AS isExist, rolRec
FROM Recepcionista
WHERE (recID LIKE emp) AND (passRec LIKE pass);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA PRODUCTOS */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDproduct`(
	IN `codProductoP` INT(4),
	IN `nomProductP` VARCHAR(32),
	IN `unidadMedidaP` VARCHAR(4),
	IN `precioP` DECIMAL(7,2),
	IN `stockP` INT(3),
	IN `cantidadUMP` INT(4)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA PRODUCTOS'
INSERT INTO Producto (codProducto, nomProduct, unidadMedida, precio, stock, cantidadUM) 
VALUES (codProductoP,nomProductP,unidadMedidaP,precioP,stockP,cantidadUMP);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS PRODUCTOS */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHproduct`(
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS PRODUCTOS'
SELECT codProducto, nomProduct, precio, stock, unidadMedida, cantidadUM
FROM producto
ORDER BY codProducto ASC;

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR PRODUCTOS DE FORMA AISLADA*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHproductUNIQUE`(
	IN `codProductoP` INT(4)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR LOS PRODUCTOS DE FORMA AISLADA'
SELECT codProducto, nomProduct, precio, stock, unidadMedida, cantidadUM
FROM Producto
WHERE (codProducto = codProductoP);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR PRODUCTOS DE FORMA AISLADA EN LA VENTANA DE LISTAS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHproductUNIQUEinList`(
	IN `ti` VARCHAR(10),
	IN `num` INT(2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR LOS PRODUCTOS DE FORMA AISLADA EN LA VENTANA DE LISTAS'
SELECT codProducto, nomProduct, precio, stock, unidadMedida, cantidadUM
FROM Producto
WHERE  SUBSTRING(producto.codProducto,1,num) = ti;

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA RECEPCIONISTA */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDrecep`(
	IN `recIDR` VARCHAR(10),
	IN `nomRecR` VARCHAR(24),
	IN `apRecR` VARCHAR(16),
	IN `amRecR` VARCHAR(16),
	IN `calleRecR` VARCHAR(21),
	IN `numExtRecR` INT(3),
	IN `colRecR` VARCHAR(15),
	IN `cpRecR` INT(5),
	IN `ciudadRecR` VARCHAR(15),
	IN `rolRecR` VARCHAR(6),
	IN `passRecR` VARCHAR(16)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA RECEPCIONISTA'
INSERT INTO Recepcionista (recID,nomRec,apRec,amRec,calleRec,numExtRec,colRec,cpRec,ciudadRec,rolRec,passRec) 
VALUES (recIDR,nomRecR,apRecR,amRecR,calleRecR,numExtRecR,colRecR,cpRecR,ciudadRecR,rolRecR,passRecR);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS RECEPCIONISTAS */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHrecep`(
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS RECEPCIONISTAS'
SELECT recID, rolRec, nomRec, apRec, amRec, CONCAT(calleRec," #",numExtRec," col. ",colRec,"CP. ",cpRec,", ", ciudadRec) AS dirRec
FROM Recepcionista
ORDER BY recID ASC;

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR RECEPCIONISTAS DE FORMA AISLADA*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHrecepUNIQUE`(
	IN `id` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS RECEPCIONISTAS SEGUN SU ID'
SELECT recID, rolRec, nomRec, apRec, amRec, passRec, calleRec, numExtRec, colRec, cpRec, ciudadRec
FROM Recepcionista
WHERE (recID LIKE id);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR RECEPCIONISTAS DE FORMA AISLADA EN LA VENTANA DE LISTAS */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHrecepUNIQUEinList`(
	IN `ti` VARCHAR(10),
	IN `num` INT(2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS RECEPCIONISTAS SEGUN SU ID'
SELECT recID, rolRec, nomRec, apRec, amRec, CONCAT(calleRec," #",numExtRec," col. ",colRec,"CP. ",cpRec,", ", ciudadRec) AS dirRec
FROM Recepcionista
WHERE  SUBSTRING(recepcionista.recID,1,num)=ti;

/* PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA RECEPCIONISTA */
CREATE DEFINER=`root`@`localhost` PROCEDURE `DELETErecep`(
	IN `recIDR` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA RECEPCIONISTA'
DELETE
FROM Recepcionista
WHERE (recID LIKE recIDR);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA CLIENTES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDclient`(
	IN `codClientC` VARCHAR(10), 
	IN `nomClientC` VARCHAR(24), 
	IN `apClientC` VARCHAR(16), 
	IN `amClientC` VARCHAR(16), 
	IN `telfClientC` VARCHAR(15), 
	IN `emailClientC` VARCHAR(128), 
	IN `tipoClientC` VARCHAR(10), 
	IN `curpClientC` VARCHAR(18), 
	IN `numPasaporteClientC` VARCHAR(10), 
	IN `isPagExternasC`BOOLEAN
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA CLIENTES'
INSERT INTO Cliente (codClient, nomClient, apClient, amClient, telfClient, emailClient, tipoClient, curpClient, numPasaporteClient, isPagExternas) 
VALUES (codClientC, nomClientC, apClientC, amClientC, telfClientC, emailClientC, tipoClientC, curpClientC, numPasaporteClientC, isPagExternasC);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA HABITUAL */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDhabitual`(
	IN `codClientN` VARCHAR(10),
	IN `descuentoN` INT(3)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA HABITUAL'
INSERT INTO Habitual (codClientH, descuentoH)
VALUES (codClientN, descuentoN);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA ESPORADICO */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDesporadic`(
	IN `codClientN` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA ESPORADICO'
INSERT INTO Esporadico (codClientE)
VALUES (codClientN);

/* PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA HABITUAL */
CREATE DEFINER=`root`@`localhost` PROCEDURE `DELETEhabitual`(
	IN `codClientN` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA HABITUAL'
DELETE
FROM habitual
WHERE (codClientH LIKE codClientN);

/* PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA ESPORADICO */
CREATE DEFINER=`root`@`localhost` PROCEDURE `DELETEesporadic`(
	IN `codClientN` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA ELIMINAR VALORES EN LA TABLA ESPORADICO'
DELETE
FROM esporadico
WHERE (codClientE LIKE codClientN);


/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHclient`(
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES'
SELECT codClient, curpClient, nomClient, apClient, amClient, numPasaporteClient, telfClient, emailClient, tipoClient, isPagExternas 
FROM Cliente
ORDER BY codClient ASC;

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHclientUNIQUE`(
	IN `codClientC` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES'
SELECT codClient,curpClient, nomClient, apClient, amClient, numPasaporteClient, telfClient, emailClient, tipoClient, isPagExternas
FROM Cliente
WHERE (codClient LIKE codClientC);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES EN LA VENTANA DE LISTAS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHclientUNIQUEinList`(
	IN `ti` VARCHAR(10),
	IN `num` INT(2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODOS LOS CLIENTES EN LA VENTANA DE LISTAS'
SELECT codClient,curpClient, nomClient, apClient, amClient, numPasaporteClient, telfClient, emailClient, tipoClient, isPagExternas
FROM Cliente
WHERE  SUBSTRING(cliente.codClient,1,num)=ti;

/* PROCEDIMIENTO UTILIZADO PARA MODIFICAR VALORES EN LA TABLA CLIENTES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `CHANGEclient`(
	IN `codClientC` VARCHAR(10), 
	IN `tipoClientC` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA MODIFICAR VALORES EN LA TABLA CLIENTES'
UPDATE cliente 
SET tipoClient = tipoClientC
WHERE codClient LIKE codClientC;

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA HABITACIONES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDhabitacion`(
	IN `codHabH` INT (3),
	IN `numHabH` INT(2),
	IN `tipoHabH` VARCHAR(11),
	IN `pisoHabH` INT(1),
	IN `costoHabH` DECIMAL(7,2),
	IN `caracteristicasHabH` VARCHAR(64),
	IN `isReservH` BOOLEAN
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA HABITACION'
INSERT INTO habitacion (codHab,numHab, tipoHab, pisoHab, costoHab, caracteristicasHab,isReserv) 
VALUES (codHabH,numHabH, tipoHabH, pisoHabH, costoHabH, caracteristicasHabH,isReservH);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR TODAS LAS HABITACIONES */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHhabitacion`(
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR TODAS LAS HABITACIONES'
SELECT codHab,numHab, tipoHab, pisoHab, costoHab, caracteristicasHab, isReserv
FROM Habitacion
ORDER BY codHab ASC;

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR LAS HABITACIONES DE FORMA AISLADA*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHhabitacionUNIQUE`(
	IN `codHabH` INT(3)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR LAS HABITACIONES DE FORMA AISLADA'
SELECT codHab, numHab, tipoHab, pisoHab, costoHab, caracteristicasHab
FROM Habitacion
WHERE (codHab = codHabH);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR LAS HABITACIONES DE FORMA AISLADA EN LA VENTANA DE LISTAS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHhabitacionUNIQUEinList`(
	IN `ti` VARCHAR(10),
	IN `num` INT(2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR LAS HABITACIONES DE FORMA AISLADA EN LA VENTANA DE LISTAS'
SELECT codHab, numHab, tipoHab, pisoHab, costoHab, caracteristicasHab, isReserv
FROM Habitacion
WHERE  SUBSTRING(habitacion.codHab,1,num) = ti;

/* PROCEDIMIENTO UTILIZADO PARA ACTUALIZAR EL ESTADO DE RESERVA DE LA HABITACION */
CREATE DEFINER=`root`@`localhost` PROCEDURE `UPDATEhabitacionReserv`(
	IN `codHabH` INT (3),
	IN `isReservH` BOOLEAN
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA ACTUALIZAR EL ESTADO DE RESERVA DE LA HABITACION'
UPDATE habitacion 
SET isReserv = isReservH
WHERE codHab LIKE codHabH;

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA SIMPLE */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDsimple`(
	IN `codHabSN` INT(3)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA SIMPLE'
INSERT INTO Simple (codHabS)
VALUES (codHabSN);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA DOBLE */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDdoble`(
	IN `codHabDN` INT(3)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA DOBLE'
INSERT INTO Doble (codHabD)
VALUES (codHabDN);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA MATRIMONIAL */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDmatrimonial`(
	IN `codHabMN` INT(3)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA MATRIMONIAL'
INSERT INTO Matrimonial (codHabM)
VALUES (codHabMN);

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA  COMPRAS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDcompra`(
	IN prod INT(4),
	IN clien VARCHAR(10),
	IN cant INT(2),
	IN fecha DATE,
	IN tiempo TIME,
	IN prec DECIMAL (8,2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA COMPRAR'
INSERT INTO comprar (codProducto, codClient, cantidad, fechaCompra, horaCompra, precioTotalC) 
VALUES (prod, clien, cant, fecha, tiempo, prec);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR VALORES A LA TABLA  COMPRAS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SERCHcompra`(
IN clien VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA COMPRAR'
SELECT codClient, codProducto, cantidad, precioTotalC
FROM comprar
WHERE codClient = clien;

/* PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA RESERVAR */
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDreserv`(
	IN clien VARCHAR(10),
	IN habit INT(3),
	IN fecha DATE,
	IN hora TIME,
	IN dias INT(2),
	IN precio DECIMAL(8,2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA RESERVAR'
INSERT INTO reservar (codClient, codHab, fechaReserv, horaReserv, diasReserv, precioTotalR) 
VALUES (clien, habit, fecha, hora, dias, precio)


/* PROCEDIMIENTO UTILIZADO PARA BUSCAR VALORES A LA TABLA RESERVAR AISLADAMENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SERCHreservUNIQUE`(
IN `ti` VARCHAR(10),
	IN `num` INT(2)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR VALORES A LA TABLA RESERVAR AISLADAMENTE'
SELECT codClient, codHab, fechaReserv, horaReserv, diasReserv, precioTotalR
FROM reservar
WHERE  SUBSTRING(reservar.codClient,1,num) = ti;

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR VALORES A LA TABLA  RESERVAR */
CREATE DEFINER=`root`@`localhost` PROCEDURE `SERCHreserv`()
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR VALORES A LA TABLA  RESERVAR'
SELECT codClient, codHab, fechaReserv, horaReserv, diasReserv, precioTotalR
FROM reservar;

/* PROCEDIMIENTO UTILIZADO PARA AÑADIR DATOS A LA TABLA GASTOS*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDgasto`(
	IN ref VARCHAR(10),
	IN isdesc INT(1),
	IN descu INT(3),
	IN gasto DECIMAL(8,2) 
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA GASTS'
INSERT INTO gastos (refGastos, isDiscount, discount, total)
VALUES (ref, isdesc, descu, gasto);

/* PROCEDIMIENTO UTILIZADO PARA AÑADIR DATOS A LA TABLA PAGAR*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `ADDpago`(
	IN ref VARCHAR(10),
	IN clie VARCHAR(10),
	IN fech DATE,
	IN hora TIME,
	IN banco VARCHAR(20) 
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA AGREGAR VALORES A LA TABLA GASTS'
INSERT INTO pagar (refGastos, codClient, fechaPago, horaPago, bancoClient)
VALUES (ref, clie, fech, hora, banco);

/* PROCEDIMIENTO UTILIZADO PARA BUSCAR LOS PAGOS QUE A REALIZADO EL CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SEARCHpagototal`(
	IN `cod` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA BUSCAR LOS PAGOS DE UNA PERSONA'
SELECT pagar.codClient, gastos.discount, gastos.total
FROM gastos INNER JOIN pagar
WHERE  (gastos.refGastos = pagar.refGastos) AND pagar.codClient = cod

/* PROCEDIMIENTO UTILIZADO PARA SUMAR GASTOS EN PRODUCTOS POR PARTE DEL CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SUMconsumos`(
	IN `cod` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA SUMAR GASTOS EN PRODUCTOS POR PARTE DEL CLIENTE'
SELECT SUM(precioTotalC ) AS Total
FROM comprar
WHERE codClient = cod;

/* PROCEDIMIENTO UTILIZADO PARA OPTENER COSTO DE HABITACION*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `costhabit`(
	IN `cod` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA OPTENER COSTO DE HABITACION'
SELECT habitacion.costoHab
FROM habitacion
WHERE  habitacion.codHab = cod;

/* PROCEDIMIENTO UTILIZADO PARA SUMAR GASTOS EN HABITACION POR PARTE DEL CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `SUMhabit`(
	IN `cod` VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA SUMAR GASTOS EN HABITACIONES POR PARTE DEL CLIENTE'
SELECT SUM(reservar.precioTotalR ) AS Total
FROM reservar
WHERE reservar.codClient = cod;

/* PROCEDIMIENTO UTILIZADO PARA SUMAR LOS INGRESOS TOTALES DEL HOTEL*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `Ingresostot`(
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA SUMAR LOS INGRESOS TOTALES DEL HOTEL'
SELECT SUM(gastos.total ) AS Total
FROM gastos

/* PROCEDIMIENTO UTILIZADO PARA OPTENER EL DESCUENTO DEL CLIENTE*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `Descuento`(
 IN cod VARCHAR(10)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA OPTENER EL DESCUENTO DEL CLIENTE'
SELECT  habitual.descuentoH
FROM habitual
WHERE  habitual.codClientH = cod;

/* PROCEDIMIENTO UTILIZADO PARA OBTENER COSTO DE PRODUCTO*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `costprod`(
	IN `cod` INT(4)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA OBTENER COSTO DE PRODUCTO'
SELECT producto.precio
FROM producto
WHERE  producto.codProducto = cod;

/* PROCEDIMIENTO UTILIZADO PARA SUMAR LOS INGRESOS TOTALES POR MES DEL HOTEL*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `Ingresostotpormes`(
 IN mes INT(2),
 IN an  INT(4) 
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA SUMAR LOS INGRESOS TOTALES POR MES DEL HOTEL'
SELECT SUM(gastos.gastoTotal ) AS Total
FROM gastos INNER JOIN pagar
WHERE MONTH(pagar.fechaPago)= mes AND YEAR(pagar.fechaPago)= an AND (gastos.refGastos=pagar.refGastos); 

/* PROCEDIMIENTO UTILIZADO PARA MOSTRAR LOS INGRESOS TOTALES POR MES DEL HOTEL*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `Ingresostotpormesmost`(
IN mes INT(2),
 IN an  INT(4)
)
LANGUAGE SQL
NOT DETERMINISTIC
CONTAINS SQL
SQL SECURITY DEFINER
COMMENT 'PROCEDIMIENTO UTILIZADO PARA MOSTRAR LOS INGRESOS TOTALES POR MES DEL HOTEL'
SELECT pagar.codClient, pagar.fechaPago, gastos.gastoTotal
FROM gastos INNER JOIN pagar
WHERE MONTH(pagar.fechaPago)= mes AND YEAR(pagar.fechaPago)= an AND (gastos.refGastos=pagar.refGastos); 