package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> accountsList = new ArrayList<Conta>();
	int num = 0;

	@Override
	public void searchByAccNum(int num) {

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


	}

	@Override
	public void delete(int num) {


	}

	@Override
	public void withdraw(int num, float amount) {


	}

	@Override
	public void deposit(int num, float amount) {


	}

	@Override
	public void transfer(int senderNum, int receiverNum, float amount) {


	}
	
	public int generateNum() {
		return ++ num;
	}

}
