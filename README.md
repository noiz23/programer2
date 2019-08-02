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
    
    For enum types, can have instance variables. The constructors are required to be private or package private.
    
    The Java compiler allows methods to be overridden in subclasses if certain rules are followed: a method must have
    the same signature, be at least as accessible as the parent method, must not declare any new
    or broader exceptions, and must use covariant return types. Methods are overloaded if they
    have the same method name but a different argument list. 
    
    ==      --> referencias
    equals  --> contenido
    
Review Questions

Response            Compiled
1  A                    A
2  A                    A
3  B                    C
4  C                    ?
5  B,D                  ?
6  B                    B
7  E                    E
8  C                    C
9  B                    B
10 C                    C
11 D                    D
12 C                    E
13 B                    B
14 F                    E
15 B,E                  ?
16 A                    E
17 B                    B
18 G                    G
19 A,C,D                A,C
20 C                    C
21 E                    A,C,E


