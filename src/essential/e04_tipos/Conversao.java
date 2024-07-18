package essential.e04_tipos;

public class Conversao {
    public static void main(String[] args) {
        // conversão explicita
        double d = 100.76;
        int i = (int) d;
        System.out.println(i); // 100 - irá perder a parte decimal

        String numero = "123";
        int i2 = Integer.parseInt(numero);
        System.out.println(i2);

        String numero01 = "10";
        String numero02 = "3";

        System.out.println(numero01 + numero02);

        int r = Integer.parseInt(numero01);
        int rr = Integer.parseInt(numero02);
        System.out.println(r + rr);

        String num = "100.75";
        double d2 = Double.parseDouble(num);
        System.out.println(d2); // 100.75

        // valueOf

        String num3 = "100";
        Integer obj = Integer.valueOf(num3);
        System.out.println(obj); // 100

        Integer obj1 = new Integer(100);
        int s = obj1.intValue();
        System.out.println(i); // 100

        // Comparação - equals e compareTo

        Integer obj4 = new Integer(150);
        Integer obj5 = new Integer(100);

        System.out.println(obj4.equals(obj5)); // false

        System.out.println(obj4.compareTo(obj5)); // (0 =) (1 >) (-1 <)

        System.out.println(obj4 > obj5);

        // equals e hashcode -> ver depois

        //Maior e menor valor

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

    }
}
