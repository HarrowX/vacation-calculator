package xyz.alexandrit.calculator.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.alexandrit.calculator.dto.AmountVacationPayDto;
import xyz.alexandrit.calculator.dto.CalculateVacationPayDto;
import xyz.alexandrit.calculator.service.CalculatorService;

@RestController
@RequestMapping("/")
@ResponseBody
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Operation(summary = "Рассчитать количество отпускных", description = "Возвращает объект хранящий количество отпускных")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Успешно рассчитано"),
            @ApiResponse(responseCode = "400", description = "Тело запроса не прошло валидацию")
    })
    @GetMapping("calculate")
    public ResponseEntity<AmountVacationPayDto> getAmountOfVacationPay(@Validated @RequestBody CalculateVacationPayDto dto) {
        return ResponseEntity.ok(calculatorService.calculateVacationPay(dto.getAnnualIncome(), dto.getVocationDays()));
    }
}
