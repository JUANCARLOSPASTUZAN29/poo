import java.util.ArrayList;
import java.util.List;

public class ListaAeropuertos {
    protected List<Aeropuerto> listaAeropuerto;

    public ListaAeropuertos() {
        this.listaAeropuerto=new ArrayList<>();


    }

    public void mostrarAeropuertos( ) {
         for (Aeropuerto i:listaAeropuerto){
             i.imprimirInfo();


         }
    }
}
