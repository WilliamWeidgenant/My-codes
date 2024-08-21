import java.util.Scanner;
//Tabela e pesquisa de valores
public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double VetorReal[] = new double[50];
        int quantInse = 0;

        for(int i = 0; i < VetorReal.length; i++){
            System.out.println("Escolha uma opçãõ:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                if (quantInse >= 50) {
                System.out.println("Capacidade máxima atingida");
                }else{
                System.out.println("Inclua um valor");
                VetorReal[i] = teclado.nextDouble();
                System.out.println("Valor inseirdo na posição: " + quantInse);
                quantInse++;
                }
                    break;
                case 2:
                System.out.println("Pesquisa de um valor");
                double pesquisar = teclado.nextDouble();
                for(int j = 0; j < quantInse;){
                    j++;
                    if (VetorReal[j] == pesquisar){
                        System.out.println("Valor encontrado: " + VetorReal[j]);
                        break;
                    }else{
                        System.out.println("Valor não encontrado");
                        break;
                    }
                }
                    break;
                case 3:
                System.out.println("Digite o valor que deseja alterar");
                double alterar = teclado.nextDouble();
                    for(int j = 0; j < quantInse; j++){
                        if (VetorReal[j] == alterar) {
                            System.out.println("Digite o novo número");
                            double novovalor = teclado.nextDouble();
                            VetorReal[j] = novovalor;
                            break;
                        }else{System.out.println("Número não encotrado");}
                    }
                    break;
                case 4:
                System.out.println("Digite o valor que deseja excluir");
                double excluir = teclado.nextDouble();
                    for(int j = 0; j < quantInse; j++){
                        if (VetorReal[j] == excluir) {
                            VetorReal[j] = 0;
                            if (VetorReal[j] == 0) {
                                double aux;
                                for(int k = 0; k < quantInse;){
                                    k++;
                                    if (VetorReal[k+1]>0) {
                                        aux = VetorReal[k+1];
                                        VetorReal[k+1] = aux;
                                        
                                    }
                                }
                            }
                        }else{
                            System.out.println("Número não encotrado");
                            break;
                        }
                    }
                    break;
                case 5:
                System.out.println("Números do vetor");
                for(int j = 0; j < quantInse; j++){
                System.out.println(VetorReal[j]);
                if (VetorReal[j] == 0) {
                    break;
                }
                }  
                    break;
                case 6:
                double aux;
                for(int j = 0;j < quantInse; j++){
                    for(int k = 0; k < (quantInse -1); k++){
                        if (VetorReal[k] > VetorReal[k+1]) {
                            aux = VetorReal[k];
                            VetorReal[k] = VetorReal[k+1];
                            VetorReal[k+1] = aux;
                            if (VetorReal[j] == 0) {
                                break;
                            }
                        }
                    }
                }
                    break;
                case 7:
                double auxiliar;
                for(int j = 0;j < quantInse; j++){
                    for(int k = 0; k < (quantInse-1); k++){
                        if (VetorReal[k] < VetorReal[k+1]) {
                            auxiliar = VetorReal[k];
                            VetorReal[k] = VetorReal[k+1];
                            VetorReal[k+1] = auxiliar;
                        }
                    }
                }
                    break;
                case 8:
                    System.out.println("Fim do Programa");
                    i = 51;
                    break;
            
                default:
                System.out.println("Opção inválida");
                    break;
            }

        }
        
        
        teclado.close();
    }
}
