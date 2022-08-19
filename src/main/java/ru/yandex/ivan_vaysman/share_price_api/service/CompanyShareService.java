package ru.yandex.ivan_vaysman.share_price_api.service;

import ru.yandex.ivan_vaysman.share_price_api.domain.dto.CompanyShareDTO;

import java.util.List;

public interface CompanyShareService {
    CompanyShareDTO getBySymbol(String symbol);
    List<CompanyShareDTO> getAllCompanyShare(int page, int size);
    List<CompanyShareDTO> getTopFiveMostExpensiveTradingCompany();
    List<CompanyShareDTO> getTopFiveGreatestChangePercentInStock();
}
