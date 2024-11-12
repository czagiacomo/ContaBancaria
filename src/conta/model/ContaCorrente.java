package conta.model;

public class ContaCorrente extends Conta {

	private float balance;

	public ContaCorrente(String accountHolder, int accountNum, int agency, int type, float balance) {
		super(accountHolder, accountNum, agency, type, balance);
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public boolean withdraw(float amount) {

		if (this.getBalance() + this.getBalance() < balance) {
			System.out.println("\nSaldo Insuficiente!");
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}

	@Override
	public void visualize() {
		super.visualize();
		System.out.println("Limite de Crédito: " + this.balance);
	}

}
