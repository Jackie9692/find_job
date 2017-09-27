package learning;


import java.util.*;
import java.util.concurrent.*;



public class Test {

	public static void main(String[] args){
		
//		ArrayList list = new ArrayList<Integer>();
//		LinkedList llist = new LinkedList<Integer>();
//		PriorityQueue pQueue = new PriorityQueue<Integer>();
//		
//		HashMap<K, V>> = new HashMap<K, V>;
//		Hashtable<K, V> = new Hashtable<K, V>();
//		
//		ArrayList<E> = new ArrayList<E>();
//		LinkedList = new LinkedList<E>();
		
		System.out.println("null == null:" + (null == null));
		
//		StringBuffer buffer = new StringBuffer();
//		Test test = new Test();
////		test.testClass();
//		test.testString();
	}
	
	public void testString(){
		String s1 = "123456";
		String s2 = "123456";
		String s3 = s1;
		
		System.out.println("String1 == String2:" + (s1==s2));
		System.out.println("String1 equals String2:" + (s1.equals(s2)));
		System.out.println("String1 == String3:" + (s1==s3));
		System.out.println("String1 equals String3:" + (s1.equals(s3)));
		
	}
	
	

//	测试多态
	public void testClass(){
		System.out.println("Aniaml test***");
		Animal animal = new Animal();
		animal.print();
		animal.sayAnimal();
		
		System.out.println("Dog test***");
		Dog dog = new Dog();
		dog.print();
		dog.sayAnimal();
		dog.doglove();
		
		System.out.println("DogAnimal test***");
		Animal dogAnimal = new Dog();
		dog.print();
		dog.sayAnimal();
	}
	
	public void threadTest() throws InterruptedException {
		Runnable runThread = new Runnable() {
			@Override
			public void run() {
				System.out.println("子线程");
			}
		};
		Thread th = new Thread(runThread);
		System.out.println("son thread start begin");
		th.start();
		System.out.println("son thread start end");
		System.out.println("son thread sleep for 1000 millseconds begin");
		th.sleep(1000);
		System.out.println("son thread sleep for 1000 millseconds end");
		Thread current = Thread.currentThread();
		System.out.println("son thread sleep for 10000 millseconds start");
		th.sleep(10000);
		System.out.println("son thread sleep for 1000 millseconds end");
		long id = current.getId();
		String name = current.getName();
		int priority = current.getPriority();
		Thread.State state = current.getState();
		boolean isAlive = current.isAlive();
		boolean isDaemon = current.isDaemon();
		boolean isInterrupt = current.isInterrupted();
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("priority:" + priority);
		System.out.println("state:" + state);
		System.out.println("isAlive:" + isAlive);
		System.out.println("isDaemon:" + isDaemon);
		System.out.println("isInterrupt:" + isInterrupt);
	}

}

class Animal {
	final private int age;
	public Animal() {
		age = 10;
		System.out.println(age);
		System.out.println("constructor Animal");
	}

	public void print() {
		System.out.println("I am an animal");
	}

	public void sayAnimal() {//继承
		System.out.println("animal say");
	}

}

class Dog extends Animal{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public Dog() {
		System.out.println("constructor Dog");
	}

	public void print() {//重载
		System.out.println("I am a dog");
	}

	public void doglove() {

		System.out.println("I love bone");

	}
}
