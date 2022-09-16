package atlas.DTO;

import java.util.Date;


public class Usuario {
    private int Id_Usuario;
    private String Nombre;
    private int Rut;
    private String Dv;
    private Date F_Nac;
    private int Telefono;
    private String Email;
    private String Nom_Usuario;
    private String Contraseña;
    
    public Usuario(){
        this.Id_Usuario= 0;
        this.Nombre = "";
        this.Rut= 0;
        this.Dv= "";
        this.F_Nac= new Date();
        this.Telefono= 0;
        this.Email= "";
        this.Nom_Usuario= "";
        this.Contraseña= "";
        
    }
    
    public Usuario(int Id_Usuario, String Nombre,int Rut, String Dv, Date F_Nac, int Telefono, String Email, String Nom_Usuario, String Contraseña){
        this.Id_Usuario= Id_Usuario;
        this.Nombre= Nombre;
        this.Rut= Rut;
        this.Dv= Dv;
        this.F_Nac= F_Nac;
        this.Telefono= Telefono;
        this.Email= Email;
        this.Nom_Usuario= Nom_Usuario;
        this.Contraseña= Contraseña;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut, char Dv) {
        if(this.validarRut(Rut, Dv)){
            this.Rut = Rut;
            this.Dv = Dv+"";
    }
    }
    
    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getF_Nac() {
        return F_Nac;
    }

    public void setF_Nac(Date F_Nac) {
        this.F_Nac = F_Nac;
    }

    public int getTelefono() {
        return Telefono;
    }

    
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
        
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.length() > 5 && Email.contains("@")){
            this.Email = Email;
        }
    }

    public String getNom_Usuario() {
        return Nom_Usuario;
    }

    public void setNom_Usuario(String Nom_Usuario) {
        this.Nom_Usuario = Nom_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    
    }

    public void setF_Nac(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
