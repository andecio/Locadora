/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author lavyk
 */
import gui.*;
import java.io.File;
import java.sql.*;

public class SQL {

    Connection c = null;

    public SQL() {
        File file = new File("locadoraDB.db");

        if (!file.exists()) {
            Locadora formNovaLocadora = new Locadora();
            formNovaLocadora.setVisible(true);
            createDB();
            System.out.println("Locadora não configurada.");
        } else {
            System.out.append("Locadora configurada");
        }
    }

    public void createDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:locadoraDB.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
