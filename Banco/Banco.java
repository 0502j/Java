package banco;

/**
 *
 * @author Jamile
 */
public class Banco {

   
    public static void main(String[] args) {
        
        //ContaBanco ref = new ContaBanco(numConta, tipo, dono);
        ContaBanco p1 = new ContaBanco(111, "CC", "Jubileu");
        ContaBanco p2 = new ContaBanco(222, "AAAA", "Creuza");
        
        p1.abrirConta();
        p2.abrirConta();
        
        p1.depositar(500);
        p2.depositar(900);
        
        p1.sacar(1500);
        p2.sacar(100);
        
        
    }
    
}
