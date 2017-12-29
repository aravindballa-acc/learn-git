public class Hello {
	void helloBunny() {
        System.out.println("Hello Bunny!");
    }
	void helloPiyush() {
        System.out.println("Hello Piyush!");
    }
    public static void main( String[] args ) {
        Hello h = new Hello();
        HelloPiyush he=new HelloPiyush();
        h.helloBunny();
        h.helloPiyush();
        he.piyush();
    }
}
