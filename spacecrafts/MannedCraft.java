package spacecrafts;

/**
 * 
 * @author Gustavo Molina
 */

/** 
 * Manned spacecraft
 */

/**
 * Spacecraft object with features inherited from the class.
 */
public class MannedCraft extends SpaceCraft {

     

     public MannedCraft(int id, String name, String specialty, String mission, String board) {
          super(id, name, specialty, mission);
          this.board = board;

     }
     
     /**
      * Getters and setters
      */
    
     private String board;    

     public String getBoard() {
          return board;
     }

     public void setBoard(String board) {
          this.board = board;
     }   
   
     public void showdata(String nameClass) {
          
          super.showdata(nameClass);
          System.out.println("Main function:" + board);

     }

}