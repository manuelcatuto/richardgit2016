
public class SimularJuego {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Equipo barcelona = new Equipo("Barcelona", 1924, "almada", 15, 'A', "Guayaquil", "Monumental", 30, "Jose Francisco Cevallos", 800000000);
		Jugador messi = new Jugador("Messi", 29, "Argentino",(float)50000000);
		
		barcelona.contratarJugador(messi);
		Equipo emelec = new Equipo("Emelec", 1913, "Felipe", 12, 'B', "Guayaquil", "Cawpel", 20, "Nabsi Neme",(float)300000);
		Jugador palacios = new Jugador("Pablo Palacios", 31, "Ecuatoriano", 201143);
		emelec.contratarJugador(palacios);
		
     Partido clasico = new Partido (barcelona, emelec, barcelona.estadio, "Omar ponce", "15-Mayo-2016");
     
     clasico.aumentarGolLocal();
     clasico.aumentarGolLocal();
     clasico.aumentarGolLocal();
     clasico.aumentarGolLocal();
     clasico.aumentarGolLocal();
     
     clasico.amonestarAmarilla();
     clasico.amonestarRojas();
     
     System.out.println("El resultado fue: " + 
     clasico.local.nombre + " " + clasico.golesLocal + " - " + 
    		 clasico.golesVisitante + " - " + clasico.visitante.nombre );
	}

}
