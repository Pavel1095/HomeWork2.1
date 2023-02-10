package transport;

public class Transport {

    String brand;
    String model;
    double engineVolume;
//    int productionYear;
//
//    String productionCountry;
//    String color;
//    int maxSpeed;


    public static void Start() {

    }

    public static void Finish() {

    }

    public Transport(String brand, String model,double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
    }

//    @Override
//    public String toString() {
//        return
//                "Марка: " + brand +
//                "\nМодель: " + model +
//                "\nГод выпуска: " + productionYear +
//                "\nСтрана производства: " + productionCountry +
//                "\nЦвет: " + color + "\n" + "\n";
//    }


//    public String getColor() {
//        if (color == null || color.isEmpty()){
//            this.color = "Белый";
//        }
//        return color;
//    }
//
//    public final int getProductionYear() {
//        if (productionYear <= 0){
//            this.productionYear = 2000;
//        }
//        return productionYear;
//    }
//
//    public final String getProductionCountry() {
//        if (productionCountry == null || productionCountry.isEmpty()){
//            this.productionCountry = "Default";
//        }
//        return productionCountry;
//    }
}
