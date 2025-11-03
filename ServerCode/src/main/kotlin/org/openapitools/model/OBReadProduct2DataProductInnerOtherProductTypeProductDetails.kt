package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBOtherCodeType10
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
    enum class Segment(val value: kotlin.String) {

        @JsonProperty("GEAS") GEAS("GEAS"),
        @JsonProperty("GEBA") GEBA("GEBA"),
        @JsonProperty("GEBR") GEBR("GEBR"),
        @JsonProperty("GEBU") GEBU("GEBU"),
        @JsonProperty("GECI") GECI("GECI"),
        @JsonProperty("GECS") GECS("GECS"),
        @JsonProperty("GEFB") GEFB("GEFB"),
        @JsonProperty("GEFG") GEFG("GEFG"),
        @JsonProperty("GEG") GEG("GEG"),
        @JsonProperty("GEGR") GEGR("GEGR"),
        @JsonProperty("GEGS") GEGS("GEGS"),
        @JsonProperty("GEOT") GEOT("GEOT"),
        @JsonProperty("GEOV") GEOV("GEOV"),
        @JsonProperty("GEPA") GEPA("GEPA"),
        @JsonProperty("GEPR") GEPR("GEPR"),
        @JsonProperty("GERE") GERE("GERE"),
        @JsonProperty("GEST") GEST("GEST"),
        @JsonProperty("GEYA") GEYA("GEYA"),
        @JsonProperty("GEYO") GEYO("GEYO"),
        @JsonProperty("PSCA") PSCA("PSCA"),
        @JsonProperty("PSES") PSES("PSES"),
        @JsonProperty("PSNC") PSNC("PSNC"),
        @JsonProperty("PSNP") PSNP("PSNP"),
        @JsonProperty("PSRG") PSRG("PSRG"),
        @JsonProperty("PSSS") PSSS("PSSS"),
        @JsonProperty("PSST") PSST("PSST"),
        @JsonProperty("PSSW") PSSW("PSSW")
    }

    /**
    * The unit of period (days, weeks, months etc.) of the promotional length
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class FeeFreeLengthPeriod(val value: kotlin.String) {

        @JsonProperty("PACT") PACT("PACT"),
        @JsonProperty("PDAY") PDAY("PDAY"),
        @JsonProperty("PHYR") PHYR("PHYR"),
        @JsonProperty("PMTH") PMTH("PMTH"),
        @JsonProperty("PQTR") PQTR("PQTR"),
        @JsonProperty("PWEK") PWEK("PWEK"),
        @JsonProperty("PYER") PYER("PYER")
    }

}

