public class ElectricVehicle {
  // the class of the car
  private String name;
  // car's name
  private double batterySize;
  private double stateOfCharge;
  private double currentEfficiency;
  private double defaultEfficiency;

  public ElectricVehicle(String name, double batterySize, double stateOfCharge,
                           double defaultEfficiency) {
    // set the car's information
    // cherk the name is null or empty
    if (name == null || name.isEmpty()) {
      this.name = "unknow EV";
    } else {
      this.name = name;
    }
    // set the size of bastterySize
    final double batterySizemax = 150.0;
    final double batterySizemin = 10.0;

    this.batterySize = batterySize > batterySizemax
            ? batterySizemax : Math.max(batterySizemin, batterySizemin);

    // set the size of defaultEfficiency
    final double defaultEfficiencymin = 0.5;
    final double defaultEfficiencymax = 4.5;
    this.defaultEfficiency = defaultEfficiency > batterySizemax
            ? batterySizemax : Math.max(defaultEfficiencymin, defaultEfficiencymax);
    this.currentEfficiency = defaultEfficiency;

    // set the size of StateOfCharge
    final double stateOfChargemax = 1.0;
    final double stateOfChargemin = 0.15;
    this.stateOfCharge = stateOfCharge > stateOfChargemax
            ? stateOfChargemax : Math.max(stateOfChargemin, stateOfChargemax);
  }

  public double range() {
    // return the range
    return this.currentEfficiency * this.stateOfCharge * this.batterySize;
  }
  public void updateEfficiency(double currentTemp) {
    if (currentTemp >= 65.0 & currentTemp <= 77.00) {
      currentEfficiency = defaultEfficiency * 1.0;
    }
    if (currentTemp > 77.0) {
      currentEfficiency = defaultEfficiency * 0.85;
    }
    if (currentTemp < 65.0) {
      double tempgap = 65.0 - currentTemp;
      if (tempgap >= 50.0) {
        currentEfficiency = defaultEfficiency * 0.5;
      } else {
        currentEfficiency = defaultEfficiency / 100 * (100 - tempgap);
      }
    }
  }

  public double getEfficiency() {
    return this.currentEfficiency;
  }

  public double getBatterySize() {
    return this.batterySize;
  }

  public double getStateOfCharge() {
    return this.stateOfCharge;
  }

  public String getName() {
    return this.name;
  }

  public void setStateOfCharge(double stateOfCharge) {
    this.stateOfCharge = stateOfCharge;
  }


  public String toString() {
    // return string
    return this.name + " " + stateOfCharge * 100 + "% " + "Range (miles): " + this.range();
  }

}



