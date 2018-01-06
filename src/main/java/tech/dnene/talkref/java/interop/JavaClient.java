package tech.dnene.talkref.java.interop;

import tech.dnene.talkref.examples.Car;
import tech.dnene.talkref.examples.GSTINValidator;
import tech.dnene.talkref.examples.StaticObject;

import java.util.HashSet;
import java.util.Set;

public class JavaClient {
    public static void main(String[] args) {
        /** call static methods **/
        boolean result = GSTINValidator.INSTANCE.validate("99ZZZZZ9999Z9ZP");
        System.out.println(result);

        StaticObject.foo();
        System.out.println(StaticObject.maxInt);
        Car car1 = new Car("Honda", "Accord", 2017);
        System.out.println(car1);
        Set makes = new HashSet<String>();
        makes.add("Honda");
        makes.add("Jaguar");
        System.out.println(car1.isMakeIn(makes));
//        Car car2 = new Car("Honda", "Accord", null); // <-- won't compile
    }
}
