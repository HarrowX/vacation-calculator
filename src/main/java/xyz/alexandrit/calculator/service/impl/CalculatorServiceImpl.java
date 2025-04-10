package xyz.alexandrit.calculator.service.impl;

import org.springframework.stereotype.Service;
import xyz.alexandrit.calculator.dto.AmountVacationPayDto;
import xyz.alexandrit.calculator.service.CalculatorService;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    private static final int DAYS_IN_YEAR = 365;

    @Override
    public AmountVacationPayDto calculateVacationPay(Double annualIncome, Integer vacationDays) {
        var amount = annualIncome / DAYS_IN_YEAR * vacationDays;

        return new AmountVacationPayDto(amount);
    }
}
