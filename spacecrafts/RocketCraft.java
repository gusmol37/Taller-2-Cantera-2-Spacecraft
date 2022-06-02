package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/**
 * Spacecraft object with features inherited from the class.
 */
class RocketCraft extends SpaceCraft {

     public RocketCraft(int id, String name, String specialty, String mission) {
          super(id, name, specialty, mission);        
          this.status = status;
          this.capturePhoto = capturePhoto;

     }

     /** 
      * Class attributes
      */
     private boolean status = true;
     private String capturePhoto;
     
     public void status() {
          this.status = true;
          System.out.println("The spacecraft is on!!!");

     /** 
      * Getters and setters 
      */
     }

     public boolean isStatus() {
          return status;
     }

     public void setStatus(boolean status) {
          this.status = status;
     }

     public String getCapturePhoto() {
          return capturePhoto;
     }

     public void setCapturePhoto(String capturePhoto) {
          this.capturePhoto = capturePhoto;
     }

     public void showdata(String nameClass) {
          
          super.showdata(nameClass);

     }

}