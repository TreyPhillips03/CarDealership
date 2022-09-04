

import java.util.ArrayList;

public class CarSection {

    private String name;
    private String description;

    private ArrayList<Car> exhibitCars;

    public CarSection(String name, String description, ArrayList<Car> exhibitCars) {
        this.name = name;
        this.description = description;
        this.exhibitCars = exhibitCars;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String d){
        this.description = d;
    }
    public ArrayList<Car> getCar() {
        return exhibitCars;
    }
    public void setCar(ArrayList<Car> anis) {
        this.exhibitCars = anis;
    }
}
