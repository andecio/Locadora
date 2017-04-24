package locadora;

import java.io.File;
import java.io.IOException;
import java.sql.*;

public class ConectarDB {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:locadoraDB.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /*    Connection c = null;
    Statement stmt = null;
    private String banco = "jdbc:sqlite:../locadora.db";*/
    public void createTable(String tabela, String row) {
        String sql = "CREATE TABLE Locadora (ID INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT,capital INT)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, String data, int id) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = " + data + " WHERE id = " + id;

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, int data, int id) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = " + data + " WHERE id = " + id;

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, double data, int id) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = " + data + " WHERE id = " + id;

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void select(String tabela, String row) {
        String sql = "SELECT " + row + " FROM " + tabela;

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            String a = null;
            while (rs.next()) {
                if (row.equals("nome")) {
                    a = rs.getString("nome");
                } else if (row.equals("numFuncionarios")) {
                    a = rs.getInt("numFuncionarios") + "";
                }

                System.out.println(a);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String tabela, String row, String data) {
        String sql = "INSERT INTO '" + tabela + "' (" + row + ") VALUES ( ? )";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String tabela, String row, long data) {
        String sql = "INSERT INTO '" + tabela + "' (" + row + ") VALUES ( " + data + " )";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
