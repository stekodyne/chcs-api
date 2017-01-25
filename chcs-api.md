---
generator: 'Asciidoctor 1.5.3'
title: CHCS API
viewport: 'width=device-width, initial-scale=1.0'
...

<div id="header">

CHCS API
========

<div id="toc" class="toc2">

<div id="toctitle">

Table of Contents

</div>

-   [1. Overview](#_overview)
    -   [1.1. Version information](#_version_information)
    -   [1.2. Contact information](#_contact_information)
    -   [1.3. License information](#_license_information)
    -   [1.4. URI scheme](#_uri_scheme)
-   [2. Resources](#_paths)
    -   [2.1. Patient-controller](#_patient-controller_resource)
        -   [2.1.1. findAll](#_findall_1)
        -   [2.1.2. findByIen](#_findbyien_1)
-   [3. Resources](#_paths)
    -   [3.1. Conformance-controller](#_conformance-controller_resource)
        -   [3.1.1. getMetadata](#_getmetadata)
-   [4. Resources](#_paths)
    -   [4.1. Observation-controller](#_observation-controller_resource)
        -   [4.1.1. findAllByPatient](#_findallbypatient_1)
-   [5. Resources](#_paths)
    -   [5.1.
        Medication-order-controller](#_medication-order-controller_resource)
        -   [5.1.1. createMedicationOrder](#_createmedicationorder)
        -   [5.1.2. findAllByPatient](#_findallbypatient)
        -   [5.1.3. findByIen](#_findbyien)
-   [6. Resources](#_paths)
    -   [6.1.
        Device-metric-controller](#_device-metric-controller_resource)
        -   [6.1.1. findAll](#_findall)
-   [7. Resources](#_paths)
    -   [7.1. Object-controller](#_object-controller_resource)
        -   [7.1.1. getObject](#_getobject)
-   [8. Definitions](#_definitions)
    -   [8.1. Account](#_account)
    -   [8.2. AccountStatus](#_accountstatus)
    -   [8.3. ActionList](#_actionlist)
    -   [8.4. Address](#_address)
    -   [8.5. AddressType](#_addresstype)
    -   [8.6. AddressUse](#_addressuse)
    -   [8.7. Age](#_age)
    -   [8.8. AggregationMode](#_aggregationmode)
    -   [8.9. AllergyIntolerance](#_allergyintolerance)
    -   [8.10. AllergyIntoleranceCategory](#_allergyintolerancecategory)
    -   [8.11.
        AllergyIntoleranceCertainty](#_allergyintolerancecertainty)
    -   [8.12.
        AllergyIntoleranceCriticality](#_allergyintolerancecriticality)
    -   [8.13. AllergyIntoleranceReaction](#_allergyintolerancereaction)
    -   [8.14. AllergyIntoleranceSeverity](#_allergyintoleranceseverity)
    -   [8.15. AllergyIntoleranceStatus](#_allergyintolerancestatus)
    -   [8.16. AllergyIntoleranceType](#_allergyintolerancetype)
    -   [8.17. Annotation](#_annotation)
    -   [8.18. AnswerFormat](#_answerformat)
    -   [8.19. Appointment](#_appointment)
    -   [8.20. AppointmentParticipant](#_appointmentparticipant)
    -   [8.21. AppointmentResponse](#_appointmentresponse)
    -   [8.22. AppointmentStatus](#_appointmentstatus)
    -   [8.23. AssertionDirectionType](#_assertiondirectiontype)
    -   [8.24. AssertionOperatorType](#_assertionoperatortype)
    -   [8.25. AssertionResponseTypes](#_assertionresponsetypes)
    -   [8.26. Attachment](#_attachment)
    -   [8.27. AuditEvent](#_auditevent)
    -   [8.28. AuditEventAction](#_auditeventaction)
    -   [8.29. AuditEventDetail](#_auditeventdetail)
    -   [8.30. AuditEventEvent](#_auditeventevent)
    -   [8.31. AuditEventNetwork](#_auditeventnetwork)
    -   [8.32. AuditEventObject](#_auditeventobject)
    -   [8.33. AuditEventOutcome](#_auditeventoutcome)
    -   [8.34. AuditEventParticipant](#_auditeventparticipant)
    -   [8.35.
        AuditEventParticipantNetworkType](#_auditeventparticipantnetworktype)
    -   [8.36. AuditEventSource](#_auditeventsource)
    -   [8.37. Base64Binary](#_base64binary)
    -   [8.38. Basic](#_basic)
    -   [8.39. Binary](#_binary)
    -   [8.40. BindingStrength](#_bindingstrength)
    -   [8.41. BodySite](#_bodysite)
    -   [8.42. Boolean](#_boolean)
    -   [8.43. Bundle](#_bundle)
    -   [8.44. BundleEntry](#_bundleentry)
    -   [8.45. BundleLink](#_bundlelink)
    -   [8.46. BundleRequest](#_bundlerequest)
    -   [8.47. BundleResponse](#_bundleresponse)
    -   [8.48. BundleSearch](#_bundlesearch)
    -   [8.49. BundleType](#_bundletype)
    -   [8.50. CarePlan](#_careplan)
    -   [8.51. CarePlanActivity](#_careplanactivity)
    -   [8.52. CarePlanActivityStatus](#_careplanactivitystatus)
    -   [8.53. CarePlanDetail](#_careplandetail)
    -   [8.54. CarePlanParticipant](#_careplanparticipant)
    -   [8.55. CarePlanRelatedPlan](#_careplanrelatedplan)
    -   [8.56. CarePlanRelationship](#_careplanrelationship)
    -   [8.57. CarePlanStatus](#_careplanstatus)
    -   [8.58. Claim](#_claim)
    -   [8.59. ClaimCoverage](#_claimcoverage)
    -   [8.60. ClaimDetail](#_claimdetail)
    -   [8.61. ClaimDiagnosis](#_claimdiagnosis)
    -   [8.62. ClaimItem](#_claimitem)
    -   [8.63. ClaimMissingTeeth](#_claimmissingteeth)
    -   [8.64. ClaimPayee](#_claimpayee)
    -   [8.65. ClaimProsthesis](#_claimprosthesis)
    -   [8.66. ClaimResponse](#_claimresponse)
    -   [8.67. ClaimResponseAddItem](#_claimresponseadditem)
    -   [8.68. ClaimResponseAdjudication](#_claimresponseadjudication)
    -   [8.69. ClaimResponseAdjudication1](#_claimresponseadjudication1)
    -   [8.70. ClaimResponseAdjudication2](#_claimresponseadjudication2)
    -   [8.71. ClaimResponseAdjudication3](#_claimresponseadjudication3)
    -   [8.72. ClaimResponseAdjudication4](#_claimresponseadjudication4)
    -   [8.73. ClaimResponseCoverage](#_claimresponsecoverage)
    -   [8.74. ClaimResponseDetail](#_claimresponsedetail)
    -   [8.75. ClaimResponseDetail1](#_claimresponsedetail1)
    -   [8.76. ClaimResponseError](#_claimresponseerror)
    -   [8.77. ClaimResponseItem](#_claimresponseitem)
    -   [8.78. ClaimResponseNote](#_claimresponsenote)
    -   [8.79. ClaimResponseSubDetail](#_claimresponsesubdetail)
    -   [8.80. ClaimSubDetail](#_claimsubdetail)
    -   [8.81. ClaimType](#_claimtype)
    -   [8.82. ClinicalImpression](#_clinicalimpression)
    -   [8.83. ClinicalImpressionFinding](#_clinicalimpressionfinding)
    -   [8.84.
        ClinicalImpressionInvestigations](#_clinicalimpressioninvestigations)
    -   [8.85. ClinicalImpressionRuledOut](#_clinicalimpressionruledout)
    -   [8.86. ClinicalImpressionStatus](#_clinicalimpressionstatus)
    -   [8.87. Code](#_code)
    -   [8.88. CodeableConcept](#_codeableconcept)
    -   [8.89. Coding](#_coding)
    -   [8.90. Communication](#_communication)
    -   [8.91. CommunicationPayload](#_communicationpayload)
    -   [8.92. CommunicationRequest](#_communicationrequest)
    -   [8.93.
        CommunicationRequestPayload](#_communicationrequestpayload)
    -   [8.94. CommunicationRequestStatus](#_communicationrequeststatus)
    -   [8.95. CommunicationStatus](#_communicationstatus)
    -   [8.96. Composition](#_composition)
    -   [8.97. CompositionAttestationMode](#_compositionattestationmode)
    -   [8.98. CompositionAttester](#_compositionattester)
    -   [8.99. CompositionEvent](#_compositionevent)
    -   [8.100. CompositionSection](#_compositionsection)
    -   [8.101. CompositionStatus](#_compositionstatus)
    -   [8.102. ConceptMap](#_conceptmap)
    -   [8.103. ConceptMapContact](#_conceptmapcontact)
    -   [8.104. ConceptMapDependsOn](#_conceptmapdependson)
    -   [8.105. ConceptMapElement](#_conceptmapelement)
    -   [8.106. ConceptMapTarget](#_conceptmaptarget)
    -   [8.107. Condition](#_condition)
    -   [8.108. ConditionEvidence](#_conditionevidence)
    -   [8.109. ConditionStage](#_conditionstage)
    -   [8.110.
        ConditionVerificationStatus](#_conditionverificationstatus)
    -   [8.111. ConditionalDeleteStatus](#_conditionaldeletestatus)
    -   [8.112. Conformance](#_conformance)
    -   [8.113. ConformanceCertificate](#_conformancecertificate)
    -   [8.114. ConformanceContact](#_conformancecontact)
    -   [8.115. ConformanceDocument](#_conformancedocument)
    -   [8.116. ConformanceEndpoint](#_conformanceendpoint)
    -   [8.117. ConformanceEvent](#_conformanceevent)
    -   [8.118. ConformanceEventMode](#_conformanceeventmode)
    -   [8.119. ConformanceImplementation](#_conformanceimplementation)
    -   [8.120. ConformanceInteraction](#_conformanceinteraction)
    -   [8.121. ConformanceInteraction1](#_conformanceinteraction1)
    -   [8.122. ConformanceMessaging](#_conformancemessaging)
    -   [8.123. ConformanceOperation](#_conformanceoperation)
    -   [8.124. ConformanceResource](#_conformanceresource)
    -   [8.125. ConformanceRest](#_conformancerest)
    -   [8.126. ConformanceSearchParam](#_conformancesearchparam)
    -   [8.127. ConformanceSecurity](#_conformancesecurity)
    -   [8.128. ConformanceSoftware](#_conformancesoftware)
    -   [8.129. ConformanceStatementKind](#_conformancestatementkind)
    -   [8.130. ConstraintSeverity](#_constraintseverity)
    -   [8.131. ContactPoint](#_contactpoint)
    -   [8.132. ContactPointSystem](#_contactpointsystem)
    -   [8.133. ContactPointUse](#_contactpointuse)
    -   [8.134. ContentType](#_contenttype)
    -   [8.135. Contract](#_contract)
    -   [8.136. ContractActor](#_contractactor)
    -   [8.137. ContractActor1](#_contractactor1)
    -   [8.138. ContractFriendly](#_contractfriendly)
    -   [8.139. ContractLegal](#_contractlegal)
    -   [8.140. ContractRule](#_contractrule)
    -   [8.141. ContractSigner](#_contractsigner)
    -   [8.142. ContractTerm](#_contractterm)
    -   [8.143. ContractValuedItem](#_contractvalueditem)
    -   [8.144. ContractValuedItem1](#_contractvalueditem1)
    -   [8.145. Coverage](#_coverage)
    -   [8.146. DataElement](#_dataelement)
    -   [8.147. DataElementContact](#_dataelementcontact)
    -   [8.148. DataElementMapping](#_dataelementmapping)
    -   [8.149. DataElementStringency](#_dataelementstringency)
    -   [8.150. Date](#_date)
    -   [8.151. DateTime](#_datetime)
    -   [8.152. DaysOfWeek](#_daysofweek)
    -   [8.153. Decimal](#_decimal)
    -   [8.154. DetectedIssue](#_detectedissue)
    -   [8.155. DetectedIssueMitigation](#_detectedissuemitigation)
    -   [8.156. DetectedIssueSeverity](#_detectedissueseverity)
    -   [8.157. Device](#_device)
    -   [8.158. DeviceComponent](#_devicecomponent)
    -   [8.159.
        DeviceComponentProductionSpecification](#_devicecomponentproductionspecification)
    -   [8.160. DeviceMetric](#_devicemetric)
    -   [8.161. DeviceMetricCalibration](#_devicemetriccalibration)
    -   [8.162.
        DeviceMetricCalibrationState](#_devicemetriccalibrationstate)
    -   [8.163.
        DeviceMetricCalibrationType](#_devicemetriccalibrationtype)
    -   [8.164. DeviceMetricCategory](#_devicemetriccategory)
    -   [8.165. DeviceMetricColor](#_devicemetriccolor)
    -   [8.166.
        DeviceMetricOperationalStatus](#_devicemetricoperationalstatus)
    -   [8.167. DeviceStatus](#_devicestatus)
    -   [8.168. DeviceUseRequest](#_deviceuserequest)
    -   [8.169. DeviceUseRequestPriority](#_deviceuserequestpriority)
    -   [8.170. DeviceUseRequestStatus](#_deviceuserequeststatus)
    -   [8.171. DeviceUseStatement](#_deviceusestatement)
    -   [8.172. DiagnosticOrder](#_diagnosticorder)
    -   [8.173. DiagnosticOrderEvent](#_diagnosticorderevent)
    -   [8.174. DiagnosticOrderItem](#_diagnosticorderitem)
    -   [8.175. DiagnosticOrderPriority](#_diagnosticorderpriority)
    -   [8.176. DiagnosticOrderStatus](#_diagnosticorderstatus)
    -   [8.177. DiagnosticReport](#_diagnosticreport)
    -   [8.178. DiagnosticReportImage](#_diagnosticreportimage)
    -   [8.179. DiagnosticReportStatus](#_diagnosticreportstatus)
    -   [8.180. DigitalMediaType](#_digitalmediatype)
    -   [8.181. Div](#_div)
    -   [8.182. DocumentManifest](#_documentmanifest)
    -   [8.183. DocumentManifestContent](#_documentmanifestcontent)
    -   [8.184. DocumentManifestRelated](#_documentmanifestrelated)
    -   [8.185. DocumentMode](#_documentmode)
    -   [8.186. DocumentReference](#_documentreference)
    -   [8.187. DocumentReferenceContent](#_documentreferencecontent)
    -   [8.188. DocumentReferenceContext](#_documentreferencecontext)
    -   [8.189. DocumentReferenceRelated](#_documentreferencerelated)
    -   [8.190.
        DocumentReferenceRelatesTo](#_documentreferencerelatesto)
    -   [8.191. DocumentRelationshipType](#_documentrelationshiptype)
    -   [8.192. Duration](#_duration)
    -   [8.193. ElementDefinition](#_elementdefinition)
    -   [8.194. ElementDefinitionBase](#_elementdefinitionbase)
    -   [8.195. ElementDefinitionBinding](#_elementdefinitionbinding)
    -   [8.196.
        ElementDefinitionConstraint](#_elementdefinitionconstraint)
    -   [8.197. ElementDefinitionMapping](#_elementdefinitionmapping)
    -   [8.198. ElementDefinitionSlicing](#_elementdefinitionslicing)
    -   [8.199. ElementDefinitionType](#_elementdefinitiontype)
    -   [8.200. EligibilityRequest](#_eligibilityrequest)
    -   [8.201. EligibilityResponse](#_eligibilityresponse)
    -   [8.202. Encounter](#_encounter)
    -   [8.203. EncounterClass](#_encounterclass)
    -   [8.204. EncounterHospitalization](#_encounterhospitalization)
    -   [8.205. EncounterLocation](#_encounterlocation)
    -   [8.206. EncounterLocationStatus](#_encounterlocationstatus)
    -   [8.207. EncounterParticipant](#_encounterparticipant)
    -   [8.208. EncounterState](#_encounterstate)
    -   [8.209. EncounterStatusHistory](#_encounterstatushistory)
    -   [8.210. EnrollmentRequest](#_enrollmentrequest)
    -   [8.211. EnrollmentResponse](#_enrollmentresponse)
    -   [8.212. EpisodeOfCare](#_episodeofcare)
    -   [8.213. EpisodeOfCareCareTeam](#_episodeofcarecareteam)
    -   [8.214. EpisodeOfCareStatus](#_episodeofcarestatus)
    -   [8.215.
        EpisodeOfCareStatusHistory](#_episodeofcarestatushistory)
    -   [8.216. EventTiming](#_eventtiming)
    -   [8.217. ExplanationOfBenefit](#_explanationofbenefit)
    -   [8.218. ExtensionContext](#_extensioncontext)
    -   [8.219. FamilyHistoryStatus](#_familyhistorystatus)
    -   [8.220. FamilyMemberHistory](#_familymemberhistory)
    -   [8.221.
        FamilyMemberHistoryCondition](#_familymemberhistorycondition)
    -   [8.222. FilterOperator](#_filteroperator)
    -   [8.223. Flag](#_flag)
    -   [8.224. FlagStatus](#_flagstatus)
    -   [8.225. Goal](#_goal)
    -   [8.226. GoalOutcome](#_goaloutcome)
    -   [8.227. GoalStatus](#_goalstatus)
    -   [8.228. Group](#_group)
    -   [8.229. GroupCharacteristic](#_groupcharacteristic)
    -   [8.230. GroupMember](#_groupmember)
    -   [8.231. GroupType](#_grouptype)
    -   [8.232. GuideDependencyType](#_guidedependencytype)
    -   [8.233. GuidePageKind](#_guidepagekind)
    -   [8.234. GuideResourcePurpose](#_guideresourcepurpose)
    -   [8.235. HTTPVerb](#_httpverb)
    -   [8.236. HealthcareService](#_healthcareservice)
    -   [8.237.
        HealthcareServiceAvailableTime](#_healthcareserviceavailabletime)
    -   [8.238.
        HealthcareServiceNotAvailable](#_healthcareservicenotavailable)
    -   [8.239.
        HealthcareServiceServiceType](#_healthcareserviceservicetype)
    -   [8.240. HumanName](#_humanname)
    -   [8.241. Id](#_id)
    -   [8.242. Identifier](#_identifier)
    -   [8.243. IdentifierUse](#_identifieruse)
    -   [8.244. IdentityAssuranceLevel](#_identityassurancelevel)
    -   [8.245. ImagingObjectSelection](#_imagingobjectselection)
    -   [8.246.
        ImagingObjectSelectionFrames](#_imagingobjectselectionframes)
    -   [8.247.
        ImagingObjectSelectionInstance](#_imagingobjectselectioninstance)
    -   [8.248.
        ImagingObjectSelectionSeries](#_imagingobjectselectionseries)
    -   [8.249.
        ImagingObjectSelectionStudy](#_imagingobjectselectionstudy)
    -   [8.250. ImagingStudy](#_imagingstudy)
    -   [8.251. ImagingStudyInstance](#_imagingstudyinstance)
    -   [8.252. ImagingStudySeries](#_imagingstudyseries)
    -   [8.253. Immunization](#_immunization)
    -   [8.254. ImmunizationExplanation](#_immunizationexplanation)
    -   [8.255. ImmunizationReaction](#_immunizationreaction)
    -   [8.256.
        ImmunizationRecommendation](#_immunizationrecommendation)
    -   [8.257.
        ImmunizationRecommendationDateCriterion](#_immunizationrecommendationdatecriterion)
    -   [8.258.
        ImmunizationRecommendationProtocol](#_immunizationrecommendationprotocol)
    -   [8.259.
        ImmunizationRecommendationRecommendation](#_immunizationrecommendationrecommendation)
    -   [8.260.
        ImmunizationVaccinationProtocol](#_immunizationvaccinationprotocol)
    -   [8.261. ImplementationGuide](#_implementationguide)
    -   [8.262.
        ImplementationGuideContact](#_implementationguidecontact)
    -   [8.263.
        ImplementationGuideDependency](#_implementationguidedependency)
    -   [8.264. ImplementationGuideGlobal](#_implementationguideglobal)
    -   [8.265.
        ImplementationGuidePackage](#_implementationguidepackage)
    -   [8.266. ImplementationGuidePage](#_implementationguidepage)
    -   [8.267.
        ImplementationGuideResource](#_implementationguideresource)
    -   [8.268. InstanceAvailability](#_instanceavailability)
    -   [8.269. Instant](#_instant)
    -   [8.270. Integer](#_integer)
    -   [8.271. IssueSeverity](#_issueseverity)
    -   [8.272. IssueType](#_issuetype)
    -   [8.273. LinkType](#_linktype)
    -   [8.274. List](#_list)
    -   [8.275. ListEntry](#_listentry)
    -   [8.276. ListMode](#_listmode)
    -   [8.277. ListStatus](#_liststatus)
    -   [8.278. Location](#_location)
    -   [8.279. LocationMode](#_locationmode)
    -   [8.280. LocationPosition](#_locationposition)
    -   [8.281. LocationStatus](#_locationstatus)
    -   [8.282. Markdown](#_markdown)
    -   [8.283. MeasmntPrinciple](#_measmntprinciple)
    -   [8.284. Media](#_media)
    -   [8.285. Medication](#_medication)
    -   [8.286. MedicationAdministration](#_medicationadministration)
    -   [8.287.
        MedicationAdministrationDosage](#_medicationadministrationdosage)
    -   [8.288.
        MedicationAdministrationStatus](#_medicationadministrationstatus)
    -   [8.289. MedicationBatch](#_medicationbatch)
    -   [8.290. MedicationContent](#_medicationcontent)
    -   [8.291. MedicationDispense](#_medicationdispense)
    -   [8.292.
        MedicationDispenseDosageInstruction](#_medicationdispensedosageinstruction)
    -   [8.293. MedicationDispenseStatus](#_medicationdispensestatus)
    -   [8.294.
        MedicationDispenseSubstitution](#_medicationdispensesubstitution)
    -   [8.295. MedicationIngredient](#_medicationingredient)
    -   [8.296. MedicationOrder](#_medicationorder)
    -   [8.297.
        MedicationOrderDispenseRequest](#_medicationorderdispenserequest)
    -   [8.298.
        MedicationOrderDosageInstruction](#_medicationorderdosageinstruction)
    -   [8.299. MedicationOrderStatus](#_medicationorderstatus)
    -   [8.300.
        MedicationOrderSubstitution](#_medicationordersubstitution)
    -   [8.301. MedicationPackage](#_medicationpackage)
    -   [8.302. MedicationProduct](#_medicationproduct)
    -   [8.303. MedicationStatement](#_medicationstatement)
    -   [8.304. MedicationStatementDosage](#_medicationstatementdosage)
    -   [8.305. MedicationStatementStatus](#_medicationstatementstatus)
    -   [8.306. MessageHeader](#_messageheader)
    -   [8.307. MessageHeaderDestination](#_messageheaderdestination)
    -   [8.308. MessageHeaderResponse](#_messageheaderresponse)
    -   [8.309. MessageHeaderSource](#_messageheadersource)
    -   [8.310.
        MessageSignificanceCategory](#_messagesignificancecategory)
    -   [8.311. Meta](#_meta)
    -   [8.312. Money](#_money)
    -   [8.313. NameUse](#_nameuse)
    -   [8.314. NamingSystem](#_namingsystem)
    -   [8.315. NamingSystemContact](#_namingsystemcontact)
    -   [8.316.
        NamingSystemIdentifierType](#_namingsystemidentifiertype)
    -   [8.317. NamingSystemType](#_namingsystemtype)
    -   [8.318. NamingSystemUniqueId](#_namingsystemuniqueid)
    -   [8.319. Narrative](#_narrative)
    -   [8.320. NarrativeStatus](#_narrativestatus)
    -   [8.321. NutritionOrder](#_nutritionorder)
    -   [8.322.
        NutritionOrderAdministration](#_nutritionorderadministration)
    -   [8.323.
        NutritionOrderEnteralFormula](#_nutritionorderenteralformula)
    -   [8.324. NutritionOrderNutrient](#_nutritionordernutrient)
    -   [8.325. NutritionOrderOralDiet](#_nutritionorderoraldiet)
    -   [8.326. NutritionOrderStatus](#_nutritionorderstatus)
    -   [8.327. NutritionOrderSupplement](#_nutritionordersupplement)
    -   [8.328. NutritionOrderTexture](#_nutritionordertexture)
    -   [8.329. Observation](#_observation)
    -   [8.330. ObservationComponent](#_observationcomponent)
    -   [8.331. ObservationReferenceRange](#_observationreferencerange)
    -   [8.332. ObservationRelated](#_observationrelated)
    -   [8.333.
        ObservationRelationshipType](#_observationrelationshiptype)
    -   [8.334. ObservationStatus](#_observationstatus)
    -   [8.335. Oid](#_oid)
    -   [8.336. OperationDefinition](#_operationdefinition)
    -   [8.337.
        OperationDefinitionBinding](#_operationdefinitionbinding)
    -   [8.338.
        OperationDefinitionContact](#_operationdefinitioncontact)
    -   [8.339.
        OperationDefinitionParameter](#_operationdefinitionparameter)
    -   [8.340. OperationKind](#_operationkind)
    -   [8.341. OperationOutcome](#_operationoutcome)
    -   [8.342. OperationOutcomeIssue](#_operationoutcomeissue)
    -   [8.343. OperationParameterUse](#_operationparameteruse)
    -   [8.344. Order](#_order)
    -   [8.345. OrderResponse](#_orderresponse)
    -   [8.346. OrderStatus](#_orderstatus)
    -   [8.347. OrderWhen](#_orderwhen)
    -   [8.348. Organization](#_organization)
    -   [8.349. OrganizationContact](#_organizationcontact)
    -   [8.350. Parameters](#_parameters)
    -   [8.351. ParametersParameter](#_parametersparameter)
    -   [8.352. ParticipantRequired](#_participantrequired)
    -   [8.353. ParticipantStatus](#_participantstatus)
    -   [8.354. ParticipationStatus](#_participationstatus)
    -   [8.355. Patient](#_patient)
    -   [8.356. PatientAnimal](#_patientanimal)
    -   [8.357. PatientCommunication](#_patientcommunication)
    -   [8.358. PatientContact](#_patientcontact)
    -   [8.359. PatientLink](#_patientlink)
    -   [8.360. PaymentNotice](#_paymentnotice)
    -   [8.361. PaymentReconciliation](#_paymentreconciliation)
    -   [8.362.
        PaymentReconciliationDetail](#_paymentreconciliationdetail)
    -   [8.363. PaymentReconciliationNote](#_paymentreconciliationnote)
    -   [8.364. Period](#_period)
    -   [8.365. Person](#_person)
    -   [8.366. PersonLink](#_personlink)
    -   [8.367. PositiveInt](#_positiveint)
    -   [8.368. Practitioner](#_practitioner)
    -   [8.369.
        PractitionerPractitionerRole](#_practitionerpractitionerrole)
    -   [8.370. PractitionerQualification](#_practitionerqualification)
    -   [8.371. Procedure](#_procedure)
    -   [8.372. ProcedureFocalDevice](#_procedurefocaldevice)
    -   [8.373. ProcedurePerformer](#_procedureperformer)
    -   [8.374. ProcedureRequest](#_procedurerequest)
    -   [8.375. ProcedureRequestPriority](#_procedurerequestpriority)
    -   [8.376. ProcedureRequestStatus](#_procedurerequeststatus)
    -   [8.377. ProcedureStatus](#_procedurestatus)
    -   [8.378. ProcessRequest](#_processrequest)
    -   [8.379. ProcessRequestItem](#_processrequestitem)
    -   [8.380. ProcessResponse](#_processresponse)
    -   [8.381. ProcessResponseNotes](#_processresponsenotes)
    -   [8.382. PropertyRepresentation](#_propertyrepresentation)
    -   [8.383. Provenance](#_provenance)
    -   [8.384. ProvenanceAgent](#_provenanceagent)
    -   [8.385. ProvenanceEntity](#_provenanceentity)
    -   [8.386. ProvenanceEntityRole](#_provenanceentityrole)
    -   [8.387. ProvenanceRelatedAgent](#_provenancerelatedagent)
    -   [8.388. Quantity](#_quantity)
    -   [8.389. QuantityComparator](#_quantitycomparator)
    -   [8.390. Questionnaire](#_questionnaire)
    -   [8.391. QuestionnaireGroup](#_questionnairegroup)
    -   [8.392. QuestionnaireQuestion](#_questionnairequestion)
    -   [8.393. QuestionnaireResponse](#_questionnaireresponse)
    -   [8.394.
        QuestionnaireResponseAnswer](#_questionnaireresponseanswer)
    -   [8.395.
        QuestionnaireResponseGroup](#_questionnaireresponsegroup)
    -   [8.396.
        QuestionnaireResponseQuestion](#_questionnaireresponsequestion)
    -   [8.397.
        QuestionnaireResponseStatus](#_questionnaireresponsestatus)
    -   [8.398. QuestionnaireStatus](#_questionnairestatus)
    -   [8.399. Range](#_range)
    -   [8.400. Ratio](#_ratio)
    -   [8.401. Reference](#_reference)
    -   [8.402. ReferralRequest](#_referralrequest)
    -   [8.403. ReferralStatus](#_referralstatus)
    -   [8.404. RelatedPerson](#_relatedperson)
    -   [8.405. ResourceContainer](#_resourcecontainer)
    -   [8.406. ResourceVersionPolicy](#_resourceversionpolicy)
    -   [8.407. ResponseType](#_responsetype)
    -   [8.408. RestfulConformanceMode](#_restfulconformancemode)
    -   [8.409. RiskAssessment](#_riskassessment)
    -   [8.410. RiskAssessmentPrediction](#_riskassessmentprediction)
    -   [8.411. SampledData](#_sampleddata)
    -   [8.412. SampledDataDataType](#_sampleddatadatatype)
    -   [8.413. Schedule](#_schedule)
    -   [8.414. SearchEntryMode](#_searchentrymode)
    -   [8.415. SearchModifierCode](#_searchmodifiercode)
    -   [8.416. SearchParameter](#_searchparameter)
    -   [8.417. SearchParameterContact](#_searchparametercontact)
    -   [8.418. Signature](#_signature)
    -   [8.419. SimpleQuantity](#_simplequantity)
    -   [8.420. SlicingRules](#_slicingrules)
    -   [8.421. Slot](#_slot)
    -   [8.422. SlotStatus](#_slotstatus)
    -   [8.423. Specimen](#_specimen)
    -   [8.424. SpecimenCollection](#_specimencollection)
    -   [8.425. SpecimenContainer](#_specimencontainer)
    -   [8.426. SpecimenStatus](#_specimenstatus)
    -   [8.427. SpecimenTreatment](#_specimentreatment)
    -   [8.428. String](#_string)
    -   [8.429. StructureDefinition](#_structuredefinition)
    -   [8.430.
        StructureDefinitionContact](#_structuredefinitioncontact)
    -   [8.431.
        StructureDefinitionDifferential](#_structuredefinitiondifferential)
    -   [8.432. StructureDefinitionKind](#_structuredefinitionkind)
    -   [8.433.
        StructureDefinitionMapping](#_structuredefinitionmapping)
    -   [8.434.
        StructureDefinitionSnapshot](#_structuredefinitionsnapshot)
    -   [8.435. Subscription](#_subscription)
    -   [8.436. SubscriptionChannel](#_subscriptionchannel)
    -   [8.437. SubscriptionChannelType](#_subscriptionchanneltype)
    -   [8.438. SubscriptionStatus](#_subscriptionstatus)
    -   [8.439. Substance](#_substance)
    -   [8.440. SubstanceIngredient](#_substanceingredient)
    -   [8.441. SubstanceInstance](#_substanceinstance)
    -   [8.442. SupplyDelivery](#_supplydelivery)
    -   [8.443. SupplyDeliveryStatus](#_supplydeliverystatus)
    -   [8.444. SupplyRequest](#_supplyrequest)
    -   [8.445. SupplyRequestStatus](#_supplyrequeststatus)
    -   [8.446. SupplyRequestWhen](#_supplyrequestwhen)
    -   [8.447. SystemRestfulInteraction](#_systemrestfulinteraction)
    -   [8.448. TestScript](#_testscript)
    -   [8.449. TestScriptAction](#_testscriptaction)
    -   [8.450. TestScriptAction1](#_testscriptaction1)
    -   [8.451. TestScriptAction2](#_testscriptaction2)
    -   [8.452. TestScriptAssert](#_testscriptassert)
    -   [8.453. TestScriptCapability](#_testscriptcapability)
    -   [8.454. TestScriptContact](#_testscriptcontact)
    -   [8.455. TestScriptFixture](#_testscriptfixture)
    -   [8.456. TestScriptLink](#_testscriptlink)
    -   [8.457. TestScriptMetadata](#_testscriptmetadata)
    -   [8.458. TestScriptOperation](#_testscriptoperation)
    -   [8.459. TestScriptRequestHeader](#_testscriptrequestheader)
    -   [8.460. TestScriptSetup](#_testscriptsetup)
    -   [8.461. TestScriptTeardown](#_testscriptteardown)
    -   [8.462. TestScriptTest](#_testscripttest)
    -   [8.463. TestScriptVariable](#_testscriptvariable)
    -   [8.464. Time](#_time)
    -   [8.465. Timing](#_timing)
    -   [8.466. TimingRepeat](#_timingrepeat)
    -   [8.467. TransactionMode](#_transactionmode)
    -   [8.468. TypeRestfulInteraction](#_typerestfulinteraction)
    -   [8.469. UnitsOfTime](#_unitsoftime)
    -   [8.470. UnknownContentCode](#_unknowncontentcode)
    -   [8.471. UnsignedInt](#_unsignedint)
    -   [8.472. Uri](#_uri)
    -   [8.473. Use](#_use)
    -   [8.474. Uuid](#_uuid)
    -   [8.475. ValueSet](#_valueset)
    -   [8.476. ValueSetCodeSystem](#_valuesetcodesystem)
    -   [8.477. ValueSetCompose](#_valuesetcompose)
    -   [8.478. ValueSetConcept](#_valuesetconcept)
    -   [8.479. ValueSetConcept1](#_valuesetconcept1)
    -   [8.480. ValueSetContact](#_valuesetcontact)
    -   [8.481. ValueSetContains](#_valuesetcontains)
    -   [8.482. ValueSetDesignation](#_valuesetdesignation)
    -   [8.483. ValueSetExpansion](#_valuesetexpansion)
    -   [8.484. ValueSetFilter](#_valuesetfilter)
    -   [8.485. ValueSetInclude](#_valuesetinclude)
    -   [8.486. ValueSetParameter](#_valuesetparameter)
    -   [8.487. VisionBase](#_visionbase)
    -   [8.488. VisionEyes](#_visioneyes)
    -   [8.489. VisionPrescription](#_visionprescription)
    -   [8.490.
        VisionPrescriptionDispense](#_visionprescriptiondispense)
    -   [8.491. XPathUsageType](#_xpathusagetype)

</div>

</div>

<div id="content">

<div class="sect1">

[](#_overview){.anchor}1. Overview {#_overview}
----------------------------------

<div class="sectionbody">

<div class="paragraph">

Spring-based FHIR REST API with a little Swagger!

</div>

<div class="sect2">

### [](#_version_information){.anchor}1.1. Version information {#_version_information}

<div class="paragraph">

*Version* : 2.0

</div>

</div>

<div class="sect2">

### [](#_contact_information){.anchor}1.2. Contact information {#_contact_information}

<div class="paragraph">

*Contact* : Steffen Kory

</div>

</div>

<div class="sect2">

### [](#_license_information){.anchor}1.3. License information {#_license_information}

<div class="paragraph">

*License* : Apache License Version 2.0\
*License URL* :
<https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE>\
*Terms of service* :
<http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open>

</div>

</div>

<div class="sect2">

### [](#_uri_scheme){.anchor}1.4. URI scheme {#_uri_scheme}

<div class="paragraph">

*Host* : localhost:8080\
*BasePath* : /

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}2. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_patient-controller_resource){.anchor}2.1. Patient-controller {#_patient-controller_resource}

<div class="paragraph">

Patient Controller

</div>

<div class="sect3">

#### [](#_findall_1){.anchor}2.1.1. findAll {#_findall_1}

<div class="literalblock">

<div class="content">

    GET /fhir/Patient

</div>

</div>

<div class="sect4">

##### [](#_responses){.anchor}Responses {#_responses}

  HTTP Code   Description    Schema
  ----------- -------------- --------------------
  **200**     Success        [Bundle](#_bundle)
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes){.anchor}Consumes {#_consumes}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces){.anchor}Produces {#_produces}

<div class="ulist">

-   `application/json+fhir`

</div>

</div>

</div>

<div class="sect3">

#### [](#_findbyien_1){.anchor}2.1.2. findByIen {#_findbyien_1}

<div class="literalblock">

<div class="content">

    GET /fhir/Patient/{ien}

</div>

</div>

<div class="sect4">

##### [](#_parameters){.anchor}Parameters {#_parameters}

  ----------------------------------------------------------
  Type       Name         Description     Schema   Default
  ---------- ------------ --------------- -------- ---------
  **Path**   **ien**\     Patient’s IEN   string   `"67"`
             *required*                            
  ----------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_2){.anchor}Responses {#_responses_2}

  HTTP Code   Description    Schema
  ----------- -------------- ----------------------
  **200**     Success        [Patient](#_patient)
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_2){.anchor}Consumes {#_consumes_2}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_2){.anchor}Produces {#_produces_2}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}3. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_conformance-controller_resource){.anchor}3.1. Conformance-controller {#_conformance-controller_resource}

<div class="paragraph">

Conformance Controller

</div>

<div class="sect3">

#### [](#_getmetadata){.anchor}3.1.1. getMetadata {#_getmetadata}

<div class="literalblock">

<div class="content">

    GET /fhir/Conformance/metadata

</div>

</div>

<div class="sect4">

##### [](#_responses_3){.anchor}Responses {#_responses_3}

  HTTP Code   Description    Schema
  ----------- -------------- ------------
  **200**     Success        object
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_3){.anchor}Consumes {#_consumes_3}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_3){.anchor}Produces {#_produces_3}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}4. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_observation-controller_resource){.anchor}4.1. Observation-controller {#_observation-controller_resource}

<div class="paragraph">

Observation Controller

</div>

<div class="sect3">

#### [](#_findallbypatient_1){.anchor}4.1.1. findAllByPatient {#_findallbypatient_1}

<div class="literalblock">

<div class="content">

    GET /fhir/Observation

</div>

</div>

<div class="sect4">

##### [](#_parameters_2){.anchor}Parameters {#_parameters_2}

  -------------------------------------------------------------
  Type        Name           Description     Schema   Default
  ----------- -------------- --------------- -------- ---------
  **Query**   **patient**\   Patient’s IEN   string   `"67"`
              *required*                              
  -------------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_4){.anchor}Responses {#_responses_4}

  HTTP Code   Description    Schema
  ----------- -------------- --------------------
  **200**     Success        [Bundle](#_bundle)
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_4){.anchor}Consumes {#_consumes_4}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_4){.anchor}Produces {#_produces_4}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}5. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_medication-order-controller_resource){.anchor}5.1. Medication-order-controller {#_medication-order-controller_resource}

<div class="paragraph">

Medication Order Controller

</div>

<div class="sect3">

#### [](#_createmedicationorder){.anchor}5.1.1. createMedicationOrder {#_createmedicationorder}

<div class="literalblock">

<div class="content">

    POST /fhir/MedicationOrder

</div>

</div>

<div class="sect4">

##### [](#_parameters_3){.anchor}Parameters {#_parameters_3}

  -----------------------------------------------------------------
  Type       Name                   Description            Schema
  ---------- ---------------------- ---------------------- --------
  **Body**   **medicationOrder**\   FHIR MedicationOrder   string
             *required*                                    
  -----------------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_5){.anchor}Responses {#_responses_5}

  HTTP Code   Description    Schema
  ----------- -------------- ------------
  **200**     OK             string
  **201**     Success        string
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_5){.anchor}Consumes {#_consumes_5}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_5){.anchor}Produces {#_produces_5}

<div class="ulist">

-   `application/json+fhir`

</div>

</div>

</div>

<div class="sect3">

#### [](#_findallbypatient){.anchor}5.1.2. findAllByPatient {#_findallbypatient}

<div class="literalblock">

<div class="content">

    GET /fhir/MedicationOrder

</div>

</div>

<div class="sect4">

##### [](#_parameters_4){.anchor}Parameters {#_parameters_4}

  -------------------------------------------------------------
  Type        Name           Description     Schema   Default
  ----------- -------------- --------------- -------- ---------
  **Query**   **patient**\   Patient’s IEN   string   `"67"`
              *required*                              
  -------------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_6){.anchor}Responses {#_responses_6}

  HTTP Code   Description    Schema
  ----------- -------------- --------------------
  **200**     Success        [Bundle](#_bundle)
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_6){.anchor}Consumes {#_consumes_6}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_6){.anchor}Produces {#_produces_6}

<div class="ulist">

-   `application/json+fhir`

</div>

</div>

</div>

<div class="sect3">

#### [](#_findbyien){.anchor}5.1.3. findByIen {#_findbyien}

<div class="literalblock">

<div class="content">

    GET /fhir/MedicationOrder/{ien}

</div>

</div>

<div class="sect4">

##### [](#_parameters_5){.anchor}Parameters {#_parameters_5}

  --------------------------------------------------------------
  Type       Name         Description         Schema   Default
  ---------- ------------ ------------------- -------- ---------
  **Path**   **ien**\     Medications’s IEN   string   `"67"`
             *required*                                
  --------------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_7){.anchor}Responses {#_responses_7}

  HTTP Code   Description    Schema
  ----------- -------------- --------------------------------------
  **200**     Success        [MedicationOrder](#_medicationorder)
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_7){.anchor}Consumes {#_consumes_7}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_7){.anchor}Produces {#_produces_7}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}6. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_device-metric-controller_resource){.anchor}6.1. Device-metric-controller {#_device-metric-controller_resource}

<div class="paragraph">

Device Metric Controller

</div>

<div class="sect3">

#### [](#_findall){.anchor}6.1.1. findAll {#_findall}

<div class="literalblock">

<div class="content">

    GET /fhir/DeviceMetric

</div>

</div>

<div class="sect4">

##### [](#_responses_8){.anchor}Responses {#_responses_8}

  HTTP Code   Description    Schema
  ----------- -------------- ------------
  **200**     Success        object
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_8){.anchor}Consumes {#_consumes_8}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_8){.anchor}Produces {#_produces_8}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_paths){.anchor}7. Resources {#_paths}
--------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_object-controller_resource){.anchor}7.1. Object-controller {#_object-controller_resource}

<div class="paragraph">

Object Controller

</div>

<div class="sect3">

#### [](#_getobject){.anchor}7.1.1. getObject {#_getobject}

<div class="literalblock">

<div class="content">

    GET /fhir/stub/{objectType}

</div>

</div>

<div class="sect4">

##### [](#_parameters_6){.anchor}Parameters {#_parameters_6}

  ----------------------------------------------------------------------
  Type       Name              Description        Schema   Default
  ---------- ----------------- ------------------ -------- -------------
  **Path**   **objectType**\   FHIR Object Type   string   `"patient"`
             *required*                                    
  ----------------------------------------------------------------------

</div>

<div class="sect4">

##### [](#_responses_9){.anchor}Responses {#_responses_9}

  HTTP Code   Description    Schema
  ----------- -------------- ------------
  **200**     Success        object
  **401**     Unauthorized   No Content
  **403**     Forbidden      No Content
  **404**     Not Found      No Content
  **500**     Failure        No Content

</div>

<div class="sect4">

##### [](#_consumes_9){.anchor}Consumes {#_consumes_9}

<div class="ulist">

-   `application/json`

</div>

</div>

<div class="sect4">

##### [](#_produces_9){.anchor}Produces {#_produces_9}

<div class="ulist">

-   `application/json+fhir`

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

</div>

<div class="sect1">

[](#_definitions){.anchor}8. Definitions {#_definitions}
----------------------------------------

<div class="sectionbody">

<div class="sect2">

### [](#_account){.anchor}8.1. Account {#_account}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **activePeriod**\        [Period](#_period)
  *optional*               

  **balance**\             [Money](#_money)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **coveragePeriod**\      [Period](#_period)
  *optional*               

  **currency**\            [Coding](#_coding)
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **owner**\               [Reference](#_reference)
  *optional*               

  **status**\              [AccountStatus](#_accountstatus)
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_accountstatus){.anchor}8.2. AccountStatus {#_accountstatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, INACTIVE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_actionlist){.anchor}8.3. ActionList {#_actionlist}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CANCEL, POLL, REPROCESS, STATUS)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_address){.anchor}8.4. Address {#_address}

  ------------------------------------------------------------
  Name              Schema
  ----------------- ------------------------------------------
  **city**\         string
  *optional*        

  **country**\      string
  *optional*        

  **district**\     string
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **line**\         &lt; string &gt; array
  *optional*        

  **period**\       [Period](#_period)
  *optional*        

  **postalCode**\   string
  *optional*        

  **state**\        string
  *optional*        

  **text**\         string
  *optional*        

  **type**\         [AddressType](#_addresstype)
  *optional*        

  **use**\          [AddressUse](#_addressuse)
  *optional*        
  ------------------------------------------------------------

</div>

<div class="sect2">

### [](#_addresstype){.anchor}8.5. AddressType {#_addresstype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (POSTAL, PHYSICAL, BOTH)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_addressuse){.anchor}8.6. AddressUse {#_addressuse}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (HOME, WORK, TEMP, OLD)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_age){.anchor}8.7. Age {#_age}

  --------------------------------------------------------------
  Name              Schema
  ----------------- --------------------------------------------
  **code**\         [Code](#_code)
  *optional*        

  **comparator**\   [QuantityComparator](#_quantitycomparator)
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **system**\       [Uri](#_uri)
  *optional*        

  **unit**\         string
  *optional*        

  **value**\        [Decimal](#_decimal)
  *optional*        
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_aggregationmode){.anchor}8.8. AggregationMode {#_aggregationmode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CONTAINED, REFERENCED, BUNDLED)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerance){.anchor}8.9. AllergyIntolerance {#_allergyintolerance}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **category**\            [AllergyIntoleranceCategory](#_allergyintolerancecategory)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **criticality**\         [AllergyIntoleranceCriticality](#_allergyintolerancecriticality)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **lastOccurence**\       [DateTime](#_datetime)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                [Annotation](#_annotation)
  *optional*               

  **onset**\               [DateTime](#_datetime)
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **reaction**\            &lt; [AllergyIntoleranceReaction](#_allergyintolerancereaction) &gt; array
  *optional*               

  **recordedDate**\        [DateTime](#_datetime)
  *optional*               

  **recorder**\            [Reference](#_reference)
  *optional*               

  **reporter**\            [Reference](#_reference)
  *optional*               

  **status**\              [AllergyIntoleranceStatus](#_allergyintolerancestatus)
  *optional*               

  **substance**\           [CodeableConcept](#_codeableconcept)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [AllergyIntoleranceType](#_allergyintolerancetype)
  *optional*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancecategory){.anchor}8.10. AllergyIntoleranceCategory {#_allergyintolerancecategory}

  --------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (FOOD, MEDICATION, ENVIRONMENT, OTHER)
  *optional*       
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancecertainty){.anchor}8.11. AllergyIntoleranceCertainty {#_allergyintolerancecertainty}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (UNLIKELY, LIKELY, CONFIRMED)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancecriticality){.anchor}8.12. AllergyIntoleranceCriticality {#_allergyintolerancecriticality}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CRITL, CRITH, CRITU)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancereaction){.anchor}8.13. AllergyIntoleranceReaction {#_allergyintolerancereaction}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **certainty**\           [AllergyIntoleranceCertainty](#_allergyintolerancecertainty)
  *optional*               

  **description**\         string
  *optional*               

  **exposureRoute**\       [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **manifestation**\       &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                [Annotation](#_annotation)
  *optional*               

  **onset**\               [DateTime](#_datetime)
  *optional*               

  **severity**\            [AllergyIntoleranceSeverity](#_allergyintoleranceseverity)
  *optional*               

  **substance**\           [CodeableConcept](#_codeableconcept)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintoleranceseverity){.anchor}8.14. AllergyIntoleranceSeverity {#_allergyintoleranceseverity}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (MILD, MODERATE, SEVERE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancestatus){.anchor}8.15. AllergyIntoleranceStatus {#_allergyintolerancestatus}

  ---------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, UNCONFIRMED, CONFIRMED, INACTIVE, RESOLVED, REFUTED, ENTERED\_IN\_ERROR)
  *optional*       
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_allergyintolerancetype){.anchor}8.16. AllergyIntoleranceType {#_allergyintolerancetype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ALLERGY, INTOLERANCE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_annotation){.anchor}8.17. Annotation {#_annotation}

  -----------------------------------------------------------------
  Name                   Schema
  ---------------------- ------------------------------------------
  **authorReference**\   [Reference](#_reference)
  *optional*             

  **authorString**\      string
  *optional*             

  **extension**\         &lt; [Extension](#_extension) &gt; array
  *optional*             

  **id**\                string
  *optional*             

  **text**\              string
  *required*             

  **time**\              [DateTime](#_datetime)
  *optional*             
  -----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_answerformat){.anchor}8.18. AnswerFormat {#_answerformat}

  --------------------------------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (BOOLEAN, DECIMAL, INTEGER, DATE, DATE\_TIME, INSTANT, TIME, STRING, TEXT, URL, CHOICE, OPEN\_CHOICE, ATTACHMENT, REFERENCE, QUANTITY)
  *optional*       
  --------------------------------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_appointment){.anchor}8.19. Appointment {#_appointment}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **comment**\             string
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **end**\                 [Instant](#_instant)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **minutesDuration**\     [PositiveInt](#_positiveint)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **participant**\         &lt; [AppointmentParticipant](#_appointmentparticipant) &gt; array
  *required*               

  **priority**\            [UnsignedInt](#_unsignedint)
  *optional*               

  **reason**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **slot**\                &lt; [Reference](#_reference) &gt; array
  *optional*               

  **start**\               [Instant](#_instant)
  *optional*               

  **status**\              [AppointmentStatus](#_appointmentstatus)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_appointmentparticipant){.anchor}8.20. AppointmentParticipant {#_appointmentparticipant}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **actor**\               [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **required**\            [ParticipantRequired](#_participantrequired)
  *optional*               

  **status**\              [ParticipationStatus](#_participationstatus)
  *required*               

  **type**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_appointmentresponse){.anchor}8.21. AppointmentResponse {#_appointmentresponse}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **actor**\               [Reference](#_reference)
  *optional*               

  **appointment**\         [Reference](#_reference)
  *required*               

  **comment**\             string
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **end**\                 [Instant](#_instant)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **participantStatus**\   [ParticipantStatus](#_participantstatus)
  *required*               

  **participantType**\     &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **start**\               [Instant](#_instant)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_appointmentstatus){.anchor}8.22. AppointmentStatus {#_appointmentstatus}

  ------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, PENDING, BOOKED, ARRIVED, FULFILLED, CANCELLED, NOSHOW)
  *optional*       
  ------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_assertiondirectiontype){.anchor}8.23. AssertionDirectionType {#_assertiondirectiontype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (RESPONSE, REQUEST)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_assertionoperatortype){.anchor}8.24. AssertionOperatorType {#_assertionoperatortype}

  ---------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (EQUALS, NOT\_EQUALS, IN, NOT\_IN, GREATER\_THAN, LESS\_THAN, EMPTY, NOT\_EMPTY, CONTAINS, NOT\_CONTAINS)
  *optional*       
  ---------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_assertionresponsetypes){.anchor}8.25. AssertionResponseTypes {#_assertionresponsetypes}

  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (OKAY, CREATED, NO\_CONTENT, NOT\_MODIFIED, BAD, FORBIDDEN, NOT\_FOUND, METHOD\_NOT\_ALLOWED, CONFLICT, GONE, PRECONDITION\_FAILED, UNPROCESSABLE)
  *optional*       
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_attachment){.anchor}8.26. Attachment {#_attachment}

  -------------------------------------------------------------
  Name               Schema
  ------------------ ------------------------------------------
  **contentType**\   [Code](#_code)
  *optional*         

  **creation**\      [DateTime](#_datetime)
  *optional*         

  **data**\          [Base64Binary](#_base64binary)
  *optional*         

  **extension**\     &lt; [Extension](#_extension) &gt; array
  *optional*         

  **hash**\          [Base64Binary](#_base64binary)
  *optional*         

  **id**\            string
  *optional*         

  **language**\      [Code](#_code)
  *optional*         

  **size**\          [UnsignedInt](#_unsignedint)
  *optional*         

  **title**\         string
  *optional*         

  **url**\           [Uri](#_uri)
  *optional*         
  -------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditevent){.anchor}8.27. AuditEvent {#_auditevent}

  -------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **event**\               [AuditEventEvent](#_auditeventevent)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **object**\              &lt; [AuditEventObject](#_auditeventobject) &gt; array
  *optional*               

  **participant**\         &lt; [AuditEventParticipant](#_auditeventparticipant) &gt; array
  *required*               

  **source**\              [AuditEventSource](#_auditeventsource)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventaction){.anchor}8.28. AuditEventAction {#_auditeventaction}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (C, R, U, D, E)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventdetail){.anchor}8.29. AuditEventDetail {#_auditeventdetail}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **type**\                string
  *required*               

  **value**\               [Base64Binary](#_base64binary)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventevent){.anchor}8.30. AuditEventEvent {#_auditeventevent}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **action**\              [AuditEventAction](#_auditeventaction)
  *optional*               

  **dateTime**\            [Instant](#_instant)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **outcome**\             [AuditEventOutcome](#_auditeventoutcome)
  *optional*               

  **outcomeDesc**\         string
  *optional*               

  **purposeOfEvent**\      &lt; [Coding](#_coding) &gt; array
  *optional*               

  **subtype**\             &lt; [Coding](#_coding) &gt; array
  *optional*               

  **type**\                [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventnetwork){.anchor}8.31. AuditEventNetwork {#_auditeventnetwork}

  -------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------
  **address**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **type**\                [AuditEventParticipantNetworkType](#_auditeventparticipantnetworktype)
  *optional*               
  -------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventobject){.anchor}8.32. AuditEventObject {#_auditeventobject}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **description**\         string
  *optional*               

  **detail**\              &lt; [AuditEventDetail](#_auditeventdetail) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **lifecycle**\           [Coding](#_coding)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **query**\               [Base64Binary](#_base64binary)
  *optional*               

  **reference**\           [Reference](#_reference)
  *optional*               

  **role**\                [Coding](#_coding)
  *optional*               

  **securityLabel**\       &lt; [Coding](#_coding) &gt; array
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventoutcome){.anchor}8.33. AuditEventOutcome {#_auditeventoutcome}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventparticipant){.anchor}8.34. AuditEventParticipant {#_auditeventparticipant}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **altId**\               string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **location**\            [Reference](#_reference)
  *optional*               

  **media**\               [Coding](#_coding)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **network**\             [AuditEventNetwork](#_auditeventnetwork)
  *optional*               

  **policy**\              &lt; [Uri](#_uri) &gt; array
  *optional*               

  **purposeOfUse**\        &lt; [Coding](#_coding) &gt; array
  *optional*               

  **reference**\           [Reference](#_reference)
  *optional*               

  **requestor**\           boolean
  *required*               

  **role**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **userId**\              [Identifier](#_identifier)
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventparticipantnetworktype){.anchor}8.35. AuditEventParticipantNetworkType {#_auditeventparticipantnetworktype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_auditeventsource){.anchor}8.36. AuditEventSource {#_auditeventsource}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **site**\                string
  *optional*               

  **type**\                &lt; [Coding](#_coding) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_base64binary){.anchor}8.37. Base64Binary {#_base64binary}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       &lt; string(byte) &gt; array
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_basic){.anchor}8.38. Basic {#_basic}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **created**\             string(date)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_binary){.anchor}8.39. Binary {#_binary}

  -----------------------------------------------------
  Name                 Schema
  -------------------- --------------------------------
  **content**\         [Base64Binary](#_base64binary)
  *required*           

  **contentType**\     [Code](#_code)
  *required*           

  **id**\              [Id](#_id)
  *optional*           

  **implicitRules**\   [Uri](#_uri)
  *optional*           

  **language**\        [Code](#_code)
  *optional*           

  **meta**\            [Meta](#_meta)
  *optional*           
  -----------------------------------------------------

</div>

<div class="sect2">

### [](#_bindingstrength){.anchor}8.40. BindingStrength {#_bindingstrength}

  ------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REQUIRED, EXTENSIBLE, PREFERRED, EXAMPLE)
  *optional*       
  ------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bodysite){.anchor}8.41. BodySite {#_bodysite}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **image**\               &lt; [Attachment](#_attachment) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifier**\            &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_boolean){.anchor}8.42. Boolean {#_boolean}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       boolean
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundle){.anchor}8.43. Bundle {#_bundle}

  -------------------------------------------------------------------
  Name                 Schema
  -------------------- ----------------------------------------------
  **entry**\           &lt; [BundleEntry](#_bundleentry) &gt; array
  *optional*           

  **id**\              [Id](#_id)
  *optional*           

  **implicitRules**\   [Uri](#_uri)
  *optional*           

  **language**\        [Code](#_code)
  *optional*           

  **link**\            &lt; [BundleLink](#_bundlelink) &gt; array
  *optional*           

  **meta**\            [Meta](#_meta)
  *optional*           

  **signature**\       [Signature](#_signature)
  *optional*           

  **total**\           [UnsignedInt](#_unsignedint)
  *optional*           

  **type**\            [BundleType](#_bundletype)
  *required*           
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundleentry){.anchor}8.44. BundleEntry {#_bundleentry}

  ---------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fullUrl**\             [Uri](#_uri)
  *optional*               

  **id**\                  string
  *optional*               

  **link**\                &lt; [BundleLink](#_bundlelink) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **request**\             [BundleRequest](#_bundlerequest)
  *optional*               

  **resource**\            [ResourceContainer](#_resourcecontainer)
  *optional*               

  **response**\            [BundleResponse](#_bundleresponse)
  *optional*               

  **search**\              [BundleSearch](#_bundlesearch)
  *optional*               
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundlelink){.anchor}8.45. BundleLink {#_bundlelink}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **relation**\            string
  *required*               

  **url**\                 [Uri](#_uri)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundlerequest){.anchor}8.46. BundleRequest {#_bundlerequest}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **ifMatch**\             string
  *optional*               

  **ifModifiedSince**\     [Instant](#_instant)
  *optional*               

  **ifNoneExist**\         string
  *optional*               

  **ifNoneMatch**\         string
  *optional*               

  **method**\              [HTTPVerb](#_httpverb)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundleresponse){.anchor}8.47. BundleResponse {#_bundleresponse}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **etag**\                string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **lastModified**\        [Instant](#_instant)
  *optional*               

  **location**\            [Uri](#_uri)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **status**\              string
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundlesearch){.anchor}8.48. BundleSearch {#_bundlesearch}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **mode**\                [SearchEntryMode](#_searchentrymode)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **score**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_bundletype){.anchor}8.49. BundleType {#_bundletype}

  ---------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (DOCUMENT, MESSAGE, TRANSACTION, TRANSACTION\_RESPONSE, BATCH, BATCH\_RESPONSE, HISTORY, SEARCHSET, COLLECTION)
  *optional*       
  ---------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplan){.anchor}8.50. CarePlan {#_careplan}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **activity**\            &lt; [CarePlanActivity](#_careplanactivity) &gt; array
  *optional*               

  **addresses**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **author**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **category**\            &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **context**\             [Reference](#_reference)
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **goal**\                &lt; [Reference](#_reference) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modified**\            [DateTime](#_datetime)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                [Annotation](#_annotation)
  *optional*               

  **participant**\         &lt; [CarePlanParticipant](#_careplanparticipant) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **relatedPlan**\         &lt; [CarePlanRelatedPlan](#_careplanrelatedplan) &gt; array
  *optional*               

  **status**\              [CarePlanStatus](#_careplanstatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **support**\             &lt; [Reference](#_reference) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanactivity){.anchor}8.51. CarePlanActivity {#_careplanactivity}

  ---------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------
  **actionResulting**\     &lt; [Reference](#_reference) &gt; array
  *optional*               

  **detail**\              [CarePlanDetail](#_careplandetail)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **progress**\            &lt; [Annotation](#_annotation) &gt; array
  *optional*               

  **reference**\           [Reference](#_reference)
  *optional*               
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanactivitystatus){.anchor}8.52. CarePlanActivityStatus {#_careplanactivitystatus}

  -----------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NOT\_STARTED, SCHEDULED, IN\_PROGRESS, ON\_HOLD, COMPLETED, CANCELLED)
  *optional*       
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplandetail){.anchor}8.53. CarePlanDetail {#_careplandetail}

  ------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- ------------------------------------------------------
  **category**\                 [CodeableConcept](#_codeableconcept)
  *optional*                    

  **code**\                     [CodeableConcept](#_codeableconcept)
  *optional*                    

  **dailyAmount**\              [SimpleQuantity](#_simplequantity)
  *optional*                    

  **description**\              string
  *optional*                    

  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **goal**\                     &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **id**\                       string
  *optional*                    

  **location**\                 [Reference](#_reference)
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **performer**\                &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **productCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                    

  **productReference**\         [Reference](#_reference)
  *optional*                    

  **prohibited**\               boolean
  *required*                    

  **quantity**\                 [SimpleQuantity](#_simplequantity)
  *optional*                    

  **reasonCode**\               &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **reasonReference**\          &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **scheduledPeriod**\          [Period](#_period)
  *optional*                    

  **scheduledString**\          string
  *optional*                    

  **scheduledTiming**\          [Timing](#_timing)
  *optional*                    

  **status**\                   [CarePlanActivityStatus](#_careplanactivitystatus)
  *optional*                    

  **statusReason**\             [CodeableConcept](#_codeableconcept)
  *optional*                    
  ------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanparticipant){.anchor}8.54. CarePlanParticipant {#_careplanparticipant}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **member**\              [Reference](#_reference)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **role**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanrelatedplan){.anchor}8.55. CarePlanRelatedPlan {#_careplanrelatedplan}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **code**\                [CarePlanRelationship](#_careplanrelationship)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **plan**\                [Reference](#_reference)
  *required*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanrelationship){.anchor}8.56. CarePlanRelationship {#_careplanrelationship}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INCLUDES, REPLACES, FULFILLS)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_careplanstatus){.anchor}8.57. CarePlanStatus {#_careplanstatus}

  -----------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, DRAFT, ACTIVE, COMPLETED, CANCELLED)
  *optional*       
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claim){.anchor}8.58. Claim {#_claim}

  ---------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------
  **accident**\                string(date)
  *optional*                   

  **accidentType**\            [Coding](#_coding)
  *optional*                   

  **additionalMaterials**\     &lt; [Coding](#_coding) &gt; array
  *optional*                   

  **condition**\               &lt; [Coding](#_coding) &gt; array
  *optional*                   

  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **coverage**\                &lt; [ClaimCoverage](#_claimcoverage) &gt; array
  *optional*                   

  **created**\                 [DateTime](#_datetime)
  *optional*                   

  **diagnosis**\               &lt; [ClaimDiagnosis](#_claimdiagnosis) &gt; array
  *optional*                   

  **enterer**\                 [Reference](#_reference)
  *optional*                   

  **exception**\               &lt; [Coding](#_coding) &gt; array
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **facility**\                [Reference](#_reference)
  *optional*                   

  **fundsReserve**\            [Coding](#_coding)
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **interventionException**\   &lt; [Coding](#_coding) &gt; array
  *optional*                   

  **item**\                    &lt; [ClaimItem](#_claimitem) &gt; array
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **missingTeeth**\            &lt; [ClaimMissingTeeth](#_claimmissingteeth) &gt; array
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **organization**\            [Reference](#_reference)
  *optional*                   

  **originalPrescription**\    [Reference](#_reference)
  *optional*                   

  **originalRuleset**\         [Coding](#_coding)
  *optional*                   

  **patient**\                 [Reference](#_reference)
  *required*                   

  **payee**\                   [ClaimPayee](#_claimpayee)
  *optional*                   

  **prescription**\            [Reference](#_reference)
  *optional*                   

  **priority**\                [Coding](#_coding)
  *optional*                   

  **provider**\                [Reference](#_reference)
  *optional*                   

  **referral**\                [Reference](#_reference)
  *optional*                   

  **ruleset**\                 [Coding](#_coding)
  *optional*                   

  **school**\                  string
  *optional*                   

  **target**\                  [Reference](#_reference)
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   

  **type**\                    [ClaimType](#_claimtype)
  *required*                   

  **use**\                     [Use](#_use)
  *optional*                   
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimcoverage){.anchor}8.59. ClaimCoverage {#_claimcoverage}

  ---------------------------------------------------------------------
  Name                       Schema
  -------------------------- ------------------------------------------
  **businessArrangement**\   string
  *optional*                 

  **claimResponse**\         [Reference](#_reference)
  *optional*                 

  **coverage**\              [Reference](#_reference)
  *required*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **focal**\                 boolean
  *required*                 

  **id**\                    string
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **preAuthRef**\            &lt; string &gt; array
  *optional*                 

  **relationship**\          [Coding](#_coding)
  *required*                 

  **sequence**\              [PositiveInt](#_positiveint)
  *required*                 
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimdetail){.anchor}8.60. ClaimDetail {#_claimdetail}

  -----------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **factor**\              [Decimal](#_decimal)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **net**\                 [Money](#_money)
  *optional*               

  **points**\              [Decimal](#_decimal)
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **sequence**\            [PositiveInt](#_positiveint)
  *required*               

  **service**\             [Coding](#_coding)
  *required*               

  **subDetail**\           &lt; [ClaimSubDetail](#_claimsubdetail) &gt; array
  *optional*               

  **type**\                [Coding](#_coding)
  *required*               

  **udi**\                 [Coding](#_coding)
  *optional*               

  **unitPrice**\           [Money](#_money)
  *optional*               
  -----------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimdiagnosis){.anchor}8.61. ClaimDiagnosis {#_claimdiagnosis}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **diagnosis**\           [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **sequence**\            [PositiveInt](#_positiveint)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimitem){.anchor}8.62. ClaimItem {#_claimitem}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **bodySite**\            [Coding](#_coding)
  *optional*               

  **detail**\              &lt; [ClaimDetail](#_claimdetail) &gt; array
  *optional*               

  **diagnosisLinkId**\     &lt; [PositiveInt](#_positiveint) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **factor**\              [Decimal](#_decimal)
  *optional*               

  **id**\                  string
  *optional*               

  **modifier**\            &lt; [Coding](#_coding) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **net**\                 [Money](#_money)
  *optional*               

  **points**\              [Decimal](#_decimal)
  *optional*               

  **prosthesis**\          [ClaimProsthesis](#_claimprosthesis)
  *optional*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **sequence**\            [PositiveInt](#_positiveint)
  *required*               

  **service**\             [Coding](#_coding)
  *required*               

  **serviceDate**\         string(date)
  *optional*               

  **subSite**\             &lt; [Coding](#_coding) &gt; array
  *optional*               

  **type**\                [Coding](#_coding)
  *required*               

  **udi**\                 [Coding](#_coding)
  *optional*               

  **unitPrice**\           [Money](#_money)
  *optional*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimmissingteeth){.anchor}8.63. ClaimMissingTeeth {#_claimmissingteeth}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **extractionDate**\      string(date)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              [Coding](#_coding)
  *optional*               

  **tooth**\               [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimpayee){.anchor}8.64. ClaimPayee {#_claimpayee}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **person**\              [Reference](#_reference)
  *optional*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimprosthesis){.anchor}8.65. ClaimProsthesis {#_claimprosthesis}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **initial**\             boolean
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **priorDate**\           string(date)
  *optional*               

  **priorMaterial**\       [Coding](#_coding)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponse){.anchor}8.66. ClaimResponse {#_claimresponse}

  -------------------------------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ------------------------------------------------------------------
  **addItem**\                   &lt; [ClaimResponseAddItem](#_claimresponseadditem) &gt; array
  *optional*                     

  **contained**\                 &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                     

  **coverage**\                  &lt; [ClaimResponseCoverage](#_claimresponsecoverage) &gt; array
  *optional*                     

  **created**\                   [DateTime](#_datetime)
  *optional*                     

  **disposition**\               string
  *optional*                     

  **error**\                     &lt; [ClaimResponseError](#_claimresponseerror) &gt; array
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **form**\                      [Coding](#_coding)
  *optional*                     

  **id**\                        [Id](#_id)
  *optional*                     

  **identifier**\                &lt; [Identifier](#_identifier) &gt; array
  *optional*                     

  **implicitRules**\             [Uri](#_uri)
  *optional*                     

  **item**\                      &lt; [ClaimResponseItem](#_claimresponseitem) &gt; array
  *optional*                     

  **language**\                  [Code](#_code)
  *optional*                     

  **meta**\                      [Meta](#_meta)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **note**\                      &lt; [ClaimResponseNote](#_claimresponsenote) &gt; array
  *optional*                     

  **organization**\              [Reference](#_reference)
  *optional*                     

  **originalRuleset**\           [Coding](#_coding)
  *optional*                     

  **outcome**\                   [Code](#_code)
  *optional*                     

  **payeeType**\                 [Coding](#_coding)
  *optional*                     

  **paymentAdjustment**\         [Money](#_money)
  *optional*                     

  **paymentAdjustmentReason**\   [Coding](#_coding)
  *optional*                     

  **paymentAmount**\             [Money](#_money)
  *optional*                     

  **paymentDate**\               string(date)
  *optional*                     

  **paymentRef**\                [Identifier](#_identifier)
  *optional*                     

  **request**\                   [Reference](#_reference)
  *optional*                     

  **requestOrganization**\       [Reference](#_reference)
  *optional*                     

  **requestProvider**\           [Reference](#_reference)
  *optional*                     

  **reserved**\                  [Coding](#_coding)
  *optional*                     

  **ruleset**\                   [Coding](#_coding)
  *optional*                     

  **text**\                      [Narrative](#_narrative)
  *optional*                     

  **totalBenefit**\              [Money](#_money)
  *optional*                     

  **totalCost**\                 [Money](#_money)
  *optional*                     

  **unallocDeductable**\         [Money](#_money)
  *optional*                     
  -------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadditem){.anchor}8.67. ClaimResponseAddItem {#_claimresponseadditem}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **adjudication**\        &lt; [ClaimResponseAdjudication3](#_claimresponseadjudication3) &gt; array
  *optional*               

  **detail**\              &lt; [ClaimResponseDetail1](#_claimresponsedetail1) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fee**\                 [Money](#_money)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **noteNumberLinkId**\    &lt; [PositiveInt](#_positiveint) &gt; array
  *optional*               

  **sequenceLinkId**\      &lt; [PositiveInt](#_positiveint) &gt; array
  *optional*               

  **service**\             [Coding](#_coding)
  *required*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadjudication){.anchor}8.68. ClaimResponseAdjudication {#_claimresponseadjudication}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadjudication1){.anchor}8.69. ClaimResponseAdjudication1 {#_claimresponseadjudication1}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadjudication2){.anchor}8.70. ClaimResponseAdjudication2 {#_claimresponseadjudication2}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadjudication3){.anchor}8.71. ClaimResponseAdjudication3 {#_claimresponseadjudication3}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseadjudication4){.anchor}8.72. ClaimResponseAdjudication4 {#_claimresponseadjudication4}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponsecoverage){.anchor}8.73. ClaimResponseCoverage {#_claimresponsecoverage}

  ---------------------------------------------------------------------
  Name                       Schema
  -------------------------- ------------------------------------------
  **businessArrangement**\   string
  *optional*                 

  **claimResponse**\         [Reference](#_reference)
  *optional*                 

  **coverage**\              [Reference](#_reference)
  *required*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **focal**\                 boolean
  *required*                 

  **id**\                    string
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **preAuthRef**\            &lt; string &gt; array
  *optional*                 

  **relationship**\          [Coding](#_coding)
  *required*                 

  **sequence**\              [PositiveInt](#_positiveint)
  *required*                 
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponsedetail){.anchor}8.74. ClaimResponseDetail {#_claimresponsedetail}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **adjudication**\        &lt; [ClaimResponseAdjudication1](#_claimresponseadjudication1) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **sequenceLinkId**\      [PositiveInt](#_positiveint)
  *required*               

  **subDetail**\           &lt; [ClaimResponseSubDetail](#_claimresponsesubdetail) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponsedetail1){.anchor}8.75. ClaimResponseDetail1 {#_claimresponsedetail1}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **adjudication**\        &lt; [ClaimResponseAdjudication4](#_claimresponseadjudication4) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fee**\                 [Money](#_money)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **service**\             [Coding](#_coding)
  *required*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseerror){.anchor}8.76. ClaimResponseError {#_claimresponseerror}

  -------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ------------------------------------------
  **code**\                      [Coding](#_coding)
  *required*                     

  **detailSequenceLinkId**\      [PositiveInt](#_positiveint)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        string
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **sequenceLinkId**\            [PositiveInt](#_positiveint)
  *optional*                     

  **subdetailSequenceLinkId**\   [PositiveInt](#_positiveint)
  *optional*                     
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponseitem){.anchor}8.77. ClaimResponseItem {#_claimresponseitem}

  ---------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------
  **adjudication**\        &lt; [ClaimResponseAdjudication](#_claimresponseadjudication) &gt; array
  *optional*               

  **detail**\              &lt; [ClaimResponseDetail](#_claimresponsedetail) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **noteNumber**\          &lt; [PositiveInt](#_positiveint) &gt; array
  *optional*               

  **sequenceLinkId**\      [PositiveInt](#_positiveint)
  *required*               
  ---------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponsenote){.anchor}8.78. ClaimResponseNote {#_claimresponsenote}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **number**\              [PositiveInt](#_positiveint)
  *optional*               

  **text**\                string
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimresponsesubdetail){.anchor}8.79. ClaimResponseSubDetail {#_claimresponsesubdetail}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **adjudication**\        &lt; [ClaimResponseAdjudication2](#_claimresponseadjudication2) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **sequenceLinkId**\      [PositiveInt](#_positiveint)
  *required*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimsubdetail){.anchor}8.80. ClaimSubDetail {#_claimsubdetail}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **factor**\              [Decimal](#_decimal)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **net**\                 [Money](#_money)
  *optional*               

  **points**\              [Decimal](#_decimal)
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **sequence**\            [PositiveInt](#_positiveint)
  *required*               

  **service**\             [Coding](#_coding)
  *required*               

  **type**\                [Coding](#_coding)
  *required*               

  **udi**\                 [Coding](#_coding)
  *optional*               

  **unitPrice**\           [Money](#_money)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_claimtype){.anchor}8.81. ClaimType {#_claimtype}

  -----------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INSTITUTIONAL, ORAL, PHARMACY, PROFESSIONAL, VISION)
  *optional*       
  -----------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_clinicalimpression){.anchor}8.82. ClinicalImpression {#_clinicalimpression}

  ----------------------------------------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- ----------------------------------------------------------------------------------------
  **action**\                   &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **assessor**\                 [Reference](#_reference)
  *optional*                    

  **contained**\                &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                    

  **date**\                     [DateTime](#_datetime)
  *optional*                    

  **description**\              string
  *optional*                    

  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **finding**\                  &lt; [ClinicalImpressionFinding](#_clinicalimpressionfinding) &gt; array
  *optional*                    

  **id**\                       [Id](#_id)
  *optional*                    

  **implicitRules**\            [Uri](#_uri)
  *optional*                    

  **investigations**\           &lt; [ClinicalImpressionInvestigations](#_clinicalimpressioninvestigations) &gt; array
  *optional*                    

  **language**\                 [Code](#_code)
  *optional*                    

  **meta**\                     [Meta](#_meta)
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **patient**\                  [Reference](#_reference)
  *required*                    

  **plan**\                     &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **previous**\                 [Reference](#_reference)
  *optional*                    

  **problem**\                  &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **prognosis**\                string
  *optional*                    

  **protocol**\                 [Uri](#_uri)
  *optional*                    

  **resolved**\                 &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **ruledOut**\                 &lt; [ClinicalImpressionRuledOut](#_clinicalimpressionruledout) &gt; array
  *optional*                    

  **status**\                   [ClinicalImpressionStatus](#_clinicalimpressionstatus)
  *required*                    

  **summary**\                  string
  *optional*                    

  **text**\                     [Narrative](#_narrative)
  *optional*                    

  **triggerCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                    

  **triggerReference**\         [Reference](#_reference)
  *optional*                    
  ----------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_clinicalimpressionfinding){.anchor}8.83. ClinicalImpressionFinding {#_clinicalimpressionfinding}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **cause**\               string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_clinicalimpressioninvestigations){.anchor}8.84. ClinicalImpressionInvestigations {#_clinicalimpressioninvestigations}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                &lt; [Reference](#_reference) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_clinicalimpressionruledout){.anchor}8.85. ClinicalImpressionRuledOut {#_clinicalimpressionruledout}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              string
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_clinicalimpressionstatus){.anchor}8.86. ClinicalImpressionStatus {#_clinicalimpressionstatus}

  ---------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, COMPLETED, ENTERED\_IN\_ERROR)
  *optional*       
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_code){.anchor}8.87. Code {#_code}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_codeableconcept){.anchor}8.88. CodeableConcept {#_codeableconcept}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **coding**\      &lt; [Coding](#_coding) &gt; array
  *optional*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **text**\        string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_coding){.anchor}8.89. Coding {#_coding}

  --------------------------------------------------------------
  Name                Schema
  ------------------- ------------------------------------------
  **code**\           [Code](#_code)
  *optional*          

  **display**\        string
  *optional*          

  **extension**\      &lt; [Extension](#_extension) &gt; array
  *optional*          

  **id**\             string
  *optional*          

  **system**\         [Uri](#_uri)
  *optional*          

  **userSelected**\   boolean
  *optional*          

  **version**\        string
  *optional*          
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communication){.anchor}8.90. Communication {#_communication}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **category**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **medium**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **payload**\             &lt; [CommunicationPayload](#_communicationpayload) &gt; array
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **received**\            [DateTime](#_datetime)
  *optional*               

  **recipient**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **requestDetail**\       [Reference](#_reference)
  *optional*               

  **sender**\              [Reference](#_reference)
  *optional*               

  **sent**\                [DateTime](#_datetime)
  *optional*               

  **status**\              [CommunicationStatus](#_communicationstatus)
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communicationpayload){.anchor}8.91. CommunicationPayload {#_communicationpayload}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contentAttachment**\   [Attachment](#_attachment)
  *optional*               

  **contentReference**\    [Reference](#_reference)
  *optional*               

  **contentString**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communicationrequest){.anchor}8.92. CommunicationRequest {#_communicationrequest}

  -------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------------
  **category**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **medium**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **payload**\             &lt; [CommunicationRequestPayload](#_communicationrequestpayload) &gt; array
  *optional*               

  **priority**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **recipient**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **requestedOn**\         [DateTime](#_datetime)
  *optional*               

  **requester**\           [Reference](#_reference)
  *optional*               

  **scheduledDateTime**\   [DateTime](#_datetime)
  *optional*               

  **scheduledPeriod**\     [Period](#_period)
  *optional*               

  **sender**\              [Reference](#_reference)
  *optional*               

  **status**\              [CommunicationRequestStatus](#_communicationrequeststatus)
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communicationrequestpayload){.anchor}8.93. CommunicationRequestPayload {#_communicationrequestpayload}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contentAttachment**\   [Attachment](#_attachment)
  *optional*               

  **contentReference**\    [Reference](#_reference)
  *optional*               

  **contentString**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communicationrequeststatus){.anchor}8.94. CommunicationRequestStatus {#_communicationrequeststatus}

  --------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, PLANNED, REQUESTED, RECEIVED, ACCEPTED, IN\_PROGRESS, COMPLETED, SUSPENDED, REJECTED, FAILED)
  *optional*       
  --------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_communicationstatus){.anchor}8.95. CommunicationStatus {#_communicationstatus}

  ------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, COMPLETED, SUSPENDED, REJECTED, FAILED)
  *optional*       
  ------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_composition){.anchor}8.96. Composition {#_composition}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **attester**\            &lt; [CompositionAttester](#_compositionattester) &gt; array
  *optional*               

  **author**\              &lt; [Reference](#_reference) &gt; array
  *required*               

  **class**\               [CodeableConcept](#_codeableconcept)
  *optional*               

  **confidentiality**\     [Code](#_code)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **custodian**\           [Reference](#_reference)
  *optional*               

  **date**\                [DateTime](#_datetime)
  *required*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **event**\               &lt; [CompositionEvent](#_compositionevent) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **section**\             &lt; [CompositionSection](#_compositionsection) &gt; array
  *optional*               

  **status**\              [CompositionStatus](#_compositionstatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **title**\               string
  *required*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_compositionattestationmode){.anchor}8.97. CompositionAttestationMode {#_compositionattestationmode}

  -----------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PERSONAL, PROFESSIONAL, LEGAL, OFFICIAL)
  *optional*       
  -----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_compositionattester){.anchor}8.98. CompositionAttester {#_compositionattester}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **mode**\                &lt; [CompositionAttestationMode](#_compositionattestationmode) &gt; array
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **party**\               [Reference](#_reference)
  *optional*               

  **time**\                [DateTime](#_datetime)
  *optional*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_compositionevent){.anchor}8.99. CompositionEvent {#_compositionevent}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **code**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **detail**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_compositionsection){.anchor}8.100. CompositionSection {#_compositionsection}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **emptyReason**\         [CodeableConcept](#_codeableconcept)
  *optional*               

  **entry**\               &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **mode**\                [Code](#_code)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **orderedBy**\           [CodeableConcept](#_codeableconcept)
  *optional*               

  **section**\             &lt; [CompositionSection](#_compositionsection) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **title**\               string
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_compositionstatus){.anchor}8.101. CompositionStatus {#_compositionstatus}

  -------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PRELIMINARY, FINAL, AMENDED, ENTERED\_IN\_ERROR)
  *optional*       
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conceptmap){.anchor}8.102. ConceptMap {#_conceptmap}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contact**\             &lt; [ConceptMapContact](#_conceptmapcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **element**\             &lt; [ConceptMapElement](#_conceptmapelement) &gt; array
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **sourceReference**\     [Reference](#_reference)
  *optional*               

  **sourceUri**\           [Uri](#_uri)
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **targetReference**\     [Reference](#_reference)
  *optional*               

  **targetUri**\           [Uri](#_uri)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conceptmapcontact){.anchor}8.103. ConceptMapContact {#_conceptmapcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conceptmapdependson){.anchor}8.104. ConceptMapDependsOn {#_conceptmapdependson}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                string
  *required*               

  **codeSystem**\          [Uri](#_uri)
  *required*               

  **element**\             [Uri](#_uri)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conceptmapelement){.anchor}8.105. ConceptMapElement {#_conceptmapelement}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **code**\                [Code](#_code)
  *optional*               

  **codeSystem**\          [Uri](#_uri)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **target**\              &lt; [ConceptMapTarget](#_conceptmaptarget) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conceptmaptarget){.anchor}8.106. ConceptMapTarget {#_conceptmaptarget}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **code**\                [Code](#_code)
  *optional*               

  **codeSystem**\          [Uri](#_uri)
  *optional*               

  **comments**\            string
  *optional*               

  **dependsOn**\           &lt; [ConceptMapDependsOn](#_conceptmapdependson) &gt; array
  *optional*               

  **equivalence**\         [Code](#_code)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **product**\             &lt; [ConceptMapDependsOn](#_conceptmapdependson) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_condition){.anchor}8.107. Condition {#_condition}

  ----------------------------------------------------------------------------------------
  Name                      Schema
  ------------------------- --------------------------------------------------------------
  **abatementBoolean**\     boolean
  *optional*                

  **abatementDateTime**\    [DateTime](#_datetime)
  *optional*                

  **abatementPeriod**\      [Period](#_period)
  *optional*                

  **abatementQuantity**\    [Age](#_age)
  *optional*                

  **abatementRange**\       [Range](#_range)
  *optional*                

  **abatementString**\      string
  *optional*                

  **asserter**\             [Reference](#_reference)
  *optional*                

  **bodySite**\             &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                

  **category**\             [CodeableConcept](#_codeableconcept)
  *optional*                

  **clinicalStatus**\       [Code](#_code)
  *optional*                

  **code**\                 [CodeableConcept](#_codeableconcept)
  *required*                

  **contained**\            &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                

  **dateRecorded**\         string(date)
  *optional*                

  **encounter**\            [Reference](#_reference)
  *optional*                

  **evidence**\             &lt; [ConditionEvidence](#_conditionevidence) &gt; array
  *optional*                

  **extension**\            &lt; [Extension](#_extension) &gt; array
  *optional*                

  **id**\                   [Id](#_id)
  *optional*                

  **identifier**\           &lt; [Identifier](#_identifier) &gt; array
  *optional*                

  **implicitRules**\        [Uri](#_uri)
  *optional*                

  **language**\             [Code](#_code)
  *optional*                

  **meta**\                 [Meta](#_meta)
  *optional*                

  **modifierExtension**\    &lt; [Extension](#_extension) &gt; array
  *optional*                

  **notes**\                string
  *optional*                

  **onsetDateTime**\        [DateTime](#_datetime)
  *optional*                

  **onsetPeriod**\          [Period](#_period)
  *optional*                

  **onsetQuantity**\        [Age](#_age)
  *optional*                

  **onsetRange**\           [Range](#_range)
  *optional*                

  **onsetString**\          string
  *optional*                

  **patient**\              [Reference](#_reference)
  *required*                

  **severity**\             [CodeableConcept](#_codeableconcept)
  *optional*                

  **stage**\                [ConditionStage](#_conditionstage)
  *optional*                

  **text**\                 [Narrative](#_narrative)
  *optional*                

  **verificationStatus**\   [ConditionVerificationStatus](#_conditionverificationstatus)
  *required*                
  ----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conditionevidence){.anchor}8.108. ConditionEvidence {#_conditionevidence}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **detail**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conditionstage){.anchor}8.109. ConditionStage {#_conditionstage}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **assessment**\          &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **summary**\             [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conditionverificationstatus){.anchor}8.110. ConditionVerificationStatus {#_conditionverificationstatus}

  ----------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROVISIONAL, DIFFERENTIAL, CONFIRMED, REFUTED, ENTERED\_IN\_ERROR, UNKNOWN)
  *optional*       
  ----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conditionaldeletestatus){.anchor}8.111. ConditionalDeleteStatus {#_conditionaldeletestatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NOT\_SUPPORTED, SINGLE, MULTIPLE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformance){.anchor}8.112. Conformance {#_conformance}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **acceptUnknown**\       [UnknownContentCode](#_unknowncontentcode)
  *required*               

  **contact**\             &lt; [ConformanceContact](#_conformancecontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *required*               

  **description**\         string
  *optional*               

  **document**\            &lt; [ConformanceDocument](#_conformancedocument) &gt; array
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fhirVersion**\         [Id](#_id)
  *required*               

  **format**\              &lt; [Code](#_code) &gt; array
  *required*               

  **id**\                  [Id](#_id)
  *optional*               

  **implementation**\      [ConformanceImplementation](#_conformanceimplementation)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **kind**\                [ConformanceStatementKind](#_conformancestatementkind)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **messaging**\           &lt; [ConformanceMessaging](#_conformancemessaging) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **profile**\             &lt; [Reference](#_reference) &gt; array
  *optional*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **rest**\                &lt; [ConformanceRest](#_conformancerest) &gt; array
  *optional*               

  **software**\            [ConformanceSoftware](#_conformancesoftware)
  *optional*               

  **status**\              [Code](#_code)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancecertificate){.anchor}8.113. ConformanceCertificate {#_conformancecertificate}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **blob**\                [Base64Binary](#_base64binary)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **type**\                [Code](#_code)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancecontact){.anchor}8.114. ConformanceContact {#_conformancecontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancedocument){.anchor}8.115. ConformanceDocument {#_conformancedocument}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **mode**\                [DocumentMode](#_documentmode)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **profile**\             [Reference](#_reference)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceendpoint){.anchor}8.116. ConformanceEndpoint {#_conformanceendpoint}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **address**\             [Uri](#_uri)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **protocol**\            [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceevent){.anchor}8.117. ConformanceEvent {#_conformanceevent}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **category**\            [MessageSignificanceCategory](#_messagesignificancecategory)
  *optional*               

  **code**\                [Coding](#_coding)
  *required*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **focus**\               [Code](#_code)
  *required*               

  **id**\                  string
  *optional*               

  **mode**\                [ConformanceEventMode](#_conformanceeventmode)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **request**\             [Reference](#_reference)
  *required*               

  **response**\            [Reference](#_reference)
  *required*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceeventmode){.anchor}8.118. ConformanceEventMode {#_conformanceeventmode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (SENDER, RECEIVER)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceimplementation){.anchor}8.119. ConformanceImplementation {#_conformanceimplementation}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **description**\         string
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceinteraction){.anchor}8.120. ConformanceInteraction {#_conformanceinteraction}

  -----------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------
  **code**\                [TypeRestfulInteraction](#_typerestfulinteraction)
  *required*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceinteraction1){.anchor}8.121. ConformanceInteraction1 {#_conformanceinteraction1}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **code**\                [SystemRestfulInteraction](#_systemrestfulinteraction)
  *required*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancemessaging){.anchor}8.122. ConformanceMessaging {#_conformancemessaging}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **documentation**\       string
  *optional*               

  **endpoint**\            &lt; [ConformanceEndpoint](#_conformanceendpoint) &gt; array
  *optional*               

  **event**\               &lt; [ConformanceEvent](#_conformanceevent) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reliableCache**\       [UnsignedInt](#_unsignedint)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceoperation){.anchor}8.123. ConformanceOperation {#_conformanceoperation}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **definition**\          [Reference](#_reference)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformanceresource){.anchor}8.124. ConformanceResource {#_conformanceresource}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **conditionalCreate**\   boolean
  *optional*               

  **conditionalDelete**\   [ConditionalDeleteStatus](#_conditionaldeletestatus)
  *optional*               

  **conditionalUpdate**\   boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **interaction**\         &lt; [ConformanceInteraction](#_conformanceinteraction) &gt; array
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **profile**\             [Reference](#_reference)
  *optional*               

  **readHistory**\         boolean
  *optional*               

  **searchInclude**\       &lt; string &gt; array
  *optional*               

  **searchParam**\         &lt; [ConformanceSearchParam](#_conformancesearchparam) &gt; array
  *optional*               

  **searchRevInclude**\    &lt; string &gt; array
  *optional*               

  **type**\                [Code](#_code)
  *required*               

  **updateCreate**\        boolean
  *optional*               

  **versioning**\          [ResourceVersionPolicy](#_resourceversionpolicy)
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancerest){.anchor}8.125. ConformanceRest {#_conformancerest}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **compartment**\         &lt; [Uri](#_uri) &gt; array
  *optional*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **interaction**\         &lt; [ConformanceInteraction1](#_conformanceinteraction1) &gt; array
  *optional*               

  **mode**\                [RestfulConformanceMode](#_restfulconformancemode)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operation**\           &lt; [ConformanceOperation](#_conformanceoperation) &gt; array
  *optional*               

  **resource**\            &lt; [ConformanceResource](#_conformanceresource) &gt; array
  *required*               

  **searchParam**\         &lt; [ConformanceSearchParam](#_conformancesearchparam) &gt; array
  *optional*               

  **security**\            [ConformanceSecurity](#_conformancesecurity)
  *optional*               

  **transactionMode**\     [TransactionMode](#_transactionmode)
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancesearchparam){.anchor}8.126. ConformanceSearchParam {#_conformancesearchparam}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **chain**\               &lt; string &gt; array
  *optional*               

  **definition**\          [Uri](#_uri)
  *optional*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifier**\            &lt; [SearchModifierCode](#_searchmodifiercode) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **target**\              &lt; [Code](#_code) &gt; array
  *optional*               

  **type**\                [Code](#_code)
  *required*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancesecurity){.anchor}8.127. ConformanceSecurity {#_conformancesecurity}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **certificate**\         &lt; [ConformanceCertificate](#_conformancecertificate) &gt; array
  *optional*               

  **cors**\                boolean
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **service**\             &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancesoftware){.anchor}8.128. ConformanceSoftware {#_conformancesoftware}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **releaseDate**\         [DateTime](#_datetime)
  *optional*               

  **version**\             string
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_conformancestatementkind){.anchor}8.129. ConformanceStatementKind {#_conformancestatementkind}

  ------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INSTANCE, CAPABILITY, REQUIREMENTS)
  *optional*       
  ------------------------------------------------------------

</div>

<div class="sect2">

### [](#_constraintseverity){.anchor}8.130. ConstraintSeverity {#_constraintseverity}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ERROR, WARNING)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_contactpoint){.anchor}8.131. ContactPoint {#_contactpoint}

  -------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **period**\      [Period](#_period)
  *optional*       

  **rank**\        [PositiveInt](#_positiveint)
  *optional*       

  **system**\      [ContactPointSystem](#_contactpointsystem)
  *optional*       

  **use**\         [ContactPointUse](#_contactpointuse)
  *optional*       

  **value**\       string
  *optional*       
  -------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contactpointsystem){.anchor}8.132. ContactPointSystem {#_contactpointsystem}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PHONE, FAX, EMAIL, PAGER, OTHER)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_contactpointuse){.anchor}8.133. ContactPointUse {#_contactpointuse}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (HOME, WORK, TEMP, OLD, MOBILE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_contenttype){.anchor}8.134. ContentType {#_contenttype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (XML, JSON)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_contract){.anchor}8.135. Contract {#_contract}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **action**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **actionReason**\        &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **actor**\               &lt; [ContractActor](#_contractactor) &gt; array
  *optional*               

  **applies**\             [Period](#_period)
  *optional*               

  **authority**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **bindingAttachment**\   [Attachment](#_attachment)
  *optional*               

  **bindingReference**\    [Reference](#_reference)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **domain**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **friendly**\            &lt; [ContractFriendly](#_contractfriendly) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **issued**\              [DateTime](#_datetime)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **legal**\               &lt; [ContractLegal](#_contractlegal) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **rule**\                &lt; [ContractRule](#_contractrule) &gt; array
  *optional*               

  **signer**\              &lt; [ContractSigner](#_contractsigner) &gt; array
  *optional*               

  **subType**\             &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **subject**\             &lt; [Reference](#_reference) &gt; array
  *optional*               

  **term**\                &lt; [ContractTerm](#_contractterm) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **valuedItem**\          &lt; [ContractValuedItem](#_contractvalueditem) &gt; array
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractactor){.anchor}8.136. ContractActor {#_contractactor}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **entity**\              [Reference](#_reference)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **role**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractactor1){.anchor}8.137. ContractActor1 {#_contractactor1}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **entity**\              [Reference](#_reference)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **role**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractfriendly){.anchor}8.138. ContractFriendly {#_contractfriendly}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contentAttachment**\   [Attachment](#_attachment)
  *optional*               

  **contentReference**\    [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractlegal){.anchor}8.139. ContractLegal {#_contractlegal}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contentAttachment**\   [Attachment](#_attachment)
  *optional*               

  **contentReference**\    [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractrule){.anchor}8.140. ContractRule {#_contractrule}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contentAttachment**\   [Attachment](#_attachment)
  *optional*               

  **contentReference**\    [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractsigner){.anchor}8.141. ContractSigner {#_contractsigner}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **party**\               [Reference](#_reference)
  *required*               

  **signature**\           string
  *required*               

  **type**\                [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractterm){.anchor}8.142. ContractTerm {#_contractterm}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **action**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **actionReason**\        &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **actor**\               &lt; [ContractActor1](#_contractactor1) &gt; array
  *optional*               

  **applies**\             [Period](#_period)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               &lt; [ContractTerm](#_contractterm) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **issued**\              [DateTime](#_datetime)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **subType**\             [CodeableConcept](#_codeableconcept)
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                string
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **valuedItem**\          &lt; [ContractValuedItem1](#_contractvalueditem1) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractvalueditem){.anchor}8.143. ContractValuedItem {#_contractvalueditem}

  -----------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ------------------------------------------
  **effectiveTime**\           [DateTime](#_datetime)
  *optional*                   

  **entityCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **entityReference**\         [Reference](#_reference)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **factor**\                  [Decimal](#_decimal)
  *optional*                   

  **id**\                      string
  *optional*                   

  **identifier**\              [Identifier](#_identifier)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **net**\                     [Money](#_money)
  *optional*                   

  **points**\                  [Decimal](#_decimal)
  *optional*                   

  **quantity**\                [SimpleQuantity](#_simplequantity)
  *optional*                   

  **unitPrice**\               [Money](#_money)
  *optional*                   
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_contractvalueditem1){.anchor}8.144. ContractValuedItem1 {#_contractvalueditem1}

  -----------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ------------------------------------------
  **effectiveTime**\           [DateTime](#_datetime)
  *optional*                   

  **entityCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **entityReference**\         [Reference](#_reference)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **factor**\                  [Decimal](#_decimal)
  *optional*                   

  **id**\                      string
  *optional*                   

  **identifier**\              [Identifier](#_identifier)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **net**\                     [Money](#_money)
  *optional*                   

  **points**\                  [Decimal](#_decimal)
  *optional*                   

  **quantity**\                [SimpleQuantity](#_simplequantity)
  *optional*                   

  **unitPrice**\               [Money](#_money)
  *optional*                   
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_coverage){.anchor}8.145. Coverage {#_coverage}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **bin**\                 [Identifier](#_identifier)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **contract**\            &lt; [Reference](#_reference) &gt; array
  *optional*               

  **dependent**\           [PositiveInt](#_positiveint)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               string
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **issuer**\              [Reference](#_reference)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **network**\             [Identifier](#_identifier)
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **plan**\                string
  *optional*               

  **sequence**\            [PositiveInt](#_positiveint)
  *optional*               

  **subPlan**\             string
  *optional*               

  **subscriber**\          [Reference](#_reference)
  *optional*               

  **subscriberId**\        [Identifier](#_identifier)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_dataelement){.anchor}8.146. DataElement {#_dataelement}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **contact**\             &lt; [DataElementContact](#_dataelementcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **element**\             &lt; [ElementDefinition](#_elementdefinition) &gt; array
  *required*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **mapping**\             &lt; [DataElementMapping](#_dataelementmapping) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **publisher**\           string
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **stringency**\          [DataElementStringency](#_dataelementstringency)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_dataelementcontact){.anchor}8.147. DataElementContact {#_dataelementcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_dataelementmapping){.anchor}8.148. DataElementMapping {#_dataelementmapping}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **comments**\            string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identity**\            [Id](#_id)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **uri**\                 [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_dataelementstringency){.anchor}8.149. DataElementStringency {#_dataelementstringency}

  ----------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (COMPARABLE, FULLY\_SPECIFIED, EQUIVALENT, CONVERTABLE, SCALEABLE, FLEXIBLE)
  *optional*       
  ----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_date){.anchor}8.150. Date {#_date}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_datetime){.anchor}8.151. DateTime {#_datetime}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_daysofweek){.anchor}8.152. DaysOfWeek {#_daysofweek}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (MON, TUE, WED, THU, FRI, SAT, SUN)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_decimal){.anchor}8.153. Decimal {#_decimal}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       number
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_detectedissue){.anchor}8.154. DetectedIssue {#_detectedissue}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **category**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **detail**\              string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicated**\          &lt; [Reference](#_reference) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **mitigation**\          &lt; [DetectedIssueMitigation](#_detectedissuemitigation) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *optional*               

  **reference**\           [Uri](#_uri)
  *optional*               

  **severity**\            [DetectedIssueSeverity](#_detectedissueseverity)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_detectedissuemitigation){.anchor}8.155. DetectedIssueMitigation {#_detectedissuemitigation}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **action**\              [CodeableConcept](#_codeableconcept)
  *required*               

  **author**\              [Reference](#_reference)
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_detectedissueseverity){.anchor}8.156. DetectedIssueSeverity {#_detectedissueseverity}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (HIGH, MODERATE, LOW)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_device){.anchor}8.157. Device {#_device}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contact**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **expiry**\              [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **location**\            [Reference](#_reference)
  *optional*               

  **lotNumber**\           string
  *optional*               

  **manufactureDate**\     [DateTime](#_datetime)
  *optional*               

  **manufacturer**\        string
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **model**\               string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                &lt; [Annotation](#_annotation) &gt; array
  *optional*               

  **owner**\               [Reference](#_reference)
  *optional*               

  **patient**\             [Reference](#_reference)
  *optional*               

  **status**\              [DeviceStatus](#_devicestatus)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **udi**\                 string
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicecomponent){.anchor}8.158. DeviceComponent {#_devicecomponent}

  -----------------------------------------------------------------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ----------------------------------------------------------------------------------------------------
  **contained**\                 &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        [Id](#_id)
  *optional*                     

  **identifier**\                [Identifier](#_identifier)
  *required*                     

  **implicitRules**\             [Uri](#_uri)
  *optional*                     

  **language**\                  [Code](#_code)
  *optional*                     

  **languageCode**\              [CodeableConcept](#_codeableconcept)
  *optional*                     

  **lastSystemChange**\          [Instant](#_instant)
  *required*                     

  **measurementPrinciple**\      [MeasmntPrinciple](#_measmntprinciple)
  *optional*                     

  **meta**\                      [Meta](#_meta)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **operationalStatus**\         &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                     

  **parameterGroup**\            [CodeableConcept](#_codeableconcept)
  *optional*                     

  **parent**\                    [Reference](#_reference)
  *optional*                     

  **productionSpecification**\   &lt; [DeviceComponentProductionSpecification](#_devicecomponentproductionspecification) &gt; array
  *optional*                     

  **source**\                    [Reference](#_reference)
  *optional*                     

  **text**\                      [Narrative](#_narrative)
  *optional*                     

  **type**\                      [CodeableConcept](#_codeableconcept)
  *required*                     
  -----------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicecomponentproductionspecification){.anchor}8.159. DeviceComponentProductionSpecification {#_devicecomponentproductionspecification}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **componentId**\         [Identifier](#_identifier)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **productionSpec**\      string
  *optional*               

  **specType**\            [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetric){.anchor}8.160. DeviceMetric {#_devicemetric}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **calibration**\         &lt; [DeviceMetricCalibration](#_devicemetriccalibration) &gt; array
  *optional*               

  **category**\            [DeviceMetricCategory](#_devicemetriccategory)
  *required*               

  **color**\               [DeviceMetricColor](#_devicemetriccolor)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *required*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **measurementPeriod**\   [Timing](#_timing)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operationalStatus**\   [DeviceMetricOperationalStatus](#_devicemetricoperationalstatus)
  *optional*               

  **parent**\              [Reference](#_reference)
  *optional*               

  **source**\              [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **unit**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetriccalibration){.anchor}8.161. DeviceMetricCalibration {#_devicemetriccalibration}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **state**\               [DeviceMetricCalibrationState](#_devicemetriccalibrationstate)
  *optional*               

  **time**\                [Instant](#_instant)
  *optional*               

  **type**\                [DeviceMetricCalibrationType](#_devicemetriccalibrationtype)
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetriccalibrationstate){.anchor}8.162. DeviceMetricCalibrationState {#_devicemetriccalibrationstate}

  -----------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NOT\_CALIBRATED, CALIBRATION\_REQUIRED, CALIBRATED, UNSPECIFIED)
  *optional*       
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetriccalibrationtype){.anchor}8.163. DeviceMetricCalibrationType {#_devicemetriccalibrationtype}

  ---------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (UNSPECIFIED, OFFSET, GAIN, TWO\_POINT)
  *optional*       
  ---------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetriccategory){.anchor}8.164. DeviceMetricCategory {#_devicemetriccategory}

  ------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (MEASUREMENT, SETTING, CALCULATION, UNSPECIFIED)
  *optional*       
  ------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetriccolor){.anchor}8.165. DeviceMetricColor {#_devicemetriccolor}

  -------------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE)
  *optional*       
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicemetricoperationalstatus){.anchor}8.166. DeviceMetricOperationalStatus {#_devicemetricoperationalstatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ON, OFF, STANDBY)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_devicestatus){.anchor}8.167. DeviceStatus {#_devicestatus}

  -----------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (AVAILABLE, NOT\_AVAILABLE, ENTERED\_IN\_ERROR)
  *optional*       
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_deviceuserequest){.anchor}8.168. DeviceUseRequest {#_deviceuserequest}

  -----------------------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ----------------------------------------------------------
  **bodySiteCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **bodySiteReference**\         [Reference](#_reference)
  *optional*                     

  **contained**\                 &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                     

  **device**\                    [Reference](#_reference)
  *required*                     

  **encounter**\                 [Reference](#_reference)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        [Id](#_id)
  *optional*                     

  **identifier**\                &lt; [Identifier](#_identifier) &gt; array
  *optional*                     

  **implicitRules**\             [Uri](#_uri)
  *optional*                     

  **indication**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                     

  **language**\                  [Code](#_code)
  *optional*                     

  **meta**\                      [Meta](#_meta)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **notes**\                     &lt; string &gt; array
  *optional*                     

  **orderedOn**\                 [DateTime](#_datetime)
  *optional*                     

  **priority**\                  [DeviceUseRequestPriority](#_deviceuserequestpriority)
  *optional*                     

  **prnReason**\                 &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                     

  **recordedOn**\                [DateTime](#_datetime)
  *optional*                     

  **status**\                    [DeviceUseRequestStatus](#_deviceuserequeststatus)
  *optional*                     

  **subject**\                   [Reference](#_reference)
  *required*                     

  **text**\                      [Narrative](#_narrative)
  *optional*                     

  **timingDateTime**\            [DateTime](#_datetime)
  *optional*                     

  **timingPeriod**\              [Period](#_period)
  *optional*                     

  **timingTiming**\              [Timing](#_timing)
  *optional*                     
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_deviceuserequestpriority){.anchor}8.169. DeviceUseRequestPriority {#_deviceuserequestpriority}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ROUTINE, URGENT, STAT, ASAP)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_deviceuserequeststatus){.anchor}8.170. DeviceUseRequestStatus {#_deviceuserequeststatus}

  ---------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, PLANNED, REQUESTED, RECEIVED, ACCEPTED, IN\_PROGRESS, COMPLETED, SUSPENDED, REJECTED, ABORTED)
  *optional*       
  ---------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_deviceusestatement){.anchor}8.171. DeviceUseStatement {#_deviceusestatement}

  -----------------------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ----------------------------------------------------------
  **bodySiteCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **bodySiteReference**\         [Reference](#_reference)
  *optional*                     

  **contained**\                 &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                     

  **device**\                    [Reference](#_reference)
  *required*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        [Id](#_id)
  *optional*                     

  **identifier**\                &lt; [Identifier](#_identifier) &gt; array
  *optional*                     

  **implicitRules**\             [Uri](#_uri)
  *optional*                     

  **indication**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                     

  **language**\                  [Code](#_code)
  *optional*                     

  **meta**\                      [Meta](#_meta)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **notes**\                     &lt; string &gt; array
  *optional*                     

  **recordedOn**\                [DateTime](#_datetime)
  *optional*                     

  **subject**\                   [Reference](#_reference)
  *required*                     

  **text**\                      [Narrative](#_narrative)
  *optional*                     

  **timingDateTime**\            [DateTime](#_datetime)
  *optional*                     

  **timingPeriod**\              [Period](#_period)
  *optional*                     

  **timingTiming**\              [Timing](#_timing)
  *optional*                     

  **whenUsed**\                  [Period](#_period)
  *optional*                     
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticorder){.anchor}8.172. DiagnosticOrder {#_diagnosticorder}

  ---------------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------------
  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **encounter**\               [Reference](#_reference)
  *optional*                   

  **event**\                   &lt; [DiagnosticOrderEvent](#_diagnosticorderevent) &gt; array
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **item**\                    &lt; [DiagnosticOrderItem](#_diagnosticorderitem) &gt; array
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **note**\                    &lt; [Annotation](#_annotation) &gt; array
  *optional*                   

  **orderer**\                 [Reference](#_reference)
  *optional*                   

  **priority**\                [DiagnosticOrderPriority](#_diagnosticorderpriority)
  *optional*                   

  **reason**\                  &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **specimen**\                &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **status**\                  [DiagnosticOrderStatus](#_diagnosticorderstatus)
  *optional*                   

  **subject**\                 [Reference](#_reference)
  *required*                   

  **supportingInformation**\   &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticorderevent){.anchor}8.173. DiagnosticOrderEvent {#_diagnosticorderevent}

  ---------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------
  **actor**\               [Reference](#_reference)
  *optional*               

  **dateTime**\            [DateTime](#_datetime)
  *required*               

  **description**\         [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **status**\              [DiagnosticOrderStatus](#_diagnosticorderstatus)
  *required*               
  ---------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticorderitem){.anchor}8.174. DiagnosticOrderItem {#_diagnosticorderitem}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **bodySite**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **event**\               &lt; [DiagnosticOrderEvent](#_diagnosticorderevent) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **specimen**\            &lt; [Reference](#_reference) &gt; array
  *optional*               

  **status**\              [DiagnosticOrderStatus](#_diagnosticorderstatus)
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticorderpriority){.anchor}8.175. DiagnosticOrderPriority {#_diagnosticorderpriority}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ROUTINE, URGENT, STAT, ASAP)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticorderstatus){.anchor}8.176. DiagnosticOrderStatus {#_diagnosticorderstatus}

  ----------------------------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, DRAFT, PLANNED, REQUESTED, RECEIVED, ACCEPTED, IN\_PROGRESS, REVIEW, COMPLETED, CANCELLED, SUSPENDED, REJECTED, FAILED)
  *optional*       
  ----------------------------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticreport){.anchor}8.177. DiagnosticReport {#_diagnosticreport}

  -------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------
  **category**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **codedDiagnosis**\      &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **conclusion**\          string
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **effectiveDateTime**\   [DateTime](#_datetime)
  *optional*               

  **effectivePeriod**\     [Period](#_period)
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **image**\               &lt; [DiagnosticReportImage](#_diagnosticreportimage) &gt; array
  *optional*               

  **imagingStudy**\        &lt; [Reference](#_reference) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **issued**\              [Instant](#_instant)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **performer**\           [Reference](#_reference)
  *required*               

  **presentedForm**\       &lt; [Attachment](#_attachment) &gt; array
  *optional*               

  **request**\             &lt; [Reference](#_reference) &gt; array
  *optional*               

  **result**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **specimen**\            &lt; [Reference](#_reference) &gt; array
  *optional*               

  **status**\              [DiagnosticReportStatus](#_diagnosticreportstatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticreportimage){.anchor}8.178. DiagnosticReportImage {#_diagnosticreportimage}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **comment**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **link**\                [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_diagnosticreportstatus){.anchor}8.179. DiagnosticReportStatus {#_diagnosticreportstatus}

  --------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REGISTERED, PARTIAL, FINAL, CORRECTED, APPENDED, CANCELLED, ENTERED\_IN\_ERROR)
  *optional*       
  --------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_digitalmediatype){.anchor}8.180. DigitalMediaType {#_digitalmediatype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PHOTO, VIDEO, AUDIO)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_div){.anchor}8.181. Div {#_div}

  -------------------------------------------
  Name               Schema
  ------------------ ------------------------
  **class**\         &lt; string &gt; array
  *optional*         

  **content**\       &lt; object &gt; array
  *optional*         

  **dir**\           string
  *optional*         

  **id**\            string
  *optional*         

  **onclick**\       string
  *optional*         

  **ondblclick**\    string
  *optional*         

  **onkeydown**\     string
  *optional*         

  **onkeypress**\    string
  *optional*         

  **onkeyup**\       string
  *optional*         

  **onmousedown**\   string
  *optional*         

  **onmousemove**\   string
  *optional*         

  **onmouseout**\    string
  *optional*         

  **onmouseover**\   string
  *optional*         

  **onmouseup**\     string
  *optional*         

  **style**\         string
  *optional*         

  **title**\         string
  *optional*         
  -------------------------------------------

</div>

<div class="sect2">

### [](#_documentmanifest){.anchor}8.182. DocumentManifest {#_documentmanifest}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **author**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **content**\             &lt; [DocumentManifestContent](#_documentmanifestcontent) &gt; array
  *required*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **masterIdentifier**\    [Identifier](#_identifier)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **recipient**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **related**\             &lt; [DocumentManifestRelated](#_documentmanifestrelated) &gt; array
  *optional*               

  **source**\              [Uri](#_uri)
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentmanifestcontent){.anchor}8.183. DocumentManifestContent {#_documentmanifestcontent}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **pAttachment**\         [Attachment](#_attachment)
  *optional*               

  **pReference**\          [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentmanifestrelated){.anchor}8.184. DocumentManifestRelated {#_documentmanifestrelated}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **ref**\                 [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentmode){.anchor}8.185. DocumentMode {#_documentmode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PRODUCER, CONSUMER)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentreference){.anchor}8.186. DocumentReference {#_documentreference}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **authenticator**\       [Reference](#_reference)
  *optional*               

  **author**\              &lt; [Reference](#_reference) &gt; array
  *optional*               

  **class**\               [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **content**\             &lt; [DocumentReferenceContent](#_documentreferencecontent) &gt; array
  *required*               

  **context**\             [DocumentReferenceContext](#_documentreferencecontext)
  *optional*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **custodian**\           [Reference](#_reference)
  *optional*               

  **description**\         string
  *optional*               

  **docStatus**\           [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **indexed**\             [Instant](#_instant)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **masterIdentifier**\    [Identifier](#_identifier)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **relatesTo**\           &lt; [DocumentReferenceRelatesTo](#_documentreferencerelatesto) &gt; array
  *optional*               

  **securityLabel**\       &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentreferencecontent){.anchor}8.187. DocumentReferenceContent {#_documentreferencecontent}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **attachment**\          [Attachment](#_attachment)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **format**\              &lt; [Coding](#_coding) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentreferencecontext){.anchor}8.188. DocumentReferenceContext {#_documentreferencecontext}

  -------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------
  **encounter**\           [Reference](#_reference)
  *optional*               

  **event**\               &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **facilityType**\        [CodeableConcept](#_codeableconcept)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **practiceSetting**\     [CodeableConcept](#_codeableconcept)
  *optional*               

  **related**\             &lt; [DocumentReferenceRelated](#_documentreferencerelated) &gt; array
  *optional*               

  **sourcePatientInfo**\   [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentreferencerelated){.anchor}8.189. DocumentReferenceRelated {#_documentreferencerelated}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **ref**\                 [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentreferencerelatesto){.anchor}8.190. DocumentReferenceRelatesTo {#_documentreferencerelatesto}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **code**\                [DocumentRelationshipType](#_documentrelationshiptype)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **target**\              [Reference](#_reference)
  *required*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_documentrelationshiptype){.anchor}8.191. DocumentRelationshipType {#_documentrelationshiptype}

  --------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REPLACES, TRANSFORMS, SIGNS, APPENDS)
  *optional*       
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_duration){.anchor}8.192. Duration {#_duration}

  --------------------------------------------------------------
  Name              Schema
  ----------------- --------------------------------------------
  **code**\         [Code](#_code)
  *optional*        

  **comparator**\   [QuantityComparator](#_quantitycomparator)
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **system**\       [Uri](#_uri)
  *optional*        

  **unit**\         string
  *optional*        

  **value**\        [Decimal](#_decimal)
  *optional*        
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinition){.anchor}8.193. ElementDefinition {#_elementdefinition}

  -----------------------------------------------------------------------------------------------------------------
  Name                               Schema
  ---------------------------------- ------------------------------------------------------------------------------
  **alias**\                         &lt; string &gt; array
  *optional*                         

  **base**\                          [ElementDefinitionBase](#_elementdefinitionbase)
  *optional*                         

  **binding**\                       [ElementDefinitionBinding](#_elementdefinitionbinding)
  *optional*                         

  **code**\                          &lt; [Coding](#_coding) &gt; array
  *optional*                         

  **comments**\                      [Markdown](#_markdown)
  *optional*                         

  **condition**\                     &lt; [Id](#_id) &gt; array
  *optional*                         

  **constraint**\                    &lt; [ElementDefinitionConstraint](#_elementdefinitionconstraint) &gt; array
  *optional*                         

  **defaultValueAddress**\           [Address](#_address)
  *optional*                         

  **defaultValueAnnotation**\        [Annotation](#_annotation)
  *optional*                         

  **defaultValueAttachment**\        [Attachment](#_attachment)
  *optional*                         

  **defaultValueBase64Binary**\      [Base64Binary](#_base64binary)
  *optional*                         

  **defaultValueBoolean**\           boolean
  *optional*                         

  **defaultValueCode**\              [Code](#_code)
  *optional*                         

  **defaultValueCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                         

  **defaultValueCoding**\            [Coding](#_coding)
  *optional*                         

  **defaultValueContactPoint**\      [ContactPoint](#_contactpoint)
  *optional*                         

  **defaultValueDate**\              string(date)
  *optional*                         

  **defaultValueDateTime**\          [DateTime](#_datetime)
  *optional*                         

  **defaultValueDecimal**\           [Decimal](#_decimal)
  *optional*                         

  **defaultValueHumanName**\         [HumanName](#_humanname)
  *optional*                         

  **defaultValueId**\                [Id](#_id)
  *optional*                         

  **defaultValueIdentifier**\        [Identifier](#_identifier)
  *optional*                         

  **defaultValueInstant**\           [Instant](#_instant)
  *optional*                         

  **defaultValueInteger**\           [Integer](#_integer)
  *optional*                         

  **defaultValueMarkdown**\          [Markdown](#_markdown)
  *optional*                         

  **defaultValueMeta**\              [Meta](#_meta)
  *optional*                         

  **defaultValueOid**\               [Oid](#_oid)
  *optional*                         

  **defaultValuePeriod**\            [Period](#_period)
  *optional*                         

  **defaultValuePositiveInt**\       [PositiveInt](#_positiveint)
  *optional*                         

  **defaultValueQuantity**\          [Quantity](#_quantity)
  *optional*                         

  **defaultValueRange**\             [Range](#_range)
  *optional*                         

  **defaultValueRatio**\             [Ratio](#_ratio)
  *optional*                         

  **defaultValueReference**\         [Reference](#_reference)
  *optional*                         

  **defaultValueSampledData**\       [SampledData](#_sampleddata)
  *optional*                         

  **defaultValueSignature**\         [Signature](#_signature)
  *optional*                         

  **defaultValueString**\            string
  *optional*                         

  **defaultValueTime**\              [Time](#_time)
  *optional*                         

  **defaultValueTiming**\            [Timing](#_timing)
  *optional*                         

  **defaultValueUnsignedInt**\       [UnsignedInt](#_unsignedint)
  *optional*                         

  **defaultValueUri**\               [Uri](#_uri)
  *optional*                         

  **defaultValueUuid**\              string(uuid)
  *optional*                         

  **definition**\                    [Markdown](#_markdown)
  *optional*                         

  **exampleAddress**\                [Address](#_address)
  *optional*                         

  **exampleAnnotation**\             [Annotation](#_annotation)
  *optional*                         

  **exampleAttachment**\             [Attachment](#_attachment)
  *optional*                         

  **exampleBase64Binary**\           [Base64Binary](#_base64binary)
  *optional*                         

  **exampleBoolean**\                boolean
  *optional*                         

  **exampleCode**\                   [Code](#_code)
  *optional*                         

  **exampleCodeableConcept**\        [CodeableConcept](#_codeableconcept)
  *optional*                         

  **exampleCoding**\                 [Coding](#_coding)
  *optional*                         

  **exampleContactPoint**\           [ContactPoint](#_contactpoint)
  *optional*                         

  **exampleDate**\                   string(date)
  *optional*                         

  **exampleDateTime**\               [DateTime](#_datetime)
  *optional*                         

  **exampleDecimal**\                [Decimal](#_decimal)
  *optional*                         

  **exampleHumanName**\              [HumanName](#_humanname)
  *optional*                         

  **exampleId**\                     [Id](#_id)
  *optional*                         

  **exampleIdentifier**\             [Identifier](#_identifier)
  *optional*                         

  **exampleInstant**\                [Instant](#_instant)
  *optional*                         

  **exampleInteger**\                [Integer](#_integer)
  *optional*                         

  **exampleMarkdown**\               [Markdown](#_markdown)
  *optional*                         

  **exampleMeta**\                   [Meta](#_meta)
  *optional*                         

  **exampleOid**\                    [Oid](#_oid)
  *optional*                         

  **examplePeriod**\                 [Period](#_period)
  *optional*                         

  **examplePositiveInt**\            [PositiveInt](#_positiveint)
  *optional*                         

  **exampleQuantity**\               [Quantity](#_quantity)
  *optional*                         

  **exampleRange**\                  [Range](#_range)
  *optional*                         

  **exampleRatio**\                  [Ratio](#_ratio)
  *optional*                         

  **exampleReference**\              [Reference](#_reference)
  *optional*                         

  **exampleSampledData**\            [SampledData](#_sampleddata)
  *optional*                         

  **exampleSignature**\              [Signature](#_signature)
  *optional*                         

  **exampleString**\                 string
  *optional*                         

  **exampleTime**\                   [Time](#_time)
  *optional*                         

  **exampleTiming**\                 [Timing](#_timing)
  *optional*                         

  **exampleUnsignedInt**\            [UnsignedInt](#_unsignedint)
  *optional*                         

  **exampleUri**\                    [Uri](#_uri)
  *optional*                         

  **exampleUuid**\                   string(uuid)
  *optional*                         

  **extension**\                     &lt; [Extension](#_extension) &gt; array
  *optional*                         

  **fixedAddress**\                  [Address](#_address)
  *optional*                         

  **fixedAnnotation**\               [Annotation](#_annotation)
  *optional*                         

  **fixedAttachment**\               [Attachment](#_attachment)
  *optional*                         

  **fixedBase64Binary**\             [Base64Binary](#_base64binary)
  *optional*                         

  **fixedBoolean**\                  boolean
  *optional*                         

  **fixedCode**\                     [Code](#_code)
  *optional*                         

  **fixedCodeableConcept**\          [CodeableConcept](#_codeableconcept)
  *optional*                         

  **fixedCoding**\                   [Coding](#_coding)
  *optional*                         

  **fixedContactPoint**\             [ContactPoint](#_contactpoint)
  *optional*                         

  **fixedDate**\                     string(date)
  *optional*                         

  **fixedDateTime**\                 [DateTime](#_datetime)
  *optional*                         

  **fixedDecimal**\                  [Decimal](#_decimal)
  *optional*                         

  **fixedHumanName**\                [HumanName](#_humanname)
  *optional*                         

  **fixedId**\                       [Id](#_id)
  *optional*                         

  **fixedIdentifier**\               [Identifier](#_identifier)
  *optional*                         

  **fixedInstant**\                  [Instant](#_instant)
  *optional*                         

  **fixedInteger**\                  [Integer](#_integer)
  *optional*                         

  **fixedMarkdown**\                 [Markdown](#_markdown)
  *optional*                         

  **fixedMeta**\                     [Meta](#_meta)
  *optional*                         

  **fixedOid**\                      [Oid](#_oid)
  *optional*                         

  **fixedPeriod**\                   [Period](#_period)
  *optional*                         

  **fixedPositiveInt**\              [PositiveInt](#_positiveint)
  *optional*                         

  **fixedQuantity**\                 [Quantity](#_quantity)
  *optional*                         

  **fixedRange**\                    [Range](#_range)
  *optional*                         

  **fixedRatio**\                    [Ratio](#_ratio)
  *optional*                         

  **fixedReference**\                [Reference](#_reference)
  *optional*                         

  **fixedSampledData**\              [SampledData](#_sampleddata)
  *optional*                         

  **fixedSignature**\                [Signature](#_signature)
  *optional*                         

  **fixedString**\                   string
  *optional*                         

  **fixedTime**\                     [Time](#_time)
  *optional*                         

  **fixedTiming**\                   [Timing](#_timing)
  *optional*                         

  **fixedUnsignedInt**\              [UnsignedInt](#_unsignedint)
  *optional*                         

  **fixedUri**\                      [Uri](#_uri)
  *optional*                         

  **fixedUuid**\                     string(uuid)
  *optional*                         

  **id**\                            string
  *optional*                         

  **isModifier**\                    boolean
  *optional*                         

  **isSummary**\                     boolean
  *optional*                         

  **label**\                         string
  *optional*                         

  **mapping**\                       &lt; [ElementDefinitionMapping](#_elementdefinitionmapping) &gt; array
  *optional*                         

  **max**\                           string
  *optional*                         

  **maxLength**\                     [Integer](#_integer)
  *optional*                         

  **maxValueAddress**\               [Address](#_address)
  *optional*                         

  **maxValueAnnotation**\            [Annotation](#_annotation)
  *optional*                         

  **maxValueAttachment**\            [Attachment](#_attachment)
  *optional*                         

  **maxValueBase64Binary**\          [Base64Binary](#_base64binary)
  *optional*                         

  **maxValueBoolean**\               boolean
  *optional*                         

  **maxValueCode**\                  [Code](#_code)
  *optional*                         

  **maxValueCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                         

  **maxValueCoding**\                [Coding](#_coding)
  *optional*                         

  **maxValueContactPoint**\          [ContactPoint](#_contactpoint)
  *optional*                         

  **maxValueDate**\                  string(date)
  *optional*                         

  **maxValueDateTime**\              [DateTime](#_datetime)
  *optional*                         

  **maxValueDecimal**\               [Decimal](#_decimal)
  *optional*                         

  **maxValueHumanName**\             [HumanName](#_humanname)
  *optional*                         

  **maxValueId**\                    [Id](#_id)
  *optional*                         

  **maxValueIdentifier**\            [Identifier](#_identifier)
  *optional*                         

  **maxValueInstant**\               [Instant](#_instant)
  *optional*                         

  **maxValueInteger**\               [Integer](#_integer)
  *optional*                         

  **maxValueMarkdown**\              [Markdown](#_markdown)
  *optional*                         

  **maxValueMeta**\                  [Meta](#_meta)
  *optional*                         

  **maxValueOid**\                   [Oid](#_oid)
  *optional*                         

  **maxValuePeriod**\                [Period](#_period)
  *optional*                         

  **maxValuePositiveInt**\           [PositiveInt](#_positiveint)
  *optional*                         

  **maxValueQuantity**\              [Quantity](#_quantity)
  *optional*                         

  **maxValueRange**\                 [Range](#_range)
  *optional*                         

  **maxValueRatio**\                 [Ratio](#_ratio)
  *optional*                         

  **maxValueReference**\             [Reference](#_reference)
  *optional*                         

  **maxValueSampledData**\           [SampledData](#_sampleddata)
  *optional*                         

  **maxValueSignature**\             [Signature](#_signature)
  *optional*                         

  **maxValueString**\                string
  *optional*                         

  **maxValueTime**\                  [Time](#_time)
  *optional*                         

  **maxValueTiming**\                [Timing](#_timing)
  *optional*                         

  **maxValueUnsignedInt**\           [UnsignedInt](#_unsignedint)
  *optional*                         

  **maxValueUri**\                   [Uri](#_uri)
  *optional*                         

  **maxValueUuid**\                  string(uuid)
  *optional*                         

  **meaningWhenMissing**\            [Markdown](#_markdown)
  *optional*                         

  **min**\                           [Integer](#_integer)
  *optional*                         

  **minValueAddress**\               [Address](#_address)
  *optional*                         

  **minValueAnnotation**\            [Annotation](#_annotation)
  *optional*                         

  **minValueAttachment**\            [Attachment](#_attachment)
  *optional*                         

  **minValueBase64Binary**\          [Base64Binary](#_base64binary)
  *optional*                         

  **minValueBoolean**\               boolean
  *optional*                         

  **minValueCode**\                  [Code](#_code)
  *optional*                         

  **minValueCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                         

  **minValueCoding**\                [Coding](#_coding)
  *optional*                         

  **minValueContactPoint**\          [ContactPoint](#_contactpoint)
  *optional*                         

  **minValueDate**\                  string(date)
  *optional*                         

  **minValueDateTime**\              [DateTime](#_datetime)
  *optional*                         

  **minValueDecimal**\               [Decimal](#_decimal)
  *optional*                         

  **minValueHumanName**\             [HumanName](#_humanname)
  *optional*                         

  **minValueId**\                    [Id](#_id)
  *optional*                         

  **minValueIdentifier**\            [Identifier](#_identifier)
  *optional*                         

  **minValueInstant**\               [Instant](#_instant)
  *optional*                         

  **minValueInteger**\               [Integer](#_integer)
  *optional*                         

  **minValueMarkdown**\              [Markdown](#_markdown)
  *optional*                         

  **minValueMeta**\                  [Meta](#_meta)
  *optional*                         

  **minValueOid**\                   [Oid](#_oid)
  *optional*                         

  **minValuePeriod**\                [Period](#_period)
  *optional*                         

  **minValuePositiveInt**\           [PositiveInt](#_positiveint)
  *optional*                         

  **minValueQuantity**\              [Quantity](#_quantity)
  *optional*                         

  **minValueRange**\                 [Range](#_range)
  *optional*                         

  **minValueRatio**\                 [Ratio](#_ratio)
  *optional*                         

  **minValueReference**\             [Reference](#_reference)
  *optional*                         

  **minValueSampledData**\           [SampledData](#_sampleddata)
  *optional*                         

  **minValueSignature**\             [Signature](#_signature)
  *optional*                         

  **minValueString**\                string
  *optional*                         

  **minValueTime**\                  [Time](#_time)
  *optional*                         

  **minValueTiming**\                [Timing](#_timing)
  *optional*                         

  **minValueUnsignedInt**\           [UnsignedInt](#_unsignedint)
  *optional*                         

  **minValueUri**\                   [Uri](#_uri)
  *optional*                         

  **minValueUuid**\                  string(uuid)
  *optional*                         

  **mustSupport**\                   boolean
  *optional*                         

  **name**\                          string
  *optional*                         

  **nameReference**\                 string
  *optional*                         

  **path**\                          string
  *required*                         

  **patternAddress**\                [Address](#_address)
  *optional*                         

  **patternAnnotation**\             [Annotation](#_annotation)
  *optional*                         

  **patternAttachment**\             [Attachment](#_attachment)
  *optional*                         

  **patternBase64Binary**\           [Base64Binary](#_base64binary)
  *optional*                         

  **patternBoolean**\                boolean
  *optional*                         

  **patternCode**\                   [Code](#_code)
  *optional*                         

  **patternCodeableConcept**\        [CodeableConcept](#_codeableconcept)
  *optional*                         

  **patternCoding**\                 [Coding](#_coding)
  *optional*                         

  **patternContactPoint**\           [ContactPoint](#_contactpoint)
  *optional*                         

  **patternDate**\                   string(date)
  *optional*                         

  **patternDateTime**\               [DateTime](#_datetime)
  *optional*                         

  **patternDecimal**\                [Decimal](#_decimal)
  *optional*                         

  **patternHumanName**\              [HumanName](#_humanname)
  *optional*                         

  **patternId**\                     [Id](#_id)
  *optional*                         

  **patternIdentifier**\             [Identifier](#_identifier)
  *optional*                         

  **patternInstant**\                [Instant](#_instant)
  *optional*                         

  **patternInteger**\                [Integer](#_integer)
  *optional*                         

  **patternMarkdown**\               [Markdown](#_markdown)
  *optional*                         

  **patternMeta**\                   [Meta](#_meta)
  *optional*                         

  **patternOid**\                    [Oid](#_oid)
  *optional*                         

  **patternPeriod**\                 [Period](#_period)
  *optional*                         

  **patternPositiveInt**\            [PositiveInt](#_positiveint)
  *optional*                         

  **patternQuantity**\               [Quantity](#_quantity)
  *optional*                         

  **patternRange**\                  [Range](#_range)
  *optional*                         

  **patternRatio**\                  [Ratio](#_ratio)
  *optional*                         

  **patternReference**\              [Reference](#_reference)
  *optional*                         

  **patternSampledData**\            [SampledData](#_sampleddata)
  *optional*                         

  **patternSignature**\              [Signature](#_signature)
  *optional*                         

  **patternString**\                 string
  *optional*                         

  **patternTime**\                   [Time](#_time)
  *optional*                         

  **patternTiming**\                 [Timing](#_timing)
  *optional*                         

  **patternUnsignedInt**\            [UnsignedInt](#_unsignedint)
  *optional*                         

  **patternUri**\                    [Uri](#_uri)
  *optional*                         

  **patternUuid**\                   string(uuid)
  *optional*                         

  **representation**\                &lt; [PropertyRepresentation](#_propertyrepresentation) &gt; array
  *optional*                         

  **requirements**\                  [Markdown](#_markdown)
  *optional*                         

  **short**\                         string
  *optional*                         

  **slicing**\                       [ElementDefinitionSlicing](#_elementdefinitionslicing)
  *optional*                         

  **type**\                          &lt; [ElementDefinitionType](#_elementdefinitiontype) &gt; array
  *optional*                         
  -----------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitionbase){.anchor}8.194. ElementDefinitionBase {#_elementdefinitionbase}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **max**\         string
  *required*       

  **min**\         [Integer](#_integer)
  *required*       

  **path**\        string
  *required*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitionbinding){.anchor}8.195. ElementDefinitionBinding {#_elementdefinitionbinding}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **strength**\            [BindingStrength](#_bindingstrength)
  *required*               

  **valueSetReference**\   [Reference](#_reference)
  *optional*               

  **valueSetUri**\         [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitionconstraint){.anchor}8.196. ElementDefinitionConstraint {#_elementdefinitionconstraint}

  ----------------------------------------------------------------
  Name                Schema
  ------------------- --------------------------------------------
  **extension**\      &lt; [Extension](#_extension) &gt; array
  *optional*          

  **human**\          string
  *required*          

  **id**\             string
  *optional*          

  **key**\            [Id](#_id)
  *required*          

  **requirements**\   string
  *optional*          

  **severity**\       [ConstraintSeverity](#_constraintseverity)
  *required*          

  **xpath**\          string
  *required*          
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitionmapping){.anchor}8.197. ElementDefinitionMapping {#_elementdefinitionmapping}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **identity**\    [Id](#_id)
  *required*       

  **language**\    [Code](#_code)
  *optional*       

  **map**\         string
  *required*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitionslicing){.anchor}8.198. ElementDefinitionSlicing {#_elementdefinitionslicing}

  ---------------------------------------------------------------
  Name                 Schema
  -------------------- ------------------------------------------
  **description**\     string
  *optional*           

  **discriminator**\   &lt; string &gt; array
  *optional*           

  **extension**\       &lt; [Extension](#_extension) &gt; array
  *optional*           

  **id**\              string
  *optional*           

  **ordered**\         boolean
  *optional*           

  **rules**\           [SlicingRules](#_slicingrules)
  *required*           
  ---------------------------------------------------------------

</div>

<div class="sect2">

### [](#_elementdefinitiontype){.anchor}8.199. ElementDefinitionType {#_elementdefinitiontype}

  -------------------------------------------------------------------------
  Name               Schema
  ------------------ ------------------------------------------------------
  **aggregation**\   &lt; [AggregationMode](#_aggregationmode) &gt; array
  *optional*         

  **code**\          [Code](#_code)
  *required*         

  **extension**\     &lt; [Extension](#_extension) &gt; array
  *optional*         

  **id**\            string
  *optional*         

  **profile**\       &lt; [Uri](#_uri) &gt; array
  *optional*         
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_eligibilityrequest){.anchor}8.200. EligibilityRequest {#_eligibilityrequest}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **originalRuleset**\     [Coding](#_coding)
  *optional*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **ruleset**\             [Coding](#_coding)
  *optional*               

  **target**\              [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_eligibilityresponse){.anchor}8.201. EligibilityResponse {#_eligibilityresponse}

  -------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **created**\               [DateTime](#_datetime)
  *optional*                 

  **disposition**\           string
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **organization**\          [Reference](#_reference)
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **outcome**\               [Code](#_code)
  *optional*                 

  **request**\               [Reference](#_reference)
  *optional*                 

  **requestOrganization**\   [Reference](#_reference)
  *optional*                 

  **requestProvider**\       [Reference](#_reference)
  *optional*                 

  **ruleset**\               [Coding](#_coding)
  *optional*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounter){.anchor}8.202. Encounter {#_encounter}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **appointment**\         [Reference](#_reference)
  *optional*               

  **class**\               [EncounterClass](#_encounterclass)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **episodeOfCare**\       &lt; [Reference](#_reference) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **hospitalization**\     [EncounterHospitalization](#_encounterhospitalization)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **incomingReferral**\    &lt; [Reference](#_reference) &gt; array
  *optional*               

  **indication**\          &lt; [Reference](#_reference) &gt; array
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **length**\              [Duration](#_duration)
  *optional*               

  **location**\            &lt; [EncounterLocation](#_encounterlocation) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **partOf**\              [Reference](#_reference)
  *optional*               

  **participant**\         &lt; [EncounterParticipant](#_encounterparticipant) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **priority**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **serviceProvider**\     [Reference](#_reference)
  *optional*               

  **status**\              [EncounterState](#_encounterstate)
  *required*               

  **statusHistory**\       &lt; [EncounterStatusHistory](#_encounterstatushistory) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterclass){.anchor}8.203. EncounterClass {#_encounterclass}

  ------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INPATIENT, OUTPATIENT, AMBULATORY, EMERGENCY, HOME, FIELD, DAYTIME, VIRTUAL, OTHER)
  *optional*       
  ------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterhospitalization){.anchor}8.204. EncounterHospitalization {#_encounterhospitalization}

  ------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- ------------------------------------------------------
  **admitSource**\              [CodeableConcept](#_codeableconcept)
  *optional*                    

  **admittingDiagnosis**\       &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **destination**\              [Reference](#_reference)
  *optional*                    

  **dietPreference**\           &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **dischargeDiagnosis**\       &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **dischargeDisposition**\     [CodeableConcept](#_codeableconcept)
  *optional*                    

  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **id**\                       string
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **origin**\                   [Reference](#_reference)
  *optional*                    

  **preAdmissionIdentifier**\   [Identifier](#_identifier)
  *optional*                    

  **reAdmission**\              [CodeableConcept](#_codeableconcept)
  *optional*                    

  **specialArrangement**\       &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **specialCourtesy**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    
  ------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterlocation){.anchor}8.205. EncounterLocation {#_encounterlocation}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **location**\            [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **status**\              [EncounterLocationStatus](#_encounterlocationstatus)
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterlocationstatus){.anchor}8.206. EncounterLocationStatus {#_encounterlocationstatus}

  --------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PLANNED, ACTIVE, RESERVED, COMPLETED)
  *optional*       
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterparticipant){.anchor}8.207. EncounterParticipant {#_encounterparticipant}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **individual**\          [Reference](#_reference)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **type**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterstate){.anchor}8.208. EncounterState {#_encounterstate}

  --------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PLANNED, ARRIVED, IN\_PROGRESS, ONLEAVE, FINISHED, CANCELLED)
  *optional*       
  --------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_encounterstatushistory){.anchor}8.209. EncounterStatusHistory {#_encounterstatushistory}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *required*               

  **status**\              [EncounterState](#_encounterstate)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_enrollmentrequest){.anchor}8.210. EnrollmentRequest {#_enrollmentrequest}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **coverage**\            [Reference](#_reference)
  *required*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **originalRuleset**\     [Coding](#_coding)
  *optional*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **relationship**\        [Coding](#_coding)
  *required*               

  **ruleset**\             [Coding](#_coding)
  *optional*               

  **subject**\             [Reference](#_reference)
  *required*               

  **target**\              [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_enrollmentresponse){.anchor}8.211. EnrollmentResponse {#_enrollmentresponse}

  -------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **created**\               [DateTime](#_datetime)
  *optional*                 

  **disposition**\           string
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **organization**\          [Reference](#_reference)
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **outcome**\               [Code](#_code)
  *optional*                 

  **request**\               [Reference](#_reference)
  *optional*                 

  **requestOrganization**\   [Reference](#_reference)
  *optional*                 

  **requestProvider**\       [Reference](#_reference)
  *optional*                 

  **ruleset**\               [Coding](#_coding)
  *optional*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_episodeofcare){.anchor}8.212. EpisodeOfCare {#_episodeofcare}

  --------------------------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ----------------------------------------------------------------------------
  **careManager**\            [Reference](#_reference)
  *optional*                  

  **careTeam**\               &lt; [EpisodeOfCareCareTeam](#_episodeofcarecareteam) &gt; array
  *optional*                  

  **condition**\              &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **managingOrganization**\   [Reference](#_reference)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **patient**\                [Reference](#_reference)
  *required*                  

  **period**\                 [Period](#_period)
  *optional*                  

  **referralRequest**\        &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **status**\                 [EpisodeOfCareStatus](#_episodeofcarestatus)
  *required*                  

  **statusHistory**\          &lt; [EpisodeOfCareStatusHistory](#_episodeofcarestatushistory) &gt; array
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  

  **type**\                   &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                  
  --------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_episodeofcarecareteam){.anchor}8.213. EpisodeOfCareCareTeam {#_episodeofcarecareteam}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **member**\              [Reference](#_reference)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **role**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_episodeofcarestatus){.anchor}8.214. EpisodeOfCareStatus {#_episodeofcarestatus}

  --------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PLANNED, WAITLIST, ACTIVE, ONHOLD, FINISHED, CANCELLED)
  *optional*       
  --------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_episodeofcarestatushistory){.anchor}8.215. EpisodeOfCareStatusHistory {#_episodeofcarestatushistory}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *required*               

  **status**\              [EpisodeOfCareStatus](#_episodeofcarestatus)
  *required*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_eventtiming){.anchor}8.216. EventTiming {#_eventtiming}

  ---------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (HS, WAKE, C, CM, CD, CV, AC, ACM, ACD, ACV, PC, PCM, PCD, PCV)
  *optional*       
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_explanationofbenefit){.anchor}8.217. ExplanationOfBenefit {#_explanationofbenefit}

  -------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **created**\               [DateTime](#_datetime)
  *optional*                 

  **disposition**\           string
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **organization**\          [Reference](#_reference)
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **outcome**\               [Code](#_code)
  *optional*                 

  **request**\               [Reference](#_reference)
  *optional*                 

  **requestOrganization**\   [Reference](#_reference)
  *optional*                 

  **requestProvider**\       [Reference](#_reference)
  *optional*                 

  **ruleset**\               [Coding](#_coding)
  *optional*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_extensioncontext){.anchor}8.218. ExtensionContext {#_extensioncontext}

  ----------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (RESOURCE, DATATYPE, MAPPING, EXTENSION)
  *optional*       
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_familyhistorystatus){.anchor}8.219. FamilyHistoryStatus {#_familyhistorystatus}

  ---------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PARTIAL, COMPLETED, ENTERED\_IN\_ERROR, HEALTH\_UNKNOWN)
  *optional*       
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_familymemberhistory){.anchor}8.220. FamilyMemberHistory {#_familymemberhistory}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **ageQuantity**\         [Age](#_age)
  *optional*               

  **ageRange**\            [Range](#_range)
  *optional*               

  **ageString**\           string
  *optional*               

  **bornDate**\            string(date)
  *optional*               

  **bornPeriod**\          [Period](#_period)
  *optional*               

  **bornString**\          string
  *optional*               

  **condition**\           &lt; [FamilyMemberHistoryCondition](#_familymemberhistorycondition) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **deceasedBoolean**\     boolean
  *optional*               

  **deceasedDate**\        string(date)
  *optional*               

  **deceasedQuantity**\    [Age](#_age)
  *optional*               

  **deceasedRange**\       [Range](#_range)
  *optional*               

  **deceasedString**\      string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **gender**\              [Code](#_code)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **note**\                [Annotation](#_annotation)
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **relationship**\        [CodeableConcept](#_codeableconcept)
  *required*               

  **status**\              [FamilyHistoryStatus](#_familyhistorystatus)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_familymemberhistorycondition){.anchor}8.221. FamilyMemberHistoryCondition {#_familymemberhistorycondition}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                [Annotation](#_annotation)
  *optional*               

  **onsetPeriod**\         [Period](#_period)
  *optional*               

  **onsetQuantity**\       [Age](#_age)
  *optional*               

  **onsetRange**\          [Range](#_range)
  *optional*               

  **onsetString**\         string
  *optional*               

  **outcome**\             [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_filteroperator){.anchor}8.222. FilterOperator {#_filteroperator}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_flag){.anchor}8.223. Flag {#_flag}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **category**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **status**\              [FlagStatus](#_flagstatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_flagstatus){.anchor}8.224. FlagStatus {#_flagstatus}

  --------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, INACTIVE, ENTERED\_IN\_ERROR)
  *optional*       
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_goal){.anchor}8.225. Goal {#_goal}

  --------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ----------------------------------------------------------
  **addresses**\              &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **author**\                 [Reference](#_reference)
  *optional*                  

  **category**\               &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **description**\            string
  *required*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **note**\                   &lt; [Annotation](#_annotation) &gt; array
  *optional*                  

  **outcome**\                &lt; [GoalOutcome](#_goaloutcome) &gt; array
  *optional*                  

  **priority**\               [CodeableConcept](#_codeableconcept)
  *optional*                  

  **startCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                  

  **startDate**\              string(date)
  *optional*                  

  **status**\                 [GoalStatus](#_goalstatus)
  *required*                  

  **statusDate**\             string(date)
  *optional*                  

  **statusReason**\           [CodeableConcept](#_codeableconcept)
  *optional*                  

  **subject**\                [Reference](#_reference)
  *optional*                  

  **targetDate**\             string(date)
  *optional*                  

  **targetQuantity**\         [Duration](#_duration)
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  
  --------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_goaloutcome){.anchor}8.226. GoalOutcome {#_goaloutcome}

  -----------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ------------------------------------------
  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **id**\                      string
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **resultCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **resultReference**\         [Reference](#_reference)
  *optional*                   
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_goalstatus){.anchor}8.227. GoalStatus {#_goalstatus}

  ------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, PLANNED, ACCEPTED, REJECTED, IN\_PROGRESS, ACHIEVED, SUSTAINING, ON\_HOLD, CANCELLED)
  *optional*       
  ------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_group){.anchor}8.228. Group {#_group}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **actual**\              boolean
  *required*               

  **characteristic**\      &lt; [GroupCharacteristic](#_groupcharacteristic) &gt; array
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **member**\              &lt; [GroupMember](#_groupmember) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **quantity**\            [UnsignedInt](#_unsignedint)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [GroupType](#_grouptype)
  *required*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_groupcharacteristic){.anchor}8.229. GroupCharacteristic {#_groupcharacteristic}

  ----------------------------------------------------------------------
  Name                        Schema
  --------------------------- ------------------------------------------
  **code**\                   [CodeableConcept](#_codeableconcept)
  *required*                  

  **exclude**\                boolean
  *required*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     string
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **period**\                 [Period](#_period)
  *optional*                  

  **valueBoolean**\           boolean
  *optional*                  

  **valueCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                  

  **valueQuantity**\          [Quantity](#_quantity)
  *optional*                  

  **valueRange**\             [Range](#_range)
  *optional*                  
  ----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_groupmember){.anchor}8.230. GroupMember {#_groupmember}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **entity**\              [Reference](#_reference)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **inactive**\            boolean
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_grouptype){.anchor}8.231. GroupType {#_grouptype}

  -------------------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PERSON, ANIMAL, PRACTITIONER, DEVICE, MEDICATION, SUBSTANCE)
  *optional*       
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_guidedependencytype){.anchor}8.232. GuideDependencyType {#_guidedependencytype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REFERENCE, INCLUSION)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_guidepagekind){.anchor}8.233. GuidePageKind {#_guidepagekind}

  --------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PAGE, EXAMPLE, LIST, INCLUDE, DIRECTORY, DICTIONARY, TOC, RESOURCE)
  *optional*       
  --------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_guideresourcepurpose){.anchor}8.234. GuideResourcePurpose {#_guideresourcepurpose}

  ---------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (EXAMPLE, TERMINOLOGY, PROFILE, EXTENSION, DICTIONARY, LOGICAL)
  *optional*       
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_httpverb){.anchor}8.235. HTTPVerb {#_httpverb}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (GET, POST, PUT, DELETE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_healthcareservice){.anchor}8.236. HealthcareService {#_healthcareservice}

  ------------------------------------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- ------------------------------------------------------------------------------------
  **appointmentRequired**\      boolean
  *optional*                    

  **availabilityExceptions**\   string
  *optional*                    

  **availableTime**\            &lt; [HealthcareServiceAvailableTime](#_healthcareserviceavailabletime) &gt; array
  *optional*                    

  **characteristic**\           &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **comment**\                  string
  *optional*                    

  **contained**\                &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                    

  **coverageArea**\             &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **eligibility**\              [CodeableConcept](#_codeableconcept)
  *optional*                    

  **eligibilityNote**\          string
  *optional*                    

  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **extraDetails**\             string
  *optional*                    

  **id**\                       [Id](#_id)
  *optional*                    

  **identifier**\               &lt; [Identifier](#_identifier) &gt; array
  *optional*                    

  **implicitRules**\            [Uri](#_uri)
  *optional*                    

  **language**\                 [Code](#_code)
  *optional*                    

  **location**\                 [Reference](#_reference)
  *required*                    

  **meta**\                     [Meta](#_meta)
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **notAvailable**\             &lt; [HealthcareServiceNotAvailable](#_healthcareservicenotavailable) &gt; array
  *optional*                    

  **photo**\                    [Attachment](#_attachment)
  *optional*                    

  **programName**\              &lt; string &gt; array
  *optional*                    

  **providedBy**\               [Reference](#_reference)
  *optional*                    

  **publicKey**\                string
  *optional*                    

  **referralMethod**\           &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **serviceCategory**\          [CodeableConcept](#_codeableconcept)
  *optional*                    

  **serviceName**\              string
  *optional*                    

  **serviceProvisionCode**\     &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **serviceType**\              &lt; [HealthcareServiceServiceType](#_healthcareserviceservicetype) &gt; array
  *optional*                    

  **telecom**\                  &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*                    

  **text**\                     [Narrative](#_narrative)
  *optional*                    
  ------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_healthcareserviceavailabletime){.anchor}8.237. HealthcareServiceAvailableTime {#_healthcareserviceavailabletime}

  ----------------------------------------------------------------------
  Name                      Schema
  ------------------------- --------------------------------------------
  **allDay**\               boolean
  *optional*                

  **availableEndTime**\     [Time](#_time)
  *optional*                

  **availableStartTime**\   [Time](#_time)
  *optional*                

  **daysOfWeek**\           &lt; [DaysOfWeek](#_daysofweek) &gt; array
  *optional*                

  **extension**\            &lt; [Extension](#_extension) &gt; array
  *optional*                

  **id**\                   string
  *optional*                

  **modifierExtension**\    &lt; [Extension](#_extension) &gt; array
  *optional*                
  ----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_healthcareservicenotavailable){.anchor}8.238. HealthcareServiceNotAvailable {#_healthcareservicenotavailable}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **description**\         string
  *required*               

  **during**\              [Period](#_period)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_healthcareserviceservicetype){.anchor}8.239. HealthcareServiceServiceType {#_healthcareserviceservicetype}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **specialty**\           &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_humanname){.anchor}8.240. HumanName {#_humanname}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **family**\      &lt; string &gt; array
  *optional*       

  **given**\       &lt; string &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **period**\      [Period](#_period)
  *optional*       

  **prefix**\      &lt; string &gt; array
  *optional*       

  **suffix**\      &lt; string &gt; array
  *optional*       

  **text**\        string
  *optional*       

  **use**\         [NameUse](#_nameuse)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_id){.anchor}8.241. Id {#_id}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_identifier){.anchor}8.242. Identifier {#_identifier}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **assigner**\    [Reference](#_reference)
  *optional*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **period**\      [Period](#_period)
  *optional*       

  **system**\      [Uri](#_uri)
  *optional*       

  **type**\        [CodeableConcept](#_codeableconcept)
  *optional*       

  **use**\         [IdentifierUse](#_identifieruse)
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_identifieruse){.anchor}8.243. IdentifierUse {#_identifieruse}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (USUAL, OFFICIAL, TEMP, SECONDARY)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_identityassurancelevel){.anchor}8.244. IdentityAssuranceLevel {#_identityassurancelevel}

  ----------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (LEVEL\_1, LEVEL\_2, LEVEL\_3, LEVEL\_4)
  *optional*       
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingobjectselection){.anchor}8.245. ImagingObjectSelection {#_imagingobjectselection}

  -------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **authoringTime**\       [DateTime](#_datetime)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **study**\               &lt; [ImagingObjectSelectionStudy](#_imagingobjectselectionstudy) &gt; array
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **title**\               [CodeableConcept](#_codeableconcept)
  *required*               

  **uid**\                 [Oid](#_oid)
  *required*               
  -------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingobjectselectionframes){.anchor}8.246. ImagingObjectSelectionFrames {#_imagingobjectselectionframes}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **frameNumbers**\        &lt; [UnsignedInt](#_unsignedint) &gt; array
  *required*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingobjectselectioninstance){.anchor}8.247. ImagingObjectSelectionInstance {#_imagingobjectselectioninstance}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **frames**\              &lt; [ImagingObjectSelectionFrames](#_imagingobjectselectionframes) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **sopClass**\            [Oid](#_oid)
  *required*               

  **uid**\                 [Oid](#_oid)
  *required*               

  **url**\                 [Uri](#_uri)
  *required*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingobjectselectionseries){.anchor}8.248. ImagingObjectSelectionSeries {#_imagingobjectselectionseries}

  -------------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **instance**\            &lt; [ImagingObjectSelectionInstance](#_imagingobjectselectioninstance) &gt; array
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **uid**\                 [Oid](#_oid)
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingobjectselectionstudy){.anchor}8.249. ImagingObjectSelectionStudy {#_imagingobjectselectionstudy}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **imagingStudy**\        [Reference](#_reference)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **series**\              &lt; [ImagingObjectSelectionSeries](#_imagingobjectselectionseries) &gt; array
  *required*               

  **uid**\                 [Oid](#_oid)
  *required*               

  **url**\                 [Uri](#_uri)
  *optional*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingstudy){.anchor}8.250. ImagingStudy {#_imagingstudy}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **accession**\           [Identifier](#_identifier)
  *optional*               

  **availability**\        [InstanceAvailability](#_instanceavailability)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **interpreter**\         [Reference](#_reference)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modalityList**\        &lt; [Coding](#_coding) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **numberOfInstances**\   [UnsignedInt](#_unsignedint)
  *required*               

  **numberOfSeries**\      [UnsignedInt](#_unsignedint)
  *required*               

  **order**\               &lt; [Reference](#_reference) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **procedure**\           &lt; [Reference](#_reference) &gt; array
  *optional*               

  **referrer**\            [Reference](#_reference)
  *optional*               

  **series**\              &lt; [ImagingStudySeries](#_imagingstudyseries) &gt; array
  *optional*               

  **started**\             [DateTime](#_datetime)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **uid**\                 [Oid](#_oid)
  *required*               

  **url**\                 [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingstudyinstance){.anchor}8.251. ImagingStudyInstance {#_imagingstudyinstance}

  ---------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------
  **content**\             &lt; [Attachment](#_attachment) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **number**\              [UnsignedInt](#_unsignedint)
  *optional*               

  **sopClass**\            [Oid](#_oid)
  *required*               

  **title**\               string
  *optional*               

  **type**\                string
  *optional*               

  **uid**\                 [Oid](#_oid)
  *required*               
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_imagingstudyseries){.anchor}8.252. ImagingStudySeries {#_imagingstudyseries}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **availability**\        [InstanceAvailability](#_instanceavailability)
  *optional*               

  **bodySite**\            [Coding](#_coding)
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **instance**\            &lt; [ImagingStudyInstance](#_imagingstudyinstance) &gt; array
  *optional*               

  **laterality**\          [Coding](#_coding)
  *optional*               

  **modality**\            [Coding](#_coding)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **number**\              [UnsignedInt](#_unsignedint)
  *optional*               

  **numberOfInstances**\   [UnsignedInt](#_unsignedint)
  *required*               

  **started**\             [DateTime](#_datetime)
  *optional*               

  **uid**\                 [Oid](#_oid)
  *required*               

  **url**\                 [Uri](#_uri)
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunization){.anchor}8.253. Immunization {#_immunization}

  -----------------------------------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- --------------------------------------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **date**\                  [DateTime](#_datetime)
  *optional*                 

  **doseQuantity**\          [SimpleQuantity](#_simplequantity)
  *optional*                 

  **encounter**\             [Reference](#_reference)
  *optional*                 

  **expirationDate**\        string(date)
  *optional*                 

  **explanation**\           [ImmunizationExplanation](#_immunizationexplanation)
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **location**\              [Reference](#_reference)
  *optional*                 

  **lotNumber**\             string
  *optional*                 

  **manufacturer**\          [Reference](#_reference)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **note**\                  &lt; [Annotation](#_annotation) &gt; array
  *optional*                 

  **patient**\               [Reference](#_reference)
  *required*                 

  **performer**\             [Reference](#_reference)
  *optional*                 

  **reaction**\              &lt; [ImmunizationReaction](#_immunizationreaction) &gt; array
  *optional*                 

  **reported**\              boolean
  *required*                 

  **requester**\             [Reference](#_reference)
  *optional*                 

  **route**\                 [CodeableConcept](#_codeableconcept)
  *optional*                 

  **site**\                  [CodeableConcept](#_codeableconcept)
  *optional*                 

  **status**\                [Code](#_code)
  *required*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 

  **vaccinationProtocol**\   &lt; [ImmunizationVaccinationProtocol](#_immunizationvaccinationprotocol) &gt; array
  *optional*                 

  **vaccineCode**\           [CodeableConcept](#_codeableconcept)
  *required*                 

  **wasNotGiven**\           boolean
  *required*                 
  -----------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationexplanation){.anchor}8.254. ImmunizationExplanation {#_immunizationexplanation}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **reasonNotGiven**\      &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationreaction){.anchor}8.255. ImmunizationReaction {#_immunizationreaction}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **date**\                [DateTime](#_datetime)
  *optional*               

  **detail**\              [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reported**\            boolean
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationrecommendation){.anchor}8.256. ImmunizationRecommendation {#_immunizationrecommendation}

  ---------------------------------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **recommendation**\      &lt; [ImmunizationRecommendationRecommendation](#_immunizationrecommendationrecommendation) &gt; array
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationrecommendationdatecriterion){.anchor}8.257. ImmunizationRecommendationDateCriterion {#_immunizationrecommendationdatecriterion}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               [DateTime](#_datetime)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationrecommendationprotocol){.anchor}8.258. ImmunizationRecommendationProtocol {#_immunizationrecommendationprotocol}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **authority**\           [Reference](#_reference)
  *optional*               

  **description**\         string
  *optional*               

  **doseSequence**\        [Integer](#_integer)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **series**\              string
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationrecommendationrecommendation){.anchor}8.259. ImmunizationRecommendationRecommendation {#_immunizationrecommendationrecommendation}

  ------------------------------------------------------------------------------------------------------------------------------------------
  Name                                Schema
  ----------------------------------- ------------------------------------------------------------------------------------------------------
  **date**\                           [DateTime](#_datetime)
  *required*                          

  **dateCriterion**\                  &lt; [ImmunizationRecommendationDateCriterion](#_immunizationrecommendationdatecriterion) &gt; array
  *optional*                          

  **doseNumber**\                     [PositiveInt](#_positiveint)
  *optional*                          

  **extension**\                      &lt; [Extension](#_extension) &gt; array
  *optional*                          

  **forecastStatus**\                 [CodeableConcept](#_codeableconcept)
  *required*                          

  **id**\                             string
  *optional*                          

  **modifierExtension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                          

  **protocol**\                       [ImmunizationRecommendationProtocol](#_immunizationrecommendationprotocol)
  *optional*                          

  **supportingImmunization**\         &lt; [Reference](#_reference) &gt; array
  *optional*                          

  **supportingPatientInformation**\   &lt; [Reference](#_reference) &gt; array
  *optional*                          

  **vaccineCode**\                    [CodeableConcept](#_codeableconcept)
  *required*                          
  ------------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_immunizationvaccinationprotocol){.anchor}8.260. ImmunizationVaccinationProtocol {#_immunizationvaccinationprotocol}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **authority**\           [Reference](#_reference)
  *optional*               

  **description**\         string
  *optional*               

  **doseSequence**\        [PositiveInt](#_positiveint)
  *required*               

  **doseStatus**\          [CodeableConcept](#_codeableconcept)
  *required*               

  **doseStatusReason**\    [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **series**\              string
  *optional*               

  **seriesDoses**\         [PositiveInt](#_positiveint)
  *optional*               

  **targetDisease**\       &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *required*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguide){.anchor}8.261. ImplementationGuide {#_implementationguide}

  -----------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------------
  **binary**\              &lt; [Uri](#_uri) &gt; array
  *optional*               

  **contact**\             &lt; [ImplementationGuideContact](#_implementationguidecontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **dependency**\          &lt; [ImplementationGuideDependency](#_implementationguidedependency) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fhirVersion**\         [Id](#_id)
  *optional*               

  **global**\              &lt; [ImplementationGuideGlobal](#_implementationguideglobal) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **package**\             &lt; [ImplementationGuidePackage](#_implementationguidepackage) &gt; array
  *required*               

  **page**\                [ImplementationGuidePage](#_implementationguidepage)
  *required*               

  **publisher**\           string
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguidecontact){.anchor}8.262. ImplementationGuideContact {#_implementationguidecontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguidedependency){.anchor}8.263. ImplementationGuideDependency {#_implementationguidedependency}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **type**\                [GuideDependencyType](#_guidedependencytype)
  *required*               

  **uri**\                 [Uri](#_uri)
  *required*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguideglobal){.anchor}8.264. ImplementationGuideGlobal {#_implementationguideglobal}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **profile**\             [Reference](#_reference)
  *required*               

  **type**\                [Code](#_code)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguidepackage){.anchor}8.265. ImplementationGuidePackage {#_implementationguidepackage}

  -------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------------
  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **resource**\            &lt; [ImplementationGuideResource](#_implementationguideresource) &gt; array
  *required*               
  -------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguidepage){.anchor}8.266. ImplementationGuidePage {#_implementationguidepage}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **format**\              [Code](#_code)
  *optional*               

  **id**\                  string
  *optional*               

  **kind**\                [GuidePageKind](#_guidepagekind)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **package**\             &lt; string &gt; array
  *optional*               

  **page**\                &lt; [ImplementationGuidePage](#_implementationguidepage) &gt; array
  *optional*               

  **source**\              [Uri](#_uri)
  *required*               

  **type**\                &lt; [Code](#_code) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_implementationguideresource){.anchor}8.267. ImplementationGuideResource {#_implementationguideresource}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **acronym**\             string
  *optional*               

  **description**\         string
  *optional*               

  **exampleFor**\          [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **purpose**\             [GuideResourcePurpose](#_guideresourcepurpose)
  *required*               

  **sourceReference**\     [Reference](#_reference)
  *optional*               

  **sourceUri**\           [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_instanceavailability){.anchor}8.268. InstanceAvailability {#_instanceavailability}

  ----------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ONLINE, OFFLINE, NEARLINE, UNAVAILABLE)
  *optional*       
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_instant){.anchor}8.269. Instant {#_instant}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_integer){.anchor}8.270. Integer {#_integer}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       integer(int32)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_issueseverity){.anchor}8.271. IssueSeverity {#_issueseverity}

  ------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (FATAL, ERROR, WARNING, INFORMATION)
  *optional*       
  ------------------------------------------------------------

</div>

<div class="sect2">

### [](#_issuetype){.anchor}8.272. IssueType {#_issuetype}

  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INVALID, STRUCTURE, REQUIRED, VALUE, INVARIANT, SECURITY, LOGIN, UNKNOWN, EXPIRED, FORBIDDEN, SUPPRESSED, PROCESSING, NOT\_SUPPORTED, DUPLICATE, NOT\_FOUND, TOO\_LONG, CODE\_INVALID, EXTENSION, TOO\_COSTLY, BUSINESS\_RULE, CONFLICT, INCOMPLETE, TRANSIENT, LOCK\_ERROR, NO\_STORE, EXCEPTION, TIMEOUT, THROTTLED, INFORMATIONAL)
  *optional*       
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_linktype){.anchor}8.273. LinkType {#_linktype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REPLACE, REFER, SEEALSO)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_list){.anchor}8.274. List {#_list}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **emptyReason**\         [CodeableConcept](#_codeableconcept)
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **entry**\               &lt; [ListEntry](#_listentry) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **mode**\                [ListMode](#_listmode)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **note**\                string
  *optional*               

  **orderedBy**\           [CodeableConcept](#_codeableconcept)
  *optional*               

  **source**\              [Reference](#_reference)
  *optional*               

  **status**\              [ListStatus](#_liststatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **title**\               string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_listentry){.anchor}8.275. ListEntry {#_listentry}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **date**\                [DateTime](#_datetime)
  *optional*               

  **deleted**\             boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **flag**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_listmode){.anchor}8.276. ListMode {#_listmode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (WORKING, SNAPSHOT, CHANGES)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_liststatus){.anchor}8.277. ListStatus {#_liststatus}

  --------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CURRENT, RETIRED, ENTERED\_IN\_ERROR)
  *optional*       
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_location){.anchor}8.278. Location {#_location}

  --------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ----------------------------------------------------------
  **address**\                [Address](#_address)
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **description**\            string
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **managingOrganization**\   [Reference](#_reference)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **mode**\                   [LocationMode](#_locationmode)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **name**\                   string
  *optional*                  

  **partOf**\                 [Reference](#_reference)
  *optional*                  

  **physicalType**\           [CodeableConcept](#_codeableconcept)
  *optional*                  

  **position**\               [LocationPosition](#_locationposition)
  *optional*                  

  **status**\                 [LocationStatus](#_locationstatus)
  *optional*                  

  **telecom**\                &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  

  **type**\                   [CodeableConcept](#_codeableconcept)
  *optional*                  
  --------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_locationmode){.anchor}8.279. LocationMode {#_locationmode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (INSTANCE, KIND)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_locationposition){.anchor}8.280. LocationPosition {#_locationposition}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **altitude**\            [Decimal](#_decimal)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **latitude**\            [Decimal](#_decimal)
  *required*               

  **longitude**\           [Decimal](#_decimal)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_locationstatus){.anchor}8.281. LocationStatus {#_locationstatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, SUSPENDED, INACTIVE)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_markdown){.anchor}8.282. Markdown {#_markdown}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_measmntprinciple){.anchor}8.283. MeasmntPrinciple {#_measmntprinciple}

  ---------------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (OTHER, CHEMICAL, ELECTRICAL, IMPEDANCE, NUCLEAR, OPTICAL, THERMAL, BIOLOGICAL, MECHANICAL, ACOUSTICAL, MANUAL)
  *optional*       
  ---------------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_media){.anchor}8.284. Media {#_media}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **content**\             [Attachment](#_attachment)
  *required*               

  **deviceName**\          string
  *optional*               

  **duration**\            [UnsignedInt](#_unsignedint)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **frames**\              [PositiveInt](#_positiveint)
  *optional*               

  **height**\              [PositiveInt](#_positiveint)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operator**\            [Reference](#_reference)
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **subtype**\             [CodeableConcept](#_codeableconcept)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [DigitalMediaType](#_digitalmediatype)
  *required*               

  **view**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **width**\               [PositiveInt](#_positiveint)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medication){.anchor}8.285. Medication {#_medication}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **isBrand**\             boolean
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **manufacturer**\        [Reference](#_reference)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **package**\             [MedicationPackage](#_medicationpackage)
  *optional*               

  **product**\             [MedicationProduct](#_medicationproduct)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationadministration){.anchor}8.286. MedicationAdministration {#_medicationadministration}

  -----------------------------------------------------------------------------------------------------
  Name                             Schema
  -------------------------------- --------------------------------------------------------------------
  **contained**\                   &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                       

  **device**\                      &lt; [Reference](#_reference) &gt; array
  *optional*                       

  **dosage**\                      [MedicationAdministrationDosage](#_medicationadministrationdosage)
  *optional*                       

  **effectiveTimeDateTime**\       [DateTime](#_datetime)
  *optional*                       

  **effectiveTimePeriod**\         [Period](#_period)
  *optional*                       

  **encounter**\                   [Reference](#_reference)
  *optional*                       

  **extension**\                   &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **id**\                          [Id](#_id)
  *optional*                       

  **identifier**\                  &lt; [Identifier](#_identifier) &gt; array
  *optional*                       

  **implicitRules**\               [Uri](#_uri)
  *optional*                       

  **language**\                    [Code](#_code)
  *optional*                       

  **medicationCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                       

  **medicationReference**\         [Reference](#_reference)
  *optional*                       

  **meta**\                        [Meta](#_meta)
  *optional*                       

  **modifierExtension**\           &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **note**\                        string
  *optional*                       

  **patient**\                     [Reference](#_reference)
  *required*                       

  **practitioner**\                [Reference](#_reference)
  *optional*                       

  **prescription**\                [Reference](#_reference)
  *optional*                       

  **reasonGiven**\                 &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                       

  **reasonNotGiven**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                       

  **status**\                      [MedicationAdministrationStatus](#_medicationadministrationstatus)
  *required*                       

  **text**\                        [Narrative](#_narrative)
  *optional*                       

  **wasNotGiven**\                 boolean
  *optional*                       
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationadministrationdosage){.anchor}8.287. MedicationAdministrationDosage {#_medicationadministrationdosage}

  ---------------------------------------------------------------------
  Name                       Schema
  -------------------------- ------------------------------------------
  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    string
  *optional*                 

  **method**\                [CodeableConcept](#_codeableconcept)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **quantity**\              [SimpleQuantity](#_simplequantity)
  *optional*                 

  **rateRange**\             [Range](#_range)
  *optional*                 

  **rateRatio**\             [Ratio](#_ratio)
  *optional*                 

  **route**\                 [CodeableConcept](#_codeableconcept)
  *optional*                 

  **siteCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                 

  **siteReference**\         [Reference](#_reference)
  *optional*                 

  **text**\                  string
  *optional*                 
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationadministrationstatus){.anchor}8.288. MedicationAdministrationStatus {#_medicationadministrationstatus}

  ----------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, ON\_HOLD, COMPLETED, ENTERED\_IN\_ERROR, STOPPED)
  *optional*       
  ----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationbatch){.anchor}8.289. MedicationBatch {#_medicationbatch}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **expirationDate**\      [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **lotNumber**\           string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationcontent){.anchor}8.290. MedicationContent {#_medicationcontent}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [SimpleQuantity](#_simplequantity)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationdispense){.anchor}8.291. MedicationDispense {#_medicationdispense}

  -------------------------------------------------------------------------------------------------------------------------------
  Name                             Schema
  -------------------------------- ----------------------------------------------------------------------------------------------
  **authorizingPrescription**\     &lt; [Reference](#_reference) &gt; array
  *optional*                       

  **contained**\                   &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                       

  **daysSupply**\                  [SimpleQuantity](#_simplequantity)
  *optional*                       

  **destination**\                 [Reference](#_reference)
  *optional*                       

  **dispenser**\                   [Reference](#_reference)
  *optional*                       

  **dosageInstruction**\           &lt; [MedicationDispenseDosageInstruction](#_medicationdispensedosageinstruction) &gt; array
  *optional*                       

  **extension**\                   &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **id**\                          [Id](#_id)
  *optional*                       

  **identifier**\                  [Identifier](#_identifier)
  *optional*                       

  **implicitRules**\               [Uri](#_uri)
  *optional*                       

  **language**\                    [Code](#_code)
  *optional*                       

  **medicationCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                       

  **medicationReference**\         [Reference](#_reference)
  *optional*                       

  **meta**\                        [Meta](#_meta)
  *optional*                       

  **modifierExtension**\           &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **note**\                        string
  *optional*                       

  **patient**\                     [Reference](#_reference)
  *optional*                       

  **quantity**\                    [SimpleQuantity](#_simplequantity)
  *optional*                       

  **receiver**\                    &lt; [Reference](#_reference) &gt; array
  *optional*                       

  **status**\                      [MedicationDispenseStatus](#_medicationdispensestatus)
  *optional*                       

  **substitution**\                [MedicationDispenseSubstitution](#_medicationdispensesubstitution)
  *optional*                       

  **text**\                        [Narrative](#_narrative)
  *optional*                       

  **type**\                        [CodeableConcept](#_codeableconcept)
  *optional*                       

  **whenHandedOver**\              [DateTime](#_datetime)
  *optional*                       

  **whenPrepared**\                [DateTime](#_datetime)
  *optional*                       
  -------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationdispensedosageinstruction){.anchor}8.292. MedicationDispenseDosageInstruction {#_medicationdispensedosageinstruction}

  -------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ------------------------------------------
  **additionalInstructions**\    [CodeableConcept](#_codeableconcept)
  *optional*                     

  **asNeededBoolean**\           boolean
  *optional*                     

  **asNeededCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **doseQuantity**\              [SimpleQuantity](#_simplequantity)
  *optional*                     

  **doseRange**\                 [Range](#_range)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        string
  *optional*                     

  **maxDosePerPeriod**\          [Ratio](#_ratio)
  *optional*                     

  **method**\                    [CodeableConcept](#_codeableconcept)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **rateRange**\                 [Range](#_range)
  *optional*                     

  **rateRatio**\                 [Ratio](#_ratio)
  *optional*                     

  **route**\                     [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteReference**\             [Reference](#_reference)
  *optional*                     

  **text**\                      string
  *optional*                     

  **timing**\                    [Timing](#_timing)
  *optional*                     
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationdispensestatus){.anchor}8.293. MedicationDispenseStatus {#_medicationdispensestatus}

  ----------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, ON\_HOLD, COMPLETED, ENTERED\_IN\_ERROR, STOPPED)
  *optional*       
  ----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationdispensesubstitution){.anchor}8.294. MedicationDispenseSubstitution {#_medicationdispensesubstitution}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **responsibleParty**\    &lt; [Reference](#_reference) &gt; array
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationingredient){.anchor}8.295. MedicationIngredient {#_medicationingredient}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Ratio](#_ratio)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **item**\                [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationorder){.anchor}8.296. MedicationOrder {#_medicationorder}

  -------------------------------------------------------------------------------------------------------------------------
  Name                             Schema
  -------------------------------- ----------------------------------------------------------------------------------------
  **contained**\                   &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                       

  **dateEnded**\                   [DateTime](#_datetime)
  *optional*                       

  **dateWritten**\                 [DateTime](#_datetime)
  *optional*                       

  **dispenseRequest**\             [MedicationOrderDispenseRequest](#_medicationorderdispenserequest)
  *optional*                       

  **dosageInstruction**\           &lt; [MedicationOrderDosageInstruction](#_medicationorderdosageinstruction) &gt; array
  *optional*                       

  **encounter**\                   [Reference](#_reference)
  *optional*                       

  **extension**\                   &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **id**\                          [Id](#_id)
  *optional*                       

  **identifier**\                  &lt; [Identifier](#_identifier) &gt; array
  *optional*                       

  **implicitRules**\               [Uri](#_uri)
  *optional*                       

  **language**\                    [Code](#_code)
  *optional*                       

  **medicationCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                       

  **medicationReference**\         [Reference](#_reference)
  *optional*                       

  **meta**\                        [Meta](#_meta)
  *optional*                       

  **modifierExtension**\           &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **note**\                        string
  *optional*                       

  **patient**\                     [Reference](#_reference)
  *optional*                       

  **prescriber**\                  [Reference](#_reference)
  *optional*                       

  **priorPrescription**\           [Reference](#_reference)
  *optional*                       

  **reasonCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                       

  **reasonEnded**\                 [CodeableConcept](#_codeableconcept)
  *optional*                       

  **reasonReference**\             [Reference](#_reference)
  *optional*                       

  **status**\                      [MedicationOrderStatus](#_medicationorderstatus)
  *optional*                       

  **substitution**\                [MedicationOrderSubstitution](#_medicationordersubstitution)
  *optional*                       

  **text**\                        [Narrative](#_narrative)
  *optional*                       
  -------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationorderdispenserequest){.anchor}8.297. MedicationOrderDispenseRequest {#_medicationorderdispenserequest}

  ---------------------------------------------------------------------------
  Name                             Schema
  -------------------------------- ------------------------------------------
  **expectedSupplyDuration**\      [Duration](#_duration)
  *optional*                       

  **extension**\                   &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **id**\                          string
  *optional*                       

  **medicationCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                       

  **medicationReference**\         [Reference](#_reference)
  *optional*                       

  **modifierExtension**\           &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **numberOfRepeatsAllowed**\      [PositiveInt](#_positiveint)
  *optional*                       

  **quantity**\                    [SimpleQuantity](#_simplequantity)
  *optional*                       

  **validityPeriod**\              [Period](#_period)
  *optional*                       
  ---------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationorderdosageinstruction){.anchor}8.298. MedicationOrderDosageInstruction {#_medicationorderdosageinstruction}

  -------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ------------------------------------------
  **additionalInstructions**\    [CodeableConcept](#_codeableconcept)
  *optional*                     

  **asNeededBoolean**\           boolean
  *optional*                     

  **asNeededCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **doseQuantity**\              [SimpleQuantity](#_simplequantity)
  *optional*                     

  **doseRange**\                 [Range](#_range)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        string
  *optional*                     

  **maxDosePerPeriod**\          [Ratio](#_ratio)
  *optional*                     

  **method**\                    [CodeableConcept](#_codeableconcept)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **rateRange**\                 [Range](#_range)
  *optional*                     

  **rateRatio**\                 [Ratio](#_ratio)
  *optional*                     

  **route**\                     [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteReference**\             [Reference](#_reference)
  *optional*                     

  **text**\                      string
  *optional*                     

  **timing**\                    [Timing](#_timing)
  *optional*                     
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationorderstatus){.anchor}8.299. MedicationOrderStatus {#_medicationorderstatus}

  -----------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, ON\_HOLD, COMPLETED, ENTERED\_IN\_ERROR, STOPPED, DRAFT)
  *optional*       
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationordersubstitution){.anchor}8.300. MedicationOrderSubstitution {#_medicationordersubstitution}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationpackage){.anchor}8.301. MedicationPackage {#_medicationpackage}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **container**\           [CodeableConcept](#_codeableconcept)
  *optional*               

  **content**\             &lt; [MedicationContent](#_medicationcontent) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationproduct){.anchor}8.302. MedicationProduct {#_medicationproduct}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **batch**\               &lt; [MedicationBatch](#_medicationbatch) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **form**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **id**\                  string
  *optional*               

  **ingredient**\          &lt; [MedicationIngredient](#_medicationingredient) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationstatement){.anchor}8.303. MedicationStatement {#_medicationstatement}

  -------------------------------------------------------------------------------------------------------------
  Name                               Schema
  ---------------------------------- --------------------------------------------------------------------------
  **contained**\                     &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                         

  **dateAsserted**\                  [DateTime](#_datetime)
  *optional*                         

  **dosage**\                        &lt; [MedicationStatementDosage](#_medicationstatementdosage) &gt; array
  *optional*                         

  **effectiveDateTime**\             [DateTime](#_datetime)
  *optional*                         

  **effectivePeriod**\               [Period](#_period)
  *optional*                         

  **extension**\                     &lt; [Extension](#_extension) &gt; array
  *optional*                         

  **id**\                            [Id](#_id)
  *optional*                         

  **identifier**\                    &lt; [Identifier](#_identifier) &gt; array
  *optional*                         

  **implicitRules**\                 [Uri](#_uri)
  *optional*                         

  **informationSource**\             [Reference](#_reference)
  *optional*                         

  **language**\                      [Code](#_code)
  *optional*                         

  **medicationCodeableConcept**\     [CodeableConcept](#_codeableconcept)
  *optional*                         

  **medicationReference**\           [Reference](#_reference)
  *optional*                         

  **meta**\                          [Meta](#_meta)
  *optional*                         

  **modifierExtension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                         

  **note**\                          string
  *optional*                         

  **patient**\                       [Reference](#_reference)
  *required*                         

  **reasonForUseCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                         

  **reasonForUseReference**\         [Reference](#_reference)
  *optional*                         

  **reasonNotTaken**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                         

  **status**\                        [MedicationStatementStatus](#_medicationstatementstatus)
  *required*                         

  **supportingInformation**\         &lt; [Reference](#_reference) &gt; array
  *optional*                         

  **text**\                          [Narrative](#_narrative)
  *optional*                         

  **wasNotTaken**\                   boolean
  *optional*                         
  -------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationstatementdosage){.anchor}8.304. MedicationStatementDosage {#_medicationstatementdosage}

  -------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ------------------------------------------
  **asNeededBoolean**\           boolean
  *optional*                     

  **asNeededCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        string
  *optional*                     

  **maxDosePerPeriod**\          [Ratio](#_ratio)
  *optional*                     

  **method**\                    [CodeableConcept](#_codeableconcept)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **quantityQuantity**\          [SimpleQuantity](#_simplequantity)
  *optional*                     

  **quantityRange**\             [Range](#_range)
  *optional*                     

  **rateRange**\                 [Range](#_range)
  *optional*                     

  **rateRatio**\                 [Ratio](#_ratio)
  *optional*                     

  **route**\                     [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteCodeableConcept**\       [CodeableConcept](#_codeableconcept)
  *optional*                     

  **siteReference**\             [Reference](#_reference)
  *optional*                     

  **text**\                      string
  *optional*                     

  **timing**\                    [Timing](#_timing)
  *optional*                     
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_medicationstatementstatus){.anchor}8.305. MedicationStatementStatus {#_medicationstatementstatus}

  -------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACTIVE, COMPLETED, ENTERED\_IN\_ERROR, INTENDED)
  *optional*       
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_messageheader){.anchor}8.306. MessageHeader {#_messageheader}

  -------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **data**\                &lt; [Reference](#_reference) &gt; array
  *optional*               

  **destination**\         &lt; [MessageHeaderDestination](#_messageheaderdestination) &gt; array
  *optional*               

  **enterer**\             [Reference](#_reference)
  *optional*               

  **event**\               [Coding](#_coding)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **receiver**\            [Reference](#_reference)
  *optional*               

  **response**\            [MessageHeaderResponse](#_messageheaderresponse)
  *optional*               

  **responsible**\         [Reference](#_reference)
  *optional*               

  **source**\              [MessageHeaderSource](#_messageheadersource)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **timestamp**\           [Instant](#_instant)
  *required*               
  -------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_messageheaderdestination){.anchor}8.307. MessageHeaderDestination {#_messageheaderdestination}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **endpoint**\            [Uri](#_uri)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **target**\              [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_messageheaderresponse){.anchor}8.308. MessageHeaderResponse {#_messageheaderresponse}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [ResponseType](#_responsetype)
  *required*               

  **details**\             [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Id](#_id)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_messageheadersource){.anchor}8.309. MessageHeaderSource {#_messageheadersource}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **contact**\             [ContactPoint](#_contactpoint)
  *optional*               

  **endpoint**\            [Uri](#_uri)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **software**\            string
  *optional*               

  **version**\             string
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_messagesignificancecategory){.anchor}8.310. MessageSignificanceCategory {#_messagesignificancecategory}

  -------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CONSEQUENCE, CURRENCY, NOTIFICATION)
  *optional*       
  -------------------------------------------------------------

</div>

<div class="sect2">

### [](#_meta){.anchor}8.311. Meta {#_meta}

  -------------------------------------------------------------
  Name               Schema
  ------------------ ------------------------------------------
  **extension**\     &lt; [Extension](#_extension) &gt; array
  *optional*         

  **id**\            string
  *optional*         

  **lastUpdated**\   [Instant](#_instant)
  *optional*         

  **profile**\       &lt; [Uri](#_uri) &gt; array
  *optional*         

  **security**\      &lt; [Coding](#_coding) &gt; array
  *optional*         

  **tag**\           &lt; [Coding](#_coding) &gt; array
  *optional*         

  **versionId**\     [Id](#_id)
  *optional*         
  -------------------------------------------------------------

</div>

<div class="sect2">

### [](#_money){.anchor}8.312. Money {#_money}

  --------------------------------------------------------------
  Name              Schema
  ----------------- --------------------------------------------
  **code**\         [Code](#_code)
  *optional*        

  **comparator**\   [QuantityComparator](#_quantitycomparator)
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **system**\       [Uri](#_uri)
  *optional*        

  **unit**\         string
  *optional*        

  **value**\        [Decimal](#_decimal)
  *optional*        
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nameuse){.anchor}8.313. NameUse {#_nameuse}

  ---------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (USUAL, OFFICIAL, TEMP, NICKNAME, ANONYMOUS, OLD, MAIDEN)
  *optional*       
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_namingsystem){.anchor}8.314. NamingSystem {#_namingsystem}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **contact**\             &lt; [NamingSystemContact](#_namingsystemcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *required*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **kind**\                [NamingSystemType](#_namingsystemtype)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **publisher**\           string
  *optional*               

  **replacedBy**\          [Reference](#_reference)
  *optional*               

  **responsible**\         string
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **uniqueId**\            &lt; [NamingSystemUniqueId](#_namingsystemuniqueid) &gt; array
  *required*               

  **usage**\               string
  *optional*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_namingsystemcontact){.anchor}8.315. NamingSystemContact {#_namingsystemcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_namingsystemidentifiertype){.anchor}8.316. NamingSystemIdentifierType {#_namingsystemidentifiertype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (OID, UUID, URI, OTHER)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_namingsystemtype){.anchor}8.317. NamingSystemType {#_namingsystemtype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CODESYSTEM, IDENTIFIER, ROOT)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_namingsystemuniqueid){.anchor}8.318. NamingSystemUniqueId {#_namingsystemuniqueid}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **preferred**\           boolean
  *optional*               

  **type**\                [NamingSystemIdentifierType](#_namingsystemidentifiertype)
  *required*               

  **value**\               string
  *required*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_narrative){.anchor}8.319. Narrative {#_narrative}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **div**\         [Div](#_div)
  *required*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **status**\      [NarrativeStatus](#_narrativestatus)
  *required*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_narrativestatus){.anchor}8.320. NarrativeStatus {#_narrativestatus}

  ------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (GENERATED, EXTENSIONS, ADDITIONAL, EMPTY)
  *optional*       
  ------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionorder){.anchor}8.321. NutritionOrder {#_nutritionorder}

  ------------------------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- ------------------------------------------------------------------------
  **allergyIntolerance**\       &lt; [Reference](#_reference) &gt; array
  *optional*                    

  **contained**\                &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                    

  **dateTime**\                 [DateTime](#_datetime)
  *required*                    

  **encounter**\                [Reference](#_reference)
  *optional*                    

  **enteralFormula**\           [NutritionOrderEnteralFormula](#_nutritionorderenteralformula)
  *optional*                    

  **excludeFoodModifier**\      &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **foodPreferenceModifier**\   &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                    

  **id**\                       [Id](#_id)
  *optional*                    

  **identifier**\               &lt; [Identifier](#_identifier) &gt; array
  *optional*                    

  **implicitRules**\            [Uri](#_uri)
  *optional*                    

  **language**\                 [Code](#_code)
  *optional*                    

  **meta**\                     [Meta](#_meta)
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **oralDiet**\                 [NutritionOrderOralDiet](#_nutritionorderoraldiet)
  *optional*                    

  **orderer**\                  [Reference](#_reference)
  *optional*                    

  **patient**\                  [Reference](#_reference)
  *required*                    

  **status**\                   [NutritionOrderStatus](#_nutritionorderstatus)
  *optional*                    

  **supplement**\               &lt; [NutritionOrderSupplement](#_nutritionordersupplement) &gt; array
  *optional*                    

  **text**\                     [Narrative](#_narrative)
  *optional*                    
  ------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionorderadministration){.anchor}8.322. NutritionOrderAdministration {#_nutritionorderadministration}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **rateQuantity**\        [SimpleQuantity](#_simplequantity)
  *optional*               

  **rateRatio**\           [Ratio](#_ratio)
  *optional*               

  **schedule**\            [Timing](#_timing)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionorderenteralformula){.anchor}8.323. NutritionOrderEnteralFormula {#_nutritionorderenteralformula}

  -----------------------------------------------------------------------------------------------------------------
  Name                             Schema
  -------------------------------- --------------------------------------------------------------------------------
  **additiveProductName**\         string
  *optional*                       

  **additiveType**\                [CodeableConcept](#_codeableconcept)
  *optional*                       

  **administration**\              &lt; [NutritionOrderAdministration](#_nutritionorderadministration) &gt; array
  *optional*                       

  **administrationInstruction**\   string
  *optional*                       

  **baseFormulaProductName**\      string
  *optional*                       

  **baseFormulaType**\             [CodeableConcept](#_codeableconcept)
  *optional*                       

  **caloricDensity**\              [SimpleQuantity](#_simplequantity)
  *optional*                       

  **extension**\                   &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **id**\                          string
  *optional*                       

  **maxVolumeToDeliver**\          [SimpleQuantity](#_simplequantity)
  *optional*                       

  **modifierExtension**\           &lt; [Extension](#_extension) &gt; array
  *optional*                       

  **routeofAdministration**\       [CodeableConcept](#_codeableconcept)
  *optional*                       
  -----------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionordernutrient){.anchor}8.324. NutritionOrderNutrient {#_nutritionordernutrient}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [SimpleQuantity](#_simplequantity)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifier**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionorderoraldiet){.anchor}8.325. NutritionOrderOralDiet {#_nutritionorderoraldiet}

  ------------------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- --------------------------------------------------------------------
  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **fluidConsistencyType**\   &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                  

  **id**\                     string
  *optional*                  

  **instruction**\            string
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **nutrient**\               &lt; [NutritionOrderNutrient](#_nutritionordernutrient) &gt; array
  *optional*                  

  **schedule**\               &lt; [Timing](#_timing) &gt; array
  *optional*                  

  **texture**\                &lt; [NutritionOrderTexture](#_nutritionordertexture) &gt; array
  *optional*                  

  **type**\                   &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                  
  ------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionorderstatus){.anchor}8.326. NutritionOrderStatus {#_nutritionorderstatus}

  -----------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, DRAFT, PLANNED, REQUESTED, ACTIVE, ON\_HOLD, COMPLETED, CANCELLED)
  *optional*       
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionordersupplement){.anchor}8.327. NutritionOrderSupplement {#_nutritionordersupplement}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **instruction**\         string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **productName**\         string
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **schedule**\            &lt; [Timing](#_timing) &gt; array
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_nutritionordertexture){.anchor}8.328. NutritionOrderTexture {#_nutritionordertexture}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **foodType**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **id**\                  string
  *optional*               

  **modifier**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observation){.anchor}8.329. Observation {#_observation}

  ------------------------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- --------------------------------------------------------------------------
  **bodySite**\               [CodeableConcept](#_codeableconcept)
  *optional*                  

  **category**\               [CodeableConcept](#_codeableconcept)
  *optional*                  

  **code**\                   [CodeableConcept](#_codeableconcept)
  *required*                  

  **comments**\               string
  *optional*                  

  **component**\              &lt; [ObservationComponent](#_observationcomponent) &gt; array
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **dataAbsentReason**\       [CodeableConcept](#_codeableconcept)
  *optional*                  

  **device**\                 [Reference](#_reference)
  *optional*                  

  **effectiveDateTime**\      [DateTime](#_datetime)
  *optional*                  

  **effectivePeriod**\        [Period](#_period)
  *optional*                  

  **encounter**\              [Reference](#_reference)
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **interpretation**\         [CodeableConcept](#_codeableconcept)
  *optional*                  

  **issued**\                 [Instant](#_instant)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **method**\                 [CodeableConcept](#_codeableconcept)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **performer**\              &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **referenceRange**\         &lt; [ObservationReferenceRange](#_observationreferencerange) &gt; array
  *optional*                  

  **related**\                &lt; [ObservationRelated](#_observationrelated) &gt; array
  *optional*                  

  **specimen**\               [Reference](#_reference)
  *optional*                  

  **status**\                 [ObservationStatus](#_observationstatus)
  *required*                  

  **subject**\                [Reference](#_reference)
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  

  **valueAttachment**\        [Attachment](#_attachment)
  *optional*                  

  **valueCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                  

  **valueDateTime**\          [DateTime](#_datetime)
  *optional*                  

  **valuePeriod**\            [Period](#_period)
  *optional*                  

  **valueQuantity**\          [Quantity](#_quantity)
  *optional*                  

  **valueRange**\             [Range](#_range)
  *optional*                  

  **valueRatio**\             [Ratio](#_ratio)
  *optional*                  

  **valueSampledData**\       [SampledData](#_sampleddata)
  *optional*                  

  **valueString**\            string
  *optional*                  

  **valueTime**\              [Time](#_time)
  *optional*                  
  ------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observationcomponent){.anchor}8.330. ObservationComponent {#_observationcomponent}

  ------------------------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- --------------------------------------------------------------------------
  **code**\                   [CodeableConcept](#_codeableconcept)
  *required*                  

  **dataAbsentReason**\       [CodeableConcept](#_codeableconcept)
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **id**\                     string
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **referenceRange**\         &lt; [ObservationReferenceRange](#_observationreferencerange) &gt; array
  *optional*                  

  **valueAttachment**\        [Attachment](#_attachment)
  *optional*                  

  **valueCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                  

  **valueDateTime**\          [DateTime](#_datetime)
  *optional*                  

  **valuePeriod**\            [Period](#_period)
  *optional*                  

  **valueQuantity**\          [Quantity](#_quantity)
  *optional*                  

  **valueRange**\             [Range](#_range)
  *optional*                  

  **valueRatio**\             [Ratio](#_ratio)
  *optional*                  

  **valueSampledData**\       [SampledData](#_sampleddata)
  *optional*                  

  **valueString**\            string
  *optional*                  

  **valueTime**\              [Time](#_time)
  *optional*                  
  ------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observationreferencerange){.anchor}8.331. ObservationReferenceRange {#_observationreferencerange}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **age**\                 [Range](#_range)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **high**\                [SimpleQuantity](#_simplequantity)
  *optional*               

  **id**\                  string
  *optional*               

  **low**\                 [SimpleQuantity](#_simplequantity)
  *optional*               

  **meaning**\             [CodeableConcept](#_codeableconcept)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                string
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observationrelated){.anchor}8.332. ObservationRelated {#_observationrelated}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **target**\              [Reference](#_reference)
  *required*               

  **type**\                [ObservationRelationshipType](#_observationrelationshiptype)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observationrelationshiptype){.anchor}8.333. ObservationRelationshipType {#_observationrelationshiptype}

  ---------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (HAS\_MEMBER, DERIVED\_FROM, SEQUEL\_TO, REPLACES, QUALIFIED\_BY, INTERFERED\_BY)
  *optional*       
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_observationstatus){.anchor}8.334. ObservationStatus {#_observationstatus}

  ---------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REGISTERED, PRELIMINARY, FINAL, AMENDED, CANCELLED, ENTERED\_IN\_ERROR, UNKNOWN)
  *optional*       
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_oid){.anchor}8.335. Oid {#_oid}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationdefinition){.anchor}8.336. OperationDefinition {#_operationdefinition}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **base**\                [Reference](#_reference)
  *optional*               

  **code**\                [Code](#_code)
  *required*               

  **contact**\             &lt; [OperationDefinitionContact](#_operationdefinitioncontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **idempotent**\          boolean
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **instance**\            boolean
  *required*               

  **kind**\                [OperationKind](#_operationkind)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **notes**\               string
  *optional*               

  **parameter**\           &lt; [OperationDefinitionParameter](#_operationdefinitionparameter) &gt; array
  *optional*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **system**\              boolean
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                &lt; [Code](#_code) &gt; array
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **version**\             string
  *optional*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationdefinitionbinding){.anchor}8.337. OperationDefinitionBinding {#_operationdefinitionbinding}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **strength**\            [Code](#_code)
  *required*               

  **valueSetReference**\   [Reference](#_reference)
  *optional*               

  **valueSetUri**\         [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationdefinitioncontact){.anchor}8.338. OperationDefinitionContact {#_operationdefinitioncontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationdefinitionparameter){.anchor}8.339. OperationDefinitionParameter {#_operationdefinitionparameter}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **binding**\             [OperationDefinitionBinding](#_operationdefinitionbinding)
  *optional*               

  **documentation**\       string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **max**\                 string
  *required*               

  **min**\                 [Integer](#_integer)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                [Code](#_code)
  *required*               

  **part**\                &lt; [OperationDefinitionParameter](#_operationdefinitionparameter) &gt; array
  *optional*               

  **profile**\             [Reference](#_reference)
  *optional*               

  **type**\                [Code](#_code)
  *optional*               

  **use**\                 [OperationParameterUse](#_operationparameteruse)
  *required*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationkind){.anchor}8.340. OperationKind {#_operationkind}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (OPERATION, QUERY)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationoutcome){.anchor}8.341. OperationOutcome {#_operationoutcome}

  -------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **issue**\               &lt; [OperationOutcomeIssue](#_operationoutcomeissue) &gt; array
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationoutcomeissue){.anchor}8.342. OperationOutcomeIssue {#_operationoutcomeissue}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [IssueType](#_issuetype)
  *required*               

  **details**\             [CodeableConcept](#_codeableconcept)
  *optional*               

  **diagnostics**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **location**\            &lt; string &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **severity**\            [IssueSeverity](#_issueseverity)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_operationparameteruse){.anchor}8.343. OperationParameterUse {#_operationparameteruse}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN, OUT)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_order){.anchor}8.344. Order {#_order}

  ---------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------
  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **date**\                    [DateTime](#_datetime)
  *optional*                   

  **detail**\                  &lt; [Reference](#_reference) &gt; array
  *required*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **reasonCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **reasonReference**\         [Reference](#_reference)
  *optional*                   

  **source**\                  [Reference](#_reference)
  *optional*                   

  **subject**\                 [Reference](#_reference)
  *optional*                   

  **target**\                  [Reference](#_reference)
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   

  **when**\                    [OrderWhen](#_orderwhen)
  *optional*                   
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_orderresponse){.anchor}8.345. OrderResponse {#_orderresponse}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fulfillment**\         &lt; [Reference](#_reference) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **orderStatus**\         [OrderStatus](#_orderstatus)
  *required*               

  **request**\             [Reference](#_reference)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **who**\                 [Reference](#_reference)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_orderstatus){.anchor}8.346. OrderStatus {#_orderstatus}

  -------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PENDING, REVIEW, REJECTED, ERROR, ACCEPTED, CANCELLED, REPLACED, ABORTED, COMPLETED)
  *optional*       
  -------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_orderwhen){.anchor}8.347. OrderWhen {#_orderwhen}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **schedule**\            [Timing](#_timing)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_organization){.anchor}8.348. Organization {#_organization}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **active**\              boolean
  *optional*               

  **address**\             &lt; [Address](#_address) &gt; array
  *optional*               

  **contact**\             &lt; [OrganizationContact](#_organizationcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **partOf**\              [Reference](#_reference)
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_organizationcontact){.anchor}8.349. OrganizationContact {#_organizationcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **address**\             [Address](#_address)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                [HumanName](#_humanname)
  *optional*               

  **purpose**\             [CodeableConcept](#_codeableconcept)
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_parameters){.anchor}8.350. Parameters {#_parameters}

  -----------------------------------------------------------------------------------
  Name                 Schema
  -------------------- --------------------------------------------------------------
  **id**\              [Id](#_id)
  *optional*           

  **implicitRules**\   [Uri](#_uri)
  *optional*           

  **language**\        [Code](#_code)
  *optional*           

  **meta**\            [Meta](#_meta)
  *optional*           

  **parameter**\       &lt; [ParametersParameter](#_parametersparameter) &gt; array
  *optional*           
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_parametersparameter){.anchor}8.351. ParametersParameter {#_parametersparameter}

  --------------------------------------------------------------------------------------------
  Name                          Schema
  ----------------------------- --------------------------------------------------------------
  **extension**\                &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **id**\                       string
  *optional*                    

  **modifierExtension**\        &lt; [Extension](#_extension) &gt; array
  *optional*                    

  **name**\                     string
  *required*                    

  **part**\                     &lt; [ParametersParameter](#_parametersparameter) &gt; array
  *optional*                    

  **resource**\                 [ResourceContainer](#_resourcecontainer)
  *optional*                    

  **valueAddress**\             [Address](#_address)
  *optional*                    

  **valueAnnotation**\          [Annotation](#_annotation)
  *optional*                    

  **valueAttachment**\          [Attachment](#_attachment)
  *optional*                    

  **valueBase64Binary**\        [Base64Binary](#_base64binary)
  *optional*                    

  **valueBoolean**\             boolean
  *optional*                    

  **valueCode**\                [Code](#_code)
  *optional*                    

  **valueCodeableConcept**\     [CodeableConcept](#_codeableconcept)
  *optional*                    

  **valueCoding**\              [Coding](#_coding)
  *optional*                    

  **valueContactPoint**\        [ContactPoint](#_contactpoint)
  *optional*                    

  **valueDate**\                string(date)
  *optional*                    

  **valueDateTime**\            [DateTime](#_datetime)
  *optional*                    

  **valueDecimal**\             [Decimal](#_decimal)
  *optional*                    

  **valueElementDefinition**\   [ElementDefinition](#_elementdefinition)
  *optional*                    

  **valueHumanName**\           [HumanName](#_humanname)
  *optional*                    

  **valueId**\                  [Id](#_id)
  *optional*                    

  **valueIdentifier**\          [Identifier](#_identifier)
  *optional*                    

  **valueInstant**\             [Instant](#_instant)
  *optional*                    

  **valueInteger**\             [Integer](#_integer)
  *optional*                    

  **valueMarkdown**\            [Markdown](#_markdown)
  *optional*                    

  **valueMeta**\                [Meta](#_meta)
  *optional*                    

  **valueOid**\                 [Oid](#_oid)
  *optional*                    

  **valuePeriod**\              [Period](#_period)
  *optional*                    

  **valuePositiveInt**\         [PositiveInt](#_positiveint)
  *optional*                    

  **valueQuantity**\            [Quantity](#_quantity)
  *optional*                    

  **valueRange**\               [Range](#_range)
  *optional*                    

  **valueRatio**\               [Ratio](#_ratio)
  *optional*                    

  **valueReference**\           [Reference](#_reference)
  *optional*                    

  **valueSampledData**\         [SampledData](#_sampleddata)
  *optional*                    

  **valueSignature**\           [Signature](#_signature)
  *optional*                    

  **valueString**\              string
  *optional*                    

  **valueTime**\                [Time](#_time)
  *optional*                    

  **valueTiming**\              [Timing](#_timing)
  *optional*                    

  **valueUnsignedInt**\         [UnsignedInt](#_unsignedint)
  *optional*                    

  **valueUri**\                 [Uri](#_uri)
  *optional*                    

  **valueUuid**\                string(uuid)
  *optional*                    
  --------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_participantrequired){.anchor}8.352. ParticipantRequired {#_participantrequired}

  ---------------------------------------------------------------
  Name             Schema
  ---------------- ----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REQUIRED, OPTIONAL, INFORMATION\_ONLY)
  *optional*       
  ---------------------------------------------------------------

</div>

<div class="sect2">

### [](#_participantstatus){.anchor}8.353. ParticipantStatus {#_participantstatus}

  ----------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACCEPTED, DECLINED, TENTATIVE, IN\_PROCESS, COMPLETED, NEEDS\_ACTION)
  *optional*       
  ----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_participationstatus){.anchor}8.354. ParticipationStatus {#_participationstatus}

  ----------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ACCEPTED, DECLINED, TENTATIVE, NEEDS\_ACTION)
  *optional*       
  ----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_patient){.anchor}8.355. Patient {#_patient}

  --------------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ----------------------------------------------------------------
  **active**\                 boolean
  *optional*                  

  **address**\                &lt; [Address](#_address) &gt; array
  *optional*                  

  **animal**\                 [PatientAnimal](#_patientanimal)
  *optional*                  

  **birthDate**\              string(date)
  *optional*                  

  **careProvider**\           &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **communication**\          &lt; [PatientCommunication](#_patientcommunication) &gt; array
  *optional*                  

  **contact**\                &lt; [PatientContact](#_patientcontact) &gt; array
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **deceasedBoolean**\        boolean
  *optional*                  

  **deceasedDateTime**\       [DateTime](#_datetime)
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **gender**\                 [Code](#_code)
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **link**\                   &lt; [PatientLink](#_patientlink) &gt; array
  *optional*                  

  **managingOrganization**\   [Reference](#_reference)
  *optional*                  

  **maritalStatus**\          [CodeableConcept](#_codeableconcept)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **multipleBirthBoolean**\   boolean
  *optional*                  

  **multipleBirthInteger**\   [Integer](#_integer)
  *optional*                  

  **name**\                   &lt; [HumanName](#_humanname) &gt; array
  *optional*                  

  **photo**\                  &lt; [Attachment](#_attachment) &gt; array
  *optional*                  

  **telecom**\                &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  
  --------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_patientanimal){.anchor}8.356. PatientAnimal {#_patientanimal}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **breed**\               [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **genderStatus**\        [CodeableConcept](#_codeableconcept)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **species**\             [CodeableConcept](#_codeableconcept)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_patientcommunication){.anchor}8.357. PatientCommunication {#_patientcommunication}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **language**\            [CodeableConcept](#_codeableconcept)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **preferred**\           boolean
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_patientcontact){.anchor}8.358. PatientContact {#_patientcontact}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **address**\             [Address](#_address)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **gender**\              [Code](#_code)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                [HumanName](#_humanname)
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **relationship**\        &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_patientlink){.anchor}8.359. PatientLink {#_patientlink}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **other**\               [Reference](#_reference)
  *required*               

  **type**\                [LinkType](#_linktype)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_paymentnotice){.anchor}8.360. PaymentNotice {#_paymentnotice}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **originalRuleset**\     [Coding](#_coding)
  *optional*               

  **paymentStatus**\       [Coding](#_coding)
  *required*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **request**\             [Reference](#_reference)
  *optional*               

  **response**\            [Reference](#_reference)
  *optional*               

  **ruleset**\             [Coding](#_coding)
  *optional*               

  **target**\              [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_paymentreconciliation){.anchor}8.361. PaymentReconciliation {#_paymentreconciliation}

  ---------------------------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ------------------------------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **created**\               [DateTime](#_datetime)
  *optional*                 

  **detail**\                &lt; [PaymentReconciliationDetail](#_paymentreconciliationdetail) &gt; array
  *optional*                 

  **disposition**\           string
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **form**\                  [Coding](#_coding)
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **note**\                  &lt; [PaymentReconciliationNote](#_paymentreconciliationnote) &gt; array
  *optional*                 

  **organization**\          [Reference](#_reference)
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **outcome**\               [Code](#_code)
  *optional*                 

  **period**\                [Period](#_period)
  *optional*                 

  **request**\               [Reference](#_reference)
  *optional*                 

  **requestOrganization**\   [Reference](#_reference)
  *optional*                 

  **requestProvider**\       [Reference](#_reference)
  *optional*                 

  **ruleset**\               [Coding](#_coding)
  *optional*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 

  **total**\                 [Money](#_money)
  *required*                 
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_paymentreconciliationdetail){.anchor}8.362. PaymentReconciliationDetail {#_paymentreconciliationdetail}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **amount**\              [Money](#_money)
  *optional*               

  **date**\                string(date)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **payee**\               [Reference](#_reference)
  *optional*               

  **request**\             [Reference](#_reference)
  *optional*               

  **responce**\            [Reference](#_reference)
  *optional*               

  **submitter**\           [Reference](#_reference)
  *optional*               

  **type**\                [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_paymentreconciliationnote){.anchor}8.363. PaymentReconciliationNote {#_paymentreconciliationnote}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                string
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_period){.anchor}8.364. Period {#_period}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **end**\         [DateTime](#_datetime)
  *optional*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **start**\       [DateTime](#_datetime)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_person){.anchor}8.365. Person {#_person}

  --------------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ----------------------------------------------------------
  **active**\                 boolean
  *optional*                  

  **address**\                &lt; [Address](#_address) &gt; array
  *optional*                  

  **birthDate**\              string(date)
  *optional*                  

  **contained**\              &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                  

  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **gender**\                 [Code](#_code)
  *optional*                  

  **id**\                     [Id](#_id)
  *optional*                  

  **identifier**\             &lt; [Identifier](#_identifier) &gt; array
  *optional*                  

  **implicitRules**\          [Uri](#_uri)
  *optional*                  

  **language**\               [Code](#_code)
  *optional*                  

  **link**\                   &lt; [PersonLink](#_personlink) &gt; array
  *optional*                  

  **managingOrganization**\   [Reference](#_reference)
  *optional*                  

  **meta**\                   [Meta](#_meta)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **name**\                   &lt; [HumanName](#_humanname) &gt; array
  *optional*                  

  **photo**\                  [Attachment](#_attachment)
  *optional*                  

  **telecom**\                &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*                  

  **text**\                   [Narrative](#_narrative)
  *optional*                  
  --------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_personlink){.anchor}8.366. PersonLink {#_personlink}

  -----------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------
  **assurance**\           [IdentityAssuranceLevel](#_identityassurancelevel)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **target**\              [Reference](#_reference)
  *required*               
  -----------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_positiveint){.anchor}8.367. PositiveInt {#_positiveint}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       integer
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_practitioner){.anchor}8.368. Practitioner {#_practitioner}

  ---------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------------------
  **active**\              boolean
  *optional*               

  **address**\             &lt; [Address](#_address) &gt; array
  *optional*               

  **birthDate**\           string(date)
  *optional*               

  **communication**\       &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **gender**\              [Code](#_code)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                [HumanName](#_humanname)
  *optional*               

  **photo**\               &lt; [Attachment](#_attachment) &gt; array
  *optional*               

  **practitionerRole**\    &lt; [PractitionerPractitionerRole](#_practitionerpractitionerrole) &gt; array
  *optional*               

  **qualification**\       &lt; [PractitionerQualification](#_practitionerqualification) &gt; array
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_practitionerpractitionerrole){.anchor}8.369. PractitionerPractitionerRole {#_practitionerpractitionerrole}

  ----------------------------------------------------------------------------------
  Name                        Schema
  --------------------------- ------------------------------------------------------
  **extension**\              &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **healthcareService**\      &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **id**\                     string
  *optional*                  

  **location**\               &lt; [Reference](#_reference) &gt; array
  *optional*                  

  **managingOrganization**\   [Reference](#_reference)
  *optional*                  

  **modifierExtension**\      &lt; [Extension](#_extension) &gt; array
  *optional*                  

  **period**\                 [Period](#_period)
  *optional*                  

  **role**\                   [CodeableConcept](#_codeableconcept)
  *optional*                  

  **specialty**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                  
  ----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_practitionerqualification){.anchor}8.370. PractitionerQualification {#_practitionerqualification}

  ---------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **issuer**\              [Reference](#_reference)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               
  ---------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedure){.anchor}8.371. Procedure {#_procedure}

  ---------------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------------
  **bodySite**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **category**\                [CodeableConcept](#_codeableconcept)
  *optional*                   

  **code**\                    [CodeableConcept](#_codeableconcept)
  *required*                   

  **complication**\            &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **encounter**\               [Reference](#_reference)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **focalDevice**\             &lt; [ProcedureFocalDevice](#_procedurefocaldevice) &gt; array
  *optional*                   

  **followUp**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **location**\                [Reference](#_reference)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **notPerformed**\            boolean
  *optional*                   

  **notes**\                   &lt; [Annotation](#_annotation) &gt; array
  *optional*                   

  **outcome**\                 [CodeableConcept](#_codeableconcept)
  *optional*                   

  **performedDateTime**\       [DateTime](#_datetime)
  *optional*                   

  **performedPeriod**\         [Period](#_period)
  *optional*                   

  **performer**\               &lt; [ProcedurePerformer](#_procedureperformer) &gt; array
  *optional*                   

  **reasonCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **reasonNotPerformed**\      &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **reasonReference**\         [Reference](#_reference)
  *optional*                   

  **report**\                  &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **request**\                 [Reference](#_reference)
  *optional*                   

  **status**\                  [ProcedureStatus](#_procedurestatus)
  *required*                   

  **subject**\                 [Reference](#_reference)
  *required*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   

  **used**\                    &lt; [Reference](#_reference) &gt; array
  *optional*                   
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedurefocaldevice){.anchor}8.372. ProcedureFocalDevice {#_procedurefocaldevice}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **action**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **manipulated**\         [Reference](#_reference)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedureperformer){.anchor}8.373. ProcedurePerformer {#_procedureperformer}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **actor**\               [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **role**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedurerequest){.anchor}8.374. ProcedureRequest {#_procedurerequest}

  -----------------------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ ----------------------------------------------------------
  **asNeededBoolean**\           boolean
  *optional*                     

  **asNeededCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **bodySite**\                  &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                     

  **code**\                      [CodeableConcept](#_codeableconcept)
  *required*                     

  **contained**\                 &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                     

  **encounter**\                 [Reference](#_reference)
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        [Id](#_id)
  *optional*                     

  **identifier**\                &lt; [Identifier](#_identifier) &gt; array
  *optional*                     

  **implicitRules**\             [Uri](#_uri)
  *optional*                     

  **language**\                  [Code](#_code)
  *optional*                     

  **meta**\                      [Meta](#_meta)
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **notes**\                     &lt; [Annotation](#_annotation) &gt; array
  *optional*                     

  **orderedOn**\                 [DateTime](#_datetime)
  *optional*                     

  **orderer**\                   [Reference](#_reference)
  *optional*                     

  **performer**\                 [Reference](#_reference)
  *optional*                     

  **priority**\                  [ProcedureRequestPriority](#_procedurerequestpriority)
  *optional*                     

  **reasonCodeableConcept**\     [CodeableConcept](#_codeableconcept)
  *optional*                     

  **reasonReference**\           [Reference](#_reference)
  *optional*                     

  **scheduledDateTime**\         [DateTime](#_datetime)
  *optional*                     

  **scheduledPeriod**\           [Period](#_period)
  *optional*                     

  **scheduledTiming**\           [Timing](#_timing)
  *optional*                     

  **status**\                    [ProcedureRequestStatus](#_procedurerequeststatus)
  *optional*                     

  **subject**\                   [Reference](#_reference)
  *required*                     

  **text**\                      [Narrative](#_narrative)
  *optional*                     
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedurerequestpriority){.anchor}8.375. ProcedureRequestPriority {#_procedurerequestpriority}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (ROUTINE, URGENT, STAT, ASAP)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedurerequeststatus){.anchor}8.376. ProcedureRequestStatus {#_procedurerequeststatus}

  -------------------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (PROPOSED, DRAFT, REQUESTED, RECEIVED, ACCEPTED, IN\_PROGRESS, COMPLETED, SUSPENDED, REJECTED, ABORTED)
  *optional*       
  -------------------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_procedurestatus){.anchor}8.377. ProcedureStatus {#_procedurestatus}

  ------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, ABORTED, COMPLETED, ENTERED\_IN\_ERROR)
  *optional*       
  ------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_processrequest){.anchor}8.378. ProcessRequest {#_processrequest}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **action**\              [ActionList](#_actionlist)
  *required*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **created**\             [DateTime](#_datetime)
  *optional*               

  **exclude**\             &lt; string &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **include**\             &lt; string &gt; array
  *optional*               

  **item**\                &lt; [ProcessRequestItem](#_processrequestitem) &gt; array
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **nullify**\             boolean
  *optional*               

  **organization**\        [Reference](#_reference)
  *optional*               

  **originalRuleset**\     [Coding](#_coding)
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **provider**\            [Reference](#_reference)
  *optional*               

  **reference**\           string
  *optional*               

  **request**\             [Reference](#_reference)
  *optional*               

  **response**\            [Reference](#_reference)
  *optional*               

  **ruleset**\             [Coding](#_coding)
  *optional*               

  **target**\              [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_processrequestitem){.anchor}8.379. ProcessRequestItem {#_processrequestitem}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **sequenceLinkId**\      [Integer](#_integer)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_processresponse){.anchor}8.380. ProcessResponse {#_processresponse}

  -------------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------------------
  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **created**\               [DateTime](#_datetime)
  *optional*                 

  **disposition**\           string
  *optional*                 

  **error**\                 &lt; [Coding](#_coding) &gt; array
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **form**\                  [Coding](#_coding)
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **notes**\                 &lt; [ProcessResponseNotes](#_processresponsenotes) &gt; array
  *optional*                 

  **organization**\          [Reference](#_reference)
  *optional*                 

  **originalRuleset**\       [Coding](#_coding)
  *optional*                 

  **outcome**\               [Coding](#_coding)
  *optional*                 

  **request**\               [Reference](#_reference)
  *optional*                 

  **requestOrganization**\   [Reference](#_reference)
  *optional*                 

  **requestProvider**\       [Reference](#_reference)
  *optional*                 

  **ruleset**\               [Coding](#_coding)
  *optional*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 
  -------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_processresponsenotes){.anchor}8.381. ProcessResponseNotes {#_processresponsenotes}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                string
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_propertyrepresentation){.anchor}8.382. PropertyRepresentation {#_propertyrepresentation}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (XML\_ATTR)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_provenance){.anchor}8.383. Provenance {#_provenance}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **activity**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **agent**\               &lt; [ProvenanceAgent](#_provenanceagent) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **entity**\              &lt; [ProvenanceEntity](#_provenanceentity) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **location**\            [Reference](#_reference)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **period**\              [Period](#_period)
  *optional*               

  **policy**\              &lt; [Uri](#_uri) &gt; array
  *optional*               

  **reason**\              &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **recorded**\            [Instant](#_instant)
  *required*               

  **signature**\           &lt; [Signature](#_signature) &gt; array
  *optional*               

  **target**\              &lt; [Reference](#_reference) &gt; array
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_provenanceagent){.anchor}8.384. ProvenanceAgent {#_provenanceagent}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **actor**\               [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **relatedAgent**\        &lt; [ProvenanceRelatedAgent](#_provenancerelatedagent) &gt; array
  *optional*               

  **role**\                [Coding](#_coding)
  *required*               

  **userId**\              [Identifier](#_identifier)
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_provenanceentity){.anchor}8.385. ProvenanceEntity {#_provenanceentity}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **agent**\               [ProvenanceAgent](#_provenanceagent)
  *optional*               

  **display**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reference**\           [Uri](#_uri)
  *required*               

  **role**\                [ProvenanceEntityRole](#_provenanceentityrole)
  *required*               

  **type**\                [Coding](#_coding)
  *required*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_provenanceentityrole){.anchor}8.386. ProvenanceEntityRole {#_provenanceentityrole}

  -----------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (DERIVATION, REVISION, QUOTATION, SOURCE)
  *optional*       
  -----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_provenancerelatedagent){.anchor}8.387. ProvenanceRelatedAgent {#_provenancerelatedagent}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **target**\              [Uri](#_uri)
  *required*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_quantity){.anchor}8.388. Quantity {#_quantity}

  --------------------------------------------------------------
  Name              Schema
  ----------------- --------------------------------------------
  **code**\         [Code](#_code)
  *optional*        

  **comparator**\   [QuantityComparator](#_quantitycomparator)
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **system**\       [Uri](#_uri)
  *optional*        

  **unit**\         string
  *optional*        

  **value**\        [Decimal](#_decimal)
  *optional*        
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_quantitycomparator){.anchor}8.389. QuantityComparator {#_quantitycomparator}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaire){.anchor}8.390. Questionnaire {#_questionnaire}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               [QuestionnaireGroup](#_questionnairegroup)
  *required*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **publisher**\           string
  *optional*               

  **status**\              [QuestionnaireStatus](#_questionnairestatus)
  *required*               

  **subjectType**\         &lt; [Code](#_code) &gt; array
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnairegroup){.anchor}8.391. QuestionnaireGroup {#_questionnairegroup}

  -------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------
  **concept**\             &lt; [Coding](#_coding) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               &lt; [QuestionnaireGroup](#_questionnairegroup) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **linkId**\              string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **question**\            &lt; [QuestionnaireQuestion](#_questionnairequestion) &gt; array
  *optional*               

  **repeats**\             boolean
  *optional*               

  **required**\            boolean
  *optional*               

  **text**\                string
  *optional*               

  **title**\               string
  *optional*               
  -------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnairequestion){.anchor}8.392. QuestionnaireQuestion {#_questionnairequestion}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **concept**\             &lt; [Coding](#_coding) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               &lt; [QuestionnaireGroup](#_questionnairegroup) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **linkId**\              string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **option**\              &lt; [Coding](#_coding) &gt; array
  *optional*               

  **options**\             [Reference](#_reference)
  *optional*               

  **repeats**\             boolean
  *optional*               

  **required**\            boolean
  *optional*               

  **text**\                string
  *optional*               

  **type**\                [AnswerFormat](#_answerformat)
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaireresponse){.anchor}8.393. QuestionnaireResponse {#_questionnaireresponse}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **author**\              [Reference](#_reference)
  *optional*               

  **authored**\            [DateTime](#_datetime)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               [QuestionnaireResponseGroup](#_questionnaireresponsegroup)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **questionnaire**\       [Reference](#_reference)
  *optional*               

  **source**\              [Reference](#_reference)
  *optional*               

  **status**\              [QuestionnaireResponseStatus](#_questionnaireresponsestatus)
  *required*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaireresponseanswer){.anchor}8.394. QuestionnaireResponseAnswer {#_questionnaireresponseanswer}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               &lt; [QuestionnaireResponseGroup](#_questionnaireresponsegroup) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **valueAttachment**\     [Attachment](#_attachment)
  *optional*               

  **valueBoolean**\        boolean
  *optional*               

  **valueCoding**\         [Coding](#_coding)
  *optional*               

  **valueDate**\           string(date)
  *optional*               

  **valueDateTime**\       [DateTime](#_datetime)
  *optional*               

  **valueDecimal**\        [Decimal](#_decimal)
  *optional*               

  **valueInstant**\        [Instant](#_instant)
  *optional*               

  **valueInteger**\        [Integer](#_integer)
  *optional*               

  **valueQuantity**\       [Quantity](#_quantity)
  *optional*               

  **valueReference**\      [Reference](#_reference)
  *optional*               

  **valueString**\         string
  *optional*               

  **valueTime**\           [Time](#_time)
  *optional*               

  **valueUri**\            [Uri](#_uri)
  *optional*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaireresponsegroup){.anchor}8.395. QuestionnaireResponseGroup {#_questionnaireresponsegroup}

  -----------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **group**\               &lt; [QuestionnaireResponseGroup](#_questionnaireresponsegroup) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **linkId**\              string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **question**\            &lt; [QuestionnaireResponseQuestion](#_questionnaireresponsequestion) &gt; array
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                string
  *optional*               

  **title**\               string
  *optional*               
  -----------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaireresponsequestion){.anchor}8.396. QuestionnaireResponseQuestion {#_questionnaireresponsequestion}

  -------------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------------
  **answer**\              &lt; [QuestionnaireResponseAnswer](#_questionnaireresponseanswer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **linkId**\              string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                string
  *optional*               
  -------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnaireresponsestatus){.anchor}8.397. QuestionnaireResponseStatus {#_questionnaireresponsestatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, COMPLETED, AMENDED)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_questionnairestatus){.anchor}8.398. QuestionnaireStatus {#_questionnairestatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (DRAFT, PUBLISHED, RETIRED)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_range){.anchor}8.399. Range {#_range}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **high**\        [SimpleQuantity](#_simplequantity)
  *optional*       

  **id**\          string
  *optional*       

  **low**\         [SimpleQuantity](#_simplequantity)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_ratio){.anchor}8.400. Ratio {#_ratio}

  -------------------------------------------------------------
  Name               Schema
  ------------------ ------------------------------------------
  **denominator**\   [Quantity](#_quantity)
  *optional*         

  **extension**\     &lt; [Extension](#_extension) &gt; array
  *optional*         

  **id**\            string
  *optional*         

  **numerator**\     [Quantity](#_quantity)
  *optional*         
  -------------------------------------------------------------

</div>

<div class="sect2">

### [](#_reference){.anchor}8.401. Reference {#_reference}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **display**\     string
  *optional*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **reference**\   string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_referralrequest){.anchor}8.402. ReferralRequest {#_referralrequest}

  ---------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------
  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **date**\                    [DateTime](#_datetime)
  *optional*                   

  **dateSent**\                [DateTime](#_datetime)
  *optional*                   

  **description**\             string
  *optional*                   

  **encounter**\               [Reference](#_reference)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **fulfillmentTime**\         [Period](#_period)
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **patient**\                 [Reference](#_reference)
  *optional*                   

  **priority**\                [CodeableConcept](#_codeableconcept)
  *optional*                   

  **reason**\                  [CodeableConcept](#_codeableconcept)
  *optional*                   

  **recipient**\               &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **requester**\               [Reference](#_reference)
  *optional*                   

  **serviceRequested**\        &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*                   

  **specialty**\               [CodeableConcept](#_codeableconcept)
  *optional*                   

  **status**\                  [ReferralStatus](#_referralstatus)
  *required*                   

  **supportingInformation**\   &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   

  **type**\                    [CodeableConcept](#_codeableconcept)
  *optional*                   
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_referralstatus){.anchor}8.403. ReferralStatus {#_referralstatus}

  --------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (DRAFT, REQUESTED, ACTIVE, CANCELLED, ACCEPTED, REJECTED, COMPLETED)
  *optional*       
  --------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_relatedperson){.anchor}8.404. RelatedPerson {#_relatedperson}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **address**\             &lt; [Address](#_address) &gt; array
  *optional*               

  **birthDate**\           string(date)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **gender**\              [Code](#_code)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                [HumanName](#_humanname)
  *optional*               

  **patient**\             [Reference](#_reference)
  *required*               

  **period**\              [Period](#_period)
  *optional*               

  **photo**\               &lt; [Attachment](#_attachment) &gt; array
  *optional*               

  **relationship**\        [CodeableConcept](#_codeableconcept)
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_resourcecontainer){.anchor}8.405. ResourceContainer {#_resourcecontainer}

  ----------------------------------------------------------------------------------------------
  Name                              Schema
  --------------------------------- ------------------------------------------------------------
  **Account**\                      [Account](#_account)
  *optional*                        

  **AllergyIntolerance**\           [AllergyIntolerance](#_allergyintolerance)
  *optional*                        

  **Appointment**\                  [Appointment](#_appointment)
  *optional*                        

  **AppointmentResponse**\          [AppointmentResponse](#_appointmentresponse)
  *optional*                        

  **AuditEvent**\                   [AuditEvent](#_auditevent)
  *optional*                        

  **Basic**\                        [Basic](#_basic)
  *optional*                        

  **Binary**\                       [Binary](#_binary)
  *optional*                        

  **BodySite**\                     [BodySite](#_bodysite)
  *optional*                        

  **Bundle**\                       [Bundle](#_bundle)
  *optional*                        

  **CarePlan**\                     [CarePlan](#_careplan)
  *optional*                        

  **Claim**\                        [Claim](#_claim)
  *optional*                        

  **ClaimResponse**\                [ClaimResponse](#_claimresponse)
  *optional*                        

  **ClinicalImpression**\           [ClinicalImpression](#_clinicalimpression)
  *optional*                        

  **Communication**\                [Communication](#_communication)
  *optional*                        

  **CommunicationRequest**\         [CommunicationRequest](#_communicationrequest)
  *optional*                        

  **Composition**\                  [Composition](#_composition)
  *optional*                        

  **ConceptMap**\                   [ConceptMap](#_conceptmap)
  *optional*                        

  **Condition**\                    [Condition](#_condition)
  *optional*                        

  **Conformance**\                  [Conformance](#_conformance)
  *optional*                        

  **Contract**\                     [Contract](#_contract)
  *optional*                        

  **Coverage**\                     [Coverage](#_coverage)
  *optional*                        

  **DataElement**\                  [DataElement](#_dataelement)
  *optional*                        

  **DetectedIssue**\                [DetectedIssue](#_detectedissue)
  *optional*                        

  **Device**\                       [Device](#_device)
  *optional*                        

  **DeviceComponent**\              [DeviceComponent](#_devicecomponent)
  *optional*                        

  **DeviceMetric**\                 [DeviceMetric](#_devicemetric)
  *optional*                        

  **DeviceUseRequest**\             [DeviceUseRequest](#_deviceuserequest)
  *optional*                        

  **DeviceUseStatement**\           [DeviceUseStatement](#_deviceusestatement)
  *optional*                        

  **DiagnosticOrder**\              [DiagnosticOrder](#_diagnosticorder)
  *optional*                        

  **DiagnosticReport**\             [DiagnosticReport](#_diagnosticreport)
  *optional*                        

  **DocumentManifest**\             [DocumentManifest](#_documentmanifest)
  *optional*                        

  **DocumentReference**\            [DocumentReference](#_documentreference)
  *optional*                        

  **EligibilityRequest**\           [EligibilityRequest](#_eligibilityrequest)
  *optional*                        

  **EligibilityResponse**\          [EligibilityResponse](#_eligibilityresponse)
  *optional*                        

  **Encounter**\                    [Encounter](#_encounter)
  *optional*                        

  **EnrollmentRequest**\            [EnrollmentRequest](#_enrollmentrequest)
  *optional*                        

  **EnrollmentResponse**\           [EnrollmentResponse](#_enrollmentresponse)
  *optional*                        

  **EpisodeOfCare**\                [EpisodeOfCare](#_episodeofcare)
  *optional*                        

  **ExplanationOfBenefit**\         [ExplanationOfBenefit](#_explanationofbenefit)
  *optional*                        

  **FamilyMemberHistory**\          [FamilyMemberHistory](#_familymemberhistory)
  *optional*                        

  **Flag**\                         [Flag](#_flag)
  *optional*                        

  **Goal**\                         [Goal](#_goal)
  *optional*                        

  **Group**\                        [Group](#_group)
  *optional*                        

  **HealthcareService**\            [HealthcareService](#_healthcareservice)
  *optional*                        

  **ImagingObjectSelection**\       [ImagingObjectSelection](#_imagingobjectselection)
  *optional*                        

  **ImagingStudy**\                 [ImagingStudy](#_imagingstudy)
  *optional*                        

  **Immunization**\                 [Immunization](#_immunization)
  *optional*                        

  **ImmunizationRecommendation**\   [ImmunizationRecommendation](#_immunizationrecommendation)
  *optional*                        

  **ImplementationGuide**\          [ImplementationGuide](#_implementationguide)
  *optional*                        

  **List**\                         [List](#_list)
  *optional*                        

  **Location**\                     [Location](#_location)
  *optional*                        

  **Media**\                        [Media](#_media)
  *optional*                        

  **Medication**\                   [Medication](#_medication)
  *optional*                        

  **MedicationAdministration**\     [MedicationAdministration](#_medicationadministration)
  *optional*                        

  **MedicationDispense**\           [MedicationDispense](#_medicationdispense)
  *optional*                        

  **MedicationOrder**\              [MedicationOrder](#_medicationorder)
  *optional*                        

  **MedicationStatement**\          [MedicationStatement](#_medicationstatement)
  *optional*                        

  **MessageHeader**\                [MessageHeader](#_messageheader)
  *optional*                        

  **NamingSystem**\                 [NamingSystem](#_namingsystem)
  *optional*                        

  **NutritionOrder**\               [NutritionOrder](#_nutritionorder)
  *optional*                        

  **Observation**\                  [Observation](#_observation)
  *optional*                        

  **OperationDefinition**\          [OperationDefinition](#_operationdefinition)
  *optional*                        

  **OperationOutcome**\             [OperationOutcome](#_operationoutcome)
  *optional*                        

  **Order**\                        [Order](#_order)
  *optional*                        

  **OrderResponse**\                [OrderResponse](#_orderresponse)
  *optional*                        

  **Organization**\                 [Organization](#_organization)
  *optional*                        

  **Parameters**\                   [Parameters](#_parameters)
  *optional*                        

  **Patient**\                      [Patient](#_patient)
  *optional*                        

  **PaymentNotice**\                [PaymentNotice](#_paymentnotice)
  *optional*                        

  **PaymentReconciliation**\        [PaymentReconciliation](#_paymentreconciliation)
  *optional*                        

  **Person**\                       [Person](#_person)
  *optional*                        

  **Practitioner**\                 [Practitioner](#_practitioner)
  *optional*                        

  **Procedure**\                    [Procedure](#_procedure)
  *optional*                        

  **ProcedureRequest**\             [ProcedureRequest](#_procedurerequest)
  *optional*                        

  **ProcessRequest**\               [ProcessRequest](#_processrequest)
  *optional*                        

  **ProcessResponse**\              [ProcessResponse](#_processresponse)
  *optional*                        

  **Provenance**\                   [Provenance](#_provenance)
  *optional*                        

  **Questionnaire**\                [Questionnaire](#_questionnaire)
  *optional*                        

  **QuestionnaireResponse**\        [QuestionnaireResponse](#_questionnaireresponse)
  *optional*                        

  **ReferralRequest**\              [ReferralRequest](#_referralrequest)
  *optional*                        

  **RelatedPerson**\                [RelatedPerson](#_relatedperson)
  *optional*                        

  **RiskAssessment**\               [RiskAssessment](#_riskassessment)
  *optional*                        

  **Schedule**\                     [Schedule](#_schedule)
  *optional*                        

  **SearchParameter**\              [SearchParameter](#_searchparameter)
  *optional*                        

  **Slot**\                         [Slot](#_slot)
  *optional*                        

  **Specimen**\                     [Specimen](#_specimen)
  *optional*                        

  **StructureDefinition**\          [StructureDefinition](#_structuredefinition)
  *optional*                        

  **Subscription**\                 [Subscription](#_subscription)
  *optional*                        

  **Substance**\                    [Substance](#_substance)
  *optional*                        

  **SupplyDelivery**\               [SupplyDelivery](#_supplydelivery)
  *optional*                        

  **SupplyRequest**\                [SupplyRequest](#_supplyrequest)
  *optional*                        

  **TestScript**\                   [TestScript](#_testscript)
  *optional*                        

  **ValueSet**\                     [ValueSet](#_valueset)
  *optional*                        

  **VisionPrescription**\           [VisionPrescription](#_visionprescription)
  *optional*                        
  ----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_resourceversionpolicy){.anchor}8.406. ResourceVersionPolicy {#_resourceversionpolicy}

  -------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NO\_VERSION, VERSIONED, VERSIONED\_UPDATE)
  *optional*       
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_responsetype){.anchor}8.407. ResponseType {#_responsetype}

  ------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (OK, TRANSIENT\_ERROR, FATAL\_ERROR)
  *optional*       
  ------------------------------------------------------------

</div>

<div class="sect2">

### [](#_restfulconformancemode){.anchor}8.408. RestfulConformanceMode {#_restfulconformancemode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CLIENT, SERVER)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_riskassessment){.anchor}8.409. RiskAssessment {#_riskassessment}

  -------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------------------
  **basis**\               &lt; [Reference](#_reference) &gt; array
  *optional*               

  **condition**\           [Reference](#_reference)
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **encounter**\           [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **method**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **mitigation**\          string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **performer**\           [Reference](#_reference)
  *optional*               

  **prediction**\          &lt; [RiskAssessmentPrediction](#_riskassessmentprediction) &gt; array
  *optional*               

  **subject**\             [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_riskassessmentprediction){.anchor}8.410. RiskAssessmentPrediction {#_riskassessmentprediction}

  ----------------------------------------------------------------------------
  Name                              Schema
  --------------------------------- ------------------------------------------
  **extension**\                    &lt; [Extension](#_extension) &gt; array
  *optional*                        

  **id**\                           string
  *optional*                        

  **modifierExtension**\            &lt; [Extension](#_extension) &gt; array
  *optional*                        

  **outcome**\                      [CodeableConcept](#_codeableconcept)
  *required*                        

  **probabilityCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                        

  **probabilityDecimal**\           [Decimal](#_decimal)
  *optional*                        

  **probabilityRange**\             [Range](#_range)
  *optional*                        

  **rationale**\                    string
  *optional*                        

  **relativeRisk**\                 [Decimal](#_decimal)
  *optional*                        

  **whenPeriod**\                   [Period](#_period)
  *optional*                        

  **whenRange**\                    [Range](#_range)
  *optional*                        
  ----------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_sampleddata){.anchor}8.411. SampledData {#_sampleddata}

  ----------------------------------------------------------------
  Name              Schema
  ----------------- ----------------------------------------------
  **data**\         [SampledDataDataType](#_sampleddatadatatype)
  *required*        

  **dimensions**\   [PositiveInt](#_positiveint)
  *required*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **factor**\       [Decimal](#_decimal)
  *optional*        

  **id**\           string
  *optional*        

  **lowerLimit**\   [Decimal](#_decimal)
  *optional*        

  **origin**\       [SimpleQuantity](#_simplequantity)
  *required*        

  **period**\       [Decimal](#_decimal)
  *required*        

  **upperLimit**\   [Decimal](#_decimal)
  *optional*        
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_sampleddatadatatype){.anchor}8.412. SampledDataDataType {#_sampleddatadatatype}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_schedule){.anchor}8.413. Schedule {#_schedule}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **actor**\               [Reference](#_reference)
  *required*               

  **comment**\             string
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **planningHorizon**\     [Period](#_period)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_searchentrymode){.anchor}8.414. SearchEntryMode {#_searchentrymode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (MATCH, INCLUDE, OUTCOME)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_searchmodifiercode){.anchor}8.415. SearchModifierCode {#_searchmodifiercode}

  ----------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (MISSING, EXACT, CONTAINS, NOT, TEXT, IN, NOT\_IN, BELOW, ABOVE, TYPE)
  *optional*       
  ----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_searchparameter){.anchor}8.416. SearchParameter {#_searchparameter}

  ---------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------------
  **base**\                [Code](#_code)
  *required*               

  **code**\                [Code](#_code)
  *required*               

  **contact**\             &lt; [SearchParameterContact](#_searchparametercontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *required*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **status**\              [Code](#_code)
  *optional*               

  **target**\              &lt; [Code](#_code) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [Code](#_code)
  *required*               

  **url**\                 [Uri](#_uri)
  *required*               

  **xpath**\               string
  *optional*               

  **xpathUsage**\          [XPathUsageType](#_xpathusagetype)
  *optional*               
  ---------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_searchparametercontact){.anchor}8.417. SearchParameterContact {#_searchparametercontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_signature){.anchor}8.418. Signature {#_signature}

  --------------------------------------------------------------
  Name                Schema
  ------------------- ------------------------------------------
  **blob**\           [Base64Binary](#_base64binary)
  *required*          

  **contentType**\    [Code](#_code)
  *required*          

  **extension**\      &lt; [Extension](#_extension) &gt; array
  *optional*          

  **id**\             string
  *optional*          

  **type**\           &lt; [Coding](#_coding) &gt; array
  *required*          

  **when**\           [Instant](#_instant)
  *required*          

  **whoReference**\   [Reference](#_reference)
  *optional*          

  **whoUri**\         [Uri](#_uri)
  *optional*          
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_simplequantity){.anchor}8.419. SimpleQuantity {#_simplequantity}

  --------------------------------------------------------------
  Name              Schema
  ----------------- --------------------------------------------
  **code**\         [Code](#_code)
  *optional*        

  **comparator**\   [QuantityComparator](#_quantitycomparator)
  *optional*        

  **extension**\    &lt; [Extension](#_extension) &gt; array
  *optional*        

  **id**\           string
  *optional*        

  **system**\       [Uri](#_uri)
  *optional*        

  **unit**\         string
  *optional*        

  **value**\        [Decimal](#_decimal)
  *optional*        
  --------------------------------------------------------------

</div>

<div class="sect2">

### [](#_slicingrules){.anchor}8.420. SlicingRules {#_slicingrules}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (CLOSED, OPEN, OPEN\_AT\_END)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_slot){.anchor}8.421. Slot {#_slot}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **comment**\             string
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **end**\                 [Instant](#_instant)
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **freeBusyType**\        [SlotStatus](#_slotstatus)
  *required*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **overbooked**\          boolean
  *optional*               

  **schedule**\            [Reference](#_reference)
  *required*               

  **start**\               [Instant](#_instant)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_slotstatus){.anchor}8.422. SlotStatus {#_slotstatus}

  ------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (BUSY, FREE, BUSY\_UNAVAILABLE, BUSY\_TENTATIVE)
  *optional*       
  ------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_specimen){.anchor}8.423. Specimen {#_specimen}

  -------------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------------
  **accessionIdentifier**\   [Identifier](#_identifier)
  *optional*                 

  **collection**\            [SpecimenCollection](#_specimencollection)
  *optional*                 

  **contained**\             &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                 

  **container**\             &lt; [SpecimenContainer](#_specimencontainer) &gt; array
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **id**\                    [Id](#_id)
  *optional*                 

  **identifier**\            &lt; [Identifier](#_identifier) &gt; array
  *optional*                 

  **implicitRules**\         [Uri](#_uri)
  *optional*                 

  **language**\              [Code](#_code)
  *optional*                 

  **meta**\                  [Meta](#_meta)
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **parent**\                &lt; [Reference](#_reference) &gt; array
  *optional*                 

  **receivedTime**\          [DateTime](#_datetime)
  *optional*                 

  **status**\                [SpecimenStatus](#_specimenstatus)
  *optional*                 

  **subject**\               [Reference](#_reference)
  *required*                 

  **text**\                  [Narrative](#_narrative)
  *optional*                 

  **treatment**\             &lt; [SpecimenTreatment](#_specimentreatment) &gt; array
  *optional*                 

  **type**\                  [CodeableConcept](#_codeableconcept)
  *optional*                 
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_specimencollection){.anchor}8.424. SpecimenCollection {#_specimencollection}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **bodySite**\            [CodeableConcept](#_codeableconcept)
  *optional*               

  **collectedDateTime**\   [DateTime](#_datetime)
  *optional*               

  **collectedPeriod**\     [Period](#_period)
  *optional*               

  **collector**\           [Reference](#_reference)
  *optional*               

  **comment**\             &lt; string &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **method**\              [CodeableConcept](#_codeableconcept)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_specimencontainer){.anchor}8.425. SpecimenContainer {#_specimencontainer}

  ---------------------------------------------------------------------------
  Name                           Schema
  ------------------------------ --------------------------------------------
  **additiveCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                     

  **additiveReference**\         [Reference](#_reference)
  *optional*                     

  **capacity**\                  [SimpleQuantity](#_simplequantity)
  *optional*                     

  **description**\               string
  *optional*                     

  **extension**\                 &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **id**\                        string
  *optional*                     

  **identifier**\                &lt; [Identifier](#_identifier) &gt; array
  *optional*                     

  **modifierExtension**\         &lt; [Extension](#_extension) &gt; array
  *optional*                     

  **specimenQuantity**\          [SimpleQuantity](#_simplequantity)
  *optional*                     

  **type**\                      [CodeableConcept](#_codeableconcept)
  *optional*                     
  ---------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_specimenstatus){.anchor}8.426. SpecimenStatus {#_specimenstatus}

  ------------------------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (AVAILABLE, UNAVAILABLE, UNSATISFACTORY, ENTERED\_IN\_ERROR)
  *optional*       
  ------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_specimentreatment){.anchor}8.427. SpecimenTreatment {#_specimentreatment}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **additive**\            &lt; [Reference](#_reference) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **procedure**\           [CodeableConcept](#_codeableconcept)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_string){.anchor}8.428. String {#_string}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinition){.anchor}8.429. StructureDefinition {#_structuredefinition}

  -----------------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------------
  **abstract**\            boolean
  *required*               

  **base**\                [Uri](#_uri)
  *optional*               

  **code**\                &lt; [Coding](#_coding) &gt; array
  *optional*               

  **constrainedType**\     [Code](#_code)
  *optional*               

  **contact**\             &lt; [StructureDefinitionContact](#_structuredefinitioncontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **context**\             &lt; string &gt; array
  *optional*               

  **contextType**\         [ExtensionContext](#_extensioncontext)
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **differential**\        [StructureDefinitionDifferential](#_structuredefinitiondifferential)
  *optional*               

  **display**\             string
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fhirVersion**\         [Id](#_id)
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **kind**\                [StructureDefinitionKind](#_structuredefinitionkind)
  *required*               

  **language**\            [Code](#_code)
  *optional*               

  **mapping**\             &lt; [StructureDefinitionMapping](#_structuredefinitionmapping) &gt; array
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **snapshot**\            [StructureDefinitionSnapshot](#_structuredefinitionsnapshot)
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinitioncontact){.anchor}8.430. StructureDefinitionContact {#_structuredefinitioncontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinitiondifferential){.anchor}8.431. StructureDefinitionDifferential {#_structuredefinitiondifferential}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **element**\             &lt; [ElementDefinition](#_elementdefinition) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinitionkind){.anchor}8.432. StructureDefinitionKind {#_structuredefinitionkind}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (DATATYPE, RESOURCE, LOGICAL)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinitionmapping){.anchor}8.433. StructureDefinitionMapping {#_structuredefinitionmapping}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **comments**\            string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identity**\            [Id](#_id)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **uri**\                 [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_structuredefinitionsnapshot){.anchor}8.434. StructureDefinitionSnapshot {#_structuredefinitionsnapshot}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **element**\             &lt; [ElementDefinition](#_elementdefinition) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_subscription){.anchor}8.435. Subscription {#_subscription}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **channel**\             [SubscriptionChannel](#_subscriptionchannel)
  *required*               

  **contact**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **criteria**\            string
  *required*               

  **end**\                 [Instant](#_instant)
  *optional*               

  **error**\               string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **reason**\              string
  *required*               

  **status**\              [SubscriptionStatus](#_subscriptionstatus)
  *required*               

  **tag**\                 &lt; [Coding](#_coding) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_subscriptionchannel){.anchor}8.436. SubscriptionChannel {#_subscriptionchannel}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **endpoint**\            [Uri](#_uri)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **header**\              string
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **payload**\             string
  *required*               

  **type**\                [SubscriptionChannelType](#_subscriptionchanneltype)
  *required*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_subscriptionchanneltype){.anchor}8.437. SubscriptionChannelType {#_subscriptionchanneltype}

  --------------------------------------------------------------------
  Name             Schema
  ---------------- ---------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REST\_HOOK, WEBSOCKET, EMAIL, SMS, MESSAGE)
  *optional*       
  --------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_subscriptionstatus){.anchor}8.438. SubscriptionStatus {#_subscriptionstatus}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REQUESTED, ACTIVE, ERROR, OFF)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_substance){.anchor}8.439. Substance {#_substance}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **category**\            &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **code**\                [CodeableConcept](#_codeableconcept)
  *required*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          &lt; [Identifier](#_identifier) &gt; array
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **ingredient**\          &lt; [SubstanceIngredient](#_substanceingredient) &gt; array
  *optional*               

  **instance**\            &lt; [SubstanceInstance](#_substanceinstance) &gt; array
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_substanceingredient){.anchor}8.440. SubstanceIngredient {#_substanceingredient}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **quantity**\            [Ratio](#_ratio)
  *optional*               

  **substance**\           [Reference](#_reference)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_substanceinstance){.anchor}8.441. SubstanceInstance {#_substanceinstance}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **expiry**\              [DateTime](#_datetime)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_supplydelivery){.anchor}8.442. SupplyDelivery {#_supplydelivery}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **destination**\         [Reference](#_reference)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **patient**\             [Reference](#_reference)
  *optional*               

  **quantity**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **receiver**\            &lt; [Reference](#_reference) &gt; array
  *optional*               

  **status**\              [SupplyDeliveryStatus](#_supplydeliverystatus)
  *optional*               

  **suppliedItem**\        [Reference](#_reference)
  *optional*               

  **supplier**\            [Reference](#_reference)
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **time**\                [DateTime](#_datetime)
  *optional*               

  **type**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **whenPrepared**\        [Period](#_period)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_supplydeliverystatus){.anchor}8.443. SupplyDeliveryStatus {#_supplydeliverystatus}

  ------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (IN\_PROGRESS, COMPLETED, ABANDONED)
  *optional*       
  ------------------------------------------------------------

</div>

<div class="sect2">

### [](#_supplyrequest){.anchor}8.444. SupplyRequest {#_supplyrequest}

  ---------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------
  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **date**\                    [DateTime](#_datetime)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              [Identifier](#_identifier)
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **kind**\                    [CodeableConcept](#_codeableconcept)
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **orderedItem**\             [Reference](#_reference)
  *optional*                   

  **patient**\                 [Reference](#_reference)
  *optional*                   

  **reasonCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **reasonReference**\         [Reference](#_reference)
  *optional*                   

  **source**\                  [Reference](#_reference)
  *optional*                   

  **status**\                  [SupplyRequestStatus](#_supplyrequeststatus)
  *optional*                   

  **supplier**\                &lt; [Reference](#_reference) &gt; array
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   

  **when**\                    [SupplyRequestWhen](#_supplyrequestwhen)
  *optional*                   
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_supplyrequeststatus){.anchor}8.445. SupplyRequestStatus {#_supplyrequeststatus}

  -----------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (REQUESTED, COMPLETED, FAILED, CANCELLED)
  *optional*       
  -----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_supplyrequestwhen){.anchor}8.446. SupplyRequestWhen {#_supplyrequestwhen}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **code**\                [CodeableConcept](#_codeableconcept)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **schedule**\            [Timing](#_timing)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_systemrestfulinteraction){.anchor}8.447. SystemRestfulInteraction {#_systemrestfulinteraction}

  ----------------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (TRANSACTION, SEARCH\_SYSTEM, HISTORY\_SYSTEM)
  *optional*       
  ----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscript){.anchor}8.448. TestScript {#_testscript}

  -------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------------
  **contact**\             &lt; [TestScriptContact](#_testscriptcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **fixture**\             &lt; [TestScriptFixture](#_testscriptfixture) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **metadata**\            [TestScriptMetadata](#_testscriptmetadata)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **multiserver**\         boolean
  *optional*               

  **name**\                string
  *required*               

  **profile**\             &lt; [Reference](#_reference) &gt; array
  *optional*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **setup**\               [TestScriptSetup](#_testscriptsetup)
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **teardown**\            [TestScriptTeardown](#_testscriptteardown)
  *optional*               

  **test**\                &lt; [TestScriptTest](#_testscripttest) &gt; array
  *optional*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **variable**\            &lt; [TestScriptVariable](#_testscriptvariable) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptaction){.anchor}8.449. TestScriptAction {#_testscriptaction}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **assert**\              [TestScriptAssert](#_testscriptassert)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operation**\           [TestScriptOperation](#_testscriptoperation)
  *optional*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptaction1){.anchor}8.450. TestScriptAction1 {#_testscriptaction1}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **assert**\              [TestScriptAssert](#_testscriptassert)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operation**\           [TestScriptOperation](#_testscriptoperation)
  *optional*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptaction2){.anchor}8.451. TestScriptAction2 {#_testscriptaction2}

  -----------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **operation**\           [TestScriptOperation](#_testscriptoperation)
  *optional*               
  -----------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptassert){.anchor}8.452. TestScriptAssert {#_testscriptassert}

  -------------------------------------------------------------------------------
  Name                       Schema
  -------------------------- ----------------------------------------------------
  **compareToSourceId**\     string
  *optional*                 

  **compareToSourcePath**\   string
  *optional*                 

  **contentType**\           [ContentType](#_contenttype)
  *optional*                 

  **description**\           string
  *optional*                 

  **direction**\             [AssertionDirectionType](#_assertiondirectiontype)
  *optional*                 

  **extension**\             &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **headerField**\           string
  *optional*                 

  **id**\                    string
  *optional*                 

  **label**\                 string
  *optional*                 

  **minimumId**\             string
  *optional*                 

  **modifierExtension**\     &lt; [Extension](#_extension) &gt; array
  *optional*                 

  **navigationLinks**\       boolean
  *optional*                 

  **operator**\              [AssertionOperatorType](#_assertionoperatortype)
  *optional*                 

  **path**\                  string
  *optional*                 

  **resource**\              [Code](#_code)
  *optional*                 

  **response**\              [AssertionResponseTypes](#_assertionresponsetypes)
  *optional*                 

  **responseCode**\          string
  *optional*                 

  **sourceId**\              [Id](#_id)
  *optional*                 

  **validateProfileId**\     [Id](#_id)
  *optional*                 

  **value**\                 string
  *optional*                 

  **warningOnly**\           boolean
  *optional*                 
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptcapability){.anchor}8.453. TestScriptCapability {#_testscriptcapability}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **conformance**\         [Reference](#_reference)
  *required*               

  **description**\         string
  *optional*               

  **destination**\         [Integer](#_integer)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **link**\                &lt; [Uri](#_uri) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **required**\            boolean
  *optional*               

  **validated**\           boolean
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptcontact){.anchor}8.454. TestScriptContact {#_testscriptcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptfixture){.anchor}8.455. TestScriptFixture {#_testscriptfixture}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **autocreate**\          boolean
  *optional*               

  **autodelete**\          boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **resource**\            [Reference](#_reference)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptlink){.anchor}8.456. TestScriptLink {#_testscriptlink}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **url**\                 [Uri](#_uri)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptmetadata){.anchor}8.457. TestScriptMetadata {#_testscriptmetadata}

  -----------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------
  **capability**\          &lt; [TestScriptCapability](#_testscriptcapability) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **link**\                &lt; [TestScriptLink](#_testscriptlink) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptoperation){.anchor}8.458. TestScriptOperation {#_testscriptoperation}

  -----------------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------------------
  **accept**\              [ContentType](#_contenttype)
  *optional*               

  **contentType**\         [ContentType](#_contenttype)
  *optional*               

  **description**\         string
  *optional*               

  **destination**\         [Integer](#_integer)
  *optional*               

  **encodeRequestUrl**\    boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **label**\               string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **params**\              string
  *optional*               

  **requestHeader**\       &lt; [TestScriptRequestHeader](#_testscriptrequestheader) &gt; array
  *optional*               

  **resource**\            [Code](#_code)
  *optional*               

  **responseId**\          [Id](#_id)
  *optional*               

  **sourceId**\            [Id](#_id)
  *optional*               

  **targetId**\            [Id](#_id)
  *optional*               

  **type**\                [Coding](#_coding)
  *optional*               

  **url**\                 string
  *optional*               
  -----------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptrequestheader){.anchor}8.459. TestScriptRequestHeader {#_testscriptrequestheader}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **field**\               string
  *required*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **value**\               string
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptsetup){.anchor}8.460. TestScriptSetup {#_testscriptsetup}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **action**\              &lt; [TestScriptAction](#_testscriptaction) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **metadata**\            [TestScriptMetadata](#_testscriptmetadata)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptteardown){.anchor}8.461. TestScriptTeardown {#_testscriptteardown}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **action**\              &lt; [TestScriptAction2](#_testscriptaction2) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscripttest){.anchor}8.462. TestScriptTest {#_testscripttest}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **action**\              &lt; [TestScriptAction1](#_testscriptaction1) &gt; array
  *required*               

  **description**\         string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **metadata**\            [TestScriptMetadata](#_testscriptmetadata)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_testscriptvariable){.anchor}8.463. TestScriptVariable {#_testscriptvariable}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **headerField**\         string
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **path**\                string
  *optional*               

  **sourceId**\            [Id](#_id)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_time){.anchor}8.464. Time {#_time}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_timing){.anchor}8.465. Timing {#_timing}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **code**\        [CodeableConcept](#_codeableconcept)
  *optional*       

  **event**\       &lt; [DateTime](#_datetime) &gt; array
  *optional*       

  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **repeat**\      [TimingRepeat](#_timingrepeat)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_timingrepeat){.anchor}8.466. TimingRepeat {#_timingrepeat}

  ----------------------------------------------------------------
  Name                  Schema
  --------------------- ------------------------------------------
  **boundsPeriod**\     [Period](#_period)
  *optional*            

  **boundsQuantity**\   [Duration](#_duration)
  *optional*            

  **boundsRange**\      [Range](#_range)
  *optional*            

  **count**\            [Integer](#_integer)
  *optional*            

  **duration**\         [Decimal](#_decimal)
  *optional*            

  **durationMax**\      [Decimal](#_decimal)
  *optional*            

  **durationUnits**\    [UnitsOfTime](#_unitsoftime)
  *optional*            

  **extension**\        &lt; [Extension](#_extension) &gt; array
  *optional*            

  **frequency**\        [Integer](#_integer)
  *optional*            

  **frequencyMax**\     [Integer](#_integer)
  *optional*            

  **id**\               string
  *optional*            

  **period**\           [Decimal](#_decimal)
  *optional*            

  **periodMax**\        [Decimal](#_decimal)
  *optional*            

  **periodUnits**\      [UnitsOfTime](#_unitsoftime)
  *optional*            

  **when**\             [EventTiming](#_eventtiming)
  *optional*            
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_transactionmode){.anchor}8.467. TransactionMode {#_transactionmode}

  ------------------------------------------------------------------
  Name             Schema
  ---------------- -------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NOT\_SUPPORTED, BATCH, TRANSACTION, BOTH)
  *optional*       
  ------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_typerestfulinteraction){.anchor}8.468. TypeRestfulInteraction {#_typerestfulinteraction}

  -----------------------------------------------------------------------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------------------------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (READ, VREAD, UPDATE, DELETE, HISTORY\_INSTANCE, VALIDATE, HISTORY\_TYPE, CREATE, SEARCH\_TYPE)
  *optional*       
  -----------------------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_unitsoftime){.anchor}8.469. UnitsOfTime {#_unitsoftime}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (S, MIN, H, D, WK, MO, A)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_unknowncontentcode){.anchor}8.470. UnknownContentCode {#_unknowncontentcode}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NO, EXTENSIONS, ELEMENTS, BOTH)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_unsignedint){.anchor}8.471. UnsignedInt {#_unsignedint}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       integer
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_uri){.anchor}8.472. Uri {#_uri}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_use){.anchor}8.473. Use {#_use}

  ----------------------------------------------------------------
  Name             Schema
  ---------------- -----------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (COMPLETE, PROPOSED, EXPLORATORY, OTHER)
  *optional*       
  ----------------------------------------------------------------

</div>

<div class="sect2">

### [](#_uuid){.anchor}8.474. Uuid {#_uuid}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       string
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_valueset){.anchor}8.475. ValueSet {#_valueset}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **codeSystem**\          [ValueSetCodeSystem](#_valuesetcodesystem)
  *optional*               

  **compose**\             [ValueSetCompose](#_valuesetcompose)
  *optional*               

  **contact**\             &lt; [ValueSetContact](#_valuesetcontact) &gt; array
  *optional*               

  **contained**\           &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*               

  **copyright**\           string
  *optional*               

  **date**\                [DateTime](#_datetime)
  *optional*               

  **description**\         string
  *optional*               

  **expansion**\           [ValueSetExpansion](#_valuesetexpansion)
  *optional*               

  **experimental**\        boolean
  *optional*               

  **extensible**\          boolean
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  [Id](#_id)
  *optional*               

  **identifier**\          [Identifier](#_identifier)
  *optional*               

  **immutable**\           boolean
  *optional*               

  **implicitRules**\       [Uri](#_uri)
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **lockedDate**\          string(date)
  *optional*               

  **meta**\                [Meta](#_meta)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **publisher**\           string
  *optional*               

  **requirements**\        string
  *optional*               

  **status**\              [Code](#_code)
  *required*               

  **text**\                [Narrative](#_narrative)
  *optional*               

  **url**\                 [Uri](#_uri)
  *optional*               

  **useContext**\          &lt; [CodeableConcept](#_codeableconcept) &gt; array
  *optional*               

  **version**\             string
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetcodesystem){.anchor}8.476. ValueSetCodeSystem {#_valuesetcodesystem}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **caseSensitive**\       boolean
  *optional*               

  **concept**\             &lt; [ValueSetConcept](#_valuesetconcept) &gt; array
  *required*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **system**\              [Uri](#_uri)
  *required*               

  **version**\             string
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetcompose){.anchor}8.477. ValueSetCompose {#_valuesetcompose}

  -------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------------
  **exclude**\             &lt; [ValueSetInclude](#_valuesetinclude) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **import**\              &lt; [Uri](#_uri) &gt; array
  *optional*               

  **include**\             &lt; [ValueSetInclude](#_valuesetinclude) &gt; array
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  -------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetconcept){.anchor}8.478. ValueSetConcept {#_valuesetconcept}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **abstract**\            boolean
  *optional*               

  **code**\                [Code](#_code)
  *required*               

  **concept**\             &lt; [ValueSetConcept](#_valuesetconcept) &gt; array
  *optional*               

  **definition**\          string
  *optional*               

  **designation**\         &lt; [ValueSetDesignation](#_valuesetdesignation) &gt; array
  *optional*               

  **display**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetconcept1){.anchor}8.479. ValueSetConcept1 {#_valuesetconcept1}

  ---------------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------------
  **code**\                [Code](#_code)
  *required*               

  **designation**\         &lt; [ValueSetDesignation](#_valuesetdesignation) &gt; array
  *optional*               

  **display**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               
  ---------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetcontact){.anchor}8.480. ValueSetContact {#_valuesetcontact}

  -------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *optional*               

  **telecom**\             &lt; [ContactPoint](#_contactpoint) &gt; array
  *optional*               
  -------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetcontains){.anchor}8.481. ValueSetContains {#_valuesetcontains}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **abstract**\            boolean
  *optional*               

  **code**\                [Code](#_code)
  *optional*               

  **contains**\            &lt; [ValueSetContains](#_valuesetcontains) &gt; array
  *optional*               

  **display**\             string
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **system**\              [Uri](#_uri)
  *optional*               

  **version**\             string
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetdesignation){.anchor}8.482. ValueSetDesignation {#_valuesetdesignation}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **language**\            [Code](#_code)
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **use**\                 [Coding](#_coding)
  *optional*               

  **value**\               string
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetexpansion){.anchor}8.483. ValueSetExpansion {#_valuesetexpansion}

  -----------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ ----------------------------------------------------------
  **contains**\            &lt; [ValueSetContains](#_valuesetcontains) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **identifier**\          [Uri](#_uri)
  *required*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **offset**\              [Integer](#_integer)
  *optional*               

  **parameter**\           &lt; [ValueSetParameter](#_valuesetparameter) &gt; array
  *optional*               

  **timestamp**\           [DateTime](#_datetime)
  *required*               

  **total**\               [Integer](#_integer)
  *optional*               
  -----------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetfilter){.anchor}8.484. ValueSetFilter {#_valuesetfilter}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **op**\                  [FilterOperator](#_filteroperator)
  *required*               

  **property**\            [Code](#_code)
  *required*               

  **value**\               [Code](#_code)
  *required*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetinclude){.anchor}8.485. ValueSetInclude {#_valuesetinclude}

  ---------------------------------------------------------------------------------
  Name                     Schema
  ------------------------ --------------------------------------------------------
  **concept**\             &lt; [ValueSetConcept1](#_valuesetconcept1) &gt; array
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **filter**\              &lt; [ValueSetFilter](#_valuesetfilter) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **system**\              [Uri](#_uri)
  *required*               

  **version**\             string
  *optional*               
  ---------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_valuesetparameter){.anchor}8.486. ValueSetParameter {#_valuesetparameter}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **name**\                string
  *required*               

  **valueBoolean**\        boolean
  *optional*               

  **valueCode**\           [Code](#_code)
  *optional*               

  **valueDecimal**\        [Decimal](#_decimal)
  *optional*               

  **valueInteger**\        [Integer](#_integer)
  *optional*               

  **valueString**\         string
  *optional*               

  **valueUri**\            [Uri](#_uri)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_visionbase){.anchor}8.487. VisionBase {#_visionbase}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (UP, DOWN, IN, OUT)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_visioneyes){.anchor}8.488. VisionEyes {#_visioneyes}

  -----------------------------------------------------------
  Name             Schema
  ---------------- ------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (RIGHT, LEFT)
  *optional*       
  -----------------------------------------------------------

</div>

<div class="sect2">

### [](#_visionprescription){.anchor}8.489. VisionPrescription {#_visionprescription}

  ---------------------------------------------------------------------------------------------------------
  Name                         Schema
  ---------------------------- ----------------------------------------------------------------------------
  **contained**\               &lt; [ResourceContainer](#_resourcecontainer) &gt; array
  *optional*                   

  **dateWritten**\             [DateTime](#_datetime)
  *optional*                   

  **dispense**\                &lt; [VisionPrescriptionDispense](#_visionprescriptiondispense) &gt; array
  *optional*                   

  **encounter**\               [Reference](#_reference)
  *optional*                   

  **extension**\               &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **id**\                      [Id](#_id)
  *optional*                   

  **identifier**\              &lt; [Identifier](#_identifier) &gt; array
  *optional*                   

  **implicitRules**\           [Uri](#_uri)
  *optional*                   

  **language**\                [Code](#_code)
  *optional*                   

  **meta**\                    [Meta](#_meta)
  *optional*                   

  **modifierExtension**\       &lt; [Extension](#_extension) &gt; array
  *optional*                   

  **patient**\                 [Reference](#_reference)
  *optional*                   

  **prescriber**\              [Reference](#_reference)
  *optional*                   

  **reasonCodeableConcept**\   [CodeableConcept](#_codeableconcept)
  *optional*                   

  **reasonReference**\         [Reference](#_reference)
  *optional*                   

  **text**\                    [Narrative](#_narrative)
  *optional*                   
  ---------------------------------------------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_visionprescriptiondispense){.anchor}8.490. VisionPrescriptionDispense {#_visionprescriptiondispense}

  -------------------------------------------------------------------
  Name                     Schema
  ------------------------ ------------------------------------------
  **add**\                 [Decimal](#_decimal)
  *optional*               

  **axis**\                [Integer](#_integer)
  *optional*               

  **backCurve**\           [Decimal](#_decimal)
  *optional*               

  **base**\                [VisionBase](#_visionbase)
  *optional*               

  **brand**\               string
  *optional*               

  **color**\               string
  *optional*               

  **cylinder**\            [Decimal](#_decimal)
  *optional*               

  **diameter**\            [Decimal](#_decimal)
  *optional*               

  **duration**\            [SimpleQuantity](#_simplequantity)
  *optional*               

  **extension**\           &lt; [Extension](#_extension) &gt; array
  *optional*               

  **eye**\                 [VisionEyes](#_visioneyes)
  *optional*               

  **id**\                  string
  *optional*               

  **modifierExtension**\   &lt; [Extension](#_extension) &gt; array
  *optional*               

  **notes**\               string
  *optional*               

  **power**\               [Decimal](#_decimal)
  *optional*               

  **prism**\               [Decimal](#_decimal)
  *optional*               

  **product**\             [Coding](#_coding)
  *required*               

  **sphere**\              [Decimal](#_decimal)
  *optional*               
  -------------------------------------------------------------------

</div>

<div class="sect2">

### [](#_xpathusagetype){.anchor}8.491. XPathUsageType {#_xpathusagetype}

  -------------------------------------------------------------------
  Name             Schema
  ---------------- --------------------------------------------------
  **extension**\   &lt; [Extension](#_extension) &gt; array
  *optional*       

  **id**\          string
  *optional*       

  **value**\       enum (NORMAL, PHONETIC, NEARBY, DISTANCE, OTHER)
  *optional*       
  -------------------------------------------------------------------

<div style="page-break-after: always;">

</div>

<div style="page-break-after: always;">

</div>

<div style="page-break-after: always;">

</div>

<div style="page-break-after: always;">

</div>

<div style="page-break-after: always;">

</div>

<div style="page-break-after: always;">

</div>

</div>

</div>

</div>

</div>

<div id="footer">

<div id="footer-text">

Last updated 2017-01-24 18:42:40 -08:00

</div>

</div>
