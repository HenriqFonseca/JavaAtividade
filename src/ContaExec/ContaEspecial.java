package ContaExec;


import java.io.IOException;

public class ContaEspecial extends ContaCorrente{

    private float limite;

    public ContaEspecial(float saldo, float limite){
        super(saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float sacar(float valorSaque){
        if(valorSaque>(this.limite+this.saldo)){
            return 01;
        }
        else if(valorSaque>this.saldo){
            float diferenca = valorSaque - this.saldo;
            float novoSaldo = (this.saldo - valorSaque) + diferenca;
            this.setSaldo(novoSaldo);

            float novoLimite = this.limite - diferenca;
            this.setLimite(novoLimite);
            return novoSaldo;
        }else{
            float novoSaldo = this.saldo - valorSaque;
            this.setSaldo(novoSaldo);
            return novoSaldo;
        }
    }
}
