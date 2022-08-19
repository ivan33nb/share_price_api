package ru.yandex.ivan_vaysman.share_price_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.yandex.ivan_vaysman.share_price_api.domain.dto.CompanyShareDTO;
import ru.yandex.ivan_vaysman.share_price_api.service.CompanyShareService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/companyShare")
@RestController
public class CompanyShareController {

    private final CompanyShareService companyShareService;

    @GetMapping("/all")
    public List<CompanyShareDTO> getAll(@RequestParam int page, @RequestParam int size){
        return companyShareService.getAllCompanyShare(page, size);
    }

    @GetMapping("/{symbol}")
    public CompanyShareDTO findBySymbol(@PathVariable String symbol){
        return companyShareService.getBySymbol(symbol);
    }

    @GetMapping("/fiveMostExpensiveTradingCompany")
    public List<CompanyShareDTO> getFiveMostExpensiveTradingCompany(){
        return companyShareService.getTopFiveMostExpensiveTradingCompany();
    }

    @GetMapping("/topFiveGreatestChangePercentInStock")
    public List<CompanyShareDTO> getTopFiveGreatestChangePercentInStock(){
        return companyShareService.getTopFiveGreatestChangePercentInStock();
    }
}
