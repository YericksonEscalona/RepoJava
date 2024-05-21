
package modelos;


public class Documento {
    
    private Integer id_documento;
    private boolean HayCed;
    private boolean HayTit;
    private boolean HayCar;
    private boolean HayFon;
    private boolean HayNot;

    public Documento() {
        this.id_documento = null;
        this.HayCed = false;
        this.HayTit = false;
        this.HayCar = false;
        this.HayFon = false;
        this.HayNot = false;
    }
    
    public Documento(Integer id_documento, boolean HayCed, boolean HayTit, boolean HayCar, boolean HayFon, boolean HayNot) {
        this.id_documento = id_documento;
        this.HayCed = HayCed;
        this.HayTit = HayTit;
        this.HayCar = HayCar;
        this.HayFon = HayFon;
        this.HayNot = HayNot;
    }

    public Integer getId_documento() {
        return id_documento;
    }

    public boolean isHayCed() {
        return HayCed;
    }

    public boolean isHayTit() {
        return HayTit;
    }

    public boolean isHayCar() {
        return HayCar;
    }

    public boolean isHayFon() {
        return HayFon;
    }

    public boolean isHayNot() {
        return HayNot;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public void setHayCed(boolean HayCed) {
        this.HayCed = HayCed;
    }

    public void setHayTit(boolean HayTit) {
        this.HayTit = HayTit;
    }

    public void setHayCar(boolean HayCar) {
        this.HayCar = HayCar;
    }

    public void setHayFon(boolean HayFon) {
        this.HayFon = HayFon;
    }

    public void setHayNot(boolean HayNot) {
        this.HayNot = HayNot;
    }
    
}
