package com.allstate.rpd.code.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillionUsersTest {

    BillionUsers billionUsers;

    @BeforeEach
    void setup(){
        billionUsers = new BillionUsers();
    }
    @Test
    void getBillionUsersDayExample1() {

        float [] growthRates = {1.5F};

        assertEquals(52F, billionUsers.getBillionUsersDay(growthRates));

    }

    @Test
    void getBillionUsersDayExample2() {

        float [] growthRates = {1.1F, 1.2F, 1.3F};

        assertEquals(79F, billionUsers.getBillionUsersDay(growthRates));

    }

    @Test
    void getBillionUsersDayExample3() {

        float[] growthRates = {1.01F, 1.02F};

        assertEquals(1047F, billionUsers.getBillionUsersDay(growthRates));

    }
}