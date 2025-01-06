package q05;

public class Calculator {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Division div = new Division();
        System.out.println(add.Addition(5, 7));
        System.out.println(add.Addition(5.0, 7));
        System.out.println(add.Addition(5, 7.0));
        System.out.println(add.Addition(5.0, 7.0));
        System.out.println(sub.Subtraction(95,15.5));
        System.out.println(div.Division(5,0));
        System.out.println(div.Division(15,0.5));
        System.out.println(div.Division(15,5));

    }
}
