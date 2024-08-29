CREATE TABLE `livros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `autor` varchar(255) NOT NULL,
  `editora` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `idioma` varchar(50) DEFAULT NULL,
  `local_biblioteca` varchar(255) DEFAULT NULL,
  `ano_publicacao` year DEFAULT NULL,
  `ano_compra` year DEFAULT NULL,
  `num_paginas` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;