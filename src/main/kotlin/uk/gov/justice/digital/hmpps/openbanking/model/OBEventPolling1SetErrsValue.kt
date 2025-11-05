package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param err A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
 * @param description A human-readable string that provides additional diagnostic information
 */
data class OBEventPolling1SetErrsValue(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes")
    @get:JsonProperty("err", required = true) val err: kotlin.String,

    @get:Size(min=1,max=256)
    @Schema(example = "null", required = true, description = "A human-readable string that provides additional diagnostic information")
    @get:JsonProperty("description", required = true) val description: kotlin.String
) {

}

