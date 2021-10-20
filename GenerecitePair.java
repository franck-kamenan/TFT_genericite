package be.technofuturtic.programmation_en_java.genericite;

public class GenerecitePair<T> implements GenericiteIF<T> {

    private T premier;
    private T second;

    public GenerecitePair(T premier, T second) {

        this.premier = premier;
        this.second = second;
    }

    @Override
    public T getPremier() {

        return premier;
    }

    @Override
    public void setPremier(T premier) {

        this.premier = premier;
    }

    @Override
    public T getSecond() {

        return second;
    }

    @Override
    public void setSecond(T second) {

        this.second = second;
    }
}
