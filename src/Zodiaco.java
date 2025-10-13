import java.util.Scanner;
public class Zodiaco {
            public static void ejecutar () {
                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese el día de nacimiento: ");
                int dia = sc.nextInt();

                System.out.print("Ingrese el mes de nacimiento (1-12): ");
                int mes = sc.nextInt();

                System.out.print("Ingrese el año de nacimiento: ");
                int anio = sc.nextInt();

                int edad = 2025 - anio;

                String signo = "";

                if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                    signo = "Aries";
                }
                if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                    signo = "Tauro";
                }
                if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                    signo = "Géminis";
                }
                if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                    signo = "Cáncer";
                }
                if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                    signo = "Leo";
                }
                if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                    signo = "Virgo";
                }
                if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                    signo = "Libra";
                }
                if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                    signo = "Escorpio";
                }
                if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                    signo = "Sagitario";
                }
                if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                    signo = "Capricornio";
                }
                if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                    signo = "Acuario";
                }
                if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                    signo = "Piscis";
                }

                System.out.println("Su signo zodiacal es: " + signo);
                System.out.println("Su edad es: " + edad + " años");
            }
        }


