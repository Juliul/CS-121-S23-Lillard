package Week8;

public abstract class Lutris {
    protected String seaOtter;
    protected String Origin;

    public Lutris(String seaOtter, String Origin) {
        this.seaOtter = seaOtter;
        this.Origin = Origin;
    }

    public String getseaOtter() {return seaOtter;}
    public void setseaOtter(String seaOtter) {
        this.seaOtter = seaOtter;
    }

    public String getOrigin() {
        return Origin;
    }
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String toString(){
        return String.format("Sea Otter: %s\nOrigin: %s", seaOtter, Origin);
    }

    public abstract String Facts();

}
