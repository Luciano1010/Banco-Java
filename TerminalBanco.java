import Model.Cliente;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;

public class TerminalBanco {
    public static void main(String[] args) {
        Cliente luciano = new Cliente();
        luciano.setNome("Luciano Simões");

        Conta cc = new ContaCorrente(luciano);
        Conta poupanca = new ContaPoupanca(luciano);
    

        
        cc.depositar(100);
        cc.sacar(200);


        poupanca.imprimirExtrato();
       

    }
}
