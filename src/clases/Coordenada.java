package clases;
/**
 * Esta es la clase Coordenada en la que se instancia la clase Linea
 * @author MARIO LUZARDO
 *
 */
public class Coordenada {
	Linea x;
	public Coordenada() {
		//Este es el constructor vacio de la clase
		x=new Linea();
	}
	public Coordenada(int puntoA, int puntoB) {
		//Este es el contructor parametrico de la clase que recibe dos valores enteros
		x= new Linea(puntoA,puntoB);
	}
	public void desplazarDerecha(int puntoA){
		/**El metodo desplazarDerecha aumenta el valor de puntoA de la clase linea
		*para luego presentarlo por pantalla junto a puntoB en
		*forma de coordenadas
		**/
		x.setPuntoa(x.getPuntoa()+puntoA);
		System.out.println("("+x.getPuntoa()+","+x.getPuntob()+")");
	}
	public void desplazarIzquierda(int puntoA) {
		/**El metodo desplazarIzquierda disminuye el valor de puntoA de la clase linea
		*para luego presentarlo por pantalla junto a puntoB en
		*forma de coordenadas
		**/
		x.setPuntoa(x.getPuntoa()-puntoA);
		System.out.println("("+x.getPuntoa()+","+x.getPuntob()+")");
	}
	public void desplazarArriba(int puntoB) {
		/**El metodo desplazarArriba aumenta el valor de puntoB de la clase Linea
		*para luego presentarlo por pantalla junto a puntoA en
		*forma de coordenadas
		**/
		x.setPuntob(x.getPuntob()+puntoB);
		System.out.println("("+x.getPuntoa()+","+x.getPuntob()+")");
	}
	public void desplazarAbajo(int puntoB) {
		/**El metodo desplazarAbajo disminuye el valor de puntoB de la clase Linea
		*para luego presentarlo por pantalla junto a puntoB en
		*forma de coordenadas
		**/
		x.setPuntob(x.getPuntob()-puntoB);
		System.out.println("("+x.getPuntoa()+","+x.getPuntob()+")");
	}
}
