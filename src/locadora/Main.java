/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Super i3
 */
public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        Locadora a = new Locadora("Locadora MASSA", 1500);
        a.setNome("Locadora LAB");
        System.out.println(a.getNome());
        
    }
}
