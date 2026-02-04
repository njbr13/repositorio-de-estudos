
import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoTerminal {
    

    public static void main(String[] args) {
        int Numeroconta;
        String Agência;
        String Nomecliente;
        Double saldo;

       try(Scanner scanner = new Scanner(System.in)){

        System.out.println("Seja Bem Vindo ao seu Banco Master.\n");
        System.out.println("Para criar sua conta, digite as informações pedidas abaixo.\n");
        
        System.out.print("Digite seu nome: ");
        Nomecliente = scanner.nextLine();

        System.out.print("Digite sua Agência: ");
        Agência = scanner.nextLine();

        System.out.print("Digite sua Conta: ");
        Numeroconta = scanner.nextInt();

        System.out.print("Digite quanto deseja guardar na sua conta: ");
        saldo = scanner.nextDouble();

        System.out.println("\nConta Criada. Veja suas informações abaixo: \n");
        System.out.println("Nome do Titular da conta:" +Nomecliente);
        System.out.println("Numero da Agência:" +Agência);
        System.out.println("Numero da Conta:" +Numeroconta);
        System.out.println("Saldo da Conta:" +saldo);

        Saque saque = new Saque();


        System.out.println("Escolha uma das opçoes abaixo:");
        System.out.println("Digite 1 para sacar ou 0 para sair.");
        int escolha;

        try {
            escolha = scanner.nextInt();
            switch (escolha) {
            case 1 -> {
                saque.CalcularSaldo(saldo);
            }    
            case 0 -> {
                System.out.println("Saindo de sua conta.");
            }
            default -> throw new IllegalArgumentException("Escolha 0 ou 1");
            }  
        }catch (InputMismatchException | IllegalArgumentException e) {
            throw new IllegalArgumentException ("Escolha 0 ou 1", e);
        }
        
        }
    }
}
