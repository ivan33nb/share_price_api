package ru.yandex.ivan_vaysman.share_price_api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.CompanyShare;


public interface CompanyShareRepository extends JpaRepository<CompanyShare, String> {

    @Query("select csh from CompanyShare csh order by csh.changePercent")
    Page<CompanyShare> getTopFiveByPercentInStock(Pageable pageable);

    @Query("select csh from CompanyShare csh order by csh.latestPrice")
    Page<CompanyShare> getTopFiveMostExpensiveTradingCompany(Pageable pageable);
}
