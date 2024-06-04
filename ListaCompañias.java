import java.util.ArrayList;
import java.util.List;

public class ListaCompañias {
    List<Compañia> $listaCompañias;

    public ListaCompañias(List<Compañia> $listaCompañias) {
        this.$listaCompañias = new ArrayList<>();
    }
    public void mostrarCompañias(){
        for (Compañia i: $listaCompañias){
            System.out.println("Compañias : "+i);
        }
    }
}
