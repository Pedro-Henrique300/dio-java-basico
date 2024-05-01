import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        String agencia;
        int numero;
        double saldo;

        System.out.println("Informe seu nome: ");
        nome = leitura.nextLine();
        System.out.println("Informe sua agência: ");
        agencia = leitura.nextLine();
        System.out.println("Informe seu numero: ");
        numero = leitura.nextInt();
        System.out.println("Informe seu saldo: ");
        saldo = leitura.nextDouble();

        System.out.printf("""
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é
                %s, conta %d e seu saldo R$%.2f já está disponível para saque.%n""", nome, agencia, numero, saldo);
    }
}