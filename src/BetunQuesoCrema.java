import javax.swing.JOptionPane;

public class BetunQuesoCrema {
    //Atributos queso crema chico
    private String mantequillaChico = "100 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarChico = "300 gr de azucar glass";
    private String quesoCremaChico = "100 gr de queso crema (tipo philadelphia)";
    private String lecheChico = "2 cucharaditas de leche semidesnatada";

    //Atributos queso crema mediano
    private String mantequillaMediano = "200 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarMediano = "600 gr de azucar glass";
    private String quesoCremaMediano = "200 gr de queso crema (tipo philadelphia)";
    private String lecheMediano = "4 cucharaditas de leche semidesnatada";

    //Atributos queso crema grande
    private String mantequillaGrande = "300 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarGrande = "900 gr de azucar glass";
    private String quesoCremaGrande = "300 gr de queso crema (tipo philadelphia)";
    private String lecheGrande = "6 cucharaditas de leche semidesnatada";

    //Metodo de preparacion(El mismo para todos los tamaños)
    private String procedimiento = "1. Tamizamos el azúcar glass y lo colocamos en un bol junto con la mantequilla y la leche" +
            "\n2. Cubriendo el bol, batimos a velocidad baja un minuto" +
            "\n3. Después subimos la velocidad y batimos al menos otros 2 minutos a velocidad media-alta" +
            "\n4. Añadimos el queso crema (frío), subimos la velocidad y batimos al menos otros 3 minutos" +
            " a velocidad media-alta, hasta que la mezcla esté integrada y compacta";

    //Metodo getter para el procedimiento
    public String getProcedimiento(){
        return procedimiento;
    }

    //Mostrar tamaño chico
    public void mostrarRecetaChico(){
        JOptionPane.showMessageDialog(null,"BETUN DE QUESO CREMA TAMAÑO CHICO" +
                "\nIngredientes:" +
                "\n"+mantequillaChico+
                "\n"+azucarChico+
                "\n"+quesoCremaChico+
                "\n"+lecheChico+
                "\n"+
                "\nProcedimiento: " +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño mediano
    public void mostrarRecetaMediano(){
        JOptionPane.showMessageDialog(null,"BETUN DE QUESO CREMA TAMAÑO MEDIANO" +
                "\nIngredientes:" +
                "\n"+mantequillaMediano+
                "\n"+azucarMediano+
                "\n"+quesoCremaMediano+
                "\n"+lecheMediano+
                "\n"+
                "\nProcedimiento: " +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño grande
    public void mostrarRecetaGrande(){
        JOptionPane.showMessageDialog(null,"BETUN DE QUESO CREMA TAMAÑO GRANDE" +
                "\nIngredientes:" +
                "\n"+mantequillaGrande+
                "\n"+azucarGrande+
                "\n"+quesoCremaGrande+
                "\n"+lecheGrande+
                "\n"+
                "\nProcedimiento: " +
                "\n"+procedimiento);
    }


}
