package cat;

public class BigCat{
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;
    
    public static void main(String... dd){
        BigCat cat = new BigCat();
        System.out.println("Cat name: " + cat.name);
        System.out.println("Cat hasFur " + cat.hasFur);
        System.out.println("Cat hasPaws " + cat.hasPaws);
        System.out.println("Cat id " + cat.id);
        
    }
}
