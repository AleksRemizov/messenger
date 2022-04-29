package com.remizov.messenger.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomTwilioPhoneNumberValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomTwilioPhoneNumberConstraint {

    String message() default "{phoneNumber.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
