package info.halo9pan.samples.java.java8.interfaces;

public interface IAction {

	void run();

	default void init(String param) {
		System.out.println("interface method.");
		System.out.println(param);
	}
	
}
