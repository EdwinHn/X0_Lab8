
package com.mycompany.x0;

public class Inicio_Registro {

    private String nombre_jugador;
    private int puntos;
    private String username;
    private String contra;
    
    private static Inicio_Registro infoJugadores [] = new Inicio_Registro[100];
    public static int  jugadorX;
    public static int  jugador0;
    
    private static int contador = 0;
    
    public Inicio_Registro(String nombre_jugador,String username,String contra, int puntos){
        this.nombre_jugador = nombre_jugador;
        this.puntos = puntos;
        this.username = username;
        this.contra = contra;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public static int getPuntos0() {
        return infoJugadores[jugador0].puntos;
       
    }
    
    public static int getPuntosX() {
        return infoJugadores[jugadorX].puntos;
       
    }
    
    public static int addPuntosX(){
        return (infoJugadores[jugadorX].puntos+=3);
        
    }

    public static int addPuntos0(){
        return (infoJugadores[jugador0].puntos+=3);
        
    }
    public String getUsername() {
        return username;
    }

    public String getContra() {
        return contra;
    }

    public static int getContador() {
        return contador;
    }
    
    public static Inicio_Registro getCuenta(int index) {
        return infoJugadores[index];
    }
    
    public static String getNombreX (){
        return infoJugadores[jugadorX].getNombre_jugador();
    }
    
    public static String getNombre0 (){
        return infoJugadores[jugador0].getNombre_jugador();
    }
    
     public static void agregarCuenta(Inicio_Registro cuenta){
        if(contador<infoJugadores.length){
            infoJugadores[contador]=cuenta;
            contador++;
        }
    
    }
     public static boolean verificar_cuenta(String user){
        for (int i = 0; i < contador; i++) {
            if(infoJugadores[i].getUsername().equals(user)){
                return true;
            }
        }
        return false;
    }
    
    
}
