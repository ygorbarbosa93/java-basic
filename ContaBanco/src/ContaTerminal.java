import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner conta = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        final double saldo = 500.00;

        System.out.println("Olá, qual o seu nome?");
        nomeCliente = conta.next();

        System.out.println(nomeCliente + " por favor digite o numero da Agência:");
        agencia = conta.nextLine();

        System.out.println("Informe o numero da sua conta:");
        numero = conta.nextInt();

        System.out.println("..... ...... ..... ......");
        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é"
                + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
