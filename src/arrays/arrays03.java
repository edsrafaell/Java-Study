package arrays;

public class arrays03 {
    public static void main(String[] args){
        int[] age = {20, 30, 40};
        int[] numeros3 = new int[]{20, 30, 40};
        for (int numb = 0; numb < age.length; numb++){
            System.out.println("Idade: " + age[numb]);
        } 

        for(int num:numeros3){
            System.out.println("Idade: " + num);
        }
    }
}
