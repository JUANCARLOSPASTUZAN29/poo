import java.util.ArrayList;
import java.util.List;

public class ListaAeropuertos {
    protected List<Aeropuerto> listaAeropuerto;

    public ListaAeropuertos() {
        this.listaAeropuerto=new ArrayList<>();


    }

    public void mostrarAeropuertos( ) {
        System.out.println("id |  codigo |  Nombre de Aeropuerto        |        pais       | Zona Horarica");
         for (Aeropuerto i:listaAeropuerto){
             i.imprimirInfo();


         }
    }
}
