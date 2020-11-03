import java.util.Date;

public class Detalle  {

    private String NombreCompleto;
    private Date FechaNacimiento;
    private String Telefono;
    private String email;
    private String DescripcionContacto;

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcionContacto() {
        return DescripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        DescripcionContacto = descripcionContacto;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombre) {
        NombreCompleto = nombre;
    }

    public Detalle(String nombreCompleto, Date fechaNacimiento, String telefono, String email, String descripcionContacto) {
        NombreCompleto = nombreCompleto;
        FechaNacimiento = fechaNacimiento;
        Telefono = telefono;
        this.email = email;
        DescripcionContacto = descripcionContacto;
    }
}
