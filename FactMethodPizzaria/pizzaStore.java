
/**
 * 
 * 
 * @author jamile
 * 
 */
public class pizzaStore
{
    public static void main(){

        System.out.println("Fábrica de pizzas!");
        
        System.out.println("");
        System.out.println("");
        System.out.println("*******************TESTE 1*******************");
        System.out.println("TESTANDO O SABOR QUEIJO NORMAL");

        pizza pizza01 = fabricaPizza.fazPizza("queijo");
        pizza01.infoPizza();  
        pizza01.Preparar();
        pizza01.Montar();
        pizza01.Cortar();
        pizza01.Empacotar();

        System.out.println("");
        System.out.println("");
        System.out.println("*******************TESTE 2*******************");
        System.out.println("TESTANDO O SABOR CALABRESA SEM PREPARAR");

        pizza pizza02 = fabricaPizza.fazPizza("calabresa");
        pizza02.infoPizza();  
        //pizza02.Preparar();
        pizza02.Montar();
        pizza02.Cortar();
        pizza02.Empacotar();
        
        System.out.println("");
        System.out.println("");
        System.out.println("*******************TESTE 3*******************");
        System.out.println("TESTANDO O SABOR TOMATE SEM CORTAR");

        pizza pizza03 = fabricaPizza.fazPizza("tomate");
        pizza03.infoPizza();  
        pizza03.Preparar();
        pizza03.Montar();
        //pizza03.Cortar();
        pizza03.Empacotar();

        System.out.println("");
        System.out.println("");
        System.out.println("*******************TESTE 4*******************");
        System.out.println("TESTANDO SABORES QUE NÃO EXISTEM");
        pizza pizza04 = fabricaPizza.fazPizza("teste");


    }
    
    
}
