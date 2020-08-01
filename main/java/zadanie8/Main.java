package zadanie8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(3, 4, 5, 4, false);
        ParcelValidator parcelValidator = new ParcelValidator();
        parcelValidator.validate(parcel);
    }
}
