package edu.bsu.cs222.tddlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testSize_initialList_Zero(){
        LinkedList list = new LinkedList();
        Assertions.assertEquals(0, list.size());
    }

}
