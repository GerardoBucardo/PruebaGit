public class App {
    public static void main(String[] args){
        Futbolista f = new Futbolista();
        Entrenador e = new Entrenador();
        Masajista m = new Masajista();

        f.setId(1);
        f.setNombres("John");
        f.setApellidos("Charles");
        f.setEdad(23);
        f.setDorsal(1);
        f.setRemarcacion("Genial");

        System.out.println("Id: " + f.getId()
                + "\nNombres: " + f.getNombres()
                + "\nApellidos: " + f.getApellidos()
                + "\nEdad: " + f.getEdad()
                + "\nDorsal: " + f.getDorsal()
                + "\nRemarcacion: " + f.getRemarcacion());

        f.Concentrarse();
        f.Viajar();
        f.JugarPartido();
        f.Entrenar();
        System.out.println("");

        e.setId(2);
        e.setNombres("Jim");
        e.setApellidos("C");
        e.setEdad(19);
        e.setFederacion("f-zero");

        System.out.println("Id: " + e.getId()
                + "\nNombres: " + e.getNombres()
                + "\nApellidos: " + e.getApellidos()
                + "\nEdad: " + e.getEdad()
                + "\nFederación: " + e.getFederacion());

        e.Concentrarse();
        e.Viajar();
        e.DirigirPartido();
        e.DirigirEntrenamiento();
        System.out.println("");

        m.setId(3);
        m.setNombres("Jil");
        m.setApellidos("Bryan");
        m.setEdad(31);
        m.setTitulacion("principiante");
        m.setAñosDeExperiencia(2);

        System.out.println("Id: " + m.getId()
                + "\nNombres: " + m.getNombres()
                + "\nApellidos: " + m.getApellidos()
                + "\nEdad: " + m.getEdad()
                + "\nTitulacion: " + m.getTitulacion()
                + "\nAños de Experiencia: " + m.getAñosDeExperiencia());

        m.Concentrarse();
        m.Viajar();
        m.DarMasaje();
        System.out.println("");
    }
}
