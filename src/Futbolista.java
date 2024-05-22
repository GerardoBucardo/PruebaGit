public class Futbolista extends Padre {
    private int dorsal;
    private String remarcacion;

    @Override
    public void Concentrarse(){
        System.out.println("Segundo Acto");
    }
    @Override
    public void Viajar(){
        System.out.println("Segundo Acto");
    }
    public void JugarPartido(){
        System.out.println("El jugador patea la pelota");
    }
    public void Entrenar(){
        System.out.println("El jugador entrena");
    }

    public Futbolista(){

    }
    public Futbolista(int pId, String pNombres, String pApellidos, int pEdad, int pDorsal, String pRemarcacion) {
        super(pId, pNombres, pApellidos, pEdad);
        this.dorsal = dorsal;
        this.remarcacion = remarcacion;
    }

    public void setDorsal(int pDorsal) {
        this.dorsal = pDorsal;
    }

    public void setRemarcacion(String pRemarcacion) {
        this.remarcacion = pRemarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getRemarcacion() {
        return remarcacion;
    }
}
