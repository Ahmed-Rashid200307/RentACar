import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Utils {
  Scanner input = new Scanner(System.in);
  ArrayList<String> carData = new ArrayList<>(Arrays.asList("brand","model","year","price","color","registrationNumber","isAvailable","rentPerHour","engineCapacity","seatingCapacity","fuelEfficiency","isHybrid","transmission","fuelType","location","mileage","insuranceDetails","lastServiceDate","carCategory","topSpeed","entertainment","sunroof","safetyRating","luggageCapacity","heatedSeats","ventilatedSeats","massageSeats","rearSeatEntertainment","interiorMaterial","ambientLighting","adaptiveCruiseControl","airSuspension","allWheelSteering","driveModes","chauffeurPackage","voiceControl"));
  public boolean running = true;
  
  
  public void start(Map<String, Object> allCars) {
    while (running) {
      switch (chooseOption()) {
        case 1:
        addCar(allCars);
        break;
        
        default:
        break;
      }
    }
  }
  
  public int chooseOption () {
    int option;
    System.out.println("\nChoose Option");
    System.out.println("1. Add Car");
    System.out.println("2. Rent a Car");
    System.out.println("3. Remove Car");
    System.out.println("4. Edit Car");
    System.out.println("5. Display Car");
    System.out.println("6. Display All Cars");
    System.out.println("7. Display Rented Cars");
    System.out.println("8. Display Available Cars");
    System.out.println("9. Display Cars by Brand");
    System.out.println("10. Display Cars by Model");
    System.out.println("11. Display Cars by Year");
    System.out.println("12. Display Cars by Price");
    System.out.println("13. Display Cars by Color");
    System.out.println("14. Display Cars by Registration Number");
    
    option = input.nextInt();
    return option;
  }
  
  public int chooseCarType () {
    int option;
    System.out.println("\nChoose Car Type");
    System.out.println("1. Economy");
    System.out.println("2. Luxury");
    System.out.println("3. Exit");
    
    option = input.nextInt();
    input.nextLine();
    return option;
  }
  
  public Map<String, Object> insertData(int typeOption) {
    Map<String, Object> carDataMap = new HashMap<>();
    if(typeOption == 1) {
      for(int i = 0; i< 24; i++){
        System.out.println("Enter " + carData.get(i) + ": ");
        carDataMap.put(carData.get(i), input.nextLine());
      }
    }
    else if(typeOption == 2) {
      for(int i = 0; i< 36; i++){
        System.out.println("Enter " + carData.get(i) + ": ");
        carDataMap.put(carData.get(i), input.nextLine());
      }
    }

    return carDataMap;
  }
  
  public Map<String, Object> addCar(Map<String, Object> allCars) {
    int carType = chooseCarType();
    Map<String, Object> carDataMap = insertData(carType);
    String carIdentifier = carDataMap.get("brand").toString() + "-" + carDataMap.get("model").toString() + "-" + carDataMap.get("year").toString();

    if(carType == 1){
      allCars.put(carIdentifier, new Economy(carDataMap));
    }else if(carType == 2){
      allCars.put(carIdentifier, new Luxury(carDataMap));
    }else{
      System.out.println("Unknown error: Car not added");
      return allCars;
    }

    return allCars;

  }
}
