package EmpregadoExec;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String menu = "0- Sair\n" +
                "1- Adicionar gerente\n" +
                "2- Adicionar vendedor\n" +
                "3- Listar gerentes\n" +
                "4- Listar vendedores";
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        ArrayList<Gerente> listaGerentes = new ArrayList<>();

        //Atributos
        float salario, comissao;
        String nome, departamento;

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar");
                    break;
                //Adicionar gerente
                case 1:
                    nome = JOptionPane.showInputDialog("Insira o nome do gerente");
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário: "));
                    departamento = JOptionPane.showInputDialog("Insira o Departamento");
                    listaGerentes.add(new Gerente(nome, departamento, salario));
                    break;
                //Adicionar vendedores
                case 2:
                    nome = JOptionPane.showInputDialog("Insira o nome do Vendedor");
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário: "));
                    comissao = Float.parseFloat(JOptionPane.showInputDialog("Insira a comissão"));

                    listaVendedores.add(new Vendedor(comissao, nome, salario));

                    break;
                //Listar gerentes
                case 3:

                    JOptionPane.showMessageDialog(null, listaGerentes);

                    break;
                //Listar vendedores
                case 4:

                    JOptionPane.showMessageDialog(null, listaVendedores);

                default:
                    System.out.println("default");
                    break;
            }
        } while (op != 0);
    }
}