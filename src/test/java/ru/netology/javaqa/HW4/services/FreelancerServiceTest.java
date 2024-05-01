package ru.netology.javaqa.HW4.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {

    @Test
    public void test1() {
        FreelancerService freelancerService = new FreelancerService();
        int result = freelancerService.calculate(10000, 3000, 20000);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        FreelancerService freelancerService = new FreelancerService();
        int result = freelancerService.calculate(100000, 60000, 150000);
        assertEquals(2, result);
    }
}