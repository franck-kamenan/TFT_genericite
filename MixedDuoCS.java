package be.technofuturtic.programmation_en_java.genericite;

public class MixedDuoCS<T1, T2> {
    private T1 premier;
    private T2 second;

    public MixedDuoCS(T1 premier, T2 second) {
        this.premier = premier;
        this.second = second;
    }

    public void setPremier(T1 premier) {
        this.premier = premier;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T1 getPremier() {
        return premier;
    }

    public T2 getSecond() {
        return second;
    }
}
