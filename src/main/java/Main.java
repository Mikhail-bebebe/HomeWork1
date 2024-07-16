public class Main {
    public static void main(String[] args) {
        //задание 1
        byte cat = 7;
        short dog = -20000;
        int mouse = 23423454;
        long elephant = 5732482304L;
        float TV = 12.8f;
        double chair = 4372.4;
        char bar = 33;
        boolean CatAge = cat > 8;
        System.out.println(CatAge);

        //задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double WeightAllBoxers = boxer1 + boxer2;
        double boxersDifference = boxer2 - boxer1;
        System.out.println("Общий вес бойцов " + WeightAllBoxers + " кг.");
        System.out.println("Разница в весе бойцов " + boxersDifference + " кг.");

        //задание 3
        int banana = 5 * 80;
        int milk = 200 * 100 / 105;
        int iceCream = 2 * 100;
        int rawEggs = 4 * 70;
        double allProducts = banana + milk + iceCream + rawEggs;
        double allProductsInKg = allProducts / 1000;
        System.out.println("Вес всех продуктов составит " + allProducts + " г.");
        System.out.println("Вес всех продуктов в килограммах составит " + allProductsInKg + " кг.");

        //задание 4
        int loseWeight = 7000;
        int diet250 = 250;
        int diet500 = 500;
        int diet250_7 = loseWeight / diet250;
        int diet500_7 = loseWeight / diet500;
        int averageValueDiet = (diet250 + diet500) / 2;
        int averageValueDiet_7 = loseWeight / averageValueDiet;
        System.out.println(diet250_7 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(diet500_7 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(averageValueDiet_7 + " дней в среднем понадобится,чтобы добиться результата похудения. ");

        //задание 5
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        int MashaPromotion = incomeMasha * 110 / 100;
        int DenisPromotion = incomeDenis * 110 / 100;
        int KristinaPromotion = incomeKristina * 110 / 100;
        int incomeMashYear = incomeMasha * 12;
        int incomeDenisYear = incomeDenis * 12;
        int incomeKristinaYear = incomeKristina * 12;
        int MashaPromotionYear = MashaPromotion * 12;
        int DenisPromotionYear = DenisPromotion * 12;
        int KristinaPromotionYear = KristinaPromotion * 12;
        int mashaSalaryIncreaseYear = MashaPromotionYear - incomeMashYear;
        int denisSalaryIncreaseYear = DenisPromotionYear - incomeDenisYear;
        int KristinaSalaryIncreaseYear = KristinaPromotionYear - incomeKristinaYear;
        System.out.println("Маша теперь получает " + MashaPromotion + " рублей. Годовой доход вырос на " + mashaSalaryIncreaseYear + " рублей.");
        System.out.println("Денис теперь получает " + DenisPromotion + " рублей. Годовой доход вырос на " + denisSalaryIncreaseYear + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaPromotion + " рублей. Годовой доход вырос на " + KristinaSalaryIncreaseYear + " рублей.");
    }
}