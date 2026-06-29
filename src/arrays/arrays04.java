package arrays;

public class arrays04 {
    public static  void main(String[] args){
        //Multidimensinais
        int [][] mes = new int [2][2];
        mes[0][0] = 31;
        mes[0][1] = 30;
        
        mes[1][0] = 30;
        mes[1][1] = 20;

        for (int i = 0; i < mes.length; i++){
            for (int j = 0; j < mes[0].length; j++){
                System.out.println(mes[i][j]);
            }
        }

    }
}
