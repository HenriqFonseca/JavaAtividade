package ContaExec;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        float saldo = 100;
        float limite = 200;
        float valorSaque = 110;
        float diferenca;

        if(valorSaque>saldo){
            System.out.println(diferenca = valorSaque - saldo);
            System.out.println("\nSALDOOO\n " + ((saldo - valorSaque) + diferenca));
            float menosLimite = limite - diferenca;
            System.out.println("Limite: "+ menosLimite +
                    "\nSaldo atual: " + saldo);
        }else{
            System.out.println(saldo - valorSaque);
        }

    }
}