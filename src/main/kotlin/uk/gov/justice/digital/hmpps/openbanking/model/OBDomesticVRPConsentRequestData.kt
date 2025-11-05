package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPControlParameters
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInitiation
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
 * @param controlParameters 
 * @param initiation 
 * @param readRefundAccount Indicates whether the `RefundAccount` object should be included in the response 
 */
data class OBDomesticVRPConsentRequestData(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ControlParameters", required = true) val controlParameters: OBDomesticVRPControlParameters,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

    @Schema(example = "null", description = "Indicates whether the `RefundAccount` object should be included in the response ")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBDomesticVRPConsentRequestData.ReadRefundAccount? = null
) {

    /**
    * Indicates whether the `RefundAccount` object should be included in the response 
    * Values: Yes,No
    */
    enum class ReadRefundAccount(val value: kotlin.String) {

        @JsonProperty("Yes") Yes("Yes"),
        @JsonProperty("No") No("No")
    }

}

