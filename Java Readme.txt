	Java

	Banuprakash C
	Co-founder Lucida Technologies Pvt Ltd.,
	banu@lucidatechnologies.com
	banuprakashc@yahoo.co.in
	-----------------------------


		OOP --> Real world like programming

		One object communicates with other by sending message/action/behaviour using its interface.
		We need to know what the message does, need not know how it works [ Abstraction ]
		To fulfill an action certains things are encapusluated

		Object : --  entity which has state and behaviour

		To create objects we need template / blue print

		Depending on choice of programming language we use "class", "function", " Type" , ...
		for creating a template

		JavaScript:

		function Person(age, name) {
			this.age = age;
			this.name = name;
		} 

		let p = new Person();

		------------------------------------------------

		state of an object is represented using instance variable

		class Car {
			private:
				int doors;
				int wheels;
		}

		Car swift = new Car();
		Car bmw = new Car();


		state of class: common to all objects of a class
		----------------------------------------------------------------------

		class Person {

			Person() {
				//
			}
		}
		Logically grouping of classes
			a) entity / domain / Model
				business data
				constructors / setters / getters / equals()
			b) DAO
				Data Access Object contains CRUD operations
			c) Business
				business logic
			d) Service
				a facade on business and DAO
			e) Exception
			f) Utility
			g) UI
			i) Factories
	--------------------------------------------------------------------------------------------------------

		SOLID Design Principles:
			S --> Single Responsibility
			O --> Open Close Principle
					Objects/Components should be closed for change but open for extension
			L --> Liskov Substitution Principle
			I --> Interface segregation
			D --> Dependency Injection [ Inversion Of Control ]

	---------------------------------------
		Java --> Technology 
			--> platform + API
			--> executes Bytecode

			How to generate the bytecode?
				Development kit [ Compiler, ...]
				Groovy -- GDK
				Kotlin -- KDK
				Java --> JDK

		Java Tools
			1) JDK --> Java Development Kit [ 8+]
			2) Eclipse IDE for JEE 2019
			3) git scm

	--------------------------------------------------------------------------------------
		Relationship between objects:
			a) Generalization and Specialization
				inheritance
			b) Realization
			c) Association
			d) Uses A 
			---------------------


			Generalization and Specialization [ inheritance ]
			In Java we use keyword "extends" for inheritance

			class Product {

			}

			class Mobile extends Product {

			}

			class Tv extends Product {

			}

			-------------


			class Product {
				public Product() {
					print "P1";
				}

				public Product(int id) {
					print "P2";
				}
			}

			class Mobile extends Product {
				public Mobile() {
					print "M1";
				}
				public Mobile(int id, String connect) {
					print "M2";
				}
			}


			new Mobile(); // P1 and M1
			new Mobile(3,"iPhone X"); // P1 and M2

			-----------------------------------------



			class Product {
				public Product() {
					print "P1";
				}

				public Product(int id) {
					print "P2";
				}
			}

			class Mobile extends Product {
				public Mobile() {
					print "M1";
				}
				public Mobile(int id, String connect) {

					super(id);
					print "M2";
				}
			}


			new Mobile(); // P1 and M1
			new Mobile(3,"iPhone X"); // P2 and M2

		------------------------------------------

		class Product {
			public double getPrice() {
				return 100;
			}
		}

			class Mobile extends Product {
				public double getPrice() {
						return 500;
				}
				public String getConnectivity() {
					return "4G";
				}
			}

			Mobile m = new Mobile();
			m.getPrice(); // 500
			m.getConnectivity(); // 4G

			Product p = new Mobile(); // valid --> upcasting
			p.getPrice(); // 500
			p.getConnectivity(); // ERROR
	================================================================================

		Comments:
			Developers
			// single line

			/*
				multi
				line
				comments
			*/

			API users comment [ JavaDoc Comment]

			/**


			*/
========================================

