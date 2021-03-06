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
========================================================================

	Maven, GIT, JUnit [ Unit Testing ], Jacoco [Code Coverage], Checkstyle [ Coding Conventions]

	==================

Day 4:
------
	Spring Framework and JPA Framework
	----------------------------------
	MySQL installation 

	codingbat.com
	sqlzoo.net

	mysql> create database rakuten_2020_db;
	mysql> use rakuten_2020_db;
	mysql> create table products (id int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), price double, category VARCHAR(100));

	================================================

	JPA Framework
		Java Persistence API is a specification to use ORM framework

		ORM --> Object Relational Mapping
		Java Class <---> Database table
		JAva attribute <--> columns
		Once mapped, ORM is going to generate SQL for CRUD operations.

		save(p); internally ORM generates INSERT INTO products [.....]


		find(Product.class, 22);
			select * from products where id = 22;

			some of the popular ORM frameworks:
				a) Hibernate
				b) Toplink
				c) KODO
				d) OpenJPA

		Spring Framework:
		The Spring Framework is an application framework which provides light weight 
		and inversion of control container for the Java platform.

		Inversion Of Control ---> Dependency Injection

		Spring Container manages the life cycle of Objects

			Spring creates objects which has one of the following annotations at class level.
			a) @Component
			b) @Repository
			c) @Service
			d) @Controller
			e) @RestController
			f) @Configuration




			Example:
			@Repository("jpa")
			public class EmployeeDaoJpaImpl implements EmployeeDao {

			}
			@Repository("mongo")
			public class EmployeeDaoMongoImpl implements EmployeeDao {

			}

			@Service()
			public class OrderService {
				@Autowired
				@Qualifier("jpa")
				private EmployeeDao empDao;	
			}

			=========

			@Repository()
			@Primary()
			public class EmployeeDaoJpaImpl implements EmployeeDao {

			}
			@Repository()
			public class EmployeeDaoMongoImpl implements EmployeeDao {

			}

			@Service()
			public class OrderService {
				@Autowired
				private EmployeeDao empDao;	
			}

		Spring container manages dependencies


		beans.xmlservice.OrderSerice
 auto-wire="byType" />
		<beans>
			<bean id="productDao" class="com.rakuten.prj.dao.ProductDaoJpaImpl" />

			<bean id="orderService" class="com.rakuten.prj.service.OrderSerice" auto-wire="byType" />

		</beans>


		===========================

		Spring creates objects which has @Component, @Repository, @Service....

		Some scenarios we need to create objects on our own, but that object later should be 
		managed by spring container


		public class MyClass {

			@Bean
			public MyObject getObject() {
				MyObject obj = new MyObject(.. ,, .....);
				obj.setThat(..);
				obj.setThis(...);
				return obj;
			}
		}





		-------------------

		JPA and ORM 

			a) Map Java class to tables
				i) @Entity
				ii) @Table is optional
				iii) @Column is optional ==> to map java field to columns
				iv) @Id ==> for Primary key
				v) optionally @GeneratedValue to spcify how PK is generated
			b) DataSource
				is a pool of database connections

			c) EntityManager is used to manage persistence context [ An environment
			where entities are managed and sync with database]

			d) To create EntityManager we need EntityManagerFactory:
				this picks ORM, and DB connection from Pool


		Spring:
			1) Manages lifecycle of objects
				a) creates objects if the class has: @Component, @REpository, @Service..
				b) we can create objects on our own and pass it to spring
					@Bean
			2) Manages dependencies	
					@Autowired
					@Inject

		=========================================
		
		JQ-QL ==> Java Persistence Query Language similar to SQL

	@Entity 												emps
	@Table("emps")											first_name
	class Employee {
		@Column(name="first_name")
		String firstName;
	}


  JPQL 													SQL
  from Employee 										select * from emps

  select firstName from Employee  						select first_name from emps


  	----------------------

  	1) interface CustomerDao
  			void addCustomer(Customer c);
  			Customer getCustomer(String email);
  			List<Customer> getCustomers();
  	2) class CustomerDaoJpaImpl
  	3) In OrderService class
  		@Autowired
  		CustomerDao customerDao;

  		methods to invoke customer dao

  	4) CustomerInsertClient
  		CustomerGetByIDClient
  		CustomerFetchClient
