package estruturaCondicionais;

public class condicionaisElseIf {
    public static void main(String[] args){ 
        int age = 71;

        if (age >= 18 && age < 70){ 
            System.out.println("OBRIGATORIO VOTAR!");
        }
        else if (age >= 16 && age < 70){ 
            System.out.println("VOTO OPCIONAL!");
        }
        else{
            System.out.println("NÃO PODE VOTAR!");
        }

    }
}
