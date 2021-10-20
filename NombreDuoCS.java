package be.technofuturtic.programmation_en_java.genericite;

public class NombreDuoCS<T extends Number> {
    private T premier;
    private T second;

    public NombreDuoCS(T premier, T second) {
        this.premier = premier;
        this.second = second;
    }

    public T getPremier() {
        return premier;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public double getSum() {
        return premier.doubleValue() + second.doubleValue();
    }
}
