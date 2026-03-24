package org.inheritance;

public class ChildClass extends ParentClass{
	public void children() {
		System.out.println("SS");
	}
		public static  void main(String[] args) {
			ChildClass xc=new ChildClass();
			xc.depart();
			xc.branch();
			xc.section();
			xc.children();
			
		}
	}

