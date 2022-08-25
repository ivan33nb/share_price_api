package ru.yandex.ivan_vaysman.share_price_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.yandex.ivan_vaysman.share_price_api.domain.dto.CompanyShareDTO;
import ru.yandex.ivan_vaysman.share_price_api.service.CompanyShareService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/companies")
@RestController
public class CompanyShareController {

    private final CompanyShareService companyShareService;

    @GetMapping()
    public List<CompanyShareDTO> getAll(@RequestParam(defaultValue = "0", required = false) int page,
                                        @RequestParam(defaultValue = "50", required = false) int size){
        return companyShareService.getAllCompanyShare(page, size);
    }

    @GetMapping("/{symbol}")
    public CompanyShareDTO findBySymbol(@PathVariable String symbol){
        return companyShareService.getBySymbol(symbol);
    }

    @GetMapping("/process/fiveMostExpensiveTradingCompany")
    public List<CompanyShareDTO> getFiveMostExpensiveTradingCompany(){
        return companyShareService.getTopFiveMostExpensiveTradingCompany();
    }

    @GetMapping("/process/topFiveGreatestChangePercentInStock")
    public List<CompanyShareDTO> getTopFiveGreatestChangePercentInStock(){
        return companyShareService.getTopFiveGreatestChangePercentInStock();
    }
}
