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

		int option, agency, type, birthday, accNum, receiverNum;
		String accountHolder;
		float balance, limit, amount;

		while (true) {
			Designs.menu();

			try {
				option = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros");
				scan.nextLine();
				option = 0;
			}

			if (option == 0) {
				System.out.println("\nEncerrando...");
				Designs.javaLogo();
				Designs.about();
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
				} while (type < 1 && type > 2);
				System.out.println("Digite o Saldo da Conta (R$): ");
				balance = scan.nextFloat();
				switch (type) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limit = scan.nextFloat();
					accounts.create(
							new ContaCorrente(accountHolder, accounts.generateNum(), agency, type, balance, limit));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					birthday = scan.nextInt();
					accounts.create(
							new ContaPoupanca(accountHolder, accounts.generateNum(), agency, type, balance, birthday));
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

				System.out.println("Digite o número da conta: ");
				accNum = scan.nextInt();

				accounts.searchByAccNum(accNum);

				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n");
				System.out.println("Atualizar dados da Conta\n\n");
				System.out.println("Digite o número da conta: ");
				accNum = scan.nextInt();
				var accSearch = accounts.querryCollection(accNum);
				if (accSearch != null) {
					type = accSearch.getType();
					System.out.println("Digite o Número da Agência: ");
					agency = scan.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					scan.skip("\\R?");
					accountHolder = scan.nextLine();
					System.out.println("Digite o Saldo da Conta (R$): ");
					balance = scan.nextFloat();
					switch (type) {
					case 1 -> {
						System.out.println("Digite o limite de Crédito (R$): ");
						limit = scan.nextFloat();
						accounts.update(new ContaCorrente(accountHolder, accNum, agency, type, balance, limit));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						birthday = scan.nextInt();
						accounts.update(new ContaPoupanca(accountHolder, accNum, agency, type, balance, birthday));
					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					}
				} else {
					System.out.println("A Conta não foi encontrada!");
				}

				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n");
				System.out.println("Digite o número da conta: ");
				accNum = scan.nextInt();

				accounts.delete(accNum);

				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n");

				System.out.println("Digite o Numero da conta: ");
				accNum = scan.nextInt();
				do {
					System.out.println("Digite o Valor do Saque (R$): ");
					amount = scan.nextFloat();
				} while (amount <= 0);
				accounts.withdraw(accNum, amount);

				keyPress();
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n");

				System.out.println("Digite o Numero da conta: ");
				accNum = scan.nextInt();
				do {
					System.out.println("Digite o Valor do Depósito (R$): ");
					amount = scan.nextFloat();
				} while (amount <= 0);
				accounts.deposit(accNum, amount);

				keyPress();
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n");

				System.out.println("Digite o Numero da Conta de Origem: ");
				accNum = scan.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				receiverNum = scan.nextInt();
				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					amount = scan.nextFloat();
				} while (amount <= 0);
				accounts.transfer(accNum, receiverNum, amount);

				keyPress();
				break;

			case 9:
				System.out.println("Criar contas de Teste");

				ContaCorrente cc1 = new ContaCorrente("João da Silva", accounts.generateNum(), 123, 1, 1000f, 100.0f);
				accounts.create(cc1);
				ContaCorrente cc2 = new ContaCorrente("Maria da Silva", accounts.generateNum(), 124, 1, 2000f, 100.0f);
				accounts.create(cc2);
				ContaPoupanca cp1 = new ContaPoupanca("Mariana dos Santos", accounts.generateNum(), 125, 2, 4000f, 12);
				accounts.create(cp1);
				ContaPoupanca cp2 = new ContaPoupanca("Juliana Ramos", accounts.generateNum(), 125, 2, 8000f, 15);
				accounts.create(cp2);

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}

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
