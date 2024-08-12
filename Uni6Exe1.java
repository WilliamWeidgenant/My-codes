import java.util.Scanner;

public class Uni6Exe1 {
    public static void main(String[] args) {
        int vetorInteiro[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        for(int cont = 0; cont < 10; cont++){
            System.out.println("Digite um número: ");
            vetorInteiro[cont] = teclado.nextInt();
        }
        for(int cont = 9; cont >= 0; cont--){
            System.out.println("Número digitado: " + vetorInteiro[cont]);
        }

        teclado.close();
    }
}
