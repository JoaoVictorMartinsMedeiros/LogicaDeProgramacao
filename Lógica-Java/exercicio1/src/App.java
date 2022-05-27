import java.util.Scanner;
/**A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral; */

public class App {
    public static void main(String[] args) {
        
        String nomeVeiculo;
        int anoVeiculo,totalVeiculos = 0,veiculosSeminovos = 0;
        float valorVeiculo,valorDesconto;
        char continuar = 's';
        
        Scanner in = new Scanner(System.in);
        
        

        while(continuar == 's' || continuar == 'S'){
            
            System.out.println("Insira o nome do Veiculo:");
            nomeVeiculo = in.next();
            System.out.println("Insira o valor do Veiculo:");
            valorVeiculo = in.nextInt();
            System.out.println("Insira o ano do Veículo:");
            anoVeiculo = in.nextInt();

            if(anoVeiculo <= 2000){
                valorDesconto = (float) (valorVeiculo*0.12);
            
                System.out.println("O valor de desconto para o veiculo "+ nomeVeiculo +" do ano de "+ anoVeiculo +" será de " + valorDesconto+" e o restante a ser pago é "+(valorVeiculo - valorDesconto)+".");
                veiculosSeminovos++;
            }else{
                valorDesconto = (float) (valorVeiculo*0.07);

                System.out.println("O valor de desconto para o veiculo "+ nomeVeiculo +" do ano de "+ anoVeiculo + " será de " + valorDesconto+" e o restante a ser pago é "+(valorVeiculo - valorDesconto)+".");
                
            }
                totalVeiculos++;
           
            


            System.out.println("Deseja cadastrar outro veículo?");
            continuar = in.next().charAt(0);
            
            
            
        }
        in.close();
        System.out.println("O total de veículos Seminovos é : "+veiculosSeminovos+" e o total de veículos no geral é: "+totalVeiculos+".");

        

        
        
        
    }
}

