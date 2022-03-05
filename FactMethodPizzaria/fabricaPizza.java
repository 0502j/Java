
/**
 * 
 * 
 * @author jamile
 * 
 */
public class fabricaPizza 
{
    public static pizza fazPizza(String sabor){
        
        //qual pizza vamos fabricar?
        pizza qualpizza = null;
        
        System.out.println("---------------");
        System.out.println("Sabor escolhido:" + sabor);
        
        if("queijo".equals(sabor)){
            
            qualpizza = new pizzaQueijo();
        }else if("calabresa".equals(sabor)){
            qualpizza = new pizzaCalabresa();
        }else if("tomate".equals(sabor)){
            qualpizza = new pizzaTomate();
        }else{
           
            System.out.println("ERRO: Não fazemos pizza desse sabor!");
          
        }
        
        System.out.println("---------------");
    
        return qualpizza;
    }
}
