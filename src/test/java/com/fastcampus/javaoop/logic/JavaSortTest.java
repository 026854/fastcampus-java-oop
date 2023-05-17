package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바소트 - 리스트가 주어지면 버블 소트해서 돌려줌")
    @Test
    void given_List_return_sorted_list_by_bubble(){
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> sorted = javaSort.sort(List.of(4,5,3,1,2));
        //then
        assertEquals(List.of(1,2,3,4,5),sorted );
    }

}