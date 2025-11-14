package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,
) {

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
   * Values: ClientAccount,Standard,NonCommercialChaitiesClbSoc,NonCommercialPublicAuthGovt,Religious,SectorSpecific,Startup,Switcher
   */
  enum class Segment(@get:JsonValue val value: kotlin.String) {

    ClientAccount("ClientAccount"),
    Standard("Standard"),
    NonCommercialChaitiesClbSoc("NonCommercialChaitiesClbSoc"),
    NonCommercialPublicAuthGovt("NonCommercialPublicAuthGovt"),
    Religious("Religious"),
    SectorSpecific("SectorSpecific"),
    Startup("Startup"),
    Switcher("Switcher"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Segment = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductDetails'")
    }
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * Values: Day,Half_Year,Month,Quarter,Week,Year
   */
  enum class FeeFreeLengthPeriod(@get:JsonValue val value: kotlin.String) {

    Day("Day"),
    Half_Year("Half Year"),
    Month("Month"),
    Quarter("Quarter"),
    Week("Week"),
    Year("Year"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): FeeFreeLengthPeriod = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductDetails'")
    }
  }
}
