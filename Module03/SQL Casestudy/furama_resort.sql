-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: furama_resort
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `bophan`
--

DROP TABLE IF EXISTS `bophan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bophan` (
  `IDBoPhan` int NOT NULL AUTO_INCREMENT,
  `TenBoPhan` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bophan`
--

LOCK TABLES `bophan` WRITE;
/*!40000 ALTER TABLE `bophan` DISABLE KEYS */;
INSERT INTO `bophan` VALUES (1,'Sale – Marketing'),(2,'Hanh Chinh'),(3,'Phuc vu'),(4,'Quan Ly');
/*!40000 ALTER TABLE `bophan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `IDDichVu` int NOT NULL AUTO_INCREMENT,
  `TenDichVu` varchar(45) DEFAULT NULL,
  `DienTich` int DEFAULT NULL,
  `SoTang` int DEFAULT NULL,
  `SoNguoiToiDa` varchar(45) DEFAULT NULL,
  `ChiPhiThue` varchar(45) DEFAULT NULL,
  `IDKieuThue` int DEFAULT NULL,
  `IDLoaiDichVu` int DEFAULT NULL,
  `TrangThai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDDichVu`),
  KEY `IDKieuThue` (`IDKieuThue`),
  KEY `IDLoaiDichVu` (`IDLoaiDichVu`),
  CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`IDKieuThue`) REFERENCES `kieuthue` (`IDKieuThue`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dichvu_ibfk_2` FOREIGN KEY (`IDLoaiDichVu`) REFERENCES `loaidichvu` (`IDLoaiDichVu`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'Villa',32,5,'2','500000',1,2,'Tot');
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvudikem`
--

DROP TABLE IF EXISTS `dichvudikem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvudikem` (
  `IDDichVuDiKem` int NOT NULL AUTO_INCREMENT,
  `TenDichVuDiKem` varchar(45) DEFAULT NULL,
  `Gia` int DEFAULT NULL,
  `DonVi` int DEFAULT NULL,
  `TrangThaiKhaDung` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDDichVuDiKem`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvudikem`
--

LOCK TABLES `dichvudikem` WRITE;
/*!40000 ALTER TABLE `dichvudikem` DISABLE KEYS */;
INSERT INTO `dichvudikem` VALUES (1,'massage',500000,1,'Tot'),(2,'karaoke',100000,1,'Tot'),(3,'food',400000,1,'Ngon'),(4,'car',300000,1,'Tot');
/*!40000 ALTER TABLE `dichvudikem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdong`
--

DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `IDHopDong` int NOT NULL AUTO_INCREMENT,
  `IDNhanVien` int DEFAULT NULL,
  `IDKhachHang` int DEFAULT NULL,
  `IDDichVu` int DEFAULT NULL,
  `NgayLamHopDong` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `TienDatCoc` int DEFAULT NULL,
  `TongTien` int DEFAULT NULL,
  PRIMARY KEY (`IDHopDong`),
  KEY `IDKhachHang` (`IDKhachHang`),
  KEY `IDDichVu` (`IDDichVu`),
  KEY `IDNhanVien` (`IDNhanVien`),
  CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`IDKhachHang`) REFERENCES `khachhang` (`IDKhachHang`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`IDDichVu`) REFERENCES `dichvu` (`IDDichVu`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `hopdong_ibfk_3` FOREIGN KEY (`IDNhanVien`) REFERENCES `nhanvien` (`IDNhanVien`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
INSERT INTO `hopdong` VALUES (1,1,1,1,'2021-09-15','2021-09-16',1000000,NULL),(2,2,3,1,'2020-07-01','2021-08-01',2000000,NULL);
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdongchitiet`
--

DROP TABLE IF EXISTS `hopdongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdongchitiet` (
  `IDHopDongChiTiet` int NOT NULL AUTO_INCREMENT,
  `IDHopDong` int DEFAULT NULL,
  `IDDichVuDiKem` int DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`IDHopDongChiTiet`),
  KEY `IDDichVuDiKem` (`IDDichVuDiKem`),
  KEY `IDHopDong` (`IDHopDong`),
  CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`IDDichVuDiKem`) REFERENCES `dichvudikem` (`IDDichVuDiKem`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `hopdongchitiet_ibfk_2` FOREIGN KEY (`IDHopDong`) REFERENCES `hopdong` (`IDHopDong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdongchitiet`
--

LOCK TABLES `hopdongchitiet` WRITE;
/*!40000 ALTER TABLE `hopdongchitiet` DISABLE KEYS */;
INSERT INTO `hopdongchitiet` VALUES (1,1,1,2),(2,2,2,2);
/*!40000 ALTER TABLE `hopdongchitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `IDKhachHang` int NOT NULL AUTO_INCREMENT,
  `IDLoaiKhach` int DEFAULT NULL,
  `Hoten` varchar(45) DEFAULT NULL,
  `Ngaysinh` date DEFAULT NULL,
  `SoCMND` varchar(45) DEFAULT NULL,
  `SDT` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDKhachHang`),
  KEY `IDLoaiKhach` (`IDLoaiKhach`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`IDLoaiKhach`) REFERENCES `loaikhach` (`IDloaiKhach`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,1,'Kieu Oanh','1995-04-24','1432322','0314234','kieuoanh@gmail.com','Gia Lai'),(2,1,'Huong Vy','2000-01-12','74634256','04572846','vy@gmail.com','Da Nang'),(3,1,'Tuan','1992-11-11','2332134','0472645','tuan@gmail.com','Vinh');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kieuthue`
--

DROP TABLE IF EXISTS `kieuthue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieuthue` (
  `IDKieuThue` int NOT NULL AUTO_INCREMENT,
  `TienKieuThue` varchar(45) DEFAULT NULL,
  `Gia` int DEFAULT NULL,
  PRIMARY KEY (`IDKieuThue`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieuthue`
--

LOCK TABLES `kieuthue` WRITE;
/*!40000 ALTER TABLE `kieuthue` DISABLE KEYS */;
INSERT INTO `kieuthue` VALUES (1,'Ngay',1000000),(2,'Thang',30000000);
/*!40000 ALTER TABLE `kieuthue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaidichvu`
--

DROP TABLE IF EXISTS `loaidichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaidichvu` (
  `IDLoaiDichVu` int NOT NULL AUTO_INCREMENT,
  `TenLoaiDichVu` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDLoaiDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaidichvu`
--

LOCK TABLES `loaidichvu` WRITE;
/*!40000 ALTER TABLE `loaidichvu` DISABLE KEYS */;
INSERT INTO `loaidichvu` VALUES (1,'Villa'),(2,'House'),(3,'Room');
/*!40000 ALTER TABLE `loaidichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhach`
--

DROP TABLE IF EXISTS `loaikhach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhach` (
  `IDloaiKhach` int NOT NULL AUTO_INCREMENT,
  `TenLoaiKhach` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDloaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhach`
--

LOCK TABLES `loaikhach` WRITE;
/*!40000 ALTER TABLE `loaikhach` DISABLE KEYS */;
INSERT INTO `loaikhach` VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,' Silver'),(5,'Member');
/*!40000 ALTER TABLE `loaikhach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `IDNhanVien` int NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(45) DEFAULT NULL,
  `IDViTri` int DEFAULT NULL,
  `IDTrinhDo` int DEFAULT NULL,
  `IDBoPhan` int DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `SoCMND` varchar(45) DEFAULT NULL,
  `Luong` varchar(45) DEFAULT NULL,
  `SDT` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDNhanVien`),
  KEY `IDViTri` (`IDViTri`),
  KEY `IDTrinhDo` (`IDTrinhDo`),
  KEY `IDBoPhan` (`IDBoPhan`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`IDViTri`) REFERENCES `vitri` (`IDViTri`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`IDTrinhDo`) REFERENCES `trinhdo` (`IDTrinhDo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`IDBoPhan`) REFERENCES `bophan` (`IDBoPhan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Quynh Nhi',5,3,2,'2000-01-17','2132121','10000000','012345678','quynhnhi@gmail.com','Da Nang'),(2,'Hieu',3,2,1,'2000-03-12','1234564','10000000','064252718','hieu@gmail.com','Da Nang');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinhdo`
--

DROP TABLE IF EXISTS `trinhdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinhdo` (
  `IDTrinhDo` int NOT NULL AUTO_INCREMENT,
  `TrinhDo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDTrinhDo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinhdo`
--

LOCK TABLES `trinhdo` WRITE;
/*!40000 ALTER TABLE `trinhdo` DISABLE KEYS */;
INSERT INTO `trinhdo` VALUES (1,'Trung Cap'),(2,'Cao Dang'),(3,'Dai Hoc'),(4,'Sau Dai Hoc');
/*!40000 ALTER TABLE `trinhdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `IDViTri` int NOT NULL AUTO_INCREMENT,
  `TenViTri` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDViTri`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitri`
--

LOCK TABLES `vitri` WRITE;
/*!40000 ALTER TABLE `vitri` DISABLE KEYS */;
INSERT INTO `vitri` VALUES (1,'Le Tan'),(2,'Phuc Vu'),(3,'Chuyen Vien'),(4,'Giam Sat'),(5,'Quan Ly'),(6,'Giam Doc');
/*!40000 ALTER TABLE `vitri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-19 15:53:30
