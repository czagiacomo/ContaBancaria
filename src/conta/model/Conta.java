package conta.model;

public class Conta {

	private String titular;
	private int numConta;
	private int agencia;
	private int tipo;
	private float saldo;

	public Conta(String titular, int numConta, int agencia, int tipo, float saldo) {
		this.titular = titular;
		this.numConta = numConta;
		this.agencia = agencia;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public void Imprimir() {

		System.out.println("\nTitular: " + titular);
		System.out.println("Número da conta: " + numConta);
		System.out.println("Agência: " + agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Saldo Atual: " + saldo);

	}

}
