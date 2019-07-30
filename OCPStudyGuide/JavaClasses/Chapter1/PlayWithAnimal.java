public class PlayWithAnimal{
    public static void main(String... ss){
        Animal animal = new Lion();
        animal.careful();
    }

}

abstract class Animal{
    public void careful(){
        play();
    }
    
    public void play(){
        System.out.println("pet animal");
    }
}

class Lion extends Animal{
    public void careful(){
        System.out.println("Lion fuction");
        play();
    }

    public void play(){
        System.out.println("toss in meat");
    }
}
