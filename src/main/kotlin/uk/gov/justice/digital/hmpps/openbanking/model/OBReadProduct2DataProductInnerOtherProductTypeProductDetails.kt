package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType10
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
 * @param segment 
 * @param feeFreeLength The length/duration of the fee free period
 * @param feeFreeLengthPeriod The unit of period (days, weeks, months etc.) of the promotional length
 * @param monthlyMaximumCharge The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
 * @param notes 
 * @param otherSegment 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeProductDetails(

    @Schema(example = "null", description = "")
    @get:JsonProperty("Segment") val segment: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeProductDetails.Segment>? = null,

    @Schema(example = "null", description = "The length/duration of the fee free period")
    @get:JsonProperty("FeeFreeLength") val feeFreeLength: kotlin.Int? = null,

    @Schema(example = "null", description = "The unit of period (days, weeks, months etc.) of the promotional length")
    @get:JsonProperty("FeeFreeLengthPeriod") val feeFreeLengthPeriod: OBReadProduct2DataProductInnerOtherProductTypeProductDetails.FeeFreeLengthPeriod? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
    @get:JsonProperty("MonthlyMaximumCharge") val monthlyMaximumCharge: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherSegment") val otherSegment: OBOtherCodeType10? = null
) {

    /**
    * 
    * Values: GEAS,GEBA,GEBR,GEBU,GECI,GECS,GEFB,GEFG,GEG,GEGR,GEGS,GEOT,GEOV,GEPA,GEPR,GERE,GEST,GEYA,GEYO,PSCA,PSES,PSNC,PSNP,PSRG,PSSS,PSST,PSSW
    */
    enum class Segment(@get:JsonValue val value: kotlin.String) {

        GEAS("GEAS"),
        GEBA("GEBA"),
        GEBR("GEBR"),
        GEBU("GEBU"),
        GECI("GECI"),
        GECS("GECS"),
        GEFB("GEFB"),
        GEFG("GEFG"),
        GEG("GEG"),
        GEGR("GEGR"),
        GEGS("GEGS"),
        GEOT("GEOT"),
        GEOV("GEOV"),
        GEPA("GEPA"),
        GEPR("GEPR"),
        GERE("GERE"),
        GEST("GEST"),
        GEYA("GEYA"),
        GEYO("GEYO"),
        PSCA("PSCA"),
        PSES("PSES"),
        PSNC("PSNC"),
        PSNP("PSNP"),
        PSRG("PSRG"),
        PSSS("PSSS"),
        PSST("PSST"),
        PSSW("PSSW");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Segment {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeProductDetails'")
            }
        }
    }

    /**
    * The unit of period (days, weeks, months etc.) of the promotional length
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class FeeFreeLengthPeriod(@get:JsonValue val value: kotlin.String) {

        PACT("PACT"),
        PDAY("PDAY"),
        PHYR("PHYR"),
        PMTH("PMTH"),
        PQTR("PQTR"),
        PWEK("PWEK"),
        PYER("PYER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FeeFreeLengthPeriod {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeProductDetails'")
            }
        }
    }

}

