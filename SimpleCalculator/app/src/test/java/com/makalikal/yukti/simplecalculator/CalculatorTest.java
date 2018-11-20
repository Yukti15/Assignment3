package com.makalikal.yukti.simplecalculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void addition_20_20_40() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.addition(20, 20);
        assertThat(result, is(40));
    }
    @Test
    public void addition_0_17() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.addition(0, 17);
        assertThat(result, is(result));
    }
    @Test
    public void addition_10_12_22() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.addition(10, 12);
        assertThat(result, is(22));
    }
    @Test
    public void subtraction_15_5_10() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.subtraction(15, 5);
        assertThat(result, is(10));
    }
    @Test
    public void subtraction_150_5_145() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.subtraction(150, 5);
        assertThat(result, is(145));
    }
    @Test
    public void subtraction_10_5_5() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.subtraction(10, 5);
        assertThat(result, is(5));
    }
    @Test
    public void multiplication_5_100_500() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.multiplication(5, 100);
        assertThat(result, is(500));
    }
    @Test
    public void multiplication_0_5_0() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.multiplication(0, 5);
        assertThat(result, is(0));
    }
    @Test
    public void multiplication_45_3_135() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.multiplication(45, 3);
        assertThat(result, is(135));
    }
    @Test
    public void division_12_6_2() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.division(12, 6);
        assertThat(result, is(2));
    }
    @Test
    public void division_2_1_2() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.division(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void division_9_3_3() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.division(9, 3);
        assertThat(result, is(3));
    }
}