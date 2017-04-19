package locadora;

import java.sql.*;

public class NormalLocadora {

    private String nome;
    private int numCarros, numFuncionarios;
    private double capital;

    ConectarDB bancoDeDados = new ConectarDB();

    public NormalLocadora(String nome, double capital) {
        this.setNome(nome);
        this.setCapital(capital);
    }

    public String getNome() {
        bancoDeDados.select("locadora", "nome");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        bancoDeDados.update("locadora", "nome", nome);
    }

    public int getNumCarros() {
        return numCarros;
    }

    public void setNumCarros(int numCarros) {
        this.numCarros = numCarros;
        bancoDeDados.update("locadora", "numCarros", numCarros);
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
        bancoDeDados.update("locadora", "numFuncionarios", numFuncionarios);
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
        bancoDeDados.update("locadora", "capital", capital);
    }
}
