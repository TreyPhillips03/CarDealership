//  zoo class
//  manages everything


import java.util.ArrayList;

public class WholeDealership {

   private ArrayList<CarSection> allCarSection = new ArrayList<CarSection>();

   public ArrayList<CarSection> getAllCarSection() {
       return allCarSection;
   }
   public void setExhibits(ArrayList<CarSection> carSections) {
       this.allCarSection = carSections;
   }

    public WholeDealership(){

        Car fordFocus = new Sedan("Ford Focus", "The Ford Focus is a great reliable 4 seater sedan.");
        Car camry = new Sedan("Toyota Camry", "This Toyota Camry sedan runs forever.");
        Car accord = new Sedan("Honda Accord", "This Honda Accord sedan never breaks down.");


        Car tesla = new Electric("Tesla Model Y", "This Tesla Model Y cost $10 to fill up. ");
        Car leaf = new Electric("Nissan Leaf", "The Nissan Leaf gets 250 miles per charge.");
        Car mustang = new Electric("Ford Mustang Mach-E", "The Mustang Mach is super fast.  ");


        Car rav4 = new Suv("Toyota Rav 4", "This Toyota Rav4 suv is great for people with kids.");
        Car cherokee = new Suv("Jeep Grand Cherokee" , "This Jeep Cherokee suv is great for road trips.");
        Car wrangler = new Suv("Jeep Wrangler" , "This Wrangler suv is perfect for off roading adventures.");

        ArrayList<Car> exhibit1Cars = new ArrayList<Car>();
        exhibit1Cars.add(fordFocus);
        exhibit1Cars.add(camry);
        exhibit1Cars.add(accord);

        CarSection newCarSection = new CarSection("New Car Section" , "Welcome to the New car section!",exhibit1Cars );

        ArrayList<Car> exhibit2Cars = new ArrayList<Car>();
        exhibit2Cars.add(rav4);
        exhibit2Cars.add(cherokee);
        exhibit2Cars.add(wrangler);

        CarSection usedCarSection = new CarSection("Used Car Section" , "Welcome to the Used car section!",exhibit2Cars);

        ArrayList<Car> exhibit3Cars = new ArrayList<Car>();
        exhibit3Cars.add(tesla);
        exhibit3Cars.add(leaf);
        exhibit3Cars.add(mustang);

        CarSection electicCarSection = new CarSection("Electric Car Section" , "Welcome to the Electric car section!", exhibit3Cars);

        allCarSection.add(newCarSection);
        allCarSection.add(usedCarSection);
        allCarSection.add(electicCarSection);
    }
}
