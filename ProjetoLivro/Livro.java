
package projetolivro;


public class Livro implements Publicacao {
    
   
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    
    //métodos

    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int pagina) {
        System.out.println("======= Folheando... =========");
        
         if(this.isAberto()){
             if(totPaginas >= pagina){
                this.pagAtual = pagina;

                System.out.println("Página atual:" + this.pagAtual);
             }else{
                 System.out.println("Não é possível folhear. Número de páginas não coincide.");
             }
           
       }else{
             System.out.println("Não é possível folhear. Livro fechado.");
         }
       
        
    }

    @Override
    public void avancarPag() {
        System.out.println("======= Avançando página... =========");
        if(this.isAberto()){
            this.pagAtual = this.pagAtual + 1;
            System.out.println("Página atual:" + this.pagAtual);
        }else{
            System.out.println("Não é possível avançar a página. Livro fechado.");
        }
        
    }

    @Override
    public void voltarPag() {
        System.out.println("======= Voltando página... =========");
          if(this.isAberto()){
            this.pagAtual = this.pagAtual - 1;
            System.out.println("Página atual:" + this.pagAtual);
        }else{
            System.out.println("Não é possível voltar a página. Livro fechado.");
        }
    }

    public void detalhes() {
        System.out.println("Leitor:" + leitor.getNome());
        System.out.println("Nome do livro:" + this.titulo);
        System.out.println("Autor do livro:" + this.autor);
        System.out.println("Total de páginas:" + this.totPaginas);
        System.out.println("Está aberto?" + this.aberto);
        System.out.println("Página atual:" + this.pagAtual);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    
}
