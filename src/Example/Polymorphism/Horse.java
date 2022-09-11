package Example.Polymorphism;

public class Horse extends Animal{
    Horse(String name){
        super(name, "At sesi");
        super.setInfoText("At");
    }

    Horse(String name, String info){
        super(name, "At Sesi", info);
    }

    @Override
    public String animalInfo(){
        return super.animalInfo() + "\n-----------------";
    }

}
