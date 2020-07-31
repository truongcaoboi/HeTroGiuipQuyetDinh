-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 04, 2018 lúc 05:23 PM
-- Phiên bản máy phục vụ: 10.1.31-MariaDB
-- Phiên bản PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `htgqd`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chiphi`
--

CREATE TABLE `chiphi` (
  `ma` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `thang` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chiphidukien` double NOT NULL,
  `giaca` double NOT NULL,
  `nangsuattoida` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chiphi`
--

INSERT INTO `chiphi` (`ma`, `thang`, `chiphidukien`, `giaca`, `nangsuattoida`) VALUES
('1', ' 1 4 8 9 12 ', 1100, 7000, 0.75),
('1', ' 2 3 5 6 7 10 11 ', 1600, 8000, 0.68),
('10', ' 1 2 3 4 5 6 7 8 9 12 ', 1100, 21000, 9),
('10', ' 10 11 ', 1000, 20000, 10),
('11', ' 1 2 3 6 7 8 11 12 ', 2500, 22000, 25),
('11', ' 4 5 9 10 ', 2000, 17000, 30),
('12', ' 1 2 3 6 7 8 9 10 11 12 ', 2500, 30000, 1.5),
('12', ' 4 5 ', 2000, 26000, 1.8),
('2', ' 1 2 3 5 6 11 12 ', 2000, 7000, 2.3),
('2', ' 4 7 8 9 10 ', 2200, 9000, 2),
('3', ' 1 5 6 7 8 9 10 11 12 ', 1900, 5000, 4.9),
('3', ' 2 3 4 ', 1700, 3000, 5.5),
('4', ' 1 2 3 4 5 6 7 8 9 10 11 12 ', 3000, 20000, 4),
('5', ' 10 11 12 1 ', 3000, 12000, 4),
('5', ' 2 3 4 5 6 7 8 9 ', 2500, 11000, 3),
('6', ' 1 2 3 4 5 6 7 8 9 ', 2000, 14000, 2.5),
('6', ' 10 11 12 ', 1700, 12000, 4),
('7', ' 1 3 4 5 6 7 8 9 10 11 12 ', 650, 50000, 0.03),
('7', ' 2 ', 500, 50000, 0.05),
('8', ' 1 2 3 4 5 6 7 8 9 12 ', 850, 12000, 1.4),
('8', ' 10 11 ', 710, 9000, 2),
('9', ' 3 4 5 6 ', 700, 20000, 3),
('9', ' 7 8 9 10 11 12 1 2 ', 560, 13000, 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nongsan`
--

CREATE TABLE `nongsan` (
  `ma` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nongsan`
--

INSERT INTO `nongsan` (`ma`, `name`) VALUES
('1', 'Ngô'),
('10', 'Thanh long'),
('11', 'Cam'),
('12', 'Quýt'),
('2', 'Khoai lang'),
('3', 'Sắn'),
('4', 'Xoài'),
('5', 'Nhãn'),
('6', 'Vải'),
('7', 'Lạc'),
('8', 'Khoai tây'),
('9', 'Cà chua');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chiphi`
--
ALTER TABLE `chiphi`
  ADD PRIMARY KEY (`ma`,`thang`);

--
-- Chỉ mục cho bảng `nongsan`
--
ALTER TABLE `nongsan`
  ADD PRIMARY KEY (`ma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
