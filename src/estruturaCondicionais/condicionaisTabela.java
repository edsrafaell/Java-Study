package estruturaCondicionais;

public class condicionaisTabela {
    public static void main(String[] args){
        boolean fome = true;
        boolean sono= false;
        if (fome && sono){
            System.out.println("Estou com fome e sono");
        }
        else if (fome || sono){
            System.out.println("Estou com fome ou sono");
        }
        else{
            System.out.println("Não estou com fome e nem sono");
        }  

    }
}
