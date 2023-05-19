-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2022 at 11:12 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pos`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `noPembelian` varchar(5) NOT NULL,
  `kodeBrg` varchar(5) NOT NULL,
  `namaBrg` varchar(100) DEFAULT NULL,
  `jenisBrg` varchar(100) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`noPembelian`, `kodeBrg`, `namaBrg`, `jenisBrg`, `harga`, `jumlah`) VALUES
('TP001', 'KD001', 'Life Boy', 'Keperluan Rumah Tangga', 3000, 5),
('TP001', 'KD002', 'Sunlight', 'Keperluan Rumah Tangga', 10000, 10),
('TP002', 'KD003', 'Sarimie', 'Makanan', 2500, 5),
('TP002', 'KD004', 'Silver Queen', 'Makanan', 12000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `cabang`
--

CREATE TABLE `cabang` (
  `kodeCbg` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `noTelp` varchar(12) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `kota` varchar(50) DEFAULT NULL,
  `provinsi` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cabang`
--

INSERT INTO `cabang` (`kodeCbg`, `nama`, `noTelp`, `alamat`, `kota`, `provinsi`) VALUES
('C001', 'Karawang', '02190020199', 'Jln. Perintis Kemerdekaan', 'Solo', 'Jawa Tengah');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `noTelp` varchar(12) DEFAULT NULL,
  `stats` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `nama`, `noTelp`, `stats`) VALUES
('001', 'Bintang Ramadhan', '082210700731', 'Member');

-- --------------------------------------------------------

--
-- Table structure for table `datacabang`
--

CREATE TABLE `datacabang` (
  `kodeData` varchar(5) NOT NULL,
  `kodeCbg` varchar(5) DEFAULT NULL,
  `kodeDtm` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `datapenjualan`
--

CREATE TABLE `datapenjualan` (
  `kodeBrg` varchar(5) NOT NULL,
  `noFaktur` varchar(5) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `namaBrg` varchar(100) DEFAULT NULL,
  `hargaBrg` int(11) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `departemen`
--

CREATE TABLE `departemen` (
  `kodeDtm` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `bagian` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `departemen`
--

INSERT INTO `departemen` (`kodeDtm`, `nama`, `bagian`) VALUES
('KD001', 'Manajemen', 'Manajemen Keuangan'),
('KD002', 'Human Resource', 'Manajer');

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `kodeJbtn` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `gaji` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`kodeJbtn`, `nama`, `gaji`) VALUES
('JB001', 'Kasir', '3000000'),
('JB002', 'Manajer', '3000000');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `umur` int(2) DEFAULT NULL,
  `noTelp` varchar(12) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `kota` varchar(50) DEFAULT NULL,
  `provinsi` varchar(50) DEFAULT NULL,
  `kodeDtm` varchar(5) DEFAULT NULL,
  `kodeJbtn` varchar(5) DEFAULT NULL,
  `stat` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nama`, `umur`, `noTelp`, `alamat`, `kota`, `provinsi`, `kodeDtm`, `kodeJbtn`, `stat`) VALUES
('K001', 'Andi Mulyadi', 25, '083309818821', 'Jln Pattimura V', 'Jakarta Utara', 'Jakarta', 'KD001', 'JB001', 'Aktif'),
('M001', 'Bintang Ramadhan', 21, '082210700731', 'Aster 3', 'Tangerang', 'Banten', 'KD002', 'JB002', 'Aktif'),
('M002', 'Andi Gozali', 30, '083310800922', 'Parung Panjang', 'Bogor', 'Jawa Barat', 'KD002', 'JB002', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `noFaktur` varchar(5) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `idMnjr` varchar(5) DEFAULT NULL,
  `namaMnjr` varchar(100) DEFAULT NULL,
  `idSplr` varchar(5) DEFAULT NULL,
  `namaSplr` varchar(100) DEFAULT NULL,
  `total` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`noFaktur`, `tanggal`, `idMnjr`, `namaMnjr`, `idSplr`, `namaSplr`, `total`) VALUES
('TP001', '2022-03-27', 'M001', 'Bintang Ramadhan', 'S001', 'UNILEVER', '30000'),
('TP002', '2022-03-27', 'M002', 'Andi Gozali', 'S001', 'UNILEVER', '6000');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `noFaktur` varchar(5) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `kodeCbg` varchar(5) DEFAULT NULL,
  `namaCbg` varchar(100) DEFAULT NULL,
  `idKasir` varchar(5) DEFAULT NULL,
  `namaKasir` varchar(100) DEFAULT NULL,
  `idCust` varchar(5) DEFAULT NULL,
  `namaCust` varchar(100) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `bayar` int(11) DEFAULT NULL,
  `kembalian` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` varchar(5) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `noTelp` varchar(12) DEFAULT NULL,
  `lokasi` varchar(100) DEFAULT NULL,
  `kota` varchar(50) DEFAULT NULL,
  `provinsi` varchar(50) DEFAULT NULL,
  `namaBrg` varchar(100) DEFAULT NULL,
  `jenisBrg` varchar(200) DEFAULT NULL,
  `harga` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `nama`, `noTelp`, `lokasi`, `kota`, `provinsi`, `namaBrg`, `jenisBrg`, `harga`) VALUES
('S001', 'UNILEVER', '0218009011', 'Daan Mogot', 'Jakarta Selatan', 'Jakarta', 'Life Boy', 'Keperluan Rumah Tangga', '3000');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `pass` varchar(100) DEFAULT NULL,
  `level` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `pass`, `level`) VALUES
('admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin'),
('hendra', 'a04cca766a885687e33bc6b114230ee9', 'Kasir');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kodeBrg`),
  ADD KEY `FK_Pembelian` (`noPembelian`);

--
-- Indexes for table `cabang`
--
ALTER TABLE `cabang`
  ADD PRIMARY KEY (`kodeCbg`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `datacabang`
--
ALTER TABLE `datacabang`
  ADD PRIMARY KEY (`kodeData`),
  ADD KEY `Kd_Dtm1` (`kodeDtm`),
  ADD KEY `Kd_Cbg1` (`kodeCbg`);

--
-- Indexes for table `datapenjualan`
--
ALTER TABLE `datapenjualan`
  ADD PRIMARY KEY (`kodeBrg`),
  ADD KEY `FK_Penjualan` (`noFaktur`);

--
-- Indexes for table `departemen`
--
ALTER TABLE `departemen`
  ADD PRIMARY KEY (`kodeDtm`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`kodeJbtn`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Jabatan` (`kodeJbtn`),
  ADD KEY `FK_Departemen` (`kodeDtm`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`noFaktur`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`noFaktur`),
  ADD KEY `PJ_Cabang` (`kodeCbg`),
  ADD KEY `PJ_Kasir` (`idKasir`),
  ADD KEY `PJ_Customer` (`idCust`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `FK_Pembelian` FOREIGN KEY (`noPembelian`) REFERENCES `pembelian` (`noFaktur`);

--
-- Constraints for table `datacabang`
--
ALTER TABLE `datacabang`
  ADD CONSTRAINT `Kd_Cbg1` FOREIGN KEY (`kodeCbg`) REFERENCES `cabang` (`kodeCbg`),
  ADD CONSTRAINT `Kd_Dtm1` FOREIGN KEY (`kodeDtm`) REFERENCES `departemen` (`kodeDtm`);

--
-- Constraints for table `datapenjualan`
--
ALTER TABLE `datapenjualan`
  ADD CONSTRAINT `FK_Penjualan` FOREIGN KEY (`noFaktur`) REFERENCES `penjualan` (`noFaktur`);

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD CONSTRAINT `FK_Departemen` FOREIGN KEY (`kodeDtm`) REFERENCES `departemen` (`kodeDtm`),
  ADD CONSTRAINT `FK_Jabatan` FOREIGN KEY (`kodeJbtn`) REFERENCES `jabatan` (`kodeJbtn`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `PJ_Cabang` FOREIGN KEY (`kodeCbg`) REFERENCES `cabang` (`kodeCbg`),
  ADD CONSTRAINT `PJ_Customer` FOREIGN KEY (`idCust`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `PJ_Kasir` FOREIGN KEY (`idKasir`) REFERENCES `karyawan` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
