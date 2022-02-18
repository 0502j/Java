package parimpar;

import java.util.Scanner;

public class Jogador {

    private int escolha;
    private int jogada;
    private String nome;
    Scanner input = new Scanner(System.in);

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        if (1 == escolha) {
            this.escolha = 0;
        } else {
            this.escolha = 1;
        }

        if (this.escolha == 1) {
            System.out.println(this.nome + " escolheu par");
        } else {
            System.out.println(this.nome + " escolheu ímpar");
        }

    }

    public void setEscolha() {
        do {
            System.out.println("Faça sua escolha:");
            System.out.println("0 - Par | 1 - Impar");
            this.escolha = input.nextInt();
        } while (0 != this.escolha && 1 != this.escolha);

        if (this.escolha == 1) {
            System.out.println(this.nome + " escolheu par");
        } else {
            System.out.println(this.nome + " escolheu ímpar");
        }

    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
        System.out.println(this.nome + " escolheu " + this.jogada);
    }

    public void setJogada() {

        System.out.println("------------------");
        System.out.println("Faça sua jogada: ");
        this.jogada = input.nextInt();
        System.out.println(this.nome + " escolheu " + this.jogada);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNome() {
        System.out.println("Digite seu nome: ");
        this.nome = input.next();
    }

    public void infoGanhador(String nome, int jogada) {

        if (0 == (this.jogada + jogada) % 2){
            System.out.println("---PAR---");
        }else{
            System.out.println("---IMPAR---");
        }
        
        if (this.escolha == (this.jogada + jogada % 2)){
            System.out.println(this.nome + " ganhou!");
        }else{
            System.out.println(nome + " ganhou!");
        }
        
        
    }

}
