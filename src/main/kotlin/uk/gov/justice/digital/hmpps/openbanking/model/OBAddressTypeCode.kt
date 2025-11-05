package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
enum class OBAddressTypeCode(@get:JsonValue val value: kotlin.String) {

    Business("Business"),
    Correspondence("Correspondence"),
    DeliveryTo("DeliveryTo"),
    MailTo("MailTo"),
    POBox("POBox"),
    Postal("Postal"),
    Residential("Residential"),
    Statement("Statement");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBAddressTypeCode {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBAddressTypeCode'")
        }
    }
}

