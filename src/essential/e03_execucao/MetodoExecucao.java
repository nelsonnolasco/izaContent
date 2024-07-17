package essential.e03_execucao;

public class MetodoExecucao {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        conta01.numero ="1029-x";

        System.out.println("O saldo da conta " + conta01.numero + " é" + conta01.saldo);

        Conta conta02 = new Conta();
        conta02.numero ="1980-7";

        System.out.println("O saldo da conta " + conta02.numero + " é" + conta02.saldo);
    }
}
