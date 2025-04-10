package xyz.alexandrit.calculator.dto;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Min;

@Data
public class AmountVacationPayDto {
    @NonNull
    @Min(0)
    private Double amount;
}
