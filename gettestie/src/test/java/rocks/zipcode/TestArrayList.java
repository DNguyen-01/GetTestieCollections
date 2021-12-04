package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TestArrayList {

    @Test
    public void getTest(){
        //given
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("David");
        newArrayList.add("Lion");
        String expected = "David";
        //when
        String actual = newArrayList.get(0);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void containTest(){
        //given
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("David");
        Boolean expected = true;
        //when
        Boolean actual = newArrayList.contains("David");
        //then
        Assert.assertNotNull(actual);
    }
}
