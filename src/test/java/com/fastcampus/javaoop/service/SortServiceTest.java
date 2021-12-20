package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private final SortService sut = new SortService(new JavaSort<>());

    @Test
    void doSort() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("3","1", "2"));

        // Then
        assertEquals(List.of("1","2","3"), actual);
    }
}