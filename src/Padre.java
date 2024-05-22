public class Padre {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;


    public void Concentrarse(){
        System.out.println("Primer Acto");
    }
    public void Viajar(){
        System.out.println("Primer Acto");
    }

    public Padre(){

    }
    public Padre(int pId, String pNombres, String pApellidos, int pEdad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        this.id = pId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String pNombres) {
        this.nombres = pNombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String pApellidos) {
        this.apellidos = pApellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }
}

