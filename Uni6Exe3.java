import java.util.Scanner;

public class Uni6Exe3 {
    public static void main(String[] args) {
                double vetorReal[] = new double [12];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 12 números reais");
        for(int cont = 0; cont < vetorReal.length;cont++){
            vetorReal[cont] = teclado.nextDouble();
        }
        for(int i = 0; i < vetorReal.length;i++){
            if (i%2 == 0) {
                //par
                vetorReal[i] += vetorReal[i]*2/100;
            }else{
                //impar
                vetorReal[i] += vetorReal[i]*5/100;
            }
        }
        System.out.println("Resultado");
        for(int i = 0; i<vetorReal.length;i++){
            System.out.printf("Valor[%d] = %.2f\n",i, vetorReal[i]);
        }


        teclado.close();
    }
}
