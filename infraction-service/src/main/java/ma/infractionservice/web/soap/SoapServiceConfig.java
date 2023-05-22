package ma.infractionservice.web.soap;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private InfractionSoapService infractionSoapService;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, infractionSoapService);
        endpoint.publish("/infractionService");
        return endpoint;
    }
}
