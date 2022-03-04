
/**
 * 
 * 
 * @author jamile
 *
 */
public class game
{
    public static void main(){
        
        System.out.println("Game do monstro...");
        
        monstro monstro01 = fazMonstro.fabricaMonstro("porco");
        monstro monstro02 = fazMonstro.fabricaMonstro("lobo");
        monstro monstro03 = fazMonstro.fabricaMonstro("gato");
        
        monstro01.getMonstro();
        monstro02.getMonstro();

    }
}
