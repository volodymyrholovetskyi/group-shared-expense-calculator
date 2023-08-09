package com.vholovetskyi.event.web.dto;

public record ResponseEventDto(
        Long id,
        String name,
        String description,
        String currencyCode,
        String status
//        Set<ResponseExpensesDto> expenses
) {

}
