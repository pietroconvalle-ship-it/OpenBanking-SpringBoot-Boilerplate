package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode0
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementAmountInnerAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementAmountInnerLocalAmount

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 * @param creditDebitIndicator
 * @param type Amount type, in a coded form.
 * @param amount
 * @param localAmount
 */
data class OBStatement2StatementAmountInner(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode0,

  @Schema(example = "UK.OBIE.CreditLimit", required = true, description = "Amount type, in a coded form.")
  @get:JsonProperty("Type", required = true) val type: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBStatement2StatementAmountInnerAmount,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("LocalAmount") val localAmount: OBStatement2StatementAmountInnerLocalAmount? = null,
)
