package dev.naimsulejmani.basicgr3;


public class Employee {
    private int id;
    private String name;
    private String surname;
    private double paga;

    public Employee(int id, String name, String surname, double paga) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.paga = paga;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }
}
