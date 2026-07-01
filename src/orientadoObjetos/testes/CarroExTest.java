package orientadoObjetos.testes;
import orientadoObjetos.classes.*;

public class CarroExTest {
    public static void main(String[] args) {
        CarroEx carro1 = new CarroEx();
        carro1.nome = "Ford Car";
        carro1.modelo = "Casual";
        carro1.ano = 2010;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        CarroEx carro2 = new CarroEx();
        carro2.nome = "Camaro";
        carro2.modelo = "Luxo";
        carro2.ano = 2023;

        System.out.println("\n"+carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
