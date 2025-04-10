package xyz.alexandrit.calculator.service;

import xyz.alexandrit.calculator.dto.AmountVacationPayDto;


public interface CalculatorService {
    AmountVacationPayDto calculateVacationPay(Double annualIncome, Integer vacationDays);
}
