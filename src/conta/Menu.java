package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Nome do Titular", 123, 456, 02, 500.50f);
		Conta conta2 = new Conta("Nome do Cliente", 0123, 0456, 01, 800.70f);

		conta1.Imprimir();
		conta2.Imprimir();	
		
	}

}
