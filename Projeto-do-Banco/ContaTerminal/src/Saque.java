
import java.util.Scanner;

public class Saque {

    Scanner scanner = new Scanner(System.in);

    
    void CalcularSaldo(double saldo){

        double valorSolicitado;
        System.out.println("Quanto deseja sacar?");
        valorSolicitado = scanner.nextDouble();
        
        if(valorSolicitado > saldo){
            System.out.println("Não será possivel efetuar esse saque. O valor foi maior que o seu saldo.");
        }else{
            saldo -= valorSolicitado;
        }

        System.out.println("Seu novo saldo agora é de:" +saldo);

        

    }
}
