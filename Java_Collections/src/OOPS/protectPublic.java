package OOPS;

public class protectPublic {
	protected int count =4 ;
	public void display()
	{
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectPublic p = new protectPublic();
		p.display();
		p= new protectPublic();
		p.display();
	}

}
