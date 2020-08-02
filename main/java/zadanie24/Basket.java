package zadanie24;

public class Basket {

    int stan = 0;
    private final int MAX_CAPACITY = 10;

    public Basket() {
    }

    void addToBasket() throws BasketFullException {
        setStan(stan += 1);
        if (this.stan == MAX_CAPACITY) {
            throw new BasketFullException();
        }
    }

    void removeFromBasket() throws EmptyBasketException {
        setStan(stan -= 1);
        if (this.stan == 0) {
            throw new EmptyBasketException();
        }

    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public int getStan() {
        return stan;
    }
}
