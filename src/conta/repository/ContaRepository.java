package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	public void searchByAccNum(int num);
	public void listAll();
	public void create(Conta conta);
	public void update(Conta conta);
	public void delete(int num);
	

	public void withdraw(int num, float amount);
	public void deposit(int num, float amount);
	public void transfer(int senderNum, int receiverNum, float amount);

}