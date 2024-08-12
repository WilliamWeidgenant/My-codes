import java.util.Scanner;

public class Uni6Exe2 {
    public static void main(String[] args) {
        double vetorReal[] = new double [12];
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        System.out.println("Digite 12 números reais");
        for(int cont = 0; cont < vetorReal.length;cont++){
            vetorReal[cont] = teclado.nextDouble();
        }
        for(int cont = 0; cont < vetorReal.length;cont++){
            media += vetorReal[cont];
        }
        double mediafinal = media / vetorReal.length; 
        System.out.printf("Média dos valores: %.2f\n", mediafinal);
        System.out.println();
    System.out.println("Valores maiores que a media");
        for(int i = 0; i < vetorReal.length;i++){
            if (vetorReal[i]>mediafinal) {
                System.out.printf("%.2f\n", vetorReal[i]);
            }
        }


        teclado.close();
    }
}