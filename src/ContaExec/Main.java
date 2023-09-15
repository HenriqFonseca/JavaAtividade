package ContaExec;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        float saldo = 100;
        float limite = 200;
        float valorSaque = 110;
        float diferenca;

        ContaEspecial contEspec = new ContaEspecial(100,200);


        float teste = contEspec.sacar(300);

        if(teste ==01){
            System.out.println("\nSaldo e limite Insuficientes" +
                    "\n =====================================");
        }

        System.out.println(contEspec.getLimite());

        System.out.println("\nLimite atual: "+ contEspec.getLimite()+
                "Saldo atual: "+ contEspec.getSaldo());

//        if(valorSaque>saldo){
//            System.out.println(diferenca = valorSaque - saldo);
//            saldo = ((saldo - valorSaque) + diferenca);
//            System.out.println("\nSALDOOO " + saldo);
//            float menosLimite = limite - diferenca;
//            System.out.println("Limite: "+ menosLimite +
//                    "\nSaldo atual: " + saldo);
//        }else{
//            System.out.println(saldo - valorSaque);
//        }

    }
}