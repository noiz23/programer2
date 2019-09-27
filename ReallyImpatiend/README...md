https://books.google.cl/books?id=FKUdAwAAQBAJ&printsec=frontcover&dq=java+functional+programming+book&hl=es-419&sa=X&ved=0ahUKEwjwkprL5KbkAhVUI7kGHaQ4Dh4Q6AEIMjAB#v=onepage&q=java%20functional%20programming%20book&f=false

*: https://books.google.cl/books?id=2OHKjgEACAAJ&dq=java+functional+programming+book&hl=es-419&sa=X&ved=0ahUKEwjwkprL5KbkAhVUI7kGHaQ4Dh4Q6AEIOzAC

A “lambda expression” is a block of code that you can pass around so it can be executed later, once or multiple times. 

A lambda expression is a block of code with parameters.

Lambda expressions can be converted to functional interfaces.

Lambda expressions can access effectively final variables from the enclosing scope.
Chp3

NOTE: You can’t even assign a lambda expression to a variable of type Object—Object is not a functional interface.

The :: operator separates the method name
from the name of an object or class. There are three principal cases:
• object::instanceMethod
• Class::staticMethod
• Class::instanceMethod

You can capture the this parameter in a method reference. For example,this::equals is the same as x -> this.equals(x). It is also valid to use super. The method expression super::instanceMethod uses this as the target and invokes the superclass version of the given method.

In a lambda expression, you can only reference variables whose value doesn’t change ( any effectively final local variable).

 Use filter to select elements and map to transform elements. Other operations for transforming streams include limit, distinct, and sorted.
 
  To obtain a result from a stream, use a reduction operator such as count, max, min, findFirst, or findAny. Some of these methods return an Optional value.

  A stream does not store its elements. They may be stored in an underlying collection or generated on demand.
  Stream operations don’t mutate their source. Instead, they return new streams that hold the result.
  Pag 27 Stateful Transformations












