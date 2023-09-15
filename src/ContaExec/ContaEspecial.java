package ContaExec;

public class ContaEspecial extends ContaCorrente{

    private float limite;

    public ContaEspecial(float saldo, float limte){
        super(saldo);
        this.limite = limite;
    }

    @Override
    public float sacar(float valorSaque){
        if(valorSaque>this.saldo){
            float diferenca = valorSaque - this.saldo;
            this.saldo -= diferenca;
            float menosLimite = valorSaque - diferenca;
            return this.limite - menosLimite;
        }else{
            return this.saldo - valorSaque;
        }
    }
}
