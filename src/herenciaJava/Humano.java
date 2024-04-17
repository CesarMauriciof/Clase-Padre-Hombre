
package herenciaJava;


public class Humano {
    
    private String nombre;
    
    
    public void comer(String nombre){
        System.out.println(nombre+ " esta cominedo desde la clase Humano");
    
    }
    
    public void dormir(){
    
        System.out.println(nombre+" esta durmiendo desde la clase Humano");
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
