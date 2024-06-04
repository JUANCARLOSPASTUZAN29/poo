public class VuelosCharter extends Vuelos{
      protected String tipoVueloCh;

    public VuelosCharter(String codigoAeropuerto, String aeropuerto$Origen, String earopuerto$Destino, String duracionVuelo, String aerolinea, String tipoAvion, int capacidadPasajeros,String tipoVueloCh) {
        super(codigoAeropuerto, aeropuerto$Origen, earopuerto$Destino,  duracionVuelo, aerolinea, tipoAvion, capacidadPasajeros);
        this.tipoVueloCh=tipoVueloCh;
    }

   public  void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("tipo Vuelo"+ this.tipoVueloCh);
    }
}
