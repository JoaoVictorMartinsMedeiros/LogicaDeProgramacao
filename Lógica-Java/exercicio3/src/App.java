import java.util.Scanner;

/**Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários. */

public class App {
    public static void main(String[] args) throws Exception {
        int funcionario,salario,reajuste;
        Scanner in = new Scanner(System.in);
        for(funcionario = 0;funcionario <= 584;funcionario++){
            System.out.println("Informe seu salario: ");
            salario = in.nextInt();
            
            if(salario <= 3636){
                reajuste = (int) (salario*0.50);
                System.out.println("Você terá um reajuste de 50% tendo alteração de "+reajuste+" sendo seu salário atualizado para "+(reajuste + salario)+" parabens!");
            }else if(salario >= 3636 && salario <= 12120){
                reajuste = (int) (salario*0.20);
                System.out.println("Você terá um reajuste de 20% tendo alteração de "+reajuste+" sendo seu salário atualizado para "+(reajuste + salario)+" parabens!");
            }else if(salario >= 12120 && salario <= 24240){
                reajuste = (int) (salario*0.15);
                System.out.println("Você terá um reajuste de 15% tendo alteração de "+reajuste+" sendo seu salário atualizado para "+(reajuste + salario)+" parabens!");
            }else{
                reajuste = (int) (salario*0.10);
                System.out.println("Você terá um reajuste de 10% tendo alteração de "+reajuste+" sendo seu salário atualizado para "+(reajuste + salario)+" parabens!");
            }
        }
    }
}
