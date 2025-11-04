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
 * @param segment Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
 * @param monthlyMaximumCharge The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
 * @param notes Optional additional notes to supplement the Core product details
 */
data class ProductDetails1(

    @Schema(example = "null", description = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. ")
    @get:JsonProperty("Segment") val segment: kotlin.collections.List<ProductDetails1.Segment>? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
    @get:JsonProperty("MonthlyMaximumCharge") val monthlyMaximumCharge: kotlin.String? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Core product details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

    /**
    * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
    * Values: Basic,BenefitAndReward,CreditInterest,Cashback,General,Graduate,Other,Overdraft,Packaged,Premium,Reward,Student,YoungAdult,Youth
    */
    enum class Segment(val value: kotlin.String) {

        @JsonProperty("Basic") Basic("Basic"),
        @JsonProperty("BenefitAndReward") BenefitAndReward("BenefitAndReward"),
        @JsonProperty("CreditInterest") CreditInterest("CreditInterest"),
        @JsonProperty("Cashback") Cashback("Cashback"),
        @JsonProperty("General") General("General"),
        @JsonProperty("Graduate") Graduate("Graduate"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("Overdraft") Overdraft("Overdraft"),
        @JsonProperty("Packaged") Packaged("Packaged"),
        @JsonProperty("Premium") Premium("Premium"),
        @JsonProperty("Reward") Reward("Reward"),
        @JsonProperty("Student") Student("Student"),
        @JsonProperty("YoungAdult") YoungAdult("YoungAdult"),
        @JsonProperty("Youth") Youth("Youth")
    }

}

