package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
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
  @get:JsonProperty("SubCode", required = true) val subCode: kotlin.String,
)
