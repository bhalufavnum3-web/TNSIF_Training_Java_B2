package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera,MusicPlayer
{

	@Override
	public void playMusic() {
		System.out.println("Playing music on the smartphone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo using smartphone camera");
		
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		
	}
	
}


public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();

	}

}