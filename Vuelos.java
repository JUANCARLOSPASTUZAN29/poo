public class Vuelos {
   protected String aeropuerto$Origen;
   protected String earopuerto$Destino;
    protected String duracionVuelo;
   protected String codigoAeropuerto;
   protected String aerolinea;
   protected String tipoAvion;
    protected int capacidadPasajeros;

    public Vuelos(String codigoAeropuerto,String aeropuerto$Origen, String earopuerto$Destino, String duracionVuelo,String aerolinea,String tipoAvion, int capacidadPasajeros) {
        this.codigoAeropuerto=codigoAeropuerto;
        this.aeropuerto$Origen = aeropuerto$Origen;
        this.earopuerto$Destino = earopuerto$Destino;
        this.duracionVuelo = duracionVuelo;
        this.aerolinea=aerolinea;
        this.tipoAvion=tipoAvion;
        this.capacidadPasajeros=capacidadPasajeros;
    }
    public void imprimirInfo(){
        System.out.println("Codigo Aeropuerto: "+this.codigoAeropuerto);
        System.out.print("Origen: "+this.aeropuerto$Origen);
        System.out.println("Destino: "+this.earopuerto$Destino);
        System.out.println("Duracion: "+this.duracionVuelo);
        System.out.println("Aerolinea: "+this.aerolinea);
        System.out.println("tipoAvion: "+this.tipoAvion);
        System.out.println("maximo Pasajeros" +  this.capacidadPasajeros);

    }
}
