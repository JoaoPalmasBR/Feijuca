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
package feijuca;

import static feijuca.Principal.produtos;
import static feijuca.Principal.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pix01
 */
public class Atualiza {
    static Connection connection;
    static public void AtualizaTudo(){
        getProdutos();
        getUsuarios();
        //System.out.println("oi");
    }
    static public void getProdutos(){
        System.out.println("atualiza produtos");
        try{
            Atualiza.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = Atualiza.connection.prepareStatement("select * from produto");
            ResultSet rs = stmt.executeQuery();
            produtos.clear();
            while (rs.next()) {
                // criando o objeto Contato
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(Float.parseFloat(rs.getString("valor")));
                produto.setQuant(Integer.parseInt(rs.getString("quant")));
                // adicionando o objeto à lista
                produtos.add(produto);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static public void getUsuarios(){
        System.out.println("atualiza usuarios");
        try{
            Atualiza.connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = Atualiza.connection.prepareStatement("select * from usuario");
            ResultSet rs = stmt.executeQuery();
            usuarios.clear();
            while (rs.next()) {
                // criando o objeto Contato
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setFuncao(rs.getString("funcao"));
                usuario.setStatus(Integer.parseInt(rs.getString("status")));
                usuario.setFuncionario(Integer.parseInt(rs.getString("funcionario")));
                // adicionando o objeto à lista
                usuarios.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
