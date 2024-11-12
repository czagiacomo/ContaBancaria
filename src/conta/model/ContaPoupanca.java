package conta.model;

public class ContaPoupanca extends Conta{
	
	private int birthday;

	public ContaPoupanca(String accountHolder, int accountNum, int agency, int type, float balance, int birthday) {
		super(accountHolder, accountNum, agency, type, balance);
		this.birthday = birthday;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int aniversario) {
		this.birthday = aniversario;
	}

	@Override
	public void visualize() {
		super.visualize();
		System.out.println("Aniversário da conta: " + this.birthday);
	}

}
