/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.daeriquelme.ejemploev2_1;

/**
 *
 * @author arkder
 */
public class Historico extends Tour{
    
    public String tematicaprincipal, equipamiento, tipoRecorrido;

    public Historico() {
    }

    public Historico(String tematicaprincipal, String equipamiento, String dificultad, String tipoRecorrido) {
        this.tematicaprincipal = tematicaprincipal;
        this.equipamiento = equipamiento;
        this.tipoRecorrido = tipoRecorrido;
    }

    public Historico(String tematicaprincipal, String equipamiento, String tipoRecorrido, int codigo, int precioBase, int duracionHoras, String nombre, String dificultad) {
        super(codigo, precioBase, duracionHoras, nombre, dificultad);
        this.tematicaprincipal = tematicaprincipal;
        this.equipamiento = equipamiento;
        this.tipoRecorrido = tipoRecorrido;
    }

    public String getTematicaprincipal() {
        return tematicaprincipal;
    }

    public void setTematicaprincipal(String tematicaprincipal) {
        this.tematicaprincipal = tematicaprincipal;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoRecorrido() {
        return tipoRecorrido;
    }

    public void setTipoRecorrido(String tipoRecorrido) {
        this.tipoRecorrido = tipoRecorrido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return super.toString() + "Historico{" + "tematicaprincipal=" + tematicaprincipal + ", equipamiento=" + equipamiento + ", tipoRecorrido=" + tipoRecorrido + '}';
    }

    @Override
    public int calcularCostoAdicional(int x) {
        
        int adicional=0;
        if(tipoRecorrido.equalsIgnoreCase("nocturno"))
        {
            adicional=(int)(super.getPrecioBase()*(x/100.0));
        }
        return adicional;
    }
}
