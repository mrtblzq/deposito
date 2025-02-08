package cuentas;
/**
 * gonzalez_blazquez_marta_ED04_Tarea
 * clase principal
 */
public class Main {
 
    public static void main(String[] args) {
        operativa_cuenta(2500); //llama al metodo operativa_cuenta con saldo inicial 2500
    }

    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;//objeto de tipo CCuenta
        double saldoActual;// variable para almacenar saldo actual
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();//obtiene saldo actual
        System.out.println("El saldo actual es"+ saldoActual );//lo imprime en pantalla

        try {//intenta retirar
            cuenta1.retirar(2300);
        } catch (Exception e) {//manejo de excepciones si falla al retirar
            System.out.print("Fallo al retirar");
        }
        try {//intenta ingresar
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {//manejo de excepciones si falla al ingresar
            System.out.print("Fallo al ingresar");
        }
    }
}
