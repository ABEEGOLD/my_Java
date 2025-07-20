package AirCondition;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAirCondition {
    AirCondition AbigailAirCondition = new AirCondition();


    @Test
    public void testThatIHaveAnAirConditionAndItIsOn() {
        AbigailAirCondition.AcisOn();
        assertTrue(AbigailAirCondition.isOn());
    }
    @Test
    public void testThatIHaveAnAirConditionAndItIsOff() {
        AbigailAirCondition.AcisOff();
        assertFalse(AbigailAirCondition.isOn());
    }
    @Test
    public void testThatAirConditionIsOn_iIncreaseTempOnce_tempIsIncreased() {
        AbigailAirCondition.AcisOn();
        assertTrue(AbigailAirCondition.isOn());
        AbigailAirCondition.IncreaseTemp();
        int value = AbigailAirCondition.getTemperature();
        assertEquals(17, AbigailAirCondition.getTemperature());
    }

    @Test
    public void testThatAirConditionIsOn_iDecreaseTempOnce_tempIsDecreased() {
        AbigailAirCondition.AcisOff();
        assertFalse(AbigailAirCondition.isOn());
        AbigailAirCondition.DecreaseTemp();
        int value = AbigailAirCondition.getTemperature();
        assertEquals(16, AbigailAirCondition.getTemperature());
    }
    @Test
    public void testThatAirConditionIsOn_iIncreaseTempBeyondThirty_tempIsStill30() {
        AbigailAirCondition.AcisOn();
        assertTrue(AbigailAirCondition.isOn());
        for (int index = 0; index < 31; index++) {
            AbigailAirCondition.IncreaseTemp();
        }
        assertEquals(30, AbigailAirCondition.getTemperature());

    }
}
