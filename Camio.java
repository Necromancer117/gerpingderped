package poo;

public class Camio { // Classe publica - principal. La resta no han de ser públiques i aquesta és la que ha de tenir el mètode main.
    static int potencia;
    static int pes;
    static int motor;
    static int llarg;

    // mètode contructor
    public Camio(){
        potencia=100;
        pes=210;
        motor=1400;
        llarg=2100;
    }
    public static void main(String[] args) {
        Camio Nissan=new Camio(); // Instanciar una classe
        Bicicleta Treck=new Bicicleta();//Instanciar una classe
        // Moto.motor=3; // modificador d'accés private, public, protected, default - Encapsulació
        System.out.println("Aquest camió té una cilindrada de "+ Nissan.motor + " centimecres cúbics");
        System.out.println("Aquesta bicicleta té "+ Treck.rodes + " rodes");
        System.out.println("quien es puta? "+Treck.puta);
        System.out.println("que menja? "+Treck.marron);
    }
}
class Bicicleta{ //hem creat una nova classe
    static int rodes;
    static int pes;
    static String puta;
    static String marron;
    static int culiao;

    // mètode contructor
    public Bicicleta(){
        rodes=2;
        pes=14;
        puta="el adri lo es";
        marron="xocolata";
        culiao= 10+1+rodes;
    }

}