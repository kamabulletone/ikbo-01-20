package ru.mine;

public class Client {
    private String name;
    private String surname;
    private String secondName;
    private String inn;

    public Client(String name, String surname, String secondName, String inn) throws WrongINNCode {

        this.name= name;
        this.surname = surname;
        this.secondName = secondName;
        if (inn.length() > 10) {
            throw new WrongINNCode("Wrong INN code was typed");
        }
        this.inn = inn;

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
