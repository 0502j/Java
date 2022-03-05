
/**
 * classe pizza de tomate
 * 
 * @author jamile
 * 
 */
public class pizzaTomate extends pizza
{

    @Override
    public void infoPizza(){
        System.out.println("------------------------------");
        System.out.println("INFORMAÇÕES - PIZZA DE TOMATE");
        System.out.println("Ingredientes: molho, queijo, rodelas de tomate");
        System.out.println("Quantidade de pedaços: 8");
        System.out.println("Cor da embalagem: vermelha");
        
    }
    
    
    @Override
    public void Preparar(){
        System.out.println("------------------------------");
        System.out.println("-> Preparando pizza de tomate...");
        System.out.println("Ingredientes:");
        System.out.println("Molho, queijo, rodelas de tomate");
        System.out.println("Preparando o molho...");
        System.out.println("Ralando o queijo...");
        System.out.println("Cortando rodelas de tomate...");
        System.out.println("Pizza de tomate preparada com sucesso!");
        
        preparada = true;
        
    }
    
    @Override
    public void Montar(){
        
        System.out.println("------------------------------");
        System.out.println("-> Montando pizza de tomate...");
        
        if(preparada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada!");
        }else{
    
        System.out.println("Adicionando ingredientes...");
        System.out.println("Passando molho...");
        System.out.println("Adicionando queijo...");
        System.out.println("Adicionando rodelas de tomate...");
        System.out.println("Pizza de tomate montada com sucesso!");
        
        montada = true;
        }
        
    }
    
    @Override
    public void Cortar(){
        
        System.out.println("------------------------------");
        System.out.println("-> Cortando pizza de tomate...");
        
        if(preparada == false | montada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada ou montada!");
        }else{

     
        System.out.println("Cortando em 8 pedaços...");
        System.out.println("Pizza de tomate cortada com sucesso!");
        
        cortada = true;
        }
    
    }
    
    @Override
    public void Empacotar(){
        
        System.out.println("------------------------------");
        System.out.println("-> Empacotando pizza de tomate...");
        
        if(preparada == false | montada == false | cortada == false){
            System.out.println("ERRO: Pizza ainda não foi preparada, montada ou cortada!");
        }else{

        
        System.out.println("Inserindo pizza na caixa vermelha...");
        System.out.println("Colocando lacre na caixa...");
        System.out.println("Pizza de tomate empacotada com sucesso!");
        
        empacotada = true;
        }
    }
    
}
