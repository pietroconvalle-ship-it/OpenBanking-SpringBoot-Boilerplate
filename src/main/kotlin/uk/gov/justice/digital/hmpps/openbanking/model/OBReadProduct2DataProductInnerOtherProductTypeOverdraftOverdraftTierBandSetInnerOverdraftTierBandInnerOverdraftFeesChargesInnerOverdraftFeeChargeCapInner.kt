package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBMinMaxType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBPeriod1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner
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
 * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 * @param feeType 
 * @param minMaxType 
 * @param feeCapOccurrence Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.
 * @param feeCapAmount Cap amount charged for a fee/charge
 * @param cappingPeriod 
 * @param notes 
 * @param otherFeeType 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeType", required = true) val feeType: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner.FeeType>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MinMaxType", required = true) val minMaxType: OBMinMaxType1Code,

    @Schema(example = "null", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.")
    @get:JsonProperty("FeeCapOccurrence") val feeCapOccurrence: kotlin.Int? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Cap amount charged for a fee/charge")
    @get:JsonProperty("FeeCapAmount") val feeCapAmount: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CappingPeriod") val cappingPeriod: OBPeriod1Code? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner>? = null
) {

    /**
    * 
    * Values: FBAO,FBAR,FBEB,FBIT,FBOR,FBOS,FBSC,FBTO,FBUB,FBUT,FTOT,FTUT
    */
    enum class FeeType(val value: kotlin.String) {

        @JsonProperty("FBAO") FBAO("FBAO"),
        @JsonProperty("FBAR") FBAR("FBAR"),
        @JsonProperty("FBEB") FBEB("FBEB"),
        @JsonProperty("FBIT") FBIT("FBIT"),
        @JsonProperty("FBOR") FBOR("FBOR"),
        @JsonProperty("FBOS") FBOS("FBOS"),
        @JsonProperty("FBSC") FBSC("FBSC"),
        @JsonProperty("FBTO") FBTO("FBTO"),
        @JsonProperty("FBUB") FBUB("FBUB"),
        @JsonProperty("FBUT") FBUT("FBUT"),
        @JsonProperty("FTOT") FTOT("FTOT"),
        @JsonProperty("FTUT") FTUT("FTUT")
    }

}

