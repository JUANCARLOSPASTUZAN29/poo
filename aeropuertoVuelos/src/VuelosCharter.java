public class VuelosCharter extends Vuelos{
      protected String tipoVueloCh;
      protected String date;

    public VuelosCharter(String codigoAeropuerto, String aeropuerto$Origen,String date, String earopuerto$Destino, String duracionVuelo, String aerolinea, String tipoAvion, int capacidadPasajeros,String tipoVueloCh) {
        super(codigoAeropuerto, aeropuerto$Origen, earopuerto$Destino,  duracionVuelo, aerolinea, tipoAvion, capacidadPasajeros);
        this.tipoVueloCh=tipoVueloCh;
        this.date=date;
    }

   public  void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("tipo Vuelo"+ this.tipoVueloCh);
       System.out.println("Días : horarios de salida o Nombre del Paquete "+this.date);

    }
}
