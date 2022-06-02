package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/**
 * Import class
 */
import java.util.Scanner;


/**
 * Create class
 */
public class App {
	
    private static final String MannedCraft = null;
    private static final String RocketCraft = null;
    private static final String DroneCraft = null;
    private static final String PrototypeCraft = null;

    public static void main(String[] args) throws Exception {       
    	  	
    	/**
         * Main menu
         */
    	
    	
    	
    	System.out.println("\n");    	
    	System.out.println("       *********** Welcome ***********");
        System.out.println(" ");
        System.out.println("Select a type of spacecraft: ");
        System.out.println(" ");
        System.out.println("1 Shuttle");
        System.out.println("2 Unmanned spacecraft");
        System.out.println("3 Passenger spacecraft");
        System.out.println("4 Multipurpose spacecraft");
        System.out.println("0 Exit");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicate your choice:");
        int option = sc.nextInt();
        
        
        

        /**
         * The switch allows to manage the available options
         */
        switch (option) {

            case 1:
                System.out.println("You have entered option 1. Preparing Rocket for Propulsion");               
                RocketCraft lanzadera = new RocketCraft(01, " Falcon IX Shuttle", " Propelling spacecrafts Out of Orbit",
                        " Propelling manned spacecraft");
                lanzadera.showdata(RocketCraft);
                lanzadera.status();

                break;

            case 2:
                System.out.println("You have entered option 2. Success in your exploration!!!");                
                DroneCraft sonda = new DroneCraft(02, " Surveyor", " Zoom Super", " orbiting jupiter's moons",
                        " Taking pictures");
                sonda.showdata(DroneCraft);

                break;

            case 3:
                System.out.println(" You have entered option 3.  We look forward to seeing you back!!!");               
                MannedCraft naveTripulada = new MannedCraft(03, " Apolo", " passenger transportation",
                        " transport squadron", " Passenger container");
                naveTripulada.showdata(MannedCraft);

                break;

            case 4:
                System.out.println("You have entered option 4,  Experimental spacecraft in launch process.");                
                PrototypeCraft specialCraft = new PrototypeCraft(04, " Mariner X",
                        " All-in-one multi-purpose multi-functional spacecraft",
                        " transport of probes and crew for sampling and exploration", " image capture",
                        " passenger transportation", true);
                specialCraft.showdata(PrototypeCraft);
                specialCraft.status();
              //  break;

            case 5:
                System.exit(0);

            default:
                System.out.println("See you later!!!");

        }

    }
}
