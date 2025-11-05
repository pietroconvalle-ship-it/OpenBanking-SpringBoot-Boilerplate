package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeesChargesInner1
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftTierBandInner
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
 * Tier band set details
 * @param tierBandMethod The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
 * @param overdraftTierBand Provides overdraft details for a specific tier or band
 * @param overdraftType An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
 * @param identification Unique and unambiguous identification of a  Tier Band for a overdraft product.
 * @param authorisedIndicator Indicates if the Overdraft is authorised (Y) or unauthorised (N)
 * @param bufferAmount When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
 * @param notes Optional additional notes to supplement the overdraft Tier Band Set details
 * @param overdraftFeesCharges Overdraft fees and charges details
 */
data class OverdraftTierBandSetInner(

    @Schema(example = "null", required = true, description = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
    @get:JsonProperty("TierBandMethod", required = true) val tierBandMethod: OverdraftTierBandSetInner.TierBandMethod,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Provides overdraft details for a specific tier or band")
    @get:JsonProperty("OverdraftTierBand", required = true) val overdraftTierBand: kotlin.collections.List<OverdraftTierBandInner>,

    @Schema(example = "null", description = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")
    @get:JsonProperty("OverdraftType") val overdraftType: OverdraftTierBandSetInner.OverdraftType? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @Schema(example = "null", description = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")
    @get:JsonProperty("AuthorisedIndicator") val authorisedIndicator: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")
    @get:JsonProperty("BufferAmount") val bufferAmount: kotlin.String? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the overdraft Tier Band Set details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Overdraft fees and charges details")
    @get:JsonProperty("OverdraftFeesCharges") val overdraftFeesCharges: kotlin.collections.List<OverdraftFeesChargesInner1>? = null
) {

    /**
    * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
    * Values: Banded,Tiered,Whole
    */
    enum class TierBandMethod(val value: kotlin.String) {

        @JsonProperty("Banded") Banded("Banded"),
        @JsonProperty("Tiered") Tiered("Tiered"),
        @JsonProperty("Whole") Whole("Whole")
    }

    /**
    * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
    * Values: Committed,OnDemand
    */
    enum class OverdraftType(val value: kotlin.String) {

        @JsonProperty("Committed") Committed("Committed"),
        @JsonProperty("OnDemand") OnDemand("OnDemand")
    }

}

