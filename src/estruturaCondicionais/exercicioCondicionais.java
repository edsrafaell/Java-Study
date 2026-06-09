package estruturaCondicionais;

public class exercicioCondicionais {
    public static void main(String[] args){
    int day = 4;
    if (day == 1) {
        System.out.println("Domingo");
    } else if (day == 2) {
        System.out.println("Segunda-feira");
    } else if (day == 3) {
        System.out.println("Terça-feira");
    }else if (day == 4) {
        System.out.println("Quarta-feira");
    } else if (day == 5) {
        System.out.println("Quinta-feira");
    }else if (day == 6) {
        System.out.println("Sexta-feira");
    } else if (day == 7) {
        System.out.println("Sabado");
    } else{
        System.out.println("Dia inválido!");
    }
}
}
