package introducao;

public class TiposPrimitivos {
    public static void main(String[] args){
        int ageDad = (int) 100000000000000l; 
        double salaryDouble = 2000d; 
        float salaryFloat = 2000f;
        long salaryLong = 3000l;
        byte ageByte = 127;
        short ageShort = 10;
        boolean verdeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String name = "Rafael"; //Classe para representar texto
        var ageVar = 10; //Omissão to tipo primitivo
        System.out.println("Age for Dad: " + ageDad);
        System.out.println("Double salary: " + salaryDouble);
        System.out.println("Float salary: " + salaryFloat);
        System.out.println("Long salary: " + salaryLong);
        System.out.println("Age (Byte): " + ageByte);
        System.out.println("Age (Short): " + ageShort);
        System.out.println("True: " + verdeiro);
        System.out.println("False: " + falso);
        System.out.println("Character : " + caractere);
        System.out.println("Name: " + name);
        System.out.println("Age (Var): " + ageVar);
    }
}
