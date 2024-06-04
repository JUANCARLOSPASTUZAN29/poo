public class VuelosRegular extends Vuelos{
          protected String tipoVueloR;

    public VuelosRegular(String codigoAeropuerto, String aeropuerto$Origen, String duracionVuelo,String earopuerto$Destino,  String aerolinea, String tipoAvion, int capacidadPasajeros, String tipoVueloR) {
        super(codigoAeropuerto, aeropuerto$Origen, earopuerto$Destino, duracionVuelo, aerolinea, tipoAvion, capacidadPasajeros);
        this.tipoVueloR = tipoVueloR;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("tipoVuelo" +tipoVueloR);
    }
}
