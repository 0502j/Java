
package projetolivro;

/**
 *
 * @author Jamile
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[2];
        
        pessoa[0] = new Pessoa("Joãozinho", 14, "M");
        pessoa[1] = new Pessoa("Josefina", 20, "F");
        
        livro[0] = new Livro("Java é top!", "Pedrinho Moraes", 300, pessoa[0]);
        livro[0] = new Livro("Livro daora", "Joana Silva", 34, pessoa[1]);
        
        livro[0].detalhes();
        
        livro[0].abrir();
        livro[0].folhear(304);
        livro[0].avancarPag();
        livro[0].voltarPag();
        
        
    }
    
}
