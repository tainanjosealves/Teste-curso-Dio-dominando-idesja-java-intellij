package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("O Problema dos 3 corpos", 300);
        System.out.println(livro1);



       /*int a = 5;
       int b = 3;
        System.out.println("Hello World! "  + (a+b));*/

    }
}

class Livros {
    private String nome;
    private Integer numPaginas;

    public Livros(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
