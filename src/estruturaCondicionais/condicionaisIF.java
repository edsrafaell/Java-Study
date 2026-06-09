package estruturaCondicionais;

public class condicionaisIF {
    public static void main(String[] args){
        int age = 71;

        if (age >= 18 && age < 70){ 
            System.out.println("OBRIGATORIO VOTAR!");
        }
        if (age >= 16 && age >= 70){
            System.out.println("VOTO OPCIONAL!");
        }
        else{
            System.out.println("NÃO PODE VOTAR!");
        }

    }
}
