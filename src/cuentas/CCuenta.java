package cuentas;
/**
 * gonzalez_blazquez_marta_ED04_Tarea
 * ACTIVIDAD 1/JAVADOC. Añadir comentarios
 */
public class CCuenta {

    //Atributos de la clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    public CCuenta()
    {
    }

    public String getNombre() {  //Obtiene nombre
        return nombre;
    }

    public void setNombre(String nombre) { //Establece nombre
        this.nombre = nombre;
    }

    public String getCuenta() { //Obtiene nº cuenta
        return cuenta;
    }

    public void setCuenta(String cuenta) { //Establece nº de cuenta
        this.cuenta = cuenta;
    }

    public double getSaldo() { //Obtiene saldo
        return saldo;
    }

    public void setSaldo(double saldo) { //Establece saldo
        this.saldo = saldo;
    }

    public double getTipoInterés() { //Obtiene tipo de interés
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) { //Establece tipo de interés
        this.tipoInterés = tipoInterés;
    }
//Constructor que inicializa los atributos. falta tipo?
    public CCuenta(String nom, String cue, double sal, double tipo)
    { 
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo; //Devuelve saldo 
    }
//Metodo para ingresar 
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) //Funciona con condicion
            throw new Exception("No se puede ingresar una cantidad negativa"); //si no se cumple condicion
        saldo = saldo + cantidad;//aumenta saldo 
    }
//Metodo para retirar
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) 
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;//Disminuye el saldo
    }
}