====================================================================================
			Day 5
			-----
			JPA with ORM:
				a) @Entity, @Table, @Id and @Column, @GeneratedValue
				b) EntityManager is used to manage PErsistenceContext and perform CRUD operations.
				@PersistenceContext to inject EntityManager in DAO class

				c) We configured DataSource [ Pool of database connections],
					EntityManagerFactory in AppConfig.java

			Spring:
				creates objects using default constructor of classes which has one of the
				following annotations: @Component, @Repository, @Service, @Controller, @RestController

				@Bean is used on methods which create object and return object, the returned object is managed by spring container

				@Autowired / @Inject is for wiring [ Dependency Injection]

				To create Spring Container:
					a) AnnotationConfigApplicationContext
					b) ClassPathXmlApplicationContext
			--------------------------------------
			
			ORM: entity relationship [ Cardinality ]
			a) one-to-many
			b) many-to-one
			c) many-to-many
			d) one-to-one


			Without Cascade:
				If one order has 5 items
					em.persist(order);
					em.persist(item1);			
					em.persist(item2);
					em.persist(item3);
					em.persist(item4);
					em.persist(item5);
		With Cascade:
				em.persist(order);


		=======
			Without Cascade:
				em.remove(order);
				em.remove(item1);			
					em.remove(item2);
					em.remove(item3);
					em.remove(item4);
					em.remove(item5);

			With Cascade:
				em.remove(order);
==================

	Fetch LAZY:
		em.find(Order.class, 120); // gets order whose id is 120

	Fetch EAGER:
		em.find(Order.class, 120); // gets order whose id is 120 and items also belonging to that order		
		============

		Good practice for entity classes:
			a) generate hashCode() and equals()
			b) generate toString()
			c) implements Comparable
			d) implements Serializable

====================================================================

	Ticket Tracking application
		entity:
		1) class Ticket
		2) class Employee

		Ticket can be raised by an employee
			1) Laptop reboots
		Ticket is resolved by employee
			2) Replaced RAM /


	Use cases:
		1) Insert employees
		2) Raise a Ticket
		3) Resolve a Ticket
			a) print all open tickets
			b) Resolve one of the ticket which is open

	==========================================================

		Relationship

		Ticket Class:

			Date raisedDate; 
			Date reolvsedDate; 

			@ManyToOne
			@JoinColumn(name="raised_by")
			private Employee raisedBy;

			@ManyToOne
			@JoinColumn(name="resolved_by")
			private Employee resolvedBy;

		================
		
		Client Code for Raise Ticket:

			Ticket t = new Ticket();
			Employee e = new Employee();
			e.setEmpId(1);
			e.setRaisedBy(e);
			e.setRaisedDate(new Date());
			e.setTicketDesc("Laptop restarts");

			ticketService.raiseTicket(t);

		Service code for Raise Ticket

			void raiseTicket(Ticket t) {
				Employee e = employeeDao.getEmployeeById(t.getEmployee().getEmloyeeId());
				t.setRaisedBy(e);
				ticketDao.raiseTicket(t);
			}

		Dao code:
			em.persist(t);

	==========================================================================================

	Hotel booking application:
		1) Entities:
			a) Hotel
			b) User
			c) Booking
				will have association with Hotel
				will have association with User
				checkinDate [ not system date]
				checkOutDate [ not system date]
				Calender, SimpleDateFormat [ Prefer ]

		2) use cases:
			a) list hotels based on search criteria
				tokyo
				Marriot
			b) Book a hotel
			c) list bookings between 2 dates

			

	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="movie_actor",
		joinColumns= {@JoinColumn(name= "movie_id")}, 
		inverseJoinColumns = {@JoinColumn(name="actor_id")})
	Set<Actor> actors = new LinkedHashSet<>();

	============================================================

	Day 6
	-----

	class Employee {
		empId;

		@ManyToOne
		@JoinColumn("dept_id")
		Department dept;
	}


	class Department {
		depId;

		@OneToMany(mappedBy="dept")
		private List<Employee> employees = new ArrayList<>();
	}


		
	@OneToOne
	@JoinColumn("t1id")

	==============================================================================

	ManyToMany

		Student and Course


	ManyToMany became:
		onetomany and manyto one

		StudentCourse
			@ManyToOne
			@JoinColumn("sid")
			Student s;
			@ManyToOne
			@JoinColumn("cid")
			Course c;

			Date startDate;
			Date endDate;

 	==============

 	Different states of entity object
 		a) Transient state
 		b) Managed / Persistence state
 		c) Detached
 		d) Removed
