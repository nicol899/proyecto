import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ingresar el priemr numero");
        int numero1=input.nextInt();
        System.out.println("ingresar el segundo numero");
        int numero2=input.nextInt();
        if (numero1>numero2) {
            System.out.println("la suma es"+(numero1+numero2));
            System.out.println("la diferencia es"+(numero1-numero2));

            } else {
                System.out.println("la divicion es"+(numero1/numero2));
                System.out.println("la multiplicacion es"+(numero1*numero2));
    
                input.close();
            }
        }
    }
    
    
    