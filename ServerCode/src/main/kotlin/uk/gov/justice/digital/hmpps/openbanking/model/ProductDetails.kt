package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param segment Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. 
 * @param feeFreeLength The length/duration of the fee free period
 * @param feeFreeLengthPeriod The unit of period (days, weeks, months etc.) of the promotional length
 * @param notes Optional additional notes to supplement the Core product details
 */
data class ProductDetails(

    @Schema(example = "null", description = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. ")
    @get:JsonProperty("Segment") val segment: kotlin.collections.List<ProductDetails.Segment>? = null,

    @Schema(example = "null", description = "The length/duration of the fee free period")
    @get:JsonProperty("FeeFreeLength") val feeFreeLength: kotlin.Float? = null,

    @Schema(example = "null", description = "The unit of period (days, weeks, months etc.) of the promotional length")
    @get:JsonProperty("FeeFreeLengthPeriod") val feeFreeLengthPeriod: ProductDetails.FeeFreeLengthPeriod? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Core product details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

    /**
    * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. 
    * Values: ClientAccount,Standard,NonCommercialChaitiesClbSoc,NonCommercialPublicAuthGovt,Religious,SectorSpecific,Startup,Switcher
    */
    enum class Segment(val value: kotlin.String) {

        @JsonProperty("ClientAccount") ClientAccount("ClientAccount"),
        @JsonProperty("Standard") Standard("Standard"),
        @JsonProperty("NonCommercialChaitiesClbSoc") NonCommercialChaitiesClbSoc("NonCommercialChaitiesClbSoc"),
        @JsonProperty("NonCommercialPublicAuthGovt") NonCommercialPublicAuthGovt("NonCommercialPublicAuthGovt"),
        @JsonProperty("Religious") Religious("Religious"),
        @JsonProperty("SectorSpecific") SectorSpecific("SectorSpecific"),
        @JsonProperty("Startup") Startup("Startup"),
        @JsonProperty("Switcher") Switcher("Switcher")
    }

    /**
    * The unit of period (days, weeks, months etc.) of the promotional length
    * Values: Day,Half_Year,Month,Quarter,Week,Year
    */
    enum class FeeFreeLengthPeriod(val value: kotlin.String) {

        @JsonProperty("Day") Day("Day"),
        @JsonProperty("Half Year") Half_Year("Half Year"),
        @JsonProperty("Month") Month("Month"),
        @JsonProperty("Quarter") Quarter("Quarter"),
        @JsonProperty("Week") Week("Week"),
        @JsonProperty("Year") Year("Year")
    }

}

