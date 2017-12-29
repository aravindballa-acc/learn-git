public class Hello {
	void helloBunny() {
        System.out.println("Hello Bunny!");
    }


	void helloPiyush() {
		System.out.println("Hello Piyush!");
	}

	public void printName() {
		System.out.println("Print Raghu");
	}


	void printSukeshDetails() {
		System.out.println("Sukesh");
		System.out.println("Accolite");
		System.out.println("Hyderabad");
	}

	void Print_Lokesh() {
		System.out.println("Hello Lokesh in Hello File!!");

	}
	

    public static void main( String[] args ) {
        Hello h = new Hello();
        h.helloBunny();
        h.printSukeshDetails();
        Sukesh sukesh=new Sukesh();
        sukesh.printDetails();
		Lokesh l = new Lokesh();
		h.helloBunny();
		Tarun tarun = new Tarun();
		tarun.helloTarun();
		Raghu r = new Raghu();
		r.printName();
		h.Print_Lokesh();
		//l.Print_Lokesh();
		Saiteja s = new Saiteja();
		s.helloSaiteja();
		h.helloPiyush();
		HelloPiyush he = new HelloPiyush();
		he.piyush();
		Yogeshwar yo = new Yogeshwar();
		yo.returnNothing();
	}
}
