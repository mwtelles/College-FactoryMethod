package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PassportEUTest {

    @Test
    void mustValidate() {
        Passport passport = PassportFactory.gPassport("EU");
        assertEquals("valid passport", passport.validate());
    }

    @Test
    void mustInvalidate() {
        Passport passport = PassportFactory.gPassport("EU");
        assertEquals("invalid passport", passport.invalidate());
    }

}
