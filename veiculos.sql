

CREATE TABLE `veiculos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ano_fabricacao` year NOT NULL,
  `chassi` varchar(255) NOT NULL,
  `combustivel` varchar(50) DEFAULT NULL,
  `data_revisao` date DEFAULT NULL,
  `km` int DEFAULT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `nome_proprietario` varchar(255) DEFAULT NULL,
  `placa` varchar(20) NOT NULL,
  `cor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;