/**
 * 
 */
package parchisClasesPruebasUnits;

import java.util.Random;

/**
 * 
 */
public class Dado {

	
	public int tirar() {
		
		Random aleatorio = new Random();
		
		return  aleatorio.nextInt(6)+1;
		
	}

	
}
