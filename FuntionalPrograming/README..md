A Predicate<T> takes in one parameter of type T and returns a boolean result to indicate a decision for whatever check it represents.
We can use it anytime we want to make a go or no-go decision for a candidate we pass to the predicate. Methods like filter() that evaluate candidate elements take in a Predicate as their parameters. 

On the other hand, a Function<T, R> represents a function that takes a parameter of type T and returns a result of type R. This is more general                        than a Predicate that always returns a boolean. We can use a Function anywhere we want to transform an input to another value,so it’s quite logical that the map() method uses Function as its parameter.

The Optional class is useful whenever the result may be absent. It protects us from getting a NullPointerException by accident and makes it quite explicit to the reader that “no result found” is a possible outcome.

 A List is an ordered Collection. A collection is an object that groups multiple elements into a single unit.
 
CH9

Statements perform actions but don’t return anything, whereas expressions perform actions and return a result.
