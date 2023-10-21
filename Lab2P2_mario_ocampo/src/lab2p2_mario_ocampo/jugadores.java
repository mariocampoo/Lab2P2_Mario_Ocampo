package lab2p2_mario_ocampo;
class jugadores {
    
    private String nombre;
    private int PuntosReputacion;
    private int dinero=1000;
    
    public jugadores(){
        
    }
    
    public jugadores(String nombre, int PuntosReputacion, int dinero){
        this.nombre=nombre;
        this.PuntosReputacion= PuntosReputacion;
        this.dinero=dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosReputacion() {
        return PuntosReputacion;
    }

    public void setPuntosReputacion(int PuntosReputacion) {
        this.PuntosReputacion = PuntosReputacion;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "jugadores ->\n"
                + ""+"Nombre del Jugador = " + nombre + "\n"
                + "Puntos de reputacion = " + PuntosReputacion + "\n"
                + "Dinero = " + dinero;
        
    }
    
    
    
    
}

