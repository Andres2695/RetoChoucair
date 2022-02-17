package com.choucairtesting.utils;

public class Formacion {
    private String NombreApellido;
    private String Whatsap;
    private String TemasDeInteres;
    private String correo;
    private String ciudad;
    private String empresa;
    private String mensaje;

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        NombreApellido = nombreApellido;
    }

    public String getWhatsap() {
        return Whatsap;
    }

    public void setWhatsap(String whatsap) {
        Whatsap = whatsap;
    }

    public String getTemasDeInteres() {
        return TemasDeInteres;
    }

    public void setTemasDeInteres(String temasDeInteres) {
        TemasDeInteres = temasDeInteres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Formacion(String NombreApellido, String Whatsap, String TemasDeInteres, String correo, String ciudad, String empresa, String mensaje) {
        this.NombreApellido = NombreApellido;
        this.Whatsap = Whatsap;
        this.TemasDeInteres = TemasDeInteres;
        this.correo = correo;
        this.ciudad = ciudad;
        this.empresa = empresa;
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Formacion{" +
                "NombreApellido='" + NombreApellido + '\'' +
                ", Whatsap=" + Whatsap +
                ", TemasDeInteres=" + TemasDeInteres +
                ", correo=" + correo +
                ", ciudad=" + ciudad +
                ", empresa=" + empresa +
                ", mensaje=" + mensaje +
                '}';
    }
}
