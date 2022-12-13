package web.model;

public class Car {
    private String model;
    private Integer series;
    private String year;

    public Car() {
    }

    public Car(String model, Integer series, String year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }
}
