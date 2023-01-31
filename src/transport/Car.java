package transport;


public class Car {

     private class Key{

     }

     String brand;
     String model;
     double engineVolume;
     String color;
     int productionYear;
     String productionCountry;
     String transmissionType;
     String bodyType;
     String licencePlate;
     int seats;
     String tires;
     int currentMonth;

     public String toString() {
          return "Марка: " + getBrand() + "\nСтрана производитель: " + getProductionCountry() + "\nГод выпуска: " + getProductionYear() + "\nМодель: " + getModel() +
                  "\nТип кузова: " + getBodyType() + "\nЦвет: " + getColor() + "\nТрансмиссия: " + getTransmissionType() + "\nМотор: " + getEngineVolume()  +
                  "\nМест: " + getSeats() + "\nШины: " + getTires() + "\n" + "\n ";
     }

     public Car(String brand, String model, double engineVolume, String color, int productionYear,
                String productionCountry, String transmissionType, String bodyType, String licencePlate, int seats) {
          this.brand = brand;
          this.model = model;
          this.engineVolume = engineVolume;
          this.color = color;
          this.productionYear = productionYear;
          this.productionCountry = productionCountry;
          this.transmissionType = transmissionType;
          this.bodyType = bodyType;
          this.licencePlate = licencePlate;
          this.seats = seats;
          this.currentMonth = currentMonth;
     }

     public String getTires() {
          if (isTiresWinter() == true) {
               this.tires = "зимние";
          }else if
               (isTiresWinter() == false){
               this.tires = "летние";
          }
          return tires;
     }

     public boolean isTiresWinter() {
          int currentMonth = 5;
          if ( currentMonth == 1){
               return true;
          } else if (currentMonth == 2){
               return true;
          } else if (currentMonth == 11){
               return true;
          } else if (currentMonth == 12){
               return true;
          } else
               return false;
     }

     public final String getBrand() {
          if (brand == null || brand.isEmpty()){
               this.brand = "Default";
          }
               return brand;
     }

     public final String getModel() {
          if (model == null || model.isEmpty()){
               this.model = "Default";
          }
          return model;
     }

     public double getEngineVolume() {
          if (engineVolume <= 0){
               this.engineVolume = 1.5;
          }
          return engineVolume;
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

     public String getTransmissionType() {
          if (transmissionType == null || transmissionType.isEmpty()){
               this.transmissionType = "Default";
          }
          return transmissionType;
     }

     public final String getBodyType() {
          if (bodyType == null || bodyType.isEmpty()){
               this.bodyType = "Default";
          }
          return bodyType;
     }

     public final int getSeats() {
          if (seats <= 0){
               this.seats = 4;
          }
          return seats;
     }
}
