package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> accountsList = new ArrayList<Conta>();
	int accNum = 0;

	@Override
	public void searchByAccNum(int accNum) {
		var account = querryCollection(accNum);

		if (account != null) {
			account.visualize();
		} else {
			System.out.println("\nA conta de número " + accNum + "não foi encontrada");
		}

	}

	@Override
	public void listAll() {
		for (var account : accountsList) {
			account.visualize();
		}
	}

	@Override
	public void create(Conta account) {
		accountsList.add(account);
		System.out.println("\nA conta número " + account.getAccountNum() + " foi criada com sucesso!");

	}

	@Override
	public void update(Conta account) {
		var accSearch = querryCollection(account.getAccountNum());

		if (accSearch != null) {
			accountsList.set(accountsList.indexOf(accSearch), account);
			System.out.println("\nA conta número: " + account.getAccountNum() + " foi atualizada com sucesso!");
		} else {
			System.out.println("\nA conta número: " + account.getAccountNum() + " não foi encontrada");
		}

	}

	@Override
	public void delete(int accNum) {
		var account = querryCollection(accNum);

		if (account != null) {
			if (accountsList.remove(account) == true)
				System.out.println("\nA conta número: " + accNum + " oi deletada com sucesso!");
		} else {
			System.out.println("\nA conta número: " + accNum + " não foi encontrada");
		}

	}

	@Override
	public void withdraw(int accNum, float amount) {

		var account = querryCollection(accNum);
		if (account != null) {
			if (account.withdraw(amount) == true)
				System.out.println("\nO Saque na Conta numero: " + accNum + " foi efetuado com sucesso!");
		} else
			System.out.println("\nA Conta numero: " + accNum + " não foi encontrada!");

	}

	@Override
	public void deposit(int accNum, float amount) {

		var account = querryCollection(accNum);
		if (account != null) {
			account.deposit(amount);
			System.out.println("\nO Depósito na Conta numero: " + accNum + " foi efetuado com sucesso!");
		} else
			System.out.println(
					"\nA Conta numero: " + accNum + " não foi encontrada ou a Conta destino não é uma Conta Corrente!");

	}

	@Override
	public void transfer(int senderNum, int receiverNum, float amount) {

		var senderAcc = querryCollection(senderNum);
		var recieverAcc = querryCollection(receiverNum);
		if (senderAcc != null && recieverAcc != null) {
			if (senderAcc.withdraw(amount) == true) {
				recieverAcc.deposit(amount);
				System.out.println("\nA Transferência foi efetuada com sucesso!");
			}
		} else {
			System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
		}

	}

	public int generateNum() {
		return ++accNum;
	}

	public Conta querryCollection(int accNum) {
		for (var account : accountsList) {
			if (account.getAccountNum() == accNum) {
				return account;
			}
		}
		return null;
	}

}
