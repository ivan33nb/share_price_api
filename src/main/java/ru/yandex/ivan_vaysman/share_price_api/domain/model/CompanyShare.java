package ru.yandex.ivan_vaysman.share_price_api.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "company_share")
@Entity
public class CompanyShare {
    @Id
    @Column(name = "symbol")
    private String symbol;

    @Column(name = "avg_total_volume")
    private Long avgTotalVolume;

    @Column(name = "calculation_price")
    private String calculationPrice;

    @Column(name = "changee")
    private BigDecimal change;

    @Column(name = "change_percent")
    private BigDecimal changePercent;

    @Column(name = "close")
    private Long close;

    @Column(name = "close_source")
    private String closeSource;

    @Column(name = "close_time")
    private Date closeTime;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "currency")
    private String currency;

    @Column(name = "delayed_price")
    private BigDecimal delayedPrice;

    @Column(name = "delayed_price_time")
    private Date delayedPriceTime;

    @Column(name = "extended_change")
    private BigDecimal extendedChange;

    @Column(name = "extended_change_percent")
    private BigDecimal extendedChangePercent;

    @Column(name = "extended_price")
    private BigDecimal extendedPrice;

    @Column(name = "high_source")
    private String highSource;

    @Column(name = "high_time")
    private Date highTime;

    @Column(name = "iex_ask_price")
    private BigDecimal iexAskPrice;

    @Column(name = "iex_ask_size")
    private Long iexAskSize;

    @Column(name = "iex_bid_price")
    private BigDecimal iexBidPrice;

    @Column(name = "iex_bid_size")
    private Long iexBidSize;

    @Column(name = "iex_close")
    private BigDecimal iexClose;

    @Column(name = "iex_close_time")
    private Date iexCloseTime;

    @Column(name = "iex_last_updated")
    private Date iexLastUpdated;

    @Column(name = "iex_market_percent")
    private BigDecimal iexMarketPercent;

    @Column(name = "iex_open")
    private BigDecimal iexOpen;

    @Column(name = "iex_open_time")
    private Date iexOpenTime;

    @Column(name = "iex_realtime_price")
    private BigDecimal iexRealtimePrice;

    @Column(name = "iex_realtime_size")
    private Long iexRealtimeSize;

    @Column(name = "iex_volume")
    private Long iexVolume;

    @Column(name = "last_trade_time")
    private Date lastTradeTime;

    @Column(name = "latest_price")
    private BigDecimal latestPrice;

    @Column(name = "latest_source")
    private String latestSource;

    @Column(name = "latest_time")
    private String latestTime;

    @Column(name = "latest_update")
    private Date latestUpdate;

    @Column(name = "latest_volume")
    private Long latestVolume;

    @Column(name = "low")
    private Long low;

    @Column(name = "low_source")
    private String lowSource;

    @Column(name = "low_time")
    private Date lowTime;

    @Column(name = "market_cap")
    private Long marketCap;

    @Column(name = "odd_lot_delayed_price")
    private BigDecimal oddLotDelayedPrice;

    @Column(name = "odd_lot_delayed_price_time")
    private Date oddLotDelayedPriceTime;

    @Column(name = "open")
    private Long open;

    @Column(name = "open_time")
    private Date openTime;

    @Column(name = "open_source")
    private String openSource;

    @Column(name = "pe_ratio")
    private BigDecimal peRatio;

    @Column(name = "previous_close")
    private BigDecimal previousClose;

    @Column(name = "previous_volume")
    private Long previousVolume;

    @Column(name = "primary_exchange")
    private String primaryExchange;

    @Column(name = "volume")
    private Long volume;

    @Column(name = "week52High")
    private BigDecimal week52High;

    @Column(name = "week52Low")
    private BigDecimal week52Low;

    @Column(name = "ytd_change")
    private BigDecimal ytdChange;

    @Column(name = "isusmarket_open")
    private Boolean isUSMarketOpen;

}
