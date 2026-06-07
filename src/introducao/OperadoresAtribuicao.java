package introducao;

public class OperadoresAtribuicao {
    public static void main(String[] args){
        int a = 30;
        int b = 10;

        System.out.println("a = " + a); // 30
        System.out.println("b = " + b); // 10
        a += b; // a = a + b
        System.out.println("a += b: " + a); // 40
        a -= b; // a = a - b
        System.out.println("a -= b: " + a); // 30
        a *= b; // a = a * b
        System.out.println("a *= b: " + a); // 300
        a /= b; // a = a / b
        System.out.println("a /= b: " + a); // 30
        a %= b; // a = a % b
        System.out.println("a %= b: " + a); // 0

        
    }
}
