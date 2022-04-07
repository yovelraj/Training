package quickstart;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting grtObj = new Greeting();
		//System s = new System();it is a private constructor 
		System.out.println(grtObj.getMessage());
		System.out.println(Greeting.getInfo());
		System.out.println(grtObj.getMessage());
		System.out.println(grtObj.getInfo());//static method should called in static way (if we use static class name should be referened here here we use object)
	}

}
