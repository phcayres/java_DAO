/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConnectionFactoryComProperties;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Paulo Henrique Cayres
 */

public class UsaConnectionFactoryComProperties {

    public static void main(String[] args) throws SQLException{
        try (Connection con = new ConnectionFactoryComProperties().getConnectionCurso()) {
            System.out.println("Conexão com banco de dados ok!");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}