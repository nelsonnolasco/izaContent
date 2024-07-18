package essential.e04_tipos.enums;

public class EnumApp {
    public static void main(String[] args) {
        EstadosBrasileiros PI = EstadosBrasileiros.PIAUI;

        System.out.println(PI.getNome());
        System.out.println(PI.getNomeMaiusculo());
        System.out.println(PI.getSigla());
    }
}
