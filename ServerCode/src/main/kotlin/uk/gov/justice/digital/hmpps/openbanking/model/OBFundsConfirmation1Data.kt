package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmation1DataInstructedAmount
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
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
 * @param reference Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
 * @param instructedAmount 
 */
data class OBFundsConfirmation1Data(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
    @get:JsonProperty("Reference", required = true) val reference: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBFundsConfirmation1DataInstructedAmount
) {

}

