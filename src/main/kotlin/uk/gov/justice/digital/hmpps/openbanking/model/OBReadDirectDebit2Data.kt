package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDirectDebit2DataDirectDebitInner
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
 * @param directDebit 
 */
data class OBReadDirectDebit2Data(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DirectDebit") val directDebit: kotlin.collections.List<OBReadDirectDebit2DataDirectDebitInner>? = null
) {

}

