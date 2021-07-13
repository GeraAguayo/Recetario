import javax.swing.JOptionPane;

public class GlaceReal {
    //Ingredientes chico
    private String huevoChico = "1/2 clara de huevo grande";
    private String azucarChico = "1 taza de azúcar glass";
    private String cremorChico = "1/4 cucharadita de cremor tartaro";

    //Ingredientes mediano
    private String huevoMediano = "1 clara de huevo grande";
    private String azucarMediano = "2 tazas de azúcar glass";
    private String cremorMediano = "1/2 cucharadita de cremor tártaro";

    //Ingredientes grande
    private String huevoGrande = "2 claras de huevo grande";
    private String azucarGrande = "4 tazas  de azúcar glass";
    private String cremorGrande = "1 cucharadita de cremor tártaro";

    //Procedimiento(el mismo para todos los tamaños)
    private String procedimiento = "1. Coloque los ingredientes en un tazón mediano y con una batidora a baja" +
            "\nvelocidad batir hasta que se mezcle. Aumentar la velocidad y batir por 7-10 minutos" +
            "\nhasta formar una pasta firme" +
            "\n" +
            "\n2. Luego incorporar el color deseado de colorante vegetal";

    //Mostrar procedimiento
    public void mostrarProcedimiento(){
        JOptionPane.showMessageDialog(null,procedimiento);
    }

    //Mostrar receta porcion chica
    public void recetaChico(){
        JOptionPane.showMessageDialog(null,"GLACÉ REAL PORCION CHICA" +
                "\nIngredientes:" +
                "\n"+huevoChico+
                "\n"+azucarChico+
                "\n"+cremorChico+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta porcion mediana
    public void recetaMediana(){
        JOptionPane.showMessageDialog(null,"GLACÉ REAL PORCION MEDIANA" +
                "\nIngredientes:" +
                "\n"+huevoMediano+
                "\n"+azucarMediano+
                "\n"+cremorMediano+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta porcion grande
    public void recetaGrande(){
        JOptionPane.showMessageDialog(null,"GLACÉ REAL PORCION GRANDE" +
                "\nIngredientes:" +
                "\n"+huevoGrande+
                "\n"+azucarGrande+
                "\n"+cremorGrande+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }
}
