package Actividad1Condicionales;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("====BIENVENIDO/A, ¿QUÉ TE GUSTARÍA HACER HOY?====");

        System.out.println("A) Retirar Dinero");
        System.out.println("B) Enviar Dinero");
        System.out.println("C) Cambiar PIN");

        double saldo = 1000.0;
        String usuarioPIN = "1134";

        String opcion = sc.nextLine().toUpperCase();

        switch (opcion) {
            case "A":
                System.out.println("Retirar Dinero");
                System.out.println("¿Cuánto desea retirar?");
                double retirado = sc.nextDouble();
            if (retirado > 0 && retirado <=saldo) {
                saldo = saldo - retirado;
                    System.out.println("Dinero retirado. Saldo restante: " + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
                break;
            case "B":
                System.out.println("Enviar Dinero");
                System.out.println("¿Cuánto quieres enviar?");
                double enviado = sc.nextDouble();
                if (enviado > 0 && enviado <= saldo){
                    saldo = saldo - enviado;
                    System.out.println("Dinero enviado. Saldo restante: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
            case "C":
                System.out.println("Cambiar PIN");
                System.out.println("Introducir nuevo PIN");
                String pin = sc.nextLine();
                if (!usuarioPIN.equals(pin)){
                    usuarioPIN = pin;
                    System.out.println("PIN actualizado");
                } else {
                    System.out.println("PIN NECESITA SER DIFERENTE A LA ANTERIOR");
                }
                break;
                default:
                    System.out.println("OPCIÓN INVALIDA");


        }
    }
}