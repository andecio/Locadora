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
public class Cliente extends Pessoa {

    private boolean alugando;
    private long telefone;

    public boolean isAlugando() {
        return alugando;
    }

    public void setAlugando(boolean alugando) {
        this.alugando = alugando;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
