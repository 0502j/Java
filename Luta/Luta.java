package luta;

/**
 *
 * @author Jamile
 */
public class Luta {

    
    public static void main(String[] args) {
       
       int i;
       Lutador l[] = new Lutador[6];
       
    
       
       l[0] = new Lutador("Joãozinho", "Brasil", 1.60f, 76f, 0, 0, 0);
       l[1] = new Lutador("Zézinho", "Brasil", 1.80f, 100f, 2, 3, 5);
       l[2] = new Lutador("Juquinha", "Brasil", 1.55f, 80f, 5, 2, 1);
       l[3] = new Lutador("Manuelzinho", "Brasil", 1.80f, 76f, 0, 0, 0);
       
       Combate C01 = new Combate();
       C01.marcarLuta(l[0], l[3]);
       C01.lutar();
       
        System.out.println("==========Status após a luta==========");
        l[0].status();
        l[3].status();
       
       
       
    }
    
}
