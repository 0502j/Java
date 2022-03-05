
/**
 * classe pizza de calabresa
 * 
 * @author jamile
 * 
 */
public class pizzaCalabresa extends pizza
{
    @Override
    public void infoPizza(){
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES - PIZZA DE CALABRESA");
        System.out.println("Ingredientes: molho, queijo, calabresa, azeitona");
        System.out.println("Quantidade de pedaços: 4");
        System.out.println("Cor da embalagem: azul");
    }
    
    @Override
    public void Preparar(){
        System.out.println("------------------------------");
        System.out.println("-> Preparando pizza de calabresa...");
        System.out.println("Ingredientes:");
        System.out.println("Molho, queijo, calabresa, azeitona");
        System.out.println("Preparando o molho...");
        System.out.println("Ralando o queijo...");
        System.out.println("Selecionando qtd de calabresa...");
        System.out.println("Selecionando qtd de azeitonas...");
        System.out.println("Pizza de calabresa preparada com sucesso!");
        
        preparada = true;
        
    }
    
    @Override
    public void Montar(){
        System.out.println("------------------------------");
        System.out.println("-> Montando pizza de calabresa...");
        
        if(preparada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada!");
        }else{
        
        System.out.println("Adicionando ingredientes...");
        System.out.println("Passando molho...");
        System.out.println("Adicionando queijo...");
        System.out.println("Adicionando a calabresa...");
        System.out.println("Adicionando as azeitonas...");
        System.out.println("Pizza de calabresa montada com sucesso!");
        
        montada = true;
        }
    }
    
    @Override
    public void Cortar(){
        System.out.println("------------------------------");
        System.out.println("-> Cortando pizza de calabresa...");
        
        if(preparada == false | montada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada ou montada!");
        }else{
        
        System.out.println("Cortando em 4 pedaços...");
        System.out.println("Pizza de calabresa cortada com sucesso!");
        
        cortada = true;
        }
    }
    
    @Override
    public void Empacotar(){
        System.out.println("------------------------------");
        System.out.println("-> Empacotando pizza de calabresa...");
        
        if(preparada == false | montada == false | cortada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada, montada ou cortada!");
        }else{
        
        System.out.println("Inserindo pizza na caixa azul...");
        System.out.println("Colocando lacre na caixa...");
        System.out.println("Pizza de calabresa empacotada com sucesso!");
        
        empacotada = true;
        }
    }
   
}
