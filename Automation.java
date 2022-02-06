package abstraction;
/* 
 * Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
try to apply This,Super,Static,Final keywords in your code ..............
 */
public class Automation extends MultipleLanguage {
	String Mentor ="Mr.TestLeaf";

public void Selenium() {
		final int batchcount = 100;
		
		System.out.println("*********Automation Session **************");
		System.out.println("Selenium Course ");
		System.out.println("Batch Count is"+batchcount);
		}

	
	public void Java() {
		System.out.println("*********Programming Session 1**************");
	 System.out.println("Java Course is Added");
	 System.out.println("Session Mentor is "+this.Mentor);
	}

	
	public void python() {
		System.out.println("*********Programming Session 2**************");
		System.out.println("Python Course is Added in Automation Course");
		
	}
	public void javascript() {
		System.out.println("*********Programming Session 3**************");
		super.javascript();
		
	}
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.ruby();
		auto.javascript();
		
}
}