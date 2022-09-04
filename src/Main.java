public class Main {
    public static void main(String[] args) {
        int score = 100;
        int bonusScale = 100;
        int refill = 1400;
        int award;

        if (refill >= 1000){
            award = refill / bonusScale;
        } else {
            award = 0;
        }

        int totalAccount = score + refill + award;

        System.out.println("Здравствуйте! Пополнение счета на " + refill + " руб. " + "Ваш бонус составляет " + award + " руб. " + "Текущий баланс " + totalAccount + " руб.");
    }
}