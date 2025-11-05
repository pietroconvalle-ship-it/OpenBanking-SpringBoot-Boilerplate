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
 * Set of elements to fully identify a proprietary bank transaction code.
 * @param code Proprietary bank transaction code to identify the underlying transaction.
 * @param issuer Identification of the issuer of the proprietary bank transaction code.
 */
data class ProprietaryBankTransactionCodeStructure1(

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Proprietary bank transaction code to identify the underlying transaction.")
    @get:JsonProperty("Code", required = true) val code: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Identification of the issuer of the proprietary bank transaction code.")
    @get:JsonProperty("Issuer") val issuer: kotlin.String? = null
) {

}

