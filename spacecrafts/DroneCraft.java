package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/**
 * Spacecraft object with features inherited from the class.
 */

class DroneCraft extends SpaceCraft {
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param specialty
	 * @param mission
	 * @param capturePhoto
	 */

     public DroneCraft(int id, String name, String specialty, String mission, String capturePhoto) {
          super(id, name, specialty, mission);          
          this.capturePhoto = capturePhoto;

     }
     
     private String capturePhoto;

     public String getCapturePhoto() {
          return capturePhoto;
     }

     public void setCapturePhoto(String capturePhoto) {
          this.capturePhoto = capturePhoto;
     }
     
     public void showdata(String nameClass) {
          super.showdata(nameClass);
          System.out.println("Main function:" + capturePhoto);

     }

}