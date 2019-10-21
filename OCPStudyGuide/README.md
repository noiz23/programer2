import java.util.stream.*;
import java.util.function.Predicate;
public class NN{
    public static void main(String... ss){
        System.out.println("Start...");
    
        System.out.println("End...");
    }
}

* -> Java 8 Concurrency

https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

# programer2
- Carpeta OCPStudyGuide.JavaClasses contiene las clases java de los ejemplos y examenes del libro
    OCP Oracle Certified Professional Java SE 8 Programes 2.
    
Notes:
    Anonymous inner classes:
        - Are a special type of local inner class that does not have a name.
        - Are required to extend exactly one class by name or implement exactly one interface. 
    Static nested classes can exist without an instance of the outer class.

    Be able to identify the output of code using instanceof. instanceof checks if the left operand is the same class or interface (or a subclass) as the right operand. If the left operand is null, the result is false. 
    If the two operands are not in the same class hierarchy, the code will not compile.
    Recognize correct and incorrect implementations of equals(), hashCode(), and toString(). 
    public boolean equals(Object obj) returns false when called with null or a class of the wrong type. 
    public int hashCode() returns a number calculated with all or some of the instance variables used in equals(). 
    public String toString() returns any String.
    Enum types, can have instance variables. The constructors are required to be private or package private.
    Enums are not allowed to have a public constructor.
    Just as an abstract superclass requires concrete subclasses to have an implementation, abstract enum methods require each enum type to implement the method.
    The Java compiler allows methods to be overridden in subclasses if certain rules are followed: a method must have
    the same signature, be at least as accessible as the parent method, must not declare any new
    or broader exceptions, and must use covariant return types. 
    Methods are overloaded if they have the same method name but a different argument list. 
    The relevant rule is that two objects that return true for equals() objects must return the same hash code.
    The ordinal() method of an enum returns its corresponding int value. Like arrays,enums are zero based. Remember that the index of an enum may change when you recompile the code and should not be used for comparison.
    Inner classes are not allowed to contain static methods or static variables. 
    Only nested static classes are permitted to contain statics.
    ==      --> referencias
    equals  --> contenido
    If equals(null) is called, the method should return false.
    If equals() is passed the wrong type, the method should return false
    An equals() method should have a null check and an instanceof check.
    Unlike a "regular" class, an inner class can be private or protected or static. 
    Like a principal class, can be public or default. Principal class must be public or default and never static.
    Just like static attributes and methods, a static inner class does not have access to members of the outer class that are not static.
    Virtual method invocation says that the subclass method gets called at runtime rather than the type in the variable reference.
**************************************************************************************************************************    
=================================================== CH 2 =========================
    - An interface may extend another interface, and in doing so it inherits all of the abstract methods.
    - In an interface, the compiler automatically adds public to all interface methods and abstract to all non‐static and non‐default methods

---------- Purpose of an Interface
    - Class: can implemnts n interfaces. Can extends only 1 class.
    - Interfaces: Can extends n interfaces. Can't implements interfaces or classess.
    - Interfaces may extend other interfaces, although they may not extend a class and vice versa. Interfaces may also contain public static final constant values, public static methods, and public default methods. All members of an interface are public.

---------- Introducing Functional Programming
    - Java defines a functional interface as an                     interface that contains a single abstract   method.
    - Remember that the parentheses are optional in a lambda expresion only when there is one parameter and it doesn’t have a type declared.
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
    - Although boolean values use is to start their getter method, the same does not apply to instances of the wrapper Boolean class, which use get.
--------- Applying the Is‐a Relationship
    - The is‐a relationship is also known as the inheritance test.
      The fundamental result of the is‐a principle is that if A is‐a B, then any instance of A can
      be treated like an instance of B. This holds true for a child that is a subclass of any parent,
      be it a direct subclass or a distant child.
--------- Applying the Has‐a Relationship
    - The has‐a relationship is also known as the object composition test.
