package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Identifies the nature of the postal address.
* Values: Business,Correspondence,DeliveryTo,MailTo,POBox,Postal,Residential,Statement
*/
enum class OBAddressTypeCode(val value: kotlin.String) {

    @JsonProperty("Business") Business("Business"),
    @JsonProperty("Correspondence") Correspondence("Correspondence"),
    @JsonProperty("DeliveryTo") DeliveryTo("DeliveryTo"),
    @JsonProperty("MailTo") MailTo("MailTo"),
    @JsonProperty("POBox") POBox("POBox"),
    @JsonProperty("Postal") Postal("Postal"),
    @JsonProperty("Residential") Residential("Residential"),
    @JsonProperty("Statement") Statement("Statement")
}

