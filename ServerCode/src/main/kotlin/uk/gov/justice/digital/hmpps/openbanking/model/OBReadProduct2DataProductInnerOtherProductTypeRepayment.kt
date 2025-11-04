package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner
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
 * Repayment details of the Loan product
 * @param repaymentType Repayment type
 * @param repaymentFrequency Repayment frequency
 * @param amountType The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
 * @param notes 
 * @param otherRepaymentType 
 * @param otherRepaymentFrequency 
 * @param otherAmountType 
 * @param repaymentFeeCharges 
 * @param repaymentHoliday 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepayment(

    @Schema(example = "null", description = "Repayment type")
    @get:JsonProperty("RepaymentType") val repaymentType: OBReadProduct2DataProductInnerOtherProductTypeRepayment.RepaymentType? = null,

    @Schema(example = "null", description = "Repayment frequency")
    @get:JsonProperty("RepaymentFrequency") val repaymentFrequency: OBReadProduct2DataProductInnerOtherProductTypeRepayment.RepaymentFrequency? = null,

    @Schema(example = "null", description = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc")
    @get:JsonProperty("AmountType") val amountType: OBReadProduct2DataProductInnerOtherProductTypeRepayment.AmountType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherRepaymentType") val otherRepaymentType: OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherRepaymentFrequency") val otherRepaymentFrequency: OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherAmountType") val otherAmountType: OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RepaymentFeeCharges") val repaymentFeeCharges: OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RepaymentHoliday") val repaymentHoliday: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner>? = null
) {

    /**
    * Repayment type
    * Values: USBA,USBU,USCI,USCS,USER,USFA,USFB,USFI,USIO,USOT,USPF,USRW,USSL
    */
    enum class RepaymentType(val value: kotlin.String) {

        @JsonProperty("USBA") USBA("USBA"),
        @JsonProperty("USBU") USBU("USBU"),
        @JsonProperty("USCI") USCI("USCI"),
        @JsonProperty("USCS") USCS("USCS"),
        @JsonProperty("USER") USER("USER"),
        @JsonProperty("USFA") USFA("USFA"),
        @JsonProperty("USFB") USFB("USFB"),
        @JsonProperty("USFI") USFI("USFI"),
        @JsonProperty("USIO") USIO("USIO"),
        @JsonProperty("USOT") USOT("USOT"),
        @JsonProperty("USPF") USPF("USPF"),
        @JsonProperty("USRW") USRW("USRW"),
        @JsonProperty("USSL") USSL("USSL")
    }

    /**
    * Repayment frequency
    * Values: SMDA,SMFL,SMFO,SMHY,SMMO,SMOT,SMQU,SMWE,SMYE
    */
    enum class RepaymentFrequency(val value: kotlin.String) {

        @JsonProperty("SMDA") SMDA("SMDA"),
        @JsonProperty("SMFL") SMFL("SMFL"),
        @JsonProperty("SMFO") SMFO("SMFO"),
        @JsonProperty("SMHY") SMHY("SMHY"),
        @JsonProperty("SMMO") SMMO("SMMO"),
        @JsonProperty("SMOT") SMOT("SMOT"),
        @JsonProperty("SMQU") SMQU("SMQU"),
        @JsonProperty("SMWE") SMWE("SMWE"),
        @JsonProperty("SMYE") SMYE("SMYE")
    }

    /**
    * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
    * Values: RABD,RABL,RACI,RAFC,RAIO,RALT,USOT
    */
    enum class AmountType(val value: kotlin.String) {

        @JsonProperty("RABD") RABD("RABD"),
        @JsonProperty("RABL") RABL("RABL"),
        @JsonProperty("RACI") RACI("RACI"),
        @JsonProperty("RAFC") RAFC("RAFC"),
        @JsonProperty("RAIO") RAIO("RAIO"),
        @JsonProperty("RALT") RALT("RALT"),
        @JsonProperty("USOT") USOT("USOT")
    }

}

