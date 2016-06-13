package tokenizer.tokenizer;

/**
 * Clase principal del programa
 * @author Bianney
 *
 */
public class App 
{
	/**
	 * Método principal. Crea una ventana con las distintas opciones que permite ejecutar el programa
	 * @param args
	 */
    public static void main(String[] args)
    {
      	Panel panel = new Panel();
    	new Frame(panel, "Práctica LDH");
    }
}