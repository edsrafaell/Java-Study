package orientadoObjetos.testes;
import orientadoObjetos.metodos.*;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando!");
        calculadora.multiplicaDoisNumeros(10, 21);
        double result = calculadora.dividirDoisNumeros(10, 23);
        System.out.println(result);  
    }
}
