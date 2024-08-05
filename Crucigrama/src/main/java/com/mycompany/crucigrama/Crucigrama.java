/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crucigrama;

import vista.*;
import modelo.*;
import controlador.*;


/**
 *
 * @author frncm
 */
public class Crucigrama {

    public static void main(String[] args) {
        
        
        
        //-----------------------
         Menu startMenu = new Menu();
        Instrucciones instrucciones = new Instrucciones();
        Jogo jogo = new Jogo();

        // Instanciación del modelo
        Juego juego = new Juego();
        Tablero tablero = new Tablero();

        // Instanciación del controlador
        Controlador controlador = new Controlador(startMenu, instrucciones, jogo, juego, tablero);

    }
}
