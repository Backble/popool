package kr.co.popool.gateway.filters;


import kr.co.popool.gateway.config.dto.FilterConfigDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GlobalFilter extends AbstractGatewayFilterFactory<FilterConfigDto> {

    public GlobalFilter(){
        super(FilterConfigDto.class);
    }

    @Override
    public GatewayFilter apply(final FilterConfigDto configDto) {
        return (exchange,chain) ->{
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("GlobalFilter baseMessage: {}", configDto.getBaseMessage());
            if(configDto.isPreLogger()) {
                log.info("GlobalFilter Start: {}", request.getId());
            }

            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                if(configDto.isPostLogger()) {
                    log.info("GlobalFilter End:{}", response.getStatusCode());
                }
            }));
        };
    }
}