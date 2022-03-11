package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PassportBrazilTest {

    @Test
    void mustValidate() {
        Passport passport = PassportFactory.gPassport("Brazil");
        assertEquals("valid passport", passport.validate());
    }

    @Test
    void mustInvalidate() {
        Passport passport = PassportFactory.gPassport("Brazil");
        assertEquals("invalid passport", passport.invalidate());
    }

}
