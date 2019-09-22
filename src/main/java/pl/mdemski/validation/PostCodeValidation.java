package pl.mdemski.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostCodeValidation implements ConstraintValidator<PostCode, String> {
    public void initialize(PostCode constraint) {
    }

    public boolean isValid(String postCode, ConstraintValidatorContext context) {
        if (postCode == null) return true;
        String regexForPostCode = "\\d{2}-\\d{3}";
        Pattern compiledPattern = Pattern.compile(regexForPostCode);
        Matcher matcher = compiledPattern.matcher(postCode);
        return matcher.find();
    }
}
