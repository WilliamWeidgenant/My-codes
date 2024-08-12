import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        int voto;
        double totalvotos = 0,voto1 = 0,voto2 = 0,voto3 = 0,voto4 = 0,voto5 = 0,voto6 = 0, totalvotosnb;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu voto(1, 2, 3, 4, 5 ou 6)");
        voto = teclado.nextInt();
        while (voto>6){
            System.out.println("Opção incorreta");
            System.out.println("Digite seu voto(1, 2, 3, 4, 5 ou 6)");
        voto = teclado.nextInt();
        }
        do{
            totalvotos++;
            switch (voto) {
                case 1:
                voto1++;
                    break;
                case 2:
                voto2++;
                    break;
                case 3:
                voto3++;
                    break;
                case 4:
                voto4++;
                    break;
                case 5:
                voto5++;
                    break;
                case 6:
                voto6++;
                    break;
            
                default:
                    break;
            }
            System.out.println("Digite seu voto(1, 2, 3, 4, 5 ou 6)");
            voto = teclado.nextInt();
            while (voto>6){
                System.out.println("Opção incorreta");
                System.out.println("Digite seu voto(1, 2, 3, 4, 5 ou 6)");
            voto = teclado.nextInt();
            }
        }while (voto != 0);
        System.out.println("O total de votos para o candidato 1 foi: "+ voto1);
        System.out.println("O total de votos para o candidato 2 foi: "+ voto2);
        System.out.println("O total de votos para o candidato 3 foi: "+ voto3);
        System.out.println("O total de votos para o candidato 4 foi: "+ voto4);
        System.out.println("Total de votos nulos:" + voto5);
        System.out.println("Total de votos em branco: " + voto6);
        totalvotosnb = ((voto5+voto6)/totalvotos)*100;
        System.out.println("O percentual de votos branco e nulos foi de: " + totalvotosnb + "%");
        
        teclado.close();
    }
}
