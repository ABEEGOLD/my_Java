package AutomaticBike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike automaticBike;
    private int speed;

    @Test
    public void testThatIHaveABike_itIsOff(){
        automaticBike = new AutomaticBike();
        boolean bikeIsOn = automaticBike.getIsOn();
        assertFalse(bikeIsOn);
//        assertTrue(bikeIsOn);
    }
    @Test
    public void testThatIHaveABikeAndItIsOff_iTurnItOn_itIsOn(){
        automaticBike = new AutomaticBike();
        boolean bikeIsOn = automaticBike.getIsOn();
        assertFalse(bikeIsOn);

        automaticBike.turnBikeOn();
        assertEquals(true, automaticBike.getIsOn());
    }
    @Test
    public void testThatIHaveABikeAndItIsOff_iTurnItOnAndOffAgain_itIsOff(){
        automaticBike = new AutomaticBike();
        boolean bikeIsOn = automaticBike.getIsOn();
        assertFalse(bikeIsOn);

        automaticBike.turnBikeOn();
        assertEquals(true, automaticBike.getIsOn());

        automaticBike.turnBikeOff();
        assertEquals(false, automaticBike.getIsOn());
    }
    @Test
    public void testThatIHaveABikeAndItIsOnAndInGear1AndSpeedIs15_iAcceleratePlusOne_speedIs16(){
        automaticBike = new AutomaticBike();
        boolean bikeIsOn = automaticBike.getIsOn();
        assertFalse(bikeIsOn);

        automaticBike.turnBikeOn();
        assertEquals(true, automaticBike.getIsOn());
        automaticBike.setSpeed(15);
        assertEquals(15, automaticBike.getSpeed());
        automaticBike.accelerateBike();
        assertEquals(16, automaticBike.getSpeed());
    }

}