public enum AnimalClasses{
    MAMMAL(true),FISH(Boolean.FALSE),BIRD(false),REPTILE(false),AMPHIBEAN(false),INVERTEBRATE(false)
    boolean hasHair;
    public AnimalClasses(boolean hasHair){
        this.hasHair=hasHair;
    }
    public boolean hasHair(){
        return hasHair;
    }
    public void giveWig(){
        hasHair = true;
    }
}
