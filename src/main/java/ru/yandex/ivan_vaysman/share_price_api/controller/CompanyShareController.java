package ru.yandex.ivan_vaysman.share_price_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;
import ru.yandex.ivan_vaysman.share_price_api.service.CompanyShareService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/companyShare")
@RestController
public class CompanyShareController {

    private final CompanyShareService companyShareService;

    @GetMapping("/all")
    public List<CompanyShare> getAll(){
        return companyShareService.getAllCompanyShare();
    }

    @GetMapping("/{symbol}")
    public CompanyShare findBySymbol(@PathVariable String symbol){
        return companyShareService.getBySymbol(symbol);
    }

    @GetMapping("/fiveMostExpensiveTradingCompany")
    public List<CompanyShare> getFiveMostExpensiveTradingCompany(){
        return companyShareService.getTopFiveMostExpensiveTradingCompany();
    }

    @GetMapping("/topFiveGreatestChangePercentInStock")
    public List<CompanyShare> getTopFiveGreatestChangePercentInStock(){
        return companyShareService.getTopFiveGreatestChangePercentInStock();
    }
}
