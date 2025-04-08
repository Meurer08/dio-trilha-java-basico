package app;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
		Conta conta = new Conta(600);

    	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    	int comando; 
    	 
    	do {
    		System.out.println("-----------MENU-----------");
    		System.out.println("Digite uma opção:");
    		System.out.println("5 - Consultar Saldo");				// Saldo atual da conta (Caso valor do cheque especial seja usado, ficará o débito na conta)
    		System.out.println("4 - Consultar Cheque Especial");		// Mostra a quantidade disponibilizada, usada e livre para uso
    		System.out.println("3 - Depositar Dinheiro");				// Deposita na conta
    		System.out.println("2 - Sacar Dinheiro");					// Saca priorizando o saldo em conta, caso não tenha saldo, utiliza o cheque especial
    		System.out.println("1 - Pagar Boleto");					// Não específicado direito no exercício, então apliquei a mesma lógica do saque 
    		System.out.println("0 - Sair");
    		System.out.println("--------------------------");
    		comando = scanner.nextInt();
			scanner.nextLine();
			System.out.println("--------------------------");
			switch (comando) {
				case 0:
					break;
				case 1:
					System.out.println("Digite o valor de Saque: ");
					double valorBoleto = scanner.nextDouble();
					conta.depositar(valorBoleto);
					scanner.nextLine();
					break;
				case 2:
					System.out.println("Digite o valor de Saque: ");
					double valorSaque = scanner.nextDouble();
					conta.sacar(valorSaque);
					scanner.nextLine();
					break;
				case 3:
					System.out.println("Digite o valor a ser depositado: ");
					double valorDeposito = scanner.nextDouble();
					conta.depositar(valorDeposito);
					scanner.nextLine();
					break;
				case 4:
					conta.chequeEspecialInfo();
					break;
				case 5:
					conta.getSaldo();
					break;
				default:
					System.out.println("Comando Inválido");
					comando = -1;
			}
			System.out.println("Tecle Enter para continuar...");
    		scanner.nextLine();

    	} while (comando != 0);


    }
}
