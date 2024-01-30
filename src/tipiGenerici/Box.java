package tipiGenerici;

public class Box <T>{
    private T t;

    public Box(){

    }

    public Box(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }

    //per capire il tipo
    public Class tipo(){
        return t.getClass();
    }

    static public <T> T verificaTipo(T valore){

        return (T)valore.getClass();
    }
    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
