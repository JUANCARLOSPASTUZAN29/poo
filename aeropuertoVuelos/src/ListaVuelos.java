import java.util.ArrayList;
import java.util.List;

public class ListaVuelos {

protected List<Vuelos> listaVuelos;

    public ListaVuelos() {
        this.listaVuelos =new ArrayList<>();
    }
    public void mostrarVuelos(){
        System.out.println("Reporte Vuelos");
        for(Vuelos i:listaVuelos){
            i.imprimirInfo();
            System.out.println("");

        }
    }

}
