import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Jogo {
    private ArrayList<Personagens> personagens;
    private ArrayList<Obstaculo> obstaculos;
    private int pontuacao;

    public Jogo() {
        this.personagens = new ArrayList<>();
        this.obstaculos = new ArrayList<>();
        this.pontuacao = 0;
    }

    // Método para iniciar o jogo
    public void iniciar() {
        System.out.println("Jogo iniciado!");
        for (Personagens personagem : personagens) {
            personagem.mover();
        }
    }

    // Método para adicionar personagens ao jogo
    public void adicionarPersonagem(Personagens personagem) {
        personagens.add(personagem);
        System.out.println("Personagem " + personagem.getNome() + " adicionado ao jogo.");
    }

    // Método para adicionar obstáculos
    public void adicionarObstaculo(Obstaculo obstaculo) {
        obstaculos.add(obstaculo);
        System.out.println("Obstáculo " + obstaculo.getTipo() + " adicionado ao jogo.");
    }

    // Método para atualizar a pontuação do jogo
    public void atualizarPontuacao(int pontos) {
        pontuacao += pontos;
        System.out.println("Pontuação atual: " + pontuacao);
    }

    // Métodos para manipulação de arquivos
    public void salvarPontuacao() {
        try (FileWriter writer = new FileWriter("pontuacao.txt")) {
            writer.write("Pontuação: " + pontuacao);
            System.out.println("Pontuação salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar pontuação: " + e.getMessage());
        }
    }

    public void carregarPontuacao() {
        try (BufferedReader reader = new BufferedReader(new FileReader("pontuacao.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar pontuação: " + e.getMessage());
        }
    }

    // Método para simular o jogo
    public void jogar() {
        iniciar();
        for (Personagens personagem : personagens) {
            personagem.pular();
            personagem.incrementarPontuacao(10);
        }
        salvarPontuacao();
    }
}
