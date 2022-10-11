
* Not all objects are managed by the framework
* What is a bean?
* Application context in spring
* How to create beans in the context
  * using @Bean annotation
  * using stereotype annotations
  * programmatically

* A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
* Application context is the corner stone of spring application.It represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the beans
* Configuration class is a special class is spring we use to instruct spring to do specific actions.
* Methods return type is used to get the bean
* Method name is bean name (against convention) . we can change this with name =
* We can create bean of any type including inbuilt types
* use getBean method to get beans
* Spring looks for a bean of the type you requested in its context. if such a bean doesnt exist spring throws an exception
* If multiple beans of same type is the context. when getting a bean of that type spring will throw error
* use @Bean(name="name") or @Primary

* when using stereotype annotations for creating beans, mark the classes for which you want to add an instance to its context with @Component annotation
* using @ComponentScan annotation over the configuration class, instruct spring on where to find the classes marked with stereotype annotations
* when using stereotype spring only created instances . we need to set the properties later on

* we can use registerBean method of the context when we want to implement a custom way of adding beans or when we need to add beans based on condition

## wiring ##

* Spring augments all objects and methods we annotate
* two ways to establish relationship among beans
  * link the beans by directly calling the methods that create them (wiring)
  * enable spring to provide us a value using a method parameter (auto wiring)
  
* only one instance is created even though we are calling the bean method multiple times
* Dependency injection is a technique involving the framework setting a value into specific field or parameter
* using @Autowired
* 3 ways of using @Autowired
  * injecting a value in the field of a class
  * injecting a value through constructor parameters
  * injecting value through setter (very rarely used)
* Dealing with circular dependency
* Choosing from multiple bean in the spring context using qualifier