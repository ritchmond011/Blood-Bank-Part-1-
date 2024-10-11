import java.util.Scanner;

class BloodData {
    static String bloodType = "O";
    static String rhFactor = "+";

    public BloodData() {
    }

    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter blood type of patient: ");
        String bt = input.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = input.nextLine();

        if (bt.isEmpty() || rh.isEmpty()) {
            BloodData bd = new BloodData();
            bd.display();
        } else {
            BloodData bd = new BloodData(bt, rh);
            bd.display();
        }
    }
    
}