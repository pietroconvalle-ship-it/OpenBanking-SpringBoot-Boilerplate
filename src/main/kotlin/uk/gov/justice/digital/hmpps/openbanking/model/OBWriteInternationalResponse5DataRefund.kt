package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5DataRefundAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5DataRefundAgent
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5DataRefundCreditor
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
 * 
 * @param account 
 * @param creditor 
 * @param agent 
 */
data class OBWriteInternationalResponse5DataRefund(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Account", required = true) val account: OBWriteInternationalResponse5DataRefundAccount,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Creditor") val creditor: OBWriteInternationalResponse5DataRefundCreditor? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Agent") val agent: OBWriteInternationalResponse5DataRefundAgent? = null
) {

}

