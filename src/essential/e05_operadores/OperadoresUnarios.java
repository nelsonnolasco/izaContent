package essential.e05_operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {

//classe Operadores.java
        int numero = +5; //ou somente 5

//Imprimindo o numero negativo
        System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

//ordem de precedência conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        for(int contagem =1; contagem<=10; contagem++){
            System.out.println(contagem);
        }
    }
}