=================================

JPQL:
	
	1) // "from Product where category = '" + category + "'";

		String jpql = "from Product where category = :cat";

		TypedQuery<Product> query = em.createQuery(jpql, Product.class);
		query.setParameter("cat", "mobile");
		query.getResultList();

	2) 

			String jpql = "from Hotel";
			TypedQuery<Hotel> query = em.createQuery(jpql, Hotel.class);
			query.setFirstResult(1);
			query.setMaxResults(10); // pagination


	3) String jpql = "select name, price from Product"; //scalar values
		Query query = em.createQuery(jqpl);
		List<Object[]> list = query.getResultList();

	=====================================================================================

	Spring-data-jpa: simplifies using JPA
	using spring data jpa we just create interfaces, implementation classese are generated
	by spring data jpa

	interface MovieDao extends JPARepository<Movie>{

	}


	SpringData JPA generates class MovieDaoJpaImpl implemnts MovieDao, with all CRUD opertions

	Spring Boot Framework: a framework on top of Spring Framework. Does a lot of plumbing code.
	It is highly opiniated: --> It assumes Hibernate is used as ORM and configures it.
	It assumes we use Tomcat as web container.
	Spring Boot is an open source Java-based framework used to create a micro Service.  
	It is designed to run on containers [ Docker, Heroku, ...]


	https://start.spring.io/


	
	List<Product> findByCategoryAndPrice(String category, double price);

	select * from products where category = .. and price = ...



	List<Product> findByCategoryOrPrice(String category, double price);

	select * from products where category = .. OR price = ...

	java 8: Optional

	=====================================

	Web applications:
		1) Traditional Web application
		2) RESTful WebServices


	Traditional Web application:
	----------------------------

		Servlet Engine/Web Container: manages life cycle of Servlet [Code written in Java and executed inside Servlet engine]

		Java Traditional Web application components:
		1) HTML
		2) CSS
		3) JS

			HTML + CSS + JS
			Presentation + Decoration + Dynamic

		4) Servlet 
			==>	Dynamic content
			==> Singleton objects by default
			==> Multi-threaded
		5) JSP: Java Server Pages
			static + dynamic content
	==============================


		@Controller
		public class LoginController{

			@RequestMapping("list.do")
			method() {

			}

			@RequestMapping("login.do")
			method() {

			}
			@RequestMapping("register.do")
			method() {

			}
		}


	a.jsp
		HTML
		and some tags

	Jasper converts a.jsp ==?> servlet.java
	Javac servlet ==> .class
	==========================

	Install the following:
		a) POSTMAN [ Chrome Web extension / App]	
			to test REST APIs
		b) VisualStudio Code
		c) NodeJS [ LTS ]
