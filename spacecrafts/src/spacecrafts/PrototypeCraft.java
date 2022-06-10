package spacecrafts;

/**
 * Class that allows the handling of methods and objects PrototypeCraft
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
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
	 * status: it stores spacecraft status data
	 * capturePhoto: it stores spacecraft photo data
	 * board: store it stores board data
	 */

	private boolean status = true;
	private String capturePhoto;
	private String board;

	public boolean isStatus() {
		return status;
	}

	/**
	 * Method that assigns initial data in the setStatus.
	 * 
	 * @return data stored in setStatus
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * Method prints messege The spacecraft is on!!! if status is true
	 */
	public void status() {
		this.status = true;
		System.out.println("The spacecraft is on!!!");

	}

	/**
	 * Method prints showdata String nameClass data
	 */
	public void showdata(String nameClass) {
		super.showdata(nameClass);
		System.out.println("Main function: " + capturePhoto);

	}

	/**
	 * Method that captures data in the attribute getCapturePhoto.
	 * 
	 * @return data stored in attribute getCapturePhoto.
	 */
	public String getCapturePhoto() {
		return capturePhoto;
	}

	/**
	 * Method that assigns initial data in the attribute capturePhoto.
	 * 
	 * @return data stored in capturePhoto
	 */
	public void setCapturePhoto(String capturePhoto) {
		this.capturePhoto = capturePhoto;
	}

	/**
	 * Method that capture data in the attribute board.
	 * 
	 * @return data stored in attribute borad.
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
}