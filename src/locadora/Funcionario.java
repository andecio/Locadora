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
public class Funcionario extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String a = "[" + super.getNome() + "," + super.getCPF() + "," + getSalario() + "]";
        return a;
    }

    public String[] toArray() {
        String[] array = new String[4];
        array[0] = super.getNome();
        array[1] = super.getCPF() + "";
        array[2] = getSalario() + "";

        return array;
    }

}
