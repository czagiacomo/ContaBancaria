package conta.model;

public class Conta {

	private String accountHolder;
	private int accountNum;
	private int agency;
	private int type;
	private float balance;
	
	public Conta(String accountHolder, int accountNum, int agency, int type, float balance) {
		this.accountHolder = accountHolder;
		this.accountNum = accountNum;
		this.agency = agency;
		this.type = type;
		this.balance = balance;
	}



	public String getAccountHolder() {
		return accountHolder;
	}



	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}



	public int getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}



	public int getAgency() {
		return agency;
	}



	public void setAgency(int agency) {
		this.agency = agency;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}



	public boolean withdraw(float valor) {
		if(this.getBalance() < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		
		this.setBalance(this.getBalance() - valor);
		return true;
	}
	
	public void deposit(float valor) {
		this.setBalance(this.getBalance() + valor);
	}
	
	public void visualize() {

		String type = "";
		
		switch(this.type) {
		case 1:
			type = "Conta Corrente";
		break;
		case 2:
			type = "Conta Poupança";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.accountNum);
		System.out.println("Agência: " + this.agency);
		System.out.println("Tipo da Conta: " + type);
		System.out.println("Titular: " + this.accountHolder);
		System.out.println("Saldo: " + this.balance);

	}
}
