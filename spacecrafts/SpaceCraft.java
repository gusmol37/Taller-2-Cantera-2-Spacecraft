package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/**
 * Main class allows me to create spacecraft of different types by applying the inheritance
 */
public abstract class SpaceCraft {

	/** 
     * Class attributes
     */
     private int id;
     private String name;
     private String specialty;
     private String mission;

     /**
      * Constructor and parameters
      * @param id
      * @param name
      * @param specialty
      * @param mission
      */
     public SpaceCraft(int id, String name, String specialty, String mission) {
          this.id = id;
          this.name = name;
          this.specialty = specialty;
          this.mission = mission;
     }
     
     

     /** 
       *Getters and setters 
      */
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

     public String getSpecialty() {
          return specialty;
     }

     public void setSpecialty(String specialty) {
          this.specialty = specialty;
     }

     public String getMission() {
          return mission;
     }

     public void setMission(String mission) {
          this.mission = mission;
     }

     /**
      * Allows to display the general data to the spacecrafts and to be called from the different
      * classes of spacecraft
      * 
      * @param nameClass
      */
     public void showdata(String nameClass) {
          System.out.println("ID:" + id);
          System.out.println("Spacecraft Name:" + name);
          System.out.println("Speciality:" + specialty);
          System.out.println("Mission:" + mission);

     }

}