package Aulas;
public class E6OperacoesMatematicas {
    public static void main(String[] args) {
        double raio = 5.0;
        double base = 2.0;
        double expoente = 3.0;
 
 
        System.out.println("Área do círculo: " + (2 * Math.PI * raio));
        //limitando o tamanho do valor
        System.out.println("\nÁrea do círculo: " + String.format("%.5f", 2 * Math.PI * raio)); //Usando String.format():
        System.out.printf("Área do círculo: %.5f\n", 2 * Math.PI * raio); //Usando o %5 do System.out.printf():
        //outras metodos do math
        System.out.println("Base elevada ao expoente: " + Math.pow(base, expoente));
        System.out.println("Seno de 45 graus: " + Math.sin(Math.toRadians(45)));
        System.out.println("Raiz quadrada de 2: " + Math.sqrt(2));
        System.out.println("Log natural de 10: " + Math.log(10));
        System.out.println("Log base 10 de 100: " + Math.log10(100));
        System.out.println("Arredondamento para cima de 3.1: " + Math.ceil(3.1));
        System.out.println("Parte inteira de 3.9: " + Math.floor(3.9));
 
 
        // Tipos numéricos
        short s = 10;
        int i = -1000;
        long l = 100000L;
        float f = 230.47f;
        double d = 200.374;
 
 
        System.out.println("Valor absoluto de " + i + ": " + Math.abs(i));
        System.out.println("Exponenciação de " + d + " ao quadrado: " + Math.pow(d, 2));
    }
 }
 