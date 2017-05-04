package main.java.enums;


import org.junit.Assert;
import org.junit.Test;

public class LampsColorTest {

    @Test
    public void shouldHasYellowColorLamp() {
        //given
        String yellowValue = "Y";
        String yellowName = "YELLOW";

        //when
        LampsColor lampsColor = LampsColor.valueOf(yellowName);

        //then
        Assert.assertEquals(yellowValue, lampsColor.getColor());
    }

    @Test
    public void shouldHasRedColorLamp() {
        //given
        String yellowValue = "R";
        String yellowName = "RED";

        //when
        LampsColor lampsColor = LampsColor.valueOf(yellowName);

        //then
        Assert.assertEquals(yellowValue, lampsColor.getColor());
    }

    @Test
    public void shouldHasNoneColorLamp() {
        //given
        String yellowValue = "O";
        String yellowName = "NONE";

        //when
        LampsColor lampsColor = LampsColor.valueOf(yellowName);

        //then
        Assert.assertEquals(yellowValue, lampsColor.getColor());
    }

}