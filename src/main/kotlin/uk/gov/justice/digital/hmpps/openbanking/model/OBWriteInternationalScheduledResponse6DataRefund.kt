package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5DataRefundAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5DataRefundAgent
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5DataRefundCreditor

/**
 *
 * @param account
 * @param creditor
 * @param agent
 */
data class OBWriteInternationalScheduledResponse6DataRefund(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Account", required = true) val account: OBWriteDomesticResponse5DataRefundAccount,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Creditor") val creditor: OBWriteInternationalResponse5DataRefundCreditor? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Agent") val agent: OBWriteInternationalResponse5DataRefundAgent? = null,
)
