public class Hello {
	void helloBunny() {
        System.out.println("Hello Bunny!");
    }
	
	public void printName() {
		System.out.println("Print Raghu");
	}
	
    public static void main( String[] args ) {
        Hello h = new Hello();
        h.helloBunny();
        Raghu r = new Raghu();
        r.printName();
    }
}
