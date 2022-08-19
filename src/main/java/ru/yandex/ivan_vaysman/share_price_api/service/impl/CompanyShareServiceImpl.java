package ru.yandex.ivan_vaysman.share_price_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.yandex.ivan_vaysman.share_price_api.domain.dto.CompanyShareDTO;
import ru.yandex.ivan_vaysman.share_price_api.domain.mapper.CompanyShareMapper;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;
import ru.yandex.ivan_vaysman.share_price_api.repository.CompanyShareRepository;
import ru.yandex.ivan_vaysman.share_price_api.service.CompanyShareService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyShareServiceImpl implements CompanyShareService {

    private final CompanyShareRepository repository;
    private final CompanyShareMapper companyShareMapper = CompanyShareMapper.INSTANCE;

    @Override
    public CompanyShareDTO getBySymbol(String symbol) {
        return companyShareMapper.map(repository.findById(symbol).orElse(null));
    }

    @Override
    public List<CompanyShareDTO> getAllCompanyShare(int page, int size) {
        return companyShareMapper.mapList(repository.findAll(PageRequest.of(page, size)).getContent());
    }

    @Override
    public List<CompanyShareDTO> getTopFiveMostExpensiveTradingCompany() {
        List<CompanyShare> content = repository.getTopFiveMostExpensiveTradingCompany(PageRequest.of(0, 5)).getContent();
        return companyShareMapper.mapList(content);
    }

    @Override
    public List<CompanyShareDTO> getTopFiveGreatestChangePercentInStock() {
        List<CompanyShare> content = repository.getTopFiveByPercentInStock(PageRequest.of(0, 5)).getContent();
        return companyShareMapper.mapList(content);
    }
}
