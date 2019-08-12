package prob2;

public class SmartPhone extends MusicPhone {
	//Phone phone = new SmartPhone();
	
	@Override
	public void execute(String function) {
		if(function == "음악") {
			super.execute(function);
		} else if (function == "통화") {
			super.execute(function);
		} else if (function == "앱") {
			app();
		}
	}
	
	private void app(){
		System.out.println("앱재생");
	}

}
