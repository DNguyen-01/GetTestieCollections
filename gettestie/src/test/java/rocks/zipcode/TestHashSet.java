package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {


    @Test
    public void removeTest(){
        //given
        HashSet<Integer> newHashSet = new HashSet<>();
        newHashSet.add(12);
        newHashSet.add(10);
        //when
        Boolean actual = newHashSet.remove(12);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void containTest(){
        //test to see if the hashset contains an element
        //given
        HashSet<Integer> newHashSet = new HashSet<>();
        newHashSet.add(100);
        newHashSet.add(200);
        //when
        boolean actual = newHashSet.contains(100);
        //then
        Assert.assertTrue(actual);
    }


}
