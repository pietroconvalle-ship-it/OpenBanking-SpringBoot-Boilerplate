package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBAccount6
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
 * @param account 
 */
data class OBReadAccount6Data(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Account") val account: kotlin.collections.List<OBAccount6>? = null
) {

}

