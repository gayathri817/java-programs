package gayathri;

public class Dog {
    String Name;
    String colour;
    public Dog(String x,String y) {
    	Name = x;
    	colour = y;
    }
    public static void main(String[] args) {
		Dog myobj = new Dog("candy","will");
		System.out.println(myobj.Name);
		System.out.println(myobj.colour);

	}

}
