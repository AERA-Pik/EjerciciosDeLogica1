package main;

// Clase adicional para resolver el problema 5
public class Cliente {
    public String NN;
    public int PP;
    
    public Cliente(){        	
    }
    
    public Cliente(String nombre, int prioridad){
    	this.NN = nombre;
    	this.PP = prioridad;
    }
    
    public void agregarPuntos(int II) {
    	this.PP += II; 
    }
    
	@Override
	public String toString() {
		return "[Nombre: " + NN + ", Prioridad: " + PP +"]";
	}
}     
   