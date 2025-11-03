package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBRemittanceInformationStructured
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
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system
 * @param structured 
 * @param unstructured Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
 */
data class OBRemittanceInformation2(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Structured") val structured: kotlin.collections.List<OBRemittanceInformationStructured>? = null,

    @Schema(example = "null", description = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.")
    @get:JsonProperty("Unstructured") val unstructured: kotlin.collections.List<kotlin.String>? = null
) {

}

