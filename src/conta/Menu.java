package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta.util.Designs;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int option;
		Designs.javaLogo();
		Designs.await();

		try {
			option = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\n Digite valores inteiros");
			scan.nextLine();
			option = 0;
		}

		// Teste da Classe Conta Corrente
		ContaCorrente cCorrenteTeste = new ContaCorrente("Nome do Cliente", 123456, 789, 01, 509.10f);
		cCorrenteTeste.visualize();
		cCorrenteTeste.withdraw(12000.0f);
		cCorrenteTeste.visualize();
		cCorrenteTeste.deposit(5000.0f);
		cCorrenteTeste.visualize();

		// Teste da Classe Conta Poupança
		ContaPoupanca cPoupancaTeste = new ContaPoupanca("Nome do Cliente", 123456, 789, 01, 509.10f, 15);
		cPoupancaTeste.visualize();
		cPoupancaTeste.withdraw(12000.0f);
		cPoupancaTeste.visualize();
		cPoupancaTeste.deposit(5000.0f);
		cPoupancaTeste.visualize();

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

			option = scan.nextInt();

			if (option == 0) {
				System.out.println("Encerrando");
				about();
				scan.close();
				System.exit(0);
			}

			switch (option) {

			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

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
