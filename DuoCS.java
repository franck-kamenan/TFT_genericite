package be.technofuturtic.programmation_en_java.genericite;

public class DuoCS<T> {
    private T premier;
    private T second;

    public DuoCS(T premier, T second) {
        this.premier = premier;
        this.second = second;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public void swap() {
        T temp = second;
        second = premier;
        premier = temp;
    }
}
