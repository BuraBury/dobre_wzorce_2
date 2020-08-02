package zadanie17;

public class Main {
    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(20, ConversionType.YARDS_TO_METERS));

    }
}
