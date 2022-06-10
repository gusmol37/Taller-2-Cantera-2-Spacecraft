package spacecrafts;

/**
 * Class that allows the handling of methods and objects Manned spacecraft
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
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
	 * Attribute declaration
	 */
	private String board;

	/**
	 * Method that captures data in the attribute board.
	 * 
	 * @return data stored in attribute board.
	 */
	public String getBoard() {
		return board;
	}

	/**
	 * Method that assigns initial data in the attribute board.
	 * 
	 * @return data stored in board
	 */
	public void setBoard(String board) {
		this.board = board;
	}

	/**
	 * Method to print main function
	 */
	public void showdata(String nameClass) {
		super.showdata(nameClass);
		System.out.println("Main function: " + board);

	}

}