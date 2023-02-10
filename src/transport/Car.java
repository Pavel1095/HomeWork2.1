package transport;


public class Car extends Transport {

//     private class Key{
//          private boolean remoteEngControl;
//          private boolean keylessAccess;
//
////          public boolean isRemoteEngControl() {
////               return remoteEngControl;
////          }
////
////          public boolean isKeylessAccess() {
////               return keylessAccess;
////          }
//
//          private Key(boolean remoteEngControl, boolean keylessAccess) {
//               this.remoteEngControl = remoteEngControl;
//               this.keylessAccess = keylessAccess;
//          }
//     }

//     double engineVolume;
//     String color;
//     String transmissionType;
//     String bodyType;
//     String licencePlate;
//     int seats;
//     String tires;
//     int currentMonth;

//     public String toString() {
//          return "Марка: " + getBrand() + "\nСтрана производитель: " + getProductionCountry() + "\nГод выпуска: " + getProductionYear() + "\nМодель: " + getModel() +
//                  "\nТип кузова: " + getBodyType() + "\nЦвет: " + getColor() + "\nТрансмиссия: " + getTransmissionType() + "\nМотор: " + getEngineVolume()  +
//                  "\nМест: " + getSeats() + "\nШины: " + getTires() + "\n" + "\n ";
//     }

     public Car(String brand, String model, double engineVolume){
          super(brand, model, engineVolume);
//          this.engineVolume = engineVolume;
     }

//     public String getTires() {
//          if (isTiresWinter() == true) {
//               this.tires = "зимние";
//          }else if
//               (isTiresWinter() == false){
//               this.tires = "летние";
//          }
//          return tires;
//     }

//     public boolean isTiresWinter() {
//          int currentMonth = 2;
//          if ( currentMonth == 1){
//               return true;
//          } else if (currentMonth == 2){
//               return true;
//          } else if (currentMonth == 11){
//               return true;
//          } else if (currentMonth == 12){
//               return true;
//          } else
//               return false;
//     }


//     public double getEngineVolume() {
//          if (engineVolume <= 0){
//               this.engineVolume = 1.5;
//          }
//          return engineVolume;
//     }
//
//     public String getColor() {
//          if (color == null || color.isEmpty()){
//               this.color = "Белый";
//          }
//          return color;
//     }
//
//     public String getTransmissionType() {
//          if (transmissionType == null || transmissionType.isEmpty()){
//               this.transmissionType = "Default";
//          }
//          return transmissionType;
//     }
//
//     public final String getBodyType() {
//          if (bodyType == null || bodyType.isEmpty()){
//               this.bodyType = "Default";
//          }
//          return bodyType;
//     }
//
//     public final int getSeats() {
//          if (seats <= 0){
//               this.seats = 4;
//          }
//          return seats;
//     }
}
