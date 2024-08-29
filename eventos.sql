CREATE TABLE `eventos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `capacidade` int NOT NULL,
  `data` date NOT NULL,
  `descricao` text,
  `hora_inicio` time NOT NULL,
  `hora_termino` time NOT NULL,
  `local` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `organizador` varchar(255) DEFAULT NULL,
  `publico` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;