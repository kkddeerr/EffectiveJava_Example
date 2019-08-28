package Item01;

import java.util.Collection;
import java.util.Collections;

public class Foo {
	
	private String name;
	private String address; // 
	
	public Foo() {
		 
	};
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setAddress(String address) {
		this.address = address;
	};
	
	// ********** 1 ************
	
	public Foo(String name) { //1
		this.name = name;
	};
	
	public void check() {
		System.out.println("this is Foo");
	}
	
//	public Foo(String address) { //1 생성자는 똑같은 타입을 받는 파라미터를 만들 수 없다.
//		this.address = address;
//	}
	
	
//
//	//Method의 이름을 줄 수 있다.
//	public static Foo withName(String name) { //1
//		return new Foo(name);
//	};
//	
//	public static Foo withAddress(String address) { //1
//		Foo foo = new Foo();
//		foo.setAddress(address);
//		return foo;
//	};
	
	// *************************
	
	// ********** 2 ************
	private static final Foo Hello = new Foo(); 
	
	public static Foo getFoo() { 
		return Hello;
	}
	// *************************
	
	//*********** 3, 4 ************
	public static Foo getFoo(boolean flag) {
		return flag ? new FooChild() : new FooChild2();
	}
	
	
	// *************************
	public static void main(String [] args) {
		Foo foo = new Foo("DongHyuk"); //1
//		Foo fooName = Foo.withName("DongHyuk"); //2
//		Foo fooAddress = Foo.withAddress("Seoul"); 
		//1번 보다 2번이 가독성이 좋다.
		
		//반드시 새로운 객체르 만들 필요가 없다. //3
		//매번 새로운 객체를 만들 필요가 없는 경우에 미리 만들어둔 인스턴스를 반환 할 수 있다.
		Foo fooInstance = Foo.getFoo(); 
		
		//리턴하는 객체의 클래스가 입력 매개변수에 따라 다르게 설정 할 수 있다.
		Foo fooInstance2 = Foo.getFoo(true);
		fooInstance2.check();
		
		//자바 8 이후로 인터페이스에 정적 메서드 선언 가능
		Foo getFoo = FooInterface.getFoo();
		getFoo.check();
		
		
	}
}