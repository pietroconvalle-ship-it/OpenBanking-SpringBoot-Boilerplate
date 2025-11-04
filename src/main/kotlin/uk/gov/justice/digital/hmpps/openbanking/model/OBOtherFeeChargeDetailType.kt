package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeCategory1Code
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
 * Other Fee/charge type which is not available in the standard code set
 * @param feeCategory 
 * @param name Long name associated with the code
 * @param description Description to describe the purpose of the code
 * @param code The four letter Mnemonic used within an XML file to identify a code
 */
data class OBOtherFeeChargeDetailType(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeCategory", required = true) val feeCategory: OBFeeCategory1Code,

    @get:Size(min=1,max=70)
    @Schema(example = "null", required = true, description = "Long name associated with the code")
    @get:JsonProperty("Name", required = true) val name: kotlin.String,

    @get:Size(min=1,max=350)
    @Schema(example = "null", required = true, description = "Description to describe the purpose of the code")
    @get:JsonProperty("Description", required = true) val description: kotlin.String,

    @get:Pattern(regexp="^\\\\w{0,4}$")
    @Schema(example = "null", description = "The four letter Mnemonic used within an XML file to identify a code")
    @get:JsonProperty("Code") val code: kotlin.String? = null
) {

}

