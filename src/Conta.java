public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Usuario titular;

    public Conta(String numero, double saldoInicial, Usuario titular) {
        this.numero = numero;
        this.saldo = saldoInicial; 
        this.titular = titular;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) { 
            saldo += quantia;
        }
    }

    public boolean sacar(double quantia) {
        if (quantia > 0 && saldo >= quantia) {
            saldo -= quantia;
            return true;
        }
        return false;
    }

    public boolean transferir(double quantia, Conta contaDestino) {
        if (sacar(quantia)) {
            contaDestino.depositar(quantia);
            return true;
        }
        return false;
    }
}
