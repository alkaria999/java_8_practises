package com.example.demo;

public class SingletonExample {
	
	private static SingletonExample example = null;
	
	private SingletonExample() {
		System.out.println("Single Instance ");
	}
	public static SingletonExample getInstance() {
		if(example==null) {
			example = new SingletonExample();
		}
		return example;
	}
	
	public static void main(String[] args) {
		SingletonExample x = SingletonExample.getInstance();
		SingletonExample y = SingletonExample.getInstance();
		SingletonExample z = SingletonExample.getInstance();
        System.out.println("Hashcode of x is "+ x.hashCode());
        System.out.println("Hashcode of y is "+ y.hashCode());
        System.out.println("Hashcode of z is "+ z.hashCode());
  
	}
	
	
	
	//2PC : Tow Phase Commit
	//Two-Phase Commit (2PC) is a distributed transaction protocol that ensures the atomic execution of transactions across multiple systems.
	
	//SAGA Pattern
	//The Saga design pattern is a way to manage data consistency across microservices in distributed transaction scenarios. 
	//A saga is a sequence of transactions that updates each service and publishes a message or event to trigger the next transaction step.
	
	//API Gateway ---ZUUL
	//Communicate of services ---EUREKA
	//Synchronous Communication	--- Client sends a request and waits for a response from the service.
	//							--- Microservice1 acts as a client that sends a request and waits for a response from Microservice2.
	//Asynchronous Communication ---Client sends a request and does not wait for a response from the service.
	//							 ---Microservice1 acts as a client that sends a request and doesn't wait for a response from Microservice2.
	//Hystrix --- To Reduce Blast radius / Fault Tolerance / Cascading Failure Stop
	//Loose Coupling ---
	//when changes caused to one microservice won't impact another. In a microservices architecture, each microservice should be able to stand on its own
	//PermGen (Permanent Generation) is a special heap space separated from the main memory heap.	
	//it contains data about bytecode, names, and JIT information before Java 7
	//Simply put, Metaspace is a new memory space – starting from the Java 8 version; it has replaced the older PermGen memory space. The most significant difference is how it handles memory allocation.
	//Specifically, this native memory region grows automatically by default.
	
	//Spring Boot
	//1. Using spring initializer start.spring.io
	//2. Using Spring Boot enabled IDE 
	//3. spring init --dependencies=web,data-jpa my-project
	
	//Concurrent HashMap
	//The ConcurrentHashMap class is introduced in JDK 1.5 belongs to java.util.concurrent package,
	//which implements ConcurrentMap as well as to Serializable interface 
	//ConcurrentHashMap is an enhancement of HashMap as we know that while dealing with Threads in our application HashMap is not a good choice because performance-wise HashMap is not up to the mark.
	//ConcurrentHashMap is a thread-safe implementation of the Map interface in Java, which means multiple threads can access it simultaneously without any synchronization issues

}
