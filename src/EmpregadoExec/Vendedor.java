package EmpregadoExec;

public class Vendedor extends Empregado{
    private float percentualComissao;
    Vendedor(){}
    Vendedor(float comissao, String nome, float salario){
        super(nome,salario);
        this.percentualComissao = comissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentual) {
        this.percentualComissao = percentual;
    }

    public float calcularSalario(float percentualComissao){
        return this.salario + this.percentualComissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão: " + this.percentualComissao
                + "\nSalario sem comissão: " + this.salario
                + "\nSalario com comissão: " + (this.salario + this.percentualComissao)
                + "\n ================================";
    }
}