--------- Singleton Pattern
    - The singleton pattern is a creational pattern focused on creating only one instance of an object in memory within an application, sharable by all classes and threads within the application.
    - All constructors in a singleton class are marked private, which ensures that no other class is capable of instantiating another version of the class.
    - The singleton class is effectively final -> all constructors in a singleton class are marked private.
    - Singletons are used in situations where we need access to a single set of data throughout an application. For example, application configuration data and reusable  data caches are commonly implemented using singletons. Singletons may also be used to coordinate access to shared resources, such as coordinating write access to a file.
--------Immutable Objects pattern*
    - The immutable object pattern is a creational pattern based on the idea of creating objects whose state does not change after they are created and can be easily    shared across multiple classes. 
    - Static methods are not part of the inmutable object pattern y getter methods are not required to be marked synchronized.
-------Review Questions
    - A design pattern is focused on solving a specific commonly occurring problem. 
    - Design principles are often applied throughout an application, whereas design patterns are applied to solve specific problems.
    - Design principles and design patterns tend to produce code that is easier to maintain and easier for other developers to read.
    - Inmutable pattern:  all instance variables should be private and final to prevent them from being changed by a caller and the class must be markend as final.
    - interfaces have static and default methods, as well as static final variables.
    -  abstract and final can never be used together.
    - A reference to an object requires an explicit cast if referenced with a subclass. If the cast is to a superclass reference, then an explicit cast is not required.
    - Inheritance supports access to protected variables.
    - Inheritance tends to use the is-a principle, whereas object composition relies on the has-a principle.
    - Caching data or Manage write access to a log file are some common uses of the singleton pattern.
    - interface can have public or default access.
    - 
    
    - Object composition tends to promote greater code reuse than inheritance.
    - Object composition requires a class variable to be declared public or accessible from a public method to be used by a class in a different package.
    - Caching data is one of the most common uses of the singleton pattern.
    
**************************************************************************************************************************
=================================================== CH 3 =========================
    - An ArrayList can't contain primitives.
    - Collections written with-out generics are also known as raw collections.
    * To review, the lesson is to be careful when you see code that doesn’t use generics. Pay special attention to looking for compiler warnings, ClassCastExceptions,and compiler errors.
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
    --List: A list is an ordered collection of elements that allows duplicate entries. Elements in a list can be accessed by an int index.
    --Set: A set is a collection that does not allow duplicate entries.
    --Queue: A queue is a collection that orders its elements in a specific order for processing.
    A typical queue processes its elements in a first-in, first-out order, but other orderings
    are possible.
    --Map: A map is a collection that maps keys to values, with no duplicate keys allowed. The elements in a map are key/value pairs.
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
    - TreeMap —> no null keys
    - Hashtable —>no null keys or values
    - TreeSet —>no null elements
    - ArrayDeque —> no null elements
 
 List —> An ordered collection of elements that allows duplicate entries

 ArrayList —> Standard resizable list.

 LinkedList —> Can easily add/remove from beginning or end.

 Vector —> Older thread-safe version of ArrayList.

 Stack —> Older last-in, first-out class.

 Set —> Does not allow duplicates

 HashSet —> Uses hashcode() to find unordered elements.

 TreeSet —> Sorted and navigable. Does not allow null values.

 Queue —> Orders elements for processing

 ArrayDeque —> First-in, first-out or last-in, first-out. Does not allow null values.

 Map —> Maps unique keys to values

 HashMap —> Uses hashcode() to find keys.

 TreeMap —> Sorted map. Does not allow null keys.

 Hashtable —> Older version of hashmap. Does not allow null keys or values.
    
-----Comparable
    - The Comparable interface has only one method. In fact, this is the entire interface:
        public interface Comparable<T> {
            public int compareTo(T o);
        }
    - The Comparator interface defines a compare(arg1, arg2) method with two arguments which represent compared objects and works similarly to the Comparable.compareTo() method.
    
---- Classes that implement Comparable are said to have a natural ordering and implement the compareTo() method. A class is allowed to have only one natural ordering. 
        
---- A Comparator takes two objects in the compare() method. Different Comparators can have different sort orders. A Comparator is often implemented using a lambda such as 
(a, b) -> a.num – b.num.
    - The list or array must be sorted before it is searched using the same definition of order for both.
    
