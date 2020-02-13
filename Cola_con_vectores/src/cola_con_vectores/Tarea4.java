package cola_con_vectores;

public class Tarea4 {
    Object[] Cola;
    int tamanio =10;

    public Tarea4() {
        Cola = new Object[tamanio];
    }
    public void encolar(Object o){
        if(estaVacio()){
            Cola[0]=o;
        }else{
            int i;
            for(i=0;Cola.length>i;i++){
                if(Cola[i]==null){
                    Cola[i]=o;
                    System.out.println("Insertado: "+o);
                    break;
                }else{
                    if(Cola[9]!=null){
                        System.out.println("Cola llena");
                    }
                }                
            }
        }
    }
    public void desencolar(){
        int i;
        if(estaVacio()){
            System.out.println("cola vacia");
        }else{
            for(i=0;Cola.length>i;i++){
                if(i+1<=9){
                    Cola[i]=Cola[i+1];
                }else if(i+1>9){
                    Cola[i]=null;
                }else{
                    break;
                }            
            }
        }
    }
    public boolean estaVacio(){
        return Cola[0]==null;
    }
    
    public void recorrer(){
        int i;
        for(i=0;Cola.length>i;i++){
            System.out.println("Posicion: "+i+" valor: "+Cola[i]);
        }
        System.out.println("------");
    }
}