
public class Lecture_03 {

    public static void main(String[] args) {
        Lecture_03 myProg = new Lecture_03();
        myProg.run();
    }

    public void run(){
        int val = 10;
        val = increment(increment(increment(val)));
        System.out.println(val);
    }

    public int increment (int a){
        a = a + 1;
        return a;
    }

    public void run2(){
        double r = average(10, 15);
        System.out.println(r);
    }

    public double average(double a, double b){
        return (a + b)/2;
    }

    public void run1(){
        double income1 = 35000;
        double income2 = 47000;
        double income3 = 25000;
        double income4 = 110000;
        double income5 = 70000;

        System.out.println("Income " + income1 + " Tax: " + calcTax(income1));
        System.out.println("Income " + income2 + " Tax: " + calcTax(income2, 0.0));
        System.out.println("Income " + income3 + " Tax: " + calcTax(income3));
        System.out.println("Income " + income4 + " Tax: " + calcTax(income4));
        System.out.println("Income " + income5 + " Tax: " + calcTax(income5));
    }

    public double calcTax(double income){
        return (income - 20000)*32.5;
    }

    public double calcTax(double income, double rate){
        return (income - 20000)*rate;
    }

}