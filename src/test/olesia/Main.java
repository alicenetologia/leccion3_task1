package test.olesia;

public class Main {

    public static void main(String[] args) {
        int bonusPerMile = 2000;
        int ticketPrice = 5000_00;
        int mileCount = ticketPrice / bonusPerMile;
        System.out.println("your bonus: " + mileCount);
    }
}
