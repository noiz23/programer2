# programer2
- Carpeta OCPStudyGuide.JavaClasses contiene las clases java de los ejemplos y examenes del libro
    OCP Oracle Certified Professional Java SE 8 Programes 2.
    
Respuestas 1 test libro 10 a 20:
Analisis -> Compilacion
10 C    ->  F
11 G    ->  G
12 E    -> *
13 F    ->
14 C    -> E
15 A    -> A
16 B    -> A
17 ?    -> ?
18 A,B  -> 
19 D    ->
20 C    ->

* Sin codigo a compilar

Notes:
    Anonymous inner classes are a special type of local inner class that does not have a name.
    Anonymous inner classes are required to extend exactly one class by name or implement
    exactly one interface. Static nested classes can exist without an instance of the outer class.

    Be able to identify the output of code using instanceof. instanceof checks if the left
    operand is the same class or interface (or a subclass) as the right operand. If the left oper-
    and is null, the result is false. If the two operands are not in the same class hierarchy, the
    code will not compile.
    
    Recognize correct and incorrect implementations of equals(), hashCode(), and
    toString(). public boolean equals(Object obj) returns false when called with null or
    a class of the wrong type. public int hashCode() returns a number calculated with all or
    some of the instance variables used in equals(). public String toString() returns any
    String.
    
    Enum types, can have instance variables. The constructors are required to be private or package private.
    
    The Java compiler allows methods to be overridden in subclasses if certain rules are followed: a method must have
    the same signature, be at least as accessible as the parent method, must not declare any new
    or broader exceptions, and must use covariant return types. Methods are overloaded if they
    have the same method name but a different argument list. 
    
    The relevant rule is that two objects that return true for equals() objects must
    return the same hash code.
    
    The ordinal() method of an enum returns its corresponding int value. Like arrays,
    enums are zero based. Remember that the index of an enum may change when you recompile
    the code and should not be used for comparison.
    
    Inner classes are not allowed to contain static methods
    or static variables. Only nested static classes are permitted to contain statics.
    
    ==      --> referencias
    equals  --> contenido
    
=================================================== CH 2 =========================
    - An interface may extend another interface, and in doing so it inherits all of the abstract methods.
    - In an interface, the compiler automatically adds public to all interface methods and abstract to all non‐static and non‐default methods

---------- Purpose of an Interface
    - Class: can implemnts n interfaces. Can extends only 1 class.
    - Interfaces: Can extends n interfaces. Can't implements interfaces or classess.
    - Interfaces may extend other interfaces, although they may not extend a class and vice versa. Interfaces may also contain public static final constant values,     public static methods, and public default methods. All members of an interface are public.

---------- Introducing Functional Programming
    - Java defines a functional interface as an                     interface that contains a single abstract   method.
    - Remember that the parentheses are optional only when there is one parameter and it doesn’t have a type declared.
    - The data types for the input parameters of a lambda expression are optional. When one parameter has a data type listed, though, all parameters must provide a data type.
    - A Java object may be accessed using a
    reference with the same type as the object, a reference that is a superclass of the object, or
    a reference that defines an interface that the object implements, either directly or through
    a superclass. Furthermore, a cast is not required if the object is being reassigned to a
    supertype or interface of the object.
    -   1. The type of the object determines which properties exist within the object in memory.
        2.The type of the reference to the object determines which methods and variables are
        accessible to the Java program.
    
    Here are some basic rules to keep in mind when casting variables:
        1.Casting an object from a subclass to a superclass doesn’t require an explicit cast.
        2.Casting an object from a superclass to a subclass requires an explicit cast.
        3.The compiler will not allow casts to unrelated types.
        4.Even when the code compiles without issue, an exception may be thrown at runtime if
          the object being cast is not actually an instance of that class.

---------- Understanding Design Principles
    - A design principle is an established idea or best practice that facilitates the software design
      process. 
--------- Creating JavaBeans
    - Although boolean values use is to start their getter method, the same does not apply to instances of the wrap-
      per Boolean class, which use get.
--------- Applying the Is‐a Relationship
    - The is‐a relationship is also known as the inheritance test.
      The fundamental result of the is‐a principle is that if A is‐a B, then any instance of A can
      be treated like an instance of B. This holds true for a child that is a subclass of any parent,
      be it a direct subclass or a distant child.
--------- Applying the Has‐a Relationship
    - The has‐a relationship is also known as the object composition test.
--------- Singleton Pattern
    - The singleton pattern is a creational pattern focused on creating only one instance of an object in memory within an application, sharable by all classes and threads within the application.
    - All constructors in a singleton class are marked private, which ensures that no other class iscapable of instantiating another version of the class.
    - The singleton class is effectively final -> all constructors in a singleton class are marked private.
    - Singletons are used in situations where we need access to a single set of data throughout an application. For example, application configuration data and reusable  data caches are commonly implemented using singletons. Singletons may also be used to coordinate access to shared resources, such as coordinating write access to a file.
--------Immutable Objects pattern*
    - The immutable object pattern is a creational pattern based on the idea of creating objects whose state does not change after they are created and can be easily    shared across multiple classes. 
    - Static methods are not part of the inmutable object pattern y getter methods are not required to be marked synchronized.
-------Review Questions
    - A design pattern is focused on solving a specific commonly occurring problem. 
    - Object composition tends to promote greater code reuse than inheritance.
    - Object composition requires a class variable to be declared public or accessible from a public method to be used by a class in a different package.
    - Caching data is one of the most common uses of the singleton pattern.

    =================================================== CH 3 =========================
    - An ArrayList can't contain primitives.
    - Collections written with-out generics are also known as raw collections.
    * To review, the lesson is to be careful when you see code that doesn’t use generics. Pay spe-cial attention to looking for compiler warnings, ClassCastException s,and compiler errors.
    
------- Unbounded Wildcards
    - An unbounded wildcard represents any data type. You use ? when you want to specify that any type is OK with you. 
        Ex: List<?> l = new ArrayList<String>();
-------Upper-Bounded Wildcards
    - A generic type can’t just use a subclass:
        ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
    - Upper bounds are like anonymous classes in that they use extends regardless of whether we are working with a class or an interface.







