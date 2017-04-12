package locadora;

import java.io.File;
import java.io.IOException;
import java.sql.*;

public class ConectarDB {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/src/locadoraDB.db";
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
    public void update(String tabela, String row, String data) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = ? ";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, double data) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = ? ";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setDouble(1, data);
            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, int data) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = ? ";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setDouble(1, data);
            // update
            pstmt.executeUpdate();

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
}
