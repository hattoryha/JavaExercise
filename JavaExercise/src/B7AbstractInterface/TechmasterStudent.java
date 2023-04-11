package B7AbstractInterface;

public abstract class TechmasterStudent {
    private String name;
    private String major;
    private double point;

    public TechmasterStudent(String name) {
        this.name = name;
    }

//    public void setPoint(double point) {
//        this.point = point;
//    }

    public  abstract String getMajor();

    public String resultClassification() {
        String result;
        point = getPoint();
        if (point < 5) result = "Yeu";
        else if (point >= 5 & point < 6.5) result = "TB";
        else if (point >= 6.5 & point < 7.5) result = "Kha";
        else if (point >=7.5 & point <=10) result = "Gioi";
        else result = "ket qua nhap diem bi sai";
        return result;

    }

    public abstract double getPoint();


    public String print() {
        return "thong tin hoc vien: " + "\n"+
                "ten hoc vien: " + name + "\n"+
                "chuyen nganh: " + getMajor() + "\n"+
                "diem: " + getPoint() + "\n"+
                "hoc luc: " + resultClassification();
    }
}
