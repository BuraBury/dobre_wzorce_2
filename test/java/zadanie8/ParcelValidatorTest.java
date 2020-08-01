package zadanie8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParcelValidatorTest {
    private Validator validator;

    @BeforeEach
    void beforeAll() {
        validator = new ParcelValidator();
    }

    @Test
    void notValidWhenSumOfLengthISToHigh() {
        Parcel parcel = new Parcel(290, 10, 10, 1, false);
        Assertions.assertFalse(validator.validate(parcel));

    }

    @Test
    void notValidIfAnyDimensionTooHigh() {
        List<Parcel> parcels = Arrays.asList(
                new Parcel(31, 1, 1, 1, false),
                new Parcel(40, 1, 1, 1, false),
                new Parcel(50, 1, 1, 1, true),
                new Parcel(100, 1, 1, 1, false)
        );

        for (Parcel parcel : parcels) {
            Assertions.assertFalse(validator.validate(parcel));
        }
    }

    @Test
    void notValidWhenTooHeavyForBeingExpress() {
        Parcel parcel = new Parcel(10, 10, 10, 34, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

}