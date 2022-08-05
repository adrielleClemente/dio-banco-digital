
public interface IConta {
	
	
	public void depositar(double valor);
	
	public void transferir(double valor, Conta contaDestino);

	void sacar(double valor);
	
	void imprimirExtrato();

}
