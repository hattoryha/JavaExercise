package B7AbstractInterface;

public class BizStudent extends TechmasterStudent{

    private double marketingPoint;
    private double salesPoint;

    public BizStudent(String name) {
        super(name);
    }



    public void setMarketingPoint(double marketingPoint) {
        this.marketingPoint = marketingPoint;
    }

    public void setSalesPoint(double salesPoint) {
        this.salesPoint = salesPoint;
    }
    @Override
    public String getMajor() {
        return "Biz";
    }
    @Override
    public double getPoint() {
        return (2*marketingPoint+salesPoint)/3;
    }
}
