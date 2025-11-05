package uk.gov.justice.digital.hmpps.openbanking.config

import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code2
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCreditorReferenceType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCreditorReferenceType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalDocumentType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalDocumentType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalEntryStatus1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalMandateStatus1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalProxyAccountType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalProxyAccountType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalProxyAccountType1Code2
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalProxyAccountType1Code3
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBAddressType2Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBAddressType2Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBAddressType2Code2
import uk.gov.justice.digital.hmpps.openbanking.model.OBAddressTypeCode
import uk.gov.justice.digital.hmpps.openbanking.model.OBBalanceType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBCommunicationMethod
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode0
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode1
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode2
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalAccountSubType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalAccountType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalBalanceSubType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalCreditorReferenceType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalMandateClassification1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalMandateClassification1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalPurpose1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalStatus2Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeCategory1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code0
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code2
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code3
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code4
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBFileFormat
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency2
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency6Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency6Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequencyPeriodType
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestCalculationMethod1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestFixedVariableType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestRateType1Code0
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestRateType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalAccountStatus1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalAccountType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalBeneficiaryType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalExtendedAccountType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalExtendedAccountType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalPartyType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalPaymentChargeType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalScheduleType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalStatementType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalTransactionMutability1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBMinMaxType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBOverdraftFeeType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBPeriod1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPInteractionTypes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "uk.gov.justice.digital.hmpps.openbanking.config.enumConverterConfiguration")
class EnumConverterConfiguration {

    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalCategoryPurpose1CodeConverter"])
    fun externalCategoryPurpose1CodeConverter(): Converter<kotlin.String, ExternalCategoryPurpose1Code> {
        return object: Converter<kotlin.String, ExternalCategoryPurpose1Code> {
            override fun convert(source: kotlin.String): ExternalCategoryPurpose1Code = ExternalCategoryPurpose1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalCategoryPurpose1Code1Converter"])
    fun externalCategoryPurpose1Code1Converter(): Converter<kotlin.String, ExternalCategoryPurpose1Code1> {
        return object: Converter<kotlin.String, ExternalCategoryPurpose1Code1> {
            override fun convert(source: kotlin.String): ExternalCategoryPurpose1Code1 = ExternalCategoryPurpose1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalCategoryPurpose1Code2Converter"])
    fun externalCategoryPurpose1Code2Converter(): Converter<kotlin.String, ExternalCategoryPurpose1Code2> {
        return object: Converter<kotlin.String, ExternalCategoryPurpose1Code2> {
            override fun convert(source: kotlin.String): ExternalCategoryPurpose1Code2 = ExternalCategoryPurpose1Code2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalCreditorReferenceType1CodeConverter"])
    fun externalCreditorReferenceType1CodeConverter(): Converter<kotlin.String, ExternalCreditorReferenceType1Code> {
        return object: Converter<kotlin.String, ExternalCreditorReferenceType1Code> {
            override fun convert(source: kotlin.String): ExternalCreditorReferenceType1Code = ExternalCreditorReferenceType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalCreditorReferenceType1Code1Converter"])
    fun externalCreditorReferenceType1Code1Converter(): Converter<kotlin.String, ExternalCreditorReferenceType1Code1> {
        return object: Converter<kotlin.String, ExternalCreditorReferenceType1Code1> {
            override fun convert(source: kotlin.String): ExternalCreditorReferenceType1Code1 = ExternalCreditorReferenceType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalDocumentType1CodeConverter"])
    fun externalDocumentType1CodeConverter(): Converter<kotlin.String, ExternalDocumentType1Code> {
        return object: Converter<kotlin.String, ExternalDocumentType1Code> {
            override fun convert(source: kotlin.String): ExternalDocumentType1Code = ExternalDocumentType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalDocumentType1Code1Converter"])
    fun externalDocumentType1Code1Converter(): Converter<kotlin.String, ExternalDocumentType1Code1> {
        return object: Converter<kotlin.String, ExternalDocumentType1Code1> {
            override fun convert(source: kotlin.String): ExternalDocumentType1Code1 = ExternalDocumentType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalEntryStatus1CodeConverter"])
    fun externalEntryStatus1CodeConverter(): Converter<kotlin.String, ExternalEntryStatus1Code> {
        return object: Converter<kotlin.String, ExternalEntryStatus1Code> {
            override fun convert(source: kotlin.String): ExternalEntryStatus1Code = ExternalEntryStatus1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalMandateStatus1CodeConverter"])
    fun externalMandateStatus1CodeConverter(): Converter<kotlin.String, ExternalMandateStatus1Code> {
        return object: Converter<kotlin.String, ExternalMandateStatus1Code> {
            override fun convert(source: kotlin.String): ExternalMandateStatus1Code = ExternalMandateStatus1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalProxyAccountType1CodeConverter"])
    fun externalProxyAccountType1CodeConverter(): Converter<kotlin.String, ExternalProxyAccountType1Code> {
        return object: Converter<kotlin.String, ExternalProxyAccountType1Code> {
            override fun convert(source: kotlin.String): ExternalProxyAccountType1Code = ExternalProxyAccountType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalProxyAccountType1Code1Converter"])
    fun externalProxyAccountType1Code1Converter(): Converter<kotlin.String, ExternalProxyAccountType1Code1> {
        return object: Converter<kotlin.String, ExternalProxyAccountType1Code1> {
            override fun convert(source: kotlin.String): ExternalProxyAccountType1Code1 = ExternalProxyAccountType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalProxyAccountType1Code2Converter"])
    fun externalProxyAccountType1Code2Converter(): Converter<kotlin.String, ExternalProxyAccountType1Code2> {
        return object: Converter<kotlin.String, ExternalProxyAccountType1Code2> {
            override fun convert(source: kotlin.String): ExternalProxyAccountType1Code2 = ExternalProxyAccountType1Code2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalProxyAccountType1Code3Converter"])
    fun externalProxyAccountType1Code3Converter(): Converter<kotlin.String, ExternalProxyAccountType1Code3> {
        return object: Converter<kotlin.String, ExternalProxyAccountType1Code3> {
            override fun convert(source: kotlin.String): ExternalProxyAccountType1Code3 = ExternalProxyAccountType1Code3.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.externalPurpose1CodeConverter"])
    fun externalPurpose1CodeConverter(): Converter<kotlin.String, ExternalPurpose1Code> {
        return object: Converter<kotlin.String, ExternalPurpose1Code> {
            override fun convert(source: kotlin.String): ExternalPurpose1Code = ExternalPurpose1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obAddressType2CodeConverter"])
    fun obAddressType2CodeConverter(): Converter<kotlin.String, OBAddressType2Code> {
        return object: Converter<kotlin.String, OBAddressType2Code> {
            override fun convert(source: kotlin.String): OBAddressType2Code = OBAddressType2Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obAddressType2Code1Converter"])
    fun obAddressType2Code1Converter(): Converter<kotlin.String, OBAddressType2Code1> {
        return object: Converter<kotlin.String, OBAddressType2Code1> {
            override fun convert(source: kotlin.String): OBAddressType2Code1 = OBAddressType2Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obAddressType2Code2Converter"])
    fun obAddressType2Code2Converter(): Converter<kotlin.String, OBAddressType2Code2> {
        return object: Converter<kotlin.String, OBAddressType2Code2> {
            override fun convert(source: kotlin.String): OBAddressType2Code2 = OBAddressType2Code2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obAddressTypeCodeConverter"])
    fun obAddressTypeCodeConverter(): Converter<kotlin.String, OBAddressTypeCode> {
        return object: Converter<kotlin.String, OBAddressTypeCode> {
            override fun convert(source: kotlin.String): OBAddressTypeCode = OBAddressTypeCode.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obBalanceType1CodeConverter"])
    fun obBalanceType1CodeConverter(): Converter<kotlin.String, OBBalanceType1Code> {
        return object: Converter<kotlin.String, OBBalanceType1Code> {
            override fun convert(source: kotlin.String): OBBalanceType1Code = OBBalanceType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obCommunicationMethodConverter"])
    fun obCommunicationMethodConverter(): Converter<kotlin.String, OBCommunicationMethod> {
        return object: Converter<kotlin.String, OBCommunicationMethod> {
            override fun convert(source: kotlin.String): OBCommunicationMethod = OBCommunicationMethod.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obCreditDebitCode0Converter"])
    fun obCreditDebitCode0Converter(): Converter<kotlin.String, OBCreditDebitCode0> {
        return object: Converter<kotlin.String, OBCreditDebitCode0> {
            override fun convert(source: kotlin.String): OBCreditDebitCode0 = OBCreditDebitCode0.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obCreditDebitCode1Converter"])
    fun obCreditDebitCode1Converter(): Converter<kotlin.String, OBCreditDebitCode1> {
        return object: Converter<kotlin.String, OBCreditDebitCode1> {
            override fun convert(source: kotlin.String): OBCreditDebitCode1 = OBCreditDebitCode1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obCreditDebitCode2Converter"])
    fun obCreditDebitCode2Converter(): Converter<kotlin.String, OBCreditDebitCode2> {
        return object: Converter<kotlin.String, OBCreditDebitCode2> {
            override fun convert(source: kotlin.String): OBCreditDebitCode2 = OBCreditDebitCode2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalAccountSubType1CodeConverter"])
    fun obExternalAccountSubType1CodeConverter(): Converter<kotlin.String, OBExternalAccountSubType1Code> {
        return object: Converter<kotlin.String, OBExternalAccountSubType1Code> {
            override fun convert(source: kotlin.String): OBExternalAccountSubType1Code = OBExternalAccountSubType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalAccountType1CodeConverter"])
    fun obExternalAccountType1CodeConverter(): Converter<kotlin.String, OBExternalAccountType1Code> {
        return object: Converter<kotlin.String, OBExternalAccountType1Code> {
            override fun convert(source: kotlin.String): OBExternalAccountType1Code = OBExternalAccountType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalBalanceSubType1CodeConverter"])
    fun obExternalBalanceSubType1CodeConverter(): Converter<kotlin.String, OBExternalBalanceSubType1Code> {
        return object: Converter<kotlin.String, OBExternalBalanceSubType1Code> {
            override fun convert(source: kotlin.String): OBExternalBalanceSubType1Code = OBExternalBalanceSubType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalCreditorReferenceType1CodeConverter"])
    fun obExternalCreditorReferenceType1CodeConverter(): Converter<kotlin.String, OBExternalCreditorReferenceType1Code> {
        return object: Converter<kotlin.String, OBExternalCreditorReferenceType1Code> {
            override fun convert(source: kotlin.String): OBExternalCreditorReferenceType1Code = OBExternalCreditorReferenceType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalMandateClassification1CodeConverter"])
    fun obExternalMandateClassification1CodeConverter(): Converter<kotlin.String, OBExternalMandateClassification1Code> {
        return object: Converter<kotlin.String, OBExternalMandateClassification1Code> {
            override fun convert(source: kotlin.String): OBExternalMandateClassification1Code = OBExternalMandateClassification1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalMandateClassification1Code1Converter"])
    fun obExternalMandateClassification1Code1Converter(): Converter<kotlin.String, OBExternalMandateClassification1Code1> {
        return object: Converter<kotlin.String, OBExternalMandateClassification1Code1> {
            override fun convert(source: kotlin.String): OBExternalMandateClassification1Code1 = OBExternalMandateClassification1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalPurpose1CodeConverter"])
    fun obExternalPurpose1CodeConverter(): Converter<kotlin.String, OBExternalPurpose1Code> {
        return object: Converter<kotlin.String, OBExternalPurpose1Code> {
            override fun convert(source: kotlin.String): OBExternalPurpose1Code = OBExternalPurpose1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalPurpose1Code1Converter"])
    fun obExternalPurpose1Code1Converter(): Converter<kotlin.String, OBExternalPurpose1Code1> {
        return object: Converter<kotlin.String, OBExternalPurpose1Code1> {
            override fun convert(source: kotlin.String): OBExternalPurpose1Code1 = OBExternalPurpose1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obExternalStatus2CodeConverter"])
    fun obExternalStatus2CodeConverter(): Converter<kotlin.String, OBExternalStatus2Code> {
        return object: Converter<kotlin.String, OBExternalStatus2Code> {
            override fun convert(source: kotlin.String): OBExternalStatus2Code = OBExternalStatus2Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeCategory1CodeConverter"])
    fun obFeeCategory1CodeConverter(): Converter<kotlin.String, OBFeeCategory1Code> {
        return object: Converter<kotlin.String, OBFeeCategory1Code> {
            override fun convert(source: kotlin.String): OBFeeCategory1Code = OBFeeCategory1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeFrequency1Code0Converter"])
    fun obFeeFrequency1Code0Converter(): Converter<kotlin.String, OBFeeFrequency1Code0> {
        return object: Converter<kotlin.String, OBFeeFrequency1Code0> {
            override fun convert(source: kotlin.String): OBFeeFrequency1Code0 = OBFeeFrequency1Code0.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeFrequency1Code1Converter"])
    fun obFeeFrequency1Code1Converter(): Converter<kotlin.String, OBFeeFrequency1Code1> {
        return object: Converter<kotlin.String, OBFeeFrequency1Code1> {
            override fun convert(source: kotlin.String): OBFeeFrequency1Code1 = OBFeeFrequency1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeFrequency1Code2Converter"])
    fun obFeeFrequency1Code2Converter(): Converter<kotlin.String, OBFeeFrequency1Code2> {
        return object: Converter<kotlin.String, OBFeeFrequency1Code2> {
            override fun convert(source: kotlin.String): OBFeeFrequency1Code2 = OBFeeFrequency1Code2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeFrequency1Code3Converter"])
    fun obFeeFrequency1Code3Converter(): Converter<kotlin.String, OBFeeFrequency1Code3> {
        return object: Converter<kotlin.String, OBFeeFrequency1Code3> {
            override fun convert(source: kotlin.String): OBFeeFrequency1Code3 = OBFeeFrequency1Code3.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeFrequency1Code4Converter"])
    fun obFeeFrequency1Code4Converter(): Converter<kotlin.String, OBFeeFrequency1Code4> {
        return object: Converter<kotlin.String, OBFeeFrequency1Code4> {
            override fun convert(source: kotlin.String): OBFeeFrequency1Code4 = OBFeeFrequency1Code4.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFeeType1CodeConverter"])
    fun obFeeType1CodeConverter(): Converter<kotlin.String, OBFeeType1Code> {
        return object: Converter<kotlin.String, OBFeeType1Code> {
            override fun convert(source: kotlin.String): OBFeeType1Code = OBFeeType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFileFormatConverter"])
    fun obFileFormatConverter(): Converter<kotlin.String, OBFileFormat> {
        return object: Converter<kotlin.String, OBFileFormat> {
            override fun convert(source: kotlin.String): OBFileFormat = OBFileFormat.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFrequency2Converter"])
    fun obFrequency2Converter(): Converter<kotlin.String, OBFrequency2> {
        return object: Converter<kotlin.String, OBFrequency2> {
            override fun convert(source: kotlin.String): OBFrequency2 = OBFrequency2.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFrequency6CodeConverter"])
    fun obFrequency6CodeConverter(): Converter<kotlin.String, OBFrequency6Code> {
        return object: Converter<kotlin.String, OBFrequency6Code> {
            override fun convert(source: kotlin.String): OBFrequency6Code = OBFrequency6Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFrequency6Code1Converter"])
    fun obFrequency6Code1Converter(): Converter<kotlin.String, OBFrequency6Code1> {
        return object: Converter<kotlin.String, OBFrequency6Code1> {
            override fun convert(source: kotlin.String): OBFrequency6Code1 = OBFrequency6Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obFrequencyPeriodTypeConverter"])
    fun obFrequencyPeriodTypeConverter(): Converter<kotlin.String, OBFrequencyPeriodType> {
        return object: Converter<kotlin.String, OBFrequencyPeriodType> {
            override fun convert(source: kotlin.String): OBFrequencyPeriodType = OBFrequencyPeriodType.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInterestCalculationMethod1CodeConverter"])
    fun obInterestCalculationMethod1CodeConverter(): Converter<kotlin.String, OBInterestCalculationMethod1Code> {
        return object: Converter<kotlin.String, OBInterestCalculationMethod1Code> {
            override fun convert(source: kotlin.String): OBInterestCalculationMethod1Code = OBInterestCalculationMethod1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInterestFixedVariableType1CodeConverter"])
    fun obInterestFixedVariableType1CodeConverter(): Converter<kotlin.String, OBInterestFixedVariableType1Code> {
        return object: Converter<kotlin.String, OBInterestFixedVariableType1Code> {
            override fun convert(source: kotlin.String): OBInterestFixedVariableType1Code = OBInterestFixedVariableType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInterestRateType1Code0Converter"])
    fun obInterestRateType1Code0Converter(): Converter<kotlin.String, OBInterestRateType1Code0> {
        return object: Converter<kotlin.String, OBInterestRateType1Code0> {
            override fun convert(source: kotlin.String): OBInterestRateType1Code0 = OBInterestRateType1Code0.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInterestRateType1Code1Converter"])
    fun obInterestRateType1Code1Converter(): Converter<kotlin.String, OBInterestRateType1Code1> {
        return object: Converter<kotlin.String, OBInterestRateType1Code1> {
            override fun convert(source: kotlin.String): OBInterestRateType1Code1 = OBInterestRateType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalAccountStatus1CodeConverter"])
    fun obInternalAccountStatus1CodeConverter(): Converter<kotlin.String, OBInternalAccountStatus1Code> {
        return object: Converter<kotlin.String, OBInternalAccountStatus1Code> {
            override fun convert(source: kotlin.String): OBInternalAccountStatus1Code = OBInternalAccountStatus1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalAccountType1CodeConverter"])
    fun obInternalAccountType1CodeConverter(): Converter<kotlin.String, OBInternalAccountType1Code> {
        return object: Converter<kotlin.String, OBInternalAccountType1Code> {
            override fun convert(source: kotlin.String): OBInternalAccountType1Code = OBInternalAccountType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalBeneficiaryType1CodeConverter"])
    fun obInternalBeneficiaryType1CodeConverter(): Converter<kotlin.String, OBInternalBeneficiaryType1Code> {
        return object: Converter<kotlin.String, OBInternalBeneficiaryType1Code> {
            override fun convert(source: kotlin.String): OBInternalBeneficiaryType1Code = OBInternalBeneficiaryType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalChargeBearerType1CodeConverter"])
    fun obInternalChargeBearerType1CodeConverter(): Converter<kotlin.String, OBInternalChargeBearerType1Code> {
        return object: Converter<kotlin.String, OBInternalChargeBearerType1Code> {
            override fun convert(source: kotlin.String): OBInternalChargeBearerType1Code = OBInternalChargeBearerType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalChargeBearerType1Code1Converter"])
    fun obInternalChargeBearerType1Code1Converter(): Converter<kotlin.String, OBInternalChargeBearerType1Code1> {
        return object: Converter<kotlin.String, OBInternalChargeBearerType1Code1> {
            override fun convert(source: kotlin.String): OBInternalChargeBearerType1Code1 = OBInternalChargeBearerType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalExtendedAccountType1CodeConverter"])
    fun obInternalExtendedAccountType1CodeConverter(): Converter<kotlin.String, OBInternalExtendedAccountType1Code> {
        return object: Converter<kotlin.String, OBInternalExtendedAccountType1Code> {
            override fun convert(source: kotlin.String): OBInternalExtendedAccountType1Code = OBInternalExtendedAccountType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalExtendedAccountType1Code1Converter"])
    fun obInternalExtendedAccountType1Code1Converter(): Converter<kotlin.String, OBInternalExtendedAccountType1Code1> {
        return object: Converter<kotlin.String, OBInternalExtendedAccountType1Code1> {
            override fun convert(source: kotlin.String): OBInternalExtendedAccountType1Code1 = OBInternalExtendedAccountType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalPartyType1CodeConverter"])
    fun obInternalPartyType1CodeConverter(): Converter<kotlin.String, OBInternalPartyType1Code> {
        return object: Converter<kotlin.String, OBInternalPartyType1Code> {
            override fun convert(source: kotlin.String): OBInternalPartyType1Code = OBInternalPartyType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalPaymentChargeType1Code1Converter"])
    fun obInternalPaymentChargeType1Code1Converter(): Converter<kotlin.String, OBInternalPaymentChargeType1Code1> {
        return object: Converter<kotlin.String, OBInternalPaymentChargeType1Code1> {
            override fun convert(source: kotlin.String): OBInternalPaymentChargeType1Code1 = OBInternalPaymentChargeType1Code1.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalScheduleType1CodeConverter"])
    fun obInternalScheduleType1CodeConverter(): Converter<kotlin.String, OBInternalScheduleType1Code> {
        return object: Converter<kotlin.String, OBInternalScheduleType1Code> {
            override fun convert(source: kotlin.String): OBInternalScheduleType1Code = OBInternalScheduleType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalStatementType1CodeConverter"])
    fun obInternalStatementType1CodeConverter(): Converter<kotlin.String, OBInternalStatementType1Code> {
        return object: Converter<kotlin.String, OBInternalStatementType1Code> {
            override fun convert(source: kotlin.String): OBInternalStatementType1Code = OBInternalStatementType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obInternalTransactionMutability1CodeConverter"])
    fun obInternalTransactionMutability1CodeConverter(): Converter<kotlin.String, OBInternalTransactionMutability1Code> {
        return object: Converter<kotlin.String, OBInternalTransactionMutability1Code> {
            override fun convert(source: kotlin.String): OBInternalTransactionMutability1Code = OBInternalTransactionMutability1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obMinMaxType1CodeConverter"])
    fun obMinMaxType1CodeConverter(): Converter<kotlin.String, OBMinMaxType1Code> {
        return object: Converter<kotlin.String, OBMinMaxType1Code> {
            override fun convert(source: kotlin.String): OBMinMaxType1Code = OBMinMaxType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obOverdraftFeeType1CodeConverter"])
    fun obOverdraftFeeType1CodeConverter(): Converter<kotlin.String, OBOverdraftFeeType1Code> {
        return object: Converter<kotlin.String, OBOverdraftFeeType1Code> {
            override fun convert(source: kotlin.String): OBOverdraftFeeType1Code = OBOverdraftFeeType1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obPeriod1CodeConverter"])
    fun obPeriod1CodeConverter(): Converter<kotlin.String, OBPeriod1Code> {
        return object: Converter<kotlin.String, OBPeriod1Code> {
            override fun convert(source: kotlin.String): OBPeriod1Code = OBPeriod1Code.forValue(source)
        }
    }
    @Bean(name = ["uk.gov.justice.digital.hmpps.openbanking.config.EnumConverterConfiguration.obVRPInteractionTypesConverter"])
    fun obVRPInteractionTypesConverter(): Converter<kotlin.String, OBVRPInteractionTypes> {
        return object: Converter<kotlin.String, OBVRPInteractionTypes> {
            override fun convert(source: kotlin.String): OBVRPInteractionTypes = OBVRPInteractionTypes.forValue(source)
        }
    }

}
