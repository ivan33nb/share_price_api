package ru.yandex.ivan_vaysman.share_price_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;
import ru.yandex.ivan_vaysman.share_price_api.repository.CompanyShareRepository;
import ru.yandex.ivan_vaysman.share_price_api.service.CompanyShareService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyShareServiceImpl implements CompanyShareService {

    private final CompanyShareRepository repository;

    @Override
    public CompanyShare getBySymbol(String symbol) {
        return repository.findById(symbol).orElse(null);
    }

    @Override
    public List<CompanyShare> getAllCompanyShare() {
        return repository.findAll();
    }

    @Override
    public List<CompanyShare> getTopFiveMostExpensiveTradingCompany() {
        return repository.getTopFiveMostExpensiveTradingCompany(PageRequest.of(0, 5)).getContent();
    }

    @Override
    public List<CompanyShare> getTopFiveGreatestChangePercentInStock() {
        return repository.getTopFiveByPercentInStock(PageRequest.of(0, 5)).getContent();
    }
}
