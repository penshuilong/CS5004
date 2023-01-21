import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricVehicleTest {

    @Test
    // Test : get name right
    public void testNullName() {
        ElectricVehicle car = new ElectricVehicle("Car1", 10.0, 10.0, 10.0);
        assertEquals("Car1", car.getName(), car.getName());
    }


    @Test
    // Test :name is empty \ null
    public void testEmptyStringName() {
        ElectricVehicle car = new ElectricVehicle(" ", 10.0, 10.0, 10.0);
        assertEquals("unknow EV", car.getName().isEmpty(), "unknow EV");
    }


    @Test
    // Test: get the batterysize right
    public void testBatterySizeInRange() {
        ElectricVehicle car = new ElectricVehicle(null, 10.0, 0.0, 0.0);
        assertEquals(10.0, car.getBatterySize(), 0.01);
    }


    @Test
    // Test : if the batterysize is lower than the minimum
    public void testBatterySizeLessThanRange() {
        ElectricVehicle car = new ElectricVehicle(null, 1.0, 0.0, 0.0);
        assertEquals(1.0, car.getBatterySize(), 0.01);
    }


    @Test
    // Test : if the batterysize is higher than the max
    public void testBatterySizeGreaterThanRange() {
        ElectricVehicle car = new ElectricVehicle(null, 151.0, 0.0, 0.0);
        assertEquals(150.0, car.getBatterySize(), 0.01);
    }

    @Test
    // Test : get the efficiency right
    public void testEfficiencyInRange() {
        ElectricVehicle car = new ElectricVehicle(null, 150.0, 0.0, 2.0);
        assertEquals(2.0, car.getEfficiency(), 0.01);
    }


    @Test
    // Test : if the defaultefficiency is lower than minimum
    public void testEfficiencyLessThanRange() {
        ElectricVehicle car = new ElectricVehicle(null, 150.0, 0.0, 0.0);
        assertEquals(0.5, car.getEfficiency(), 0.01);
    }


    @Test
    // Test : if the defaultefficiency is higher than max
    public void testEfficiencyGreaterThanRange() {
        ElectricVehicle car = new ElectricVehicle(null, 150.0, 0.0, 5.0);
        assertEquals(4.5, car.getEfficiency(), 0.01);
    }

    @Test
    // Test : get the stateofcharge right
    public void testStateOfChargeInRange() {
        ElectricVehicle car = new ElectricVehicle(null, 150.0, 0.75, 0.0);
        assertEquals(0.75, car.getStateOfCharge(), 0.01);
    }


    @Test
    // Test : if the stateofcharge is lower than minimum
    public void testStateOfChargeLessThanRange() {
        ElectricVehicle car = new ElectricVehicle(" ", 150.0, 0.10, 0.0);
        assertEquals(0.15, car.getStateOfCharge(), 0.01);
    }


    @Test
    // Test : if the stateofcharge is higher than max
    public void testStateOfChargeGreaterThanRange() {
        ElectricVehicle car = new ElectricVehicle(" ", 150.0, 2.0, 0.0);
        assertEquals(1.0, car.getStateOfCharge(), 0.01);
    }

    @Test
    // Test : test the range
    public void testRange() {
        ElectricVehicle car = new ElectricVehicle(" ", 150.0, 1.0, 0.0);
        assertEquals(75.0, car.range(), 0.01);
    }


    @Test

    public void testGetName() {
        ElectricVehicle car = new ElectricVehicle("car2", 150.0, 1.0, 0.0);
        assertEquals("car2", car.getName(), car.getName());
    }


    @Test
    public void testGetBatterySize() {
        ElectricVehicle car = new ElectricVehicle("car2", 150.0, 1.0, 0.0);
        assertEquals(150.0, car.getBatterySize(), 0.01);
    }

    @Test
    public void testGetStateOfCharge() {
        ElectricVehicle car = new ElectricVehicle("car2", 150.0, 1.0, 0.0);
        assertEquals(1.0, car.getStateOfCharge(), 0.01);
    }
}