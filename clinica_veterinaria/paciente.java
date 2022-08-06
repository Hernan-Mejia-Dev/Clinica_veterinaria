
package clinica_veterinaria;

public class paciente {
    private String nombre;
    private String titular;
    private String raza;
    private String sintomas;
    private int gastoProcedimientos;
    private int gastoMedicamentos;
    private int horasEnClinica;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getGastoProcedimientos() {
        return gastoProcedimientos;
    }

    public void setGastoProcedimientos(int gastoProcedimientos) {
        this.gastoProcedimientos = gastoProcedimientos;
    }

    public int getHorasEnClinica() {
        return horasEnClinica;
    }

    public void setHorasEnClinica(int horasEnClinica) {
        this.horasEnClinica = horasEnClinica;
    }

    public int getGastoMedicamentos() {
        return gastoMedicamentos;
    }

    public void setGastoMedicamentos(int gastoMedicamentos) {
        this.gastoMedicamentos = gastoMedicamentos;
    }
}
