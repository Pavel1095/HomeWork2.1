package transport;


public class Car {
     final String brand;
     final String model;
     double engineVolume;
     String color;
     final int productionYear;
     final String productionCountry;
     String transmissionType;
     final String bodyType;
     String licencePlate;
     final int seats;
     boolean tires;
     int currentMonth;


     public Car(String brand, String model, double engineVolume, String color, int productionYear,
                String productionCountry, String transmissionType, String bodyType, String licencePlate, int seats, int currentMonth) {
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

     public String toString() {
          return "Марка: " + getBrand() + "\nСтрана производитель: " + getProductionCountry() + "\nГод выпуска: " + getProductionYear() + "\nМодель: " + getModel() +
                  "\nТип кузова: " + getBodyType() + "\nЦвет: " + getColor() + "\nТрансмиссия: " + getTransmissionType() + "\nМотор: " + getEngineVolume()  +
                  "\nМест: " + getSeats() + "\nШины: " + getTires();
     }

     public boolean getTires() {
          if (isTiresWinter() == true) {
               System.out.println("Шины: зимние");;
          }else if
               (isTiresWinter() == false){
          System.out.println("Шины: летние");
          }
          return this.tires;
     }


     public boolean isTiresWinter() {
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


     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public double getEngineVolume() {
          return engineVolume;
     }

     public String getColor() {
          return color;
     }

     public int getProductionYear() {
          return productionYear;
     }

     public String getProductionCountry() {
          return productionCountry;
     }

     public String getTransmissionType() {
          return transmissionType;
     }

     public String getBodyType() {
          return bodyType;
     }

     public int getSeats() {
          return seats;
     }
}
