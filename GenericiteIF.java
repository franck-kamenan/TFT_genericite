package be.technofuturtic.programmation_en_java.genericite;

public interface GenericiteIF<T> {

    public T getPremier();
    public T getSecond();

    public void  setPremier(T premier);
    public void  setSecond(T second);
}
