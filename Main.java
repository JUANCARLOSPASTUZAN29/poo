public class Main {
    public static void main(String[] args) {
        ListaAeropuertos listaAeropuertos=new ListaAeropuertos();
       Aeropuerto aero1=new Aeropuerto( 1,"BCN01","Barcelona - El Prat","España",1);
       listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"MAD01","Madrid - Barajas","España",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"PAR01","Pris - Orly","Francia",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"LON01","London - Heathrow","Gran Bretaña",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"SPA01","Sao Paulo - Guarulhos","Brasil",-3));

         ListaVuelos listaVuelos=new ListaVuelos();
        listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:00",
                "MAD01","Iberia","Airbus",150,"R"));
        listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:00",
                "MAD01","Iberia","Airbus",150,"R"));


        listaAeropuertos.listaAeropuerto.add(aero1);
        listaAeropuertos.mostrarAeropuertos();
        listaVuelos.mostrarVuelos();

    }
}