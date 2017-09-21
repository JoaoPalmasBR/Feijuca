/* 
 * Copyright 2017 pix01.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Author:  pix01
 * Created: 21/09/2017
 */
CREATE TABLE `funcionario` (
    `codigo` int(11) NOT NULL,
    `nome` varchar(255) DEFAULT NULL,
    `cpf` varchar(255) DEFAULT NULL,
    `rg` varchar(255) DEFAULT NULL,
    `telefone` varchar(255) DEFAULT NULL,
    `celular` varchar(255) DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL,
    `endereco` varchar(255) DEFAULT NULL,
    `funcao` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `funcionario` (`codigo`, `nome`, `cpf`, `rg`, `telefone`, `celular`,
`email`, `endereco`, `funcao`) VALUES ('1', 'Joao Antonio dos Santos Ilario', 
'033.423.151-56', '1.183.515', '(63)3225-4748', '(63)99262-6902', 
'joao@joaoantoniosantos.com.br', '106 Norte, Ala 1, Lote 1, Apt 214', 'caixa')