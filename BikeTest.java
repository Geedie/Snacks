package Practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike yamaha;

    @BeforeEach
    void setUp() {
        yamaha = new Bike(true, 0, 1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBikeIsOn(){
        assertEquals(true, yamaha.getIsOn());
        yamaha.setIsOn(false);
        assertEquals(false, yamaha.getIsOn());
    }

    @Test
    void testThatSpeedCanAccelerateOnGearOne(){
        yamaha.getIsOn();
        assertEquals(0, yamaha.getCurrentSpeed());
        assertEquals(1, yamaha.getCurrentGear());

        yamaha.accelerate();
        assertEquals(1, yamaha.getCurrentSpeed());
    }

    @Test
    void testThatSpeedCanAccelerateOnGearTwo() {
        //given
        yamaha.getIsOn();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        assertEquals(21, yamaha.getCurrentSpeed());
        //when
        yamaha.accelerate();
        //check
        assertEquals(23, yamaha.getCurrentSpeed());
    }

    @Test
    void testThatSpeedCanAccelerateOnGearThree() {
        //given
        yamaha.getIsOn();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        assertEquals(31, yamaha.getCurrentSpeed());
        //when
        yamaha.accelerate();
        //check
        assertEquals(34, yamaha.getCurrentSpeed());
    }

    @Test
    void testThatSpeedCanAccelerateOnGearFour() {
        //given
        yamaha.getIsOn();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        yamaha.accelerate();
        assertEquals(40, yamaha.getCurrentSpeed());
        //when
        yamaha.accelerate();
        //check
        assertEquals(44, yamaha.getCurrentSpeed());
    }


}
