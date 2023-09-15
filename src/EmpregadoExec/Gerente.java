package EmpregadoExec;

public class Gerente extends Empregado{
    private String departamento;

    Gerente(){}
    Gerente(String nome, String departamento, float salario){
        super(nome,salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " +this.departamento;
    }
}
