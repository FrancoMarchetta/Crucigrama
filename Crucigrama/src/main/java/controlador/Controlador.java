/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.Desktop;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import vista.*;
import modelo.*;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static modelo.Tablero.resuelto;
import static modelo.Tablero.tablero;





/**
 *
 * @author frncm
 */
public class Controlador implements ActionListener {

    private final Menu startMenu;
    private final Instrucciones startInstrucciones;
    private final Jogo startJogo;
    private final Tablero startTablero;
    private final Juego startJuego;
    private final Ventana_Ganaste startGanaste;

    public Controlador(Menu startMenu, Instrucciones startInstrucciones,Jogo startJogo, Tablero startTablero, Juego startJuego, Ventana_Ganaste startGanaste) {
        this.startMenu = startMenu;
        this.startInstrucciones = startInstrucciones;
        this.startJogo = startJogo;
        this.startTablero = startTablero;
        this.startJuego = startJuego;
        this.startGanaste = startGanaste;
        //todos los action listeners:
        
        this.startMenu.getBoton_instucciones().addActionListener(this);
        this.startMenu.getBoton_jugar().addActionListener(this);
        this.startMenu.getBoton_salir().addActionListener(this);
        //ActionListener del boton de las instrucciones
        this.startInstrucciones.getBoton_volver().addActionListener(this);
        //ActionListener de el botones del juego
        this.startJogo.getBtnTerminar().addActionListener(this);
        this.startGanaste.getBotonReiniciar().addActionListener(this);
        this.startGanaste.getBotonSalirGanaste().addActionListener(this);
 
        
    }

    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==startMenu.getBoton_instucciones()){
               MostrarInstrucciones();
            }else if(e.getSource()==startMenu.getBoton_jugar()){     //<----------- aca los botones del menu(jugar,salir,ver las instrucciones)
                MostrarJuego();
            }else if(e.getSource()==startMenu.getBoton_salir()){
                salirJuego();
            }else if(e.getSource()==startInstrucciones.getBoton_volver()){  //<---------aca el boton de volver en las instrucciones
                volverInicio();
            }else if(e.getSource()==startJogo.getBtnTerminar()){
                botonComparar();
                if(Juego.compararTableros(tablero, resuelto) == (true)){
                    mostrarGanaste();
                }
            }else if(e.getSource()== startGanaste.getBotonSalirGanaste()){
                System.exit(0);
            }else if(e.getSource()==startGanaste.getBotonReiniciar()){
                MostrarJuegoGanaste();
            }
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
        String nombreJugador;
    
    private void MostrarJuego(){
        startMenu.dispose();
        nombreJugador = Menu.campo_nombre.getText();
        startJogo.setVisible(true);
        
        String[][] tablero = startTablero.IniciarTablero();
        startTablero.MostrarTablero(tablero);
    }
    
    private void MostrarJuegoGanaste(){
        startGanaste.dispose();
        startJogo.dispose();
        startJogo.setVisible(true);
        String[][] tablero = startTablero.IniciarTablero();
        startTablero.MostrarTablero(tablero);
    }
    
    private void botonComparar(){
      startJuego.compararTableros(modelo.Tablero.tablero, modelo.Tablero.resuelto);
    }
    
    private void mostrarGanaste(){
        startJogo.dispose();
        startGanaste.setVisible(true);
        Ventana_Ganaste.espacio_nombre_jugador.setText(nombreJugador);
    }
    
    
    
}
