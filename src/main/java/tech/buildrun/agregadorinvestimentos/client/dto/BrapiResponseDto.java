package tech.buildrun.agregadorinvestimentos.client.dto;

import java.util.List;

public record BrapiResponseDto(List<StockDto> results) {
}
