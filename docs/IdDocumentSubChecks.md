

# IdDocumentSubChecks

Contains information on idDocument sub-checks

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mrzChecksum** | [**MrzChecksumEnum**](#MrzChecksumEnum) | Indicates whether the MRZ checksum is correct |  [optional] |
|**mrzFormat** | [**MrzFormatEnum**](#MrzFormatEnum) | Indicates whether the MRZ format is correct |  [optional] |
|**mrzConsistency** | [**MrzConsistencyEnum**](#MrzConsistencyEnum) | Indicates whether the MRZ is consistent with the document type |  [optional] |
|**expirationDate** | [**ExpirationDateEnum**](#ExpirationDateEnum) | Indicates whether the expirationDate is valid |  [optional] |
|**securityElements** | [**SecurityElementsEnum**](#SecurityElementsEnum) | Indicates whether the document&#39;s security elements are valid |  [optional] |
|**photoLocation** | [**PhotoLocationEnum**](#PhotoLocationEnum) | Indicates whether the photo is in the correct location for a given document type |  [optional] |
|**blacklistCheck** | [**BlacklistCheckEnum**](#BlacklistCheckEnum) | Indicates whether a competent authority deny-listed the ID document |  [optional] |
|**photocopyCheck** | [**PhotocopyCheckEnum**](#PhotocopyCheckEnum) | Indicates whether the document is a photocopy |  [optional] |
|**specimenCheck** | [**SpecimenCheckEnum**](#SpecimenCheckEnum) | Indicates whether the document has been copied from the Internet |  [optional] |
|**documentModelIdentification** | [**DocumentModelIdentificationEnum**](#DocumentModelIdentificationEnum) | Indicates whether the document model has been identified and whether or not the document conforms to official specifications |  [optional] |
|**documentLivenessCheck** | [**DocumentLivenessCheckEnum**](#DocumentLivenessCheckEnum) | Indicates if the document image is genuine and not a photo of an image or of a screen |  [optional] |
|**dataIntegrityCheck** | [**DataIntegrityCheckEnum**](#DataIntegrityCheckEnum) | Indicates whether the data fields contain the correct type of content |  [optional] |
|**dataConsistencyCheck** | [**DataConsistencyCheckEnum**](#DataConsistencyCheckEnum) | Indicates whether the information on both sides of the document is consistent |  [optional] |
|**ageValidationCheck** | [**AgeValidationCheckEnum**](#AgeValidationCheckEnum) | Indicates if the extracted age is greater than or equal to a predefined minimum accepted age |  [optional] |
|**spoofedImageAnalysis** | [**SpoofedImageAnalysisEnum**](#SpoofedImageAnalysisEnum) | Indicates whether the selfie image is spoofed, copied from the Internet, or is a known deny-listed image |  [optional] |
|**faceLivenessCheck** | [**FaceLivenessCheckEnum**](#FaceLivenessCheckEnum) | Indicates if the selfie image is genuine and not a photo of an image or of a screen |  [optional] |
|**voiceChallengeCheck** | [**VoiceChallengeCheckEnum**](#VoiceChallengeCheckEnum) | Indicates if the enduser had answered correctly during the voice challenge. |  [optional] |
|**actionChallengeCheck** | [**ActionChallengeCheckEnum**](#ActionChallengeCheckEnum) | Indicates if the enduser had moved correctly during the actions challenge. |  [optional] |
|**knownFacesCheck** | [**KnownFacesCheckEnum**](#KnownFacesCheckEnum) | Indicates if the selfie image matches an aready existing client/customer |  [optional] |



## Enum: MrzChecksumEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: MrzFormatEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: MrzConsistencyEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: ExpirationDateEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: SecurityElementsEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: PhotoLocationEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: BlacklistCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: PhotocopyCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: SpecimenCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: DocumentModelIdentificationEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: DocumentLivenessCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: DataIntegrityCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: DataConsistencyCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: AgeValidationCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: SpoofedImageAnalysisEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: FaceLivenessCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: VoiceChallengeCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: ActionChallengeCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



## Enum: KnownFacesCheckEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;passed&quot; |
| FAILED | &quot;failed&quot; |
| NOT_PROCESSED | &quot;not_processed&quot; |



