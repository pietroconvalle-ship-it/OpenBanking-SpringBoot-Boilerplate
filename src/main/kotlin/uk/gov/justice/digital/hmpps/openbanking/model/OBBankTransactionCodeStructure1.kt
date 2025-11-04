package uk.gov.justice.digital.hmpps.openbanking.model

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
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 * @param code Specifies the family within a domain.
 * @param subCode Specifies the sub-product family within a specific family.
 */
data class OBBankTransactionCodeStructure1(

    @Schema(example = "null", required = true, description = "Specifies the family within a domain.")
    @get:JsonProperty("Code", required = true) val code: kotlin.String,

    @Schema(example = "null", required = true, description = "Specifies the sub-product family within a specific family.")
    @get:JsonProperty("SubCode", required = true) val subCode: kotlin.String
) {

}

