package system.controller;

import system.view.ASCDisplay;

public class Controller implements Icontroller {
	
	//Attributes
	private ASCDisplay myDisplay;
	
	
	/*The unique string identifying the Spotify user that you can find at the end of the Spotify URI for the user. 
	 * The ID of the current user can be obtained via the Web API endpoint.*/
	private String id; 				

	//methods
	
	
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
	}

	@Override
	public void nowPlaying() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addToQueue() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}



