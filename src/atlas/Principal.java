package atlas;

import atlas.DTO.Clubes;
import atlas.DTO.Suscripcion;
import atlas.DTO.Usuario;

public class Principal {

    public static void main(String[] args) {
        int correlativo= 0;
        
        System.out.println("Ingresando Nuevo Usuario");
        Usuario a1= new Usuario();
        a1.setId_Usuario(1000);
        a1.setNombre("David Cogiolli");
        a1.setRut(1000000, '1');
        a1.setTelefono(12345678);
        a1.setEmail("david.cogiolle@gmail.com");
        a1.setNom_Usuario("dcog");
        a1.setContraseña("Afds22231");
        
        System.out.println("Creado Usuario: "+a1.getNom_Usuario());
        
        System.out.println("Ingresando Nuevo Usuario");
        Usuario a2= new Usuario();
        a2.setId_Usuario(1001);
        a2.setNombre("Giovanni Adere");
        a2.setRut(1000001, '2');
        a2.setTelefono(12345222);
        a2.setEmail("gerr.adere@live.cl");
        a2.setNom_Usuario("ggft");
        a2.setContraseña("G1ovanniGg34");
        
        System.out.println("Creado Usuario: "+a2.getNom_Usuario());
        
        System.out.println("Ingresando Nuevo Usuario");
        Usuario a3= new Usuario();
        a3.setId_Usuario(1002);
        a3.setNombre("Sergio Vilanueva");
        a3.setRut(1000021, '3');
        a3.setTelefono(123545412);
        a3.setEmail("sergio.vilanueva@gmail.com");
        a3.setNom_Usuario("scodiio");
        a3.setContraseña("5534Gato33");
        
        System.out.println("Creado Usuario: "+a3.getNom_Usuario());
        
        System.out.println("Ingresando Nuevo Club Deportivo");
        Clubes b1= new Clubes();
        b1.setId_Club("ARH11");
        b1.setNombre_Club("Arsenal de Coquimbo");
        b1.setLema("Cañones a los puertos");
        b1.setValor_Suscripcion(10050);
        b1.setColores("Amarillo, Rojo");
        
        System.out.println("Creado Club: "+b1.getNombre_Club());
        
        System.out.println("Ingresando Nuevo Club Deportivo");
        Clubes b2= new Clubes();
        b2.setId_Club("MCH12");
        b2.setNombre_Club("Manquehue City");
        b2.setLema("Vivir y Fuerza");
        b2.setValor_Suscripcion(15100);
        b2.setColores("Celeste, Blanco");
        
        System.out.println("Creado Club: "+b2.getNombre_Club());
        
        System.out.println("Ingresando Nuevo Club Deportivo");
        Clubes b3= new Clubes();
        b3.setId_Club("LCH13");
        b3.setNombre_Club("Los Cóndores Unidos");
        b3.setLema("Desde lo alto al sol");
        b3.setValor_Suscripcion(13200);
        b3.setColores("Amarillo, Naranjo");
        
        System.out.println("Creado Club: "+b3.getNombre_Club());
        
        
    }
    
}
