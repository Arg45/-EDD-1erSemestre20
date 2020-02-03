import java.util.Scanner;

public class Fibonacci {
    public void inicio(){
        System.out.println("Ingrese un numero: ");
        Scanner num = new Scanner(System.in);
        int a=num.nextInt();
        fibo(a);
    }
    public void fibo(int x){
        int f0=0;
        int f1=1;        
        int n = x;
        int f=0;
        
        
        
        System.out.println("El numero ingresado es: "+x+" y su numero Fibonacci es: "+f);
    }
}
