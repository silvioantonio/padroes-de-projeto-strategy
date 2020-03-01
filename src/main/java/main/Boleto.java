/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author silvio
 */
class Boleto {
    private int id;
    private String agencia;

    public Boleto(int id, String agencia) {
        this.id = id;
        this.agencia = agencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", agencia=" + agencia + '}';
    }
    
    
}
