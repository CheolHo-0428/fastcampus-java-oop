package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void sort() {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<Integer>();
        // When
        List<Integer> actual = javaSort.sort(List.of(3,1,4,5,2));
        List<Integer> expected = List.of(1,2,3,4,5);
        // Then
        assertEquals(expected, actual);
    }
}