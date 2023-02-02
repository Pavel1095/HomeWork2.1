package transport;

public class Transport {

    String brand;
    String model;
    int productionYear;

    String productionCountry;
    String color;
    int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return
                "Марка: " + brand +
                "\nМодель: " + model +
                "\nГод выпуска: " + productionYear +
                "\nСтрана производства: " + productionCountry +
                "\nЦвет: " + color + "\n" + "\n";
    }

    public final String getModel() {
        if (model == null || model.isEmpty()){
            this.model = "Default";
        }
        return model;
    }
    public final String getBrand() {
        if (brand == null || brand.isEmpty()){
            this.brand = "Default";
        }
        return brand;
    }

    public String getColor() {
        if (color == null || color.isEmpty()){
            this.color = "Белый";
        }
        return color;
    }

    public final int getProductionYear() {
        if (productionYear <= 0){
            this.productionYear = 2000;
        }
        return productionYear;
    }

    public final String getProductionCountry() {
        if (productionCountry == null || productionCountry.isEmpty()){
            this.productionCountry = "Default";
        }
        return productionCountry;
    }
}
