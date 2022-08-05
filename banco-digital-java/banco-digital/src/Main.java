
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(500);
		
		
		Conta poupanca = new ContaPoupanca();
		cc.transferir(390, poupanca);
		
		
		cc.imprimirDados();
		poupanca.imprimirDados();

	}

}
