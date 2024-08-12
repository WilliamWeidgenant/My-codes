import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        int menu, diarias, encerrados = 0;
        double valor = 0;
        String hospede;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleciona uma das seguintes opções:");
        System.out.println("(1) encerrar a conta de um hóspede;");
        System.out.println("(2) verificar número de contas encerradas;");
        System.out.println("(3) sair.");
        menu = teclado.nextInt();
        do{
            if (menu == 1) {
                encerrados++;
                System.out.println("Digite o nome do hospede");
                hospede = teclado.next();
                System.out.println("Digite o número de diarias");
                diarias = teclado.nextInt();
                if (diarias < 15) {
                    valor = (diarias * 50) + (diarias * 7.5);
                }else if (diarias == 15) {
                    valor = (diarias * 50) + (diarias * 6.5);
                }else if (diarias > 15) {
                    valor = (diarias * 50) + (diarias * 5);
                }
                System.out.println("Hospede: "+ hospede);
                System.out.printf("Valor a ser pago: %.2f%n", valor);
            }else{
                System.out.println("Número de contas encerradas: "+ encerrados);
            }
            System.out.println();
            System.out.println("Seleciona uma das seguintes opções:");
            System.out.println("(1) encerrar a conta de um hóspede;");
            System.out.println("(2) verificar número de contas encerradas;");
            System.out.println("(3) sair.");
            menu = teclado.nextInt();
        }while (menu != 3);
        teclado.close();
    }
}