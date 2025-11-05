package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1
import uk.gov.justice.digital.hmpps.openbanking.model.OBPAFundsAvailableResult1
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
 * @param fundsConfirmationId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
 * @param creationDateTime Date and time at which the resource was created.
 * @param fundsAvailableResult 
 * @param instructedAmount 
 * @param reference Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction.
 */
data class OBVRPFundsConfirmationResponseData(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
    @get:JsonProperty("FundsConfirmationId", required = true) val fundsConfirmationId: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created.")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FundsAvailableResult", required = true) val fundsAvailableResult: OBPAFundsAvailableResult1,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBActiveOrHistoricCurrencyAndAmount1,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction.")
    @get:JsonProperty("Reference") val reference: kotlin.String? = null
) {

}

