package Practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television television;

    @BeforeEach
    void setUp() {
        television = new Television(true, "panasonic", 20, 7);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTelevisionIsOn(){
        assertEquals(true, television.getIsOn());
        television.setIsOn(false);
        assertEquals(false, television.getIsOn());
    }

    @Test
    void testThatTelevisionHasProductName(){
        television.getProductName();
        assertEquals("panasonic", television.getProductName());
        television.setProductName("samsung");
        assertEquals("samsung", television.getProductName());
    }

    @Test
    void testThatTelevisionVolumeCanBeSetAndGotten(){
        television.getVolume();
        assertEquals(20, television.getVolume());
        television.setVolume(25);
        assertEquals(25, television.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCanBeIncreased(){
        television.setVolumeIncrease();
        television.setVolumeIncrease();
        television.setVolumeIncrease();
        assertEquals(23, television.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCanBeDecreased(){
        television.setVolumeDecrease();
        television.setVolumeDecrease();
        television.setVolumeDecrease();
        television.setVolumeDecrease();
        assertEquals(16, television.getVolume());
    }

    @Test
    void testThatTelevisionChannelCanBeSet(){
        television.getChannel();
        assertEquals(7, television.getChannel());
        television.setChannel(22);
        assertEquals(22, television.getChannel());
    }

    @Test
    void testThatTelevisionChannelCanBeIncreased(){
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        television.setChannelIncrease();
        assertEquals(15, television.getChannel());
    }

    @Test
    void testThatTelevisionChannelCanBeDecreased(){
        television.setChannelDecrease();
        television.setChannelDecrease();
        television.setChannelDecrease();
        assertEquals(4, television.getChannel());
    }
}