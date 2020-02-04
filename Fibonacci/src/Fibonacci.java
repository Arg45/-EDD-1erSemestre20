//importamos la clase para poder leer el numero ingresado
import java.util.Scanner;

public class Fibonacci {
    public void inicio(){
        //pedimos el ingreso de un numero
        System.out.println("Ingrese un numero: ");
        Scanner num = new Scanner(System.in);
        int a=num.nextInt();
        System.out.println("El numero ingresado es: "+a+" y su Fibonacci es: "+fibo(a));
    }
    public int fibo(int n){
        if(n>1){
            return fibo(n-1)+fibo(n-2);
        }else if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
            System.out.println("El numero ingresado no es valido.");
            return 0;
        }
    }
}
