package atlas;

import atlas.DTO.Clubes;
import atlas.DTO.Suscripcion;
import atlas.DTO.Usuario;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        int correlativo= 1000;
        System.out.println("-----------------------------------------------");
        System.out.println("Ingresando Nuevo Usuario.");
        Usuario a1= new Usuario();
        a1.setId_Usuario(1000);
        a1.setNombre("David Cogiolli");
        a1.setRut(1000000, '1');
        a1.setTelefono(562345678);
        a1.setEmail("david.cogiolle@gmail.com");
        a1.setNom_Usuario("dcog");
        a1.setContraseña("Afds22231");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Usuario: "+a1.getId_Usuario());
        System.out.println("Nombre Usuario: "+a1.getNombre());
        System.out.println("Rut Usuario: "+a1.getRut());
        System.out.println("Email Usuario: "+a1.getEmail());
        System.out.println("Usuario: "+a1.getNom_Usuario());
        System.out.println("Contraseña: **********");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Usuario: "+a1.getNom_Usuario()+" creado.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ingresando Nuevo Usuario.");
        Usuario a2= new Usuario();
        a2.setId_Usuario(1001);
        a2.setNombre("Giovanni Adere");
        a2.setRut(1000001, '2');
        a2.setTelefono(562345222);
        a2.setEmail("gerr.adere@live.cl");
        a2.setNom_Usuario("ggft");
        a2.setContraseña("G1ovanniGg34");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Usuario: "+a2.getId_Usuario());
        System.out.println("Nombre Usuario: "+a2.getNombre());
        System.out.println("Rut Usuario: "+a2.getRut());
        System.out.println("Email Usuario: "+a2.getEmail());
        System.out.println("Usuario: "+a2.getNom_Usuario());
        System.out.println("Contraseña: *************");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Usuario: "+a2.getNom_Usuario()+" creado.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ingresando Nuevo Usuario.");
        Usuario a3= new Usuario();
        a3.setId_Usuario(1002);
        a3.setNombre("Sergio Vilanueva");
        a3.setRut(1000021, '3');
        a3.setTelefono(569355412);
        a3.setEmail("sergio.vilanueva@gmail.com");
        a3.setNom_Usuario("scodiio");
        a3.setContraseña("5534Gato33");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Usuario: "+a3.getId_Usuario());
        System.out.println("Nombre Usuario: "+a3.getNombre());
        System.out.println("Rut Usuario: "+a3.getRut());
        System.out.println("Email Usuario: "+a3.getEmail());
        System.out.println("Usuario: "+a3.getNom_Usuario());
        System.out.println("Contraseña: *************");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Usuario: "+a3.getNom_Usuario()+" creado.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ingresando Nuevo Club Deportivo.");
        
        Clubes b1= new Clubes();
        b1.setId_Club("ARH11");
        b1.setNombre_Club("Arsenal de Coquimbo");
        b1.setLema("Cañones a los puertos");
        b1.setValor_Suscripcion(10050);
        b1.setColores("Amarillo, Rojo");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Club: "+b1.getId_Club());
        System.out.println("Nombre Club: "+b1.getNombre_Club());
        System.out.println("Lema: "+b1.getLema());
        System.out.println("Valor Suscripción: "+b1.getValor_Suscripcion());
        System.out.println("Colores: "+b1.getColores());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Club: "+b1.getNombre_Club()+" creado.");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Ingresando Nuevo Club Deportivo.");
        
        Clubes b2= new Clubes();
        b2.setId_Club("MCH12");
        b2.setNombre_Club("Manquehue City");
        b2.setLema("Vivir y Fuerza");
        b2.setValor_Suscripcion(15100);
        b2.setColores("Celeste, Blanco");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Club: "+b2.getId_Club());
        System.out.println("Nombre Club: "+b2.getNombre_Club());
        System.out.println("Lema: "+b2.getLema());
        System.out.println("Valor Suscripción: "+b2.getValor_Suscripcion());
        System.out.println("Colores: "+b2.getColores());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Club: "+b2.getNombre_Club()+" creado.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ingresando Nuevo Club Deportivo.");
        Clubes b3= new Clubes();
        b3.setId_Club("LCH13");
        b3.setNombre_Club("Los Cóndores Unidos");
        b3.setLema("Desde lo alto al sol");
        b3.setValor_Suscripcion(13200);
        b3.setColores("Amarillo, Naranjo");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Id_Club: "+b3.getId_Club());
        System.out.println("Nombre Club: "+b3.getNombre_Club());
        System.out.println("Lema: "+b3.getLema());
        System.out.println("Valor Suscripción: "+b3.getValor_Suscripcion());
        System.out.println("Colores: "+b3.getColores());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Club: "+b3.getNombre_Club()+" creado.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Creando Suscripción.");
        Suscripcion s1= new Suscripcion();
        s1.setUsuario_Suscripcion("Usuario1");
        s1.setId_Suscripcion(correlativo+10);
        s1.setF_Inicio_Suscripcion(new Date());
        s1.setValor_Suscripcion(25150);
        s1.setEquipos("ARH11 $10.050; MCH12 $15.100;");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Numero: "+s1.getId_Suscripcion());
        System.out.println("Usuario: "+s1.getUsuario_Suscripcion());
        System.out.println("AbonoTotal: "+s1.getValor_Suscripcion());
        System.out.println("Equipos: "+s1.getEquipos());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Suscripción: "+s1.getId_Suscripcion()+" Creada.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Creando Suscripción.");
        Suscripcion s2= new Suscripcion();
        s2.setUsuario_Suscripcion("Usuario2");
        s2.setId_Suscripcion(correlativo+20);
        s2.setF_Inicio_Suscripcion(new Date());
        s2.setValor_Suscripcion(13200);
        s2.setEquipos("LCH13 $13.200");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Numero: "+s2.getId_Suscripcion());
        System.out.println("Usuario: "+s2.getUsuario_Suscripcion());
        System.out.println("AbonoTotal: "+s2.getValor_Suscripcion());
        System.out.println("Equipos: "+s2.getEquipos());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Suscripción: "+s2.getId_Suscripcion()+" Creada.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Creando Suscripción.");
        Suscripcion s3= new Suscripcion();
        s3.setUsuario_Suscripcion("Usuario3");
        s3.setId_Suscripcion(correlativo+30);
        s3.setF_Inicio_Suscripcion(new Date());
        s3.setValor_Suscripcion(18300);
        s3.setEquipos("LCH13 $13.200; MCH12 $15.100");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Numero: "+s3.getId_Suscripcion());
        System.out.println("Usuario: "+s3.getUsuario_Suscripcion());
        System.out.println("AbonoTotal: "+s3.getValor_Suscripcion());
        System.out.println("Equipos: "+s3.getEquipos());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Suscripción: "+s3.getId_Suscripcion()+" Creada.");
        System.out.println("-----------------------------------------------");  
        
    }
    
}
