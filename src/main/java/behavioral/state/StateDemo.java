package behavioral.state;

public class StateDemo {

	public static void main(String[] args) {
		Fan fan = new Fan();
		System.out.println(fan);

		System.out.println();
		fan.pullChain();
		System.out.println(fan);

		System.out.println();
		fan.pullChain();
		System.out.println(fan);

		System.out.println();
		fan.pullChain();
		System.out.println(fan);

		System.out.println();
		fan.pullChain();
		System.out.println(fan);
	}
}
