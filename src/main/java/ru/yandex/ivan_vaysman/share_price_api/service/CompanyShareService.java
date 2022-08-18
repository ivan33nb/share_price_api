package ru.yandex.ivan_vaysman.share_price_api.service;

import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;

import java.util.List;

public interface CompanyShareService {
    CompanyShare getBySymbol(String symbol);
    List<CompanyShare> getAllCompanyShare();
    List<CompanyShare> getTopFiveMostExpensiveTradingCompany();
    List<CompanyShare> getTopFiveGreatestChangePercentInStock();
}
