package main;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author silvio
 */
public class ProcessarBoletos {
    private Function<String, List<Boleto>> lerArquivo;

    public ProcessarBoletos(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }
    
    public void setLerArquivo(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }
    
    public void procesar(String nomeArquivo){
        List<Boleto> lista = lerArquivo.apply(nomeArquivo);
        System.out.println("Lista de boletos processados");
        for(Boleto boleto: lista)
            System.out.println(boleto);
    }
}
