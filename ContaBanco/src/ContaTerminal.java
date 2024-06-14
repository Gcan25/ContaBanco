import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente = "Antonio Carlos";
        double saldoConta = 500.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta:  ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o número da agencia:  ");
        String numeroAgencia = scanner.next();

        System.out.println("Olá "  +nomeCliente+  " , obrigado por criar uma conta em nosso banco, sua agência é "  +numeroAgencia+  " , conta "  +numeroConta+  " e seu saldo R$ "  +saldoConta+  " já está disponível para saque ");


        


    }
}
