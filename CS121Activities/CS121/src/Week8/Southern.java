package Week8;

public class Southern extends Lutris {
    protected String Rostrum;

    public Southern(String seaOtter, String Origin, String Rostrum){
        super(seaOtter,Origin);
        this.Rostrum = Rostrum;

    }

    public String getRostrum(){return Rostrum;}
    public void setRostrum(String Rostrum){this.Rostrum = Rostrum;}

    @Override
    public String toString(){
        return String.format("Sea Otter Subspecies: %s\nOrigin: %s\nCool Trait: %s", seaOtter, Origin, Rostrum);
    }
    public String Facts()
    {
        return String.format("Sea Otter Subspecies: %s\nOrigin: %s\nCool Trait: %s", seaOtter, Origin, Rostrum);
    }
}
