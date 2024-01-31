public class Main {
    public static void main(String[] args) {

        int ticket = 13676; //стоимость билета
        int expenses = 20; //каждые потраченные 20 рублей на билет
        int bonus = 1; //бонус

        int miles = ticket / expenses * bonus; //количество миль за билет

        System.out.println("Количество миль за купленный билет:" + miles);
    }
}
