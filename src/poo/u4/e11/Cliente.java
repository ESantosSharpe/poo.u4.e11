package poo.u4.e11;

public class Cliente {
    public int id;
    public String nombre;

    public Cliente(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    public Cliente(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
