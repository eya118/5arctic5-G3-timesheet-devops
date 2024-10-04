package tn.esprit.spring.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {


    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("TimeSheetDevops-Demo")
                .description("peojet equipe devops ")
                .contact(contactAPI());
    }
    public Contact contactAPI() {
        Contact contact = new Contact().name("Equipe ASI II")
                .email("eya.filali@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
        return contact;
    }


    @Bean
    public GroupedOpenApi UserApi() {
        return GroupedOpenApi.builder()
                .group("Only user Management API")
                .pathsToMatch("/**")
                .pathsToExclude("**")
                .build();
    }

}
