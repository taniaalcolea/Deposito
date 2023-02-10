package Cuentas;

/**
 * Esta clase representa una cuenta.
 *
 * @author Tania
 * @version 1.0
 */
public class CCuenta {

    /**
     * Este método devuelve el atributo nombre.
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método modifica el nombre
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método devuelve el atributo cuenta.
     * 
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Este método modifica el atributo cuenta.
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Este método devuelve el atributo saldo.
     * 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Este método modifica el atributo saldo.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método devuelve el atributo Tipo Interés.
     * 
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *  Este método modifica el atributo Tipo Interés.
     * 
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de la clase.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom nombre
     * @param cue ciemta
     * @param sal saldo
     * @param tipo tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Este método indica el estado de la cuenta.
     * 
     * @return Saldo 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Este método ingresa una cantidad.
     * @param cantidad
     * @throws Exception Lanza una excepcción cuando ingresas una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Este método retira una cantidad
     * @param cantidad
     * @throws Exception Lanza una excepcción cuando no se puede retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
