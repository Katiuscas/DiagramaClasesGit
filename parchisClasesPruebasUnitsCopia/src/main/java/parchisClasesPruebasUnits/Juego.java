/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();
		Usuario jug1 = new Usuario();
		Usuario jug2 = new Usuario();
		Boolean partidaGanada = false;
		
		logearUsuarios(2);
		elegirColor(jug1);
		elegirColor(jug2);
		
		while(!partidaGanada) {
			
			turno(jug1);
			turno(jug2);
		}
	}
	
	private static void logearUsuarios(int numUsuarios) {
		for(int i=1; i<=numUsuarios;i++) {
			// hay que hacer el metodo del login para despues llamar al login de la clase usuario.
			// Por ejemplo jug1.login("Angel", "123");
		}
	}
	
	private static void elegirColor(Usuario usuario) {
		
		// preguntamos a los usuarios que color quieren y se lo asignamos a las fichas dentro de su array.
	}
	
	
	private static void turno(Usuario usuario) {
		
		int tirada = usuario.getDado().tirar();
		if(todasEnCasa(usuario) && tirada != 5) {
			return;
		}
		else if (!todasEnCasa(usuario) || tirada == 5) {
			int fichaElejida = elegirFicha();
			moverFicha(usuario, fichaElejida, tirada);
		}
		
	}
	
	private static boolean todasEnCasa(Usuario usuario) {
		boolean resultado = true;
		for(int i = 0; i<usuario.getFichas().length;i++) {
			if(usuario.getFichas()[i].getCasilla() != 0) {
				resultado = false;
			}
		}
		return resultado;
	}
	
	private static int elegirFicha() {
		
		// preguntamos al usuario que escriba la casilla de la ficha que quiere mover.
		// se obtiene en la variable fichaElejida.
		return 1;
		
	}
		
	private static void moverFicha(Usuario usuario, int fichaElejida, int tirada) {
		
		usuario.getFichas()[fichaElejida].setCasilla(tirada);
		// ahora deberiamnos de controlar si al mover hay una barrera de fichas de color diferente.
		// Tambien hay que controlar si come alguna ficha.
		// Tambien hay que controlar si ha llegado al final y ha ganado la partida.
		// Y cualquier otra cosa que se me escape.
	}
	
}
