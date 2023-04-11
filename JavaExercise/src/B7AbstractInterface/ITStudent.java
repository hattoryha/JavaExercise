package B7AbstractInterface;

public class ITStudent extends TechmasterStudent{


    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;

    public ITStudent(String name) {
        super(name);
    }

    public void setJavaPoint(double javaPoint) {
        this.javaPoint = javaPoint;
    }

    public void setHtmlPoint(double htmlPoint) {
        this.htmlPoint = htmlPoint;
    }

    public void setCssPoint(double cssPoint) {
        this.cssPoint = cssPoint;
    }
    @Override
    public String getMajor() {
        return "IT";
    }
    @Override
    public double getPoint() {
        return (2*javaPoint+htmlPoint+cssPoint)/4;
    }
}
