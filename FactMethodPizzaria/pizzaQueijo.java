
/**
 * classe pizza de queijo
 * 
 * @author jamile
 * 
 */
public class pizzaQueijo extends pizza
{
    @Override
    public void infoPizza(){
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES - PIZZA DE QUEIJO");
        System.out.println("Ingredientes: molho, queijo");
        System.out.println("Quantidade de pedaços: 2");
        System.out.println("Cor da embalagem: amarela");
    }
    
    @Override
    public void Preparar(){
        System.out.println("------------------------------");
        System.out.println("-> Preparando pizza de queijo...");
        System.out.println("Ingredientes:");
        System.out.println("Molho, queijo");
        System.out.println("Preparando o molho...");
        System.out.println("Ralando o queijo...");
        System.out.println("Pizza de queijo preparada com sucesso!");
        
        preparada = true;
        
        
    }
    
    @Override
    public void Montar(){
        System.out.println("------------------------------");
        System.out.println("-> Montando pizza de queijo...");
        
        if(preparada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada!");
        }else{
        System.out.println("Adicionando ingredientes...");
        System.out.println("Passando molho...");
        System.out.println("Adicionando queijo...");
        System.out.println("Pizza de queijo montada com sucesso!");
        
        montada = true;
        }
    }
    
    @Override
    public void Cortar(){
        System.out.println("------------------------------");
        System.out.println("-> Cortando pizza de queijo...");
        
         if(preparada == false | montada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada ou montada!");
        }else{
        System.out.println("Cortando em 2 pedaços...");
        System.out.println("Pizza de queijo cortada com sucesso!");
        cortada = true;
        }
    }
    
    @Override
    public void Empacotar(){
    
        System.out.println("------------------------------");
        System.out.println("-> Empacotando pizza de queijo...");
        
        if(preparada == false | montada == false | cortada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada, montada ou cortada!");
        }else{
        System.out.println("Inserindo pizza na caixa amarela...");
        System.out.println("Colocando lacre na caixa...");
        System.out.println("Pizza de queijo empacotada com sucesso!");
        
        empacotada = true;
        }
    }
   
}
