package web.model;

public class Car {
    private Long id;
    private String model;
    private int yearOfProduction;

    public Car() {
    }

    public Car(Long id, String model, int yearOfProduction) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
