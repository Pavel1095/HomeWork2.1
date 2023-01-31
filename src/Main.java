import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Желтый",
                2015, "Россия", "МКПП", "Седан", "001", 4);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный",
                2020, "Германия", "АКПП", "Седан", "002", 4);

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный",
                2021, "Германия", "АКПП", "Родстер", "003", 2);

        Car kia = new Car("KIA", "Sportage 4th gen", 2.4, "Красный",
                2018, "Южная Корея", "АКПП", "Кроссовер", "004", 5);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                2016, "Южная Корея", "АКПП", "Купе", "005", 2);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}