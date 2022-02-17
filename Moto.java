package poo;

public class Moto {
    static int potencia; // private int potencia i així no és visible i queda encapsulat
    static int pes;
    static int motor;
    static int llarg;

    // mètode contructor
    public Moto(){
        potencia=100;
        pes=210;
        motor=1400;
        llarg=2100;
    }
}