package be.technofuturtic.programmation_en_java.genericite;

public class GenericiteMain {

    public static void main(String[] args) {

        Assurance<String> chaine = new Assurance<>("Je suis le premier.");
        System.out.println(chaine.getPremier());

        DuoCS<String> stringDuoCS = new DuoCS<>("Hello", "World!");
        System.out.println(stringDuoCS.getPremier());
        System.out.println(stringDuoCS.getSecond());

        DuoCS<Integer> integerDuoCS = new DuoCS<>(7, 5);
        System.out.println(integerDuoCS.getPremier());
        System.out.println(integerDuoCS.getSecond());

        MixedDuoCS<String, Integer> stringIntegerMixedDuoCS = new MixedDuoCS<>("Code", 123);
        System.out.println(stringIntegerMixedDuoCS.getPremier());
        System.out.println(stringIntegerMixedDuoCS.getSecond());

        NombreDuoCS<Integer> integerNombreDuoCS = new NombreDuoCS<>(3, 5);
        NombreDuoCS<Double> doubleNombreDuoCS = new NombreDuoCS<>(3.2, 5.9);
        NombreDuoCS<Number> numberNombreDuoCS = new NombreDuoCS<>(3.2, 5);
        System.out.println(integerNombreDuoCS.getSum());
        System.out.println(doubleNombreDuoCS.getSum());
        System.out.println(numberNombreDuoCS.getSum());

        // Wildcard
        NombreDuoCS<?> wildcard = new NombreDuoCS<Integer>(3, 5);
        System.out.println(wildcard.getSum());

        String s1 = stringDuoCS.getPremier();
        String s2 = stringDuoCS.getSecond();

        Integer i1 = integerDuoCS.getPremier();
        Integer i2 = integerDuoCS.getSecond();

        System.out.println(s1 + " " + s2);
        System.out.println(i1 + i2);
    }
}
