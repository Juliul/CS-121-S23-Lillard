package Week8;

public class Northern extends Lutris {
    protected String Mandibles;

    public Northern(String seaOtter, String Origin, String Mandibles){
        super(seaOtter,Origin);
        this.Mandibles = Mandibles;

    }

    public String getMandibles(){return Mandibles;}
    public void setMandibles(String Mandibles){this.Mandibles = Mandibles;}

    @Override
    public String toString(){
        return String.format("Sea Otter Subspecies: %s\nOrigin: %s\nCool Trait: %s", seaOtter, Origin, Mandibles);
    }
    public String Facts()
    {
        return String.format("Sea Otter Subspecies: %s\nOrigin: %s\nCool Trait: %s", seaOtter, Origin, Mandibles);
    }
}
