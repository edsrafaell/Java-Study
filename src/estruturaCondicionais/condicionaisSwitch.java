package estruturaCondicionais;

public class condicionaisSwitch {
    public static void main(String[] args){
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Domingo";
                break;
            case 2:
                dayName = "Segunda-feira";
                break;
            case 3:
                dayName = "Terça-feira";
                break;
            case 4:
                dayName = "Quarta-feira";
                break;
            case 5:
                dayName = "Quinta-feira";
                break;
            case 6:
                dayName = "Sexta-feira";
                break;
            case 7:
                dayName = "Sábado";
                break;
            default:
                dayName = "Dia inválido";
        }

        System.out.println("O dia da semana é: " + dayName);
    }
}