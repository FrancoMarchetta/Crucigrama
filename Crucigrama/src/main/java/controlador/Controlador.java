/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import modelo.*;





/**
 *
 * @author frncm
 */
public class Controlador implements ActionListener {

    private final Menu startMenu;
    private final Jogo startjogo;
    private final Instrucciones startInstrucciones;
    private final Tablero startTablero;
    private final Jogo startJuego;

    public Controlador(Menu startMenu, Jogo startjuego, Instrucciones startInstrucciones, Tablero startTablero, Juego startJuego) {
        //ActionListener de los botones  del menu
        this.startMenu = startMenu;
        this.startjuego = startjuego;
        this.startInstrucciones = startInstrucciones;
        this.startTablero = startTablero;
        this.startJogo = startJuego;
        
        
       
        //ActionListener de los botones  del menu

        this.startMenu.getBoton_instucciones().addActionListener(this);
        this.startMenu.getBoton_jugar().addActionListener(this);
        this.startMenu.getBoton_salir().addActionListener(this);
        //ActionListener del boton de las instrucciones
        this.startInstrucciones.getBoton_volver().addActionListener(this);
        //ActionListener de los botones del juego
        this.startJuego.getBtnTerminar().addActionListener(this);
        this.startJuego.getE1().addActionListener(this);
        this.startJuego.getE2().addActionListener(this);
        this.startJuego.getE3().addActionListener(this);
        this.startJuego.getE4().addActionListener(this);
        this.startJuego.getE5().addActionListener(this);
        this.startJuego.getE6().addActionListener(this);
        this.startJuego.getE7().addActionListener(this);
        this.startJuego.getE8().addActionListener(this);
        this.startJuego.getE9().addActionListener(this);
        this.startJuego.getE10().addActionListener(this);
        this.startJuego.getE11().addActionListener(this);
        this.startJuego.getE12().addActionListener(this);
        this.startJuego.getE13().addActionListener(this);
        this.startJuego.getE14().addActionListener(this);
        this.startJuego.getE15().addActionListener(this);
        this.startJuego.getE16().addActionListener(this);
        this.startJuego.getE17().addActionListener(this);
        this.startJuego.getE18().addActionListener(this);
        this.startJuego.getE19().addActionListener(this);
        this.startJuego.getE20().addActionListener(this);
        this.startJuego.getE21().addActionListener(this);
        this.startJuego.getE22().addActionListener(this);
        this.startJuego.getE23().addActionListener(this);
        this.startJuego.getE24().addActionListener(this);
        this.startJuego.getE25().addActionListener(this);
        this.startJuego.getE26().addActionListener(this);
        this.startJuego.getE27().addActionListener(this);
        this.startJuego.getE28().addActionListener(this);
        this.startJuego.getE29().addActionListener(this);
        this.startJuego.getE30().addActionListener(this);
        this.startJuego.getE31().addActionListener(this);
        this.startJuego.getE32().addActionListener(this);
        this.startJuego.getE33().addActionListener(this);
        this.startJuego.getE34().addActionListener(this);

        

        
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==startMenu.getBoton_instucciones()){
                MostrarInstrucciones();
            }else if(e.getSource()==startMenu.getBoton_jugar()){     //<----------- aca los botones del menu(jugar,salir,ver las instrucciones)
                //funcion jugar que todavia no has hecho capo...
            }else if(e.getSource()==startMenu.getBoton_salir()){
                salirJuego();
            }else if(e.getSource()==startInstrucciones.getBoton_volver()){  //<---------aca el boton de volver en las instrucciones
                volverInicio();
            }                        //<---------aca tenes que seguir metiendo shits
        }catch(Exception ex){
            System.out.println("ERROR...");
            ex.printStackTrace();

        }
    }
    //mostrar instrucciones
    private void MostrarInstrucciones(){
        startMenu.dispose();
        startInstrucciones.setVisible(true);
    }
    
    //volver de las instrucciones al menu
    private void volverInicio() {
        startInstrucciones.dispose();
        startMenu.setVisible(true);
    }
    
    //salir
    private void salirJuego() {
        System.exit(0);
    }
    
}
