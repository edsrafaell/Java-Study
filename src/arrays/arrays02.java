package arrays;

public class arrays02 {
    public static void main(String[] args){
        String[] names = new String[4];
        names[0] = "Edson";
        names[1] = "Rafael";
        names[2] = "Santana";
        names[3] = "Canário";
        for ( int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}
