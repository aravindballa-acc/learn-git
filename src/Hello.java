public class Hello {
	void hellosandeep() {
        System.out.println("Hello sandeep!");
    }
    void helloRithvik() {
        System.out.println("Hello Rithvik!");
    }

	void helloPiyush() {
		System.out.println("Hello Piyush!");
	}

	public void printName() {
		System.out.println("Print Raghu");
	}

	void Print_Lokesh() {
		System.out.println("Hello Lokesh in Hello File!!");

	}

	public static void main(String[] args) {
		Hello h = new Hello();
		Lokesh l = new Lokesh();
		Tarun tarun = new Tarun();
		tarun.helloTarun();
		Raghu r = new Raghu();
		r.printName();
		h.Print_Lokesh();
		l.Print_Lokesh();
		Saiteja s = new Saiteja();
		s.helloSaiteja();
		h.helloPiyush();
		HelloPiyush he = new HelloPiyush();
		he.piyush();
		Yogeshwar yo = new Yogeshwar();
		yo.returnNothing();
		DetailsAmulya d=new DetailsAmulya();
        d.detailsAmulya();
        Shreya sh = new Shreya();
        sh.print_name();
	}
}
