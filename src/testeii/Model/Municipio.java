package testeii.Model;

import java.io.Serializable;
import java.util.Random;

public class Municipio implements Serializable {

    private String nome;
    String provincia;
    int quantidadeRecenciados;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Municipio() {
        this.provincia = "Maputo";
        this.quantidadeRecenciados = gerarNumeroAleatorio(5, 30);
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max - min + 1) + min;
        return numeroAleatorio;
    }

}
