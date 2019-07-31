package cat.species;

import cat.BigCat;

/**
protected:subclasses and conde in the same package.
*/
public class Lynx extends BigCat{
    public static void main(String... dd){
        BigCat cat = new BigCat();
        System.out.println("Cat name: " + cat.name);
        System.out.println("Cat 0 hasFur " + cat.hasFur);
        System.out.println("Cat 1 hasFur " + new Lynx().hasFur);
        System.out.println("Cat hasPaws " + cat.hasPaws);
        System.out.println("Cat id " + cat.id);
        
    }
}
