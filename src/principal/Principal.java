/**
 * 
 */
package principal;
import clases.Coordenada;
/**
 * Esta es la clase principal
 * @author MARIO LUZARDO
 *
 */
public class Principal {

	/**
	 * Este es el metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada xy = new Coordenada();
		Coordenada ab = new Coordenada(3,5);
	    
		ab.desplazarDerecha(1);
	    xy.desplazarDerecha(1);
	    
	    ab.desplazarIzquierda(1);
	    xy.desplazarIzquierda(1);
	    
	    ab.desplazarArriba(1);
	    xy.desplazarArriba(1);
	    
	    ab.desplazarAbajo(1);
	    xy.desplazarAbajo(1);
	}
}
