import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o n\u00FAmero da agencia:");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo é R$ "+ saldo + " já está disponível para saque");

        scanner.close();
    }
}
