import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do Titular: ");
        String nome = teclado.nextLine();

        Conta conta = new Conta(nome, 1000);
        int escolha;
        do{
            System.out.println(" - - Nubank - - ");
            System.out.println("Escolha uma opcao ");
            System.out.println("1 - Depositar ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Saldo ");
            System.out.println("4 - Sair ");

            escolha = teclado.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Valor a depositar");
                    double dep = teclado.nextDouble();
                    conta.depositar(dep);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque");
                    double saq = teclado.nextDouble();
                    conta.sacar(saq);
                    break;
                case 3:
                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Titular: " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("encerrando...");
                default:
                    System.out.println("opcao invalida");
            }
        }while (escolha !=4);

    }
}