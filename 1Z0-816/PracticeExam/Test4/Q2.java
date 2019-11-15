public class Q2{
    public static void main(String... args){
        Person<String> person = new Person<>("Jonh");
        System.out.println(person.name);
    }

}

class Person<String>{
    String name;
    
    Person(String name){
        this.name = name.toUpperCase();
    }
}
