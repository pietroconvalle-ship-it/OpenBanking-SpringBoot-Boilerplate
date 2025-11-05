package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * Set of elements to describe the card instrument used in the transaction. <br /> For a full list of enumeration values refer to `OBInternalCardSchemeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param cardSchemeName Name of the card scheme. <br /> For a full list of enumeration values refer to `OBInternalCardSchemeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param authorisationType The card authorisation type. <br /> For a full list of enumeration values refer to `OBInternalCardAuthorisationType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param name Name of the cardholder using the card instrument.
 * @param identification Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
 */
data class OBTransactionCardInstrument1(

    @Schema(example = "null", required = true, description = "Name of the card scheme. <br /> For a full list of enumeration values refer to `OBInternalCardSchemeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("CardSchemeName", required = true) val cardSchemeName: OBTransactionCardInstrument1.CardSchemeName,

    @Schema(example = "null", description = "The card authorisation type. <br /> For a full list of enumeration values refer to `OBInternalCardAuthorisationType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("AuthorisationType") val authorisationType: OBTransactionCardInstrument1.AuthorisationType? = null,

    @get:Size(min=1,max=70)
    @Schema(example = "null", description = "Name of the cardholder using the card instrument.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Size(min=1,max=34)
    @Schema(example = "null", description = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null
) {

    /**
    * Name of the card scheme. <br /> For a full list of enumeration values refer to `OBInternalCardSchemeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: AmericanExpress,Diners,Discover,MasterCard,VISA
    */
    enum class CardSchemeName(@get:JsonValue val value: kotlin.String) {

        AmericanExpress("AmericanExpress"),
        Diners("Diners"),
        Discover("Discover"),
        MasterCard("MasterCard"),
        VISA("VISA");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CardSchemeName {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBTransactionCardInstrument1'")
            }
        }
    }

    /**
    * The card authorisation type. <br /> For a full list of enumeration values refer to `OBInternalCardAuthorisationType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: ConsumerDevice,Contactless,None,PIN
    */
    enum class AuthorisationType(@get:JsonValue val value: kotlin.String) {

        ConsumerDevice("ConsumerDevice"),
        Contactless("Contactless"),
        None("None"),
        PIN("PIN");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AuthorisationType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBTransactionCardInstrument1'")
            }
        }
    }

}

