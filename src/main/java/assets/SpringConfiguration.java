package assets;

import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.undertow.Undertow;

@Configuration
@EnableJpaRepositories("assets")
public class SpringConfiguration {

	@Bean
	public UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
	    UndertowEmbeddedServletContainerFactory factory = 
	      new UndertowEmbeddedServletContainerFactory();
	     
	    factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
	        @Override
	        public void customize(Undertow.Builder builder) {
	            builder.addHttpListener(8080, "0.0.0.0");
	        }
	    });
	     
	    return factory;
	}
}
