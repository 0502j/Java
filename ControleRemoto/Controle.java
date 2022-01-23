
package controleremoto;

public class Controle implements Controlador {
    
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor

    public Controle() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    //getters e setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------Menu-------");
        System.out.println("Está ligado? " +this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i<=this.getVolume(); i+=10){
            System.out.print("[]");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.......");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            
        }else{
           System.out.println("Não é possível aumentar o volume, TV desligada.");

        }
    }

    @Override
    public void menosVolume() {
         if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
             System.out.println("Não é possível diminuir o volume, TV desligada.");
         }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        
         if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Tocando.");
        }else{
            System.out.println("Não foi possível tocar.");
        }
        
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Pausado.");
        }else{
            System.out.println("Não foi possível pausar.");
        }
        
    }
    
    
    
}
