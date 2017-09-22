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
CREATE TABLE `usuario` (
    `codigo` int(11) NOT NULL,
    `nome` varchar(255) DEFAULT NULL,
    `usuario` varchar(255) DEFAULT NULL,
    `senha` varchar(255) DEFAULT NULL,
    `funcao` varchar(255) DEFAULT NULL,
    `status` int(11) DEFAULT NULL,
    `funcionario` int(11) DEFAULT NULL
    PRIMARY KEY (`codigo`)
);

INSERT INTO `usuario` (`codigo`, `nome`, `usuario`, `senha`, `funcao`, `status`, 
`funcionario`) VALUES ('1', 'Joao', 'joao', 'joao', 'caixa', '1', '1')