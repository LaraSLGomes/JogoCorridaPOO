import java.util.ArrayList;

public abstract class Personagens {
    private String nome;
    private int pontuacao;
    private int velocidade;

    public Personagens(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.pontuacao = 0;
    }

    // Métodos abstratos que as subclasses devem implementar
    public abstract void pular();
    public abstract void desviar();

    // Método de movimento básico
    public void mover() {
        System.out.println(nome + " está se movendo à velocidade " + velocidade);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Método para atualizar a pontuação
    public void incrementarPontuacao(int pontos) {
        this.pontuacao += pontos;
        System.out.println("Pontuação de " + nome + ": " + pontuacao);
    }
}