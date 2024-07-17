package essential.e03_execucao;

public class Conta {
    String numero;
        int saldo = 20;
        void sacar(){
            //saldo = saldo - ?;
        }
        void sacar(int valorSolicitado){
            saldo = saldo - valorSolicitado;
        }
        void exbirSaldo(){
            System.out.println("O saldo atual da conta é " + saldo);
        }
}


