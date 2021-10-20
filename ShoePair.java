package be.technofuturtic.programmation_en_java.genericite;

public class ShoePair implements GenericiteIF<String> {

    private String premier;
    private String second;

    public ShoePair(String premier, String second) {

        this.premier = premier;
        this.second = second;
    }

    @Override
    public String getPremier() {
        return premier;
    }

    @Override
    public void setPremier(String premier) {
        this.premier = premier;
    }

    @Override
    public String getSecond() {
        return second;
    }

    @Override
    public void setSecond(String second) {
        this.second = second;
    }
}
