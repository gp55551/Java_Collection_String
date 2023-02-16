package OOPS;

public class finalCar {

	final int speed = 90;
	void run()
	{
		//final field cannot bve assigned
		//speed= 400;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalCar f = new finalCar();
		f.run();
	}

}
