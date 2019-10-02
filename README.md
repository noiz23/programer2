import java.util.stream.*;
import java.util.function.Predicate;
public class NN{
    public static void main(String... ss){
        System.out.println("Start...");
    
        System.out.println("End...");
    }
}


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
    - An array is a built-in data structure that contains other objects or primitives.

    
-------Unbounded Wildcards
    - An unbounded wildcard represents any data type. You use ? when you want to specify that any type is OK with you. 
        Ex: List<?> l = new ArrayList<String>();
-------Upper-Bounded Wildcards
    - Upper bounded wildcard restricts the unknown type to be a specific type or a subtype of that type. -> <? extends A>
    - A generic type can’t just use a subclass:
        ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
    - Upper bounds are like anonymous classes in that they use extends regardless of whether we are working with a class or an interface.
    - List<? extends Number> list = new ArrayList<Integer>(); -> The upper-bounded wildcard says that any class that extends Number or Number itself can be used as the formal parameter type -> Number or any subclass
************************ Buscar info Lower-Bounded Wildcards y Upper-Bounded Wildcards, Comparator vs. Comparable, New Java 8 Map APIs

    - <? extends Object> is an upper bound that means any type that is Object or extends it. 
    - <? extends MyInterface> means any type that implements MyInterface. 
------Lower-Bounded Wildcards
    - A lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type. -> <? super A>
    - <? super Number> is a lower bound that means any type that is Number or a superclass. A compiler error results from code that attempts to add or remove an item in a list with an unbounded or upper-bounded wildcard.


-------Using Lists, Sets, Maps, and Queues
    - The Java Collections Framework includes four main types of data structures: lists, sets,queues, and maps. The Collection interface is the parent interface of List, Set, and Queue. The Map interface does not extend Collection. You need to recognize the following:

    -A collection is a group of objects contained in a single object. The Java Collections Framework is a set of classes in java.util for storing collections. There are four main interfaces in the Java Collections Framework:

    -   List: A list is an ordered collection of elements that allows duplicate entries. Elements in a list can be accessed by an int index.
    -   Set: A set is a collection that does not allow duplicate entries.
    -   Queue: A queue is a collection that orders its elements in a specific order for processing.
        A typical queue processes its elements in a first-in, first-out order, but other orderings
        are possible.
    -   Map: A map is a collection that maps keys to values, with no duplicate keys allowed. The elements in a map are key/value pairs.

    - The add() method inserts a new element into the Collection and returns whether it was successful. The method signature is: boolean add(E element)
    - A List allows duplicates. In a Set does not allow duplicates, so that Java returns false from the add() method.
    - The remove() method removes a single matching value in the Collection and returns whether it was successful. The method signature is boolean remove(Object object).
      Remember that there are overloaded remove() methods. One takes the element to remove. The other takes the index of the element to remove. The latter is being called here.
------Using the List Interface
    - You use a list when you want an ordered collection that can contain duplicate entries.
    - A LinkedList is special because it implements both List and Queue. The main benefits of a LinkedList are that you can access, add, and remove from the beginning and end of the list in constant time. The tradeoff is that dealing with an arbitrary index takes linear time. This makes a LinkedList a good choice when you’ll be using it as Queue. 
    - A Stack is a data structure where you add and remove elements from the top of the stack.  If you need a stack, use an ArrayDeque instead.
-----Methods List Interface:
    - boolean add(E e)	It is used to append the specified element at the end of a list.
    - void add(int index, E element)	It is used to insert the specified element at the specified position in a list.
    - E get(int index)	It is used to fetch the element from the particular position of the list.
    - int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this                                        element.
    - int lastIndexOf(Object o) Returns last matching index or -1 if not found
    - E remove(int index)	It is used to remove the element present at the specified position in the list.
    - E set(int index, E e)  Replaces element at index and returns original
-----Using the Set Interface
    - You use a set when you don’t want to allow duplicate entries.
    - A HashSet stores its elements in a hash table. This means that it uses the hashCode() method of the objects to retrieve them more efficiently. 
    - A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order.
-----Using the Queue Interface
    - You use a queue when elements are added and removed in a specific order.
    - The main benefit of a LinkedList is that it implements both the List and Queue interfaces. The tradeoff is that it isn’t as efficient as a “pure” queue.
    - An ArrayDeque is a “pure” double-ended queue. It was introduced in Java 6, and it stores its elements in a resizable array. The main benefit of an ArrayDeque is that it is more efficient than a LinkedList.
    - A queue is like a line of people. You get on in the back and ofin the front. A stack is like a stack of plates. You put the plate on the top and take it off the top. Since the stack is implemented using ArrayDeque, we refer to “top” and “front” interchangeably.
