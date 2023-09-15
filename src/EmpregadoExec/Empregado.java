package EmpregadoExec;

public class Empregado {
    private String nome;
    protected float salario;

    Empregado(){}
    Empregado(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return ("\nNome do funcionário:" + this.nome
        + "\nSalário:" + this.salario);
    }
}
