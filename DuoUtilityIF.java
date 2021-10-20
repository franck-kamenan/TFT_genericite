package be.technofuturtic.programmation_en_java.genericite;

import java.util.Locale;

public interface DuoUtilityIF {

    public static void printUpper(DuoCS<String> duoCS) {

        System.out.println(duoCS.getPremier().toUpperCase() + ", "
                + duoCS.getSecond().toUpperCase());
    }

    public static void otherUpper(DuoCS<?> duoCS) {

        System.out.println(duoCS.getPremier() + ", "
                + duoCS.getSecond());
    }
}
