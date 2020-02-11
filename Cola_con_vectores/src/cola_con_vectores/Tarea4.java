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
            System.out.println("Insertando primer elemento: "+o);
        }else{
            int i;
            for(i=0;Cola.length<i;i++){
                if(Cola[i]==null){
                    Cola[i]=o;
                    System.out.println("Insertado: "+o);
                }else{
                    System.out.println("Cola llena");
                }                
            }
        }
    }
    public void desencolar(){
        int i;
        if(estaVacio()){
            System.out.println("Cola vacia");
        }else{
            for(i=0;Cola.length<i;i++){
                if(Cola[i]==null){
                    System.out.println("Elemento no existente");
                    break;
                }else{
                    Cola[i]=null;
                    System.out.println("borrado el ultimo elemento");
                    break;
                }
            }            
        }
    }
    public boolean estaVacio(){
        if(Cola[0]==null){
            System.out.println("Cola vacia");
            return true;
        }
        return false;
    }
}