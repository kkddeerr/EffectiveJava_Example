package Item01;

public interface FooInterface {
	public static Foo getFoo() {
		//return new Foo(); 
		return new FooChild();
	}
}
