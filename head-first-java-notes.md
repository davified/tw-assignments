
Head First Java (Summary notes)
Chapters 1 through 11, 14, 16 and 17,

Source -> Compiler -> Output (byte-code) -> Virtual Java Machines

Key benefits of Java:
* Object-oriented: Object-oriented programming lets you extend a program without having to touch previously- tested, working code.
* Inheritance (write code once!)

Key points:
* All Java code is defined in a class.
* A class describes how to make an object of
that class type. A class is like a blueprint.
* An object can take care of itself; you don’t have to know or care how the object does it.
* An object knows things (variables) and does things (methods).  Things an object knows about itself are called instance variables. They represent the state of an object. Things an object does are called methods. They represent the behavior of an object.
* When you create a class, you may also want to create a separate test class which you’ll use to create objects of your new class type.
* A class can inherit instance variables and methods from a more abstract superclass.
* At runtime, a Java program is nothing more than objects ‘talking’ to other objects.
* There should only be one class which invokes the main() method.    main() is used for two key purposes: (i) to test your real class, (ii) to launch/start your Java application
* Primitive types: int, float, double, boolean, string, etc.
* reference: a set of bytes/bits that refer to an object. A reference variable is like a remote control. It's not the object (e.g. TV) itself, but it can refer to the actual object and tell it what to do.
* when defining an object, you have to set the type to its class (e.g. Dog fido = new Dog())
* Encapsulation is important: it's good practice to make instance variables private so as not to expose implementation details. Expose only what you need to expose by defining getter/setter methods

Syntax:
- very similar to javascript/typescript (if-else, while). Differences are:
  * semi-colons are essential;
  * ==, not ===
  * for loops??
