package essential.e06_controle_fluxo_condicional;
/*
Sigla	Medida
P	    PEQUENO
M	    MÉDIO
G	    GRANDE
 */

public class CondicionalIfElseSistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MÉDIO");
        else if(sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");
    }
}
