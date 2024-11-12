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
		
		if(account != null) {
			account.visualize();
		}else {
			System.out.println("\nA conta de número "+accNum+"não foi encontrada");
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
		
		if(accSearch != null) {
			accountsList.set(accountsList.indexOf(accSearch), account);
			System.out.println("\nA conta número: "+account.getAccountNum()+" foi atualizada com sucesso!");
		}else {
			System.out.println("\nA conta número: "+account.getAccountNum()+" não foi encontrada");
		}

	}

	@Override
	public void delete(int accNum) {

	}

	@Override
	public void withdraw(int accNum, float amount) {

	}

	@Override
	public void deposit(int accNum, float amount) {

	}

	@Override
	public void transfer(int senderNum, int receiverNum, float amount) {

	}

	public int generateNum() {
		return ++accNum;
	}
	
	public Conta querryCollection(int accNum) {
		for (var account : accountsList) {
			if(account.getAccountNum() == accNum) {
				return account;
			}
		}
		return null;
	}

}
