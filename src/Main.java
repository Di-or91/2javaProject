public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5000; // стоимость билета
        int oneMile = 20; // кол-во рублей для одной мили
        int bonusMiles = ticketPrice / oneMile; // кол-во бонусных миль

        System.out.println("Начислено " + bonusMiles + " бонусных миль");

    }

}
