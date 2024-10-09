package mx.unam.fi.poo.g1.e1;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        setRadio(radio);
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return this.radio;
    }

    @Override
    public void dibuja(){
        System.out.println("Más adelante van a usar gráficos");
    }
    @Override
    public double calcularArea(){
        return Math.PI*getRadio()*getRadio();
    }
}