Day 2:
	Realization Relationship

	A component/object will realize the behaviour specified by other in order to communicate.

	Done using interface.

	interface in Java:

	interface interfaceName {
		abstract methods
	}

	Example:

	interface EmployeeDao {
		void addEmployee(Employee e);
		Employee getEmployee(int id);
	}


	Why program to interace?	
		a) DESIGN
		b) IMPLEMENTATION
		c) TESTING
		d) INTEGRATION
		e) LOOSE COUPLING
		....


		interface Flyable {
			void fly();
		}	

		class Bird implements Flyable {
			public void fly() {
				// logic
			}
		}


		Flyable f = new Bird();

		class Dummy1 implements Flyable {
			public void fly() {
				jump from 4th floor!!!
			}
		}

		class Dummy2 implements Flyable {
			public void fly() {
				jump from 10th floor!!!
			}
		}
		Flyable f = Dummy1();


		//Anonymous class
		Flyable f = new Flyable() {
			public void fly() {
				jump from 10th floor!!!
			}
		};

		------------

		Functional Interface is an interface which has only one method to implement.


		int x  = 10;

		Integer iX = x; // wrap

		int y = iX; // unwrap


		Using Anonymous class implement addition function
			4 + 5 ==> 9

		Using lambda implement multiplication

			4 * 5 ==> 20

	----------------------------------------------------------------------------

	Maven:
		a build tool
		--> Consistency across IDEs
		--> Manages dependencies
				==> lots of transitive dependicies
					In Java dependencies are "jar" files / libraries

					A1.jar ==> B1.2.jar ==> c4.2.jar


				pom.xml ==> Project Object Model
					configure dependecies.

		--> Configure goals
			checkstyle, PMD, Unit testing ,...
		--> Version configure
		
		===========

		Unit Testing
			TCER ==> Test Case Expected Result ==> excel sheet

			JUnit/TestNG is a unit testing framework	

		Code Coverage: Report how much of code is tested [ classes, methods, statements, branch]
			Clover, JaCoCo, ECLEmma, ..

			Execute:

			$ mvn clean test
			Refresh target folder of the project:
			open jcf/target/site/jacoco/index.html in web browser

		CheckStyle:

		mvn clean test site

		jcf/target/site/index.html

		========================================================


		Java Collection Framework
		--------------------------

		Comparable interface
------------------------------------------------------------------
	1) GitHub account
	2) Go to terminal where your java ws is present
	3) $ git init
	4) touch .gitignore
	5) vi .gitignore
	6) git add .
	7) git status
	8) git config --user.email "myemail"
	   git config --user.username "myname"	
	   git commit -m "day 1 and 2"		

	 9) git push -u https://github.com/BanuPrakash/RAKUTEN.git master
	 
----------------------------------------------------------------------------

	Java Collection Framework
	provides data containers 
	Array is a data container.
	--------------------

		JCF has 
			a) interfaces
			b) implementation classes		   
			c) Algorithm classes / Utility



		class Arrays {

			static void sort(Object[] elems, Comparator comp) {
				for(i ===> elems.length) {
					for(j = ...) {
						if(comp(elems[i], elems[j]) > 0 ){
							swap
						}
					}
				}
			}
		}
===============

	List 								Set
1) supports duplicates 					unique
2) supports index based operation 		doesn't support
	add("a", 3);
	remove(4);
	get(10);	
3) ordered								different algorthims to decide where data needs to be 
										stored

4) re-ordered
	sort, shuffle

	List implementations are also available from VAR, Apache, ...


	List list = new ArrayList();
	List list = new LinkedList();

	ArrayList list = new ArrayList(); // AVOID							


		List list = new ArrayList();
			list.add("A");
			list.add(new Product()); // allows

			if(list.get(0) instanceof String) {
				String s = list.get(0);
			}
			if(list.get(1) instanceof Product) {
				Product p = list.get(1);
			}


		Prefer:
		List<String> list = new ArrayList();
		list.add("A");
		list.add(new Product()); // error

		String s = list.get(0);
		================================================

		HashSet
			HashCode: Numerical representation of object
			a) two similar objects should have same hashcode
			b) 2 dis-similar objects can also have same hascode [ Possible]

		HashSet uses hashCode() and equals() to compare unique and location.
		
=========

Create a class Triplet with int first; int second; int sum

Write the function in ArrayUtil.java to get all the triplets <A, B, C> such that A+B = C 
public static List<Triplet> printTriplets(int[ ] data) { 
}

data = { 2,3,4,5,7}

<2,3,5>
<2,5,7>
<3,4,7>

data = {1,2,3,4,5,7,9}

<1,2,3>
<1,3,4>
<1,4,5>
<2,3,5>
<2,5,7>
<3,4,7>
<4,5,9>


@Test
void testTriplet() {
		int data[] = { 2,3,4,5,7};
		List<Triplet> triplets = ArrayUtil.printTriplets(data);
		Triplet t = triplets.get(0);
		assertEquals(3, t.size());
		assertEquals(2, t.getFirst());
		assertEquals(3, t.getSecond());
		assertEquals(5, t.getSum());
}

========================

	Java 8 streams and High Order Functions.

	High Order functions are functions which accept other functions as arguments.

	Commonly used High order functions:
		a) map
			transform
		b) filter
			to get subset
		c) reduce
			to get aggregate
		d) forEach
		e) flatMap
		f) collect

		map, flatMap, filter, skip, limit are intermediary operations

		foEach, collect and reduce are terminal operations.

		rxmarbles.com

		----------------------

		String str = "Java is OOP, Java is open source";

		Map
			Java   2
			is 	 2
			OOP  1
			open 1
			source 1

				Map:
					put() get() containsKey()
				String:
				 split()

  	https://github.com/BanuPrakash/RAKUTEN


