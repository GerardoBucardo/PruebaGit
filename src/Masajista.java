public class Masajista extends Padre{
    private String titulacion;
    private int añosDeExperiencia;

    @Override
    public void Concentrarse(){
        System.out.println("Cuarto Acto");
    }
    @Override
    public void Viajar(){
        System.out.println("Cuarto Acto");
    }
    public void DarMasaje(){
        System.out.println("El masajista da un masjae al jugador");
    }

    public Masajista(){

    }
    public Masajista(int pId, String pNombres, String pApellidos, int pEdad, String pTitulacion, int pAñosDeExperiencia) {
        super(pId, pNombres, pApellidos, pEdad);
        this.titulacion = titulacion;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public void setTitulacion(String pTitulacion) {
        this.titulacion = pTitulacion;
    }

    public void setAñosDeExperiencia(int pAñosDeExperiencia) {
        this.añosDeExperiencia = pAñosDeExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }
}

