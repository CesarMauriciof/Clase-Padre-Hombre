
package herenciaJava;


public class herenciaJava {

    
    public static void main(String[] args) {
        //Objeto de la clase  padre Humano
        Humano adulto = new Humano();
        adulto.setNombre("Serna");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println();
        
        //Objeto de la clase hija Hombre
        
        Hombre hombre = new Hombre();
        hombre.setNombre("Serna");
        hombre.comer(hombre.getNombre());
        hombre.dormir();
        hombre.afeitarse();
        
        System.out.println();
        
        //Objeto de la clase hija Mujer
        Mujer mujer = new Mujer();
        mujer.setNombre("Darcy");
        mujer.comer(mujer.getNombre());
        mujer.dormir();
        mujer.maquillarse(mujer.getNombre());
       
    }
    
}
