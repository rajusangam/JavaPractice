package com.hps.practice.java;

import java.io.IOException;
import java.sql.SQLException;

class Parent {
	void fun() throws SQLException {
		System.out.println("Fun with Parents");
	}
}

class Child extends Parent {
	void fun()  {
		System.out.println("Fun with Childs");
	}
}
public class InheritanceExample {

	public static void main(String [] s) throws IOException, SQLException {
		Parent p = new Child();
		p.fun();
	}
}
