package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<String>());

    @DisplayName("test")
    @Test
    void test(){
        //given

        //when
        List<String>acc = sut.doSort(List.of("1","2","5","3","4"));

        //then
        assertEquals(List.of("1","2","3","4","5"),acc);
    }
}