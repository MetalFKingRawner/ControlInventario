-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: inventarios
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_producto` int DEFAULT NULL,
  `unidad_de_medida` varchar(20) DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto` (`id_producto`),
  CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES (1,5,'oz',5,'2023-11-28'),(2,5,'oz',5,'2023-11-28');
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_inventario`
--

DROP TABLE IF EXISTS `log_inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log_inventario` (
  `id_inventario` varchar(5) DEFAULT NULL,
  `id_producto` varchar(4) DEFAULT NULL,
  `cantidad_anterior` decimal(10,2) DEFAULT NULL,
  `nueva_cantidad` decimal(10,2) DEFAULT NULL,
  `evento` char(10) DEFAULT NULL,
  `momento` char(10) DEFAULT NULL,
  `usuario` char(50) DEFAULT NULL,
  `registro` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_inventario`
--

LOCK TABLES `log_inventario` WRITE;
/*!40000 ALTER TABLE `log_inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `log_inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_productos`
--

DROP TABLE IF EXISTS `log_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log_productos` (
  `anterior_nombre` varchar(50) DEFAULT NULL,
  `nuevo_nombre` varchar(50) DEFAULT NULL,
  `costo_anterior` double DEFAULT NULL,
  `costo_nuevo` double DEFAULT NULL,
  `evento` char(10) DEFAULT NULL,
  `momento` char(10) DEFAULT NULL,
  `usuario` char(50) DEFAULT NULL,
  `registro` datetime DEFAULT NULL,
  `id_producto` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_productos`
--

LOCK TABLES `log_productos` WRITE;
/*!40000 ALTER TABLE `log_productos` DISABLE KEYS */;
INSERT INTO `log_productos` VALUES (NULL,'Tortillas',NULL,14,'INSERTAR','ANTES','root@localhost','2023-01-01 01:42:34',NULL),(NULL,'Tortillas',NULL,14,'INSERTAR','DESPUES','root@localhost','2023-01-01 01:42:34',NULL);
/*!40000 ALTER TABLE `log_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `unidad_de_medida` varchar(20) NOT NULL,
  `costo` double DEFAULT NULL,
  `tipo_de_insumo` varchar(50) DEFAULT NULL,
  `fecha_de_registro` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=246 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (4,'Catsup','Lt',101,'Alimento','2008-05-23'),(5,'Mostaza','Gr',0,'Alimento','2008-05-23'),(6,'Salsa morita','Lt',40,'Alimento','2008-05-23'),(7,'Salsa macha','Lt',142,'Alimento','2008-05-23'),(8,'Servilletas','Pz',30,'Limpieza/Higiene','2008-05-23'),(9,'Palillos','Pz',19,'Limpieza/Higiene','2008-05-23'),(10,'Miel natural','Lt',100,'Alimento','2008-05-23'),(11,'Sal','Gr',12,'Condimento/Especia','2008-05-23'),(12,'Azucar mascabada','Kg',32,'Condimento/Especia','2008-05-23'),(13,'Splenda','Pz',0.6,'Condimento/Especia','2008-05-23'),(14,'Salsa inglesa','Lt',106,'Condimento/Especia','2008-05-23'),(15,'Salsa magui','Lt',39.5,'Condimento/Especia','2008-05-23'),(16,'Salsa tabasco','Ml',54,'Condimento/Especia','2008-05-23'),(17,'Salsa valentina','Lt',38,'Condimento/Especia','2008-05-23'),(24,'Jabon de trastes','Lt',15,'Limpieza/Higiene','2008-05-23'),(25,'Cloro','Lt',8,'Limpieza/Higiene','2008-05-23'),(26,'Pinol','Lt',19.25,'Limpieza/Higiene','2008-05-23'),(27,'Guantes','Pz',16,'Limpieza/Higiene','2008-05-23'),(28,'Fibra de metal','Pz',15,'Limpieza/Higiene','2008-05-23'),(29,'Fibra verde','Pz',18.5,'Limpieza/Higiene','2008-05-23'),(30,'Ajax','Pz',30,'Limpieza/Higiene','2008-05-23'),(31,'Papel de bano','Pkg',48,'Limpieza/Higiene','2008-05-23'),(32,'Sanitas','Pkg',28.5,'Limpieza/Higiene','2008-05-23'),(33,'Jabon de manos','Pz',20,'Limpieza/Higiene','2008-05-23'),(34,'Pastillas para banos','Pz',16,'Limpieza/Higiene','2008-05-23'),(35,'Bolsas de basura','Pkg',120,'Limpieza/Higiene','2008-05-23'),(36,'Rollos de impresora','Pkg',399,'Otro','2008-05-23'),(37,'Mezcal','Lt',120,'Licor','2008-05-23'),(38,'Concentrado de tamarindo','Lt',86,'Bebida','2008-05-23'),(39,'Concentrado de horchata','Lt',86,'Bebida','2008-05-23'),(40,'Capsulas para crema batida','Pz',21,'Otro','2008-05-23'),(41,'Agua mineral grande','Lt',23.1025,'Bebida','2008-05-23'),(42,'Cafe','Kg',210,'Alimento','2008-05-23'),(43,'Agua mineral vidrio','Pz',10.6666,'Bebida','2008-05-23'),(44,'Vasos para llevar','Pkg',170,'Envase/Empaque','2008-05-23'),(45,'Tapas de vasos para llevar','Pkg',0,'Envase/Empaque','2008-05-23'),(46,'Azucar','Kg',26.827,'Condimento/Especia','2008-05-23'),(47,'Jarabe natural','Lt',19,'Bebida','2008-05-23'),(49,'Irish cream','Lt',260,'Bebida','2008-05-23'),(50,'Jarabe de avellana','Lt',260,'Bebida','2008-05-23'),(51,'Jarabe de kiwi','Lt',260,'Bebida','2008-05-23'),(52,'Jarabe chai','Lt',260,'Bebida','2008-05-23'),(53,'Jarabe de rosas','Lt',260,'Bebida','2008-05-23'),(54,'Jarabe de vainilla','Lt',260,'Bebida','2008-05-23'),(55,'Menta','Rmo',10,'Condimento/Especia','2008-05-23'),(56,'Hierba buena','Rmo',10,'Condimento/Especia','2008-05-23'),(57,'Poleo','Gr',10,'Condimento/Especia','2008-05-23'),(58,'Manzanilla','Rmo',10,'Condimento/Especia','2008-05-23'),(59,'Jarabe de chocolate','Pz',45.02,'Bebida','2008-05-23'),(60,'Jarabe de fresa','Pz',46.14,'Bebida','2008-05-23'),(61,'Jarabe de vainilla','Pz',36.98,'Bebida','2008-05-23'),(62,'Miguelito','Gr',160,'Condimento/Especia','2008-05-23'),(65,'Sal de gusano','Gr',25,'Condimento/Especia','2008-05-23'),(66,'Canela','Kg',240,'Condimento/Especia','2008-05-23'),(68,'Cacahuates','Pz',55,'Alimento','2008-05-23'),(69,'Chocolate','Kg',100,'Bebida','2008-05-23'),(70,'Chocopunch','Kg',170,'Bebida','2008-05-23'),(71,'Matcha','Kg',569,'Bebida','2008-05-23'),(72,'Taro','Kg',410,'Bebida','2008-05-23'),(74,'Miel maple','Lt',106,'Condimento/Especia','2008-05-23'),(75,'Chamoy','Lt',28,'Bebida','2008-05-23'),(79,'Leche deslactosada','Lt',28.5,'Lacteo','2008-05-23'),(80,'Leche de soya','Lt',30,'Lacteo','2008-05-23'),(81,'Leche de almendras','Lt',30,'Lacteo','2008-05-23'),(82,'Coca cola','Pz',11.6666,'Bebida','2008-05-23'),(83,'Coca cola light','Pz',16.5416,'Bebida','2008-05-23'),(84,'Sprite','Pz',14.1666,'Bebida','2008-05-23'),(85,'Manzanita','Pz',14.1666,'Bebida','2008-05-23'),(86,'Crema para batir','Lt',75.24,'Lacteo','2008-05-23'),(87,'Lechera','Pz',17.5,'Lacteo','2008-05-23'),(88,'Carnation','Pz',23.75,'Lacteo','2008-05-23'),(89,'Jugo de limon','Lt',50,'Bebida','2008-05-23'),(90,'Jugo de naranja','Lt',31.68,'Bebida','2008-05-23'),(91,'Limon','Kg',20,'Condimento/Especia','2008-05-23'),(92,'Naranja','Kg',18,'Condimento/Especia','2008-05-23'),(93,'Concentrado de jamaica','Lt',11.6666,'Bebida','2008-05-23'),(94,'Concentrado de maracuya','Lt',32.22,'Bebida','2008-05-23'),(95,'Concentrado de mango','Lt',8.091,'Bebida','2008-05-23'),(96,'Concentrado de guanabana','Lt',36.22,'Bebida','2008-05-23'),(97,'Manzana','Kg',25,'Alimento','2008-05-23'),(98,'Fresa','Kg',85,'Alimento','2008-05-23'),(99,'Yogurt griego','Kg',65,'Lacteo','2008-05-23'),(100,'Jugo de fresa','Lt',20,'Bebida','2008-05-23'),(101,'Jugo de mango','Lt',37,'Bebida','2008-05-23'),(102,'Jugo de pina','Lt',37,'Bebida','2008-05-23'),(103,'Papaya','Kg',18,'Alimento','2008-05-23'),(108,'Tepache','Pz',0,'Licor','2008-05-23'),(109,'Hielo','Pz',26,'Bebida','2008-05-23'),(110,'Helado de chocolate','Kg',89.86,'Lacteo','2008-05-23'),(111,'Helado de cookies','Kg',89.86,'Lacteo','2008-05-23'),(112,'Helado de vainilla','Kg',89.86,'Lacteo','2008-05-23'),(113,'Pepino','Kg',22,'Alimento','2008-05-23'),(114,'Espinaca','Rollo',5,'Condimento/Especia','2008-05-23'),(115,'Apio','Pz',18,'Condimento/Especia','2008-05-23'),(116,'Bolsa de jugo verde','Pz',0,'Bebida','2008-05-23'),(117,'Pina','Kg',55,'Alimento','2008-05-23'),(118,'Nopal','Kg',45,'Alimento','2008-05-23'),(119,'Albahaca','Gr',10,'Condimento/Especia','2008-05-23'),(120,'Bolsa de cafe molido','Pz',140,'Otro','2008-05-23'),(121,'Refresco artesanal','Pz',0,'Bebida','2008-05-23'),(122,'Bolsas para pan','Pkg',43,'Envase/Empaque','2008-05-23'),(123,'Garrafon de agua','Lt',25,'Otro','2008-05-23'),(124,'Huevo','Pz',3,'Alimento','2008-05-23'),(125,'Aderezo de miel','Lt',73,'Condimento/Especia','2008-05-23'),(126,'Maseca','Kg',27,'Panaderia','2008-05-23'),(127,'Aceite','Lt',222,'Cocina','2008-05-23'),(128,'Granola','Gr',86,'Cocina','2008-05-23'),(129,'Harina de hot cakes','Kg',28.16,'Cocina','2008-05-23'),(130,'Nutella','Kg',115,'Cocina','2008-05-23'),(131,'Leche entera','Lt',18.88,'Lacteo','2008-05-23'),(132,'Azucar glass','Kg',27,'Panaderia','2008-05-23'),(133,'Vainilla','Ml',60,'Cocina','2008-05-23'),(137,'Pimienta','Kg',138,'Condimento/Especia','2008-05-23'),(138,'Mayonesa','Kg',70,'Condimento/Especia','2008-05-23'),(139,'Salsa BBQ','Ml',227,'Condimento/Especia','2008-05-23'),(140,'Aderezo ranch','Ml',76,'Condimento/Especia','2008-05-23'),(141,'Vinagre blanco','Ml',38,'Condimento/Especia','2008-05-23'),(143,'Aceitunas','Gr',60,'Condimento/Especia','2008-05-23'),(144,'Salsa diabla','Ml',221,'Condimento/Especia','2008-05-23'),(145,'Chiles en vinagre','Kg',106,'Condimento/Especia','2008-05-23'),(147,'Tortillinas','Pz',33,'Alimento','2008-05-23'),(148,'Media crema','Lt',17.5,'Lacteo','2008-05-23'),(149,'Knor suiza','Pz',101,'Condimento/Especia','2008-05-23'),(150,'Burreras','Pz',33,'Alimento','2008-05-23'),(151,'Servitoallas','Pz',29,'Limpieza/Higiene','2008-05-23'),(152,'Plastico film','Pz',130,'Otro','2008-05-23'),(153,'Papel aluminio','Pz',50,'Otro','2008-05-23'),(155,'Tomate','Kg',15,'Alimento','2008-05-23'),(156,'Cebolla blanca','Kg',30,'Alimento','2008-05-23'),(157,'Lechuga','Pz',20,'Alimento','2008-05-23'),(158,'Zanahoria','Kg',12,'Alimento','2008-05-23'),(159,'Aguacate','Kg',80,'Alimento','2008-05-23'),(160,'Brocoli','Pz',15,'Alimento','2008-05-23'),(161,'Tomate verde','Kg',18.5,'Alimento','2008-05-23'),(162,'Cebolla morada','Kg',42.9,'Alimento','2008-05-23'),(163,'Cilantro','Rollo',10,'Alimento','2008-05-23'),(164,'Perejil','Rollo',10,'Alimento','2008-05-23'),(165,'Platano chiapas','Kg',17,'Alimento','2008-05-23'),(166,'Platano macho','Kg',15,'Alimento','2008-05-23'),(167,'Hoja santa','Rollo',10,'Condimento/Especia','2008-05-23'),(168,'Hoja de aguacate','Bolsa',12,'Condimento/Especia','2008-05-23'),(169,'Epazote','Rollo',10,'Condimento/Especia','2008-05-23'),(170,'Oregano','Kg',138,'Condimento/Especia','2008-05-23'),(171,'Papa','Kg',15,'Alimento','2008-05-23'),(172,'Chile de arbol','Kg',140,'Condimento/Especia','2008-05-23'),(174,'Ajo','Kg',140,'Alimento','2008-05-23'),(175,'Melon','Pz',17,'Alimento','2008-05-23'),(176,'SandÃ­a','Kg',10,'Alimento','2008-05-23'),(177,'Uvas','Gr',35,'Alimento','2008-05-23'),(178,'Arandano','Kg',270,'Alimento','2008-05-23'),(179,'Pimiento','Kg',89,'Alimento','2008-05-23'),(180,'Calabacitas','Kg',19,'Alimento','2008-05-23'),(181,'Chile huajillo','Kg',125,'Alimento','2008-05-23'),(182,'Chile morita','Kg',180,'Alimento','2008-05-23'),(183,'Chile serrano','Kg',30,'Condimento/Especia','2008-05-23'),(186,'Romero','Gr',0,'Condimento/Especia','2008-05-23'),(187,'Chicharron','Kg',140,'Alimento','2008-05-23'),(188,'Chorizo','Kg',105,'Alimento','2008-05-23'),(189,'Tasajo','Kg',190,'Alimento','2008-05-23'),(190,'Costilla','Kg',135,'Alimento','2008-05-23'),(191,'Cecina enchilada','Kg',130,'Alimento','2008-05-23'),(194,'Molida de pollo','Kg',110,'Alimento','2008-05-23'),(195,'Pechuga de pollo','Kg',110,'Alimento','2008-05-23'),(196,'Milanesa de pollo','Kg',110,'Alimento','2008-05-23'),(198,'Asiento','Kg',115,'Alimento','2008-05-23'),(199,'Jamon','Kg',104.56,'Alimento','2008-05-23'),(200,'Salchicha','Kg',20,'Alimento','2008-05-23'),(201,'Tocino','Kg',200,'Alimento','2008-05-23'),(202,'Queso fresco','Kg',85,'Lacteo','2008-05-23'),(203,'Quesillo','Kg',130,'Lacteo','2008-05-23'),(204,'Queso goudha','Kg',178,'Lacteo','2008-05-23'),(205,'Queso goudha rebanado','Pz',164.96,'Lacteo','2008-05-23'),(206,'Queso azul','Kg',65,'Lacteo','2008-05-23'),(207,'Queso de cabra','Kg',115,'Lacteo','2008-05-23'),(208,'Queso amarillo','Kg',55,'Lacteo','2008-05-23'),(209,'Queso philadelphia','Kg',35,'Lacteo','2008-05-23'),(210,'Mantequilla','Kg',200,'Lacteo','2008-05-23'),(211,'Crema','Lt',100,'Lacteo','2008-05-23'),(212,'Yogurt natural','Lt',38,'Lacteo','2008-05-23'),(215,'Domos chicos','Pz',170,'Envase/Empaque','2008-05-23'),(216,'Domos grandes','Pz',170,'Envase/Empaque','2008-05-23'),(217,'Bolsas para porcionar','Rollo',50,'Envase/Empaque','2008-05-23'),(218,'Masa de memelas','Kg',20,'Panaderia','2008-05-23'),(220,'Pan de ciabatta','Pz',29.045,'Panaderia','2008-05-23'),(221,'Pan de caja','Pz',19.16,'Panaderia','2008-05-23'),(223,'Pan amarillo','Pz',0,'Panaderia','2008-05-23'),(224,'Concha','Pz',0,'Panaderia','2008-05-23'),(225,'Rol de canela','Pz',0,'Panaderia','2008-05-23'),(226,'Orejita','Pz',0,'Panaderia','2008-05-23'),(229,'Nuez','Gr',0,'Condimento/Especia','2008-05-23'),(230,'Chapulin','Gr',500,'Condimento/Especia','2008-05-23'),(231,'Mole','Kg',55,'Condimento/Especia','2008-05-23'),(233,'Clayudas','Pz',0,'Alimento','2008-05-23'),(235,'Polvo para hornear','Gr',0,'Condimento/Especia','2011-08-23'),(236,'Frijol molido','Kg',55,'Alimento','2011-08-23'),(237,'Frijol','Kg',46.8,'Alimento','2011-08-23'),(238,'Tresinol','Lt',0,'Alimento','2011-08-23'),(239,'Salsa roja','Kg',30,'Alimento','2011-08-23'),(240,'Salsa de huajillo','Kg',0,'Alimento','2011-08-23'),(241,'Salsa verde','Kg',0,'Alimento','2011-08-23'),(242,'Tortilla','Kg',25,'Alimento','2028-08-23'),(245,'Pasta mole','Kg',100,'Condimento/Especia','2028-08-23');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id_proveedor` varchar(2) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `numero_contacto` bigint DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receta`
--

DROP TABLE IF EXISTS `receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receta` (
  `id_receta` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `porciones` double NOT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_receta`)
) ENGINE=InnoDB AUTO_INCREMENT=221 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receta`
--

LOCK TABLES `receta` WRITE;
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
INSERT INTO `receta` VALUES (1,'Agua de limÃ³n',2.6025,38),(2,'Agua de horchata',5.7366,38),(3,'Agua de naranja',2.4357,38),(4,'Agua de tamarindo',5.0866,38),(5,'Agua de mango',1.0405,38),(6,'Agua de maracuyÃ¡',2.4676,38),(7,'Limonada',8.0682,38),(8,'Limonada de rosas',15.1955,40),(9,'Limonada de vainilla',15.1955,40),(10,'Naranjada',7.9014,38),(11,'Jarra de agua limÃ³n',6.5062,95),(12,'Jarra de agua naranja',6.3701,95),(13,'Jarra de agua horchata',17.2097,95),(14,'Jarra de agua guanabana',13.521,95),(15,'Jarra de agua tamarindo',15.2599,95),(16,'Jarra de agua mango',5.2023,95),(17,'Jarra de agua maracuyÃ¡',12.3381,95),(18,'Jarra de naranjada',29.4726,95),(19,'Jarra de limonada',29.6087,95),(20,'Jarra de limonada de rosas',47.4267,95),(21,'Jarra de limonada de vainilla',47.4267,95),(22,'FrappÃ© taro',24.3195,45),(23,'FrappÃ© matcha',31.4745,45),(24,'FrappÃ© guamango',7.6759,45),(25,'FrappÃ© horchata',11.6208,45),(26,'FrappÃ© yogurt griego',14.9844,45),(27,'FrappÃ© tamarindo',7.63,45),(28,'FrappÃ© limÃ³n',4.0811,45),(29,'Frapuccino',11.8233,45),(30,'FrappÃ© moka',236.9233,45),(31,'CafÃ© americano',4.83,38),(32,'Latte',8.535,40),(33,'Latte de vainilla',16.2241,45),(34,'Latte de avellana',16.2241,45),(35,'Capuccino chico',9.39,45),(36,'Capuccino grande',12.24,50),(37,'Base de suero',72.1453,20),(45,'Mezcal espadÃ­n',10.9165,65),(46,'Mezcalina de tamarindo',14.7276,60),(47,'Mezcalina de maracuyÃ¡',12.9857,65),(48,'Mezcalina de fresa',15.3544,65),(49,'Mezcalina de fresa con tamarindo',19.6764,68),(50,'Mezcalina de pepino con albahaca',11.7461,60),(51,'Mezcalina de jamaica',9.9465,65),(52,'Carajo oaxaqueÃ±o',16.3489,65),(53,'Mojito de mezcal',9.5363,60),(54,'Mojito tradicional',1.4787,60),(55,'Moctel tropical',2.9687,45),(56,'Moctel cÃ­trico',16.088,45),(57,'Moctel fresca pasiÃ³n',7.7092,45),(58,'Cafe refill',4.83,25),(59,'Latte de soya',3.9,45),(60,'Latte de soya con vainilla',16.4191,50),(61,'Latte de soya con avellana',16.4191,50),(62,'Malteada de chocolate',11,50),(63,'Malteada de cookies and cream',11,50),(64,'Malteada de fresa',11,50),(65,'Malteada de vainilla',11,50),(66,'Jugo de naranja',11,40),(67,'Jugo de naranja grande',11,80),(68,'Jugo verde',11,40),(69,'Jugo de naranja con fresa chico',11,45),(70,'Jugo de naranja con fresa grande',11,75),(71,'Jugo de naranja con papaya chico',11,45),(72,'Jugo de naranja con papaya grande',11,75),(73,'Jugo de naranja con zanahoria chico',11,45),(74,'Jugo de naranja con zanahoria grande',11,75),(75,'TÃ© de manzanilla',11,25),(76,'TÃ© de poleo',11,25),(77,'TÃ© de menta',11,25),(78,'TÃ© de hierbabuena',11,25),(79,'Taro caliente',18454702.5,45),(80,'Matcha caliente',25609702.5,45),(81,'Chai caliente',11,45),(82,'Soda italiana kiwi',11,45),(83,'Soda italiana granada',11,45),(84,'Soda italiana frutos rojos',11,45),(85,'Soda italiana maracuyÃ¡',11,45),(86,'Chocolate de agua',11,35),(87,'Chocolate de leche',11,40),(88,'Fruta de temporada',11,85),(89,'Waffles vainilla',11,80),(90,'Waffles cacao',11,80),(91,'Hotcakes vainilla',11,80),(92,'Hotcakes cacao',11,80),(93,'Torrejas mestizaje',11,85),(94,'Torrejas rellenas',11,95),(95,'Memelas con queso',11,50),(96,'Memelas con quesillo',11,50),(97,'Memelas con tasajo',11,65),(98,'Memelas con cecina',11,65),(99,'Memelas con chorizo',11,65),(100,'Memelas con carne mixta',11,65),(101,'Quesadillas fritas con tasajo',11,65),(102,'Quesadillas fritas con chorizo',11,65),(103,'Quesadillas fritas con cecina',11,65),(104,'Quesadillas fritas mixtas',11,65),(105,'Quesadillas fritas con queso',11,65),(106,'Quesadillas fritas con quesillo',11,65),(107,'Enfrijoladas con tasajo',43700000,85),(108,'Enfrijoladas con cecina',11,85),(109,'Enfrijoladas con chorizo',11,85),(110,'Enfrijoladas sencillas',11,70),(111,'Entomatadas sencillas',11,70),(112,'Entomatadas con tasajo',11,85),(113,'Entomatadas con cecina',11,85),(114,'Entomatadas con chorizo',11,85),(115,'Enmoladas sencillas',11,75),(116,'Enmoladas con tasajo',11,85),(117,'Enmoladas con cecina',11,85),(118,'Enmoladas con chorizo',11,85),(119,'Chilaquiles de huajillo sencillas',11,80),(120,'Chilaquiles de huajillo con tasajo',11,90),(121,'Chilaquiles de huajillo con cecina',11,90),(122,'Chilaquiles de huajillo con chorizo',11,90),(123,'Chilaquiles de frijol sencillas',11,75),(124,'Chilaquiles de frijol con tasajo',11,85),(125,'Chilaquiles de frijol con cecina',11,85),(126,'Chilaquiles de frijol con chorizo',11,85),(127,'Chilaquiles verdes sencillas',11,75),(128,'Chilaquiles verdes con tasajo',11,85),(129,'Chilaquiles verdes con cecina',11,85),(130,'Chilaquiles verdes con chorizo',11,85),(131,'Omelet de espinacas',11,70),(132,'Omelet de carnes frÃ­as',11,80),(133,'Omelet alebrije',11,80),(134,'Omelet chorizo',11,80),(135,'Omelet primavera',11,80),(136,'Huevos tarascos',11,78),(137,'Huevos motuleÃ±osa',11,78),(138,'Huevos con chorizo',11,78),(139,'Huevos con jamÃ³n',11,78),(140,'Huevos con salchicha',11,78),(141,'Huevos a la mexicana',11,78),(142,'Huevos rancheros',11,78),(143,'Negritos',11,85),(144,'Enchiladas verdes',11,85),(145,'Enchiladas verdes rellenas de quesillo',11,95),(146,'Enchiladas verdes rellenas de tasajo',11,105),(147,'Burrito relleno huevo c/jamÃ³n',11,90),(148,'Burrito relleno huevo c/chorizo',11,90),(149,'Burrito relleno huevo c/salchicha',11,90),(150,'Molletes de chorizo',11,80),(151,'Molletes de tasajo',11,85),(152,'Pizza de 3 quesos',11,1),(153,'Pizza margarita',11,1),(154,'Pizza de chorizo',11,1),(155,'Pizza de carnes frÃ­as',11,1),(156,'Pizza de chapulines',11,1),(157,'Hamburguesa alebrije',11,1),(158,'Hamburguesa arrachera',11,1),(159,'Hamburguesa pollo',11,1),(160,'Hamburguesa bbq',11,1),(161,'Hamburguesa oaxaqueÃ±a',11,1),(162,'Club sandwich',11,90),(163,'Ciabatta de 3 quesos',11,85),(164,'Ciabatta de carnes frÃ­as',11,88),(165,'Ciabatta de tasajo',11,88),(166,'Ciabatta de jamÃ³n y queso',11,80),(167,'Quesadillas mestizaje c/tasajo',11,90),(168,'Quesadillas mestizaje c/cecina',11,90),(169,'Quesadillas mestizaje c/chorizo',11,90),(170,'Quesadillas mestizaje c/arrachera',11,90),(171,'Sopa azteca',11,60),(172,'Sopa de frijol',11,60),(173,'Tasajo asado c/ensalada',11,90),(174,'Tasajo asado c/papas',11,90),(175,'Cecina enchilada c/ensalada',11,90),(176,'Cecina enchilada c/papas',11,90),(177,'Clayuda original',11,45),(178,'Clayuda mestizaje c/tasajo',11,75),(179,'Clayuda mestizaje c/cecina',11,75),(180,'Clayuda mestizaje c/chorizo',11,75),(181,'Clayuda mestizaje c/arrachera',11,85),(182,'Clayuda mestizaje sencilla',11,75),(183,'Torta oaxaqueÃ±a sencilla',11,1),(184,'Torta oaxaqueÃ±a c/tasajo',11,1),(185,'Torta oaxaqueÃ±a c/cecina',11,1),(186,'Torta oaxaqueÃ±a c/chorizo',11,1),(187,'Costra rellena de tasajo',11,1),(188,'Costra rellena de cecina',11,1),(189,'Costra rellena de chorizo',11,1),(190,'Ensalada del huerto',11,75),(191,'Ensalada alebrije',11,75),(192,'Ensalada mestizaje',11,75),(193,'Pan de caja',11,1),(194,'Pan de ciabatta',11,1),(195,'Pan de hamburguesa',11,1),(196,'Masa para pizza',11,1),(197,'Pan chocolatÃ­n',11,1),(198,'Pan concha',11,1),(199,'Pan orejita',11,1),(200,'Pan croassant',11,1),(201,'Pan barquito',11,1),(202,'Enfrijoladas c/huevo',11,85),(203,'Entomatadas c/huevo',11,85),(204,'Enmoladas c/huevo',11,85),(205,'Chilaquiles de huajillo c/huevo',11,90),(206,'Chilaquiles de frijol c/huevo',11,85),(207,'Chilaquiles verdes c/huevo',11,85),(208,'Chilaquiles rojos c/huevo',11,85),(209,'Chilaquiles rojos c/tasajo',11,85),(210,'Chilaquiles rojos c/cecina',11,85),(211,'Chilaquiles rojos c/chorizo',11,85),(212,'Chilaquiles rojos sencillos',11,75),(213,'Chilaquiles rojos c/pollo',11,85),(214,'Enfrijoladas c/pollo',11,85),(215,'Entomatadas c/pollo',11,85),(216,'Enmoladas c/pollo',11,85),(217,'Chilaquiles de huajillo c/pollo',11,90),(218,'Chilaquiles de frijol c/pollo',11,85),(219,'Chilaquiles verdes c/pollo',11,85),(220,'nuevo',2,NULL);
/*!40000 ALTER TABLE `receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recetaxproducto`
--

DROP TABLE IF EXISTS `recetaxproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recetaxproducto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_receta` int DEFAULT NULL,
  `id_producto` int DEFAULT NULL,
  `cantidad` mediumtext,
  `unidad_de_medida` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_receta` (`id_receta`),
  KEY `id_producto` (`id_producto`),
  CONSTRAINT `recetaxproducto_ibfk_1` FOREIGN KEY (`id_receta`) REFERENCES `receta` (`id_receta`),
  CONSTRAINT `recetaxproducto_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=419 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recetaxproducto`
--

LOCK TABLES `recetaxproducto` WRITE;
/*!40000 ALTER TABLE `recetaxproducto` DISABLE KEYS */;
INSERT INTO `recetaxproducto` VALUES (1,1,89,'1','oz'),(2,1,47,'2','oz'),(3,2,87,'1','oz'),(4,2,88,'1','oz'),(5,2,39,'1','oz'),(6,3,90,'2','oz'),(7,3,47,'1','oz'),(8,4,38,'2','oz'),(9,5,95,'2','oz'),(10,5,47,'1','oz'),(11,6,94,'2','oz'),(12,6,47,'1','oz'),(13,7,89,'1','oz'),(14,7,47,'2','oz'),(15,7,41,'8','oz'),(16,8,89,'1','oz'),(17,8,47,'1','oz'),(18,8,53,'1','oz'),(19,8,41,'8','oz'),(20,9,89,'1','oz'),(21,9,47,'1','oz'),(22,9,54,'1','oz'),(23,9,41,'8','oz'),(24,10,90,'2','oz'),(25,10,47,'1','oz'),(26,10,41,'8','oz'),(27,11,89,'2.5','oz'),(28,11,47,'5','oz'),(29,12,90,'5','oz'),(30,12,47,'3','oz'),(31,13,87,'3','oz'),(32,13,88,'3','oz'),(33,13,39,'3','oz'),(34,14,96,'10','oz'),(35,14,47,'5','oz'),(36,15,38,'6','oz'),(37,16,95,'10','oz'),(38,16,47,'5','oz'),(39,17,94,'10','oz'),(40,17,47,'5','oz'),(41,18,90,'5','oz'),(42,18,47,'3','oz'),(43,18,41,'1','Lt'),(44,19,89,'2.5','oz'),(45,19,47,'5','oz'),(46,19,41,'1','Lt'),(47,20,89,'2.5','oz'),(48,20,53,'2.5','oz'),(49,20,47,'2.5','oz'),(50,20,41,'1','Lt'),(51,21,89,'2.5','oz'),(52,21,54,'2.5','oz'),(53,21,47,'2.5','oz'),(54,21,41,'1','Lt'),(55,22,72,'45','Gr'),(56,22,79,'5','oz'),(57,22,86,'22','Ml'),(58,23,71,'45','Gr'),(59,23,79,'5','oz'),(60,23,86,'22','Ml'),(61,24,95,'5','oz'),(62,24,96,'5','oz'),(63,24,47,'2','oz'),(64,25,79,'2','oz'),(65,25,39,'2','oz'),(66,25,87,'1','oz'),(67,25,88,'1','oz'),(68,25,86,'22','Ml'),(69,26,99,'130','Gr'),(70,26,79,'5','oz'),(71,26,95,'5','oz'),(72,26,47,'2','oz'),(73,27,38,'3','oz'),(74,28,89,'2','oz'),(75,28,47,'2','oz'),(76,29,79,'5','oz'),(77,29,47,'2','oz'),(78,29,42,'23','Gr'),(79,29,86,'22','Ml'),(80,30,79,'5','oz'),(81,30,47,'2','oz'),(82,30,42,'23','Gr'),(83,30,86,'22','Ml'),(84,30,59,'5','Ml'),(85,31,42,'23','Gr'),(86,32,42,'23','Gr'),(87,32,79,'130','Ml'),(88,33,42,'23','Gr'),(89,33,79,'130','Ml'),(90,33,54,'1','oz'),(91,34,42,'23','Gr'),(92,34,79,'130','Ml'),(93,34,50,'1','oz'),(94,35,42,'23','Gr'),(95,35,79,'160','Ml'),(96,36,42,'23','Gr'),(97,36,79,'260','Ml'),(98,37,89,'1','oz'),(99,37,11,'5','Gr'),(100,37,43,'1','pz'),(112,45,37,'3','oz'),(113,45,92,'15','gr'),(114,46,37,'2','oz'),(115,46,38,'3','oz'),(116,47,37,'2','oz'),(117,47,94,'5','oz'),(118,47,47,'2','oz'),(119,48,37,'2','oz'),(120,48,47,'2','oz'),(121,48,98,'70','Gr'),(122,48,100,'2','oz'),(123,49,37,'2','oz'),(124,49,47,'2','oz'),(125,49,98,'45','Gr'),(126,49,38,'3','oz'),(127,50,37,'2','oz'),(128,50,47,'2','oz'),(129,50,89,'1','oz'),(130,50,113,'93','Gr'),(131,51,37,'2','oz'),(132,51,93,'5','oz'),(133,51,47,'2','oz'),(134,52,37,'1','oz'),(135,52,47,'0.5','oz'),(136,52,49,'1','oz'),(137,52,42,'23','Gr'),(138,53,89,'1','oz'),(139,53,37,'2','oz'),(140,53,12,'30','gr'),(141,54,89,'1','oz'),(142,55,95,'3','oz'),(143,55,100,'3','oz'),(144,55,94,'0.5','oz'),(145,56,102,'7','oz'),(146,56,51,'1','oz'),(147,56,89,'0.5','oz'),(148,57,101,'1','oz'),(149,57,90,'1','oz'),(150,57,89,'0.5','oz'),(151,57,102,'1','oz'),(152,57,51,'0.5','oz'),(153,58,42,'23','Gr'),(154,59,80,'130','Ml'),(155,60,42,'23','Gr'),(156,60,80,'130','Ml'),(157,60,54,'1','oz'),(158,61,42,'23','Gr'),(159,61,80,'130','Ml'),(160,61,50,'1','oz'),(161,79,79,'165','Ml'),(162,79,72,'45','Gr'),(163,80,79,'165','Ml'),(164,80,71,'45','Gr'),(165,81,79,'165','Ml'),(166,81,52,'1','oz'),(167,82,51,'1','oz'),(168,83,93,'2','oz'),(169,83,47,'1','oz'),(170,84,93,'1','oz'),(171,84,100,'1','oz'),(172,84,47,'1','oz'),(173,85,94,'2','oz'),(174,85,47,'1','oz'),(175,86,123,'165','Ml'),(176,86,69,'45','Gr'),(177,87,79,'165','Ml'),(178,87,69,'45','Gr'),(179,90,70,'30','Gr'),(180,90,129,'200','Gr'),(181,90,124,'0.5','Pz'),(182,90,235,'1.9','Gr'),(183,90,97,'25','Gr'),(184,90,79,'90','Ml'),(185,90,165,'0.5','Pz'),(186,90,98,'16','Gr'),(187,90,130,'20','Gr'),(188,90,210,'1.9','Gr'),(189,89,133,'8','Ml'),(190,89,129,'200','Gr'),(191,89,124,'0.5','Pz'),(192,89,235,'1.9','Gr'),(193,89,97,'25','Gr'),(194,89,79,'90','Ml'),(195,89,165,'0.5','Pz'),(196,89,98,'16','Gr'),(197,89,130,'20','Gr'),(198,89,210,'1.9','Gr'),(199,91,133,'8','Ml'),(200,91,129,'200','Gr'),(201,91,124,'0.5','Pz'),(202,91,235,'1.9','Gr'),(203,91,97,'25','Gr'),(204,91,79,'90','Ml'),(205,91,165,'0.5','Pz'),(206,91,98,'16','Gr'),(207,91,130,'20','Gr'),(208,91,210,'1.9','Gr'),(209,92,70,'30','Gr'),(210,92,129,'200','Gr'),(211,92,124,'0.5','Pz'),(212,92,235,'1.9','Gr'),(213,92,97,'25','Gr'),(214,92,79,'90','Ml'),(215,92,165,'0.5','Pz'),(216,92,98,'16','Gr'),(217,92,130,'20','Gr'),(218,92,210,'1.9','Gr'),(219,93,66,'30','Gr'),(220,93,79,'240','Ml'),(221,93,133,'20','Ml'),(222,93,124,'1','Pz'),(223,93,87,'1','oz'),(224,93,165,'0.5','Pz'),(225,93,130,'20','Gr'),(226,93,98,'16','Gr'),(227,93,221,'100','Gr'),(228,94,90,'1','oz'),(229,94,221,'100','Gr'),(230,94,87,'1','oz'),(231,94,79,'240','Ml'),(232,94,209,'90','Gr'),(233,94,124,'1','Pz'),(234,94,148,'60','Ml'),(235,94,92,'100','Gr'),(236,94,210,'20','Gr'),(237,95,218,'180','Gr'),(238,95,235,'100','Gr'),(239,95,202,'80','Gr'),(240,95,198,'20','Gr'),(241,96,218,'180','Gr'),(242,96,235,'100','Gr'),(243,96,203,'80','Gr'),(244,96,198,'20','Gr'),(245,97,218,'180','Gr'),(246,97,235,'100','Gr'),(247,97,202,'80','Gr'),(248,97,198,'20','Gr'),(249,97,189,'100','Gr'),(250,98,218,'180','Gr'),(251,98,235,'100','Gr'),(252,98,202,'80','Gr'),(253,98,198,'20','Gr'),(254,98,191,'100','Gr'),(255,99,218,'180','Gr'),(256,99,235,'100','Gr'),(257,99,202,'80','Gr'),(258,99,198,'20','Gr'),(259,99,188,'100','Gr'),(260,100,218,'180','Gr'),(261,100,235,'100','Gr'),(262,100,202,'80','Gr'),(263,100,198,'20','Gr'),(264,100,188,'30','Gr'),(265,100,189,'30','Gr'),(266,100,191,'30','Gr'),(267,101,218,'180','Gr'),(268,101,189,'100','Gr'),(269,101,157,'0.1','Pz'),(270,101,158,'80','Gr'),(271,101,202,'25','Gr'),(272,101,236,'60','Gr'),(273,102,218,'180','Gr'),(274,102,188,'100','Gr'),(275,102,157,'0.1','Pz'),(276,102,158,'80','Gr'),(277,102,202,'25','Gr'),(278,102,236,'60','Gr'),(279,103,218,'180','Gr'),(280,103,191,'100','Gr'),(281,103,157,'0.1','Pz'),(282,103,158,'80','Gr'),(283,103,202,'25','Gr'),(284,103,236,'60','Gr'),(285,104,218,'180','Gr'),(286,104,191,'30','Gr'),(287,104,157,'0.1','Pz'),(288,104,158,'80','Gr'),(289,104,202,'25','Gr'),(290,104,236,'60','Gr'),(291,104,188,'30','Gr'),(292,104,189,'30','Gr'),(293,106,218,'180','Gr'),(294,106,203,'100','Gr'),(295,106,157,'0.1','Pz'),(296,106,158,'80','Gr'),(297,106,202,'25','Gr'),(298,106,236,'60','Gr'),(299,105,218,'180','Gr'),(300,105,202,'100','Gr'),(301,105,157,'0.1','Pz'),(302,105,158,'80','Gr'),(303,105,236,'60','Gr'),(304,107,242,'90','Gr'),(305,107,236,'300','Gr'),(306,107,202,'70','Gr'),(307,107,189,'100','Gr'),(308,108,242,'90','Gr'),(309,108,236,'300','Gr'),(310,108,202,'70','Gr'),(311,108,191,'100','Gr'),(312,109,242,'90','Gr'),(313,109,236,'300','Gr'),(314,109,202,'70','Gr'),(315,109,188,'100','Gr'),(316,110,242,'90','Gr'),(317,110,236,'300','Gr'),(318,110,202,'70','Gr'),(319,202,242,'90','Gr'),(320,202,236,'300','Gr'),(321,202,202,'70','Gr'),(322,202,124,'2','Pz'),(323,213,242,'90','Gr'),(324,213,236,'300','Gr'),(325,213,202,'70','Gr'),(326,213,195,'100','Gr'),(327,111,242,'90','Gr'),(328,111,239,'300','Gr'),(329,111,202,'70','Gr'),(330,112,242,'90','Gr'),(331,112,239,'300','Gr'),(332,112,202,'70','Gr'),(333,112,189,'100','Gr'),(334,113,242,'90','Gr'),(335,113,239,'300','Gr'),(336,113,202,'70','Gr'),(337,113,191,'100','Gr'),(338,114,242,'90','Gr'),(339,114,239,'300','Gr'),(340,114,202,'70','Gr'),(341,114,188,'100','Gr'),(342,203,242,'90','Gr'),(343,203,239,'300','Gr'),(344,203,202,'70','Gr'),(345,203,124,'2','Pz'),(346,215,242,'90','Gr'),(347,215,239,'300','Gr'),(348,215,202,'70','Gr'),(349,215,195,'100','Gr'),(350,115,242,'90','Gr'),(351,115,231,'300','Gr'),(352,115,202,'70','Gr'),(353,116,242,'90','Gr'),(354,116,231,'300','Gr'),(355,116,202,'70','Gr'),(356,116,189,'100','Gr'),(357,117,242,'90','Gr'),(358,117,231,'300','Gr'),(359,117,202,'70','Gr'),(360,117,191,'100','Gr'),(361,118,242,'90','Gr'),(362,118,231,'300','Gr'),(363,118,202,'70','Gr'),(364,118,188,'100','Gr'),(365,204,242,'90','Gr'),(366,204,231,'300','Gr'),(367,204,202,'70','Gr'),(368,204,124,'2','Pz'),(369,215,242,'90','Gr'),(370,215,231,'300','Gr'),(371,215,202,'70','Gr'),(372,215,195,'100','Gr'),(373,119,242,'120','Gr'),(374,119,240,'300','Gr'),(375,119,202,'70','Gr'),(376,120,242,'120','Gr'),(377,120,240,'300','Gr'),(378,120,202,'70','Gr'),(379,120,189,'100','Gr'),(380,121,242,'120','Gr'),(381,121,240,'300','Gr'),(382,121,202,'70','Gr'),(383,121,191,'100','Gr'),(384,122,242,'120','Gr'),(385,122,240,'300','Gr'),(386,122,202,'70','Gr'),(387,122,188,'100','Gr'),(388,205,242,'120','Gr'),(389,205,240,'300','Gr'),(390,205,202,'70','Gr'),(391,205,124,'2','Pz'),(392,216,242,'120','Gr'),(393,216,240,'300','Gr'),(394,216,202,'70','Gr'),(395,216,195,'300','Gr'),(396,123,242,'120','Gr'),(397,123,236,'300','Gr'),(398,123,202,'70','Gr'),(399,124,242,'120','Gr'),(400,124,236,'300','Gr'),(401,124,202,'70','Gr'),(402,124,189,'100','Gr'),(403,125,242,'120','Gr'),(404,125,236,'300','Gr'),(405,125,202,'70','Gr'),(406,125,191,'100','Gr'),(407,126,242,'120','Gr'),(408,126,236,'300','Gr'),(409,126,202,'70','Gr'),(410,126,188,'100','Gr'),(411,206,242,'120','Gr'),(412,206,236,'300','Gr'),(413,206,202,'70','Gr'),(414,206,124,'2','Pz'),(415,217,242,'120','Gr'),(416,217,236,'300','Gr'),(417,217,202,'70','Gr'),(418,217,195,'100','Gr');
/*!40000 ALTER TABLE `recetaxproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID_USER` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `contrasenia` varchar(8) NOT NULL,
  PRIMARY KEY (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-07 11:18:26
