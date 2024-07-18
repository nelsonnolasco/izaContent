package essential.e05_operadores;

public class OpderadoresAritméticos {
    public static void main(String[] args) {
        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        /*
    Vamos imaginar que n1 começaria com valor 10 e n2 com valor 5
    mas em seguida gostaria de somar o valor de n1 e n2 e atribuir a n2.
        */

        int n1 = 10;
        int n2 = 5;

//forma literal
        int n3 = n2 + n1;

//forma abreviada
        n2 += n1;

        System.out.println(n2);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

//qual o resultado das expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + 1;

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + 1 + 1 + 1;

        concatenacao = "1" + (1 + 1 + 1);
    }
}
