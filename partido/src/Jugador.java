
public class Jugador {

	public String nombre;
	public int edad;
	public int numeroDorsal;
	public int numeroTarjetasAmarillas = 0;
	public int numeroTarjetasRojas = 0;
	public String nacionalidad;
	public int golesMarcadosCampeonato = 0;
	public String Posicion;
	public float sueldoMensual = 0;
	
	Jugador(String nombre, int edad, String nacionalidad, float sueldoMensual) {
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.sueldoMensual = sueldoMensual;
	}
}
