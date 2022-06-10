package spacecrafts;

/**
 * Class that allows the handling of methods and objects RocketCraft
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
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
	 * Object attributes status: store spacecraft status data capturePhoto: store
	 * spacecraft photo data
	 */
	private boolean status = true;
	private String capturePhoto;

	/**
	 * Method prints spacecraft status
	 */
	public void status() {
		this.status = true;
		System.out.println("The spacecraft is on!!!");

	}
	
	/**
	 * Method that prints the status of the spacecraft stored in attribute status
	 * 
	 * @return boolean value
	 */

	public boolean isStatus() {
		return status;
	}

	/**
	 * Method that assigns initial data in the attribute status.
	 * 
	 * @return data stored in status
	 */
	public void setStatus(boolean status) {
		this.status = status;
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

	public void showdata(String nameClass) {

		super.showdata(nameClass);

	}

}