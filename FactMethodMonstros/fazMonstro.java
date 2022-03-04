
/**
 * 
 * 
 * @author jamile
 * 
 */
public class fazMonstro
{
    public static monstro fabricaMonstro(String tipo){
        
        //qual monstro vamos fabricar?
        monstro qual = null;
        if("porco".equals(tipo)){
            qual = new monstroPorco();
        }else if("lobo".equals(tipo)){
            qual = new monstroLobo();
        }else if("gato".equals(tipo)){
            qual = new monstroGato();
        }
    
        return qual;
    }
    
}
