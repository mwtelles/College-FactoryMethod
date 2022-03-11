package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PassportUSATest {

    @Test
    void mustValidate() {
        Passport passport = PassportFactory.gPassport("USA");
        assertEquals("valid passport", passport.validate());
    }

    @Test
    void mustInvalidate() {
        Passport passport = PassportFactory.gPassport("USA");
        assertEquals("invalid passport", passport.invalidate());
    }

}
