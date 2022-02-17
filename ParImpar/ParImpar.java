package parimpar;

/**
 *
 * @author Jamile
 */
public class ParImpar {

    public static void main(String[] args) {

        Jogador user = new Jogador();
        Jogador pc = new Jogador();

        user.setNome();
        pc.setNome("Computador");
        user.setEscolha();
        pc.setEscolha(user.getEscolha());
        
        user.setJogada();
        pc.setJogada((int) (Math.random() * 20));
        
        user.infoGanhador(pc.getNome(), pc.getJogada());

    }

}
