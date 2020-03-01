/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author silvio
 */
public class Principal {

    public static void main(String[] args) {

        ProcessarBoletos processador = new ProcessarBoletos(LeituraRetorno::lerBancoDoBrasil);
        processador.procesar("banco-brasil.csv");

        processador.setLerArquivo(LeituraRetorno::lerBancoDoBradesco);
        processador.procesar("banco-bradesco.csv");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(1, "123"));
        boletos.add(new Boleto(4, "333"));
        boletos.add(new Boleto(2, "444"));
        boletos.add(new Boleto(3, "222"));
        
        boletos.sort(Comparator.comparingInt(Boleto::getId));

        System.out.println(boletos);
        
    }
}
