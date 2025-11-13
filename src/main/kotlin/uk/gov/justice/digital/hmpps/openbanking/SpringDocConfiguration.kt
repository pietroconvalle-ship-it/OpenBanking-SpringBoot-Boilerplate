package uk.gov.justice.digital.hmpps.openbanking

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringDocConfiguration {

  @Bean
  fun apiInfo(): OpenAPI = OpenAPI()
    .info(
      Info()
        .title("Account and Transaction API Specification")
        .description("Swagger for Account and Transaction API Specification")
        .termsOfService("https://www.openbanking.org.uk/terms")
        .contact(
          Contact()
            .name("Service Desk")
            .email("ServiceDesk@openbanking.org.uk"),
        )
        .license(
          License()
            .name("open-licence")
            .url("https://www.openbanking.org.uk/open-licence"),
        )
        .version("4.0.0"),
    )
    .components(
      Components()
        .addSecuritySchemes(
          "TPPOAuth2Security",
          SecurityScheme()
            .type(SecurityScheme.Type.OAUTH2),
        )
        .addSecuritySchemes(
          "PSUOAuth2Security",
          SecurityScheme()
            .type(SecurityScheme.Type.OAUTH2),
        ),
    )
}
