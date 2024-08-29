CREATE TABLE `fornecedores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `contato` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `entrega` varchar(50) DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `pagamento` varchar(255) DEFAULT NULL,
  `produto_servico` varchar(255) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;