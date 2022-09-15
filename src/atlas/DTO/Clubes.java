package atlas.DTO;

import java.util.Date;

public class Clubes {

    private String Id_Club;
    private String Nombre_Club;
    private String Nombre_Fundador;
    private Date F_Fundacion;
    private String Pais_origen;
    private String Lema;
    private String Colores;
    private int Valor_Suscripcion;

    public Clubes() {
        this.Id_Club = "";
        this.Nombre_Club = "";
        this.Nombre_Fundador = "";
        this.F_Fundacion = new Date();
        this.Pais_origen = "";
        this.Lema = "";
        this.Colores = "";
        this.Valor_Suscripcion = 0;
    }

    public String getId_Club() {
        return Id_Club;
    }

    public void setId_Club(String Id_Club) {
        this.Id_Club = Id_Club;
    }

    public String getNombre_Club() {
        return Nombre_Club;
    }

    public void setNombre_Club(String Nombre_Club) {
        this.Nombre_Club = Nombre_Club;
    }

    public String getNombre_Fundador() {
        return Nombre_Fundador;
    }

    public void setNombre_Fundador(String Nombre_Fundador) {
        this.Nombre_Fundador = Nombre_Fundador;
    }

    public Date getF_Fundacion() {
        return F_Fundacion;
    }

    public void setF_Fundacion(Date F_Fundacion) {
        this.F_Fundacion = F_Fundacion;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValor_Suscripcion() {
        return Valor_Suscripcion;
    }

    public void setValor_Suscripcion(int Valor_Suscripcion) {
        this.Valor_Suscripcion = Valor_Suscripcion;
    }

}
