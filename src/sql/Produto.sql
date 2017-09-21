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
CREATE TABLE `produto` (
    `codigo` int(11) NOT NULL,
    `nome` varchar(255) NOT NULL,
    `valor` float NOT NULL,
    PRIMARY KEY (`codigo`)
)

INSERT INTO `produto` (`codigo`, `nome`, `valor`) VALUES ('1', 'Coca-Cola', '4.00');
INSERT INTO `produto` (`codigo`, `nome`, `valor`) VALUES ('2', 'Pepsi', '3.50');