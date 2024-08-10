public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(500);
        Conta contPoupanca = new ContaPoupanca();
        contaCorrente.transferir(290, contPoupanca);
        
        contaCorrente.imprimirExtrato();
        contPoupanca.imprimirExtrato();
    }
}
