package locadora;

import gui.Teste;
import java.sql.*;
import javax.swing.JOptionPane;

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

    public void createTableClientes() {
        String sql = "CREATE TABLE Clientes (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, cpf TEXT, alugando TEXT)";
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

    public int getNumClientes() {
        String sql = "SELECT nClientes FROM Locadora;";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int a = 0;
            while (rs.next()) {
                a = rs.getInt("nClientes");
            }

            return a;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public int getCarrosAlugados() {
        String sql = "SELECT carrosAlugados FROM Locadora;";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            int a = 0;
            while (rs.next()) {
                a = rs.getInt("carrosAlugados");
            }
            return a;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public Object[][] listaDeCarros() {
        String sql = "SELECT * FROM Carros ORDER BY marca";
        Object[][] lista = null;

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            String a = null;
            int tamanho = this.ultimoID("Carros");
            lista = new Object[tamanho][];
            int cont = 0;
            while (rs.next()) {
                Object[] apoio = new Object[4];
                apoio[0] = rs.getString("placa");
                apoio[1] = rs.getString("marca");
                apoio[2] = rs.getString("modelo");
                apoio[3] = rs.getString("alugado");
                lista[cont] = apoio;
                cont++;

            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public Object[][] listaDeClientes() {
        String sql = "SELECT * FROM Clientes ORDER BY nome";
        Object[][] lista = null;

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            String a = null;
            int tamanho = this.ultimoID("Clientes");
            lista = new Object[tamanho][];
            int cont = 0;
            while (rs.next()) {
                Object[] apoio = new Object[3];
                apoio[0] = rs.getString("nome");
                apoio[1] = rs.getString("cpf");
                apoio[2] = rs.getString("alugando");
                // lista[rs.getInt("id") - 1] = apoio;
                lista[cont] = apoio;
                cont++;
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void delete(String tabela, String row, String data) {

        String sql = "DELETE from '" + tabela + "' where " + row + " = '" + data + "';";
        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public String[] gerarPlacas() throws SQLException {
        int tamanho = this.ultimoID("Carros");
        // String[] placas = new String[tamanho];

        String sql = "SELECT * FROM Carros WHERE alugado = 'false' ORDER BY placa";
        int cont = 0;
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                cont++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Todos os carros já foram alugados.");
        }
        String[] placas = new String[cont + 1];

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            String a = null;
            placas[0] = "";
            cont = 1;
            while (rs.next()) {
                placas[cont] = rs.getString("placa");
                cont++;
            }

            return placas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String getCarroData(String row, String placa) {
        // String sql = "SELECT * FROM 'Carros' WHERE " + row + " = '" + placa + "';";
        String sql = "SELECT * FROM 'Carros' WHERE placa = '" + placa + "';";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            String a = null;
            while (rs.next()) {
                a = rs.getString(row);
            }

            return a;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void setClienteAlugando(String placa, String nome) {
        String sql = "UPDATE 'Clientes' SET alugando = '" + placa + "' WHERE nome = '" + nome + "';";

        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void setCarroAlugando(String nome, String placa, boolean stats) {
        String sql, sql2;

        int numCarrosAlugados = this.getCarrosAlugados();
        if (stats) {
            sql = "UPDATE 'Carros' SET alugado = '" + nome + "' WHERE placa = '" + placa + "';";
            sql2 = "UPDATE 'Clientes' SET alugando = '" + placa + "' WHERE nome = '" + nome + "';";

            this.update("Locadora", "carrosAlugados", numCarrosAlugados + 1, 1);
        } else {
            sql = "UPDATE 'Carros' SET alugado = 'false' WHERE placa = '" + placa + "';";
            sql2 = "UPDATE 'Clientes' SET alugando = 'null' WHERE nome = '" + nome + "';";
            this.update("Locadora", "carrosAlugados", numCarrosAlugados - 1, 1);
            JOptionPane.showMessageDialog(null, "Carro devolvido com sucesso!");

        }

        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql2)) {
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean verificarLogin(String login, String senha) throws SQLException {
        boolean logado;

        String sql = "SELECT * FROM Users";
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            String loginUser = null;
            String senhaUser = null;
            while (rs.next()) {
                loginUser = rs.getString("nome");
                senhaUser = rs.getString("senha");
            }

            if (login.equals(loginUser)) {
                if (senha.equals(senhaUser)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário incorreto!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
