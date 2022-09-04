

public abstract class  Car {

    private String name;
    private String funFact;


    public  Car(String name, String funFact) {

        this.name = name;
        this.funFact = funFact;
    }
                              // this is how you incorporate encapsulation in your project with getters & setters
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public  String getFunFact() {
        return funFact;
    }
    public void setFunFact(String ff){
        this.funFact = ff;
    }
}

