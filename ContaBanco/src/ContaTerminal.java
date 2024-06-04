import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, bem vindo a essa agencia bancaria!");
        System.out.println("Você deseja criar uma conta bancária? (sim/não)");

        String resposta = scanner.nextLine().trim().toLowerCase();

        switch (resposta) {
            case "sim":
              CriarContaUsuario(scanner);
                break;            
               
                default:
                
                System.out.println("Muito Obrigado Pela Sua Atenção!");
                break;
        
            }
            
            
        }

        private static void CriarContaUsuario (Scanner scanner){
            System.out.println("Por Favor, Digite o numero da Sua Conta exemplo(XXXX): ");
            int numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Por favor, Informe o numero da agencia exemplo(XXXX-X):  ");
            String agencia = scanner.next();
            scanner.nextLine(); 

            System.out.println("Por favor, Informe seu nome Completo: ");
            String NomeCliente = scanner.nextLine();

            System.out.println("Por favor, Insira o saldo de sua conta exemplo(XXX.xx): ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Olá " + NomeCliente + " Obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " ja está disponível para saque!");
            
        }
}
