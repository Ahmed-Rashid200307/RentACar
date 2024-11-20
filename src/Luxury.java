import java.util.Map;

public class Luxury extends Car {

  protected boolean heatedSeats;
  protected boolean ventilatedSeats;
  protected boolean massageSeats;
  protected boolean rearSeatEntertainment;
  protected String interiorMaterial;
  protected String ambientLighting;
  protected boolean adaptiveCruiseControl;
  protected boolean airSuspension;
  protected boolean allWheelSteering;
  protected String driveModes;
  protected String chauffeurPackage;
  protected boolean voiceControl;

  public Luxury(Map<String, Object> map) {

    super(map);
    boolean heatedSeats = Boolean.parseBoolean((String) map.get("heatedSeats"));
    boolean ventilatedSeats = Boolean.parseBoolean((String) map.get("ventilatedSeatse"));
    boolean massageSeats = Boolean.parseBoolean((String) map.get("massageSeats"));
    boolean rearSeatEntertainment = Boolean.parseBoolean((String) map.get("rearSeatEntertainment"));
    String interiorMaterial = (String) map.get("interiorMaterial");
    String ambientLighting = (String) map.get("ambientLighting");
    boolean adaptiveCruiseControl = Boolean.parseBoolean((String) map.get("adaptiveCruiseControl"));
    boolean airSuspension = Boolean.parseBoolean((String) map.get("airSuspension"));
    boolean allWheelSteering = Boolean.parseBoolean((String) map.get("allWheelSteering"));
    String driveModes = (String) map.get("driveModes");
    String chauffeurPackage = (String) map.get("chauffeurPackage");
    boolean voiceControl = Boolean.parseBoolean((String) map.get("voiceControl"));

  }
}