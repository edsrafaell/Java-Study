package introducao;

public class OperadoresLogicos {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); // AND lógico
        System.out.println("a || b: " + (a || b)); // OR lógico
        System.out.println("!a: " + (!a)); // NOT lógico
        System.out.println("!b: " + (!b)); // NOT lógico
        System.out.println("a ^ b: " + (a ^ b)); // XOR lógico
        System.out.println("b ^ a: " + (b ^ a)); // XOR lógico
        System.out.println("a == b: " + (a == b)); // Igualdade lógica
        System.out.println("a != b: " + (a != b)); // Desigualdade lógica
        System.out.println("a === b: " + (a == b)); // Igualdade estrita (não existe em Java, mas é equivalente a ==)
        
    }
}
