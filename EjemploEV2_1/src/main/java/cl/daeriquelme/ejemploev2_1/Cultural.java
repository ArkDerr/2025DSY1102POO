/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.daeriquelme.ejemploev2_1;

/**
 *
 * @author arkder
 */
public class Cultural extends Tour {

    public String sectorPatrimonial, idiomaGuia;

    public Cultural() {
    }

    public Cultural(String sectorPatrimonial, String idiomaGuia) {
        this.sectorPatrimonial = sectorPatrimonial;
        this.idiomaGuia = idiomaGuia;
    }

    public Cultural(String sectorPatrimonial, String idiomaGuia, int codigo, int precioBase, int duracionHoras, String nombre, String dificultad) {
        super(codigo, precioBase, duracionHoras, nombre, dificultad);
        this.sectorPatrimonial = sectorPatrimonial;
        this.idiomaGuia = idiomaGuia;
    }

    public String getSectorPatrimonial() {
        return sectorPatrimonial;
    }

    public void setSectorPatrimonial(String sectorPatrimonial) {
        this.sectorPatrimonial = sectorPatrimonial;
    }

    public String getIdiomaGuia() {
        return idiomaGuia;
    }

    public void setIdiomaGuia(String idiomaGuia) {
        this.idiomaGuia = idiomaGuia;
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
        return super.toString() + "Cultural{" + "sectorPatrimonial=" + sectorPatrimonial + ", idiomaGuia=" + idiomaGuia + '}';
    }

    @Override
    public int calcularCostoAdicional(int x) {
<<<<<<< HEAD

        int adicional = 0;
        if (idiomaGuia.equalsIgnoreCase("inglés")) {
            adicional = (int) (super.getPrecioBase() * (x / 100));
=======
        
        int adicional=0;
        if(idiomaGuia.equalsIgnoreCase("inglés"))
        {
            adicional=(int)(super.getPrecioBase()*(x/100));
>>>>>>> 744b2859d37e3af0ca57256e94aafcb5a0f36886
        }
        return adicional;
    }

}
