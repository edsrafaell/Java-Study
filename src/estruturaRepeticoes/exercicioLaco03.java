package estruturaRepeticoes;

public class exercicioLaco03 {
    public static void main(String[] args) {
        double valueCar = 200000;
        for (int parcela = 1; parcela <= valueCar; parcela++) {
            double valorParcela = valueCar / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Valor da parcela " + parcela + ": R$ " + valorParcela);
        }
    }
}
