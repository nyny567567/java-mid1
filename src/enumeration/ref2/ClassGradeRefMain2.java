package enumeration.ref2;

public class ClassGradeRefMain2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        System.out.println("BASIC 등급의 할인 금액: " + discountService.discount(Grade.BASIC, price));
        System.out.println("GOLD 등급의 할인 금액: " + discountService.discount(Grade.GOLD, price));
        System.out.println("DIAMOND 등급의 할인 금액: " + discountService.discount(Grade.DIAMOND, price));
    }
}
