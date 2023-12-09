package tech.buildrun.agregadorinvestimentos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import tech.buildrun.agregadorinvestimentos.client.dto.BrapiResponseDto;

@FeignClient(
        name = "BrapiClient",
        url = "https://brapi.dev"
)
public interface BrapiClient {

    @GetMapping(value = "/api/quote/{stockId}")
    BrapiResponseDto getQuote(@RequestParam("token") String token,
                              @PathVariable("stockId") String stockId);
}
