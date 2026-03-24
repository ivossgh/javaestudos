import java.util.Scanner;

public class MenuNubank {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("DIgite o usuario");
        String nome = teclado.nextLine();

        Nubank user = new Nubank(nome, 1000);
        int escolha;

        do{
            System.out.println(" - - Nubank - - ");
            System.out.println("Escolha uma opcao");
            System.out.println("1 - Depositar ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Saldo ");
            System.out.println("4 - Sair ");
            escolha = teclado.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite o valor a depositar");
                    double dep = teclado.nextDouble();
                    user.depositar(dep);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar");
                    double saque = teclado.nextDouble();
                    user.sacar(saque);
                    break;
                case 3:
                    System.out.println("Usuario da conta: " + user.getUsuario());
                    System.out.println("Saldo da conta: " + user.getSaldo());
                    break;
                case 4:
                    System.out.println("encerrando");
                    break;
                default:
                    System.out.println("Opcao Invalida, tente novamente");
            }

        }while(escolha !=4);
    }
}