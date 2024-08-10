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
        static String[][] tablero;

   
    public Tablero() {
        this.tablero = new String[13][11];
    }

    public static String[][] getTablero() {
        return tablero;
    }

    public static void setTablero(String[][] tablero) {
        Tablero.tablero = tablero;
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
    
    
    
    
   public static String[][] MostrarTablero(String[][] tablero) {
    for (int i = 0; i < 13; i++) {
        for (int j = 0; j < 11; j++) {
            System.out.print(" " + tablero[i][j]);
        }
        System.out.println(" ");
    }
    return tablero;
}

    
    
    
    public static String[][] iniciarTableroResuelto() {
        String[][] resuelto = {
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
        
        return resuelto;
    }
    
    
    
    public static boolean compararTableros(){
        boolean tablerosSonIguales = (false);
        
        if (MostrarTablero(tablero) == iniciarTableroResuelto()) {
            tablerosSonIguales = (true);
            System.out.println("ESTA BIEN. LOS TABLEROS SON IGUALES");
        }else{
            tablerosSonIguales = (false);
            System.out.println("ESTA MAL. LOS TABLEROS SON DISTINTOS");
        }
        return tablerosSonIguales;
        
        
    }
}
