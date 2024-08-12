import java.util.Scanner;

public class Uni6Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respostaV[][] = new int[30][3];
        String perguntaV[] = new String [3];
        //iniciar vetor
        perguntaV[0] = "Qual seu sexo?";
        perguntaV[1] = "Que nota você da para o cinema?";
        perguntaV[2] = "Qual a sua idade?";

        for(int i = 0; i < 30; i++){
            for(int c = 0; c < 3; c++){
                System.out.println("Respondente "+(i+1) + " Pergunta " + (c+1) + " " + perguntaV[c]);
                respostaV[i][c] = teclado.nextInt();
            }
        }
        //nota media
        double soma = 0.0;
        for(int i = 0;i <30; i++){
            soma = soma + respostaV[i][1];
        }
        double media = soma / 30;
        System.out.println();
        System.out.println("Nota média total: " + media);
        System.out.println();
        //nota media dos homens
        double h = 0.0;
        double somaH = 0.0;
        for(int i = 0;i <30; i++){
            if (respostaV[i][0] == 2) {
                somaH = somaH + respostaV[i][1];
                h++;
            }
        }
        double mediaH = 0.0;
        if (h > 0) {
            mediaH = somaH/ h;
            System.out.println("Media das notas dos homens: " + mediaH);
            System.out.println();
        }else{
            System.out.println("Não houve homens respodentes");
        }
        //nota mulher mais jovem
        int menorIdade = 999;
        int indiceMenorIdade = -1;
        for(int i = 0;i < 30; i++){
            if (respostaV[i][0] == 1 && respostaV[i][2] <menorIdade) {
                indiceMenorIdade = i;
                menorIdade = respostaV[i][2];
            }
        }
        if (indiceMenorIdade >= 0) {
            System.out.println("Nota da mulher mais jovem: " + respostaV[indiceMenorIdade][1]);
            System.out.println("Idade da mulher mais jovem: " + respostaV[indiceMenorIdade][2]);
            System.out.println();
        }else{
            System.out.println("Não houve mulher respodente");
            System.out.println();
        }
        //quantidade de mulheres acima de 50 anos com nota acima da media
        int quantMais50 = 0;
        for(int i = 0; i < 30; i++){
            if ((respostaV[i][0] == 1 && respostaV[i][2] > 50 && respostaV[i][3] > media)) {
                quantMais50++;
            }
        }
        if (quantMais50 > 0) {
            System.out.println("Quantidade de mulheres acima dos 50 anos que deram nota acima da média:" + quantMais50);
        }else{
            System.out.println("Não houve mulheres com mais de 50 anos que deram nota acima da média :C");
        }
        //fim do programa
        teclado.close();
    }
}
