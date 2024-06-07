package Repository;

public interface IContaRepository {

    void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IContaRepository contaDestino);
	
	void imprimirExtrato();

}