- HashSet does not guarantee any iteration order.
- The Map interface uses put() rather than add().
- Wildcard is not allowed to be on the right side of an assignment.
- Vector is an old type of List.
- The java.lang.Comparable interface is implemented on the object to compare. It specifies the compareTo() method, which takes one parameter. 
- The java.util.Comparator interface specifies the compare() method, which takes two parameters.
- Map does not have a contains() method. It has containsKey() and containsValue() instead.
- In Map, map.get(n) n starts in 1.
- ArrayDeque: push() -> LIFO
              offer() -> FIFO
- TreeSet: sorts the elements. The ceiling() method returns the smallest element
greater than the specified one. 
-LinkedList:The List interface has a method to remove by index. Queue has only the remove by object method,


****************************************************************************************************************************
=================================================== CHp 4 =========================
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
    - The sorted() method is used in a stream pipeline to return a sorted Stream.
    - The average() method returns an OptionalDouble since averages of any type can
result in a fraction
    -  The partitioningBy() operation always returns a map with two Boolean keys, even if there are no corresponding values
    - The three common types of double, int and, long have dedicated supplier classes. --> BooleanSupplier.
    - 

****************************************************************************************************************************
=====================================================================CH 5:
 Resources are closed after the try clause ends and before any catch/ finally clauses.
 Resources are closed in the reverse order from which they were created.
 
The syntax for an assert statement has two forms:
assert boolean_expression;
assert boolean_expression: error_message;

The main difference between AutoCloseable and Closeable is that AutoCloseable has Exception in the signature and Closeable has only IOException in the signature. 
Since IllegalStateException is a runtime exception, it can be thrown by any method.

A thread is the smallest unit of execution that can be scheduled by the operating system. A process is a group of associated threads that execute in the same, shared environment. It follows,then, that a single-threaded process is one that contains exactly one thread, whereas a multi-threaded process is one that contains one or more threads.

- Locale is created using a constructor.
-  The convention is to use lowercase for a language code and uppercase for a country code. The language is mandatory when using a constructor
- Java class resource bundles can have non-String values while property files are limited to strings
- Java specifies that it will look for a Java class resource bundle before a property file of the same name.
- Calendar constants for months begins with 0.
- Period does not allow chaining. Only the last Period method called counts.
-  Period format begins with a P and a Dura-
tion format begins with PT. They are different types and do not represent the same value even though they are both a day.
-  Remember that Duration uses hours/minutes/seconds and Period uses years months/days for measures
- Without a time zone, Java doesn’t know what moment in time to use for the Instant.

****************************************************************************************************************************
=====================================================================CH 6:
- Java uses the flags –ea or –enableassertions to turn on assertions. –da or
–disableassertions turns off assertions. The colon indicates for a specific class. 
- An assertion consists of a boolean expression followed by an optional colon and message. The boolean expression is allowed to be in parenthesis, but this is not required.
- assertions should not have side effects.
- ** memorize the contents of Table 6.2 and Table 6.3 before the exam
- Since a multi-catch is used, the variable in the catch block is effectively final and cannot be reassigned.
- A multi-catch cannot catch both a superclass and subclass.
- The main difference between AutoCloseable and Closeable is that AutoCloseable has Exception in the signature and Closeable has only IOException in the signature.
- 

****************************************************************************************************************************
=======================================================================CH 7
The key here is that using the atomic classes ensures that the data is consistent between workers and that no values are lost due to concurrent modifications.


****************************************************************************************************************************
=======================================================================CH 8
- FileInputStream is a low-level stream that interacts directly with a file resource, not a stream resource.
- you cannot use BufferedReader/BufferedWriter directly on a stream.
- The readLine() method returns a String and reads a line of input from the console. readPassword() returns a char[]
- The System class has three streams: in is for input, err is for error, and out is for output. 
- Serialization of an object stores only the instance variable data, not the static class data.
- ObjectOutputStream and ObjectInputStream perform serialization and deserialization on a low-level stream, respectively.
- PrintStream and PrintWriter format text for a low-level OutputStream and Writer.
- FileWriter and FileInputStream operate on a file directly and are low-level streams.
- OutputStream is an abstract parent class and is neither high-level nor low-level.
- Console defines two output methods, format() and printf(), that are identical in function.
- Character stream classes often include built-in convenience methods for working with String data. They also handle character encoding automatically.
- The variables marked as transient, which means that their values will not be saved upon serialization.
- 

