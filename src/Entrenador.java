public class Entrenador extends Padre{
    private String federacion;

    @Override
    public void Concentrarse(){
        System.out.println("Tercer Acto");
    }
    @Override
    public void Viajar(){
        System.out.println("Tercer Acto");
    }
    public void DirigirPartido(){
        System.out.println("El entrenador dirige el partido");
    }
    public void DirigirEntrenamiento(){
        System.out.println("El entrenador dirige el entrenamiento");
    }

    public Entrenador(){

    }
    public Entrenador(int pId, String pNombres, String pApellidos, int pEdad, String pFederacion) {
        super(pId, pNombres, pApellidos, pEdad);
        this.federacion = federacion;
    }

    public void setFederacion(String pFederacion) {
        this.federacion = pFederacion;
    }

    public String getFederacion() {
        return federacion;
    }
}
