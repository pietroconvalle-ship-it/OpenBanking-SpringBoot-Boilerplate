package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFundsConfirmationResponse1DataFundsAvailableResult
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
 * @param fundsAvailableResult 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteFundsConfirmationResponse1Data(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FundsAvailableResult") val fundsAvailableResult: OBWriteFundsConfirmationResponse1DataFundsAvailableResult? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

}

