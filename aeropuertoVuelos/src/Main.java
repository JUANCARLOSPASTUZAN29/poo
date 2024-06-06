import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaAeropuertos listaAeropuertos=new ListaAeropuertos();
        //lista de Aeropuertos
       Aeropuerto aero1=new Aeropuerto( 1,"BCN01","Barcelona - El Prat","España",1);
       listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"MAD01","Madrid - Barajas","España",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"PAR01","Pris - Orly","Francia",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"LON01","London - Heathrow","Gran Bretaña",1));
        listaAeropuertos.listaAeropuerto.add(new Aeropuerto(1,"SPA01","Sao Paulo - Guarulhos","Brasil",-3));
     //Lista de Vuelos regular
        /**
         * llenar Datos sobre cas lista
         * <p>se realiza la adicion de datos sobre el codigo  teniendo en cuenta el taller redactado por el docente</p>*/
         ListaVuelos listaVuelos=new ListaVuelos();
        listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:00", "MAD01","Iberia","Airbus",150,"R"));
        listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:00", "MAD01","Iberia","Airbus",150,"R"));
         listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:05","LON01", "British Air","Boeing",150,"R") );
         listaVuelos.listaVuelos.add(new VuelosRegular("LON01","LON01","01:05","BCN01","British Air", "Boeing",180,"R"));
         listaVuelos.listaVuelos.add(new VuelosRegular("BCN01","BCN01","01:10","LON01","Ryan Air", "Airbus",120,"R"));
         listaVuelos.listaVuelos.add(new VuelosRegular("LON01","LON01","01:10","BCN01","Ryan Air","Airbus",120,"R"));
         listaVuelos.listaVuelos.add(new VuelosRegular("LON01","LON01","07:00","SPA01","British Air","Boeing",200,"R"));
         listaVuelos.listaVuelos.add(new VuelosRegular("SPA01","SPA01","07:00","MAD01","British Air","Boeing",200,"T"));
         //Lista de Vuelos Char
        listaVuelos.listaVuelos.add(new VuelosCharter("BCN01","MAD01","Viajes Condor;1/2009/15 20:30","MAD01", "01:00","Spanair","Airbus",150,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("BCN01","BCN01","Viajes Condor;1/2009/15 20:30", "MAD01","01:00","Spanair","Airbus",150,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("MAD01","MAD01","Viajes Condor;1/2009/22 20:30", "BCN01","01:00","Iberia","Airbus",150,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("BCN01","BCN01","Viaje Ilusion;2/2009/22 20:30","LON01", "01:00","British Air","Boeing",180,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("LON01","LON01","Viaje Ilusion;3/2009/05 15:19","BCN01","01:00","British Air","Boeing",180,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("LON01","LON01","Viaje Ilusion;3/2009/05 15:19","BCN01", "01:00","British Air","Boeing",180,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("BCN01","BCN01","TravelPlan;1/2009/25 15:18","LON01", "01:00","Ryan Air","Airbus",120,"c"));
        listaVuelos.listaVuelos.add(new VuelosCharter("SPA01","SPA01","TravelPlan;1/2009/31 22:20","SPA01","01:00", "Ryan Air","Airbus",120,"C"));
        listaVuelos.listaVuelos.add(new VuelosCharter("SIB01","SIB01","TravelPlan;1/2009/31 22:20","SPA01", "01:00","Ryan Air","Airbus",120,"C"));


        listaAeropuertos.listaAeropuerto.add(aero1);
        listaAeropuertos.mostrarAeropuertos();
        listaVuelos.mostrarVuelos();

    }
}