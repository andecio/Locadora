/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Super i3
 */
public class Agente extends Funcionario {

    private int numAlugueis;

    public Agente(String nome, long CPF, double salario) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setSalario(salario);
    }

    public void alugarCarro(String placa) {
        System.out.println("Alugou o carro: " + placa);
    }

}
