package week3.day1;

public abstract class Desktop implements Hardware, Software {

	public void desktopModel() {
		System.out.println("Desktop Model ");
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources :");
		System.out.println("Browser");
		System.out.println("MS Office");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources :");
		System.out.println("Monitor");
		System.out.println("Keyboard");
	}

}
