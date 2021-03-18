package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        int useraceptado = 1, contraseñacorrecta = 1, vecesingresadasoption, option;
        //stating client data
        String client1 = "ModricLucas", username;
        double c1password = 12, totalcliente2 = 3652.41, min = 1500;

        //bienvenida al sistema
        //usuario
        do {
            Scanner userinput = new Scanner(System.in);
            System.out.println("\n-----------------------------------------------------\n|| Bienvenido a la plataforma digital de Banco XYZ ||\n-----------------------------------------------------");
            System.out.println("\nPor favor introduzca su usuario");

            username = userinput.nextLine();//leer usuario

            if (username.equals(client1)) {
                System.out.println("Introduce tu contraseña");
                useraceptado = 1;
            } else {
                System.out.println("No se encuentra registrado en la plataforma");
                useraceptado = 0;
            }
        }
        while (useraceptado == 0);
        int userpassword;

        //contraseña
        do {
            Scanner passwordinput = new Scanner(System.in);
            userpassword = passwordinput.nextByte();//leer contraseña

            if (userpassword == c1password) {
                System.out.println("Bienvenido/a " + username + ", si es la primera vez que ingresas al sistema escribe '1', de lo contrario escribe '2'");
                contraseñacorrecta = 1;
            } else {
                System.out.println("Contraseña incorrecta, intenta de nuevo");
                contraseñacorrecta = 0;
            }
        }
        while (contraseñacorrecta == 0);

        Scanner veces = new Scanner(System.in);
        int vecesingresadas = veces.nextByte();

        if (vecesingresadas == 1) {

            Scanner inputcontraseña = new Scanner(System.in);
            System.out.println("Has ingresado al sistema el día " + fecha + " a la hora " + hora + "\nEstablece tu nueva contraseña.\nTen en cuenta que solo puedes escribir un número del 1 al 50.");
            userpassword = inputcontraseña.nextByte();
            System.out.println("Tu nueva contraseña se ha guardado exitosamente.\nHas cambiado la contraseña el día " + fecha + " a la hora " + hora);
        }

        System.out.println("Que desea realizar");
        Scanner opt = new Scanner(System.in);
        System.out.println("""
                [ 1 ] Cambiar contraseña
                [ 2 ] Para revisar su estado de cuenta\s
                [ 3 ] Para solicitar un crédito\s
                [ 4 ] Salir""");
        option = opt.nextByte();

            switch (option) {
                case 1 -> {
                    System.out.println("Establezca una nueva contraseña: ");
                    Scanner inputcontraseña = new Scanner(System.in);
                    userpassword = inputcontraseña.nextByte();
                    System.out.println("Tu nueva contraseña se ha guardado exitosamente.\nHas cambiado la contraseña el día " + fecha + " a la hora " + hora);
                    userpassword = inputcontraseña.nextByte();
                }
                case 2 -> {
                    Scanner days = new Scanner(System.in);
                    System.out.println("Establezca la cantidad de transacciones que desea ver: \n**solo se puede hasta 3 últimas transacciones anteriores**");
                    int accountdays = days.nextByte();

                    String l1 = "fecha  |  tipo de transacción  |  monto";
                    String l2 = "\n3/3/21 |       depósito        |  $850 ";
                    String l3 = "\n3/5/21 |       retiro          |  $206.32";
                    String l4 = "\n3/8/21 |       depósito        |  $12.68 ";
                    String acctotal = "\n su total en la cuenta es de: $5,850.85";

                    switch (accountdays) {
                        case 1 -> {
                            System.out.print(l1 + l2 + acctotal);
                        }
                        case 2 -> {
                            System.out.print(l1 + l2 + l3 + acctotal);
                        }
                        case 3 -> {
                            System.out.print(l1 + l2 + l3 + l4 + acctotal);
                        }
                    }
                }
                case 3 -> {
                    if (totalcliente2 >= min) {
                        double availability = totalcliente2 * 0.90;
                        double montobanco = availability + availability * 0.30;
                        System.out.println("Su crédito ha sido aprobado\n-----------------------\nLa cantidad disponible de crédito es: " + availability + "\nContacta al banco al +1 (786) 6458956 para proceder la confirmación del crédito");
                        System.out.println("\nEl monto que deberás pagar al banco, incluyendo la comisión de 30%, es de :" + montobanco);
                    }
                }
                case 4 -> {
                    System.out.println("Ha sido un plcer atenderte, nos vemos la próxima.\nGracias por preferir Banco XYZ\nHas cerrado sesión el día " + fecha + " a la hora " + hora);
                }
            }

    }
}
