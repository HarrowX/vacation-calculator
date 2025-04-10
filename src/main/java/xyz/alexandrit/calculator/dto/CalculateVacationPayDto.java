package xyz.alexandrit.calculator.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
public class CalculateVacationPayDto {
    @NonNull
    @Min(0) @Max(1_000_000_000)
    private Double annualIncome;
    @NonNull
    @Min(0) @Max(28)
    private Integer vocationDays;
}
