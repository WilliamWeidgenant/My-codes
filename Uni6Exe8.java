import java.util.Scanner;

public class Uni6Exe8 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n;
    System.out.println("Digite um valor inteiro entre 1 e 20");
    n = teclado.nextInt();
    while (n < 1 || n > 20) {
        System.out.println("Valor inválido");
        System.out.println("Digite um valor inteiro entre 1 e 20");
        n = teclado.nextInt();
    }

    double vetorReal[]= new double[n];
    for(int i = 0; i < vetorReal.length; i++){
        System.out.println("Digite um número real");
        vetorReal[i] = teclado.nextDouble();
    }
    
    double vetorFinal[][] = new double[n][2];
    int cont = 0;
    int quantDif = 0;
    for(int i = 0; i < vetorReal.length; i++){
        double valoratual = vetorReal[i];
        cont = 0;
        for(int c = i; c < vetorReal.length; c++){
            if (vetorReal[c] == valoratual && valoratual != Double.MAX_VALUE) {
                cont++;
                vetorReal[c] = Double.MAX_VALUE;
            }
        }
        if (cont > 0) {
            vetorFinal[quantDif][0] = valoratual;
            vetorFinal[quantDif][1] = cont;
            quantDif++;
        }
        System.out.println("VALOR\tFREQUENCIA");
        for(int e = 0; e <quantDif;e++){
            System.out.printf("%.1f\t%.0f\n",vetorFinal[e][0],vetorFinal[e][1]);
        }
    }

    teclado.close();
}
}
