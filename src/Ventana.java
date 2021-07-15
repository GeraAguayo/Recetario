import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel imagen;
    private JButton btnBizcochoVainilla;
    private JButton btnGalletaMantequilla;
    private JButton btnBetunQuesoCrema;
    private JButton btnGlaceReal;
    private JButton btnPanEsponja;
    private JButton btnPastelZanahoria;
    private JButton btnBetunMantequilla;
    private JLabel etqTitulo;
    private JTextField respuestaUsr;
    private JButton btnBuscar;


    //Metodo constructor
    public Ventana(){
        this.setTitle("Recetario");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png")));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        //Lo que pasa si presiona el boton Betun de mantequilla
        btnBetunMantequilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                BetunMantequillla betun = new BetunMantequillla();
                //Lo que pasa si elige Chico
                if(x == 0){
                    betun.mostrarReceta();
                }
                //Lo que pasa si elige Grande
                else if(x == 1){
                    betun.mostrarRecetaGrande();
                }
            }
        });

        //Lo que pasa si elige el boton de Betun de Queso Crema
        btnBetunQuesoCrema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Mediano","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                BetunQuesoCrema betun = new BetunQuesoCrema();
                //Lo que pasa si elige Chico
                if(x == 0){
                    betun.mostrarRecetaChico();
                }
                //Lo que pasa si elige Mediano
                else if(x == 1){
                    betun.mostrarRecetaMediano();
                }
                //Lo que pasa si elige Grande
                else if(x == 2){
                    betun.mostrarRecetaGrande();
                }
            }
        });


        //Lo que pasa si elige el boton Bizcocho de Vainilla
        btnBizcochoVainilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Mini","Chico","Grande","Gigante"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                BizcochoVainilla bizcocho = new BizcochoVainilla();
                //Lo que pasa si elige Mini
                if(x == 0){
                    bizcocho.mostrarRecetaBizcochoMini();
                }
                //Lo que pasa si elige Chico
                else if(x == 1){
                    bizcocho.mostrarRecetaBizcochoChico();
                }
                //Lo que pasa si elige Grande
                else if(x == 2){
                    bizcocho.mostrarRecetaBizcochoGrande();
                }
                //Lo que pasa si elige Gigante
                else if (x == 3){
                    bizcocho.mostrarRecetaBizcochoGigante();
                }
            }
        });

        //Lo que pasa si elige Galletas de Mantequilla
        btnGalletaMantequilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Mediano","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                GalletasMantequilla galletas = new GalletasMantequilla();
                //Lo que pasa si elige Chico
                if (x == 0){
                    galletas.mostrarRecetaChica();
                }
                //Lo que pasa si elige Mediano
                else if(x == 1){
                    galletas.mostrarRecetaMediana();
                }
                //Lo que pasa si elige Grande
                else if(x == 2){
                    galletas.mostrarRecetaGrande();
                }
            }
        });

        //Lo que pasa si elige Glace Real
        btnGlaceReal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Mediano","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                GlaceReal glace = new GlaceReal();
                //Lo que pasa si elige Chico
                if(x == 0){
                    glace.recetaChico();
                }
                //Lo que pasa si elige Mediano
                else if(x == 1){
                    glace.recetaMediana();
                }
                else if(x == 2){
                    glace.recetaGrande();
                }
            }
        });

        //Lo que pasa si elige Pan ESponja
        btnPanEsponja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Mediano","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                PanEsponja pan = new PanEsponja();
                //Lo que pasa si elige Chico
                if(x == 0){
                    pan.mostrarRecetaChica();
                }
                //Lo que pasa si elige Mediano
                else if(x == 1){
                    pan.mostrarRecetaMediana();
                }
                //Lo que pasa si elige Grande
                else if(x == 2){
                    pan.mostrarRecetaGrande();
                }
            }
        });

        //Lo que pasa si elige Pastel de Zanahoria
        btnPastelZanahoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x;
                String[]opciones = {"Chico","Mediano","Grande"};
                x = JOptionPane.showOptionDialog(null,"Seleccione el tamaño del pastel","Recetario",0,JOptionPane.QUESTION_MESSAGE, null,opciones,"");
                PastelZanahoria pastel = new PastelZanahoria();
                //Lo que pasa si elige Chico
                if(x == 0){
                    pastel.mostrarRecetaChico();
                }
                //Lo que pasa si elige Mediano
                else if (x == 1){
                    pastel.mostrarRecetaMediano();
                }
                //Lo que pasa si elige Grande
                else if (x == 2){
                    pastel.mostrarRecetaGrande();
                }

            }
        });
    }


}
