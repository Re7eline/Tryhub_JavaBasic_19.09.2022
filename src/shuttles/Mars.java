package shuttles;

public class Mars {
    public static void main(String[] args) {

        int counter = 0;
        int value = 0;
        while (counter < 100) {
            String unlucky = String.valueOf(++value);
            if ((unlucky.contains("4") || unlucky.contains("9"))) continue;
            counter++;
            System.out.println(value);
        }
        System.out.println("Shuttles numbered: " + counter);
    }

}
