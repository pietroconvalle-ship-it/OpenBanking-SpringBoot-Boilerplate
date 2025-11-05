package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeTypeInner
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
 * @param feeType Fee/charge type which is being capped
 * @param minMaxType Min Max type
 * @param feeCapOccurrence Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.
 * @param feeCapAmount Cap amount charged for a fee/charge
 * @param cappingPeriod Period e.g. day, week, month etc. for which the fee/charge is capped
 * @param notes Notes related to Overdraft fee charge cap
 * @param otherFeeType Other fee type code which is not available in the standard code set
 */
data class OverdraftFeeChargeCapInner(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Fee/charge type which is being capped")
    @get:JsonProperty("FeeType", required = true) val feeType: kotlin.collections.List<OverdraftFeeChargeCapInner.FeeType>,

    @Schema(example = "null", required = true, description = "Min Max type")
    @get:JsonProperty("MinMaxType", required = true) val minMaxType: OverdraftFeeChargeCapInner.MinMaxType,

    @Schema(example = "null", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.")
    @get:JsonProperty("FeeCapOccurrence") val feeCapOccurrence: kotlin.Float? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Cap amount charged for a fee/charge")
    @get:JsonProperty("FeeCapAmount") val feeCapAmount: kotlin.String? = null,

    @Schema(example = "null", description = "Period e.g. day, week, month etc. for which the fee/charge is capped")
    @get:JsonProperty("CappingPeriod") val cappingPeriod: OverdraftFeeChargeCapInner.CappingPeriod? = null,

    @Schema(example = "null", description = "Notes related to Overdraft fee charge cap")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Other fee type code which is not available in the standard code set")
    @get:JsonProperty("OtherFeeType") val otherFeeType: kotlin.collections.List<OtherFeeTypeInner>? = null
) {

    /**
    * Fee/charge type which is being capped
    * Values: ArrangedOverdraft,AnnualReview,EmergencyBorrowing,BorrowingItem,OverdraftRenewal,OverdraftSetup,Surcharge,TempOverdraft,UnauthorisedBorrowing,UnauthorisedPaidTrans,Other,UnauthorisedUnpaidTrans
    */
    enum class FeeType(val value: kotlin.String) {

        @JsonProperty("ArrangedOverdraft") ArrangedOverdraft("ArrangedOverdraft"),
        @JsonProperty("AnnualReview") AnnualReview("AnnualReview"),
        @JsonProperty("EmergencyBorrowing") EmergencyBorrowing("EmergencyBorrowing"),
        @JsonProperty("BorrowingItem") BorrowingItem("BorrowingItem"),
        @JsonProperty("OverdraftRenewal") OverdraftRenewal("OverdraftRenewal"),
        @JsonProperty("OverdraftSetup") OverdraftSetup("OverdraftSetup"),
        @JsonProperty("Surcharge") Surcharge("Surcharge"),
        @JsonProperty("TempOverdraft") TempOverdraft("TempOverdraft"),
        @JsonProperty("UnauthorisedBorrowing") UnauthorisedBorrowing("UnauthorisedBorrowing"),
        @JsonProperty("UnauthorisedPaidTrans") UnauthorisedPaidTrans("UnauthorisedPaidTrans"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("UnauthorisedUnpaidTrans") UnauthorisedUnpaidTrans("UnauthorisedUnpaidTrans")
    }

    /**
    * Min Max type
    * Values: Minimum,Maximum
    */
    enum class MinMaxType(val value: kotlin.String) {

        @JsonProperty("Minimum") Minimum("Minimum"),
        @JsonProperty("Maximum") Maximum("Maximum")
    }

    /**
    * Period e.g. day, week, month etc. for which the fee/charge is capped
    * Values: Day,Half_Year,Month,Quarter,Week,Year
    */
    enum class CappingPeriod(val value: kotlin.String) {

        @JsonProperty("Day") Day("Day"),
        @JsonProperty("Half Year") Half_Year("Half Year"),
        @JsonProperty("Month") Month("Month"),
        @JsonProperty("Quarter") Quarter("Quarter"),
        @JsonProperty("Week") Week("Week"),
        @JsonProperty("Year") Year("Year")
    }

}

