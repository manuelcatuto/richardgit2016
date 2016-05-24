
public class Equipo {
	//Varibles
	 public String nombre;
	 public int cantidadJugadores;
	 public int anioFundacion;
	 public String directorTecnico;
	 public int campeonatosGanados = 0;
	 public char categoria;
	 public String ciudadLocalia;
	 public String estadio;
	 public int cantidadSocios;
	 public String presidente;
	 public float presupuesto = 0;
	 public String[] sponsors;
	 public Jugador[] jugadores;
	 
	 Equipo(String nombre, int anioFundacion, String dt,
	 int campeonatosGanados, char categoria, 
	 String ciudad, String estadio, int cantidadSocios,
	 String presidente, float presupuesto){
	 this.nombre = nombre;
	 this.anioFundacion = anioFundacion;
	 this.directorTecnico = dt;
	 this.campeonatosGanados = campeonatosGanados;
	 this.categoria = categoria;
	 this.ciudadLocalia = ciudad;
	 this.estadio = estadio;
	 this.cantidadSocios = cantidadSocios;
	 this.presidente = presidente;
	 this.presupuesto = presupuesto;
	 jugadores = new Jugador[11];
	 }
	 public void cambiarCategoria(char nuevaCategoria)
	 {
	 	this.categoria = nuevaCategoria;
	 }
	
	 public void campeonar()
	 {
	 	campeonatosGanados++;
	 }

	 public void cambiarDT(String nuevoDT)
	 {
		this.directorTecnico = nuevoDT;
	 }

	 public void contratarJugador(Jugador nuevoJugador)
	 {
		int indice = jugadores.length;
	 	this.jugadores[0]= nuevoJugador;
	 }

}
