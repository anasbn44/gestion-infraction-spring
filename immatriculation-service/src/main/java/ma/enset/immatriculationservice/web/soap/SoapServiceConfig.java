package ma.enset.immatriculationservice.web.soap;

import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SoapServiceConfig {
    private Bus bus;
    private ImmatriculationSoapService immatriculationSoapService;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, immatriculationSoapService);
        endpoint.publish("/immatriculationService");
        return endpoint;
    }
}
