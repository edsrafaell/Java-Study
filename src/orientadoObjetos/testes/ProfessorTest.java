package orientadoObjetos.testes;
import orientadoObjetos.classes.*;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Rafael";
        professor1.idade = 28;
        professor1.matricula = "TADS03.2USSS2026";
        professor1.sexo = 'M';

        System.out.println("Nome: " + professor1.nome);
        System.out.println("Idade: " + professor1.idade);
        System.out.println("Matricular: " + professor1.matricula);
        System.out.println("Sexo: " + professor1.sexo);
    }
}
