package estruturaCondicionais;

public class operadorTernario {
    public static void main(String[] args){
        int age = 11;

        String status = (age >= 18) ? "MAIOR DE IDADE" : "MENOR DE IDADE";
        System.out.println(status);
    }
}
