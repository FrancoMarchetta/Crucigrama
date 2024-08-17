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
        static public String[][] tablero;

   
    public Tablero() {
        this.tablero = new String[11][13];
    }

    public  String[][] getTablero() {
        return tablero;
    }

    public  void setTablero(String[][] tablero) {
        Tablero.tablero = tablero;
    }
    
    
    
    
    
    
    
    public String[][] IniciarTablero(){
            
        for(int i = 0; i<11; i++){
            for (int j = 0; j<13; j++){              //<---Crea el tablero vacio
                tablero[i][j] = "0";
            }
            System.out.println();
        }
        return tablero;
    }
    
    
    
    
   public static String[][] MostrarTablero(String[][] tablero) {
    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 13; j++) {
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
    
    
    
    public boolean compararTableros(String[][] tablero){
        boolean tablerosSonIguales = (false);
        
        tablero[3][0] = vista.Jogo.e1.getText();
        tablero[3][1] = vista.Jogo.e2.getText();
        tablero[3][2] = vista.Jogo.e3.getText();
        tablero[3][3] = vista.Jogo.e4.getText();
        tablero[3][4] = vista.Jogo.e5.getText();    //<-------- para ir actualizando la matriz que va a resolver el jugador
        tablero[3][5] = vista.Jogo.e6.getText();    // y despues compararla con la matriz resuelta 
        tablero[3][6] = vista.Jogo.e7.getText();
        tablero[3][7] = vista.Jogo.e8.getText();
        tablero[4][1] = vista.Jogo.e9.getText();
        tablero[5][1] = vista.Jogo.e10.getText();
        tablero[6][1] = vista.Jogo.e11.getText();
        tablero[7][1] = vista.Jogo.e12.getText();
        tablero[2][4] = vista.Jogo.e13.getText();
        tablero[4][4] = vista.Jogo.e14.getText();
        tablero[5][4] = vista.Jogo.e15.getText();
        tablero[6][4] = vista.Jogo.e16.getText();
        tablero[7][4] = vista.Jogo.e17.getText();
        tablero[8][4] = vista.Jogo.e18.getText();
        tablero[9][4] = vista.Jogo.e19.getText();
        tablero[10][4] = vista.Jogo.e20.getText();
        tablero[0][7] = vista.Jogo.e21.getText();
        tablero[1][7] = vista.Jogo.e22.getText();
        tablero[2][7] = vista.Jogo.e23.getText();
        tablero[4][7] = vista.Jogo.e24.getText();
        tablero[5][7] = vista.Jogo.e25.getText();
        tablero[5][8] = vista.Jogo.e26.getText();
        tablero[5][9] = vista.Jogo.e27.getText();
        tablero[5][10] = vista.Jogo.e28.getText();
        tablero[5][11] = vista.Jogo.e29.getText();
        tablero[5][12] = vista.Jogo.e30.getText();
        tablero[6][9] = vista.Jogo.e31.getText();
        tablero[7][9] = vista.Jogo.e32.getText();
        tablero[8][9] = vista.Jogo.e33.getText();
        tablero[9][9] = vista.Jogo.e34.getText();
        


        
        
        if (MostrarTablero(tablero) == iniciarTableroResuelto()) {
            tablerosSonIguales = (true);
            System.out.println("ESTA BIEN. LOS TABLEROS SON IGUALES");
            MostrarTablero(tablero);
        }else{
            tablerosSonIguales = (false);
            System.out.println("ESTA MAL. LOS TABLEROS SON DISTINTOS");
            MostrarTablero(tablero);

        }
        
        return tablerosSonIguales;
        
        
    }
}
