package FactoryMethod;

public class PassportUSA implements Passport {
    public String validate() {
        return "valid passport";
    }

    public String invalidate() {
        return "invalid passport";
    }
}
