package pl.mdemski.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PostCodeValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PostCode {
    String message() default "{pl.mdemski.validation.PostCode.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
