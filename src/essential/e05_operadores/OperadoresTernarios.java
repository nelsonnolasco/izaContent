package essential.e05_operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {

// classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "falso";

        System.out.println(resultado);

//Aninhamento
        int resultado1 = a == b ? 0 : a > b ? 1 : -1;
        System.out.println(resultado1);

    }
}
