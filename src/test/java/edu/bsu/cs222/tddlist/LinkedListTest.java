package edu.bsu.cs222.tddlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList<String> list;

    @BeforeEach
    void setUp(){
        list = new LinkedList<>();
    }

    @Test
    public void testSize_initialList_sizeIsZero(){
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElementList_sizeIsOne(){
        givenAListContaining("a");
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testGet_oneElementList(){
        givenAListContaining("a", "b");
        String result = list.get(0);
        Assertions.assertEquals("a", result);
    }

    @Test
    public void testSize_oneElementList_addSecondElement(){
        givenAListContaining("a", "b");
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testGet_givenTwoElementsList_firstElementIsA() {
        givenAListContaining("a", "b");
        String result = list.get(0);
        Assertions.assertEquals("a", result);
    }

    @Test
    public void testGet_givenTwoElementsList_secondElementIsB() {
        givenAListContaining("a", "b");
        String result = list.get(1);
        Assertions.assertEquals("b", result);
    }

    @Test
    public void testRemove_givenTwoElementsList_firstItemIsRemoved() {
        givenAListContaining("a", "b");
        String result = list.remove(0);
        Assertions.assertEquals("a", result);
    }

    @Test
    public void testRemove_givenTwoElementsList_sizeIsOne() {
        givenAListContaining("a", "b");  //given when then convention - GWT
        whenTheFirstElementIsRemoved();
        thenTheSizeIsOne();
    }

    private void thenTheSizeIsOne() {
        Assertions.assertEquals(1, list.size());
    }

    private void whenTheFirstElementIsRemoved() {
        list.remove(0);
    }

    @Test
    public void testRemove_givenTwoElementsList_firstElementShouldBeB() {
        givenAListContaining("a", "b");
        whenTheFirstElementIsRemoved();
        Assertions.assertEquals("b", list.get(0));
    }

    private void givenAListContaining(String... elements) {
        for (String s : elements) {
            list.add(s);
        }
    }

}