-----Map
    - You use a map when you want to identify values by a key.
    - TreeSet cannot contain null elements. It also means that TreeMap cannot contain null keys. Null values are OK.
    - TreeMap—no null keys
    - Hashtable—no null keys or values
    - TreeSet—no null elements
    - ArrayDeque—no null elements
 
 List—An ordered collection of elements that allows duplicate entries

 ArrayList—Standard resizable list.

 LinkedList—Can easily add/remove from beginning or end.

 Vector—Older thread-safe version of ArrayList.

 Stack—Older last-in, first-out class.

 Set—Does not allow duplicates

 HashSet—Uses hashcode() to find unordered elements.

 TreeSet—Sorted and navigable. Does not allow null values.

 Queue—Orders elements for processing

 LinkedList—Can easily add/remove from beginning or end.

 ArrayDeque—First-in, first-out or last-in, first-out. Does not allow null values.

 Map—Maps unique keys to values

 HashMap—Uses hashcode() to find keys.

 TreeMap—Sorted map. Does not allow null keys.

 Hashtable—Older version of hashmap. Does not allow null keys or values.
    
-----Comparable
    - The Comparable interface has only one method. In fact, this is the entire interface:
        public interface Comparable<T> {
            public int compareTo(T o);
        }
    - The Comparator interface defines a compare(arg1, arg2) method with two arguments which represent compared objects and works similarly to the Comparable.compareTo() method.
    
---- Classes that implement Comparable are said to have a natural ordering and implement the compareTo() method. A class is
        allowed to have only one natural ordering. 
        
---- A Comparator takes two objects in the compare() method. Different Comparators can have different sort orders. A Comparator is
     often implemented using a lambda such as (a, b) -> a.num – b.num.
    - The list or array must be sorted before it is searched using the same definition of order for both.
    
- HashSet does not guarantee any iteration order.
- The Map interface uses put() rather than add().
- Wildcard is not allowed to be on the right side of an assignment.
- Vector is an old type of List.
- The java.lang.Comparable interface is implemented on the object to compare. It specifies the compareTo() method, which takes one parameter. 
- The java.util.Comparator interface specifies the compare() method, which takes two parameters.
- Map does not have a contains() method. It has containsKey() and containsValue() instead.

=================================================== CH 4 =========================
---- Using Variables in Lambdas
    - Lambda expressions can access static variables, instance variables, effectively final method parameters, and effectively final local variables.
---- Working with Built-In Functional Interfaces
    - Runnable interface doesn’t take any parameters, return any data, or use generics.
    - Supplier Interface: is used when you want to generate or supply values without taking any input.
        @FunctionalInterface public class Supplier<T> {
            public T get();
        }
    - Consumer and BiConsumer:You use a Consumer when you want to do something with a parameter but not return anything. BiConsumer does the same thing except that it takes two parameters. 
        @FunctionalInterface public class Consumer<T> {
            void accept(T t);
        }
        @FunctionalInterface public class BiConsumer<T, U> {
            void accept(T t, U u);
        }
    - BiConsumer can use the same type for both the T and U generic parameters.
    - Predicate and BiPredicate: 
        A Predicate FI accepts one argument and returns a Boolean value. Its abstract method is test(Object). A BiPredicate FI accepts two arguments and return a Boolean value. 
        @FunctionalInterface public class Predicate<T> {
            boolean test(T t);
        }
        @FunctionalInterface public class BiPredicate<T, U> {
            boolean test(T t, U u);
        }
    - Function and BiFunction: A Function is responsible for turning one parameter into a value of a potentially different type and returning it. 
    Similarly, a BiFunction is responsible for turning two parameters into a value and returning it.
        @FunctionalInterface public class Function<T, R> {
            R apply(T t);
        }
        @FunctionalInterface public class BiFunction<T, U, R> {
            R apply(T t, U u);
        }
    - UnaryOperator and BinaryOperator:They require all type parameters to be the same type.
------Checking Functional Interfaces
    - When you see a boolean returned, think Predicate unless the generics specify a Boolean return type.
------Using Streams:  java.util.stream 
    - A stream in Java is a sequence of data. A stream pipeline is the operations that run on a stream to produce a result. 

    - You can call forEach() directly on a Collection or on a Stream.
    - Streams cannot use a traditional for loop to run because they don’t implement the Iterable interface.
    - IntStream: Used for the primitive types int, short, byte, and char
    - LongStream: Used for the primitive type long
    - DoubleStream: Used for the primitive types double and float
    - 

CH 5:
 Resources are closed after the try clause ends and before any catch/ finally clauses.
 Resources are closed in the reverse order from which they were created.
 
The syntax for an assert statement has two forms:
assert boolean_expression;
assert boolean_expression: error_message;

The main difference between AutoCloseable and Closeable is that AutoCloseable has Exception in the signature and Closeable has only IOException in the signature. 
Since IllegalStateException is a runtime exception, it can be thrown by any method.

A thread is the smallest unit of execution that can be scheduled by the operating system. A process is a group of associated threads that execute in the same, shared environment. It follows,then, that a single-threaded process is one that contains exactly one thread, whereas a multi-threaded process is one that contains one or more threads.


CH 7
The key here is that using the atomic classes ensures that the data is consistent between workers and that no values are lost due to concurrent modifications.

















































