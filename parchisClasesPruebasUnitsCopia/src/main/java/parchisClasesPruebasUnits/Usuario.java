package parchisClasesPruebasUnits;

public class Usuario extends Jugador{
	
	private String nombreUsuario;
	private String contrasenia;
	private Ficha[] fichas;
	private Dado dado;
	
	
	public Usuario() {
		this.nombreUsuario = "";
		this.contrasenia = "";
		this.fichas = new Ficha[2];
		this.dado = new Dado();
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreUsuario;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}
	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	/**
	 * @return the fichas
	 */
	public Ficha[] getFichas() {
		return fichas;
	}
	/**
	 * @param fichas the fichas to set
	 */
	public void setFichas(Ficha[] fichas) {
		this.fichas = fichas;
	}
	
	
	/**
	 * @return the dado
	 */
	public Dado getDado() {
		return dado;
	}
	/**
	 * @param dado the dado to set
	 */
	public void setDado(Dado dado) {
		this.dado = dado;
	}
	
	public boolean login(String nombreUsuario, String contrasenia) {
		if(this.nombreUsuario.equalsIgnoreCase(nombreUsuario) && this.contrasenia.equals(contrasenia)) {
			return true;
			
		}
		else return false;
	}
	public void pruebaGit() {
		// es para probar el git
		// prueba 2
		//prueba 3
	}

}
