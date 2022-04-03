package Builder;

public class Coffee {
    private String watertemp;
    private String elements;
    private String speicalelement;
    private String mainelement;

    public void setWatertemp(String watertemp)
    {
        this.watertemp = watertemp;
    }

    public void setElements(String elements)
    {
        this.elements = elements;
    }

    public void setSpeicalelement(String speicalelement)
    {
        this.speicalelement = speicalelement;
    }

    public void setMainelement(String mainelement)
    {
        this.mainelement = mainelement;
    }

    public String getWatertemp() {
        return watertemp;
    }

    public String getElements() {
        return elements;
    }

    public String getSpeicalelement() {
        return speicalelement;
    }

    public String getMainelement() {
        return mainelement;
    }

    @Override
    public String toString() {
        return "Coffe {" +
                 watertemp + '\'' +
                ",  " + elements + '\'' +
                ",  " + speicalelement + '\'' +
                ",  " + mainelement + '\'' +
                '}';
    }
}
