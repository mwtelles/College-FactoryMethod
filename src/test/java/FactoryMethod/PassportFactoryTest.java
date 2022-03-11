package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class PassportFactoryTest {

    @Test
    void mustReturnNonExistentPassport() {
        try {
            Passport passport = PassportFactory.gPassport("Asia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("non-existent passport", e.getMessage());
        }
    }

    @Test
    void mustReturnInvalidPassport() {
        try {
            Passport passport = PassportFactory.gPassport("Brazill");
        } catch (IllegalArgumentException e) {
            assertEquals("invalid passport", e.getMessage());
        }
    }
}
