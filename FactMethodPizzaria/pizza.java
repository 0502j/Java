
/**
 * Classe abstrata pizza 
 * 
 * @author jamile
 * 
 */
public abstract class pizza
{
    boolean preparada = false;
    boolean montada = false;
    boolean cortada = false;
    boolean empacotada= false;
    
    public abstract void infoPizza();
    public abstract void Preparar();
    public abstract void Montar();
    public abstract void Cortar();
    public abstract void Empacotar();
  
}
