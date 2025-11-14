package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformationStructured

/**
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system
 * @param structured
 * @param unstructured Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
 */
data class OBRemittanceInformation2(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Structured") val structured: kotlin.collections.List<OBRemittanceInformationStructured>? = null,

  @Schema(example = "null", description = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.")
  @get:JsonProperty("Unstructured") val unstructured: kotlin.collections.List<kotlin.String>? = null,
)
