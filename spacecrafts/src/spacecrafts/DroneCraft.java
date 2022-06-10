package spacecrafts;

/**
 * Class that allows the handling of methods and objects DroneCraft
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-05-31
 */

/**
 * Spacecraft object with features inherited from the class.
 */

class DroneCraft extends SpaceCraft {

	/**
	 * 
	 * Object attributes
	 * 
	 * @param id:           spacecraft identifier
	 * @param name:         spacecraft name
	 * @param specialty:    specialty
	 * @param mission:      mission carried out
	 * @param capturePhoto: spacecraft photo
	 */

	public DroneCraft(int id, String name, String specialty, String mission, String capturePhoto) {
		super(id, name, specialty, mission);
		this.capturePhoto = capturePhoto;

	}

	/**
	 * Method capturePhoto allows to capture photo of the spacecraft
	 */

	private String capturePhoto;

	/**
	 * Method that captures spacecraft photo.
	 * 
	 * @return returns spacecraft photo.
	 */

	public String getCapturePhoto() {
		return capturePhoto;
	}

	/**
	 * Method that assigns initial data to capturePhoto.
	 * 
	 * @return data stored in capturePhoto
	 */
	public void setCapturePhoto(String capturePhoto) {
		this.capturePhoto = capturePhoto;
	}

	/**
	 * Method to print main function
	 */
	public void showdata(String nameClass) {
		super.showdata(nameClass);
		System.out.println("Main function: " + capturePhoto);

	}

}