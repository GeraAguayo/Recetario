import javax.swing.JOptionPane;

public class PanEsponja {
    //Ingredientes tamaño chico
    private String clarasChico = "2 claras y media";
    private String azucarChico = "62.5 gramos de azúcar";
    private String yemasChico = "2 yemas y media";
    private String vainillaChico = "1 cucharadita de vainilla";
    private String harinaChico = "31.25 gramos de harina cernida";
    private String agua = "Unas gotitas de agua";

    //Ingredientes tamaño mediano
    private String clarasMediano = "5 claras";
    private String azucarMediano = "125 gramos de azúcar";
    private String yemasMediano = "5 yemas";
    private String vainillaMediano = "2 cucharaditas de vainilla";
    private String harinaMediano = "150 gramos de harina cernida";
    //Se usa la misma variable de agua para todas las porciones

    //Ingredientes tamaño grande
    private String clarasGrande = "10 claras";
    private String azucarGrande = "250 gramos de azúcar";
    private String yemasGrande = "10 yemas";
    private String vainillaGrande = "4 cucharaditas de vainilla";
    private String harinaGrande = "300 gramos de harina cernida";
    //Se usa la misma variable de agua para todas las porciones

    //Procedimiento (Mismo para todas las porciones)
    private String procedimiento = "1. Batimos las claras en la batidora, cuando estas empiecen a montar" +
            "\nañadir el azúcar poco a poco, y seguir batiendo hasta que este dura y forme picos" +
            "\n2. Aparte en un tazón mezclar las yemas con la vainilla y revolver bien" +
            "\n3. Verter en el tazón de las claras y mezcla suavemente con una espátula," +
            "\nhaciendolo con movimientos suaves y envolventes" +
            "\n4. Vertemos la masa en un molde y horneamos a 180°C durante 25 minutos";

    //Mostrar procedimiento
    public void mostrarProcedimiento(){
        JOptionPane.showMessageDialog(null,procedimiento);
    }

    //Mostrar receta porcion chica
    public void mostrarRecetaChica(){
        JOptionPane.showMessageDialog(null,"PAN ESPONJA PORCION CHICA" +
                "\nIngredientes:" +
                "\n"+clarasChico+
                "\n"+azucarChico+
                "\n"+yemasChico+
                "\n"+vainillaChico+
                "\n"+harinaChico+
                "\n"+agua+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta porcion mediana
    public void mostrarRecetaMediana(){
        JOptionPane.showMessageDialog(null,"PAN ESPONJA PORCION MEDIANA" +
                "\nIngredientes:" +
                "\n"+clarasMediano+
                "\n"+azucarMediano+
                "\n"+yemasMediano+
                "\n"+vainillaMediano+
                "\n"+harinaMediano+
                "\n"+agua+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta porcion grande
    public void mostrarRecetaGrande(){
        JOptionPane.showMessageDialog(null,"PAN ESPONJA PORCION GRANDE" +
                "\nIngredientes:" +
                "\n"+clarasGrande+
                "\n"+azucarGrande+
                "\n"+yemasGrande+
                "\n"+vainillaGrande+
                "\n"+harinaGrande+
                "\n"+agua+
                "\n"+
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }
}
