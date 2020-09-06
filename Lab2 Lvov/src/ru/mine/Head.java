package ru.mine;

public class Head extends Human {
    private String hairColor;
    private String faceForm;

    public Head(String name, String skinColor, String faceForm,String hairColor) {
        super(name,skinColor);
        this.faceForm = faceForm;
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getFaceForm() {
        return faceForm;
    }
    public void setFaceForm(String faceForm) {
        this.faceForm = faceForm;
    }
    public String toString() {
        return "Head information: Human part: " + name + "; Skin Color " + getSkinColor() + "; Hair color:" + hairColor +
                "; FaceForm: "+ faceForm;
    }
}
