package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalcTest {
    static Calc calc=null;
    @BeforeAll
    static void テスト前処理(){
        calc=new Calc();
    }
    @Test 
    void addテスト正常(){
        assertEquals(calc.add(1,3),4);
    }

    @Test
    void divテスト正常(){
        assertEquals(calc.div(5,4), 1);
    }


    @Test
    void mulテスト正常(){
        assertEquals(calc.mul(5,5),25);
    }
    
    @Disabled
    void addテスト異常(){
        assertEquals(calc.add(3,3),33);
    }

    
    @AfterAll
    static void テスト後処理(){
        calc = null;
    }
}
