public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(34);
        persona.setName("Cristian");
        persona.setTelefono("305 7660000");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int valor) {
        this.edad = valor;
    }

    public void setName(String valor) {
        this.nombre = valor;
    }

    public void setTelefono(String valor) {
        this.telefono = valor;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
}
