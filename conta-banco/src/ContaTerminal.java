import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = teclado.nextInt();
        teclado.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = teclado.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = teclado.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo =  Double.parseDouble(teclado.nextLine());
        
        teclado.close();
        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
