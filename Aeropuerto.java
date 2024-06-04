public class Aeropuerto {


        //código, nombre, población, país y GMT.
        protected  int id;
        protected   String codigo;
        protected String nombre;
        protected String pais;
        protected int zonaHorarica;


        public Aeropuerto(int id, String codigo, String nombre, String pais, int zonaHorarica) {
            this.id = id;
            this.codigo = codigo;
            this.nombre = nombre;
            this.pais = pais;
            this.zonaHorarica = zonaHorarica;

        }

        public void imprimirInfo(){
            System.out.println(id+"   "+"codigo  "+this.codigo+"  nombre: "+this.nombre  +  "pais:   "+this.pais+"ZonarHorarica:  "+zonaHorarica);

        }

}
