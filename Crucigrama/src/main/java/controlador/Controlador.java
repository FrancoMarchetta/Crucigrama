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
    private final Jogo startJogo;
    private final Instrucciones startInstrucciones;
    private final Tablero startTablero;
    private final Juego startJuego;

    public Controlador(Menu startMenu, Instrucciones startInstrucciones,Jogo startJogo, Tablero startTablero, Juego startJuego) {
        this.startMenu = startMenu;
        this.startJogo = startJogo;
        this.startInstrucciones = startInstrucciones;
        this.startTablero = startTablero;
        this.startJuego = startJuego;
        
        this.startMenu.getBoton_instucciones().addActionListener(this);
        this.startMenu.getBoton_jugar().addActionListener(this);
        this.startMenu.getBoton_salir().addActionListener(this);
        //ActionListener del boton de las instrucciones
        this.startInstrucciones.getBoton_volver().addActionListener(this);
        //ActionListener de los botones del juego
        this.startJogo.getBtnTerminar().addActionListener(this);
        this.startJogo.getE1().addActionListener(this);
        this.startJogo.getE2().addActionListener(this);
        this.startJogo.getE3().addActionListener(this);
        this.startJogo.getE4().addActionListener(this);
        this.startJogo.getE5().addActionListener(this);
        this.startJogo.getE6().addActionListener(this);
        this.startJogo.getE7().addActionListener(this);
        this.startJogo.getE8().addActionListener(this);
        this.startJogo.getE9().addActionListener(this);
        this.startJogo.getE10().addActionListener(this);
        this.startJogo.getE11().addActionListener(this);
        this.startJogo.getE12().addActionListener(this);
        this.startJogo.getE13().addActionListener(this);
        this.startJogo.getE14().addActionListener(this);
        this.startJogo.getE15().addActionListener(this);
        this.startJogo.getE16().addActionListener(this);
        this.startJogo.getE17().addActionListener(this);
        this.startJogo.getE18().addActionListener(this);
        this.startJogo.getE19().addActionListener(this);
        this.startJogo.getE20().addActionListener(this);
        this.startJogo.getE21().addActionListener(this);
        this.startJogo.getE22().addActionListener(this);
        this.startJogo.getE23().addActionListener(this);
        this.startJogo.getE24().addActionListener(this);
        this.startJogo.getE25().addActionListener(this);
        this.startJogo.getE26().addActionListener(this);
        this.startJogo.getE27().addActionListener(this);
        this.startJogo.getE28().addActionListener(this);
        this.startJogo.getE29().addActionListener(this);
        this.startJogo.getE30().addActionListener(this);
        this.startJogo.getE31().addActionListener(this);
        this.startJogo.getE32().addActionListener(this);
        this.startJogo.getE33().addActionListener(this);
        this.startJogo.getE34().addActionListener(this);
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
