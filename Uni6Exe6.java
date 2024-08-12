import java.util.Scanner;

public class Uni6Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        double real;
        System.out.println("Digite um valor inteiro");
        n = teclado.nextInt();

        double vetorReal[] = new double[n];
        for(int i = 0;i <= vetorReal.length-1; i++){
            System.out.println("Digite um valor real");
            vetorReal[i] = teclado.nextDouble();
        }
        System.out.println("Digite um valor real");
        real = teclado.nextDouble();
        for(int j = 0; j <= vetorReal.length-1; j++){
            if (vetorReal[j] == real) {
                System.out.println("O número informado está na lista: " + vetorReal[j]);
            }
        }

    teclado.close();        
    }
}