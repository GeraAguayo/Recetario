import javax.swing.JOptionPane;

public class GalletasMantequilla {

    //Ingredientes  porcion chica
    private String mantequillaChico = "125gr de mantequilla a temperatura ambiente";
    private String azucarChico = "62gr de azúcar glass";
    private String huevoChico = "1/2 huevo (Si el huevo es pequeño pondremos 1/2 huevo y 1/2 yema)";
    private String vainillaChico = "1/2 tsp o cucharadita de vainilla en pasta";
    private String harinaChico = "240 gr de harina y 20 gr extras para espolvorear sobre la superficie de amasado";

    //Ingredientes  porcion mediana
    private String mantequillaMediano = "250gr de mantequilla a temperatura ambiente";
    private String azucarMediano = "125gr de azúcar glass";
    private String huevoMediano = "1 huevo (Si el huevo es pequeño pondremos 1 huevo y 1 yema)";
    private String vainillaMediano = "1 tsp o cucharadita de vainilla en pasta";
    private String harinaMediano = "480 gr de harina y 20 gr extras para espolvorear sobre la superficie de amasado";

    //Ingredientes  porcion grande
    private String mantequillaGrande = "500gr de mantequilla a temperatura ambiente";
    private String azucarGrande = "250gr de azúcar glass";
    private String huevoGrande = "2 huevos (Si el huevo es pequeño pondremos 2 huevos y 2 yemas)";
    private String vainillaGrande = "2 tsp o cucharaditas de vainilla en pasta";
    private String harinaGrande = "960 gr de harina y 20 gr extras para espolvorear sobre la superficie de amasado";

    //Procedimiento(Mismo para todas las porciones)
    private String procedimiento = "1. Empezamos batir la masa por el menor tiempo posible, para que esta no tenga aire" +
            "\n2. En el bol de la batidora ponemos la mantequilla y el azúcar a velocidad baja baja" +
            "\ndurante un minuto" +
            "\n3. Añadimos el huevo y la vainilla a nuestra mezcla y batimos durante 1 minuto más" +
            "\n4. Despegamos todo lo que este adherido al bol y volvemos a batir a una velocidad un poco más alta" +
            "\n5. Añadimos la harina a nuestra mezcla y batimos a baja velocidad hasta que la basa se pegue a " +
            "\nla pala de la batidora" +
            "\n6. Espolvoreamos la superficie de amasado con la harina, ponemos la masa de galletas" +
            "\ny amasamos a mano" +
            "\n7. Una vez que tengamos nuestra masa la dejaremos reposar durante 15 minutos" +
            "\n8. Para estirar la masa la cortamos en dos, cogemos una de las mitades y" +
            "\nla ponemos sobre papel de horno" +
            "\n9. Metemos la bandeja con la masa en la nevera y estiramos la otra" +
            "\nmitad siguiendo los mismos pasos" +
            "\n10. Vamos a dejar la masa en la nevera un mínimo de 2 horas con la nevera a 2°C" +
            "\n11. Para cortar las galletas sacamos la masa de la nevera, le quitamos" +
            "\nlos dos papeles de horno, las vamos cortando y poniendo sobre la bandeja en las que las vamos a hornear" +
            "\n12. Horneamos a 180°C entre 10 y 15 minutos, cuando los bordes comiencen a dorarse" +
            "\nlas galletas estaran listas";

    //Mostrar el procedimiento
    public void mostrarProcedimiento(){
        JOptionPane.showMessageDialog(null,procedimiento);
    }

    //Mostrar receta tamaño chico
    public void mostrarRecetaChica(){
        JOptionPane.showMessageDialog(null,"GALLETAS DE MANTEQUILLA PORCION PEQUEÑA" +
                "\nIngredientes:" +
                "\n"+mantequillaChico+
                "\n"+azucarChico+
                "\n"+huevoChico+
                "\n"+vainillaChico+
                "\n"+harinaChico+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño mediano
    public void mostrarRecetaMediana(){
        JOptionPane.showMessageDialog(null,"GALLETAS DE MANTEQUILLA PORCION MEDIANA" +
                "\nIngredientes:" +
                "\n"+mantequillaMediano+
                "\n"+azucarMediano+
                "\n"+huevoMediano+
                "\n"+vainillaMediano+
                "\n"+harinaMediano+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta tamaño grande
    public void mostrarRecetaGrande(){
        JOptionPane.showMessageDialog(null,"GALLETAS DE MANTEQUILLA PORCION GRANDE" +
                "\nIngredientes:" +
                "\n"+mantequillaGrande+
                "\n"+azucarGrande+
                "\n"+huevoGrande+
                "\n"+vainillaGrande+
                "\n"+harinaGrande+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }
}
