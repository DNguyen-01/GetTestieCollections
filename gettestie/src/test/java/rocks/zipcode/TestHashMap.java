package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;


public class TestHashMap {



    @Test
    public void testPut(){
        //given
        //creating an object called newHashMap
        HashMap<String, Integer> newHashMap = new HashMap<>();
        Integer expected = 39;
        //when
        //inserting a key and value into the object
        newHashMap.put("David",39);
        Integer actual = newHashMap.get("David");
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testRemove(){
        //given
        HashMap<String, Integer> newHashMap = new HashMap<>();
        newHashMap.put("Lion",10);
        newHashMap.put("David",20);
        Integer expected = null;
        //when
        newHashMap.remove("Lion");
        Integer actual = newHashMap.get(10);
        Assert.assertEquals(expected,actual);
        //then
        newHashMap.remove("David");
        Integer actual2 = newHashMap.get(20);
        Assert.assertEquals(expected, actual2);
    }

}
