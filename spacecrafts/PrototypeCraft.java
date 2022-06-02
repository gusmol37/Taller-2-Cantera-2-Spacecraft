package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/**
 * Spacecraft object with features inherited from the class.
 */
class PrototypeCraft extends SpaceCraft {

    
     public PrototypeCraft(int id, String name, String specialty, String mission, String capturePhoto, String board,
               boolean status) {
          super(id, name, specialty, mission);
          
          this.status = status;
          this.capturePhoto = capturePhoto;
          this.board = board;
     }
     
     /** 
      * Class attributes
      */

     private boolean status = true;
     private String capturePhoto;
     private String board;

     public boolean isStatus() {
          return status;
     }

     public void setStatus(boolean status) {
          this.status = status;
     }

     public void status() {
          this.status = true;
          System.out.println("The spacecraft is on!!!");

     }

     public void showdata(String nameClass) {          
          super.showdata(nameClass);
          System.out.println("Main function:" + capturePhoto);

     }

     /** 
      * Getters y setters
      */

     public String getCapturePhoto() {
          return capturePhoto;
     }

     public void setCapturePhoto(String capturePhoto) {
          this.capturePhoto = capturePhoto;
     }

     public String getBoard() {
          return board;
     }

     public void setBoard(String board) {
          this.board = board;
     }
}