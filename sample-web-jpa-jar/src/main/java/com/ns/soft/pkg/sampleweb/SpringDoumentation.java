package com.ns.soft.pkg.sampleweb;

public class SpringDoumentation {
//	Thus, if you are choosing between using @Component or @Service for your service layer, 
//	@Service is clearly the better choice. 
//	Similarly, as stated above, @Repository is already supported as a marker for automatic exception translation
//	in your persistence layer.	
//	┌────────────┬─────────────────────────────────────────────────────┐
//	│ Annotation │ Meaning                                             │
//	├────────────┼─────────────────────────────────────────────────────┤
//	│ @Component │ generic stereotype for any Spring-managed component │
//	│ @Repository│ stereotype for persistence layer                    │
//	│ @Service   │ stereotype for service layer                        │
//	│ @Controller│ stereotype for presentation layer (spring-mvc)      │
//	└────────────┴─────────────────────────────────────────────────────┘
	//@AndreasLundgren If you annotated the persistence layer with @Service or @Component instead of @Repository, 
	//you lose the exception translation functionality. If you never catch specific persistence exceptions, 
	//or you don't care about the tight coupling of e.g. catching Hibernate specific exceptions, then you don't care about 
	//the exception translation. Similarly, if you annotate the service layer with something other than @Service, 
	//you lose the ability to add service-layer specific pointcuts. If you never do that, you don't care, 
	//but using correct annotation is also good documentation 
}
