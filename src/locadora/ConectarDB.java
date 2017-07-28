package locadora;

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
    public int ultimoID(String tabela) {
        String sql = "SELECT * FROM " + tabela;

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int a = 0;
            while (rs.next()) {
                a = rs.getInt("id");
            }

            return a;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public void createTable(String tabela, String row) {
        String sql = "CREATE TABLE Locadora (" + row + ")";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTableUser() {
        String sql = "CREATE TABLE Users (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, senha TEXT)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTableCarros() {
        String sql = "CREATE TABLE Carros (id INTEGER PRIMARY KEY AUTOINCREMENT, placa TEXT, marca TEXT, modelo TEXT, alugado boolean)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String tabela, String row, String data, int id) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = '" + data + "' WHERE id = " + id + ";";

        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void update(String tabela, String row, boolean data, int id) {
        String sql = "UPDATE '" + tabela + "' SET " + row + " = '" + data + "' WHERE id = " + id + ";";

        try (
                Connection conn = this.connect();
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

    public void update(String tabela, String row, String data, String id) {
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

    public void update(String tabela, String row, char[] data, int id) {
        data.toString();
        String sql = "UPDATE '" + tabela + "' SET " + row + " = " + data + " WHERE id = " + id;

        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLocadoraData(String row) {
        String sql = "SELECT * FROM 'Locadora'";
        String a = null;
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                a = rs.getString(row);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return a;
    }

    public int getNumCarros() {
        String sql = "SELECT nCarros FROM Locadora;";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int a = 0;
            while (rs.next()) {
                a = rs.getInt("nCarros");
            }

            return a;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
