package zadanie17;

public class MeasurementConverter {

    double convert(double value, ConversionType conversionType) {

        switch (conversionType) {
            case METERS_TO_YARDS: {
                return value * 1.0936;
            }
            case YARDS_TO_METERS: {
                return value / 1.0936;
            }
            case KILOMETERS_TO_MILES: {
                return value * 0.62137;
            }
            case MILES_TO_KILOMETERS: {

                return value / 0.62137;
            }
            case CENTIMETERS_TO_INCHES: {
                return value * 0.393700787;
            }
            case INCHES_TO_CENTIMETERS: {
                return value / 0.393700787;
            }
            default:
                return 0.0;
        }
    }



}
