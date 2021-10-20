package be.technofuturtic.programmation_en_java.genericite;

public class Assurance<T> {

    private T premier;

    public Assurance(T premier) {
        this.premier = premier;
    }

    public T getPremier() {
        return premier;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }
}
