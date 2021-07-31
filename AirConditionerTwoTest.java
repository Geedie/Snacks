package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTwoTest {

    @Test
    public void airConditionerCanTurnOffTest(){

        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();
        panasonic.setOn(true);
        //when
        panasonic.setOn(true);

        //check
        assertTrue(panasonic.isOn());
    }

    @Test
    public void airConditionerCanOnTest(){
        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();
        assertFalse(panasonic.isOn());

        //when
        panasonic.setOn(true);

        //assert
        assertTrue(panasonic.isOn());
    }

    @Test
    public void tempIncreaseTest(){
        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();

        //when
        panasonic.increaseTemp();
        panasonic.increaseTemp();

        //assert
        assertEquals(18, panasonic.getTemp());
    }
    @Test
    public void tempDecreaseTest(){
        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();

        //when
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.decreaseTemp();

        //assert
        assertEquals(17, panasonic.getTemp());
    }
    @Test
    public void tempCannotExceedThirtyDegreesTest() {
        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();

        //when
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();
        panasonic.increaseTemp();

        //assert
        assertEquals(30, panasonic.getTemp());
    }

    @Test
    public void tempCannotDecreaseMoreThanSixteenDegreesTest() {
        //given
        AirConditionerTwo panasonic = new AirConditionerTwo();

        //when
        panasonic.decreaseTemp();
        panasonic.decreaseTemp();
        panasonic.decreaseTemp();
        panasonic.decreaseTemp();

        //assert
        assertEquals(16, panasonic.getTemp());
    }


}
