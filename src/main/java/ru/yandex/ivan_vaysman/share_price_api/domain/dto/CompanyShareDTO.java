package ru.yandex.ivan_vaysman.share_price_api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyShareDTO {

    private Long avgTotalVolume;
    private String calculationPrice;
    private BigDecimal change;
    private BigDecimal changePercent;
    private Long close;
    private String closeSource;
    private Date closeTime;
    private String companyName;
    private String currency;
    private BigDecimal delayedPrice;
    private Date delayedPriceTime;
    private BigDecimal extendedChange;
    private BigDecimal extendedChangePercent;
    private BigDecimal extendedPrice;
    private String highSource;
    private Date highTime;
    private BigDecimal iexAskPrice;
    private Long iexAskSize;
    private BigDecimal iexBidPrice;
    private Long iexBidSize;
    private BigDecimal iexClose;
    private Date iexCloseTime;
    private Date iexLastUpdated;
    private BigDecimal iexMarketPercent;
    private BigDecimal iexOpen;
    private Date iexOpenTime;
    private BigDecimal iexRealtimePrice;
    private Long iexRealtimeSize;
    private Long iexVolume;
    private Date lastTradeTime;
    private BigDecimal latestPrice;
    private String latestSource;
    private String latestTime;
    private Date latestUpdate;
    private Long latestVolume;
    private Long low;
    private String lowSource;
    private Date lowTime;
    private Long marketCap;
    private BigDecimal oddLotDelayedPrice;
    private Date oddLotDelayedPriceTime;
    private Long open;
    private Date openTime;
    private String openSource;
    private BigDecimal peRatio;
    private BigDecimal previousClose;
    private Long previousVolume;
    private String primaryExchange;
    private String symbol;
    private Long volume;
    private BigDecimal week52High;
    private BigDecimal week52Low;
    private BigDecimal ytdChange;
    private Boolean isUSMarketOpen;
}
