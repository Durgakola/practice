package service;

public class KicheanService {
    private String nameOfOil;
    private String typeOfRice;

    public String getNameOfOil(){

        return nameOfOil;
    }
    public void setNameOfOil(String nameOfOil){

        this.nameOfOil=nameOfOil;
    }

    public String getTypeOfRice(){

        return typeOfRice;
    }
    public void setTypeOfRice(String typeOfRice) {

        this.typeOfRice = typeOfRice;
    }

    @Override
    public String toString(){

        return "kicheanService [nameOfOil=" + nameOfOil + ",typeOfRice=" + typeOfRice + "]";
    }
}
