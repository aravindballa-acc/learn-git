public class Hello {
	void helloBunny() {
        System.out.println("Hello Bunny!");
    }
	void Print_Lokesh() {
		System.out.println("Hello Lokesh in Hello File!!");
	}
	
    public static void main( String[] args ) {
        Hello h = new Hello();
        Lokesh l = new Lokesh();
        h.helloBunny();
        h.Print_Lokesh();
        l.Print_Lokesh();
    }
}
