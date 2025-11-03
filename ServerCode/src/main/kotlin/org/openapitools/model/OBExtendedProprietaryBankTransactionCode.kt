package org.openapitools.model

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
 * Additional proprietary bank transaction codes used by the ASPSP for the underlying transaction
 * @param code Proprietary bank transaction code to identify the underlying transaction.
 * @param issuer Identification of the issuer of the proprietary bank transaction code.
 * @param description Description of the code and its usage on the ASPSP channel
 */
data class OBExtendedProprietaryBankTransactionCode(

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Proprietary bank transaction code to identify the underlying transaction.")
    @get:JsonProperty("Code", required = true) val code: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Identification of the issuer of the proprietary bank transaction code.")
    @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "null", description = "Description of the code and its usage on the ASPSP channel")
    @get:JsonProperty("Description") val description: kotlin.String? = null
) {

}

