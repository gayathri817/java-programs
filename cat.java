package gayathri;

public class cat {
     String Name;
     int age;
     public cat() {
    	 age = 0;
    	 Name = "unknown";
     }
	public static void main(String[] args) {
		cat myobj = new cat();
		System.out.println(myobj.age);
		System.out.println(myobj.Name);
	}

}
