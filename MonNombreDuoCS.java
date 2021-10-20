package be.technofuturtic.programmation_en_java.genericite;

public class MonNombreDuoCS<T extends Number> extends DuoCS<T> {

    public MonNombreDuoCS(T premier, T second) {

        super(premier, second);
    }
}
