/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author frncm
 */
public class Tablero {
        String[][] tablero;

   
    public Tablero() {
        this.tablero = new String[13][11];
    }
    
    
    
    
    public String[][] IniciarTablero(){
            
        for(int i = 0; i<13; i++){
            for (int j = 0; j<11; j++){              //<---Crea el tablero vacio
                tablero[i][j] = " ";
            }
            System.out.println();
        }
        return tablero;
    }
    
    public void MostrarTablero(String[][] tablero){
        for(int i = 0; i<13; i++){
            for(int j = 0; j<11; j++){
                System.out.println(tablero[i][j] + " ");
                }
            System.out.println();
        }
    }
    
    
    
    public static String[][] iniciarTableroResuelto() {
        return new String[][] {
            {" ", " ", " ", " ", " ", " ", " ", "C", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", "A", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "E", " ", " ", "M", " ", " ", " ", " ", " "},
            {"C", "E", "R", "A", "M", "I", "C", "A", " ", " ", " ", " ", " "},
            {" ", "X", " ", " ", "E", " ", " ", "R", " ", " ", " ", " ", " "},
            {" ", "I", " ", " ", "R", " ", " ", "A", "M", "A", "B", "L", "E"},
            {" ", "T", " ", " ", "G", " ", " ", " ", " ", "M", " ", " ", " "},
            {" ", "O", " ", " ", "E", " ", " ", " ", " ", "I", " ", " ", " "},
            {" ", " ", " ", " ", "N", " ", " ", " ", " ", "G", " ", " ", " "},
            {" ", " ", " ", " ", "T", " ", " ", " ", " ", "O", " ", " ", " "},
            {" ", " ", " ", " ", "E", " ", " ", " ", " ", " ", " ", " ", " "}
        };
    }
}
