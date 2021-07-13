import javax.swing.JOptionPane;

public class BetunMantequillla {
    //Ingredientes normal
    private String mantequilla = "2 barritas de mantequilla(180 gr) sin sal a temperatura ambiente";
    private String azucar = "3 tazas y media de azucar glass(500 gr)";
    private String sal = "1 pizca de sal";
    private String vainilla = "1 chucharada de esencia de vainilla";
    private String leche = "3 cucharadas de leche (50 ml)";

    //Ingredientes grande
    private String mantequillaGrande = "4 barritas de mantequilla(360 gr) sin sal a temperatura ambiente";
    private String azucarGrande = "7 tazas de azucar glass(1000 gr)";
    private String salGrande = "2 pizcas de sal";
    private String vainillaGrande = "2 chucharadas de esencia de vainilla";
    private String lecheGrande = "6 cucharadas de leche (100 ml)";



    //Procedimiento
    private String procedimiento = "1. A velocidad media, bate la manteuilla, la sal, la vainilla y el azucar glass" +
            "\npor varios minutos hasta que veas que se aclaro un poco el color y tenga consistencia de betún" +
            "\n" +
            "\n2. Agrega la leche, y sigue batiendo sólo un minuto más," +
            "\nhasta que se integre y todo se vea esponjoso y cremoso";

    //Mostrar el procedimiento
    public void mostrarProcedimiento(){
        JOptionPane.showMessageDialog(null,procedimiento);
    }

    //Mostrar receta normal
    public void mostrarReceta(){
        JOptionPane.showMessageDialog(null,"BETÚN DE MANTEQUILLA" +
                "\nIngredientes:" +
                "\n"+mantequilla+
                "\n"+azucar+
                "\n"+sal+
                "\n"+vainilla+
                "\n"+leche+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

    //Mostrar receta grande
    public void mostrarRecetaGrande(){
        JOptionPane.showMessageDialog(null,"BETÚN DE MANTEQUILLA GRANDE" +
                "\nIngredientes:" +
                "\n"+mantequillaGrande+
                "\n"+azucarGrande+
                "\n"+salGrande+
                "\n"+vainillaGrande+
                "\n"+lecheGrande+
                "\n" +
                "\nProcedimiento:" +
                "\n"+procedimiento);
    }

}
