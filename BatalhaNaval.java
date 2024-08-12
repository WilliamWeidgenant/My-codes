import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[8][8];
        int naviosRestantes = 10;
        int tentativas = 30;

        // Inicializa o tabuleiro com água (~)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        // Distribui os navios aleatoriamente
        Random random = new Random();
        for (int n = 0; n < 10; n++) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            if (tabuleiro[linha][coluna] == '~') {
                tabuleiro[linha][coluna] = 'N'; // 'N' representa um navio
            } else {
                n--; // Tenta novamente se a posição já estiver ocupada
            }
        }

        Scanner jogada = new Scanner(System.in);

        while (naviosRestantes > 0 && tentativas > 0) {
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Informe a linha (0-7): ");
            int linha = jogada.nextInt();
            System.out.print("Informe a coluna (0-7): ");
            int coluna = jogada.nextInt();
            
            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println("Coordenadas incorretas! Tente novamente.");
                tentativas++;
            }else if (tabuleiro[linha][coluna] == 'X') {
                System.out.println("Você já atacou essa posição!");
            } else if (tabuleiro[linha][coluna] == 'O') {
                System.out.println("Você já atacou essa posição e errou!");
            } else if (tabuleiro[linha][coluna] == 'N') {
                System.out.println("Você acertou um navio!");
                naviosRestantes--;
                tabuleiro[linha][coluna] = 'X';
            } else {
                System.out.println("Você errou!");
                tabuleiro[linha][coluna] = 'O';
            }

            // Imprime o tabuleiro após cada jogada
                    for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == 'N') {
                    System.out.print("~ "); // Não mostra os navios
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

            tentativas--;
        }

        if (naviosRestantes == 0) {
            System.out.println("Parabéns! Você ganhou!");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();
                }
            }else {
                System.out.println("Suas tentativas acabaram. Tente novamente!");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                            System.out.print(tabuleiro[i][j] + " ");
                        }
                        System.out.println();
                }
            }
                System.out.println();
                jogada.close();

            }
        } 