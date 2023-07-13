package com.codeaz.rabbitmqconsumerdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private UUID id;
    private String customerName;
    private List<String> items;
    private BigDecimal totalPrice;
}
