package kr.co.popool.infra.config;

import kr.co.popool.domain.shared.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@Configuration
public class JpaAuditConfig {

    @Bean
    public AuditorAware<String> defaultAuditorAware() {
        return new AuditorAwareImpl();
    }
}
