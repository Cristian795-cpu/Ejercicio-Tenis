public class Player {
    //Atributos
    private String nombre;
    private int puntaje;

    //constructor
    public Player(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //ToString
    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
