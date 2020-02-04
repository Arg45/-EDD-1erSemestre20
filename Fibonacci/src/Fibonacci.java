//importamos la clase para poder leer el numero ingresado
import java.util.Scanner;

public class Fibonacci {
    public void inicio(){
        //pedimos el ingreso de un numero
        System.out.println("----------------------------------\n"+
                           " Ingrese un numero: ");
        //leemos el valor ingresado
        Scanner num = new Scanner(System.in);
        //guardamos el valor
        int a=num.nextInt();
        // guardamos el resultado del fibonacci para saber que opcion mostrar
        int f=fibo(a);
        // evaluamos el resultado
        if(f>0){
            //mostramos la respuesta
            System.out.println("----------------------------------\n"+
                               " El numero ingresado es: "+a+
                               "\n Su Fibonacci es: "+f);
            //por si quiere ingresar otro numero
            denuevo();
        }else{
            //ingresa otro numero despues de uno invalido
            denuevo();
        }
    }
    //metodo fibonacci
    public int fibo(int n){        
        //pase mucho tiempo aca ya que no me salie bien xD
        //evaluamos en que caso debe entrar
        
        //calcula el fibonacci
        if(n>1){
            //devolvemos el calculo directamente
            return fibo(n-1)+fibo(n-2);
        //devolvemos el valor 1
        }else if(n==1){
            return 1;
        //devolvemos el valor 0
        }else if(n==0){
            return 0;
        //se le notifica al usuario que el numero no es valido
        }else{
            System.out.println(" El numero ingresado no es valido.");
            return -1;
        }
    }
    //metodo para saber si esperamos otro numero
    public void denuevo(){
        Scanner num = new Scanner(System.in);
        //preguntamos si quiere ingresar otro numero
        System.out.println("---------------------------\n"+
                           " Desea ingresar otro numero?\n"+
                           "  1. Si\n"+
                           "  2. No");
        //guarmados la decision
        int b=num.nextInt();
        //si quiere ingresar otro numero, mostramos el menu del inicio
        if(b==1){
            inicio();
        }else if(b==2){
            //finaliza el programa
        }else{
            System.out.println("---------------------------\n"+
                               "Opcion invalida");
            //la opcion ingresada no es valida, se llama al mismo metodo
            denuevo();
        }
    }
}
