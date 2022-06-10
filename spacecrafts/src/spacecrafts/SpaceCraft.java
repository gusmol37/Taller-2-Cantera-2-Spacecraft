package spacecrafts;

/**
 * Class that allows the handling of methods and objects spacecraft
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
 */

/**
 * Main class allows me to create spacecraft of different types by applying the inheritance
 */
public abstract class SpaceCraft {

	/** 
     * Class attributes
     * 
     * @param id: spacecraft identifier
	 * @param name: spacecraft name
	 * @param specialty: specialty
	 * @param mission: mission carried out
     */
     private int id;
     private String name;
     private String specialty;
     private String mission;
     
     
     /**
      * Constructor and parameters
      * @param id: spacecraft identifier
	  * @param name: spacecraft name
	  * @param specialty: specialty
	  * @param mission: mission carried out
      */
     public SpaceCraft(int id, String name, String specialty, String mission) {
          this.id = id;
          this.name = name;
          this.specialty = specialty;
          this.mission = mission;
     }
   
     /**
 	 * Method that captures data in the attribute id.
 	 * 
 	 * @return data stored in attribute id.
 	 */
     public int getId() {
          return id;
     }

     /**
 	 * Method that assigns initial data in the attribute id.
 	 * 
 	 * @return data stored in id
 	 */
     public void setId(int id) {
          this.id = id;
     }

     /**
  	 * Method that captures data in the attribute name.
  	 * 
  	 * @return data stored in attribute name.
  	 */
     public String getName() {
          return name;
     }

     /**
  	 * Method that assigns initial data in the attribute name.
  	 * 
  	 * @return data stored in name
  	 */
     public void setName(String name) {
          this.name = name;
     }

     /**
   	 * Method that captures data in the attribute specialty.
   	 * 
   	 * @return data stored in attribute specialty.
   	 */
     public String getSpecialty() {
          return specialty;
     }

     /**
   	 * Method that assigns initial data in the attribute specialty.
   	 * 
   	 * @return data stored in specialty
   	 */
     public void setSpecialty(String specialty) {
          this.specialty = specialty;
     }

     /**
       * Method that captures data in the attribute mission.
       * 
       * @return data stored in attribute mission.
       */
     public String getMission() {
          return mission;
     }

     /**
    	 * Method that assigns initial data in the attribute mission.
    	 * 
    	 * @return data stored in mission
    	 */
     public void setMission(String mission) {
          this.mission = mission;
     }

     /**
      * Method allows to display the general data to the spacecrafts 
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