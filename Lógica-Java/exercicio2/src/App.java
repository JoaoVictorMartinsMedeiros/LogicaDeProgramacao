import java.util.Scanner;
/**Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, amédia de preço de custo e do preço de venda; */
public class App {
    public static void main(String[] args) throws Exception {
        int nProdutos;
        float valorVenda,valorCusto,mediaPrecoCusto = 0,mediaPrecoVenda = 0;
        String produto;
        Scanner in = new Scanner(System.in), inNumber = new Scanner(System.in);

        for(nProdutos = 0;nProdutos < 40;nProdutos++){
            
            System.out.println("Cadastre um produto: ");
            produto = in.nextLine();
            System.out.println("Quanto é o valor de custo?");
            valorCusto = inNumber.nextFloat();
            System.out.println("Por quanto será vendido?");
            valorVenda = inNumber.nextFloat();
            
            if(valorVenda < valorCusto){
                System.out.println("Houve Prejuizo na venda ao vender "+ produto +" o preço de custo foi de "+valorCusto+" e o valor de Venda foi de "+valorVenda+"!!");
            }else if(valorVenda > valorCusto){
                System.out.println("Houve Lucro com a venda de "+produto+" o preço de custo foi de "+valorCusto+" e o valor de Venda foi de"+valorVenda+"!!");
            }else{
                System.out.println("Não houve nem lucro nem prejuizo,saiu no 0 a 0 na venda de "+produto+" o preço de custo foi de "+valorCusto+" e o valor de Venda foi de "+valorVenda+"!!");
            }
            
             mediaPrecoCusto += valorCusto;
             mediaPrecoVenda += valorVenda;

        }
        System.out.println("A media de preço de custo foi de " + (mediaPrecoCusto/nProdutos) +" e a media de preço de venda foi de "+(mediaPrecoVenda/nProdutos));
        
        
        
    }
}
    
