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


abstract public class MultipleLanguage implements TestTool {
	

public abstract void python();

public void ruby()
{
	System.out.println("*********Programming Session **************");
	System.out.println("Ruby is included in Multiple Language Class");
}

public void javascript() {
	System.out.println("Javascript is included in Multiple Language Class");
}

}