package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBBalanceType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode2
import uk.gov.justice.digital.hmpps.openbanking.model.OBTransactionCashBalanceAmount

/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 * @param creditDebitIndicator
 * @param type
 * @param amount
 */
data class OBTransactionCashBalance(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode2,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Type", required = true) val type: OBBalanceType1Code,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBTransactionCashBalanceAmount,
)
