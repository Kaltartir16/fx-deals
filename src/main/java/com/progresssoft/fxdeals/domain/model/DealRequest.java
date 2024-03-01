package com.progresssoft.fxdeals.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class DealRequest {

    private String Id;

    private String fromCurrencyIsoCode;

    private String toCurrencyIsoCode;

    private LocalDateTime dealTimestamp;
    private BigDecimal dealAmount;
}
