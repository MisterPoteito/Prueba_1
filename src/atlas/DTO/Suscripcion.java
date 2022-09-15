package atlas.DTO;

import java.util.Date;


public class Suscripcion {
    private int Id_Suscripcion;
    private Date F_Inicio_Suscripcion;
    private int Valor_Suscripcion;
    private String Equipos;
    
    public Suscripcion(){
        this.Id_Suscripcion= 0;
        this.F_Inicio_Suscripcion= new Date();
        this.Valor_Suscripcion= 0;
        this.Equipos= "";
    }

    public int getId_Suscripcion() {
        return Id_Suscripcion;
    }

    public void setId_Suscripcion(int Id_Suscripcion) {
        this.Id_Suscripcion = Id_Suscripcion;
    }

    public Date getF_Inicio_Suscripcion() {
        return F_Inicio_Suscripcion;
    }

    public void setF_Inicio_Suscripcion(Date F_Inicio_Suscripcion) {
        this.F_Inicio_Suscripcion = F_Inicio_Suscripcion;
    }

    public int getValor_Suscripcion() {
        return Valor_Suscripcion;
    }

    public void setValor_Suscripcion(int Valor_Suscripcion) {
        this.Valor_Suscripcion = Valor_Suscripcion;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
    
}
