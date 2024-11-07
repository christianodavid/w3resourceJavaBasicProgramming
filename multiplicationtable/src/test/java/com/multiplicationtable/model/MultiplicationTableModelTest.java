package com.multiplicationtable.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableModelTest {
    @Test
    public void testGetterAndSetter() {
        MultiplicationTableModel multiplicationTableModel = new MultiplicationTableModel();
        multiplicationTableModel.setNumber(5);
        assertEquals(5, multiplicationTableModel.getNumber());
    }
}
