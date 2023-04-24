package Week8;
public class Japanese implements printInfo {
    protected String profName;
    protected String courseName;
    protected  int dif;
    public Japanese(String profName, String courseName, int dif) {
        this.profName = profName;
        this.courseName = courseName;
        this.dif = dif;
    }

    public String getprofName() {
        return profName;
    }
    public void setprofName(String fName) {this.profName = profName;}

    public String getcourseName() {
        return courseName;
    }
    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getdif() {
        return dif;
    }
    public void setdif(int dif) {
        this.dif = dif;
    }
    @Override
    public String printClass(){
        return (profName);
    }
}
