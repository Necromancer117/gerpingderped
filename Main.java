package poo;

public class Main {

    public static void main(String[] args) {
        Moto Bmw=new Moto(); // Instanciar una classe
        // Bmw.motor=3; // modificador d'accés private, public, protected, default - Encapsulació
        System.out.println("Aquesta moto té una cilindrada de "+ Bmw.motor + " centimecres cúbics");
        Bicicleta adri=new Bicicleta();
        System.out.println(adri.culiao);
    }
}