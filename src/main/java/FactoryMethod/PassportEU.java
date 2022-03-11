package FactoryMethod;

public class PassportEU implements Passport {
    public String validate() {
        return "valid passport";
    }

    public String invalidate() {
        return "invalid passport";
    }
}
