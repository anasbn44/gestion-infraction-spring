package ma.radarservice.feign;

import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:1998", value = "infraction-rest-client")
public interface InfractionRestClient {
    @PostMapping("/infractions")
    Infraction saveInfraction(@RequestBody InfractionRequest infraction);
}
