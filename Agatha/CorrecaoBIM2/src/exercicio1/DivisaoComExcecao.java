package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoComExcecao {
    private int num1;
    private int num2;
    private boolean tentarNovamente;
    
    public void lerNumeros(){
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número 1");
        this.num1 = entrada.nextInt();
        System.out.println("Digite o número 2");
        this.num2 = entrada.nextInt();
        this.tentarNovamente = false;
        } catch (InputMismatchException e) {
            System.out.println("Digite um valor do tipo inteiro!");
        }
    }
    public int fazDivisao(){
        //this.tentarNovamente = false, devo fazer divisão
        //!this.tentarNovamente = true
        if(!this.tentarNovamente);{
            try {
                int resultado = num1/num2;
                this.tentarNovamente = false;
                return resultado;
            } catch (ArithmeticException e) {
                System.out.println("Você não pode fazer uma divisão por 0");
                this.tentarNovamente = true;
                return 0;
            }
        }
        
    }
    public boolean isTentarNovamente(){
        return this.tentarNovamente;
    }
}
