package gayathri;

public class Computer {
    class processor{   
        public void displayDetails() {
        	System.out.println("brand : Hp");
        	System.out.println("speed : 150rpm");
        }
    }
	public static void main(String[] args) {
		Computer myobj1 = new Computer();
		Computer.processor myobj = myobj1.new processor();
		myobj.displayDetails();
	}

}
