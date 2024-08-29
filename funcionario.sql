CREATE TABLE `funcionarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cargo` varchar(255) DEFAULT NULL,
  `cpf` varchar(11) NOT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `data_admissao` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;