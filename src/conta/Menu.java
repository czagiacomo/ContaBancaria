package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta.util.Designs;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		ContaController accounts = new ContaController();

		Scanner scan = new Scanner(System.in);

		int option, agency, type, birthday;
		String accountHolder;
		float balance, limit;
		
		System.out.println("\nCriar Contas\n");
		
		ContaCorrente cc1 = new ContaCorrente("João da Silva", accounts.generateNum(), 123, 1, 1000f, 100.0f);
		accounts.create(cc1);
		ContaCorrente cc2 = new ContaCorrente("Maria da Silva", accounts.generateNum(), 124, 1, 2000f, 100.0f);
		accounts.create(cc2);
		ContaPoupanca cp1 = new ContaPoupanca("Mariana dos Santos", accounts.generateNum(), 125, 2, 4000f, 12);
		accounts.create(cp1);
		ContaPoupanca cp2 = new ContaPoupanca("Juliana Ramos", accounts.generateNum(), 125, 2, 8000f, 15);
		accounts.create(cp2);
		
		accounts.listAll();

		Designs.javaLogo();
		Designs.await();

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				option = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\n Digite valores inteiros");
				scan.nextLine();
				option = 0;
			}

			if (option == 0) {
				System.out.println("Encerrando");
				about();
				scan.close();
				System.exit(0);
			}
			
			switch (option) {

			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta \n");  
				System.out.println("Digite o Numero da Agência: ");  
				agency = scan.nextInt();  
				System.out.println("Digite o Nome do Titular: ");  
				scan.skip("\\R?");  
				accountHolder = scan.nextLine();  
				do {  
				    System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");  
				    type = scan.nextInt();  
				}while(type < 1 && type > 2);  
				System.out.println("Digite o Saldo da Conta (R$): ");  
				balance = scan.nextFloat();  
				switch(type) {  
				    case 1 -> {  
				        System.out.println("Digite o Limite de Crédito (R$): ");  
				        limit = scan.nextFloat();  
				        accounts.create(new ContaCorrente(accountHolder, accounts.generateNum(), agency, type, balance, limit));  
				    }  
				    case 2 -> {  
				        System.out.println("Digite o dia do Aniversario da Conta: ");  
				        birthday = scan.nextInt();  
				        accounts.create(new ContaPoupanca(accountHolder, accounts.generateNum(), agency, type, balance, birthday));  
				    }  
				}  
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n");
				accounts.listAll();
				keyPress();

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}

	}

	public static void about() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Catharina Zagiacomo");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
