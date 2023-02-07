package cuentas;


/**
 * Esta clase se encarga de crear y gestionar cuentas bancarias
 * @author Juan Marí Ibáñez
 * @version 1.0
 * @since 01.12.2022
 *
 */

public class CCuenta {

    /**almacena nombre cliente*/
    private String nombre;
    
    /**almacena número de cuenta*/
    private String cuenta;
    /**almacena saldo de la cuenta*/
    private double saldo;
    /**establece tipo de interés de la cuenta*/
    private double tipoInterés;
/**
 * constructor por defecto
 */
    public CCuenta()
    {
    }

 /**
  * constructor con parámetros encapsulados
  * @param nom - cadena de texto con nombre de titular de la cuenta
  * @param cue - cadena de texto con caracteres de la cuenta
  * @param sal - número decimal con saldo disponible en la cuenta
  * @param tipo - número decimal con interés aplicado al saldo de la cuenta
  */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }
    
    /**
     * devuelve el saldo de la cuenta a través del método getSaldo() 
     * @return getSaldo()
     */

    public double estado()
    {
        return getSaldo();
    }
    
/**
 * El metodo ingresar gestiona los ingresos de cantidades positivas en la cuenta
 * @param cantidad - cantidad que se va a añadir al saldo
 * @throws Exception si la cantidad es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    
/**
 * El método retirar gestiona las retiradas de cantidades positivas de la cuenta
 * @param cantidad - cantidad que se va a restar al saldo
 * @throws Exception si la cantidad es negativa
 * @throws Exception si no existe suficiente saldo en la cuenta
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
/**
 * Método getter - devuelve valor almacenado en campo nombre
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}

/**
 * Método setter - almacena nombre recibido por parametro en campo nombre
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 * Método getter - devuelve valor almacenado en campo cuenta
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}

/**
 * Método setter - almacena cuenta recibida por parametro en campo cuenta
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
 * Método getter - devuelve saldo almacenado en campo saldo
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}

/**
 * Método setter - almacena saldo recibido por parámetro en campo saldo
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
 * Método getter - devuelve tipo de interés almacenado en campo tipoInterés
 * @return tipoInteres
 */
	private double getTipoInterés() {
		return tipoInterés;
	}

/**
 * Método setter - almacena tipo de interes recibido por parametro en campo tipoInterés
 * @param tipoInterés
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
