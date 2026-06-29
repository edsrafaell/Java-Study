package orientadoObjetos.testes;
import orientadoObjetos.classes.*;

public class PessoaTest {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rafael";
        pessoa1.idade = 19;
        pessoa1.sexo = 'M';
        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Edson";
        pessoa2.idade = 20;
        pessoa2.sexo = 'M';
        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");
        System.out.println(pessoa1); //Endereço de memoria
    }
}
