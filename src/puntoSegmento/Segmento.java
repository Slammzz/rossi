package puntoSegmento;

import java.lang.Math;

class Segmento{
    private Punto puntoA;
    private Punto puntoB;

    public Segmento(Punto p1, Punto p2){
        puntoA=new Punto(p1);
        puntoB=new Punto(p2);
    }
    public void setPuntoA(Punto p){
        //puntoA=p; (aggregazione lasca)
        puntoA.setX(p.getX());
        puntoA.setY(p.getY());
    }
    public void setPuntoB(Punto p){
        puntoB.setX(p.getX());
        puntoB.setY(p.getY());
    }

    public Punto getPuntoA(){
        Punto p= new Punto(puntoA.getX(),puntoA.getY());
        return p;
        //ovvero:
        //Punto p=new Punto(puntoA.getX(),puntoA.getY());
        //return p;
    }
    public Punto getPuntoB(){
        Punto p = new Punto(puntoB);
        return p;
    }
    public double calcolaLunghezza()throws Exception{
        if(puntoA.getX()==puntoB.getX() && puntoA.getY()==puntoB.getY()){
            throw new Exception("Il segmento è nullo");
        }
        return  Math.sqrt(Math.pow(puntoB.getX() - puntoA.getX(),2) + Math.pow(puntoB.getY() - puntoA.getY(),2));
    }
    public void traslaSegmento(float deltaX, float deltaY){
        puntoA.shift(deltaX,deltaY);
        puntoB.shift(deltaX,deltaY);
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "puntoA=" + puntoA.toString() +
                ", puntoB=" + puntoB.toString() +
                '}';
    }
}
