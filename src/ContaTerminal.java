import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		Integer numero;
		String agencia;
		String nomeCliente;
		Double saldo = 237.48;
		
		System.out.println("Por favor, digite o numero da Agência!");
		agencia = sc.next();
		
		System.out.println("Por favor, informe o numero da conta");
		numero = sc.nextInt();
		
		System.out.println("Por favor informe o nome do cliente");
		nomeCliente = sc.next();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por cria uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$: " + saldo + " já disponivel para saque ");
		
		
		sc.close();

	}

}
