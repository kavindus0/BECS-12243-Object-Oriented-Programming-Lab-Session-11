package q05;

public class Division {


    public double Division(int a, int b) {
        if (b==0){
            System.out.println("Can't Divide by 0");
            return 0;
        } else
        return (double)a / b;
    }
    public double Division(double a, double b) {
        if (b==0){
            System.out.println("Can't Divide by 0");
            return 0;
        } else
        return a / b;
    }
    public double Division(int a, double b) {
        if (b==0){
            System.out.println("Can't Divide by 0");
            return 0;
        }else
        return a / b;
    }
    public double Division(double a, int b) {
        if (b==0){
            System.out.println("Can't Divide by 0");
            return 0;
        }else
        return a / b;
    }
}
