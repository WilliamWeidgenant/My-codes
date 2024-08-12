import java.util.Scanner;

public class Uni6Exe4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os valores dos vetores a e b");
        System.out.println("'a' é o primeiro valor e 'b' o segundo");
        for(int i = 0; i<a.length;i++){
            a[i] = teclado.nextInt();
            b[i] = teclado.nextInt();
        }
        int c[] = new int[10];
        for(int i = 0; i<a.length;i++){
        c[i] = a[i] + b[i];
        }
        System.out.println("Resultado");
        System.out.println("[i] :\t a \t b \t c");
        for(int i = 0; i<a.length;i++){
            System.out.printf("[%d] :\t %d \t %d \t %d\n", i, a[i],b[i],c[i]);
        }

        teclado.close();
    }
}
