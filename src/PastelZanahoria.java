import javax.swing.JOptionPane;

public class PastelZanahoria {
    //Ingredientes chico
    private String zanahoriaChico = "1 taza de zanahoria rayada";
    private String aceiteChico = "1/2 taza de aceite";
    private String canelaChico = "1/2 cucharada de canela";
    private String azucarChico = "1 taza de azúcar";
    private String huevoChico = "2 huevos";
    private String harinaChico = "1 taza de harina";
    private String nuezChico = "1/4 taza de nueces picadas";

    //Ingredientes mediano
    private String zanahoriaMediano = "2 tazas de zanahoria rayada";
    private String aceiteMediano = "1 taza de aceite";
    private String canelaMediano = "1 cucharada de canela";
    private String azucarMediano = "2 tazas de azúcar";
    private String huevoMediano = "4 huevos";
    private String harinaMediano = "2 tazas de harina";
    private String nuezMediano = "1/2 taza de nueces picadas";

    //Ingredientes grande
    private String zanahoriaGrande = "4 tazas de zanahoria rayada";
    private String aceiteGrande = "2 tazas de aceite";
    private String canelaGrande = "2 cucharadas de canela";
    private String azucarGrande = "4 tazas de azúcar";
    private String huevoGrande = "8 huevos";
    private String harinaGrande = "4 tazas de harina";
    private String nuezGrande = "1 taza de nueces picadas";

    //Procedimiento (El mismo para todos los tamaños)
    private String procedimiento = "1. Se ciernen todos los ingredientes secos" +
            "\n2. Bato el aceite, el azúcar, y los huevos uno a uno" +
            "\n3. Se agregan los ingredientes secos y mezclo";

    //Metodo getter para el procedimiento
    public String getProcedimiento(){
        return procedimiento;
    }

    //Mostrar receta tamaño chico
    public void mostrarRecetaChico(){
        JOptionPane.showMessageDialog(null, "PASTEL DE ZANAHORIA TAMAÑO CHICO" +
                "\nIngredientes:" +
                "\n"+zanahoriaChico+
                "\n"+aceiteChico+
                "\n"+canelaChico+
                "\n"+azucarChico+
                "\n"+huevoChico+
                "\n"+harinaChico+
                "\n"+nuezChico+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño mediano
    public void mostrarRecetaMediano(){
        JOptionPane.showMessageDialog(null, "PASTEL DE ZANAHORIA TAMAÑO MEDIANO" +
                "\nIngredientes:" +
                "\n"+zanahoriaMediano+
                "\n"+aceiteMediano+
                "\n"+canelaMediano+
                "\n"+azucarMediano+
                "\n"+huevoMediano+
                "\n"+harinaMediano+
                "\n"+nuezMediano+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño grande
    public void mostrarRecetaGrande(){
        JOptionPane.showMessageDialog(null, "PASTEL DE ZANAHORIA TAMAÑO GRANDE" +
                "\nIngredientes:" +
                "\n"+zanahoriaGrande+
                "\n"+aceiteGrande+
                "\n"+canelaGrande+
                "\n"+azucarGrande+
                "\n"+huevoGrande+
                "\n"+harinaGrande+
                "\n"+nuezGrande+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

}
