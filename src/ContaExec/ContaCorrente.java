package ContaExec;

public class ContaCorrente {

    protected float saldo;

    public ContaCorrente(){}

    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float depositar(float valorDeposito ){
        return this.saldo += valorDeposito;
    }

    public float sacar(float valorSaque){
        return this.saldo - valorSaque;
    }

    public boolean transferir(boolean contacorrente){
        return true;
    }

    @Override
    public String toString() {
        return "\n Saldo: " + this.saldo;
    }
}
