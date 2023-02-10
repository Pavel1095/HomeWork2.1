import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("KIA", "Sportage 4th gen", 2.4);


        Bus liaz = new Bus("ЛиАЗ", "677", 7);
        Bus ikarus = new Bus("Ikarus", "Ikarus 55", 8.3);
        Bus zil_118 = new Bus("ЗиЛ", "ЗИЛ-118 Юность", 6);
        Bus paz = new Bus ("ПаЗ", "3205", 4.7);

        Truck zil_130 = new Truck("ЗиЛ", "130", 6);
        Truck maz = new Truck ("МАЗ", "500", 14.8);
        Truck ural = new Truck ("Урал", "4320", 14.8);
        Truck gaz = new Truck ("ГАЗ", "66", 4.3);


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        System.out.println(ikarus);
        System.out.println(liaz);
        System.out.println(zil_118);
        System.out.println(paz);

        System.out.println(zil_130);
        System.out.println(maz);
        System.out.println(ural);
        System.out.println(gaz);
    }

}