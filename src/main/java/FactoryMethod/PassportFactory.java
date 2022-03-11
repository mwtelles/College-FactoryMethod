package FactoryMethod;

public class PassportFactory {

    public static Passport gPassport(String passport) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Passport" + passport);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("non-existent passport");
        }
        if (!(objeto instanceof Passport)) {
            throw new IllegalArgumentException("invalid passport");
        }
        return (Passport) objeto;
    }
}
