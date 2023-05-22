package ma.radarservice.feign;

import ma.radarservice.entities.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionRestClient {
    @PostMapping("/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);
}
