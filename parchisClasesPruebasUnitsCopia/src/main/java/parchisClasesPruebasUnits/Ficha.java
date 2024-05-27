package parchisClasesPruebasUnits;

public class Ficha {
	
	private String color;
	private int casilla;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the casilla
	 */
	public int getCasilla() {
		return casilla;
	}
	/**
	 * @param casilla the casilla to set
	 */
	public void setCasilla(int casilla) {
		this.casilla = casilla;
	}
	
	
	public void mover(int nuevaPosicion) {
		
		this.casilla += nuevaPosicion;
	}

}
