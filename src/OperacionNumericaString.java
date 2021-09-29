import java.util.Scanner;

public class OperacionNumericaString {
    static Scanner in = new Scanner(System.in);
    static String cadena;
    static int numero1=0,numero2=0;
    public static void main(String[] args) {

        LeerCadenaNumero();

    }
    public static void LeerCadenaNumero(){
        try{
            do{
            System.out.println("Escribir la operación que desea realizar: ");
            cadena=in.nextLine();
            }while (!cadena.matches("[0-9+/*\\s]*"));
            if (cadena.contains("+")){
                numero1=Integer.parseInt(cadena.substring(0,cadena.lastIndexOf("+")).trim());
                numero2=Integer.parseInt(cadena.substring(cadena.lastIndexOf("+")+1).trim());
                System.out.println("El resultado es: " + (numero1 + numero2));
            } else if (cadena.contains("-")) {
                numero1 = Integer.parseInt(cadena.substring(0, cadena.lastIndexOf("-")).trim());
                numero2 = Integer.parseInt(cadena.substring(cadena.lastIndexOf("-") + 1).trim());
                System.out.println("El resultado es: " + (numero1 - numero2));
            } else if (cadena.contains("*")) {
                numero1 = Integer.parseInt(cadena.substring(0, cadena.lastIndexOf("*")).trim());
                numero2 = Integer.parseInt(cadena.substring(cadena.lastIndexOf("*") + 1).trim());
                System.out.println("El resultado es: " + (numero1 * numero2));
            }else if (cadena.contains("/")) {
                numero1 = Integer.parseInt(cadena.substring(0, cadena.lastIndexOf("/")).trim());
                numero2 = Integer.parseInt(cadena.substring(cadena.lastIndexOf("/") + 1).trim());
                if (numero2==0) {
                    System.out.println("El resultado es 0, ya que no podemos dividir entre cero");
                } else {
                    System.out.println("El resultado es: " + (numero1 / numero2));
                }
            }


        }catch(Exception e){
            System.out.println("Dato no valido");
            main(new String[0]);
        }
        /*do{
            System.out.println("Escribir primer numero: ");
             numero1=in.nextLine();
        }while (numero1.matches("[0-9\\s]*"));
        do{
            System.out.println("Escribir segundo numero: ");
            numero2=in.nextLine();
        } while (numero2.matches("[0-9\\s]*"));
        System.out.println("Suma: " );*/
    }


}