----------------------------------------NIO.2
=======================================================================CH 9
createDirectory()   ->  Files.createDirectory(Path) method to create a directory
createDirectories() ->  like mkdirs() creates the target directory along with any nonexistent parent directories leading up to the target directory in the path.

Moving a non-empty directory across a drive will throw an NIO.2 DirectoryNotEmptyException. --> Files.move(Paths.get("c:\\zoo"),Paths.get("c:\\zoo-new"));

delete() and deleteIfExists() -> If the target of the path is a symbol link, then the symbolic link will be deleted, not the target of the link.

Like the isDirectory(), isRegularFile(), and isSymbolicLink() methods, the isReadable() and isExecutable() methods do not throw exceptions if the file does not
exist but instead return false.

The Files class provides the method Files.getLastModifiedTime(Path), which returns a FileTime object to accomplish this. The FileTime class is a simple container class that stores the date/time information about when a file was accessed, modified, or created. For convenience, it has a toMillis() method that returns the epoch time.

The FileTime class also has a static fromMillis() method that converts from the epoch time to a FileTime object.
 
BasicFileAttributeView is used to modify a file’s set of date/time values.

- The setTimes() method is available only on BasicFileAttributeView, not the read only BasicFileAttributes class.
- the resolve() method does not normalize any path symbols.
- resolve() with an absolute path as a parameter returns the absolute path.
- Files.lines() returns a Stream<Path> and Files.readAllLines() returns a List<String>
- Files.lines() reads the file in a lazy manner, while Files.readAllLines() reads the entire file into memory all at once; therefore Files.lines() works better on large files with limited memory available
- the NOFOLLOW_LINKS option means that if the source is a symbolic link, the link itself and not the target will be copied at runtime.
- The option ATOMIC_MOVE means that any process monitoring the file system will not see an incomplete file during the move.
- isSameFile()returns true only if the files pointed to in the file system are the same, without regard to the file contents.
- the java.io.File.listFiles() method retrieves the members of the current directory without traversing any subdirectories.
- Files.walk() and Files.find() recursively traverse a directory tree rather than list the contents of the current directory.
- 


-----------------------------------JDBC
===================================================CH 10
JDBC stands for Java Database Connectivity: Accesses data as rows and columns.

\\ java -cp "/opt/derby-10.14.2.0/lib/derby.jar:." SetupDerbyDatabase
Interfaces in JDBC for exam:

Driver: Knows how to get a connection to the database
Connection: Knows how to communicate with the database
Statement: Knows how to run the SQL
ResultSet: Knows what was returned by a SELECT query

There are two main ways to get a Connection: DriverManager or DataSource.
Es better use DataSource then DriverManager, but the last one is in the exam objectives.

By default, a ResultSet is in TYPE_FORWARD_ONLY mode and is in CONCUR_READ_ONLY mode.

DELETE, INSERT, or UPDATE. They typically use a method called executeUpdate(). The name is a little tricky because the SQL UPDATE statement is not the
only statement that uses this method.

Query -> Select; execute() can run query or an update. It returns a boolean so that we know whether there is a ResultSet.
For a SELECT SQL statement, use executeQuery() or execute() . For other SQL statements, use executeUpdate() or execute().

The rows in a ResultSet are numbered start-ing with 1. Calling absolute(4) moves the cursor to the fourth row. Calling absolute(0)
moves the cursor to a location immediately before the result. Calling absolute(-1) moves the cursor to the last row.


Remember that JDBC starts counting with one rather than zero.

Closing a Connection also closes the Statement and ResultSet.
Closing a Statement also closes the ResultSet.

The ResultSet is closed first, followed by the Statement, and then the Connection.

Exceptions:
The getMessage() method returns a human-readable message as to what went wrong. 
The getSQLState() method returns a code as to what went wrong. You can Google the name of your database
and the SQL state to get more information about the error. 
The getErrorCode() is a database-specific code.

Modes for ResultSet concurrency when creating a Statement:
    CONCUR_READ_ONLY, means that you can read the ResultSet but not write to it. --> is the default.
    CONCUR_UPDATABLE means that you can both read and write to it.
    































































