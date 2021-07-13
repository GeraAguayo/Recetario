import javax.swing.JOptionPane;

public class BizcochoVainilla {
    //Atributos del tamaño mini
    private String mantequillaMini = "115 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarBlancoMini = "200 gr de azúcar blanco";
    private String huevosMini = "3 huevos medianos";
    private String harinaMini = "200 gr de harina";
    private String levaduraMini = "1 cucharadita y media de levadura royal";
    private String lecheMini = "120 mlt de leche semidesnatada";
    private String vainillaMini = "1 cucharadita de extracto de vainilla";

    //Atributos del tamaño chico
    private String mantequillaChico = "230 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarBlancoChico = "400 gr de azúcar blanco";
    private String huevosChico = "6 huevos medianos";
    private String harinaChico = "400 gr de harina";
    private String levaduraChico = "3 cucharaditas de levadura royal";
    private String lecheChico = "240 mlt de leche semidesnatada";
    private String vainillaChico = "2 cucharaditas de extracto de vainilla";

    //Atributos del tamaño grande
    private String mantequillaGrande = "345 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarBlancoGrande = "600 gr de azúcar blanco";
    private String huevosGrande = "9 huevos medianos";
    private String harinaGrande = "600 gr de harina";
    private String levaduraGrande = "4 cucharaditas y media de levadura royal";
    private String lecheGrande = "360 mlt de leche semidesnatada";
    private String vainillaGrande = "3 cucharaditas de extracto de vainilla";

    //Atrubutos del tamaño gigante
    private String mantequillaGigante = "460 gr de mantequilla sin sal a temperatura ambiente";
    private String azucarBlancoGigante = "800 gr de azúcar blanco";
    private String huevosGigante = "12 huevos medianos";
    private String harinaGigante = "800 gr de harina";
    private String levaduraGigante = "6 cucharaditas de levadura royal";
    private String lecheGigante = "480 mlt de leche semidesnatada";
    private String vainillaGigante = "4 cucharaditas de extracto de vainilla";

    //Metodo de preparacion(El mismo para los 4 tamaños)
    private String metodoPreparacion = "1. Enharinamos el molde que vayamos a utilizar" +
            "\n2. Tamizamos la harina con la levadura química en un bol y reservamos" +
            "\n3. Batimos la mantequilla con el azúcar hasta que se integren y la mezcla se aclare" +
            "\n4. Añadimos los huevos, uno a uno, batiendo hasta que se incorporen" +
            "\n5. Agrgamos la mitad de la harina y batimos a velocidad baja hasta que se incorpore" +
            "\n6. A continuación, añadimos la leche, mezclada con el extracto de vainilla, y volvemos a batir" +
            "\n7. Agregamos la otra mitad de la harina y batimos a velocidad baja hasta que la mezcla sea homogénea" +
            "\n8. Horneamos de 22 a 25 minutos o hasta que un palillo salga limpio";


    //Getter y setter metodo de preparacion
    public String getMetodoPreparacion()
    {
        return metodoPreparacion;
    }

    public void setMetodoPreparacion()
    {
        this.metodoPreparacion  = metodoPreparacion;
    }

    //Mostrar la receta para el bizcocho tamaño mini
    public void mostrarRecetaBizcochoMini(){
        JOptionPane.showMessageDialog(null,"BIZCOCHO DE VAINILLA TAMAÑO MINI" +
                "\nIngredientes:" +
                "\n"+mantequillaMini+
                "\n"+azucarBlancoMini+
                "\n"+huevosMini+
                "\n"+harinaMini+
                "\n"+levaduraMini+
                "\n"+lecheMini+
                "\n"+vainillaMini+
                "\n"+
                "\nProcedimiento:"+
                "\n"+metodoPreparacion);
    }

    public void mostrarRecetaBizcochoChico(){
        JOptionPane.showMessageDialog(null,"BIZCOCHO DE VAINILLA TAMAÑO CHICO" +
                "\nIngredientes:" +
                "\n"+mantequillaChico+
                "\n"+azucarBlancoChico+
                "\n"+huevosChico+
                "\n"+harinaChico+
                "\n"+levaduraChico+
                "\n"+lecheChico+
                "\n"+vainillaChico+
                "\n"+
                "\nProcedimiento:"+
                "\n"+metodoPreparacion);
    }

    public void mostrarRecetaBizcochoGrande(){
        JOptionPane.showMessageDialog(null,"BIZCOCHO DE VAINILLA TAMAÑO GRANDE" +
                "\nIngredientes:" +
                "\n"+mantequillaGrande+
                "\n"+azucarBlancoGrande+
                "\n"+huevosGrande+
                "\n"+harinaGrande+
                "\n"+levaduraGrande+
                "\n"+lecheGrande+
                "\n"+vainillaGrande+
                "\n"+
                "\nProcedimiento:"+
                "\n"+metodoPreparacion);

    }

    public void mostrarRecetaBizcochoGigante(){
        JOptionPane.showMessageDialog(null,"BIZCOCHO DE VAINILLA TAMAÑO GIGANTE" +
                "\nIngredientes:" +
                "\n"+mantequillaGigante+
                "\n"+azucarBlancoGigante+
                "\n"+huevosGigante+
                "\n"+harinaGigante+
                "\n"+levaduraGigante+
                "\n"+lecheGigante+
                "\n"+vainillaGigante+
                "\n"+
                "\nProcedimiento:"+
                "\n"+metodoPreparacion);

    }
}
