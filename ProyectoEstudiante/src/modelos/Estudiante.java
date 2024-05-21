
package modelos;


public class Estudiante {
    private Integer id_estudiante;
    private String nombre;
    private String apellido;
    private String cedula;
    private String sexo;
    private Integer idEdoCivil;
    private Integer idEstado;
    private Integer idDoc;

    public Estudiante() {
        this.id_estudiante = null;
        this.nombre = null;
        this.apellido = null;
        this.cedula = null;
        this.sexo = null;
        this.idEdoCivil = null;
        this.idEstado = null;
        this.idDoc = null;
    }



    public Estudiante(Integer id_estudiante, String nombre, String apellido, String cedula, String sexo) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public Estudiante(Integer id_estudiante, String nombre, String apellido, String cedula, String sexo, Integer idEdoCivil, Integer idEstado, Integer idDoc) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.idEdoCivil = idEdoCivil;
        this.idEstado = idEstado;
        this.idDoc = idDoc;
    }
    
    

    public Integer getId_estudiante() {
        return id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }
    
        public Integer getIdEdoCivil() {
        return idEdoCivil;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public Integer getIdDoc() {
        return idDoc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdEdoCivil(Integer idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }
    
    
    
    
}
