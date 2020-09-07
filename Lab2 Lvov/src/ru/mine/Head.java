package ru.mine;

public class Head  {
    private String name;
    private String hairColor;
    private String faceForm;

    public Head(String name, String faceForm,String hairColor) {

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
        return "Head information: Human part: " + name + "; Hair color:" + hairColor +
                "; FaceForm: "+ faceForm;
    }
}
