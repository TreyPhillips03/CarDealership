import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        WholeDealership wholeDealership = new WholeDealership();

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Revature Car Dealership!!!");
            System.out.println("Choose one of the following");

            for (int i = 0; i < wholeDealership.getAllCarSection().size(); i++) {
                System.out.println((i + 1) + ":" + wholeDealership.getAllCarSection().get(i).getName());
            }

            int userInput = scan.nextInt();

            try {  //try  is how you handle an exception
                System.out.println("You Choose " + wholeDealership.getAllCarSection().get(userInput - 1).getName());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry, please pick a valid option.");

                continue;
            }


            if (userInput == 1) {
                // display exhibit cars to user
                    CarSection currentCarSection = wholeDealership.getAllCarSection().get(0);
                    printExhibitCars(currentCarSection, scan);


            } else if (userInput == 2) {
                CarSection currentCarSection = wholeDealership.getAllCarSection().get(1);
                printExhibitCars(currentCarSection, scan);


            } else if (userInput == 3) {
                CarSection currentCarSection = wholeDealership.getAllCarSection().get(2);
                printExhibitCars(currentCarSection, scan);

            }

        }  // while loop end
    } // main method end

            public static void printExhibitCars(CarSection currentCarSection, Scanner scan) {
                System.out.println("Pick one of these cars:");
                for (int i = 0; i < currentCarSection.getCar().size(); i++) {
                    System.out.println((i+1) + ":" + currentCarSection.getCar().get(i).getName());
                }
                int carChoice = scan.nextInt();

                switch (carChoice) {
                    case 1:
                        System.out.println(currentCarSection.getCar().get(0).getFunFact());
                        break;
                    case 2:
                        System.out.println(currentCarSection.getCar().get(1).getFunFact());
                        break;
                    case 3:
                        System.out.println(currentCarSection.getCar().get(2).getFunFact());
                        break;
                }

            }

} // main class end
