package essential.e06_controle_fluxo_condicional;

public class CondicionalEncadeadaResultadoEscolar {
    // ResultadoEscolar.java
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
