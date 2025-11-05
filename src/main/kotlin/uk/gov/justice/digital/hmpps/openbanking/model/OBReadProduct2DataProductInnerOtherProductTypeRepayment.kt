package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
    enum class RepaymentType(@get:JsonValue val value: kotlin.String) {

        USBA("USBA"),
        USBU("USBU"),
        USCI("USCI"),
        USCS("USCS"),
        USER("USER"),
        USFA("USFA"),
        USFB("USFB"),
        USFI("USFI"),
        USIO("USIO"),
        USOT("USOT"),
        USPF("USPF"),
        USRW("USRW"),
        USSL("USSL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): RepaymentType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeRepayment'")
            }
        }
    }

    /**
    * Repayment frequency
    * Values: SMDA,SMFL,SMFO,SMHY,SMMO,SMOT,SMQU,SMWE,SMYE
    */
    enum class RepaymentFrequency(@get:JsonValue val value: kotlin.String) {

        SMDA("SMDA"),
        SMFL("SMFL"),
        SMFO("SMFO"),
        SMHY("SMHY"),
        SMMO("SMMO"),
        SMOT("SMOT"),
        SMQU("SMQU"),
        SMWE("SMWE"),
        SMYE("SMYE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): RepaymentFrequency {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeRepayment'")
            }
        }
    }

    /**
    * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
    * Values: RABD,RABL,RACI,RAFC,RAIO,RALT,USOT
    */
    enum class AmountType(@get:JsonValue val value: kotlin.String) {

        RABD("RABD"),
        RABL("RABL"),
        RACI("RACI"),
        RAFC("RAFC"),
        RAIO("RAIO"),
        RALT("RALT"),
        USOT("USOT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AmountType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeRepayment'")
            }
        }
    }

}

