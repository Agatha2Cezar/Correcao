package exercicio1;

public class App {
    public static void main(String[] args) throws Exception {
        DivisaoComExcecao dce = new DivisaoComExcecao();
        int resultado;

        do {
            dce.lerNumeros();
            resultado = dce.fazDivisao();
        } while (dce.isTentarNovamente());
        System.out.println("Resultado da divisão: " + resultado);
    }
}