======================================================================
	
	Building REST APIs

	Rest is an acronym for REpresentational State Transfer.

	Resource: Any named thing on a server is a resouce
	Representation: Resource can be served to the client in various formats
	[representation]. Commonly used representations being [ XML, JSON, CSV, HTML]

	REST is architectural style.
	"Client-server": Strongly recommends to decouple client and server applications. Various/ Heterogenous clients. REST data can be consumed by
	Web, Mobile, Standalone,..

	"Stateless": HTTP protocol is stateless. It does not track conversational state of client. In Traditional web application we use Session Tracking to solve this [Cookie, URL-Rewriting]

	"Hypermedia": 


	-------------------------------------------------

	REST concept evolved in year 2000, coined by Ray Fielding

	Each Resource should have a URL, use pluaral nouns to identify a resource
	http://imdb.com/movies
	http://imdb.com/actors
	--------
	Each action on the resource is done using HTTP methods:

	GET 					-->   Fetch representation of resource
	POST 					--> create a sub-resource
	PUT 					--> update a resource
	DELETE 					--> delete a resource 

	Sample:
	1) 
	GET:
	http://localhost:8080/products

	get all products


	2) 
	GET:
	http://localhost:8080/products/44
	
	get a product whose id is 44

	Extra path parameter is for "ID" or sub-resource

	3) 
	GET:
	http://localhost:8080/products?category=mobile
	
	http://localhost:8080/products?page=3&size=20

	use query parameter to filter resource

	Note: GET doesn't have payload

	---

	4) 
	POST
	http://localhost:8080/products

	payload contains the new product info which has to be added to "products"


	5) 
	PUT
	http://localhost:8080/products/2

	payload contains the modified product which has to update the product 
	whose id is "2"

	6)
	DELETE
	http://localhost:8080/products/2

	delete a product whose id is "2"

	-------------

	Payload: PUT and POST
	----

	IDEMPOTENT methods [ Safe ]: Doesn't have any effect on resource for multiple requests

	"GET", "DELETE" is IDEMPOTENT

	"PUT", "POST" is not IDEMPOTENT

	----------------------

	REST apis depend on the following HTTP headers to serve representation
	MIME type: to identify the type of data

	accept: application/json

	accept: text/xml

	accept: text/csv

	What type of payload the client is sending:
	content-type: application/json

	--------------------------------

	ContentNegotiation Handlers: convert JAVA <--> Representation



	XML:
		<product>
			<id>33</id>
			<name>Test</name>
			<price>4545.55</price>
		</product>

		JAXB --> JAvaXML Binding

		---
	JSON: JavaScriptObjectNotation
		{} ==> OBject
		[] ==> array

		{
			"id": 1,
			"name" : "Test",
			"price": 442.33
		}

		Libraries: Jackson, Jettison, GSON, Moxy

	==========

	Status CODE:

	200 ==> OK
	201 ==> CREATED

	404 ==> Resource Not Found
	400 ==> BAD REquest

	500 == >Server Internal Error

	302 ==> REDIRECT

	RestTemplate: To consume REST data in Java

	http://localhost:8080/products
	http://localhost:8080/products?category=mobile


	Order:

	{
		"customer": {
			"email" : "b@rakuten.com"
		},
		"items" : [
			{
				"product" : {
					id: 1
				},
				"quantity" : 1,
				"amount" : 98000.00
			},
			{
				"product" : {
					id: 5
				},
				"quantity" : 2,
				"amount" : 60000.00
			}
		],
		"total": 158000.00

	}
================================================================

	POSTMAN / Advanced Rest Client: REST Client for Testing REST APIs

	RestTemplate: 
		a) To test RESTApi programatically [It is not Unit testing but can use in JUnit to test API]
		b) To Conusme RESTApi ==> client code has to get data from
			RESTful Web SErvices
			Example: One Microservice consuming data of other microservice


		RestController ---> Service ---> DAO ---> Database


		We need to use Mock APIs to test code in isolation
		
			To Test RestController we need to create SErvice Mock objects
			To Test Service we need to mock DAO

			Java has few Mocking APIS: EasyMock, JMock and Mockito

			Mockito has become the defacto API for mocking [ Integrated witin Spring boot]

			----


			class Service {

				Product getProduct(int id) { 	
					//....
				}

				void addProduct(Product p ){

				}
			}


			@RestController 
			class ProductController {
				@Autowired Service s;

				@ResponseBody Product getProduct(int id) {
					return service .getProduct(id);
				}
			}


			-- 

			To Test ProductController:
				Use Mockito mocking apis

				@MockBean
				Service s;

				when(s.getProduct(13)).thenReturn(new Product(13,"A",450.00));




				com.rakuten.prj.api

				ProductRestControllerTest

============================

	FundRaising Project:
		1) Spring Boot
		2) Unit Testing with Mockito
		3) Checkstyle
		4) POSTMAN and RESTTemplate

		





