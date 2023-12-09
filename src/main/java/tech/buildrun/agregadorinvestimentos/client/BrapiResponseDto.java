package tech.buildrun.agregadorinvestimentos.client;

import java.util.List;

public record BrapiResponseDto(List<StockDto> results) {
}
