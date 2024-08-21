import java.util.Scanner;
//tinder que falhou ou tinder 0.5
public class Uni6Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respostashomem[] = new String[5];
        String respostasmulher[] = new String[5];
        String perguntas[] = {"Gosta de ler?","Gosta de redes sociais?","É uma pessoa religiosa?","Gosta de música?","Gosta de jogos?"};
        int afinidade = 0;

        System.out.println("Respostas do homem(SIM,NÃO OU IND (INDIFERENTE))");
        for(int i = 0; i < respostashomem.length;i++){
            System.out.println(perguntas[i]);
            respostashomem[i] = teclado.next().toUpperCase();
        }
        System.out.println("Respostas da mulher");
        for(int i = 0; i < respostasmulher.length;i++){
            System.out.println(perguntas[i]);
            respostasmulher[i] = teclado.next().toUpperCase();
        }
        for(int i = 0; i<perguntas.length;i++){
            if (respostashomem[i] == respostasmulher[i]) {
                afinidade +=3;
            }else if (respostashomem[i] == "IND" || respostasmulher[i] == "IND"){
                afinidade +=1;
            }else{
                afinidade -= 2;
            }
            }
            if (afinidade == 15) {
                System.out.println("CASEM!");
            }else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
            }else if (afinidade >= 5 && afinidade <= 9) {
               System.out.println("Talvez não dê certo :("); 
            }else if (afinidade >= 0 && afinidade <= 4) {
                System.out.println("Vale um encontro.");
            }else if (afinidade >= -1 && afinidade <= -9) {
                System.out.println("Melhor não perder tempo");
            }else if (afinidade == -10) {
                System.out.println("Vocês se odeiam!");
            }else{
                System.out.println("Erro de programação");
            }
    
            teclado.close();
        }
    }
