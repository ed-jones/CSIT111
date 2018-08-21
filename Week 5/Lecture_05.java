import java.util.*;

public class Lecture_05 {
    
    public static void main(String[] args) {
        Lecture_05 p = new Lecture_05();
        p.run();
    }

    public void run() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kim");
        names.add("Sue");
        names.add("Joe");
        names.add("Jan");
        names.add("Jim");

        //String name;
        //name = names.get(2);
        //System.out.println(name);
        names.set(1, "SueX");

        //* Foreach string s in names
        for (String s : names) {
            System.out.println(s);
        }
    }

    public void applyDeduction(TaxRecord rec, double deduction) {
        rec.income = rec.income = deduction*0.5;    
    }

    public void printTaxReturn(TaxRecord rec) {
        double tax = calcTax(rec.income);
        String msg = "Tax for " + rec.name + " is " + tax;
        System.out.println(msg);
    }

    public double calcTax(double income) {
        return income*0.3;
    }

    public void printTaxRecord(TaxRecord rec) {
        System.out.print("Name: ");
        System.out.println(rec.name);
        System.out.print("Income: ");
        System.out.println(rec.income);

        rec.income = rec.income + 1000;
    }
}