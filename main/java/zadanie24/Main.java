package zadanie24;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(basket.getStan());
        }

        try {
            basket.removeFromBasket();
        } catch (EmptyBasketException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(basket.getStan());
        }

    }
}
