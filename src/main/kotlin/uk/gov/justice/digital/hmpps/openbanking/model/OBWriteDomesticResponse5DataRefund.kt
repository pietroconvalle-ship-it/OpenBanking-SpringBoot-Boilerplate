package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5DataRefundAccount

/**
 * Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.
 * @param account
 */
data class OBWriteDomesticResponse5DataRefund(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Account", required = true) val account: OBWriteDomesticResponse5DataRefundAccount,
)
