package conta.model;

public class ContaCorrente extends Conta {

	private float limit;

	public ContaCorrente(String accountHolder, int accountNum, int agency, int type, float balance, float limit) {
		super(accountHolder, accountNum, agency, type, balance);
		this.limit = limit;
	}

	public float getBalance() {
		return limit;
	}

	public void setBalance(float limit) {
		this.limit = limit;
	}

	@Override
	public boolean withdraw(float amount) {

		if (this.getBalance() + this.getBalance() < limit) {
			System.out.println("\nSaldo Insuficiente!");
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}

	@Override
	public void visualize() {
		super.visualize();
		System.out.println("Limite de Crédito: " + this.limit);
	}

}
