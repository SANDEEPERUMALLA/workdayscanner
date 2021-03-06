
package com.workday.sources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.workday.sources package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeePersonalInfo_QNAME = new QName("urn:com.workday/bsvc", "Employee_Personal_Info");
    private final static QName _EmployeeEmploymentInfoGet_QNAME = new QName("urn:com.workday/bsvc", "Employee_Employment_Info_Get");
    private final static QName _PutJobFamilyRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Family_Request");
    private final static QName _ChangeBusinessTitleRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Business_Title_Request");
    private final static QName _GetAcademicRanksResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Ranks_Response");
    private final static QName _PutAcademicUnitHierarchyResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Unit_Hierarchy_Response");
    private final static QName _AssignEstablishmentResponse_QNAME = new QName("urn:com.workday/bsvc", "Assign_Establishment_Response");
    private final static QName _ContingentWorkerPersonalInfoGet_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Personal_Info_Get");
    private final static QName _GetCommitteeMembershipTypesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Membership_Types_Request");
    private final static QName _ChangeLicensesResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Licenses_Response");
    private final static QName _EmployeeGet_QNAME = new QName("urn:com.workday/bsvc", "Employee_Get");
    private final static QName _OrganizationGet_QNAME = new QName("urn:com.workday/bsvc", "Organization_Get");
    private final static QName _PutPoliticalAffiliationResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Political_Affiliation_Response");
    private final static QName _PutSexualOrientationRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Sexual_Orientation_Request");
    private final static QName _WorkdayAccountForWorkerAdd_QNAME = new QName("urn:com.workday/bsvc", "Workday_Account_for_Worker_Add");
    private final static QName _PutOrganizationAssignmentRestrictionsResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Organization_Assignment_Restrictions_Response");
    private final static QName _PutWorkerPhotoRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Worker_Photo_Request");
    private final static QName _ServerTimestampGet_QNAME = new QName("urn:com.workday/bsvc", "Server_Timestamp_Get");
    private final static QName _GetHolidayCalendarsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Holiday_Calendars_Request");
    private final static QName _GetJobCategoriesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Categories_Response");
    private final static QName _PutUniversalIdentifierRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Universal_Identifier_Request");
    private final static QName _WorkerEventHistoryGet_QNAME = new QName("urn:com.workday/bsvc", "Worker_Event_History_Get");
    private final static QName _GetWorkersRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Workers_Request");
    private final static QName _GetFormerWorkerDocumentsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Former_Worker_Documents_Response");
    private final static QName _PutGenderIdentityResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Gender_Identity_Response");
    private final static QName _PutPreferredCommunicationLanguageResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Preferred_Communication_Language_Response");
    private final static QName _ManageCommitteeMembershipResponse_QNAME = new QName("urn:com.workday/bsvc", "Manage_Committee_Membership_Response");
    private final static QName _GetFrequenciesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Frequencies_Request");
    private final static QName _GetJobFamiliesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Families_Request");
    private final static QName _PutJobProfileRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Profile_Request");
    private final static QName _PutJobFamilyResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Family_Response");
    private final static QName _AssignMembersToCustomOrganizationRequest_QNAME = new QName("urn:com.workday/bsvc", "Assign_Members_to_Custom_Organization_Request");
    private final static QName _PutProvisioningGroupAssignmentRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Provisioning_Group_Assignment_Request");
    private final static QName _PutPronounRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Pronoun_Request");
    private final static QName _GetServiceCenterRepresentativesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Service_Center_Representatives_Response");
    private final static QName _ManageCommitteeMembershipRequest_QNAME = new QName("urn:com.workday/bsvc", "Manage_Committee_Membership_Request");
    private final static QName _GetJobProfilesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Profiles_Request");
    private final static QName _EmployeeImageUpdate_QNAME = new QName("urn:com.workday/bsvc", "Employee_Image_Update");
    private final static QName _PutLocationResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Response");
    private final static QName _OrganizationFind_QNAME = new QName("urn:com.workday/bsvc", "Organization_Find");
    private final static QName _GetAcademicUnitHierarchiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Unit_Hierarchies_Request");
    private final static QName _ChangeVeteranStatusIdentificationRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Veteran_Status_Identification_Request");
    private final static QName _GetDisabilitiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Disabilities_Response");
    private final static QName _PutPronounResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Pronoun_Response");
    private final static QName _GetWorkStatusRuleSetsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Status_Rule_Sets_Request");
    private final static QName _GetServiceCenterRepresentativeWorkdayAccountsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Service_Center_Representative_Workday_Accounts_Request");
    private final static QName _PutJobClassificationGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Classification_Group_Response");
    private final static QName _PutServiceCenterRepresentativeWorkdayAccountResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Service_Center_Representative_Workday_Account_Response");
    private final static QName _PutProvisioningGroupAssignmentResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Provisioning_Group_Assignment_Response");
    private final static QName _PutEstablishmentResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Establishment_Response");
    private final static QName _GetAssignUserBasedSecurityGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Assign_User-Based_Security_Groups_Request");
    private final static QName _PutCommitteeMeetingResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Meeting_Response");
    private final static QName _OrganizationReferences_QNAME = new QName("urn:com.workday/bsvc", "Organization_References");
    private final static QName _GetEthnicitiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Ethnicities_Request");
    private final static QName _EmployeeImageGet_QNAME = new QName("urn:com.workday/bsvc", "Employee_Image_Get");
    private final static QName _GetJobProfilesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Profiles_Response");
    private final static QName _GetFrequenciesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Frequencies_Response");
    private final static QName _GetWorkersCompensationCodesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Workers_Compensation_Codes_Request");
    private final static QName _ContingentWorkerContractInfoGet_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Contract_Info_Get");
    private final static QName _MaintainContactInformationForPersonEventResponse_QNAME = new QName("urn:com.workday/bsvc", "Maintain_Contact_Information_for_Person_Event_Response");
    private final static QName _PutWorkScheduleCalendarResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Schedule_Calendar_Response");
    private final static QName _GetCommitteeMeetingsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Meetings_Request");
    private final static QName _ChangeWorkSpaceResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Work_Space_Response");
    private final static QName _WorkdayCommonHeader_QNAME = new QName("urn:com.workday/bsvc", "Workday_Common_Header");
    private final static QName _PutHolidayCalendarResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Holiday_Calendar_Response");
    private final static QName _GetLGBTIdentificationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_LGBT_Identifications_Response");
    private final static QName _PutCommitteeMeetingRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Meeting_Request");
    private final static QName _GetSexualOrientationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Sexual_Orientations_Response");
    private final static QName _AssignEmployeeCollectiveAgreementEventResponse_QNAME = new QName("urn:com.workday/bsvc", "Assign_Employee_Collective_Agreement_Event_Response");
    private final static QName _PutServiceCenterRepresentativeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Service_Center_Representative_Response");
    private final static QName _ServerTimestamp_QNAME = new QName("urn:com.workday/bsvc", "Server_Timestamp");
    private final static QName _ChangePassportsAndVisasResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Passports_and_Visas_Response");
    private final static QName _ContingentWorker_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker");
    private final static QName _ReactivateOrganizationResponse_QNAME = new QName("urn:com.workday/bsvc", "Reactivate_Organization_Response");
    private final static QName _GetAcademicAppointeeRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Appointee_Request");
    private final static QName _PutProvisioningGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Provisioning_Group_Request");
    private final static QName _GetCommitteeDefinitionRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Definition_Request");
    private final static QName _PutPoliticalAffiliationRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Political_Affiliation_Request");
    private final static QName _GetEstablishmentsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Establishments_Request");
    private final static QName _WorkerProfileGet_QNAME = new QName("urn:com.workday/bsvc", "Worker_Profile_Get");
    private final static QName _WorkdayAccountForWorkerUpdate_QNAME = new QName("urn:com.workday/bsvc", "Workday_Account_for_Worker_Update");
    private final static QName _PutLGBTIdentificationResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_LGBT_Identification_Response");
    private final static QName _GetWorkersResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Workers_Response");
    private final static QName _ChangeEmergencyContactsRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Emergency_Contacts_Request");
    private final static QName _PutPreviousSystemJobHistoryRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Previous_System_Job_History_Request");
    private final static QName _PutFrequencyResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Frequency_Response");
    private final static QName _OrganizationReference_QNAME = new QName("urn:com.workday/bsvc", "Organization_Reference");
    private final static QName _EndCollectiveAgreementAssignmentEventResponse_QNAME = new QName("urn:com.workday/bsvc", "End_Collective_Agreement_Assignment_Event_Response");
    private final static QName _GetGenderIdentitiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Gender_Identities_Response");
    private final static QName _PutPeriodReportingCalendarResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Period_Reporting_Calendar_Response");
    private final static QName _GetPronounsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Pronouns_Response");
    private final static QName _GetChangeWorkContactInformationResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Work_Contact_Information_Response");
    private final static QName _PutDifficultyToFillRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Difficulty_to_Fill_Request");
    private final static QName _GetLocationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Locations_Response");
    private final static QName _PutJobClassificationGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Classification_Group_Request");
    private final static QName _PutLocationAttributeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Attribute_Request");
    private final static QName _PutCommitteeClassificationGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Classification_Group_Response");
    private final static QName _PutFrequencyRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Frequency_Request");
    private final static QName _PutWorkerPhotoResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Worker_Photo_Response");
    private final static QName _ChangeGovernmentIDsResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Government_IDs_Response");
    private final static QName _GetAppointmentSpecialtiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Appointment_Specialties_Response");
    private final static QName _PutWorkersCompensationCodeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Workers_Compensation_Code_Response");
    private final static QName _GetChangeGovernmentIDsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Government_IDs_Request");
    private final static QName _ReassignSuperiorToInactiveOrganizationResponse_QNAME = new QName("urn:com.workday/bsvc", "Reassign_Superior_to_Inactive_Organization_Response");
    private final static QName _GetJobClassificationGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Classification_Groups_Response");
    private final static QName _ChangeWorkContactInformationRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Work_Contact_Information_Request");
    private final static QName _PutAcademicRankResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Rank_Response");
    private final static QName _GetCommitteeClassificationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Classifications_Request");
    private final static QName _PutSexualOrientationResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Sexual_Orientation_Response");
    private final static QName _GetChangeGovernmentIDsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Government_IDs_Response");
    private final static QName _ContingentWorkerGet_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Get");
    private final static QName _GetDifficultyToFillResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Difficulty_to_Fill_Response");
    private final static QName _PutAcademicUnitResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Unit_Response");
    private final static QName _GetFormerWorkerDocumentsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Former_Worker_Documents_Request");
    private final static QName _GetTrainingTypesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Training_Types_Request");
    private final static QName _PutOrganizationAssignmentRestrictionsRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Organization_Assignment_Restrictions_Request");
    private final static QName _BusinessSiteFind_QNAME = new QName("urn:com.workday/bsvc", "Business_Site_Find");
    private final static QName _EndCollectiveAgreementAssignmentEventRequest_QNAME = new QName("urn:com.workday/bsvc", "End_Collective_Agreement_Assignment_Event_Request");
    private final static QName _ChangeHomeContactInformationResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Home_Contact_Information_Response");
    private final static QName _Employee_QNAME = new QName("urn:com.workday/bsvc", "Employee");
    private final static QName _ManageUnionMembershipResponse_QNAME = new QName("urn:com.workday/bsvc", "Manage_Union_Membership_Response");
    private final static QName _GetWorkerPhotosResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Worker_Photos_Response");
    private final static QName _GetPoliticalAffiliationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Political_Affiliations_Request");
    private final static QName _PutFormerWorkerDocumentResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Former_Worker_Document_Response");
    private final static QName _PutLocationHierarchyOrganizationAssignmentsRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Hierarchy_Organization_Assignments_Request");
    private final static QName _GetAcademicUnitHierarchiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Unit_Hierarchies_Response");
    private final static QName _GetCommitteeDefinitionResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Definition_Response");
    private final static QName _EmployeePersonalInfoUpdate_QNAME = new QName("urn:com.workday/bsvc", "Employee_Personal_Info_Update");
    private final static QName _GetOrganizationReferenceIDsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Organization_Reference_IDs_Response");
    private final static QName _ProvisioningGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Provisioning_Groups_Response");
    private final static QName _GetAcademicAppointmentTrackAdditionalDataRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Appointment_Track_Additional_Data_Request");
    private final static QName _OrganizationAddUpdate_QNAME = new QName("urn:com.workday/bsvc", "Organization_Add_Update");
    private final static QName _PutOrganizationReferenceIDRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Organization_Reference_ID_Request");
    private final static QName _GetPreferredCommunicationLanguageResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Preferred_Communication_Language_Response");
    private final static QName _EmployeeEmploymentInfo_QNAME = new QName("urn:com.workday/bsvc", "Employee_Employment_Info");
    private final static QName _PutExternalDisabilitySelfIdentificationRecordResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_External_Disability_Self_Identification_Record_Response");
    private final static QName _GetDifficultyToFillRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Difficulty_to_Fill_Request");
    private final static QName _PutServiceCenterRepresentativeWorkdayAccountRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Service_Center_Representative_Workday_Account_Request");
    private final static QName _PutJobCategoryRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Category_Request");
    private final static QName _PutSearchSettingsResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Search_Settings_Response");
    private final static QName _PutServiceCenterRepresentativeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Service_Center_Representative_Request");
    private final static QName _GetLocationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Locations_Request");
    private final static QName _PutAssignUserBasedSecurityGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Assign_User-Based_Security_Groups_Response");
    private final static QName _GetExternalDisabilitySelfIdentificationRecordsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_External_Disability_Self_Identification_Records_Request");
    private final static QName _PutProvisioningGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Provisioning_Group_Response");
    private final static QName _PutOrganizationReferenceIDResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Organization_Reference_ID_Response");
    private final static QName _BusinessSiteGet_QNAME = new QName("urn:com.workday/bsvc", "Business_Site_Get");
    private final static QName _PutAcademicUnitRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Unit_Request");
    private final static QName _PutHolidayCalendarRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Holiday_Calendar_Request");
    private final static QName _PutLocationRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Request");
    private final static QName _ProcessingFault_QNAME = new QName("urn:com.workday/bsvc", "Processing_Fault");
    private final static QName _PutAppointmentSpecialtyResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Appointment_Specialty_Response");
    private final static QName _GetCompanyInsiderTypesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Company_Insider_Types_Response");
    private final static QName _PutAcademicUnitHierarchyRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Unit_Hierarchy_Request");
    private final static QName _ChangeEmergencyContactsResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Emergency_Contacts_Response");
    private final static QName _PutWorkStatusRuleSetRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Status_Rule_Set_Request");
    private final static QName _CreateNamedProfessorshipRequest_QNAME = new QName("urn:com.workday/bsvc", "Create_Named_Professorship_Request");
    private final static QName _GetJobFamilyGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Family_Groups_Request");
    private final static QName _PutExternalDisabilitySelfIdentificationRecordRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_External_Disability_Self_Identification_Record_Request");
    private final static QName _PutAcademicRankRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Academic_Rank_Request");
    private final static QName _GetCommitteeClassificationGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Classification_Groups_Response");
    private final static QName _ChangeBusinessTitleResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Business_Title_Response");
    private final static QName _PutSocialBenefitsLocalityResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Social_Benefits_Locality_Response");
    private final static QName _GetPreviousSystemJobHistoryRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Previous_System_Job_History_Request");
    private final static QName _ContingentWorkerContractInfo_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Contract_Info");
    private final static QName _GetAcademicAppointmentTrackAdditionalDataResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Appointment_Track_Additional_Data_Response");
    private final static QName _PutWorkersCompensationCodeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Workers_Compensation_Code_Request");
    private final static QName _ChangePersonalInformationResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Personal_Information_Response");
    private final static QName _GetChangeHomeContactInformationRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Home_Contact_Information_Request");
    private final static QName _PutDependentRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Dependent_Request");
    private final static QName _PutFormerWorkerDocumentRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Former_Worker_Document_Request");
    private final static QName _PutCompanyInsiderTypeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Company_Insider_Type_Request");
    private final static QName _GetPreferredCommunicationLanguageRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Preferred_Communication_Language_Request");
    private final static QName _GetWorkersCompensationCodesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Workers_Compensation_Codes_Response");
    private final static QName _GetAcademicUnitsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Units_Request");
    private final static QName _PutCommitteeClassificationGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Classification_Group_Request");
    private final static QName _GetLGBTIdentificationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_LGBT_Identifications_Request");
    private final static QName _CreateReferenceLetterForWorkerResponse_QNAME = new QName("urn:com.workday/bsvc", "Create_Reference_Letter_for_Worker_Response");
    private final static QName _PutWorkShiftResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Shift_Response");
    private final static QName _PutEstablishmentRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Establishment_Request");
    private final static QName _GetOrganizationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Organizations_Response");
    private final static QName _AssignEmployeeCollectiveAgreementEventRequest_QNAME = new QName("urn:com.workday/bsvc", "Assign_Employee_Collective_Agreement_Event_Request");
    private final static QName _PutPreferredCommunicationLanguageRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Preferred_Communication_Language_Request");
    private final static QName _ManageEmployeeProbationPeriodsEventRequest_QNAME = new QName("urn:com.workday/bsvc", "Manage_Employee_Probation_Periods_Event_Request");
    private final static QName _ManageUnionMembershipRequest_QNAME = new QName("urn:com.workday/bsvc", "Manage_Union_Membership_Request");
    private final static QName _PutCommitteeClassificationRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Classification_Request");
    private final static QName _GetWorkShiftsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Shifts_Request");
    private final static QName _CreateNamedProfessorshipResponse_QNAME = new QName("urn:com.workday/bsvc", "Create_Named_Professorship_Response");
    private final static QName _ChangeAdditionalNamesResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Additional_Names_Response");
    private final static QName _PutCommitteeTypeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Type_Response");
    private final static QName _ProvisioningGroupAssignmentsResponse_QNAME = new QName("urn:com.workday/bsvc", "Provisioning_Group_Assignments_Response");
    private final static QName _GetPeriodReportingCalendarsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Period_Reporting_Calendars_Response");
    private final static QName _GetPronounsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Pronouns_Request");
    private final static QName _GetAcademicRanksRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Ranks_Request");
    private final static QName _PutCommitteeMembershipTypeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Membership_Type_Request");
    private final static QName _PutGenderIdentityRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Gender_Identity_Request");
    private final static QName _GetSearchSettingsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Search_Settings_Response");
    private final static QName _OrganizationInactivate_QNAME = new QName("urn:com.workday/bsvc", "Organization_Inactivate");
    private final static QName _PutFormerWorkerResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Former_Worker_Response");
    private final static QName _PutTrainingTypeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Training_Type_Response");
    private final static QName _PutAssignUserBasedSecurityGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Assign_User-Based_Security_Group_Response");
    private final static QName _ContingentWorkerPersonalInfoUpdate_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Personal_Info_Update");
    private final static QName _GetPoliticalAffiliationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Political_Affiliations_Response");
    private final static QName _ChangeLegalNameResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Legal_Name_Response");
    private final static QName _ChangeLicensesRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Licenses_Request");
    private final static QName _WorkerEventHistory_QNAME = new QName("urn:com.workday/bsvc", "Worker_Event_History");
    private final static QName _GetLocationHierarchyOrganizationAssignmentsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Location_Hierarchy_Organization_Assignments_Request");
    private final static QName _ChangeAdditionalNamesRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Additional_Names_Request");
    private final static QName _GetPreviousSystemJobHistoryResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Previous_System_Job_History_Response");
    private final static QName _PutAddressesForCountryFormatExtensionResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Addresses_for_Country_Format_Extension_Response");
    private final static QName _PutJobFamilyGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Family_Group_Response");
    private final static QName _GetProvisioningGroupAssignmentsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Provisioning_Group_Assignments_Request");
    private final static QName _ReactivateOrganizationRequest_QNAME = new QName("urn:com.workday/bsvc", "Reactivate_Organization_Request");
    private final static QName _GetGenderIdentitiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Gender_Identities_Request");
    private final static QName _PutCompanyInsiderTypeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Company_Insider_Type_Response");
    private final static QName _PutSearchSettingsRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Search_Settings_Request");
    private final static QName _ChangeBackgroundCheckStatusResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Background_Check_Status_Response");
    private final static QName _PutJobFamilyGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Family_Group_Request");
    private final static QName _EmployeePersonalInfoGet_QNAME = new QName("urn:com.workday/bsvc", "Employee_Personal_Info_Get");
    private final static QName _ChangeBackgroundCheckStatusRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Background_Check_Status_Request");
    private final static QName _ChangeVeteranStatusIdentificationResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Veteran_Status_Identification_Response");
    private final static QName _GetLocationAttributesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Location_Attributes_Request");
    private final static QName _GetChangeHomeContactInformationResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Home_Contact_Information_Response");
    private final static QName _ChangePassportsAndVisasRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Passports_and_Visas_Request");
    private final static QName _UpdateAcademicAppointmentRequest_QNAME = new QName("urn:com.workday/bsvc", "Update_Academic_Appointment_Request");
    private final static QName _ChangePersonalInformationRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Personal_Information_Request");
    private final static QName _GetUniversalIdentifiersResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Universal_Identifiers_Response");
    private final static QName _GetCommitteeTypesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Types_Request");
    private final static QName _GetJobFamilyGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Family_Groups_Response");
    private final static QName _GetSearchSettingsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Search_Settings_Request");
    private final static QName _GetWorkdayAccountResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Workday_Account_Response");
    private final static QName _EditAcademicAppointmentTrackAdditionalDataResponse_QNAME = new QName("urn:com.workday/bsvc", "Edit_Academic_Appointment_Track_Additional_Data_Response");
    private final static QName _GetTrainingTypesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Training_Types_Response");
    private final static QName _EndAcademicAppointmentRequest_QNAME = new QName("urn:com.workday/bsvc", "End_Academic_Appointment_Request");
    private final static QName _PutCommitteeClassificationResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Classification_Response");
    private final static QName _GetServiceCenterRepresentativesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Service_Center_Representatives_Request");
    private final static QName _PutDisabilityResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Disability_Response");
    private final static QName _GetAssignUserBasedSecurityGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Assign_User-Based_Security_Group_Request");
    private final static QName _MaintainCommitteeDefinitionResponse_QNAME = new QName("urn:com.workday/bsvc", "Maintain_Committee_Definition_Response");
    private final static QName _GetHolidayCalendarsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Holiday_Calendars_Response");
    private final static QName _PutJobProfileResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Profile_Response");
    private final static QName _EmployeeRelatedPersons_QNAME = new QName("urn:com.workday/bsvc", "Employee_Related_Persons");
    private final static QName _PutAppointmentSpecialtyRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Appointment_Specialty_Request");
    private final static QName _ImportUniversalIdentifierRequest_QNAME = new QName("urn:com.workday/bsvc", "Import_Universal_Identifier_Request");
    private final static QName _GetPeriodReportingCalendarsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Period_Reporting_Calendars_Request");
    private final static QName _ManageEmployeeProbationPeriodsEventResponse_QNAME = new QName("urn:com.workday/bsvc", "Manage_Employee_Probation_Periods_Event_Response");
    private final static QName _GetWorkStatusRuleSetsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Status_Rule_Sets_Response");
    private final static QName _GetCompanyInsiderTypesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Company_Insider_Types_Request");
    private final static QName _GetJobCategoriesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Categories_Request");
    private final static QName _PutPreviousSystemJobHistoryResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Previous_System_Job_History_Response");
    private final static QName _ChangeWorkSpaceRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Work_Space_Request");
    private final static QName _PutLGBTIdentificationRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_LGBT_Identification_Request");
    private final static QName _PutAssignUserBasedSecurityGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Assign_User-Based_Security_Groups_Request");
    private final static QName _GetProvisioningGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Provisioning_Groups_Request");
    private final static QName _EditNamedProfessorshipRequest_QNAME = new QName("urn:com.workday/bsvc", "Edit_Named_Professorship_Request");
    private final static QName _AddAcademicAppointmentRequest_QNAME = new QName("urn:com.workday/bsvc", "Add_Academic_Appointment_Request");
    private final static QName _GetFormerWorkersRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Former_Workers_Request");
    private final static QName _PutWorkShiftRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Shift_Request");
    private final static QName _GetLocationAttributesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Location_Attributes_Response");
    private final static QName _GetOrganizationAssignmentRestrictionsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Organization_Assignment_Restrictions_Request");
    private final static QName _GetServiceCenterRepresentativeWorkdayAccountsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Service_Center_Representative_Workday_Accounts_Response");
    private final static QName _GetEthnicitiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Ethnicities_Response");
    private final static QName _GetCommitteeTypesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Types_Response");
    private final static QName _GetOrganizationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Organizations_Request");
    private final static QName _PutImportProcessResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Import_Process_Response");
    private final static QName _ChangeOtherIDsRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Other_IDs_Request");
    private final static QName _PutDisabilityRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Disability_Request");
    private final static QName _AssignMembersToCustomOrganizationResponse_QNAME = new QName("urn:com.workday/bsvc", "Assign_Members_to_Custom_Organization_Response");
    private final static QName _PutWorkStatusRuleSetResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Status_Rule_Set_Response");
    private final static QName _PutLocationAttributeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Attribute_Response");
    private final static QName _GetAcademicUnitsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Units_Response");
    private final static QName _CreateReferenceLetterForWorkerRequest_QNAME = new QName("urn:com.workday/bsvc", "Create_Reference_Letter_for_Worker_Request");
    private final static QName _GetOrganizationReferenceIDsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Organization_Reference_IDs_Request");
    private final static QName _PutUniversalIdentifierResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Universal_Identifier_Response");
    private final static QName _GetOrganizationAssignmentRestrictionsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Organization_Assignment_Restrictions_Response");
    private final static QName _MaintainContactInformationForPersonEventRequest_QNAME = new QName("urn:com.workday/bsvc", "Maintain_Contact_Information_for_Person_Event_Request");
    private final static QName _PutPeriodReportingCalendarRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Period_Reporting_Calendar_Request");
    private final static QName _GetJobFamiliesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Families_Response");
    private final static QName _ChangePreferredNameResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Preferred_Name_Response");
    private final static QName _EmployeeRelatedPersonsGet_QNAME = new QName("urn:com.workday/bsvc", "Employee_Related_Persons_Get");
    private final static QName _PutAssignUserBasedSecurityGroupRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Assign_User-Based_Security_Group_Request");
    private final static QName _ChangeLegalNameRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Legal_Name_Request");
    private final static QName _GetSocialBenefitsLocalitiesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Social_Benefits_Localities_Response");
    private final static QName _GetEstablishmentsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Establishments_Response");
    private final static QName _GetLocationHierarchyOrganizationAssignmentsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Location_Hierarchy_Organization_Assignments_Response");
    private final static QName _GetCommitteeClassificationGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Classification_Groups_Request");
    private final static QName _ChangeHomeContactInformationRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Home_Contact_Information_Request");
    private final static QName _GetWorkerPhotosRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Worker_Photos_Request");
    private final static QName _GetFormerWorkersResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Former_Workers_Response");
    private final static QName _GetExternalDisabilitySelfIdentificationRecordsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_External_Disability_Self_Identification_Records_Response");
    private final static QName _PutSocialBenefitsLocalityRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Social_Benefits_Locality_Request");
    private final static QName _GetWorkdayAccountRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Workday_Account_Request");
    private final static QName _GetAcademicAppointeeResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Academic_Appointee_Response");
    private final static QName _MaintainCommitteeDefinitionRequest_QNAME = new QName("urn:com.workday/bsvc", "Maintain_Committee_Definition_Request");
    private final static QName _AssignEstablishmentRequest_QNAME = new QName("urn:com.workday/bsvc", "Assign_Establishment_Request");
    private final static QName _GetWorkScheduleCalendarsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Schedule_Calendars_Request");
    private final static QName _PutEthnicityRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Ethnicity_Request");
    private final static QName _PutFormerWorkerRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Former_Worker_Request");
    private final static QName _ContingentWorkerPersonalInfo_QNAME = new QName("urn:com.workday/bsvc", "Contingent_Worker_Personal_Info");
    private final static QName _ValidationFault_QNAME = new QName("urn:com.workday/bsvc", "Validation_Fault");
    private final static QName _PutCommitteeMembershipTypeResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Membership_Type_Response");
    private final static QName _GetAssignUserBasedSecurityGroupResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Assign_User-Based_Security_Group_Response");
    private final static QName _GetChangeWorkContactInformationRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Change_Work_Contact_Information_Request");
    private final static QName _OrganizationStructureDissolve_QNAME = new QName("urn:com.workday/bsvc", "Organization_Structure_Dissolve");
    private final static QName _BusinessSiteReferences_QNAME = new QName("urn:com.workday/bsvc", "Business_Site_References");
    private final static QName _GetCommitteeMeetingsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Meetings_Response");
    private final static QName _GetSexualOrientationsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Sexual_Orientations_Request");
    private final static QName _GetWorkShiftsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Shifts_Response");
    private final static QName _PutTrainingTypeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Training_Type_Request");
    private final static QName _GetCommitteeClassificationsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Classifications_Response");
    private final static QName _WorkerProfile_QNAME = new QName("urn:com.workday/bsvc", "Worker_Profile");
    private final static QName _Organization_QNAME = new QName("urn:com.workday/bsvc", "Organization");
    private final static QName _PutDifficultyToFillResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Difficulty_to_Fill_Response");
    private final static QName _EmployeeImage_QNAME = new QName("urn:com.workday/bsvc", "Employee_Image");
    private final static QName _ReassignSuperiorToInactiveOrganizationRequest_QNAME = new QName("urn:com.workday/bsvc", "Reassign_Superior_to_Inactive_Organization_Request");
    private final static QName _GetCommitteeMembershipTypesResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Committee_Membership_Types_Response");
    private final static QName _BusinessSite_QNAME = new QName("urn:com.workday/bsvc", "Business_Site");
    private final static QName _GetWorkScheduleCalendarsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Work_Schedule_Calendars_Response");
    private final static QName _EditNamedProfessorshipResponse_QNAME = new QName("urn:com.workday/bsvc", "Edit_Named_Professorship_Response");
    private final static QName _PutAddressesForCountryFormatExtensionRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Addresses_for_Country_Format_Extension_Request");
    private final static QName _PutEthnicityResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Ethnicity_Response");
    private final static QName _ChangeOtherIDsResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Other_IDs_Response");
    private final static QName _GetDisabilitiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Disabilities_Request");
    private final static QName _ChangePreferredNameRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Preferred_Name_Request");
    private final static QName _PutDependentResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Dependent_Response");
    private final static QName _PutCommitteeTypeRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Committee_Type_Request");
    private final static QName _GetJobClassificationGroupsRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Job_Classification_Groups_Request");
    private final static QName _PutWorkScheduleCalendarRequest_QNAME = new QName("urn:com.workday/bsvc", "Put_Work_Schedule_Calendar_Request");
    private final static QName _ChangeGovernmentIDsRequest_QNAME = new QName("urn:com.workday/bsvc", "Change_Government_IDs_Request");
    private final static QName _EditAcademicAppointmentTrackAdditionalDataRequest_QNAME = new QName("urn:com.workday/bsvc", "Edit_Academic_Appointment_Track_Additional_Data_Request");
    private final static QName _GetUniversalIdentifiersRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Universal_Identifiers_Request");
    private final static QName _AcademicAppointmentResponse_QNAME = new QName("urn:com.workday/bsvc", "Academic_Appointment_Response");
    private final static QName _PutLocationHierarchyOrganizationAssignmentsResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Location_Hierarchy_Organization_Assignments_Response");
    private final static QName _GetAppointmentSpecialtiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Appointment_Specialties_Request");
    private final static QName _ChangeWorkContactInformationResponse_QNAME = new QName("urn:com.workday/bsvc", "Change_Work_Contact_Information_Response");
    private final static QName _PutJobCategoryResponse_QNAME = new QName("urn:com.workday/bsvc", "Put_Job_Category_Response");
    private final static QName _GetAssignUserBasedSecurityGroupsResponse_QNAME = new QName("urn:com.workday/bsvc", "Get_Assign_User-Based_Security_Groups_Response");
    private final static QName _GetSocialBenefitsLocalitiesRequest_QNAME = new QName("urn:com.workday/bsvc", "Get_Social_Benefits_Localities_Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.workday.sources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDifficultyToFillResponseType }
     * 
     */
    public GetDifficultyToFillResponseType createGetDifficultyToFillResponseType() {
        return new GetDifficultyToFillResponseType();
    }

    /**
     * Create an instance of {@link PutAcademicUnitResponseType }
     * 
     */
    public PutAcademicUnitResponseType createPutAcademicUnitResponseType() {
        return new PutAcademicUnitResponseType();
    }

    /**
     * Create an instance of {@link GetFormerWorkerDocumentsRequestType }
     * 
     */
    public GetFormerWorkerDocumentsRequestType createGetFormerWorkerDocumentsRequestType() {
        return new GetFormerWorkerDocumentsRequestType();
    }

    /**
     * Create an instance of {@link PutAcademicRankResponseType }
     * 
     */
    public PutAcademicRankResponseType createPutAcademicRankResponseType() {
        return new PutAcademicRankResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeClassificationsRequestType }
     * 
     */
    public GetCommitteeClassificationsRequestType createGetCommitteeClassificationsRequestType() {
        return new GetCommitteeClassificationsRequestType();
    }

    /**
     * Create an instance of {@link PutSexualOrientationResponseType }
     * 
     */
    public PutSexualOrientationResponseType createPutSexualOrientationResponseType() {
        return new PutSexualOrientationResponseType();
    }

    /**
     * Create an instance of {@link GetChangeGovernmentIDsResponseType }
     * 
     */
    public GetChangeGovernmentIDsResponseType createGetChangeGovernmentIDsResponseType() {
        return new GetChangeGovernmentIDsResponseType();
    }

    /**
     * Create an instance of {@link ContingentWorkerGetType }
     * 
     */
    public ContingentWorkerGetType createContingentWorkerGetType() {
        return new ContingentWorkerGetType();
    }

    /**
     * Create an instance of {@link GetJobClassificationGroupsResponseType }
     * 
     */
    public GetJobClassificationGroupsResponseType createGetJobClassificationGroupsResponseType() {
        return new GetJobClassificationGroupsResponseType();
    }

    /**
     * Create an instance of {@link ChangeWorkContactInformationRequestType }
     * 
     */
    public ChangeWorkContactInformationRequestType createChangeWorkContactInformationRequestType() {
        return new ChangeWorkContactInformationRequestType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDsResponseType }
     * 
     */
    public ChangeGovernmentIDsResponseType createChangeGovernmentIDsResponseType() {
        return new ChangeGovernmentIDsResponseType();
    }

    /**
     * Create an instance of {@link GetAppointmentSpecialtiesResponseType }
     * 
     */
    public GetAppointmentSpecialtiesResponseType createGetAppointmentSpecialtiesResponseType() {
        return new GetAppointmentSpecialtiesResponseType();
    }

    /**
     * Create an instance of {@link PutWorkersCompensationCodeResponseType }
     * 
     */
    public PutWorkersCompensationCodeResponseType createPutWorkersCompensationCodeResponseType() {
        return new PutWorkersCompensationCodeResponseType();
    }

    /**
     * Create an instance of {@link GetChangeGovernmentIDsRequestType }
     * 
     */
    public GetChangeGovernmentIDsRequestType createGetChangeGovernmentIDsRequestType() {
        return new GetChangeGovernmentIDsRequestType();
    }

    /**
     * Create an instance of {@link ReassignSuperiorToInactiveOrganizationResponseType }
     * 
     */
    public ReassignSuperiorToInactiveOrganizationResponseType createReassignSuperiorToInactiveOrganizationResponseType() {
        return new ReassignSuperiorToInactiveOrganizationResponseType();
    }

    /**
     * Create an instance of {@link PutFrequencyRequestType }
     * 
     */
    public PutFrequencyRequestType createPutFrequencyRequestType() {
        return new PutFrequencyRequestType();
    }

    /**
     * Create an instance of {@link PutWorkerPhotoResponseType }
     * 
     */
    public PutWorkerPhotoResponseType createPutWorkerPhotoResponseType() {
        return new PutWorkerPhotoResponseType();
    }

    /**
     * Create an instance of {@link PutDifficultyToFillRequestType }
     * 
     */
    public PutDifficultyToFillRequestType createPutDifficultyToFillRequestType() {
        return new PutDifficultyToFillRequestType();
    }

    /**
     * Create an instance of {@link GetLocationsResponseType }
     * 
     */
    public GetLocationsResponseType createGetLocationsResponseType() {
        return new GetLocationsResponseType();
    }

    /**
     * Create an instance of {@link PutJobClassificationGroupRequestType }
     * 
     */
    public PutJobClassificationGroupRequestType createPutJobClassificationGroupRequestType() {
        return new PutJobClassificationGroupRequestType();
    }

    /**
     * Create an instance of {@link PutLocationAttributeRequestType }
     * 
     */
    public PutLocationAttributeRequestType createPutLocationAttributeRequestType() {
        return new PutLocationAttributeRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeClassificationGroupResponseType }
     * 
     */
    public PutCommitteeClassificationGroupResponseType createPutCommitteeClassificationGroupResponseType() {
        return new PutCommitteeClassificationGroupResponseType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceRootType }
     * 
     */
    public OrganizationReferenceRootType createOrganizationReferenceRootType() {
        return new OrganizationReferenceRootType();
    }

    /**
     * Create an instance of {@link EndCollectiveAgreementAssignmentEventResponseType }
     * 
     */
    public EndCollectiveAgreementAssignmentEventResponseType createEndCollectiveAgreementAssignmentEventResponseType() {
        return new EndCollectiveAgreementAssignmentEventResponseType();
    }

    /**
     * Create an instance of {@link GetGenderIdentitiesResponseType }
     * 
     */
    public GetGenderIdentitiesResponseType createGetGenderIdentitiesResponseType() {
        return new GetGenderIdentitiesResponseType();
    }

    /**
     * Create an instance of {@link PutPeriodReportingCalendarResponseType }
     * 
     */
    public PutPeriodReportingCalendarResponseType createPutPeriodReportingCalendarResponseType() {
        return new PutPeriodReportingCalendarResponseType();
    }

    /**
     * Create an instance of {@link GetPronounsResponseType }
     * 
     */
    public GetPronounsResponseType createGetPronounsResponseType() {
        return new GetPronounsResponseType();
    }

    /**
     * Create an instance of {@link GetChangeWorkContactInformationResponseType }
     * 
     */
    public GetChangeWorkContactInformationResponseType createGetChangeWorkContactInformationResponseType() {
        return new GetChangeWorkContactInformationResponseType();
    }

    /**
     * Create an instance of {@link GetOrganizationReferenceIDsResponseType }
     * 
     */
    public GetOrganizationReferenceIDsResponseType createGetOrganizationReferenceIDsResponseType() {
        return new GetOrganizationReferenceIDsResponseType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupsResponseType }
     * 
     */
    public ProvisioningGroupsResponseType createProvisioningGroupsResponseType() {
        return new ProvisioningGroupsResponseType();
    }

    /**
     * Create an instance of {@link GetAcademicAppointmentTrackAdditionalDataRequestType }
     * 
     */
    public GetAcademicAppointmentTrackAdditionalDataRequestType createGetAcademicAppointmentTrackAdditionalDataRequestType() {
        return new GetAcademicAppointmentTrackAdditionalDataRequestType();
    }

    /**
     * Create an instance of {@link EmployeePersonalInfoUpdateType }
     * 
     */
    public EmployeePersonalInfoUpdateType createEmployeePersonalInfoUpdateType() {
        return new EmployeePersonalInfoUpdateType();
    }

    /**
     * Create an instance of {@link PutFormerWorkerDocumentResponseType }
     * 
     */
    public PutFormerWorkerDocumentResponseType createPutFormerWorkerDocumentResponseType() {
        return new PutFormerWorkerDocumentResponseType();
    }

    /**
     * Create an instance of {@link PutLocationHierarchyOrganizationAssignmentsRequestType }
     * 
     */
    public PutLocationHierarchyOrganizationAssignmentsRequestType createPutLocationHierarchyOrganizationAssignmentsRequestType() {
        return new PutLocationHierarchyOrganizationAssignmentsRequestType();
    }

    /**
     * Create an instance of {@link GetAcademicUnitHierarchiesResponseType }
     * 
     */
    public GetAcademicUnitHierarchiesResponseType createGetAcademicUnitHierarchiesResponseType() {
        return new GetAcademicUnitHierarchiesResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeDefinitionResponseType }
     * 
     */
    public GetCommitteeDefinitionResponseType createGetCommitteeDefinitionResponseType() {
        return new GetCommitteeDefinitionResponseType();
    }

    /**
     * Create an instance of {@link GetWorkerPhotosResponseType }
     * 
     */
    public GetWorkerPhotosResponseType createGetWorkerPhotosResponseType() {
        return new GetWorkerPhotosResponseType();
    }

    /**
     * Create an instance of {@link GetPoliticalAffiliationsRequestType }
     * 
     */
    public GetPoliticalAffiliationsRequestType createGetPoliticalAffiliationsRequestType() {
        return new GetPoliticalAffiliationsRequestType();
    }

    /**
     * Create an instance of {@link BusinessSiteFindType }
     * 
     */
    public BusinessSiteFindType createBusinessSiteFindType() {
        return new BusinessSiteFindType();
    }

    /**
     * Create an instance of {@link EndCollectiveAgreementAssignmentEventRequestType }
     * 
     */
    public EndCollectiveAgreementAssignmentEventRequestType createEndCollectiveAgreementAssignmentEventRequestType() {
        return new EndCollectiveAgreementAssignmentEventRequestType();
    }

    /**
     * Create an instance of {@link ChangeHomeContactInformationResponseType }
     * 
     */
    public ChangeHomeContactInformationResponseType createChangeHomeContactInformationResponseType() {
        return new ChangeHomeContactInformationResponseType();
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link ManageUnionMembershipResponseType }
     * 
     */
    public ManageUnionMembershipResponseType createManageUnionMembershipResponseType() {
        return new ManageUnionMembershipResponseType();
    }

    /**
     * Create an instance of {@link GetTrainingTypesRequestType }
     * 
     */
    public GetTrainingTypesRequestType createGetTrainingTypesRequestType() {
        return new GetTrainingTypesRequestType();
    }

    /**
     * Create an instance of {@link PutOrganizationAssignmentRestrictionsRequestType }
     * 
     */
    public PutOrganizationAssignmentRestrictionsRequestType createPutOrganizationAssignmentRestrictionsRequestType() {
        return new PutOrganizationAssignmentRestrictionsRequestType();
    }

    /**
     * Create an instance of {@link BusinessSiteGetType }
     * 
     */
    public BusinessSiteGetType createBusinessSiteGetType() {
        return new BusinessSiteGetType();
    }

    /**
     * Create an instance of {@link PutAcademicUnitRequestType }
     * 
     */
    public PutAcademicUnitRequestType createPutAcademicUnitRequestType() {
        return new PutAcademicUnitRequestType();
    }

    /**
     * Create an instance of {@link PutHolidayCalendarRequestType }
     * 
     */
    public PutHolidayCalendarRequestType createPutHolidayCalendarRequestType() {
        return new PutHolidayCalendarRequestType();
    }

    /**
     * Create an instance of {@link PutLocationRequestType }
     * 
     */
    public PutLocationRequestType createPutLocationRequestType() {
        return new PutLocationRequestType();
    }

    /**
     * Create an instance of {@link PutOrganizationReferenceIDResponseType }
     * 
     */
    public PutOrganizationReferenceIDResponseType createPutOrganizationReferenceIDResponseType() {
        return new PutOrganizationReferenceIDResponseType();
    }

    /**
     * Create an instance of {@link PutAssignUserBasedSecurityGroupsResponseType }
     * 
     */
    public PutAssignUserBasedSecurityGroupsResponseType createPutAssignUserBasedSecurityGroupsResponseType() {
        return new PutAssignUserBasedSecurityGroupsResponseType();
    }

    /**
     * Create an instance of {@link GetExternalDisabilitySelfIdentificationRecordsRequestType }
     * 
     */
    public GetExternalDisabilitySelfIdentificationRecordsRequestType createGetExternalDisabilitySelfIdentificationRecordsRequestType() {
        return new GetExternalDisabilitySelfIdentificationRecordsRequestType();
    }

    /**
     * Create an instance of {@link PutProvisioningGroupResponseType }
     * 
     */
    public PutProvisioningGroupResponseType createPutProvisioningGroupResponseType() {
        return new PutProvisioningGroupResponseType();
    }

    /**
     * Create an instance of {@link PutSearchSettingsResponseType }
     * 
     */
    public PutSearchSettingsResponseType createPutSearchSettingsResponseType() {
        return new PutSearchSettingsResponseType();
    }

    /**
     * Create an instance of {@link PutServiceCenterRepresentativeRequestType }
     * 
     */
    public PutServiceCenterRepresentativeRequestType createPutServiceCenterRepresentativeRequestType() {
        return new PutServiceCenterRepresentativeRequestType();
    }

    /**
     * Create an instance of {@link GetLocationsRequestType }
     * 
     */
    public GetLocationsRequestType createGetLocationsRequestType() {
        return new GetLocationsRequestType();
    }

    /**
     * Create an instance of {@link PutJobCategoryRequestType }
     * 
     */
    public PutJobCategoryRequestType createPutJobCategoryRequestType() {
        return new PutJobCategoryRequestType();
    }

    /**
     * Create an instance of {@link GetPreferredCommunicationLanguageResponseType }
     * 
     */
    public GetPreferredCommunicationLanguageResponseType createGetPreferredCommunicationLanguageResponseType() {
        return new GetPreferredCommunicationLanguageResponseType();
    }

    /**
     * Create an instance of {@link EmployeeEmploymentInfoType }
     * 
     */
    public EmployeeEmploymentInfoType createEmployeeEmploymentInfoType() {
        return new EmployeeEmploymentInfoType();
    }

    /**
     * Create an instance of {@link PutExternalDisabilitySelfIdentificationRecordResponseType }
     * 
     */
    public PutExternalDisabilitySelfIdentificationRecordResponseType createPutExternalDisabilitySelfIdentificationRecordResponseType() {
        return new PutExternalDisabilitySelfIdentificationRecordResponseType();
    }

    /**
     * Create an instance of {@link GetDifficultyToFillRequestType }
     * 
     */
    public GetDifficultyToFillRequestType createGetDifficultyToFillRequestType() {
        return new GetDifficultyToFillRequestType();
    }

    /**
     * Create an instance of {@link PutServiceCenterRepresentativeWorkdayAccountRequestType }
     * 
     */
    public PutServiceCenterRepresentativeWorkdayAccountRequestType createPutServiceCenterRepresentativeWorkdayAccountRequestType() {
        return new PutServiceCenterRepresentativeWorkdayAccountRequestType();
    }

    /**
     * Create an instance of {@link OrganizationAddUpdateType }
     * 
     */
    public OrganizationAddUpdateType createOrganizationAddUpdateType() {
        return new OrganizationAddUpdateType();
    }

    /**
     * Create an instance of {@link PutOrganizationReferenceIDRequestType }
     * 
     */
    public PutOrganizationReferenceIDRequestType createPutOrganizationReferenceIDRequestType() {
        return new PutOrganizationReferenceIDRequestType();
    }

    /**
     * Create an instance of {@link PutFormerWorkerDocumentRequestType }
     * 
     */
    public PutFormerWorkerDocumentRequestType createPutFormerWorkerDocumentRequestType() {
        return new PutFormerWorkerDocumentRequestType();
    }

    /**
     * Create an instance of {@link ChangePersonalInformationResponseType }
     * 
     */
    public ChangePersonalInformationResponseType createChangePersonalInformationResponseType() {
        return new ChangePersonalInformationResponseType();
    }

    /**
     * Create an instance of {@link GetChangeHomeContactInformationRequestType }
     * 
     */
    public GetChangeHomeContactInformationRequestType createGetChangeHomeContactInformationRequestType() {
        return new GetChangeHomeContactInformationRequestType();
    }

    /**
     * Create an instance of {@link PutDependentRequestType }
     * 
     */
    public PutDependentRequestType createPutDependentRequestType() {
        return new PutDependentRequestType();
    }

    /**
     * Create an instance of {@link GetPreviousSystemJobHistoryRequestType }
     * 
     */
    public GetPreviousSystemJobHistoryRequestType createGetPreviousSystemJobHistoryRequestType() {
        return new GetPreviousSystemJobHistoryRequestType();
    }

    /**
     * Create an instance of {@link ContingentWorkerContractInfoType }
     * 
     */
    public ContingentWorkerContractInfoType createContingentWorkerContractInfoType() {
        return new ContingentWorkerContractInfoType();
    }

    /**
     * Create an instance of {@link GetAcademicAppointmentTrackAdditionalDataResponseType }
     * 
     */
    public GetAcademicAppointmentTrackAdditionalDataResponseType createGetAcademicAppointmentTrackAdditionalDataResponseType() {
        return new GetAcademicAppointmentTrackAdditionalDataResponseType();
    }

    /**
     * Create an instance of {@link PutWorkersCompensationCodeRequestType }
     * 
     */
    public PutWorkersCompensationCodeRequestType createPutWorkersCompensationCodeRequestType() {
        return new PutWorkersCompensationCodeRequestType();
    }

    /**
     * Create an instance of {@link GetCommitteeClassificationGroupsResponseType }
     * 
     */
    public GetCommitteeClassificationGroupsResponseType createGetCommitteeClassificationGroupsResponseType() {
        return new GetCommitteeClassificationGroupsResponseType();
    }

    /**
     * Create an instance of {@link ChangeBusinessTitleResponseType }
     * 
     */
    public ChangeBusinessTitleResponseType createChangeBusinessTitleResponseType() {
        return new ChangeBusinessTitleResponseType();
    }

    /**
     * Create an instance of {@link PutSocialBenefitsLocalityResponseType }
     * 
     */
    public PutSocialBenefitsLocalityResponseType createPutSocialBenefitsLocalityResponseType() {
        return new PutSocialBenefitsLocalityResponseType();
    }

    /**
     * Create an instance of {@link PutExternalDisabilitySelfIdentificationRecordRequestType }
     * 
     */
    public PutExternalDisabilitySelfIdentificationRecordRequestType createPutExternalDisabilitySelfIdentificationRecordRequestType() {
        return new PutExternalDisabilitySelfIdentificationRecordRequestType();
    }

    /**
     * Create an instance of {@link PutAcademicRankRequestType }
     * 
     */
    public PutAcademicRankRequestType createPutAcademicRankRequestType() {
        return new PutAcademicRankRequestType();
    }

    /**
     * Create an instance of {@link PutWorkStatusRuleSetRequestType }
     * 
     */
    public PutWorkStatusRuleSetRequestType createPutWorkStatusRuleSetRequestType() {
        return new PutWorkStatusRuleSetRequestType();
    }

    /**
     * Create an instance of {@link CreateNamedProfessorshipRequestType }
     * 
     */
    public CreateNamedProfessorshipRequestType createCreateNamedProfessorshipRequestType() {
        return new CreateNamedProfessorshipRequestType();
    }

    /**
     * Create an instance of {@link GetJobFamilyGroupsRequestType }
     * 
     */
    public GetJobFamilyGroupsRequestType createGetJobFamilyGroupsRequestType() {
        return new GetJobFamilyGroupsRequestType();
    }

    /**
     * Create an instance of {@link ProcessingFaultType }
     * 
     */
    public ProcessingFaultType createProcessingFaultType() {
        return new ProcessingFaultType();
    }

    /**
     * Create an instance of {@link PutAppointmentSpecialtyResponseType }
     * 
     */
    public PutAppointmentSpecialtyResponseType createPutAppointmentSpecialtyResponseType() {
        return new PutAppointmentSpecialtyResponseType();
    }

    /**
     * Create an instance of {@link GetCompanyInsiderTypesResponseType }
     * 
     */
    public GetCompanyInsiderTypesResponseType createGetCompanyInsiderTypesResponseType() {
        return new GetCompanyInsiderTypesResponseType();
    }

    /**
     * Create an instance of {@link PutAcademicUnitHierarchyRequestType }
     * 
     */
    public PutAcademicUnitHierarchyRequestType createPutAcademicUnitHierarchyRequestType() {
        return new PutAcademicUnitHierarchyRequestType();
    }

    /**
     * Create an instance of {@link ChangeEmergencyContactsResponseType }
     * 
     */
    public ChangeEmergencyContactsResponseType createChangeEmergencyContactsResponseType() {
        return new ChangeEmergencyContactsResponseType();
    }

    /**
     * Create an instance of {@link ServerTimestampGetType }
     * 
     */
    public ServerTimestampGetType createServerTimestampGetType() {
        return new ServerTimestampGetType();
    }

    /**
     * Create an instance of {@link GetHolidayCalendarsRequestType }
     * 
     */
    public GetHolidayCalendarsRequestType createGetHolidayCalendarsRequestType() {
        return new GetHolidayCalendarsRequestType();
    }

    /**
     * Create an instance of {@link GetJobCategoriesResponseType }
     * 
     */
    public GetJobCategoriesResponseType createGetJobCategoriesResponseType() {
        return new GetJobCategoriesResponseType();
    }

    /**
     * Create an instance of {@link PutUniversalIdentifierRequestType }
     * 
     */
    public PutUniversalIdentifierRequestType createPutUniversalIdentifierRequestType() {
        return new PutUniversalIdentifierRequestType();
    }

    /**
     * Create an instance of {@link WorkdayAccountForWorkerAddType }
     * 
     */
    public WorkdayAccountForWorkerAddType createWorkdayAccountForWorkerAddType() {
        return new WorkdayAccountForWorkerAddType();
    }

    /**
     * Create an instance of {@link PutOrganizationAssignmentRestrictionsResponseType }
     * 
     */
    public PutOrganizationAssignmentRestrictionsResponseType createPutOrganizationAssignmentRestrictionsResponseType() {
        return new PutOrganizationAssignmentRestrictionsResponseType();
    }

    /**
     * Create an instance of {@link PutWorkerPhotoRequestType }
     * 
     */
    public PutWorkerPhotoRequestType createPutWorkerPhotoRequestType() {
        return new PutWorkerPhotoRequestType();
    }

    /**
     * Create an instance of {@link ChangeLicensesResponseType }
     * 
     */
    public ChangeLicensesResponseType createChangeLicensesResponseType() {
        return new ChangeLicensesResponseType();
    }

    /**
     * Create an instance of {@link EmployeeGetType }
     * 
     */
    public EmployeeGetType createEmployeeGetType() {
        return new EmployeeGetType();
    }

    /**
     * Create an instance of {@link OrganizationGetType }
     * 
     */
    public OrganizationGetType createOrganizationGetType() {
        return new OrganizationGetType();
    }

    /**
     * Create an instance of {@link PutPoliticalAffiliationResponseType }
     * 
     */
    public PutPoliticalAffiliationResponseType createPutPoliticalAffiliationResponseType() {
        return new PutPoliticalAffiliationResponseType();
    }

    /**
     * Create an instance of {@link PutSexualOrientationRequestType }
     * 
     */
    public PutSexualOrientationRequestType createPutSexualOrientationRequestType() {
        return new PutSexualOrientationRequestType();
    }

    /**
     * Create an instance of {@link AssignEstablishmentResponseType }
     * 
     */
    public AssignEstablishmentResponseType createAssignEstablishmentResponseType() {
        return new AssignEstablishmentResponseType();
    }

    /**
     * Create an instance of {@link ContingentWorkerPersonalInfoGetType }
     * 
     */
    public ContingentWorkerPersonalInfoGetType createContingentWorkerPersonalInfoGetType() {
        return new ContingentWorkerPersonalInfoGetType();
    }

    /**
     * Create an instance of {@link GetCommitteeMembershipTypesRequestType }
     * 
     */
    public GetCommitteeMembershipTypesRequestType createGetCommitteeMembershipTypesRequestType() {
        return new GetCommitteeMembershipTypesRequestType();
    }

    /**
     * Create an instance of {@link PutAcademicUnitHierarchyResponseType }
     * 
     */
    public PutAcademicUnitHierarchyResponseType createPutAcademicUnitHierarchyResponseType() {
        return new PutAcademicUnitHierarchyResponseType();
    }

    /**
     * Create an instance of {@link EmployeeEmploymentInfoGetType }
     * 
     */
    public EmployeeEmploymentInfoGetType createEmployeeEmploymentInfoGetType() {
        return new EmployeeEmploymentInfoGetType();
    }

    /**
     * Create an instance of {@link PutJobFamilyRequestType }
     * 
     */
    public PutJobFamilyRequestType createPutJobFamilyRequestType() {
        return new PutJobFamilyRequestType();
    }

    /**
     * Create an instance of {@link ChangeBusinessTitleRequestType }
     * 
     */
    public ChangeBusinessTitleRequestType createChangeBusinessTitleRequestType() {
        return new ChangeBusinessTitleRequestType();
    }

    /**
     * Create an instance of {@link GetAcademicRanksResponseType }
     * 
     */
    public GetAcademicRanksResponseType createGetAcademicRanksResponseType() {
        return new GetAcademicRanksResponseType();
    }

    /**
     * Create an instance of {@link EmployeePersonalInfoType }
     * 
     */
    public EmployeePersonalInfoType createEmployeePersonalInfoType() {
        return new EmployeePersonalInfoType();
    }

    /**
     * Create an instance of {@link GetDisabilitiesResponseType }
     * 
     */
    public GetDisabilitiesResponseType createGetDisabilitiesResponseType() {
        return new GetDisabilitiesResponseType();
    }

    /**
     * Create an instance of {@link PutPronounResponseType }
     * 
     */
    public PutPronounResponseType createPutPronounResponseType() {
        return new PutPronounResponseType();
    }

    /**
     * Create an instance of {@link GetWorkStatusRuleSetsRequestType }
     * 
     */
    public GetWorkStatusRuleSetsRequestType createGetWorkStatusRuleSetsRequestType() {
        return new GetWorkStatusRuleSetsRequestType();
    }

    /**
     * Create an instance of {@link GetAcademicUnitHierarchiesRequestType }
     * 
     */
    public GetAcademicUnitHierarchiesRequestType createGetAcademicUnitHierarchiesRequestType() {
        return new GetAcademicUnitHierarchiesRequestType();
    }

    /**
     * Create an instance of {@link ChangeVeteranStatusIdentificationRequestType }
     * 
     */
    public ChangeVeteranStatusIdentificationRequestType createChangeVeteranStatusIdentificationRequestType() {
        return new ChangeVeteranStatusIdentificationRequestType();
    }

    /**
     * Create an instance of {@link OrganizationFindType }
     * 
     */
    public OrganizationFindType createOrganizationFindType() {
        return new OrganizationFindType();
    }

    /**
     * Create an instance of {@link EmployeeImageUpdateType }
     * 
     */
    public EmployeeImageUpdateType createEmployeeImageUpdateType() {
        return new EmployeeImageUpdateType();
    }

    /**
     * Create an instance of {@link PutLocationResponseType }
     * 
     */
    public PutLocationResponseType createPutLocationResponseType() {
        return new PutLocationResponseType();
    }

    /**
     * Create an instance of {@link PutProvisioningGroupAssignmentRequestType }
     * 
     */
    public PutProvisioningGroupAssignmentRequestType createPutProvisioningGroupAssignmentRequestType() {
        return new PutProvisioningGroupAssignmentRequestType();
    }

    /**
     * Create an instance of {@link PutPronounRequestType }
     * 
     */
    public PutPronounRequestType createPutPronounRequestType() {
        return new PutPronounRequestType();
    }

    /**
     * Create an instance of {@link GetServiceCenterRepresentativesResponseType }
     * 
     */
    public GetServiceCenterRepresentativesResponseType createGetServiceCenterRepresentativesResponseType() {
        return new GetServiceCenterRepresentativesResponseType();
    }

    /**
     * Create an instance of {@link ManageCommitteeMembershipRequestType }
     * 
     */
    public ManageCommitteeMembershipRequestType createManageCommitteeMembershipRequestType() {
        return new ManageCommitteeMembershipRequestType();
    }

    /**
     * Create an instance of {@link GetJobProfilesRequestType }
     * 
     */
    public GetJobProfilesRequestType createGetJobProfilesRequestType() {
        return new GetJobProfilesRequestType();
    }

    /**
     * Create an instance of {@link PutJobProfileRequestType }
     * 
     */
    public PutJobProfileRequestType createPutJobProfileRequestType() {
        return new PutJobProfileRequestType();
    }

    /**
     * Create an instance of {@link PutJobFamilyResponseType }
     * 
     */
    public PutJobFamilyResponseType createPutJobFamilyResponseType() {
        return new PutJobFamilyResponseType();
    }

    /**
     * Create an instance of {@link AssignMembersToCustomOrganizationRequestType }
     * 
     */
    public AssignMembersToCustomOrganizationRequestType createAssignMembersToCustomOrganizationRequestType() {
        return new AssignMembersToCustomOrganizationRequestType();
    }

    /**
     * Create an instance of {@link ManageCommitteeMembershipResponseType }
     * 
     */
    public ManageCommitteeMembershipResponseType createManageCommitteeMembershipResponseType() {
        return new ManageCommitteeMembershipResponseType();
    }

    /**
     * Create an instance of {@link GetFrequenciesRequestType }
     * 
     */
    public GetFrequenciesRequestType createGetFrequenciesRequestType() {
        return new GetFrequenciesRequestType();
    }

    /**
     * Create an instance of {@link GetJobFamiliesRequestType }
     * 
     */
    public GetJobFamiliesRequestType createGetJobFamiliesRequestType() {
        return new GetJobFamiliesRequestType();
    }

    /**
     * Create an instance of {@link WorkerEventHistoryGetType }
     * 
     */
    public WorkerEventHistoryGetType createWorkerEventHistoryGetType() {
        return new WorkerEventHistoryGetType();
    }

    /**
     * Create an instance of {@link GetWorkersRequestType }
     * 
     */
    public GetWorkersRequestType createGetWorkersRequestType() {
        return new GetWorkersRequestType();
    }

    /**
     * Create an instance of {@link GetFormerWorkerDocumentsResponseType }
     * 
     */
    public GetFormerWorkerDocumentsResponseType createGetFormerWorkerDocumentsResponseType() {
        return new GetFormerWorkerDocumentsResponseType();
    }

    /**
     * Create an instance of {@link PutGenderIdentityResponseType }
     * 
     */
    public PutGenderIdentityResponseType createPutGenderIdentityResponseType() {
        return new PutGenderIdentityResponseType();
    }

    /**
     * Create an instance of {@link PutPreferredCommunicationLanguageResponseType }
     * 
     */
    public PutPreferredCommunicationLanguageResponseType createPutPreferredCommunicationLanguageResponseType() {
        return new PutPreferredCommunicationLanguageResponseType();
    }

    /**
     * Create an instance of {@link PutWorkScheduleCalendarResponseType }
     * 
     */
    public PutWorkScheduleCalendarResponseType createPutWorkScheduleCalendarResponseType() {
        return new PutWorkScheduleCalendarResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeMeetingsRequestType }
     * 
     */
    public GetCommitteeMeetingsRequestType createGetCommitteeMeetingsRequestType() {
        return new GetCommitteeMeetingsRequestType();
    }

    /**
     * Create an instance of {@link ChangeWorkSpaceResponseType }
     * 
     */
    public ChangeWorkSpaceResponseType createChangeWorkSpaceResponseType() {
        return new ChangeWorkSpaceResponseType();
    }

    /**
     * Create an instance of {@link GetWorkersCompensationCodesRequestType }
     * 
     */
    public GetWorkersCompensationCodesRequestType createGetWorkersCompensationCodesRequestType() {
        return new GetWorkersCompensationCodesRequestType();
    }

    /**
     * Create an instance of {@link ContingentWorkerContractInfoGetType }
     * 
     */
    public ContingentWorkerContractInfoGetType createContingentWorkerContractInfoGetType() {
        return new ContingentWorkerContractInfoGetType();
    }

    /**
     * Create an instance of {@link MaintainContactInformationForPersonEventResponseType }
     * 
     */
    public MaintainContactInformationForPersonEventResponseType createMaintainContactInformationForPersonEventResponseType() {
        return new MaintainContactInformationForPersonEventResponseType();
    }

    /**
     * Create an instance of {@link GetFrequenciesResponseType }
     * 
     */
    public GetFrequenciesResponseType createGetFrequenciesResponseType() {
        return new GetFrequenciesResponseType();
    }

    /**
     * Create an instance of {@link GetJobProfilesResponseType }
     * 
     */
    public GetJobProfilesResponseType createGetJobProfilesResponseType() {
        return new GetJobProfilesResponseType();
    }

    /**
     * Create an instance of {@link GetEthnicitiesRequestType }
     * 
     */
    public GetEthnicitiesRequestType createGetEthnicitiesRequestType() {
        return new GetEthnicitiesRequestType();
    }

    /**
     * Create an instance of {@link EmployeeImageGetType }
     * 
     */
    public EmployeeImageGetType createEmployeeImageGetType() {
        return new EmployeeImageGetType();
    }

    /**
     * Create an instance of {@link GetAssignUserBasedSecurityGroupsRequestType }
     * 
     */
    public GetAssignUserBasedSecurityGroupsRequestType createGetAssignUserBasedSecurityGroupsRequestType() {
        return new GetAssignUserBasedSecurityGroupsRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeMeetingResponseType }
     * 
     */
    public PutCommitteeMeetingResponseType createPutCommitteeMeetingResponseType() {
        return new PutCommitteeMeetingResponseType();
    }

    /**
     * Create an instance of {@link OrganizationReferencesRootType }
     * 
     */
    public OrganizationReferencesRootType createOrganizationReferencesRootType() {
        return new OrganizationReferencesRootType();
    }

    /**
     * Create an instance of {@link PutServiceCenterRepresentativeWorkdayAccountResponseType }
     * 
     */
    public PutServiceCenterRepresentativeWorkdayAccountResponseType createPutServiceCenterRepresentativeWorkdayAccountResponseType() {
        return new PutServiceCenterRepresentativeWorkdayAccountResponseType();
    }

    /**
     * Create an instance of {@link PutProvisioningGroupAssignmentResponseType }
     * 
     */
    public PutProvisioningGroupAssignmentResponseType createPutProvisioningGroupAssignmentResponseType() {
        return new PutProvisioningGroupAssignmentResponseType();
    }

    /**
     * Create an instance of {@link PutEstablishmentResponseType }
     * 
     */
    public PutEstablishmentResponseType createPutEstablishmentResponseType() {
        return new PutEstablishmentResponseType();
    }

    /**
     * Create an instance of {@link GetServiceCenterRepresentativeWorkdayAccountsRequestType }
     * 
     */
    public GetServiceCenterRepresentativeWorkdayAccountsRequestType createGetServiceCenterRepresentativeWorkdayAccountsRequestType() {
        return new GetServiceCenterRepresentativeWorkdayAccountsRequestType();
    }

    /**
     * Create an instance of {@link PutJobClassificationGroupResponseType }
     * 
     */
    public PutJobClassificationGroupResponseType createPutJobClassificationGroupResponseType() {
        return new PutJobClassificationGroupResponseType();
    }

    /**
     * Create an instance of {@link PutPreviousSystemJobHistoryRequestType }
     * 
     */
    public PutPreviousSystemJobHistoryRequestType createPutPreviousSystemJobHistoryRequestType() {
        return new PutPreviousSystemJobHistoryRequestType();
    }

    /**
     * Create an instance of {@link PutFrequencyResponseType }
     * 
     */
    public PutFrequencyResponseType createPutFrequencyResponseType() {
        return new PutFrequencyResponseType();
    }

    /**
     * Create an instance of {@link WorkdayAccountForWorkerUpdateType }
     * 
     */
    public WorkdayAccountForWorkerUpdateType createWorkdayAccountForWorkerUpdateType() {
        return new WorkdayAccountForWorkerUpdateType();
    }

    /**
     * Create an instance of {@link PutLGBTIdentificationResponseType }
     * 
     */
    public PutLGBTIdentificationResponseType createPutLGBTIdentificationResponseType() {
        return new PutLGBTIdentificationResponseType();
    }

    /**
     * Create an instance of {@link GetWorkersResponseRootType }
     * 
     */
    public GetWorkersResponseRootType createGetWorkersResponseRootType() {
        return new GetWorkersResponseRootType();
    }

    /**
     * Create an instance of {@link ChangeEmergencyContactsRequestType }
     * 
     */
    public ChangeEmergencyContactsRequestType createChangeEmergencyContactsRequestType() {
        return new ChangeEmergencyContactsRequestType();
    }

    /**
     * Create an instance of {@link GetCommitteeDefinitionRequestType }
     * 
     */
    public GetCommitteeDefinitionRequestType createGetCommitteeDefinitionRequestType() {
        return new GetCommitteeDefinitionRequestType();
    }

    /**
     * Create an instance of {@link PutPoliticalAffiliationRequestType }
     * 
     */
    public PutPoliticalAffiliationRequestType createPutPoliticalAffiliationRequestType() {
        return new PutPoliticalAffiliationRequestType();
    }

    /**
     * Create an instance of {@link GetEstablishmentsRequestType }
     * 
     */
    public GetEstablishmentsRequestType createGetEstablishmentsRequestType() {
        return new GetEstablishmentsRequestType();
    }

    /**
     * Create an instance of {@link WorkerProfileGetType }
     * 
     */
    public WorkerProfileGetType createWorkerProfileGetType() {
        return new WorkerProfileGetType();
    }

    /**
     * Create an instance of {@link ContingentWorkerType }
     * 
     */
    public ContingentWorkerType createContingentWorkerType() {
        return new ContingentWorkerType();
    }

    /**
     * Create an instance of {@link ReactivateOrganizationResponseType }
     * 
     */
    public ReactivateOrganizationResponseType createReactivateOrganizationResponseType() {
        return new ReactivateOrganizationResponseType();
    }

    /**
     * Create an instance of {@link GetAcademicAppointeeRequestType }
     * 
     */
    public GetAcademicAppointeeRequestType createGetAcademicAppointeeRequestType() {
        return new GetAcademicAppointeeRequestType();
    }

    /**
     * Create an instance of {@link PutProvisioningGroupRequestType }
     * 
     */
    public PutProvisioningGroupRequestType createPutProvisioningGroupRequestType() {
        return new PutProvisioningGroupRequestType();
    }

    /**
     * Create an instance of {@link ServerTimestampType }
     * 
     */
    public ServerTimestampType createServerTimestampType() {
        return new ServerTimestampType();
    }

    /**
     * Create an instance of {@link ChangePassportsAndVisasResponseType }
     * 
     */
    public ChangePassportsAndVisasResponseType createChangePassportsAndVisasResponseType() {
        return new ChangePassportsAndVisasResponseType();
    }

    /**
     * Create an instance of {@link AssignEmployeeCollectiveAgreementEventResponseType }
     * 
     */
    public AssignEmployeeCollectiveAgreementEventResponseType createAssignEmployeeCollectiveAgreementEventResponseType() {
        return new AssignEmployeeCollectiveAgreementEventResponseType();
    }

    /**
     * Create an instance of {@link PutServiceCenterRepresentativeResponseType }
     * 
     */
    public PutServiceCenterRepresentativeResponseType createPutServiceCenterRepresentativeResponseType() {
        return new PutServiceCenterRepresentativeResponseType();
    }

    /**
     * Create an instance of {@link WorkdayCommonHeaderType }
     * 
     */
    public WorkdayCommonHeaderType createWorkdayCommonHeaderType() {
        return new WorkdayCommonHeaderType();
    }

    /**
     * Create an instance of {@link PutHolidayCalendarResponseType }
     * 
     */
    public PutHolidayCalendarResponseType createPutHolidayCalendarResponseType() {
        return new PutHolidayCalendarResponseType();
    }

    /**
     * Create an instance of {@link GetLGBTIdentificationsResponseType }
     * 
     */
    public GetLGBTIdentificationsResponseType createGetLGBTIdentificationsResponseType() {
        return new GetLGBTIdentificationsResponseType();
    }

    /**
     * Create an instance of {@link PutCommitteeMeetingRequestType }
     * 
     */
    public PutCommitteeMeetingRequestType createPutCommitteeMeetingRequestType() {
        return new PutCommitteeMeetingRequestType();
    }

    /**
     * Create an instance of {@link GetSexualOrientationsResponseType }
     * 
     */
    public GetSexualOrientationsResponseType createGetSexualOrientationsResponseType() {
        return new GetSexualOrientationsResponseType();
    }

    /**
     * Create an instance of {@link PutUniversalIdentifierResponseType }
     * 
     */
    public PutUniversalIdentifierResponseType createPutUniversalIdentifierResponseType() {
        return new PutUniversalIdentifierResponseType();
    }

    /**
     * Create an instance of {@link GetOrganizationAssignmentRestrictionsResponseType }
     * 
     */
    public GetOrganizationAssignmentRestrictionsResponseType createGetOrganizationAssignmentRestrictionsResponseType() {
        return new GetOrganizationAssignmentRestrictionsResponseType();
    }

    /**
     * Create an instance of {@link PutLocationAttributeResponseType }
     * 
     */
    public PutLocationAttributeResponseType createPutLocationAttributeResponseType() {
        return new PutLocationAttributeResponseType();
    }

    /**
     * Create an instance of {@link GetAcademicUnitsResponseType }
     * 
     */
    public GetAcademicUnitsResponseType createGetAcademicUnitsResponseType() {
        return new GetAcademicUnitsResponseType();
    }

    /**
     * Create an instance of {@link CreateReferenceLetterForWorkerRequestType }
     * 
     */
    public CreateReferenceLetterForWorkerRequestType createCreateReferenceLetterForWorkerRequestType() {
        return new CreateReferenceLetterForWorkerRequestType();
    }

    /**
     * Create an instance of {@link GetOrganizationReferenceIDsRequestType }
     * 
     */
    public GetOrganizationReferenceIDsRequestType createGetOrganizationReferenceIDsRequestType() {
        return new GetOrganizationReferenceIDsRequestType();
    }

    /**
     * Create an instance of {@link AssignMembersToCustomOrganizationResponseType }
     * 
     */
    public AssignMembersToCustomOrganizationResponseType createAssignMembersToCustomOrganizationResponseType() {
        return new AssignMembersToCustomOrganizationResponseType();
    }

    /**
     * Create an instance of {@link PutWorkStatusRuleSetResponseType }
     * 
     */
    public PutWorkStatusRuleSetResponseType createPutWorkStatusRuleSetResponseType() {
        return new PutWorkStatusRuleSetResponseType();
    }

    /**
     * Create an instance of {@link GetEthnicitiesResponseType }
     * 
     */
    public GetEthnicitiesResponseType createGetEthnicitiesResponseType() {
        return new GetEthnicitiesResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeTypesResponseType }
     * 
     */
    public GetCommitteeTypesResponseType createGetCommitteeTypesResponseType() {
        return new GetCommitteeTypesResponseType();
    }

    /**
     * Create an instance of {@link GetOrganizationsRequestType }
     * 
     */
    public GetOrganizationsRequestType createGetOrganizationsRequestType() {
        return new GetOrganizationsRequestType();
    }

    /**
     * Create an instance of {@link PutImportProcessResponseType }
     * 
     */
    public PutImportProcessResponseType createPutImportProcessResponseType() {
        return new PutImportProcessResponseType();
    }

    /**
     * Create an instance of {@link ChangeOtherIDsRequestType }
     * 
     */
    public ChangeOtherIDsRequestType createChangeOtherIDsRequestType() {
        return new ChangeOtherIDsRequestType();
    }

    /**
     * Create an instance of {@link PutDisabilityRequestType }
     * 
     */
    public PutDisabilityRequestType createPutDisabilityRequestType() {
        return new PutDisabilityRequestType();
    }

    /**
     * Create an instance of {@link PutWorkShiftRequestType }
     * 
     */
    public PutWorkShiftRequestType createPutWorkShiftRequestType() {
        return new PutWorkShiftRequestType();
    }

    /**
     * Create an instance of {@link GetLocationAttributesResponseType }
     * 
     */
    public GetLocationAttributesResponseType createGetLocationAttributesResponseType() {
        return new GetLocationAttributesResponseType();
    }

    /**
     * Create an instance of {@link GetOrganizationAssignmentRestrictionsRequestType }
     * 
     */
    public GetOrganizationAssignmentRestrictionsRequestType createGetOrganizationAssignmentRestrictionsRequestType() {
        return new GetOrganizationAssignmentRestrictionsRequestType();
    }

    /**
     * Create an instance of {@link GetServiceCenterRepresentativeWorkdayAccountsResponseType }
     * 
     */
    public GetServiceCenterRepresentativeWorkdayAccountsResponseType createGetServiceCenterRepresentativeWorkdayAccountsResponseType() {
        return new GetServiceCenterRepresentativeWorkdayAccountsResponseType();
    }

    /**
     * Create an instance of {@link GetProvisioningGroupsRequestType }
     * 
     */
    public GetProvisioningGroupsRequestType createGetProvisioningGroupsRequestType() {
        return new GetProvisioningGroupsRequestType();
    }

    /**
     * Create an instance of {@link EditNamedProfessorshipRequestType }
     * 
     */
    public EditNamedProfessorshipRequestType createEditNamedProfessorshipRequestType() {
        return new EditNamedProfessorshipRequestType();
    }

    /**
     * Create an instance of {@link AddAcademicAppointmentRequestType }
     * 
     */
    public AddAcademicAppointmentRequestType createAddAcademicAppointmentRequestType() {
        return new AddAcademicAppointmentRequestType();
    }

    /**
     * Create an instance of {@link GetFormerWorkersRequestType }
     * 
     */
    public GetFormerWorkersRequestType createGetFormerWorkersRequestType() {
        return new GetFormerWorkersRequestType();
    }

    /**
     * Create an instance of {@link AssignEstablishmentRequestType }
     * 
     */
    public AssignEstablishmentRequestType createAssignEstablishmentRequestType() {
        return new AssignEstablishmentRequestType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountRequestType }
     * 
     */
    public GetWorkdayAccountRequestType createGetWorkdayAccountRequestType() {
        return new GetWorkdayAccountRequestType();
    }

    /**
     * Create an instance of {@link GetAcademicAppointeeResponseType }
     * 
     */
    public GetAcademicAppointeeResponseType createGetAcademicAppointeeResponseType() {
        return new GetAcademicAppointeeResponseType();
    }

    /**
     * Create an instance of {@link MaintainCommitteeDefinitionRequestType }
     * 
     */
    public MaintainCommitteeDefinitionRequestType createMaintainCommitteeDefinitionRequestType() {
        return new MaintainCommitteeDefinitionRequestType();
    }

    /**
     * Create an instance of {@link GetWorkerPhotosRequestType }
     * 
     */
    public GetWorkerPhotosRequestType createGetWorkerPhotosRequestType() {
        return new GetWorkerPhotosRequestType();
    }

    /**
     * Create an instance of {@link GetFormerWorkersResponseType }
     * 
     */
    public GetFormerWorkersResponseType createGetFormerWorkersResponseType() {
        return new GetFormerWorkersResponseType();
    }

    /**
     * Create an instance of {@link GetExternalDisabilitySelfIdentificationRecordsResponseType }
     * 
     */
    public GetExternalDisabilitySelfIdentificationRecordsResponseType createGetExternalDisabilitySelfIdentificationRecordsResponseType() {
        return new GetExternalDisabilitySelfIdentificationRecordsResponseType();
    }

    /**
     * Create an instance of {@link PutSocialBenefitsLocalityRequestType }
     * 
     */
    public PutSocialBenefitsLocalityRequestType createPutSocialBenefitsLocalityRequestType() {
        return new PutSocialBenefitsLocalityRequestType();
    }

    /**
     * Create an instance of {@link GetLocationHierarchyOrganizationAssignmentsResponseType }
     * 
     */
    public GetLocationHierarchyOrganizationAssignmentsResponseType createGetLocationHierarchyOrganizationAssignmentsResponseType() {
        return new GetLocationHierarchyOrganizationAssignmentsResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeClassificationGroupsRequestType }
     * 
     */
    public GetCommitteeClassificationGroupsRequestType createGetCommitteeClassificationGroupsRequestType() {
        return new GetCommitteeClassificationGroupsRequestType();
    }

    /**
     * Create an instance of {@link ChangeHomeContactInformationRequestType }
     * 
     */
    public ChangeHomeContactInformationRequestType createChangeHomeContactInformationRequestType() {
        return new ChangeHomeContactInformationRequestType();
    }

    /**
     * Create an instance of {@link ChangeLegalNameRequestType }
     * 
     */
    public ChangeLegalNameRequestType createChangeLegalNameRequestType() {
        return new ChangeLegalNameRequestType();
    }

    /**
     * Create an instance of {@link GetSocialBenefitsLocalitiesResponseType }
     * 
     */
    public GetSocialBenefitsLocalitiesResponseType createGetSocialBenefitsLocalitiesResponseType() {
        return new GetSocialBenefitsLocalitiesResponseType();
    }

    /**
     * Create an instance of {@link GetEstablishmentsResponseType }
     * 
     */
    public GetEstablishmentsResponseType createGetEstablishmentsResponseType() {
        return new GetEstablishmentsResponseType();
    }

    /**
     * Create an instance of {@link PutAssignUserBasedSecurityGroupRequestType }
     * 
     */
    public PutAssignUserBasedSecurityGroupRequestType createPutAssignUserBasedSecurityGroupRequestType() {
        return new PutAssignUserBasedSecurityGroupRequestType();
    }

    /**
     * Create an instance of {@link GetJobFamiliesResponseType }
     * 
     */
    public GetJobFamiliesResponseType createGetJobFamiliesResponseType() {
        return new GetJobFamiliesResponseType();
    }

    /**
     * Create an instance of {@link ChangePreferredNameResponseType }
     * 
     */
    public ChangePreferredNameResponseType createChangePreferredNameResponseType() {
        return new ChangePreferredNameResponseType();
    }

    /**
     * Create an instance of {@link EmployeeRelatedPersonsGetType }
     * 
     */
    public EmployeeRelatedPersonsGetType createEmployeeRelatedPersonsGetType() {
        return new EmployeeRelatedPersonsGetType();
    }

    /**
     * Create an instance of {@link MaintainContactInformationForPersonEventRequestType }
     * 
     */
    public MaintainContactInformationForPersonEventRequestType createMaintainContactInformationForPersonEventRequestType() {
        return new MaintainContactInformationForPersonEventRequestType();
    }

    /**
     * Create an instance of {@link PutPeriodReportingCalendarRequestType }
     * 
     */
    public PutPeriodReportingCalendarRequestType createPutPeriodReportingCalendarRequestType() {
        return new PutPeriodReportingCalendarRequestType();
    }

    /**
     * Create an instance of {@link PutTrainingTypeRequestType }
     * 
     */
    public PutTrainingTypeRequestType createPutTrainingTypeRequestType() {
        return new PutTrainingTypeRequestType();
    }

    /**
     * Create an instance of {@link GetCommitteeClassificationsResponseType }
     * 
     */
    public GetCommitteeClassificationsResponseType createGetCommitteeClassificationsResponseType() {
        return new GetCommitteeClassificationsResponseType();
    }

    /**
     * Create an instance of {@link WorkerProfileType }
     * 
     */
    public WorkerProfileType createWorkerProfileType() {
        return new WorkerProfileType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link PutDifficultyToFillResponseType }
     * 
     */
    public PutDifficultyToFillResponseType createPutDifficultyToFillResponseType() {
        return new PutDifficultyToFillResponseType();
    }

    /**
     * Create an instance of {@link GetWorkShiftsResponseType }
     * 
     */
    public GetWorkShiftsResponseType createGetWorkShiftsResponseType() {
        return new GetWorkShiftsResponseType();
    }

    /**
     * Create an instance of {@link OrganizationStructureDissolveType }
     * 
     */
    public OrganizationStructureDissolveType createOrganizationStructureDissolveType() {
        return new OrganizationStructureDissolveType();
    }

    /**
     * Create an instance of {@link BusinessSiteReferencesRootType }
     * 
     */
    public BusinessSiteReferencesRootType createBusinessSiteReferencesRootType() {
        return new BusinessSiteReferencesRootType();
    }

    /**
     * Create an instance of {@link GetCommitteeMeetingsResponseType }
     * 
     */
    public GetCommitteeMeetingsResponseType createGetCommitteeMeetingsResponseType() {
        return new GetCommitteeMeetingsResponseType();
    }

    /**
     * Create an instance of {@link GetSexualOrientationsRequestType }
     * 
     */
    public GetSexualOrientationsRequestType createGetSexualOrientationsRequestType() {
        return new GetSexualOrientationsRequestType();
    }

    /**
     * Create an instance of {@link GetChangeWorkContactInformationRequestType }
     * 
     */
    public GetChangeWorkContactInformationRequestType createGetChangeWorkContactInformationRequestType() {
        return new GetChangeWorkContactInformationRequestType();
    }

    /**
     * Create an instance of {@link ValidationFaultType }
     * 
     */
    public ValidationFaultType createValidationFaultType() {
        return new ValidationFaultType();
    }

    /**
     * Create an instance of {@link PutCommitteeMembershipTypeResponseType }
     * 
     */
    public PutCommitteeMembershipTypeResponseType createPutCommitteeMembershipTypeResponseType() {
        return new PutCommitteeMembershipTypeResponseType();
    }

    /**
     * Create an instance of {@link GetAssignUserBasedSecurityGroupResponseType }
     * 
     */
    public GetAssignUserBasedSecurityGroupResponseType createGetAssignUserBasedSecurityGroupResponseType() {
        return new GetAssignUserBasedSecurityGroupResponseType();
    }

    /**
     * Create an instance of {@link ContingentWorkerPersonalInfoType }
     * 
     */
    public ContingentWorkerPersonalInfoType createContingentWorkerPersonalInfoType() {
        return new ContingentWorkerPersonalInfoType();
    }

    /**
     * Create an instance of {@link PutFormerWorkerRequestType }
     * 
     */
    public PutFormerWorkerRequestType createPutFormerWorkerRequestType() {
        return new PutFormerWorkerRequestType();
    }

    /**
     * Create an instance of {@link GetWorkScheduleCalendarsRequestType }
     * 
     */
    public GetWorkScheduleCalendarsRequestType createGetWorkScheduleCalendarsRequestType() {
        return new GetWorkScheduleCalendarsRequestType();
    }

    /**
     * Create an instance of {@link PutEthnicityRequestType }
     * 
     */
    public PutEthnicityRequestType createPutEthnicityRequestType() {
        return new PutEthnicityRequestType();
    }

    /**
     * Create an instance of {@link ChangeWorkContactInformationResponseType }
     * 
     */
    public ChangeWorkContactInformationResponseType createChangeWorkContactInformationResponseType() {
        return new ChangeWorkContactInformationResponseType();
    }

    /**
     * Create an instance of {@link PutJobCategoryResponseType }
     * 
     */
    public PutJobCategoryResponseType createPutJobCategoryResponseType() {
        return new PutJobCategoryResponseType();
    }

    /**
     * Create an instance of {@link GetAssignUserBasedSecurityGroupsResponseType }
     * 
     */
    public GetAssignUserBasedSecurityGroupsResponseType createGetAssignUserBasedSecurityGroupsResponseType() {
        return new GetAssignUserBasedSecurityGroupsResponseType();
    }

    /**
     * Create an instance of {@link GetSocialBenefitsLocalitiesRequestType }
     * 
     */
    public GetSocialBenefitsLocalitiesRequestType createGetSocialBenefitsLocalitiesRequestType() {
        return new GetSocialBenefitsLocalitiesRequestType();
    }

    /**
     * Create an instance of {@link GetUniversalIdentifiersRequestType }
     * 
     */
    public GetUniversalIdentifiersRequestType createGetUniversalIdentifiersRequestType() {
        return new GetUniversalIdentifiersRequestType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentResponseType }
     * 
     */
    public AcademicAppointmentResponseType createAcademicAppointmentResponseType() {
        return new AcademicAppointmentResponseType();
    }

    /**
     * Create an instance of {@link PutLocationHierarchyOrganizationAssignmentsResponseType }
     * 
     */
    public PutLocationHierarchyOrganizationAssignmentsResponseType createPutLocationHierarchyOrganizationAssignmentsResponseType() {
        return new PutLocationHierarchyOrganizationAssignmentsResponseType();
    }

    /**
     * Create an instance of {@link GetAppointmentSpecialtiesRequestType }
     * 
     */
    public GetAppointmentSpecialtiesRequestType createGetAppointmentSpecialtiesRequestType() {
        return new GetAppointmentSpecialtiesRequestType();
    }

    /**
     * Create an instance of {@link GetJobClassificationGroupsRequestType }
     * 
     */
    public GetJobClassificationGroupsRequestType createGetJobClassificationGroupsRequestType() {
        return new GetJobClassificationGroupsRequestType();
    }

    /**
     * Create an instance of {@link PutWorkScheduleCalendarRequestType }
     * 
     */
    public PutWorkScheduleCalendarRequestType createPutWorkScheduleCalendarRequestType() {
        return new PutWorkScheduleCalendarRequestType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDsRequestType }
     * 
     */
    public ChangeGovernmentIDsRequestType createChangeGovernmentIDsRequestType() {
        return new ChangeGovernmentIDsRequestType();
    }

    /**
     * Create an instance of {@link EditAcademicAppointmentTrackAdditionalDataRequestType }
     * 
     */
    public EditAcademicAppointmentTrackAdditionalDataRequestType createEditAcademicAppointmentTrackAdditionalDataRequestType() {
        return new EditAcademicAppointmentTrackAdditionalDataRequestType();
    }

    /**
     * Create an instance of {@link GetDisabilitiesRequestType }
     * 
     */
    public GetDisabilitiesRequestType createGetDisabilitiesRequestType() {
        return new GetDisabilitiesRequestType();
    }

    /**
     * Create an instance of {@link ChangePreferredNameRequestType }
     * 
     */
    public ChangePreferredNameRequestType createChangePreferredNameRequestType() {
        return new ChangePreferredNameRequestType();
    }

    /**
     * Create an instance of {@link PutDependentResponseType }
     * 
     */
    public PutDependentResponseType createPutDependentResponseType() {
        return new PutDependentResponseType();
    }

    /**
     * Create an instance of {@link PutCommitteeTypeRequestType }
     * 
     */
    public PutCommitteeTypeRequestType createPutCommitteeTypeRequestType() {
        return new PutCommitteeTypeRequestType();
    }

    /**
     * Create an instance of {@link ChangeOtherIDsResponseType }
     * 
     */
    public ChangeOtherIDsResponseType createChangeOtherIDsResponseType() {
        return new ChangeOtherIDsResponseType();
    }

    /**
     * Create an instance of {@link PutAddressesForCountryFormatExtensionRequestType }
     * 
     */
    public PutAddressesForCountryFormatExtensionRequestType createPutAddressesForCountryFormatExtensionRequestType() {
        return new PutAddressesForCountryFormatExtensionRequestType();
    }

    /**
     * Create an instance of {@link PutEthnicityResponseType }
     * 
     */
    public PutEthnicityResponseType createPutEthnicityResponseType() {
        return new PutEthnicityResponseType();
    }

    /**
     * Create an instance of {@link BusinessSiteType }
     * 
     */
    public BusinessSiteType createBusinessSiteType() {
        return new BusinessSiteType();
    }

    /**
     * Create an instance of {@link GetWorkScheduleCalendarsResponseType }
     * 
     */
    public GetWorkScheduleCalendarsResponseType createGetWorkScheduleCalendarsResponseType() {
        return new GetWorkScheduleCalendarsResponseType();
    }

    /**
     * Create an instance of {@link EditNamedProfessorshipResponseType }
     * 
     */
    public EditNamedProfessorshipResponseType createEditNamedProfessorshipResponseType() {
        return new EditNamedProfessorshipResponseType();
    }

    /**
     * Create an instance of {@link EmployeeImageType }
     * 
     */
    public EmployeeImageType createEmployeeImageType() {
        return new EmployeeImageType();
    }

    /**
     * Create an instance of {@link ReassignSuperiorToInactiveOrganizationRequestType }
     * 
     */
    public ReassignSuperiorToInactiveOrganizationRequestType createReassignSuperiorToInactiveOrganizationRequestType() {
        return new ReassignSuperiorToInactiveOrganizationRequestType();
    }

    /**
     * Create an instance of {@link GetCommitteeMembershipTypesResponseType }
     * 
     */
    public GetCommitteeMembershipTypesResponseType createGetCommitteeMembershipTypesResponseType() {
        return new GetCommitteeMembershipTypesResponseType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentsResponseType }
     * 
     */
    public ProvisioningGroupAssignmentsResponseType createProvisioningGroupAssignmentsResponseType() {
        return new ProvisioningGroupAssignmentsResponseType();
    }

    /**
     * Create an instance of {@link ChangeAdditionalNamesResponseType }
     * 
     */
    public ChangeAdditionalNamesResponseType createChangeAdditionalNamesResponseType() {
        return new ChangeAdditionalNamesResponseType();
    }

    /**
     * Create an instance of {@link PutCommitteeTypeResponseType }
     * 
     */
    public PutCommitteeTypeResponseType createPutCommitteeTypeResponseType() {
        return new PutCommitteeTypeResponseType();
    }

    /**
     * Create an instance of {@link GetWorkShiftsRequestType }
     * 
     */
    public GetWorkShiftsRequestType createGetWorkShiftsRequestType() {
        return new GetWorkShiftsRequestType();
    }

    /**
     * Create an instance of {@link CreateNamedProfessorshipResponseType }
     * 
     */
    public CreateNamedProfessorshipResponseType createCreateNamedProfessorshipResponseType() {
        return new CreateNamedProfessorshipResponseType();
    }

    /**
     * Create an instance of {@link ManageUnionMembershipRequestType }
     * 
     */
    public ManageUnionMembershipRequestType createManageUnionMembershipRequestType() {
        return new ManageUnionMembershipRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeClassificationRequestType }
     * 
     */
    public PutCommitteeClassificationRequestType createPutCommitteeClassificationRequestType() {
        return new PutCommitteeClassificationRequestType();
    }

    /**
     * Create an instance of {@link PutPreferredCommunicationLanguageRequestType }
     * 
     */
    public PutPreferredCommunicationLanguageRequestType createPutPreferredCommunicationLanguageRequestType() {
        return new PutPreferredCommunicationLanguageRequestType();
    }

    /**
     * Create an instance of {@link ManageEmployeeProbationPeriodsEventRequestType }
     * 
     */
    public ManageEmployeeProbationPeriodsEventRequestType createManageEmployeeProbationPeriodsEventRequestType() {
        return new ManageEmployeeProbationPeriodsEventRequestType();
    }

    /**
     * Create an instance of {@link GetLGBTIdentificationsRequestType }
     * 
     */
    public GetLGBTIdentificationsRequestType createGetLGBTIdentificationsRequestType() {
        return new GetLGBTIdentificationsRequestType();
    }

    /**
     * Create an instance of {@link CreateReferenceLetterForWorkerResponseType }
     * 
     */
    public CreateReferenceLetterForWorkerResponseType createCreateReferenceLetterForWorkerResponseType() {
        return new CreateReferenceLetterForWorkerResponseType();
    }

    /**
     * Create an instance of {@link PutWorkShiftResponseType }
     * 
     */
    public PutWorkShiftResponseType createPutWorkShiftResponseType() {
        return new PutWorkShiftResponseType();
    }

    /**
     * Create an instance of {@link PutEstablishmentRequestType }
     * 
     */
    public PutEstablishmentRequestType createPutEstablishmentRequestType() {
        return new PutEstablishmentRequestType();
    }

    /**
     * Create an instance of {@link GetOrganizationsResponseType }
     * 
     */
    public GetOrganizationsResponseType createGetOrganizationsResponseType() {
        return new GetOrganizationsResponseType();
    }

    /**
     * Create an instance of {@link AssignEmployeeCollectiveAgreementEventRequestType }
     * 
     */
    public AssignEmployeeCollectiveAgreementEventRequestType createAssignEmployeeCollectiveAgreementEventRequestType() {
        return new AssignEmployeeCollectiveAgreementEventRequestType();
    }

    /**
     * Create an instance of {@link GetWorkersCompensationCodesResponseType }
     * 
     */
    public GetWorkersCompensationCodesResponseType createGetWorkersCompensationCodesResponseType() {
        return new GetWorkersCompensationCodesResponseType();
    }

    /**
     * Create an instance of {@link GetAcademicUnitsRequestType }
     * 
     */
    public GetAcademicUnitsRequestType createGetAcademicUnitsRequestType() {
        return new GetAcademicUnitsRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeClassificationGroupRequestType }
     * 
     */
    public PutCommitteeClassificationGroupRequestType createPutCommitteeClassificationGroupRequestType() {
        return new PutCommitteeClassificationGroupRequestType();
    }

    /**
     * Create an instance of {@link PutCompanyInsiderTypeRequestType }
     * 
     */
    public PutCompanyInsiderTypeRequestType createPutCompanyInsiderTypeRequestType() {
        return new PutCompanyInsiderTypeRequestType();
    }

    /**
     * Create an instance of {@link GetPreferredCommunicationLanguageRequestType }
     * 
     */
    public GetPreferredCommunicationLanguageRequestType createGetPreferredCommunicationLanguageRequestType() {
        return new GetPreferredCommunicationLanguageRequestType();
    }

    /**
     * Create an instance of {@link WorkerEventHistoryType }
     * 
     */
    public WorkerEventHistoryType createWorkerEventHistoryType() {
        return new WorkerEventHistoryType();
    }

    /**
     * Create an instance of {@link GetLocationHierarchyOrganizationAssignmentsRequestType }
     * 
     */
    public GetLocationHierarchyOrganizationAssignmentsRequestType createGetLocationHierarchyOrganizationAssignmentsRequestType() {
        return new GetLocationHierarchyOrganizationAssignmentsRequestType();
    }

    /**
     * Create an instance of {@link PutAssignUserBasedSecurityGroupResponseType }
     * 
     */
    public PutAssignUserBasedSecurityGroupResponseType createPutAssignUserBasedSecurityGroupResponseType() {
        return new PutAssignUserBasedSecurityGroupResponseType();
    }

    /**
     * Create an instance of {@link ContingentWorkerPersonalInfoUpdateType }
     * 
     */
    public ContingentWorkerPersonalInfoUpdateType createContingentWorkerPersonalInfoUpdateType() {
        return new ContingentWorkerPersonalInfoUpdateType();
    }

    /**
     * Create an instance of {@link GetPoliticalAffiliationsResponseType }
     * 
     */
    public GetPoliticalAffiliationsResponseType createGetPoliticalAffiliationsResponseType() {
        return new GetPoliticalAffiliationsResponseType();
    }

    /**
     * Create an instance of {@link ChangeLegalNameResponseType }
     * 
     */
    public ChangeLegalNameResponseType createChangeLegalNameResponseType() {
        return new ChangeLegalNameResponseType();
    }

    /**
     * Create an instance of {@link ChangeLicensesRequestType }
     * 
     */
    public ChangeLicensesRequestType createChangeLicensesRequestType() {
        return new ChangeLicensesRequestType();
    }

    /**
     * Create an instance of {@link OrganizationInactivateType }
     * 
     */
    public OrganizationInactivateType createOrganizationInactivateType() {
        return new OrganizationInactivateType();
    }

    /**
     * Create an instance of {@link PutFormerWorkerResponseType }
     * 
     */
    public PutFormerWorkerResponseType createPutFormerWorkerResponseType() {
        return new PutFormerWorkerResponseType();
    }

    /**
     * Create an instance of {@link PutTrainingTypeResponseType }
     * 
     */
    public PutTrainingTypeResponseType createPutTrainingTypeResponseType() {
        return new PutTrainingTypeResponseType();
    }

    /**
     * Create an instance of {@link GetSearchSettingsResponseType }
     * 
     */
    public GetSearchSettingsResponseType createGetSearchSettingsResponseType() {
        return new GetSearchSettingsResponseType();
    }

    /**
     * Create an instance of {@link GetPronounsRequestType }
     * 
     */
    public GetPronounsRequestType createGetPronounsRequestType() {
        return new GetPronounsRequestType();
    }

    /**
     * Create an instance of {@link GetAcademicRanksRequestType }
     * 
     */
    public GetAcademicRanksRequestType createGetAcademicRanksRequestType() {
        return new GetAcademicRanksRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeMembershipTypeRequestType }
     * 
     */
    public PutCommitteeMembershipTypeRequestType createPutCommitteeMembershipTypeRequestType() {
        return new PutCommitteeMembershipTypeRequestType();
    }

    /**
     * Create an instance of {@link PutGenderIdentityRequestType }
     * 
     */
    public PutGenderIdentityRequestType createPutGenderIdentityRequestType() {
        return new PutGenderIdentityRequestType();
    }

    /**
     * Create an instance of {@link GetPeriodReportingCalendarsResponseType }
     * 
     */
    public GetPeriodReportingCalendarsResponseType createGetPeriodReportingCalendarsResponseType() {
        return new GetPeriodReportingCalendarsResponseType();
    }

    /**
     * Create an instance of {@link UpdateAcademicAppointmentRequestType }
     * 
     */
    public UpdateAcademicAppointmentRequestType createUpdateAcademicAppointmentRequestType() {
        return new UpdateAcademicAppointmentRequestType();
    }

    /**
     * Create an instance of {@link ChangePersonalInformationRequestType }
     * 
     */
    public ChangePersonalInformationRequestType createChangePersonalInformationRequestType() {
        return new ChangePersonalInformationRequestType();
    }

    /**
     * Create an instance of {@link GetUniversalIdentifiersResponseType }
     * 
     */
    public GetUniversalIdentifiersResponseType createGetUniversalIdentifiersResponseType() {
        return new GetUniversalIdentifiersResponseType();
    }

    /**
     * Create an instance of {@link ChangePassportsAndVisasRequestType }
     * 
     */
    public ChangePassportsAndVisasRequestType createChangePassportsAndVisasRequestType() {
        return new ChangePassportsAndVisasRequestType();
    }

    /**
     * Create an instance of {@link GetLocationAttributesRequestType }
     * 
     */
    public GetLocationAttributesRequestType createGetLocationAttributesRequestType() {
        return new GetLocationAttributesRequestType();
    }

    /**
     * Create an instance of {@link GetChangeHomeContactInformationResponseType }
     * 
     */
    public GetChangeHomeContactInformationResponseType createGetChangeHomeContactInformationResponseType() {
        return new GetChangeHomeContactInformationResponseType();
    }

    /**
     * Create an instance of {@link PutJobFamilyGroupRequestType }
     * 
     */
    public PutJobFamilyGroupRequestType createPutJobFamilyGroupRequestType() {
        return new PutJobFamilyGroupRequestType();
    }

    /**
     * Create an instance of {@link EmployeePersonalInfoGetType }
     * 
     */
    public EmployeePersonalInfoGetType createEmployeePersonalInfoGetType() {
        return new EmployeePersonalInfoGetType();
    }

    /**
     * Create an instance of {@link ChangeBackgroundCheckStatusRequestType }
     * 
     */
    public ChangeBackgroundCheckStatusRequestType createChangeBackgroundCheckStatusRequestType() {
        return new ChangeBackgroundCheckStatusRequestType();
    }

    /**
     * Create an instance of {@link ChangeVeteranStatusIdentificationResponseType }
     * 
     */
    public ChangeVeteranStatusIdentificationResponseType createChangeVeteranStatusIdentificationResponseType() {
        return new ChangeVeteranStatusIdentificationResponseType();
    }

    /**
     * Create an instance of {@link PutCompanyInsiderTypeResponseType }
     * 
     */
    public PutCompanyInsiderTypeResponseType createPutCompanyInsiderTypeResponseType() {
        return new PutCompanyInsiderTypeResponseType();
    }

    /**
     * Create an instance of {@link PutSearchSettingsRequestType }
     * 
     */
    public PutSearchSettingsRequestType createPutSearchSettingsRequestType() {
        return new PutSearchSettingsRequestType();
    }

    /**
     * Create an instance of {@link ChangeBackgroundCheckStatusResponseType }
     * 
     */
    public ChangeBackgroundCheckStatusResponseType createChangeBackgroundCheckStatusResponseType() {
        return new ChangeBackgroundCheckStatusResponseType();
    }

    /**
     * Create an instance of {@link GetProvisioningGroupAssignmentsRequestType }
     * 
     */
    public GetProvisioningGroupAssignmentsRequestType createGetProvisioningGroupAssignmentsRequestType() {
        return new GetProvisioningGroupAssignmentsRequestType();
    }

    /**
     * Create an instance of {@link ReactivateOrganizationRequestType }
     * 
     */
    public ReactivateOrganizationRequestType createReactivateOrganizationRequestType() {
        return new ReactivateOrganizationRequestType();
    }

    /**
     * Create an instance of {@link GetGenderIdentitiesRequestType }
     * 
     */
    public GetGenderIdentitiesRequestType createGetGenderIdentitiesRequestType() {
        return new GetGenderIdentitiesRequestType();
    }

    /**
     * Create an instance of {@link GetPreviousSystemJobHistoryResponseType }
     * 
     */
    public GetPreviousSystemJobHistoryResponseType createGetPreviousSystemJobHistoryResponseType() {
        return new GetPreviousSystemJobHistoryResponseType();
    }

    /**
     * Create an instance of {@link PutAddressesForCountryFormatExtensionResponseType }
     * 
     */
    public PutAddressesForCountryFormatExtensionResponseType createPutAddressesForCountryFormatExtensionResponseType() {
        return new PutAddressesForCountryFormatExtensionResponseType();
    }

    /**
     * Create an instance of {@link PutJobFamilyGroupResponseType }
     * 
     */
    public PutJobFamilyGroupResponseType createPutJobFamilyGroupResponseType() {
        return new PutJobFamilyGroupResponseType();
    }

    /**
     * Create an instance of {@link ChangeAdditionalNamesRequestType }
     * 
     */
    public ChangeAdditionalNamesRequestType createChangeAdditionalNamesRequestType() {
        return new ChangeAdditionalNamesRequestType();
    }

    /**
     * Create an instance of {@link PutAssignUserBasedSecurityGroupsRequestType }
     * 
     */
    public PutAssignUserBasedSecurityGroupsRequestType createPutAssignUserBasedSecurityGroupsRequestType() {
        return new PutAssignUserBasedSecurityGroupsRequestType();
    }

    /**
     * Create an instance of {@link GetJobCategoriesRequestType }
     * 
     */
    public GetJobCategoriesRequestType createGetJobCategoriesRequestType() {
        return new GetJobCategoriesRequestType();
    }

    /**
     * Create an instance of {@link PutPreviousSystemJobHistoryResponseType }
     * 
     */
    public PutPreviousSystemJobHistoryResponseType createPutPreviousSystemJobHistoryResponseType() {
        return new PutPreviousSystemJobHistoryResponseType();
    }

    /**
     * Create an instance of {@link ChangeWorkSpaceRequestType }
     * 
     */
    public ChangeWorkSpaceRequestType createChangeWorkSpaceRequestType() {
        return new ChangeWorkSpaceRequestType();
    }

    /**
     * Create an instance of {@link PutLGBTIdentificationRequestType }
     * 
     */
    public PutLGBTIdentificationRequestType createPutLGBTIdentificationRequestType() {
        return new PutLGBTIdentificationRequestType();
    }

    /**
     * Create an instance of {@link GetWorkStatusRuleSetsResponseType }
     * 
     */
    public GetWorkStatusRuleSetsResponseType createGetWorkStatusRuleSetsResponseType() {
        return new GetWorkStatusRuleSetsResponseType();
    }

    /**
     * Create an instance of {@link GetCompanyInsiderTypesRequestType }
     * 
     */
    public GetCompanyInsiderTypesRequestType createGetCompanyInsiderTypesRequestType() {
        return new GetCompanyInsiderTypesRequestType();
    }

    /**
     * Create an instance of {@link GetPeriodReportingCalendarsRequestType }
     * 
     */
    public GetPeriodReportingCalendarsRequestType createGetPeriodReportingCalendarsRequestType() {
        return new GetPeriodReportingCalendarsRequestType();
    }

    /**
     * Create an instance of {@link ManageEmployeeProbationPeriodsEventResponseType }
     * 
     */
    public ManageEmployeeProbationPeriodsEventResponseType createManageEmployeeProbationPeriodsEventResponseType() {
        return new ManageEmployeeProbationPeriodsEventResponseType();
    }

    /**
     * Create an instance of {@link EmployeeRelatedPersonsType }
     * 
     */
    public EmployeeRelatedPersonsType createEmployeeRelatedPersonsType() {
        return new EmployeeRelatedPersonsType();
    }

    /**
     * Create an instance of {@link PutAppointmentSpecialtyRequestType }
     * 
     */
    public PutAppointmentSpecialtyRequestType createPutAppointmentSpecialtyRequestType() {
        return new PutAppointmentSpecialtyRequestType();
    }

    /**
     * Create an instance of {@link ImportUniversalIdentifierRequestType }
     * 
     */
    public ImportUniversalIdentifierRequestType createImportUniversalIdentifierRequestType() {
        return new ImportUniversalIdentifierRequestType();
    }

    /**
     * Create an instance of {@link GetAssignUserBasedSecurityGroupRequestType }
     * 
     */
    public GetAssignUserBasedSecurityGroupRequestType createGetAssignUserBasedSecurityGroupRequestType() {
        return new GetAssignUserBasedSecurityGroupRequestType();
    }

    /**
     * Create an instance of {@link MaintainCommitteeDefinitionResponseType }
     * 
     */
    public MaintainCommitteeDefinitionResponseType createMaintainCommitteeDefinitionResponseType() {
        return new MaintainCommitteeDefinitionResponseType();
    }

    /**
     * Create an instance of {@link GetHolidayCalendarsResponseType }
     * 
     */
    public GetHolidayCalendarsResponseType createGetHolidayCalendarsResponseType() {
        return new GetHolidayCalendarsResponseType();
    }

    /**
     * Create an instance of {@link PutJobProfileResponseType }
     * 
     */
    public PutJobProfileResponseType createPutJobProfileResponseType() {
        return new PutJobProfileResponseType();
    }

    /**
     * Create an instance of {@link GetTrainingTypesResponseType }
     * 
     */
    public GetTrainingTypesResponseType createGetTrainingTypesResponseType() {
        return new GetTrainingTypesResponseType();
    }

    /**
     * Create an instance of {@link EndAcademicAppointmentRequestType }
     * 
     */
    public EndAcademicAppointmentRequestType createEndAcademicAppointmentRequestType() {
        return new EndAcademicAppointmentRequestType();
    }

    /**
     * Create an instance of {@link PutCommitteeClassificationResponseType }
     * 
     */
    public PutCommitteeClassificationResponseType createPutCommitteeClassificationResponseType() {
        return new PutCommitteeClassificationResponseType();
    }

    /**
     * Create an instance of {@link GetServiceCenterRepresentativesRequestType }
     * 
     */
    public GetServiceCenterRepresentativesRequestType createGetServiceCenterRepresentativesRequestType() {
        return new GetServiceCenterRepresentativesRequestType();
    }

    /**
     * Create an instance of {@link PutDisabilityResponseType }
     * 
     */
    public PutDisabilityResponseType createPutDisabilityResponseType() {
        return new PutDisabilityResponseType();
    }

    /**
     * Create an instance of {@link GetCommitteeTypesRequestType }
     * 
     */
    public GetCommitteeTypesRequestType createGetCommitteeTypesRequestType() {
        return new GetCommitteeTypesRequestType();
    }

    /**
     * Create an instance of {@link GetJobFamilyGroupsResponseType }
     * 
     */
    public GetJobFamilyGroupsResponseType createGetJobFamilyGroupsResponseType() {
        return new GetJobFamilyGroupsResponseType();
    }

    /**
     * Create an instance of {@link GetSearchSettingsRequestType }
     * 
     */
    public GetSearchSettingsRequestType createGetSearchSettingsRequestType() {
        return new GetSearchSettingsRequestType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountResponseType }
     * 
     */
    public GetWorkdayAccountResponseType createGetWorkdayAccountResponseType() {
        return new GetWorkdayAccountResponseType();
    }

    /**
     * Create an instance of {@link EditAcademicAppointmentTrackAdditionalDataResponseType }
     * 
     */
    public EditAcademicAppointmentTrackAdditionalDataResponseType createEditAcademicAppointmentTrackAdditionalDataResponseType() {
        return new EditAcademicAppointmentTrackAdditionalDataResponseType();
    }

    /**
     * Create an instance of {@link PersonAddressInformationDataType }
     * 
     */
    public PersonAddressInformationDataType createPersonAddressInformationDataType() {
        return new PersonAddressInformationDataType();
    }

    /**
     * Create an instance of {@link DayOfTheWeekObjectType }
     * 
     */
    public DayOfTheWeekObjectType createDayOfTheWeekObjectType() {
        return new DayOfTheWeekObjectType();
    }

    /**
     * Create an instance of {@link JobCategoryResponseDataType }
     * 
     */
    public JobCategoryResponseDataType createJobCategoryResponseDataType() {
        return new JobCategoryResponseDataType();
    }

    /**
     * Create an instance of {@link ProfessionalExperienceRatingReferenceType }
     * 
     */
    public ProfessionalExperienceRatingReferenceType createProfessionalExperienceRatingReferenceType() {
        return new ProfessionalExperienceRatingReferenceType();
    }

    /**
     * Create an instance of {@link PotentialObjectType }
     * 
     */
    public PotentialObjectType createPotentialObjectType() {
        return new PotentialObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemAttachmentDataType }
     * 
     */
    public CommitteeMeetingAgendaItemAttachmentDataType createCommitteeMeetingAgendaItemAttachmentDataType() {
        return new CommitteeMeetingAgendaItemAttachmentDataType();
    }

    /**
     * Create an instance of {@link EvaluationConstraintObjectIDType }
     * 
     */
    public EvaluationConstraintObjectIDType createEvaluationConstraintObjectIDType() {
        return new EvaluationConstraintObjectIDType();
    }

    /**
     * Create an instance of {@link JobProfileJobFamilyDataType }
     * 
     */
    public JobProfileJobFamilyDataType createJobProfileJobFamilyDataType() {
        return new JobProfileJobFamilyDataType();
    }

    /**
     * Create an instance of {@link GenericDisabilityStatusSubDataType }
     * 
     */
    public GenericDisabilityStatusSubDataType createGenericDisabilityStatusSubDataType() {
        return new GenericDisabilityStatusSubDataType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationBonusPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationBonusPlanAssignmentDetailDataType createEmployeeCompensationBonusPlanAssignmentDetailDataType() {
        return new EmployeeCompensationBonusPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link DependentObjectIDType }
     * 
     */
    public DependentObjectIDType createDependentObjectIDType() {
        return new DependentObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTargetsDataSubeditType }
     * 
     */
    public CommitteeMembershipTargetsDataSubeditType createCommitteeMembershipTargetsDataSubeditType() {
        return new CommitteeMembershipTargetsDataSubeditType();
    }

    /**
     * Create an instance of {@link ProbationStatusDataType }
     * 
     */
    public ProbationStatusDataType createProbationStatusDataType() {
        return new ProbationStatusDataType();
    }

    /**
     * Create an instance of {@link UserBasedSecurityGroupReferenceOnlyResponseGroupType }
     * 
     */
    public UserBasedSecurityGroupReferenceOnlyResponseGroupType createUserBasedSecurityGroupReferenceOnlyResponseGroupType() {
        return new UserBasedSecurityGroupReferenceOnlyResponseGroupType();
    }

    /**
     * Create an instance of {@link DisciplinaryActionReasonObjectType }
     * 
     */
    public DisciplinaryActionReasonObjectType createDisciplinaryActionReasonObjectType() {
        return new DisciplinaryActionReasonObjectType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationSkillObjectType }
     * 
     */
    public ProfessionalAffiliationSkillObjectType createProfessionalAffiliationSkillObjectType() {
        return new ProfessionalAffiliationSkillObjectType();
    }

    /**
     * Create an instance of {@link LeaveRequestsCorrectedDetailDataType }
     * 
     */
    public LeaveRequestsCorrectedDetailDataType createLeaveRequestsCorrectedDetailDataType() {
        return new LeaveRequestsCorrectedDetailDataType();
    }

    /**
     * Create an instance of {@link CommitteeTypeDataType }
     * 
     */
    public CommitteeTypeDataType createCommitteeTypeDataType() {
        return new CommitteeTypeDataType();
    }

    /**
     * Create an instance of {@link ProficiencyRatingBehaviorObjectIDType }
     * 
     */
    public ProficiencyRatingBehaviorObjectIDType createProficiencyRatingBehaviorObjectIDType() {
        return new ProficiencyRatingBehaviorObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodObjectIDType }
     * 
     */
    public EmployeeProbationPeriodObjectIDType createEmployeeProbationPeriodObjectIDType() {
        return new EmployeeProbationPeriodObjectIDType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeType }
     * 
     */
    public CompanyInsiderTypeType createCompanyInsiderTypeType() {
        return new CompanyInsiderTypeType();
    }

    /**
     * Create an instance of {@link GoalDataType }
     * 
     */
    public GoalDataType createGoalDataType() {
        return new GoalDataType();
    }

    /**
     * Create an instance of {@link CompensationDetailDataType }
     * 
     */
    public CompensationDetailDataType createCompensationDetailDataType() {
        return new CompensationDetailDataType();
    }

    /**
     * Create an instance of {@link SystemUserObjectIDType }
     * 
     */
    public SystemUserObjectIDType createSystemUserObjectIDType() {
        return new SystemUserObjectIDType();
    }

    /**
     * Create an instance of {@link EmergencyContactDataWWSType }
     * 
     */
    public EmergencyContactDataWWSType createEmergencyContactDataWWSType() {
        return new EmergencyContactDataWWSType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierDataType }
     * 
     */
    public UniversalIdentifierDataType createUniversalIdentifierDataType() {
        return new UniversalIdentifierDataType();
    }

    /**
     * Create an instance of {@link LanguageAbilityTypeObjectType }
     * 
     */
    public LanguageAbilityTypeObjectType createLanguageAbilityTypeObjectType() {
        return new LanguageAbilityTypeObjectType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarObjectType }
     * 
     */
    public PeriodReportingCalendarObjectType createPeriodReportingCalendarObjectType() {
        return new PeriodReportingCalendarObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingTypeObjectType }
     * 
     */
    public CommitteeMeetingTypeObjectType createCommitteeMeetingTypeObjectType() {
        return new CommitteeMeetingTypeObjectType();
    }

    /**
     * Create an instance of {@link EvaluationConstraintObjectType }
     * 
     */
    public EvaluationConstraintObjectType createEvaluationConstraintObjectType() {
        return new EvaluationConstraintObjectType();
    }

    /**
     * Create an instance of {@link CorrectedOrRescindedTransactionDataType }
     * 
     */
    public CorrectedOrRescindedTransactionDataType createCorrectedOrRescindedTransactionDataType() {
        return new CorrectedOrRescindedTransactionDataType();
    }

    /**
     * Create an instance of {@link UserBasedSecurityGroupObjectIDType }
     * 
     */
    public UserBasedSecurityGroupObjectIDType createUserBasedSecurityGroupObjectIDType() {
        return new UserBasedSecurityGroupObjectIDType();
    }

    /**
     * Create an instance of {@link SelfIdentificationOfDisabilityStatusObjectIDType }
     * 
     */
    public SelfIdentificationOfDisabilityStatusObjectIDType createSelfIdentificationOfDisabilityStatusObjectIDType() {
        return new SelfIdentificationOfDisabilityStatusObjectIDType();
    }

    /**
     * Create an instance of {@link InstantMessengerCoreDataType }
     * 
     */
    public InstantMessengerCoreDataType createInstantMessengerCoreDataType() {
        return new InstantMessengerCoreDataType();
    }

    /**
     * Create an instance of {@link LocationRequestCriteriaType }
     * 
     */
    public LocationRequestCriteriaType createLocationRequestCriteriaType() {
        return new LocationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link BenefitPlanObjectType }
     * 
     */
    public BenefitPlanObjectType createBenefitPlanObjectType() {
        return new BenefitPlanObjectType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentRestrictionsDataType }
     * 
     */
    public OrganizationAssignmentRestrictionsDataType createOrganizationAssignmentRestrictionsDataType() {
        return new OrganizationAssignmentRestrictionsDataType();
    }

    /**
     * Create an instance of {@link ContingentWorkerReferenceDataType }
     * 
     */
    public ContingentWorkerReferenceDataType createContingentWorkerReferenceDataType() {
        return new ContingentWorkerReferenceDataType();
    }

    /**
     * Create an instance of {@link WorkerOrganizationDataType }
     * 
     */
    public WorkerOrganizationDataType createWorkerOrganizationDataType() {
        return new WorkerOrganizationDataType();
    }

    /**
     * Create an instance of {@link PersonalInfoDataType }
     * 
     */
    public PersonalInfoDataType createPersonalInfoDataType() {
        return new PersonalInfoDataType();
    }

    /**
     * Create an instance of {@link ChangeLicensesBusinessProcessDataType }
     * 
     */
    public ChangeLicensesBusinessProcessDataType createChangeLicensesBusinessProcessDataType() {
        return new ChangeLicensesBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link AddressCoreDataType }
     * 
     */
    public AddressCoreDataType createAddressCoreDataType() {
        return new AddressCoreDataType();
    }

    /**
     * Create an instance of {@link GovernmentIdentifierReferenceObjectIDType }
     * 
     */
    public GovernmentIdentifierReferenceObjectIDType createGovernmentIdentifierReferenceObjectIDType() {
        return new GovernmentIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link SubmunicipalityInformationDataType }
     * 
     */
    public SubmunicipalityInformationDataType createSubmunicipalityInformationDataType() {
        return new SubmunicipalityInformationDataType();
    }

    /**
     * Create an instance of {@link GovernmentIdentificationDataType }
     * 
     */
    public GovernmentIdentificationDataType createGovernmentIdentificationDataType() {
        return new GovernmentIdentificationDataType();
    }

    /**
     * Create an instance of {@link InternationalAssignmentSummaryDataType }
     * 
     */
    public InternationalAssignmentSummaryDataType createInternationalAssignmentSummaryDataType() {
        return new InternationalAssignmentSummaryDataType();
    }

    /**
     * Create an instance of {@link SupervisoryOrgDataType }
     * 
     */
    public SupervisoryOrgDataType createSupervisoryOrgDataType() {
        return new SupervisoryOrgDataType();
    }

    /**
     * Create an instance of {@link EmergencyContactPriorityObjectIDType }
     * 
     */
    public EmergencyContactPriorityObjectIDType createEmergencyContactPriorityObjectIDType() {
        return new EmergencyContactPriorityObjectIDType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarRowObjectIDType }
     * 
     */
    public PeriodReportingCalendarRowObjectIDType createPeriodReportingCalendarRowObjectIDType() {
        return new PeriodReportingCalendarRowObjectIDType();
    }

    /**
     * Create an instance of {@link PayRateTypeObjectIDType }
     * 
     */
    public PayRateTypeObjectIDType createPayRateTypeObjectIDType() {
        return new PayRateTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerCompensationCodeDataType }
     * 
     */
    public WorkerCompensationCodeDataType createWorkerCompensationCodeDataType() {
        return new WorkerCompensationCodeDataType();
    }

    /**
     * Create an instance of {@link TerminationSubcategoryObjectType }
     * 
     */
    public TerminationSubcategoryObjectType createTerminationSubcategoryObjectType() {
        return new TerminationSubcategoryObjectType();
    }

    /**
     * Create an instance of {@link NationalIDType }
     * 
     */
    public NationalIDType createNationalIDType() {
        return new NationalIDType();
    }

    /**
     * Create an instance of {@link CareerPreferencesDataType }
     * 
     */
    public CareerPreferencesDataType createCareerPreferencesDataType() {
        return new CareerPreferencesDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemVoteObjectIDType }
     * 
     */
    public CommitteeMeetingAgendaItemVoteObjectIDType createCommitteeMeetingAgendaItemVoteObjectIDType() {
        return new CommitteeMeetingAgendaItemVoteObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentObjectType }
     * 
     */
    public FormerWorkerAttachmentObjectType createFormerWorkerAttachmentObjectType() {
        return new FormerWorkerAttachmentObjectType();
    }

    /**
     * Create an instance of {@link ManageProfessionalAffiliationDataForRoleType }
     * 
     */
    public ManageProfessionalAffiliationDataForRoleType createManageProfessionalAffiliationDataForRoleType() {
        return new ManageProfessionalAffiliationDataForRoleType();
    }

    /**
     * Create an instance of {@link InstantMessengerTypeReferenceType }
     * 
     */
    public InstantMessengerTypeReferenceType createInstantMessengerTypeReferenceType() {
        return new InstantMessengerTypeReferenceType();
    }

    /**
     * Create an instance of {@link FormerWorkerResponseDataType }
     * 
     */
    public FormerWorkerResponseDataType createFormerWorkerResponseDataType() {
        return new FormerWorkerResponseDataType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordType createExternalDisabilitySelfIdentificationRecordType() {
        return new ExternalDisabilitySelfIdentificationRecordType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDsResponseWrapperType }
     * 
     */
    public ChangeGovernmentIDsResponseWrapperType createChangeGovernmentIDsResponseWrapperType() {
        return new ChangeGovernmentIDsResponseWrapperType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackObjectIDType }
     * 
     */
    public AcademicAppointmentTrackObjectIDType createAcademicAppointmentTrackObjectIDType() {
        return new AcademicAppointmentTrackObjectIDType();
    }

    /**
     * Create an instance of {@link JobProfileAssessmentDataType }
     * 
     */
    public JobProfileAssessmentDataType createJobProfileAssessmentDataType() {
        return new JobProfileAssessmentDataType();
    }

    /**
     * Create an instance of {@link LocalTerminationReasonObjectIDType }
     * 
     */
    public LocalTerminationReasonObjectIDType createLocalTerminationReasonObjectIDType() {
        return new LocalTerminationReasonObjectIDType();
    }

    /**
     * Create an instance of {@link BenefitProviderObjectIDType }
     * 
     */
    public BenefitProviderObjectIDType createBenefitProviderObjectIDType() {
        return new BenefitProviderObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicRankObjectType }
     * 
     */
    public AcademicRankObjectType createAcademicRankObjectType() {
        return new AcademicRankObjectType();
    }

    /**
     * Create an instance of {@link OrganizationDataType }
     * 
     */
    public OrganizationDataType createOrganizationDataType() {
        return new OrganizationDataType();
    }

    /**
     * Create an instance of {@link BenefitCoverageTypeObjectType }
     * 
     */
    public BenefitCoverageTypeObjectType createBenefitCoverageTypeObjectType() {
        return new BenefitCoverageTypeObjectType();
    }

    /**
     * Create an instance of {@link SelfEvaluationDetailDataType }
     * 
     */
    public SelfEvaluationDetailDataType createSelfEvaluationDetailDataType() {
        return new SelfEvaluationDetailDataType();
    }

    /**
     * Create an instance of {@link LocationContentDataType }
     * 
     */
    public LocationContentDataType createLocationContentDataType() {
        return new LocationContentDataType();
    }

    /**
     * Create an instance of {@link OldEmergencyContactType }
     * 
     */
    public OldEmergencyContactType createOldEmergencyContactType() {
        return new OldEmergencyContactType();
    }

    /**
     * Create an instance of {@link DayOfTheWeekObjectIDType }
     * 
     */
    public DayOfTheWeekObjectIDType createDayOfTheWeekObjectIDType() {
        return new DayOfTheWeekObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeTypeResponseGroupType }
     * 
     */
    public CommitteeTypeResponseGroupType createCommitteeTypeResponseGroupType() {
        return new CommitteeTypeResponseGroupType();
    }

    /**
     * Create an instance of {@link WorkerObjectIDType }
     * 
     */
    public WorkerObjectIDType createWorkerObjectIDType() {
        return new WorkerObjectIDType();
    }

    /**
     * Create an instance of {@link InstantMessengerDataType }
     * 
     */
    public InstantMessengerDataType createInstantMessengerDataType() {
        return new InstantMessengerDataType();
    }

    /**
     * Create an instance of {@link WorkerMatrixManagementChainDataType }
     * 
     */
    public WorkerMatrixManagementChainDataType createWorkerMatrixManagementChainDataType() {
        return new WorkerMatrixManagementChainDataType();
    }

    /**
     * Create an instance of {@link ExtendedEmployeeContractsDataType }
     * 
     */
    public ExtendedEmployeeContractsDataType createExtendedEmployeeContractsDataType() {
        return new ExtendedEmployeeContractsDataType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityRequestReferencesType }
     * 
     */
    public SocialBenefitsLocalityRequestReferencesType createSocialBenefitsLocalityRequestReferencesType() {
        return new SocialBenefitsLocalityRequestReferencesType();
    }

    /**
     * Create an instance of {@link RecruitingAssessmentTestObjectIDType }
     * 
     */
    public RecruitingAssessmentTestObjectIDType createRecruitingAssessmentTestObjectIDType() {
        return new RecruitingAssessmentTestObjectIDType();
    }

    /**
     * Create an instance of {@link StockPlanObjectIDType }
     * 
     */
    public StockPlanObjectIDType createStockPlanObjectIDType() {
        return new StockPlanObjectIDType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorObjectType }
     * 
     */
    public CollectiveAgreementFactorObjectType createCollectiveAgreementFactorObjectType() {
        return new CollectiveAgreementFactorObjectType();
    }

    /**
     * Create an instance of {@link ExternalURLObjectIDType }
     * 
     */
    public ExternalURLObjectIDType createExternalURLObjectIDType() {
        return new ExternalURLObjectIDType();
    }

    /**
     * Create an instance of {@link CommunicationUsageBehaviorTenantedObjectIDType }
     * 
     */
    public CommunicationUsageBehaviorTenantedObjectIDType createCommunicationUsageBehaviorTenantedObjectIDType() {
        return new CommunicationUsageBehaviorTenantedObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordRequestCriteriaType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordRequestCriteriaType createExternalDisabilitySelfIdentificationRecordRequestCriteriaType() {
        return new ExternalDisabilitySelfIdentificationRecordRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkerSupervisoryManagementChainDataType }
     * 
     */
    public WorkerSupervisoryManagementChainDataType createWorkerSupervisoryManagementChainDataType() {
        return new WorkerSupervisoryManagementChainDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationRequestReferencesType }
     * 
     */
    public CommitteeClassificationRequestReferencesType createCommitteeClassificationRequestReferencesType() {
        return new CommitteeClassificationRequestReferencesType();
    }

    /**
     * Create an instance of {@link TransactionLogTypeObjectType }
     * 
     */
    public TransactionLogTypeObjectType createTransactionLogTypeObjectType() {
        return new TransactionLogTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupObjectType }
     * 
     */
    public CommitteeClassificationGroupObjectType createCommitteeClassificationGroupObjectType() {
        return new CommitteeClassificationGroupObjectType();
    }

    /**
     * Create an instance of {@link CompensationDataType }
     * 
     */
    public CompensationDataType createCompensationDataType() {
        return new CompensationDataType();
    }

    /**
     * Create an instance of {@link EmployeeEmploymentInfoDataType }
     * 
     */
    public EmployeeEmploymentInfoDataType createEmployeeEmploymentInfoDataType() {
        return new EmployeeEmploymentInfoDataType();
    }

    /**
     * Create an instance of {@link CommitteeTypeType }
     * 
     */
    public CommitteeTypeType createCommitteeTypeType() {
        return new CommitteeTypeType();
    }

    /**
     * Create an instance of {@link DisabilityGradeObjectType }
     * 
     */
    public DisabilityGradeObjectType createDisabilityGradeObjectType() {
        return new DisabilityGradeObjectType();
    }

    /**
     * Create an instance of {@link EstablishmentRequestCriteriaType }
     * 
     */
    public EstablishmentRequestCriteriaType createEstablishmentRequestCriteriaType() {
        return new EstablishmentRequestCriteriaType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyRequestReferencesType }
     * 
     */
    public AppointmentSpecialtyRequestReferencesType createAppointmentSpecialtyRequestReferencesType() {
        return new AppointmentSpecialtyRequestReferencesType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeType }
     * 
     */
    public CommitteeMembershipTypeType createCommitteeMembershipTypeType() {
        return new CommitteeMembershipTypeType();
    }

    /**
     * Create an instance of {@link CompensationPackageObjectIDType }
     * 
     */
    public CompensationPackageObjectIDType createCompensationPackageObjectIDType() {
        return new CompensationPackageObjectIDType();
    }

    /**
     * Create an instance of {@link CalendarEventNonWorkDataType }
     * 
     */
    public CalendarEventNonWorkDataType createCalendarEventNonWorkDataType() {
        return new CalendarEventNonWorkDataType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityResponseDataType }
     * 
     */
    public SocialBenefitsLocalityResponseDataType createSocialBenefitsLocalityResponseDataType() {
        return new SocialBenefitsLocalityResponseDataType();
    }

    /**
     * Create an instance of {@link StaffingInterfaceObjectIDType }
     * 
     */
    public StaffingInterfaceObjectIDType createStaffingInterfaceObjectIDType() {
        return new StaffingInterfaceObjectIDType();
    }

    /**
     * Create an instance of {@link CertificationQualificationReplacementType }
     * 
     */
    public CertificationQualificationReplacementType createCertificationQualificationReplacementType() {
        return new CertificationQualificationReplacementType();
    }

    /**
     * Create an instance of {@link InstanceIDType }
     * 
     */
    public InstanceIDType createInstanceIDType() {
        return new InstanceIDType();
    }

    /**
     * Create an instance of {@link AddressReferenceObjectType }
     * 
     */
    public AddressReferenceObjectType createAddressReferenceObjectType() {
        return new AddressReferenceObjectType();
    }

    /**
     * Create an instance of {@link EndCollectiveAgreementAssignmentEventDataType }
     * 
     */
    public EndCollectiveAgreementAssignmentEventDataType createEndCollectiveAgreementAssignmentEventDataType() {
        return new EndCollectiveAgreementAssignmentEventDataType();
    }

    /**
     * Create an instance of {@link AddressLineDataType }
     * 
     */
    public AddressLineDataType createAddressLineDataType() {
        return new AddressLineDataType();
    }

    /**
     * Create an instance of {@link NationalIdentifierReferenceObjectIDType }
     * 
     */
    public NationalIdentifierReferenceObjectIDType createNationalIdentifierReferenceObjectIDType() {
        return new NationalIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link CommunicationUsageTypeObjectType }
     * 
     */
    public CommunicationUsageTypeObjectType createCommunicationUsageTypeObjectType() {
        return new CommunicationUsageTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingStatusObjectIDType }
     * 
     */
    public CommitteeMeetingStatusObjectIDType createCommitteeMeetingStatusObjectIDType() {
        return new CommitteeMeetingStatusObjectIDType();
    }

    /**
     * Create an instance of {@link GlobalAddressDataType }
     * 
     */
    public GlobalAddressDataType createGlobalAddressDataType() {
        return new GlobalAddressDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeDataType }
     * 
     */
    public CommitteeMembershipTypeDataType createCommitteeMembershipTypeDataType() {
        return new CommitteeMembershipTypeDataType();
    }

    /**
     * Create an instance of {@link CountrySubregionObjectIDType }
     * 
     */
    public CountrySubregionObjectIDType createCountrySubregionObjectIDType() {
        return new CountrySubregionObjectIDType();
    }

    /**
     * Create an instance of {@link FrequencyBehaviorObjectType }
     * 
     */
    public FrequencyBehaviorObjectType createFrequencyBehaviorObjectType() {
        return new FrequencyBehaviorObjectType();
    }

    /**
     * Create an instance of {@link WorkerHealthCareCoverageDataType }
     * 
     */
    public WorkerHealthCareCoverageDataType createWorkerHealthCareCoverageDataType() {
        return new WorkerHealthCareCoverageDataType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceIDReferenceDataType }
     * 
     */
    public OrganizationReferenceIDReferenceDataType createOrganizationReferenceIDReferenceDataType() {
        return new OrganizationReferenceIDReferenceDataType();
    }

    /**
     * Create an instance of {@link SupplierObjectType }
     * 
     */
    public SupplierObjectType createSupplierObjectType() {
        return new SupplierObjectType();
    }

    /**
     * Create an instance of {@link CompensationSummaryDataType }
     * 
     */
    public CompensationSummaryDataType createCompensationSummaryDataType() {
        return new CompensationSummaryDataType();
    }

    /**
     * Create an instance of {@link MilitaryStatusReferenceType }
     * 
     */
    public MilitaryStatusReferenceType createMilitaryStatusReferenceType() {
        return new MilitaryStatusReferenceType();
    }

    /**
     * Create an instance of {@link FrequencyObjectType }
     * 
     */
    public FrequencyObjectType createFrequencyObjectType() {
        return new FrequencyObjectType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarType }
     * 
     */
    public PeriodReportingCalendarType createPeriodReportingCalendarType() {
        return new PeriodReportingCalendarType();
    }

    /**
     * Create an instance of {@link EventAttachmentCategoryObjectIDType }
     * 
     */
    public EventAttachmentCategoryObjectIDType createEventAttachmentCategoryObjectIDType() {
        return new EventAttachmentCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeStockPlanAssignmentDataType }
     * 
     */
    public EmployeeStockPlanAssignmentDataType createEmployeeStockPlanAssignmentDataType() {
        return new EmployeeStockPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link CompetencyObjectType }
     * 
     */
    public CompetencyObjectType createCompetencyObjectType() {
        return new CompetencyObjectType();
    }

    /**
     * Create an instance of {@link GlobalSetupDataMappingObjectIDType }
     * 
     */
    public GlobalSetupDataMappingObjectIDType createGlobalSetupDataMappingObjectIDType() {
        return new GlobalSetupDataMappingObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerCompensationDataType }
     * 
     */
    public WorkerCompensationDataType createWorkerCompensationDataType() {
        return new WorkerCompensationDataType();
    }

    /**
     * Create an instance of {@link WeekOfTheMonthObjectIDType }
     * 
     */
    public WeekOfTheMonthObjectIDType createWeekOfTheMonthObjectIDType() {
        return new WeekOfTheMonthObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemAttachmentObjectType }
     * 
     */
    public CommitteeMeetingAgendaItemAttachmentObjectType createCommitteeMeetingAgendaItemAttachmentObjectType() {
        return new CommitteeMeetingAgendaItemAttachmentObjectType();
    }

    /**
     * Create an instance of {@link SuccessionReadinessObjectType }
     * 
     */
    public SuccessionReadinessObjectType createSuccessionReadinessObjectType() {
        return new SuccessionReadinessObjectType();
    }

    /**
     * Create an instance of {@link PeriodSalaryPlanObjectType }
     * 
     */
    public PeriodSalaryPlanObjectType createPeriodSalaryPlanObjectType() {
        return new PeriodSalaryPlanObjectType();
    }

    /**
     * Create an instance of {@link WorkerHealthSavingsAccountPeriodDataType }
     * 
     */
    public WorkerHealthSavingsAccountPeriodDataType createWorkerHealthSavingsAccountPeriodDataType() {
        return new WorkerHealthSavingsAccountPeriodDataType();
    }

    /**
     * Create an instance of {@link JobClassificationObjectType }
     * 
     */
    public JobClassificationObjectType createJobClassificationObjectType() {
        return new JobClassificationObjectType();
    }

    /**
     * Create an instance of {@link CourseDefinitionObjectIDType }
     * 
     */
    public CourseDefinitionObjectIDType createCourseDefinitionObjectIDType() {
        return new CourseDefinitionObjectIDType();
    }

    /**
     * Create an instance of {@link LocationUsageObjectType }
     * 
     */
    public LocationUsageObjectType createLocationUsageObjectType() {
        return new LocationUsageObjectType();
    }

    /**
     * Create an instance of {@link JobProfileForJobFamilyDataType }
     * 
     */
    public JobProfileForJobFamilyDataType createJobProfileForJobFamilyDataType() {
        return new JobProfileForJobFamilyDataType();
    }

    /**
     * Create an instance of {@link InstantMessengerInformationDataType }
     * 
     */
    public InstantMessengerInformationDataType createInstantMessengerInformationDataType() {
        return new InstantMessengerInformationDataType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupRequestReferencesType }
     * 
     */
    public ProvisioningGroupRequestReferencesType createProvisioningGroupRequestReferencesType() {
        return new ProvisioningGroupRequestReferencesType();
    }

    /**
     * Create an instance of {@link CustomIDTypeObjectType }
     * 
     */
    public CustomIDTypeObjectType createCustomIDTypeObjectType() {
        return new CustomIDTypeObjectType();
    }

    /**
     * Create an instance of {@link ResponseResultsType }
     * 
     */
    public ResponseResultsType createResponseResultsType() {
        return new ResponseResultsType();
    }

    /**
     * Create an instance of {@link OneTimePaymentPlanObjectIDType }
     * 
     */
    public OneTimePaymentPlanObjectIDType createOneTimePaymentPlanObjectIDType() {
        return new OneTimePaymentPlanObjectIDType();
    }

    /**
     * Create an instance of {@link CourseSubjectObjectType }
     * 
     */
    public CourseSubjectObjectType createCourseSubjectObjectType() {
        return new CourseSubjectObjectType();
    }

    /**
     * Create an instance of {@link PersonSkillSourceCategoryObjectIDType }
     * 
     */
    public PersonSkillSourceCategoryObjectIDType createPersonSkillSourceCategoryObjectIDType() {
        return new PersonSkillSourceCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link WorkingTimeUnitObjectType }
     * 
     */
    public WorkingTimeUnitObjectType createWorkingTimeUnitObjectType() {
        return new WorkingTimeUnitObjectType();
    }

    /**
     * Create an instance of {@link GenericDisabilityStatusInformationDataType }
     * 
     */
    public GenericDisabilityStatusInformationDataType createGenericDisabilityStatusInformationDataType() {
        return new GenericDisabilityStatusInformationDataType();
    }

    /**
     * Create an instance of {@link CommissionPlanObjectIDType }
     * 
     */
    public CommissionPlanObjectIDType createCommissionPlanObjectIDType() {
        return new CommissionPlanObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeTypeResponseDataType }
     * 
     */
    public CommitteeTypeResponseDataType createCommitteeTypeResponseDataType() {
        return new CommitteeTypeResponseDataType();
    }

    /**
     * Create an instance of {@link EventClassificationCategoryObjectIDType }
     * 
     */
    public EventClassificationCategoryObjectIDType createEventClassificationCategoryObjectIDType() {
        return new EventClassificationCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link PerformanceImprovementPlanObjectIDType }
     * 
     */
    public PerformanceImprovementPlanObjectIDType createPerformanceImprovementPlanObjectIDType() {
        return new PerformanceImprovementPlanObjectIDType();
    }

    /**
     * Create an instance of {@link PositionPayrollInterfaceDetailDataType }
     * 
     */
    public PositionPayrollInterfaceDetailDataType createPositionPayrollInterfaceDetailDataType() {
        return new PositionPayrollInterfaceDetailDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementObjectIDType }
     * 
     */
    public CollectiveAgreementObjectIDType createCollectiveAgreementObjectIDType() {
        return new CollectiveAgreementObjectIDType();
    }

    /**
     * Create an instance of {@link MonthObjectIDType }
     * 
     */
    public MonthObjectIDType createMonthObjectIDType() {
        return new MonthObjectIDType();
    }

    /**
     * Create an instance of {@link WebServiceBackgroundProcessRuntimeObjectType }
     * 
     */
    public WebServiceBackgroundProcessRuntimeObjectType createWebServiceBackgroundProcessRuntimeObjectType() {
        return new WebServiceBackgroundProcessRuntimeObjectType();
    }

    /**
     * Create an instance of {@link WorkExperienceSkillObjectType }
     * 
     */
    public WorkExperienceSkillObjectType createWorkExperienceSkillObjectType() {
        return new WorkExperienceSkillObjectType();
    }

    /**
     * Create an instance of {@link BeneficiaryDesignationDataType }
     * 
     */
    public BeneficiaryDesignationDataType createBeneficiaryDesignationDataType() {
        return new BeneficiaryDesignationDataType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentRestrictionsType }
     * 
     */
    public OrganizationAssignmentRestrictionsType createOrganizationAssignmentRestrictionsType() {
        return new OrganizationAssignmentRestrictionsType();
    }

    /**
     * Create an instance of {@link PreviousSystemJobHistoryDetailDataType }
     * 
     */
    public PreviousSystemJobHistoryDetailDataType createPreviousSystemJobHistoryDetailDataType() {
        return new PreviousSystemJobHistoryDetailDataType();
    }

    /**
     * Create an instance of {@link PayGroupAssignmentCorrectOrRescindedOrganizationDataType }
     * 
     */
    public PayGroupAssignmentCorrectOrRescindedOrganizationDataType createPayGroupAssignmentCorrectOrRescindedOrganizationDataType() {
        return new PayGroupAssignmentCorrectOrRescindedOrganizationDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeResponseDataType }
     * 
     */
    public CommitteeMembershipTypeResponseDataType createCommitteeMembershipTypeResponseDataType() {
        return new CommitteeMembershipTypeResponseDataType();
    }

    /**
     * Create an instance of {@link GovernmentIDTypeAllObjectIDType }
     * 
     */
    public GovernmentIDTypeAllObjectIDType createGovernmentIDTypeAllObjectIDType() {
        return new GovernmentIDTypeAllObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeContractTypeObjectIDType }
     * 
     */
    public EmployeeContractTypeObjectIDType createEmployeeContractTypeObjectIDType() {
        return new EmployeeContractTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetRequestCriteriaType }
     * 
     */
    public WorkStatusRuleSetRequestCriteriaType createWorkStatusRuleSetRequestCriteriaType() {
        return new WorkStatusRuleSetRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarResponseGroupType }
     * 
     */
    public WorkScheduleCalendarResponseGroupType createWorkScheduleCalendarResponseGroupType() {
        return new WorkScheduleCalendarResponseGroupType();
    }

    /**
     * Create an instance of {@link PreviousSystemJobHistoryDataType }
     * 
     */
    public PreviousSystemJobHistoryDataType createPreviousSystemJobHistoryDataType() {
        return new PreviousSystemJobHistoryDataType();
    }

    /**
     * Create an instance of {@link GovernmentIDType }
     * 
     */
    public GovernmentIDType createGovernmentIDType() {
        return new GovernmentIDType();
    }

    /**
     * Create an instance of {@link PositionElementObjectType }
     * 
     */
    public PositionElementObjectType createPositionElementObjectType() {
        return new PositionElementObjectType();
    }

    /**
     * Create an instance of {@link ChangePersonalInformationBusinessProcessDataType }
     * 
     */
    public ChangePersonalInformationBusinessProcessDataType createChangePersonalInformationBusinessProcessDataType() {
        return new ChangePersonalInformationBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link FormerWorkerRequestCriteriaType }
     * 
     */
    public FormerWorkerRequestCriteriaType createFormerWorkerRequestCriteriaType() {
        return new FormerWorkerRequestCriteriaType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAttachmentDataType }
     * 
     */
    public CommitteeMeetingAttachmentDataType createCommitteeMeetingAttachmentDataType() {
        return new CommitteeMeetingAttachmentDataType();
    }

    /**
     * Create an instance of {@link FeedbackReceivedDataType }
     * 
     */
    public FeedbackReceivedDataType createFeedbackReceivedDataType() {
        return new FeedbackReceivedDataType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType createEmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType() {
        return new EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsRequestCriteriaType }
     * 
     */
    public AssignUserBasedSecurityGroupsRequestCriteriaType createAssignUserBasedSecurityGroupsRequestCriteriaType() {
        return new AssignUserBasedSecurityGroupsRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PayrollInterfaceContributionAmountDataType }
     * 
     */
    public PayrollInterfaceContributionAmountDataType createPayrollInterfaceContributionAmountDataType() {
        return new PayrollInterfaceContributionAmountDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactor1DataType }
     * 
     */
    public CollectiveAgreementFactor1DataType createCollectiveAgreementFactor1DataType() {
        return new CollectiveAgreementFactor1DataType();
    }

    /**
     * Create an instance of {@link PhoneDeviceTypeReferenceType }
     * 
     */
    public PhoneDeviceTypeReferenceType createPhoneDeviceTypeReferenceType() {
        return new PhoneDeviceTypeReferenceType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentSnapshotDataType }
     * 
     */
    public AcademicAppointmentSnapshotDataType createAcademicAppointmentSnapshotDataType() {
        return new AcademicAppointmentSnapshotDataType();
    }

    /**
     * Create an instance of {@link DisciplinaryActionDataType }
     * 
     */
    public DisciplinaryActionDataType createDisciplinaryActionDataType() {
        return new DisciplinaryActionDataType();
    }

    /**
     * Create an instance of {@link PerformanceImprovementPlanObjectType }
     * 
     */
    public PerformanceImprovementPlanObjectType createPerformanceImprovementPlanObjectType() {
        return new PerformanceImprovementPlanObjectType();
    }

    /**
     * Create an instance of {@link DevelopmentItemObjectType }
     * 
     */
    public DevelopmentItemObjectType createDevelopmentItemObjectType() {
        return new DevelopmentItemObjectType();
    }

    /**
     * Create an instance of {@link ReviewRatingObjectType }
     * 
     */
    public ReviewRatingObjectType createReviewRatingObjectType() {
        return new ReviewRatingObjectType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupType }
     * 
     */
    public ProvisioningGroupType createProvisioningGroupType() {
        return new ProvisioningGroupType();
    }

    /**
     * Create an instance of {@link LanguageAbilityTypeObjectIDType }
     * 
     */
    public LanguageAbilityTypeObjectIDType createLanguageAbilityTypeObjectIDType() {
        return new LanguageAbilityTypeObjectIDType();
    }

    /**
     * Create an instance of {@link JobHistoryAchievementDataType }
     * 
     */
    public JobHistoryAchievementDataType createJobHistoryAchievementDataType() {
        return new JobHistoryAchievementDataType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarRowObjectType }
     * 
     */
    public PeriodReportingCalendarRowObjectType createPeriodReportingCalendarRowObjectType() {
        return new PeriodReportingCalendarRowObjectType();
    }

    /**
     * Create an instance of {@link ExternalContactDataType }
     * 
     */
    public ExternalContactDataType createExternalContactDataType() {
        return new ExternalContactDataType();
    }

    /**
     * Create an instance of {@link JobProfileObjectType }
     * 
     */
    public JobProfileObjectType createJobProfileObjectType() {
        return new JobProfileObjectType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationRelationshipTypeObjectType }
     * 
     */
    public ProfessionalAffiliationRelationshipTypeObjectType createProfessionalAffiliationRelationshipTypeObjectType() {
        return new ProfessionalAffiliationRelationshipTypeObjectType();
    }

    /**
     * Create an instance of {@link TalentAssessmentDataType }
     * 
     */
    public TalentAssessmentDataType createTalentAssessmentDataType() {
        return new TalentAssessmentDataType();
    }

    /**
     * Create an instance of {@link PersonAccountProvisioningDataType }
     * 
     */
    public PersonAccountProvisioningDataType createPersonAccountProvisioningDataType() {
        return new PersonAccountProvisioningDataType();
    }

    /**
     * Create an instance of {@link BenefitProviderSummaryDataType }
     * 
     */
    public BenefitProviderSummaryDataType createBenefitProviderSummaryDataType() {
        return new BenefitProviderSummaryDataType();
    }

    /**
     * Create an instance of {@link ExternalFieldAndParameterInitializationProviderObjectType }
     * 
     */
    public ExternalFieldAndParameterInitializationProviderObjectType createExternalFieldAndParameterInitializationProviderObjectType() {
        return new ExternalFieldAndParameterInitializationProviderObjectType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountDataType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountDataType createServiceCenterRepresentativeWorkdayAccountDataType() {
        return new ServiceCenterRepresentativeWorkdayAccountDataType();
    }

    /**
     * Create an instance of {@link JobCategoryRequestReferencesType }
     * 
     */
    public JobCategoryRequestReferencesType createJobCategoryRequestReferencesType() {
        return new JobCategoryRequestReferencesType();
    }

    /**
     * Create an instance of {@link RelativeTypeObjectIDType }
     * 
     */
    public RelativeTypeObjectIDType createRelativeTypeObjectIDType() {
        return new RelativeTypeObjectIDType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupNewType }
     * 
     */
    public JobFamilyGroupNewType createJobFamilyGroupNewType() {
        return new JobFamilyGroupNewType();
    }

    /**
     * Create an instance of {@link StaffDefaultDataType }
     * 
     */
    public StaffDefaultDataType createStaffDefaultDataType() {
        return new StaffDefaultDataType();
    }

    /**
     * Create an instance of {@link ChangeHomeContactInformationResponseWrapperType }
     * 
     */
    public ChangeHomeContactInformationResponseWrapperType createChangeHomeContactInformationResponseWrapperType() {
        return new ChangeHomeContactInformationResponseWrapperType();
    }

    /**
     * Create an instance of {@link ScheduleRequestTypeObjectType }
     * 
     */
    public ScheduleRequestTypeObjectType createScheduleRequestTypeObjectType() {
        return new ScheduleRequestTypeObjectType();
    }

    /**
     * Create an instance of {@link ManageEducationDataForRoleType }
     * 
     */
    public ManageEducationDataForRoleType createManageEducationDataForRoleType() {
        return new ManageEducationDataForRoleType();
    }

    /**
     * Create an instance of {@link BusinessProcessCommentDataType }
     * 
     */
    public BusinessProcessCommentDataType createBusinessProcessCommentDataType() {
        return new BusinessProcessCommentDataType();
    }

    /**
     * Create an instance of {@link CompanyInsiderJobProfileDataType }
     * 
     */
    public CompanyInsiderJobProfileDataType createCompanyInsiderJobProfileDataType() {
        return new CompanyInsiderJobProfileDataType();
    }

    /**
     * Create an instance of {@link MilitaryStatusObjectIDType }
     * 
     */
    public MilitaryStatusObjectIDType createMilitaryStatusObjectIDType() {
        return new MilitaryStatusObjectIDType();
    }

    /**
     * Create an instance of {@link VisaIDDataType }
     * 
     */
    public VisaIDDataType createVisaIDDataType() {
        return new VisaIDDataType();
    }

    /**
     * Create an instance of {@link GenderObjectIDType }
     * 
     */
    public GenderObjectIDType createGenderObjectIDType() {
        return new GenderObjectIDType();
    }

    /**
     * Create an instance of {@link CompensationPayEarningObjectType }
     * 
     */
    public CompensationPayEarningObjectType createCompensationPayEarningObjectType() {
        return new CompensationPayEarningObjectType();
    }

    /**
     * Create an instance of {@link WorkerOrganizationRoleAssignmentDataType }
     * 
     */
    public WorkerOrganizationRoleAssignmentDataType createWorkerOrganizationRoleAssignmentDataType() {
        return new WorkerOrganizationRoleAssignmentDataType();
    }

    /**
     * Create an instance of {@link UnionMembershipTypeObjectIDType }
     * 
     */
    public UnionMembershipTypeObjectIDType createUnionMembershipTypeObjectIDType() {
        return new UnionMembershipTypeObjectIDType();
    }

    /**
     * Create an instance of {@link SchoolObjectType }
     * 
     */
    public SchoolObjectType createSchoolObjectType() {
        return new SchoolObjectType();
    }

    /**
     * Create an instance of {@link WorkerInsurancePeriodDataType }
     * 
     */
    public WorkerInsurancePeriodDataType createWorkerInsurancePeriodDataType() {
        return new WorkerInsurancePeriodDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeResponseGroupType }
     * 
     */
    public ServiceCenterRepresentativeResponseGroupType createServiceCenterRepresentativeResponseGroupType() {
        return new ServiceCenterRepresentativeResponseGroupType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeEnabledObjectType }
     * 
     */
    public AcademicAppointeeEnabledObjectType createAcademicAppointeeEnabledObjectType() {
        return new AcademicAppointeeEnabledObjectType();
    }

    /**
     * Create an instance of {@link CommunicationUsageTypeObjectIDType }
     * 
     */
    public CommunicationUsageTypeObjectIDType createCommunicationUsageTypeObjectIDType() {
        return new CommunicationUsageTypeObjectIDType();
    }

    /**
     * Create an instance of {@link GoalObjectIDType }
     * 
     */
    public GoalObjectIDType createGoalObjectIDType() {
        return new GoalObjectIDType();
    }

    /**
     * Create an instance of {@link JobProfileResponseDataType }
     * 
     */
    public JobProfileResponseDataType createJobProfileResponseDataType() {
        return new JobProfileResponseDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeRequestCriteriaType }
     * 
     */
    public AcademicAppointeeRequestCriteriaType createAcademicAppointeeRequestCriteriaType() {
        return new AcademicAppointeeRequestCriteriaType();
    }

    /**
     * Create an instance of {@link FormerWorkerRelatedDataType }
     * 
     */
    public FormerWorkerRelatedDataType createFormerWorkerRelatedDataType() {
        return new FormerWorkerRelatedDataType();
    }

    /**
     * Create an instance of {@link AuthorityObjectType }
     * 
     */
    public AuthorityObjectType createAuthorityObjectType() {
        return new AuthorityObjectType();
    }

    /**
     * Create an instance of {@link PersonalInformationDataType }
     * 
     */
    public PersonalInformationDataType createPersonalInformationDataType() {
        return new PersonalInformationDataType();
    }

    /**
     * Create an instance of {@link AcademicTrackTypeObjectIDType }
     * 
     */
    public AcademicTrackTypeObjectIDType createAcademicTrackTypeObjectIDType() {
        return new AcademicTrackTypeObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodTypeObjectType }
     * 
     */
    public EmployeeProbationPeriodTypeObjectType createEmployeeProbationPeriodTypeObjectType() {
        return new EmployeeProbationPeriodTypeObjectType();
    }

    /**
     * Create an instance of {@link WorkerPhotoType }
     * 
     */
    public WorkerPhotoType createWorkerPhotoType() {
        return new WorkerPhotoType();
    }

    /**
     * Create an instance of {@link BeneficiaryDataType }
     * 
     */
    public BeneficiaryDataType createBeneficiaryDataType() {
        return new BeneficiaryDataType();
    }

    /**
     * Create an instance of {@link PhoneNumberDataType }
     * 
     */
    public PhoneNumberDataType createPhoneNumberDataType() {
        return new PhoneNumberDataType();
    }

    /**
     * Create an instance of {@link BusinessSubProcessParametersType }
     * 
     */
    public BusinessSubProcessParametersType createBusinessSubProcessParametersType() {
        return new BusinessSubProcessParametersType();
    }

    /**
     * Create an instance of {@link WorkerEditingOptionsDataType }
     * 
     */
    public WorkerEditingOptionsDataType createWorkerEditingOptionsDataType() {
        return new WorkerEditingOptionsDataType();
    }

    /**
     * Create an instance of {@link EmployeeContractTypeObjectType }
     * 
     */
    public EmployeeContractTypeObjectType createEmployeeContractTypeObjectType() {
        return new EmployeeContractTypeObjectType();
    }

    /**
     * Create an instance of {@link JobFamiliesRequestCriteriaType }
     * 
     */
    public JobFamiliesRequestCriteriaType createJobFamiliesRequestCriteriaType() {
        return new JobFamiliesRequestCriteriaType();
    }

    /**
     * Create an instance of {@link LocationUsageObjectIDType }
     * 
     */
    public LocationUsageObjectIDType createLocationUsageObjectIDType() {
        return new LocationUsageObjectIDType();
    }

    /**
     * Create an instance of {@link HolidayCalendarResponseGroupType }
     * 
     */
    public HolidayCalendarResponseGroupType createHolidayCalendarResponseGroupType() {
        return new HolidayCalendarResponseGroupType();
    }

    /**
     * Create an instance of {@link SexualOrientationObjectType }
     * 
     */
    public SexualOrientationObjectType createSexualOrientationObjectType() {
        return new SexualOrientationObjectType();
    }

    /**
     * Create an instance of {@link BusinessSiteReferencesType }
     * 
     */
    public BusinessSiteReferencesType createBusinessSiteReferencesType() {
        return new BusinessSiteReferencesType();
    }

    /**
     * Create an instance of {@link RelativeNameDataType }
     * 
     */
    public RelativeNameDataType createRelativeNameDataType() {
        return new RelativeNameDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeDataType }
     * 
     */
    public AcademicAppointeeDataType createAcademicAppointeeDataType() {
        return new AcademicAppointeeDataType();
    }

    /**
     * Create an instance of {@link CompensationPeriodObjectType }
     * 
     */
    public CompensationPeriodObjectType createCompensationPeriodObjectType() {
        return new CompensationPeriodObjectType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementSnapshotDataType }
     * 
     */
    public CollectiveAgreementSnapshotDataType createCollectiveAgreementSnapshotDataType() {
        return new CollectiveAgreementSnapshotDataType();
    }

    /**
     * Create an instance of {@link SexualOrientationType }
     * 
     */
    public SexualOrientationType createSexualOrientationType() {
        return new SexualOrientationType();
    }

    /**
     * Create an instance of {@link AwardObjectIDType }
     * 
     */
    public AwardObjectIDType createAwardObjectIDType() {
        return new AwardObjectIDType();
    }

    /**
     * Create an instance of {@link ContributionDataType }
     * 
     */
    public ContributionDataType createContributionDataType() {
        return new ContributionDataType();
    }

    /**
     * Create an instance of {@link LeaveOfAbsenceTypeObjectType }
     * 
     */
    public LeaveOfAbsenceTypeObjectType createLeaveOfAbsenceTypeObjectType() {
        return new LeaveOfAbsenceTypeObjectType();
    }

    /**
     * Create an instance of {@link GenderIdentityType }
     * 
     */
    public GenderIdentityType createGenderIdentityType() {
        return new GenderIdentityType();
    }

    /**
     * Create an instance of {@link NamedProfessorshipSnapshotDataType }
     * 
     */
    public NamedProfessorshipSnapshotDataType createNamedProfessorshipSnapshotDataType() {
        return new NamedProfessorshipSnapshotDataType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDsBusinessProcessDataType }
     * 
     */
    public ChangeGovernmentIDsBusinessProcessDataType createChangeGovernmentIDsBusinessProcessDataType() {
        return new ChangeGovernmentIDsBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link UserBasedSecurityGroupRequestReferencesType }
     * 
     */
    public UserBasedSecurityGroupRequestReferencesType createUserBasedSecurityGroupRequestReferencesType() {
        return new UserBasedSecurityGroupRequestReferencesType();
    }

    /**
     * Create an instance of {@link CompensationPackageReferenceType }
     * 
     */
    public CompensationPackageReferenceType createCompensationPackageReferenceType() {
        return new CompensationPackageReferenceType();
    }

    /**
     * Create an instance of {@link LanguageObjectIDType }
     * 
     */
    public LanguageObjectIDType createLanguageObjectIDType() {
        return new LanguageObjectIDType();
    }

    /**
     * Create an instance of {@link CompensationMatrixObjectType }
     * 
     */
    public CompensationMatrixObjectType createCompensationMatrixObjectType() {
        return new CompensationMatrixObjectType();
    }

    /**
     * Create an instance of {@link EmployeePeriodSalaryPlanAssignmentDataType }
     * 
     */
    public EmployeePeriodSalaryPlanAssignmentDataType createEmployeePeriodSalaryPlanAssignmentDataType() {
        return new EmployeePeriodSalaryPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeDataType }
     * 
     */
    public ServiceCenterRepresentativeDataType createServiceCenterRepresentativeDataType() {
        return new ServiceCenterRepresentativeDataType();
    }

    /**
     * Create an instance of {@link InstantMessengerTypeObjectType }
     * 
     */
    public InstantMessengerTypeObjectType createInstantMessengerTypeObjectType() {
        return new InstantMessengerTypeObjectType();
    }

    /**
     * Create an instance of {@link UniqueIdentifierObjectIDType }
     * 
     */
    public UniqueIdentifierObjectIDType createUniqueIdentifierObjectIDType() {
        return new UniqueIdentifierObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingVoteStatusObjectType }
     * 
     */
    public CommitteeMeetingVoteStatusObjectType createCommitteeMeetingVoteStatusObjectType() {
        return new CommitteeMeetingVoteStatusObjectType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarResponseDataType }
     * 
     */
    public PeriodReportingCalendarResponseDataType createPeriodReportingCalendarResponseDataType() {
        return new PeriodReportingCalendarResponseDataType();
    }

    /**
     * Create an instance of {@link GeneralEventSubcategoryObjectType }
     * 
     */
    public GeneralEventSubcategoryObjectType createGeneralEventSubcategoryObjectType() {
        return new GeneralEventSubcategoryObjectType();
    }

    /**
     * Create an instance of {@link CertificationSkillObjectIDType }
     * 
     */
    public CertificationSkillObjectIDType createCertificationSkillObjectIDType() {
        return new CertificationSkillObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationRolesWWSDataType }
     * 
     */
    public OrganizationRolesWWSDataType createOrganizationRolesWWSDataType() {
        return new OrganizationRolesWWSDataType();
    }

    /**
     * Create an instance of {@link StudentAwardSourceObjectType }
     * 
     */
    public StudentAwardSourceObjectType createStudentAwardSourceObjectType() {
        return new StudentAwardSourceObjectType();
    }

    /**
     * Create an instance of {@link JobProfileObjectIDType }
     * 
     */
    public JobProfileObjectIDType createJobProfileObjectIDType() {
        return new JobProfileObjectIDType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupObjectIDType }
     * 
     */
    public JobClassificationGroupObjectIDType createJobClassificationGroupObjectIDType() {
        return new JobClassificationGroupObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicPeriodObjectIDType }
     * 
     */
    public AcademicPeriodObjectIDType createAcademicPeriodObjectIDType() {
        return new AcademicPeriodObjectIDType();
    }

    /**
     * Create an instance of {@link CommunicationUsageTypeReferenceType }
     * 
     */
    public CommunicationUsageTypeReferenceType createCommunicationUsageTypeReferenceType() {
        return new CommunicationUsageTypeReferenceType();
    }

    /**
     * Create an instance of {@link BenefitPlanSummaryDataType }
     * 
     */
    public BenefitPlanSummaryDataType createBenefitPlanSummaryDataType() {
        return new BenefitPlanSummaryDataType();
    }

    /**
     * Create an instance of {@link RelatedPersonsDataType }
     * 
     */
    public RelatedPersonsDataType createRelatedPersonsDataType() {
        return new RelatedPersonsDataType();
    }

    /**
     * Create an instance of {@link MilitaryServiceTypeObjectType }
     * 
     */
    public MilitaryServiceTypeObjectType createMilitaryServiceTypeObjectType() {
        return new MilitaryServiceTypeObjectType();
    }

    /**
     * Create an instance of {@link BusinessProcessTypeReferenceDataType }
     * 
     */
    public BusinessProcessTypeReferenceDataType createBusinessProcessTypeReferenceDataType() {
        return new BusinessProcessTypeReferenceDataType();
    }

    /**
     * Create an instance of {@link WorkExperienceSkillObjectIDType }
     * 
     */
    public WorkExperienceSkillObjectIDType createWorkExperienceSkillObjectIDType() {
        return new WorkExperienceSkillObjectIDType();
    }

    /**
     * Create an instance of {@link PlanEligiblityDatesDataType }
     * 
     */
    public PlanEligiblityDatesDataType createPlanEligiblityDatesDataType() {
        return new PlanEligiblityDatesDataType();
    }

    /**
     * Create an instance of {@link LocationTypeObjectType }
     * 
     */
    public LocationTypeObjectType createLocationTypeObjectType() {
        return new LocationTypeObjectType();
    }

    /**
     * Create an instance of {@link EstablishmentLegalEntityObjectType }
     * 
     */
    public EstablishmentLegalEntityObjectType createEstablishmentLegalEntityObjectType() {
        return new EstablishmentLegalEntityObjectType();
    }

    /**
     * Create an instance of {@link DeliveryModeObjectType }
     * 
     */
    public DeliveryModeObjectType createDeliveryModeObjectType() {
        return new DeliveryModeObjectType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupDataType }
     * 
     */
    public JobFamilyGroupDataType createJobFamilyGroupDataType() {
        return new JobFamilyGroupDataType();
    }

    /**
     * Create an instance of {@link CommunicationUsageBehaviorTenantedObjectType }
     * 
     */
    public CommunicationUsageBehaviorTenantedObjectType createCommunicationUsageBehaviorTenantedObjectType() {
        return new CommunicationUsageBehaviorTenantedObjectType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyDataType }
     * 
     */
    public AppointmentSpecialtyDataType createAppointmentSpecialtyDataType() {
        return new AppointmentSpecialtyDataType();
    }

    /**
     * Create an instance of {@link SchoolObjectIDType }
     * 
     */
    public SchoolObjectIDType createSchoolObjectIDType() {
        return new SchoolObjectIDType();
    }

    /**
     * Create an instance of {@link USVeteranStatusTenantedObjectIDType }
     * 
     */
    public USVeteranStatusTenantedObjectIDType createUSVeteranStatusTenantedObjectIDType() {
        return new USVeteranStatusTenantedObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationSubtypeReferenceDataType }
     * 
     */
    public OrganizationSubtypeReferenceDataType createOrganizationSubtypeReferenceDataType() {
        return new OrganizationSubtypeReferenceDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetResponseDataType }
     * 
     */
    public WorkStatusRuleSetResponseDataType createWorkStatusRuleSetResponseDataType() {
        return new WorkStatusRuleSetResponseDataType();
    }

    /**
     * Create an instance of {@link TransactionLogCriteriaType }
     * 
     */
    public TransactionLogCriteriaType createTransactionLogCriteriaType() {
        return new TransactionLogCriteriaType();
    }

    /**
     * Create an instance of {@link VisaIDTypeObjectType }
     * 
     */
    public VisaIDTypeObjectType createVisaIDTypeObjectType() {
        return new VisaIDTypeObjectType();
    }

    /**
     * Create an instance of {@link OrganizationStructureDissolveDataType }
     * 
     */
    public OrganizationStructureDissolveDataType createOrganizationStructureDissolveDataType() {
        return new OrganizationStructureDissolveDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingMinutesObjectIDType }
     * 
     */
    public CommitteeMeetingMinutesObjectIDType createCommitteeMeetingMinutesObjectIDType() {
        return new CommitteeMeetingMinutesObjectIDType();
    }

    /**
     * Create an instance of {@link LossImpactObjectIDType }
     * 
     */
    public LossImpactObjectIDType createLossImpactObjectIDType() {
        return new LossImpactObjectIDType();
    }

    /**
     * Create an instance of {@link LocationHierarchyObjectType }
     * 
     */
    public LocationHierarchyObjectType createLocationHierarchyObjectType() {
        return new LocationHierarchyObjectType();
    }

    /**
     * Create an instance of {@link BackgroundCheckEventObjectIDType }
     * 
     */
    public BackgroundCheckEventObjectIDType createBackgroundCheckEventObjectIDType() {
        return new BackgroundCheckEventObjectIDType();
    }

    /**
     * Create an instance of {@link InternalProjectExperienceDataType }
     * 
     */
    public InternalProjectExperienceDataType createInternalProjectExperienceDataType() {
        return new InternalProjectExperienceDataType();
    }

    /**
     * Create an instance of {@link WorkerBenefitEligibilityDataType }
     * 
     */
    public WorkerBenefitEligibilityDataType createWorkerBenefitEligibilityDataType() {
        return new WorkerBenefitEligibilityDataType();
    }

    /**
     * Create an instance of {@link WorkShiftType }
     * 
     */
    public WorkShiftType createWorkShiftType() {
        return new WorkShiftType();
    }

    /**
     * Create an instance of {@link RoleAssignerObjectIDType }
     * 
     */
    public RoleAssignerObjectIDType createRoleAssignerObjectIDType() {
        return new RoleAssignerObjectIDType();
    }

    /**
     * Create an instance of {@link JobHistorySkillObjectType }
     * 
     */
    public JobHistorySkillObjectType createJobHistorySkillObjectType() {
        return new JobHistorySkillObjectType();
    }

    /**
     * Create an instance of {@link ServiceCenterObjectIDType }
     * 
     */
    public ServiceCenterObjectIDType createServiceCenterObjectIDType() {
        return new ServiceCenterObjectIDType();
    }

    /**
     * Create an instance of {@link DegreeObjectIDType }
     * 
     */
    public DegreeObjectIDType createDegreeObjectIDType() {
        return new DegreeObjectIDType();
    }

    /**
     * Create an instance of {@link LanguageAchievementDataType }
     * 
     */
    public LanguageAchievementDataType createLanguageAchievementDataType() {
        return new LanguageAchievementDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTargetObjectIDType }
     * 
     */
    public CommitteeMembershipTargetObjectIDType createCommitteeMembershipTargetObjectIDType() {
        return new CommitteeMembershipTargetObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerType }
     * 
     */
    public FormerWorkerType createFormerWorkerType() {
        return new FormerWorkerType();
    }

    /**
     * Create an instance of {@link LanguageProficiencyObjectIDType }
     * 
     */
    public LanguageProficiencyObjectIDType createLanguageProficiencyObjectIDType() {
        return new LanguageProficiencyObjectIDType();
    }

    /**
     * Create an instance of {@link RelativeTypeObjectType }
     * 
     */
    public RelativeTypeObjectType createRelativeTypeObjectType() {
        return new RelativeTypeObjectType();
    }

    /**
     * Create an instance of {@link MilitaryServiceReferenceObjectIDType }
     * 
     */
    public MilitaryServiceReferenceObjectIDType createMilitaryServiceReferenceObjectIDType() {
        return new MilitaryServiceReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link EligibilityCriteriaDataType }
     * 
     */
    public EligibilityCriteriaDataType createEligibilityCriteriaDataType() {
        return new EligibilityCriteriaDataType();
    }

    /**
     * Create an instance of {@link PerformanceReviewDataType }
     * 
     */
    public PerformanceReviewDataType createPerformanceReviewDataType() {
        return new PerformanceReviewDataType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordResponseDataType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordResponseDataType createExternalDisabilitySelfIdentificationRecordResponseDataType() {
        return new ExternalDisabilitySelfIdentificationRecordResponseDataType();
    }

    /**
     * Create an instance of {@link EmergencyContactPriorityObjectType }
     * 
     */
    public EmergencyContactPriorityObjectType createEmergencyContactPriorityObjectType() {
        return new EmergencyContactPriorityObjectType();
    }

    /**
     * Create an instance of {@link ReassignSuperiorToInactiveOrganizationDataType }
     * 
     */
    public ReassignSuperiorToInactiveOrganizationDataType createReassignSuperiorToInactiveOrganizationDataType() {
        return new ReassignSuperiorToInactiveOrganizationDataType();
    }

    /**
     * Create an instance of {@link EmployeeDataType }
     * 
     */
    public EmployeeDataType createEmployeeDataType() {
        return new EmployeeDataType();
    }

    /**
     * Create an instance of {@link LocationAttributeResponseDataType }
     * 
     */
    public LocationAttributeResponseDataType createLocationAttributeResponseDataType() {
        return new LocationAttributeResponseDataType();
    }

    /**
     * Create an instance of {@link SkillType }
     * 
     */
    public SkillType createSkillType() {
        return new SkillType();
    }

    /**
     * Create an instance of {@link OrganizationOwnerObjectType }
     * 
     */
    public OrganizationOwnerObjectType createOrganizationOwnerObjectType() {
        return new OrganizationOwnerObjectType();
    }

    /**
     * Create an instance of {@link AcademicUnitResponseDataType }
     * 
     */
    public AcademicUnitResponseDataType createAcademicUnitResponseDataType() {
        return new AcademicUnitResponseDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactor5DataType }
     * 
     */
    public CollectiveAgreementFactor5DataType createCollectiveAgreementFactor5DataType() {
        return new CollectiveAgreementFactor5DataType();
    }

    /**
     * Create an instance of {@link WorkerHealthSavingsAccountDataType }
     * 
     */
    public WorkerHealthSavingsAccountDataType createWorkerHealthSavingsAccountDataType() {
        return new WorkerHealthSavingsAccountDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorParameterDataType }
     * 
     */
    public CollectiveAgreementFactorParameterDataType createCollectiveAgreementFactorParameterDataType() {
        return new CollectiveAgreementFactorParameterDataType();
    }

    /**
     * Create an instance of {@link AddressDataType }
     * 
     */
    public AddressDataType createAddressDataType() {
        return new AddressDataType();
    }

    /**
     * Create an instance of {@link EducationType }
     * 
     */
    public EducationType createEducationType() {
        return new EducationType();
    }

    /**
     * Create an instance of {@link CommitteeAttachmentObjectIDType }
     * 
     */
    public CommitteeAttachmentObjectIDType createCommitteeAttachmentObjectIDType() {
        return new CommitteeAttachmentObjectIDType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupRequestReferencesType }
     * 
     */
    public JobFamilyGroupRequestReferencesType createJobFamilyGroupRequestReferencesType() {
        return new JobFamilyGroupRequestReferencesType();
    }

    /**
     * Create an instance of {@link LocationResponseType }
     * 
     */
    public LocationResponseType createLocationResponseType() {
        return new LocationResponseType();
    }

    /**
     * Create an instance of {@link CompetencyQualificationReplacementType }
     * 
     */
    public CompetencyQualificationReplacementType createCompetencyQualificationReplacementType() {
        return new CompetencyQualificationReplacementType();
    }

    /**
     * Create an instance of {@link AllowanceUnitPlanObjectIDType }
     * 
     */
    public AllowanceUnitPlanObjectIDType createAllowanceUnitPlanObjectIDType() {
        return new AllowanceUnitPlanObjectIDType();
    }

    /**
     * Create an instance of {@link SalaryUnitPlanObjectType }
     * 
     */
    public SalaryUnitPlanObjectType createSalaryUnitPlanObjectType() {
        return new SalaryUnitPlanObjectType();
    }

    /**
     * Create an instance of {@link ResponseFilterType }
     * 
     */
    public ResponseFilterType createResponseFilterType() {
        return new ResponseFilterType();
    }

    /**
     * Create an instance of {@link ProficiencyRatingBehaviorObjectType }
     * 
     */
    public ProficiencyRatingBehaviorObjectType createProficiencyRatingBehaviorObjectType() {
        return new ProficiencyRatingBehaviorObjectType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentRestrictionsResponseDataType }
     * 
     */
    public OrganizationAssignmentRestrictionsResponseDataType createOrganizationAssignmentRestrictionsResponseDataType() {
        return new OrganizationAssignmentRestrictionsResponseDataType();
    }

    /**
     * Create an instance of {@link GenderIdentityDataType }
     * 
     */
    public GenderIdentityDataType createGenderIdentityDataType() {
        return new GenderIdentityDataType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordObjectIDType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordObjectIDType createExternalDisabilitySelfIdentificationRecordObjectIDType() {
        return new ExternalDisabilitySelfIdentificationRecordObjectIDType();
    }

    /**
     * Create an instance of {@link DependentPersonalInformationDataType }
     * 
     */
    public DependentPersonalInformationDataType createDependentPersonalInformationDataType() {
        return new DependentPersonalInformationDataType();
    }

    /**
     * Create an instance of {@link TimeZoneObjectType }
     * 
     */
    public TimeZoneObjectType createTimeZoneObjectType() {
        return new TimeZoneObjectType();
    }

    /**
     * Create an instance of {@link WebAddressDataType }
     * 
     */
    public WebAddressDataType createWebAddressDataType() {
        return new WebAddressDataType();
    }

    /**
     * Create an instance of {@link LocationContextObjectIDType }
     * 
     */
    public LocationContextObjectIDType createLocationContextObjectIDType() {
        return new LocationContextObjectIDType();
    }

    /**
     * Create an instance of {@link LicenseIdentifierReferenceObjectIDType }
     * 
     */
    public LicenseIdentifierReferenceObjectIDType createLicenseIdentifierReferenceObjectIDType() {
        return new LicenseIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAttachmentsType }
     * 
     */
    public CommitteeMeetingAttachmentsType createCommitteeMeetingAttachmentsType() {
        return new CommitteeMeetingAttachmentsType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactor2DataType }
     * 
     */
    public CollectiveAgreementFactor2DataType createCollectiveAgreementFactor2DataType() {
        return new CollectiveAgreementFactor2DataType();
    }

    /**
     * Create an instance of {@link WorkerDocumentObjectIDType }
     * 
     */
    public WorkerDocumentObjectIDType createWorkerDocumentObjectIDType() {
        return new WorkerDocumentObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationSalaryPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationSalaryPlanAssignmentDataType createEmployeeCompensationSalaryPlanAssignmentDataType() {
        return new EmployeeCompensationSalaryPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link SpecialtyObjectIDType }
     * 
     */
    public SpecialtyObjectIDType createSpecialtyObjectIDType() {
        return new SpecialtyObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodObjectType }
     * 
     */
    public EmployeeProbationPeriodObjectType createEmployeeProbationPeriodObjectType() {
        return new EmployeeProbationPeriodObjectType();
    }

    /**
     * Create an instance of {@link SuffixNameDataType }
     * 
     */
    public SuffixNameDataType createSuffixNameDataType() {
        return new SuffixNameDataType();
    }

    /**
     * Create an instance of {@link WorkerAdditionalBenefitsDataType }
     * 
     */
    public WorkerAdditionalBenefitsDataType createWorkerAdditionalBenefitsDataType() {
        return new WorkerAdditionalBenefitsDataType();
    }

    /**
     * Create an instance of {@link LicenseIdentificationDataType }
     * 
     */
    public LicenseIdentificationDataType createLicenseIdentificationDataType() {
        return new LicenseIdentificationDataType();
    }

    /**
     * Create an instance of {@link DayOfTheMonthObjectIDType }
     * 
     */
    public DayOfTheMonthObjectIDType createDayOfTheMonthObjectIDType() {
        return new DayOfTheMonthObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalPayrollEntityReferenceType }
     * 
     */
    public ExternalPayrollEntityReferenceType createExternalPayrollEntityReferenceType() {
        return new ExternalPayrollEntityReferenceType();
    }

    /**
     * Create an instance of {@link FieldOfStudyReferenceType }
     * 
     */
    public FieldOfStudyReferenceType createFieldOfStudyReferenceType() {
        return new FieldOfStudyReferenceType();
    }

    /**
     * Create an instance of {@link OrganizationContentDataType }
     * 
     */
    public OrganizationContentDataType createOrganizationContentDataType() {
        return new OrganizationContentDataType();
    }

    /**
     * Create an instance of {@link CommunicationUsageTypeDataType }
     * 
     */
    public CommunicationUsageTypeDataType createCommunicationUsageTypeDataType() {
        return new CommunicationUsageTypeDataType();
    }

    /**
     * Create an instance of {@link WorkerInsuranceCoverageDataType }
     * 
     */
    public WorkerInsuranceCoverageDataType createWorkerInsuranceCoverageDataType() {
        return new WorkerInsuranceCoverageDataType();
    }

    /**
     * Create an instance of {@link GenderIdentityRequestReferencesType }
     * 
     */
    public GenderIdentityRequestReferencesType createGenderIdentityRequestReferencesType() {
        return new GenderIdentityRequestReferencesType();
    }

    /**
     * Create an instance of {@link WorkerAdditionalBenefitsPeriodDataType }
     * 
     */
    public WorkerAdditionalBenefitsPeriodDataType createWorkerAdditionalBenefitsPeriodDataType() {
        return new WorkerAdditionalBenefitsPeriodDataType();
    }

    /**
     * Create an instance of {@link WebServiceBackgroundProcessRuntimeObjectIDType }
     * 
     */
    public WebServiceBackgroundProcessRuntimeObjectIDType createWebServiceBackgroundProcessRuntimeObjectIDType() {
        return new WebServiceBackgroundProcessRuntimeObjectIDType();
    }

    /**
     * Create an instance of {@link CompensationPayEarningObjectIDType }
     * 
     */
    public CompensationPayEarningObjectIDType createCompensationPayEarningObjectIDType() {
        return new CompensationPayEarningObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType createEmployeeCompensationSalaryUnitPlanAssignmentDetailDataType() {
        return new EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTargetObjectType }
     * 
     */
    public CommitteeMembershipTargetObjectType createCommitteeMembershipTargetObjectType() {
        return new CommitteeMembershipTargetObjectType();
    }

    /**
     * Create an instance of {@link EmployeeContractDataType }
     * 
     */
    public EmployeeContractDataType createEmployeeContractDataType() {
        return new EmployeeContractDataType();
    }

    /**
     * Create an instance of {@link GiftObjectType }
     * 
     */
    public GiftObjectType createGiftObjectType() {
        return new GiftObjectType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityObjectIDType }
     * 
     */
    public SocialBenefitsLocalityObjectIDType createSocialBenefitsLocalityObjectIDType() {
        return new SocialBenefitsLocalityObjectIDType();
    }

    /**
     * Create an instance of {@link EducationHistoryDataType }
     * 
     */
    public EducationHistoryDataType createEducationHistoryDataType() {
        return new EducationHistoryDataType();
    }

    /**
     * Create an instance of {@link PassportIDDataType }
     * 
     */
    public PassportIDDataType createPassportIDDataType() {
        return new PassportIDDataType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierRequestReferencesType }
     * 
     */
    public UniversalIdentifierRequestReferencesType createUniversalIdentifierRequestReferencesType() {
        return new UniversalIdentifierRequestReferencesType();
    }

    /**
     * Create an instance of {@link DisabilityResponseDataType }
     * 
     */
    public DisabilityResponseDataType createDisabilityResponseDataType() {
        return new DisabilityResponseDataType();
    }

    /**
     * Create an instance of {@link PayGroupObjectIDType }
     * 
     */
    public PayGroupObjectIDType createPayGroupObjectIDType() {
        return new PayGroupObjectIDType();
    }

    /**
     * Create an instance of {@link HealthCareClassificationObjectIDType }
     * 
     */
    public HealthCareClassificationObjectIDType createHealthCareClassificationObjectIDType() {
        return new HealthCareClassificationObjectIDType();
    }

    /**
     * Create an instance of {@link InternationalAssignmentDataType }
     * 
     */
    public InternationalAssignmentDataType createInternationalAssignmentDataType() {
        return new InternationalAssignmentDataType();
    }

    /**
     * Create an instance of {@link RelocationAreaObjectType }
     * 
     */
    public RelocationAreaObjectType createRelocationAreaObjectType() {
        return new RelocationAreaObjectType();
    }

    /**
     * Create an instance of {@link JobFamilyDataType }
     * 
     */
    public JobFamilyDataType createJobFamilyDataType() {
        return new JobFamilyDataType();
    }

    /**
     * Create an instance of {@link DisabilityObjectIDType }
     * 
     */
    public DisabilityObjectIDType createDisabilityObjectIDType() {
        return new DisabilityObjectIDType();
    }

    /**
     * Create an instance of {@link PutDependentDataType }
     * 
     */
    public PutDependentDataType createPutDependentDataType() {
        return new PutDependentDataType();
    }

    /**
     * Create an instance of {@link ExternalIntegrationIDDataType }
     * 
     */
    public ExternalIntegrationIDDataType createExternalIntegrationIDDataType() {
        return new ExternalIntegrationIDDataType();
    }

    /**
     * Create an instance of {@link EstablishmentType }
     * 
     */
    public EstablishmentType createEstablishmentType() {
        return new EstablishmentType();
    }

    /**
     * Create an instance of {@link ReligionObjectType }
     * 
     */
    public ReligionObjectType createReligionObjectType() {
        return new ReligionObjectType();
    }

    /**
     * Create an instance of {@link WorkerDevelopmentItemDataType }
     * 
     */
    public WorkerDevelopmentItemDataType createWorkerDevelopmentItemDataType() {
        return new WorkerDevelopmentItemDataType();
    }

    /**
     * Create an instance of {@link PersonWebAddressInformationDataType }
     * 
     */
    public PersonWebAddressInformationDataType createPersonWebAddressInformationDataType() {
        return new PersonWebAddressInformationDataType();
    }

    /**
     * Create an instance of {@link NotificationCategorizableObjectIDType }
     * 
     */
    public NotificationCategorizableObjectIDType createNotificationCategorizableObjectIDType() {
        return new NotificationCategorizableObjectIDType();
    }

    /**
     * Create an instance of {@link DisabilityStatusInformationDataForRelatedPersonType }
     * 
     */
    public DisabilityStatusInformationDataForRelatedPersonType createDisabilityStatusInformationDataForRelatedPersonType() {
        return new DisabilityStatusInformationDataForRelatedPersonType();
    }

    /**
     * Create an instance of {@link PersonEmailDataType }
     * 
     */
    public PersonEmailDataType createPersonEmailDataType() {
        return new PersonEmailDataType();
    }

    /**
     * Create an instance of {@link TransactionLogRescindAndCorrectEventDataType }
     * 
     */
    public TransactionLogRescindAndCorrectEventDataType createTransactionLogRescindAndCorrectEventDataType() {
        return new TransactionLogRescindAndCorrectEventDataType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodReasonObjectType }
     * 
     */
    public EmployeeProbationPeriodReasonObjectType createEmployeeProbationPeriodReasonObjectType() {
        return new EmployeeProbationPeriodReasonObjectType();
    }

    /**
     * Create an instance of {@link SecondaryTerminationDataType }
     * 
     */
    public SecondaryTerminationDataType createSecondaryTerminationDataType() {
        return new SecondaryTerminationDataType();
    }

    /**
     * Create an instance of {@link HolidayCalendarObjectType }
     * 
     */
    public HolidayCalendarObjectType createHolidayCalendarObjectType() {
        return new HolidayCalendarObjectType();
    }

    /**
     * Create an instance of {@link DocumentFieldResultDataType }
     * 
     */
    public DocumentFieldResultDataType createDocumentFieldResultDataType() {
        return new DocumentFieldResultDataType();
    }

    /**
     * Create an instance of {@link PotentialObjectIDType }
     * 
     */
    public PotentialObjectIDType createPotentialObjectIDType() {
        return new PotentialObjectIDType();
    }

    /**
     * Create an instance of {@link InstantMessengerTypeObjectIDType }
     * 
     */
    public InstantMessengerTypeObjectIDType createInstantMessengerTypeObjectIDType() {
        return new InstantMessengerTypeObjectIDType();
    }

    /**
     * Create an instance of {@link HealthCareClassificationObjectType }
     * 
     */
    public HealthCareClassificationObjectType createHealthCareClassificationObjectType() {
        return new HealthCareClassificationObjectType();
    }

    /**
     * Create an instance of {@link COBRAEligibilityReasonObjectType }
     * 
     */
    public COBRAEligibilityReasonObjectType createCOBRAEligibilityReasonObjectType() {
        return new COBRAEligibilityReasonObjectType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationAllowanceUnitPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationAllowanceUnitPlanAssignmentDetailDataType createEmployeeCompensationAllowanceUnitPlanAssignmentDetailDataType() {
        return new EmployeeCompensationAllowanceUnitPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link DevelopmentPlanDataType }
     * 
     */
    public DevelopmentPlanDataType createDevelopmentPlanDataType() {
        return new DevelopmentPlanDataType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeResponseGroupType }
     * 
     */
    public WorkersCompensationCodeResponseGroupType createWorkersCompensationCodeResponseGroupType() {
        return new WorkersCompensationCodeResponseGroupType();
    }

    /**
     * Create an instance of {@link ExternalFieldAndParameterInitializationProviderObjectIDType }
     * 
     */
    public ExternalFieldAndParameterInitializationProviderObjectIDType createExternalFieldAndParameterInitializationProviderObjectIDType() {
        return new ExternalFieldAndParameterInitializationProviderObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMemberEnabledObjectIDType }
     * 
     */
    public CommitteeMemberEnabledObjectIDType createCommitteeMemberEnabledObjectIDType() {
        return new CommitteeMemberEnabledObjectIDType();
    }

    /**
     * Create an instance of {@link QualificationDataType }
     * 
     */
    public QualificationDataType createQualificationDataType() {
        return new QualificationDataType();
    }

    /**
     * Create an instance of {@link LocationHierarchyOrganizationAssignmentsByTypeDataType }
     * 
     */
    public LocationHierarchyOrganizationAssignmentsByTypeDataType createLocationHierarchyOrganizationAssignmentsByTypeDataType() {
        return new LocationHierarchyOrganizationAssignmentsByTypeDataType();
    }

    /**
     * Create an instance of {@link GetChangeWorkContactInformationRequestCriteriaType }
     * 
     */
    public GetChangeWorkContactInformationRequestCriteriaType createGetChangeWorkContactInformationRequestCriteriaType() {
        return new GetChangeWorkContactInformationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationSkillType }
     * 
     */
    public ProfessionalAffiliationSkillType createProfessionalAffiliationSkillType() {
        return new ProfessionalAffiliationSkillType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationResponseDataType }
     * 
     */
    public CommitteeClassificationResponseDataType createCommitteeClassificationResponseDataType() {
        return new CommitteeClassificationResponseDataType();
    }

    /**
     * Create an instance of {@link CommitteeTypeRequestReferencesType }
     * 
     */
    public CommitteeTypeRequestReferencesType createCommitteeTypeRequestReferencesType() {
        return new CommitteeTypeRequestReferencesType();
    }

    /**
     * Create an instance of {@link UnionMembershipTypeObjectType }
     * 
     */
    public UnionMembershipTypeObjectType createUnionMembershipTypeObjectType() {
        return new UnionMembershipTypeObjectType();
    }

    /**
     * Create an instance of {@link OrganizationInactivateDataType }
     * 
     */
    public OrganizationInactivateDataType createOrganizationInactivateDataType() {
        return new OrganizationInactivateDataType();
    }

    /**
     * Create an instance of {@link CitizenshipStatusReferenceType }
     * 
     */
    public CitizenshipStatusReferenceType createCitizenshipStatusReferenceType() {
        return new CitizenshipStatusReferenceType();
    }

    /**
     * Create an instance of {@link DifficultyToFillRequestReferencesType }
     * 
     */
    public DifficultyToFillRequestReferencesType createDifficultyToFillRequestReferencesType() {
        return new DifficultyToFillRequestReferencesType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingType }
     * 
     */
    public CommitteeMeetingType createCommitteeMeetingType() {
        return new CommitteeMeetingType();
    }

    /**
     * Create an instance of {@link WorkerResponseGroupForReferenceType }
     * 
     */
    public WorkerResponseGroupForReferenceType createWorkerResponseGroupForReferenceType() {
        return new WorkerResponseGroupForReferenceType();
    }

    /**
     * Create an instance of {@link JobProfileInPositionSummaryDataType }
     * 
     */
    public JobProfileInPositionSummaryDataType createJobProfileInPositionSummaryDataType() {
        return new JobProfileInPositionSummaryDataType();
    }

    /**
     * Create an instance of {@link LeaveRequestAdditionalFieldsType }
     * 
     */
    public LeaveRequestAdditionalFieldsType createLeaveRequestAdditionalFieldsType() {
        return new LeaveRequestAdditionalFieldsType();
    }

    /**
     * Create an instance of {@link BusinessProcessParametersType }
     * 
     */
    public BusinessProcessParametersType createBusinessProcessParametersType() {
        return new BusinessProcessParametersType();
    }

    /**
     * Create an instance of {@link DisabilityCertificationAuthorityObjectIDType }
     * 
     */
    public DisabilityCertificationAuthorityObjectIDType createDisabilityCertificationAuthorityObjectIDType() {
        return new DisabilityCertificationAuthorityObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationCommissionPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationCommissionPlanAssignmentDataType createEmployeeCompensationCommissionPlanAssignmentDataType() {
        return new EmployeeCompensationCommissionPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetType }
     * 
     */
    public WorkStatusRuleSetType createWorkStatusRuleSetType() {
        return new WorkStatusRuleSetType();
    }

    /**
     * Create an instance of {@link JobHistoryCompanyObjectIDType }
     * 
     */
    public JobHistoryCompanyObjectIDType createJobHistoryCompanyObjectIDType() {
        return new JobHistoryCompanyObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalPayGroupObjectIDType }
     * 
     */
    public ExternalPayGroupObjectIDType createExternalPayGroupObjectIDType() {
        return new ExternalPayGroupObjectIDType();
    }

    /**
     * Create an instance of {@link JobHistoryCompanyObjectType }
     * 
     */
    public JobHistoryCompanyObjectType createJobHistoryCompanyObjectType() {
        return new JobHistoryCompanyObjectType();
    }

    /**
     * Create an instance of {@link CountryRegionObjectType }
     * 
     */
    public CountryRegionObjectType createCountryRegionObjectType() {
        return new CountryRegionObjectType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentResponseGroupType }
     * 
     */
    public FormerWorkerAttachmentResponseGroupType createFormerWorkerAttachmentResponseGroupType() {
        return new FormerWorkerAttachmentResponseGroupType();
    }

    /**
     * Create an instance of {@link EmployeeTalentAssessmentDataType }
     * 
     */
    public EmployeeTalentAssessmentDataType createEmployeeTalentAssessmentDataType() {
        return new EmployeeTalentAssessmentDataType();
    }

    /**
     * Create an instance of {@link EducationalTaxonomyCodeObjectIDType }
     * 
     */
    public EducationalTaxonomyCodeObjectIDType createEducationalTaxonomyCodeObjectIDType() {
        return new EducationalTaxonomyCodeObjectIDType();
    }

    /**
     * Create an instance of {@link LocationDataType }
     * 
     */
    public LocationDataType createLocationDataType() {
        return new LocationDataType();
    }

    /**
     * Create an instance of {@link DevelopmentPlanObjectType }
     * 
     */
    public DevelopmentPlanObjectType createDevelopmentPlanObjectType() {
        return new DevelopmentPlanObjectType();
    }

    /**
     * Create an instance of {@link EmployeeContractObjectIDType }
     * 
     */
    public EmployeeContractObjectIDType createEmployeeContractObjectIDType() {
        return new EmployeeContractObjectIDType();
    }

    /**
     * Create an instance of {@link HolidayCalendarResponseDataType }
     * 
     */
    public HolidayCalendarResponseDataType createHolidayCalendarResponseDataType() {
        return new HolidayCalendarResponseDataType();
    }

    /**
     * Create an instance of {@link JobInterestsDataType }
     * 
     */
    public JobInterestsDataType createJobInterestsDataType() {
        return new JobInterestsDataType();
    }

    /**
     * Create an instance of {@link DisabilityGradeObjectIDType }
     * 
     */
    public DisabilityGradeObjectIDType createDisabilityGradeObjectIDType() {
        return new DisabilityGradeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkingTimeUnitObjectIDType }
     * 
     */
    public WorkingTimeUnitObjectIDType createWorkingTimeUnitObjectIDType() {
        return new WorkingTimeUnitObjectIDType();
    }

    /**
     * Create an instance of {@link UserBasedSecurityGroupObjectType }
     * 
     */
    public UserBasedSecurityGroupObjectType createUserBasedSecurityGroupObjectType() {
        return new UserBasedSecurityGroupObjectType();
    }

    /**
     * Create an instance of {@link JobProfileResponseGroupType }
     * 
     */
    public JobProfileResponseGroupType createJobProfileResponseGroupType() {
        return new JobProfileResponseGroupType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentRequestCriteriaType }
     * 
     */
    public ProvisioningGroupAssignmentRequestCriteriaType createProvisioningGroupAssignmentRequestCriteriaType() {
        return new ProvisioningGroupAssignmentRequestCriteriaType();
    }

    /**
     * Create an instance of {@link VisaIdentifierReferenceObjectType }
     * 
     */
    public VisaIdentifierReferenceObjectType createVisaIdentifierReferenceObjectType() {
        return new VisaIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link AcademicRankRequestCriteriaType }
     * 
     */
    public AcademicRankRequestCriteriaType createAcademicRankRequestCriteriaType() {
        return new AcademicRankRequestCriteriaType();
    }

    /**
     * Create an instance of {@link TrainingObjectIDType }
     * 
     */
    public TrainingObjectIDType createTrainingObjectIDType() {
        return new TrainingObjectIDType();
    }

    /**
     * Create an instance of {@link SuperiorOrganizationReferenceDataType }
     * 
     */
    public SuperiorOrganizationReferenceDataType createSuperiorOrganizationReferenceDataType() {
        return new SuperiorOrganizationReferenceDataType();
    }

    /**
     * Create an instance of {@link WorkSpaceChangeEventDataType }
     * 
     */
    public WorkSpaceChangeEventDataType createWorkSpaceChangeEventDataType() {
        return new WorkSpaceChangeEventDataType();
    }

    /**
     * Create an instance of {@link OrganizationReferencesType }
     * 
     */
    public OrganizationReferencesType createOrganizationReferencesType() {
        return new OrganizationReferencesType();
    }

    /**
     * Create an instance of {@link AssignMembersToCustomOrganizationDataType }
     * 
     */
    public AssignMembersToCustomOrganizationDataType createAssignMembersToCustomOrganizationDataType() {
        return new AssignMembersToCustomOrganizationDataType();
    }

    /**
     * Create an instance of {@link USProtectedVeteranStatusTypeObjectType }
     * 
     */
    public USProtectedVeteranStatusTypeObjectType createUSProtectedVeteranStatusTypeObjectType() {
        return new USProtectedVeteranStatusTypeObjectType();
    }

    /**
     * Create an instance of {@link ContactDataType }
     * 
     */
    public ContactDataType createContactDataType() {
        return new ContactDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterObjectType }
     * 
     */
    public ServiceCenterObjectType createServiceCenterObjectType() {
        return new ServiceCenterObjectType();
    }

    /**
     * Create an instance of {@link AnnualIncomeDataType }
     * 
     */
    public AnnualIncomeDataType createAnnualIncomeDataType() {
        return new AnnualIncomeDataType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsResponseDataType }
     * 
     */
    public AssignUserBasedSecurityGroupsResponseDataType createAssignUserBasedSecurityGroupsResponseDataType() {
        return new AssignUserBasedSecurityGroupsResponseDataType();
    }

    /**
     * Create an instance of {@link LeaveOfAbsenceTypeObjectIDType }
     * 
     */
    public LeaveOfAbsenceTypeObjectIDType createLeaveOfAbsenceTypeObjectIDType() {
        return new LeaveOfAbsenceTypeObjectIDType();
    }

    /**
     * Create an instance of {@link EventTargetTransactionLogRescindAndCorrectDataType }
     * 
     */
    public EventTargetTransactionLogRescindAndCorrectDataType createEventTargetTransactionLogRescindAndCorrectDataType() {
        return new EventTargetTransactionLogRescindAndCorrectDataType();
    }

    /**
     * Create an instance of {@link FormerWorkerPersonalInformationDataType }
     * 
     */
    public FormerWorkerPersonalInformationDataType createFormerWorkerPersonalInformationDataType() {
        return new FormerWorkerPersonalInformationDataType();
    }

    /**
     * Create an instance of {@link WorkerByNationalIDRequestCriteriaType }
     * 
     */
    public WorkerByNationalIDRequestCriteriaType createWorkerByNationalIDRequestCriteriaType() {
        return new WorkerByNationalIDRequestCriteriaType();
    }

    /**
     * Create an instance of {@link LocationObjectIDType }
     * 
     */
    public LocationObjectIDType createLocationObjectIDType() {
        return new LocationObjectIDType();
    }

    /**
     * Create an instance of {@link EmailReferenceObjectIDType }
     * 
     */
    public EmailReferenceObjectIDType createEmailReferenceObjectIDType() {
        return new EmailReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerDataType }
     * 
     */
    public WorkerDataType createWorkerDataType() {
        return new WorkerDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementObjectType }
     * 
     */
    public CollectiveAgreementObjectType createCollectiveAgreementObjectType() {
        return new CollectiveAgreementObjectType();
    }

    /**
     * Create an instance of {@link EmployeeMeritPlanAssignmentDataType }
     * 
     */
    public EmployeeMeritPlanAssignmentDataType createEmployeeMeritPlanAssignmentDataType() {
        return new EmployeeMeritPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link EventHistoryDataType }
     * 
     */
    public EventHistoryDataType createEventHistoryDataType() {
        return new EventHistoryDataType();
    }

    /**
     * Create an instance of {@link CommitteeObjectType }
     * 
     */
    public CommitteeObjectType createCommitteeObjectType() {
        return new CommitteeObjectType();
    }

    /**
     * Create an instance of {@link CitizenshipStatusObjectType }
     * 
     */
    public CitizenshipStatusObjectType createCitizenshipStatusObjectType() {
        return new CitizenshipStatusObjectType();
    }

    /**
     * Create an instance of {@link EmployeeBasePayPlanAssignmentDataType }
     * 
     */
    public EmployeeBasePayPlanAssignmentDataType createEmployeeBasePayPlanAssignmentDataType() {
        return new EmployeeBasePayPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link EventTargetObjectType }
     * 
     */
    public EventTargetObjectType createEventTargetObjectType() {
        return new EventTargetObjectType();
    }

    /**
     * Create an instance of {@link EstablishmentObjectIDType }
     * 
     */
    public EstablishmentObjectIDType createEstablishmentObjectIDType() {
        return new EstablishmentObjectIDType();
    }

    /**
     * Create an instance of {@link DocumentCategoryAllObjectType }
     * 
     */
    public DocumentCategoryAllObjectType createDocumentCategoryAllObjectType() {
        return new DocumentCategoryAllObjectType();
    }

    /**
     * Create an instance of {@link FrequencyDataType }
     * 
     */
    public FrequencyDataType createFrequencyDataType() {
        return new FrequencyDataType();
    }

    /**
     * Create an instance of {@link HolidayCalendarEventDataType }
     * 
     */
    public HolidayCalendarEventDataType createHolidayCalendarEventDataType() {
        return new HolidayCalendarEventDataType();
    }

    /**
     * Create an instance of {@link DrawFrequencyReferenceType }
     * 
     */
    public DrawFrequencyReferenceType createDrawFrequencyReferenceType() {
        return new DrawFrequencyReferenceType();
    }

    /**
     * Create an instance of {@link AnnualContributionDataType }
     * 
     */
    public AnnualContributionDataType createAnnualContributionDataType() {
        return new AnnualContributionDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingDataType }
     * 
     */
    public CommitteeMeetingDataType createCommitteeMeetingDataType() {
        return new CommitteeMeetingDataType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupNewType }
     * 
     */
    public JobClassificationGroupNewType createJobClassificationGroupNewType() {
        return new JobClassificationGroupNewType();
    }

    /**
     * Create an instance of {@link LanguageAbilityType }
     * 
     */
    public LanguageAbilityType createLanguageAbilityType() {
        return new LanguageAbilityType();
    }

    /**
     * Create an instance of {@link ReorganizationObjectIDType }
     * 
     */
    public ReorganizationObjectIDType createReorganizationObjectIDType() {
        return new ReorganizationObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerSkillItemDataType }
     * 
     */
    public WorkerSkillItemDataType createWorkerSkillItemDataType() {
        return new WorkerSkillItemDataType();
    }

    /**
     * Create an instance of {@link ManagementChainDataType }
     * 
     */
    public ManagementChainDataType createManagementChainDataType() {
        return new ManagementChainDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitType }
     * 
     */
    public AcademicUnitType createAcademicUnitType() {
        return new AcademicUnitType();
    }

    /**
     * Create an instance of {@link EmployeeImageDataType }
     * 
     */
    public EmployeeImageDataType createEmployeeImageDataType() {
        return new EmployeeImageDataType();
    }

    /**
     * Create an instance of {@link CareerResponsibilityObjectType }
     * 
     */
    public CareerResponsibilityObjectType createCareerResponsibilityObjectType() {
        return new CareerResponsibilityObjectType();
    }

    /**
     * Create an instance of {@link PositionDetailDataType }
     * 
     */
    public PositionDetailDataType createPositionDetailDataType() {
        return new PositionDetailDataType();
    }

    /**
     * Create an instance of {@link WorkerJobDataType }
     * 
     */
    public WorkerJobDataType createWorkerJobDataType() {
        return new WorkerJobDataType();
    }

    /**
     * Create an instance of {@link AddressInformationDataType }
     * 
     */
    public AddressInformationDataType createAddressInformationDataType() {
        return new AddressInformationDataType();
    }

    /**
     * Create an instance of {@link DifficultyToFillResponseDataType }
     * 
     */
    public DifficultyToFillResponseDataType createDifficultyToFillResponseDataType() {
        return new DifficultyToFillResponseDataType();
    }

    /**
     * Create an instance of {@link PreviousSystemJobHistoryResponseDataType }
     * 
     */
    public PreviousSystemJobHistoryResponseDataType createPreviousSystemJobHistoryResponseDataType() {
        return new PreviousSystemJobHistoryResponseDataType();
    }

    /**
     * Create an instance of {@link UserLanguageObjectIDType }
     * 
     */
    public UserLanguageObjectIDType createUserLanguageObjectIDType() {
        return new UserLanguageObjectIDType();
    }

    /**
     * Create an instance of {@link UnionMemberDataType }
     * 
     */
    public UnionMemberDataType createUnionMemberDataType() {
        return new UnionMemberDataType();
    }

    /**
     * Create an instance of {@link WorkShiftObjectType }
     * 
     */
    public WorkShiftObjectType createWorkShiftObjectType() {
        return new WorkShiftObjectType();
    }

    /**
     * Create an instance of {@link BenefitPlanObjectIDType }
     * 
     */
    public BenefitPlanObjectIDType createBenefitPlanObjectIDType() {
        return new BenefitPlanObjectIDType();
    }

    /**
     * Create an instance of {@link RelatedPersonRelationshipObjectType }
     * 
     */
    public RelatedPersonRelationshipObjectType createRelatedPersonRelationshipObjectType() {
        return new RelatedPersonRelationshipObjectType();
    }

    /**
     * Create an instance of {@link EducationObjectIDType }
     * 
     */
    public EducationObjectIDType createEducationObjectIDType() {
        return new EducationObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerObjectIDType }
     * 
     */
    public FormerWorkerObjectIDType createFormerWorkerObjectIDType() {
        return new FormerWorkerObjectIDType();
    }

    /**
     * Create an instance of {@link ChangeOtherIDsBusinessProcessDataType }
     * 
     */
    public ChangeOtherIDsBusinessProcessDataType createChangeOtherIDsBusinessProcessDataType() {
        return new ChangeOtherIDsBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorOptionObjectType }
     * 
     */
    public CollectiveAgreementFactorOptionObjectType createCollectiveAgreementFactorOptionObjectType() {
        return new CollectiveAgreementFactorOptionObjectType();
    }

    /**
     * Create an instance of {@link EthnicityReferenceType }
     * 
     */
    public EthnicityReferenceType createEthnicityReferenceType() {
        return new EthnicityReferenceType();
    }

    /**
     * Create an instance of {@link CertificationSkillObjectType }
     * 
     */
    public CertificationSkillObjectType createCertificationSkillObjectType() {
        return new CertificationSkillObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingVoteStatusObjectIDType }
     * 
     */
    public CommitteeMeetingVoteStatusObjectIDType createCommitteeMeetingVoteStatusObjectIDType() {
        return new CommitteeMeetingVoteStatusObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerPositionDataType }
     * 
     */
    public WorkerPositionDataType createWorkerPositionDataType() {
        return new WorkerPositionDataType();
    }

    /**
     * Create an instance of {@link WebAddressInformationDataType }
     * 
     */
    public WebAddressInformationDataType createWebAddressInformationDataType() {
        return new WebAddressInformationDataType();
    }

    /**
     * Create an instance of {@link TrainingTypeType }
     * 
     */
    public TrainingTypeType createTrainingTypeType() {
        return new TrainingTypeType();
    }

    /**
     * Create an instance of {@link DegreeReferenceType }
     * 
     */
    public DegreeReferenceType createDegreeReferenceType() {
        return new DegreeReferenceType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarRequestCriteriaType }
     * 
     */
    public PeriodReportingCalendarRequestCriteriaType createPeriodReportingCalendarRequestCriteriaType() {
        return new PeriodReportingCalendarRequestCriteriaType();
    }

    /**
     * Create an instance of {@link DisabilityStatusReferenceObjectType }
     * 
     */
    public DisabilityStatusReferenceObjectType createDisabilityStatusReferenceObjectType() {
        return new DisabilityStatusReferenceObjectType();
    }

    /**
     * Create an instance of {@link FuturePaymentPlanObjectType }
     * 
     */
    public FuturePaymentPlanObjectType createFuturePaymentPlanObjectType() {
        return new FuturePaymentPlanObjectType();
    }

    /**
     * Create an instance of {@link PersonTypeCriteriaType }
     * 
     */
    public PersonTypeCriteriaType createPersonTypeCriteriaType() {
        return new PersonTypeCriteriaType();
    }

    /**
     * Create an instance of {@link ManagementLevelObjectType }
     * 
     */
    public ManagementLevelObjectType createManagementLevelObjectType() {
        return new ManagementLevelObjectType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentSetObjectType }
     * 
     */
    public AcademicAppointmentSetObjectType createAcademicAppointmentSetObjectType() {
        return new AcademicAppointmentSetObjectType();
    }

    /**
     * Create an instance of {@link AcademicRankMappingObjectType }
     * 
     */
    public AcademicRankMappingObjectType createAcademicRankMappingObjectType() {
        return new AcademicRankMappingObjectType();
    }

    /**
     * Create an instance of {@link PersonPhoneInformationDataType }
     * 
     */
    public PersonPhoneInformationDataType createPersonPhoneInformationDataType() {
        return new PersonPhoneInformationDataType();
    }

    /**
     * Create an instance of {@link DisabilityReferenceType }
     * 
     */
    public DisabilityReferenceType createDisabilityReferenceType() {
        return new DisabilityReferenceType();
    }

    /**
     * Create an instance of {@link CertificationAchievementDataType }
     * 
     */
    public CertificationAchievementDataType createCertificationAchievementDataType() {
        return new CertificationAchievementDataType();
    }

    /**
     * Create an instance of {@link PreferredCommunicationLanguageResponseDataType }
     * 
     */
    public PreferredCommunicationLanguageResponseDataType createPreferredCommunicationLanguageResponseDataType() {
        return new PreferredCommunicationLanguageResponseDataType();
    }

    /**
     * Create an instance of {@link InsuranceCoverageTargetObjectIDType }
     * 
     */
    public InsuranceCoverageTargetObjectIDType createInsuranceCoverageTargetObjectIDType() {
        return new InsuranceCoverageTargetObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerGoalType }
     * 
     */
    public WorkerGoalType createWorkerGoalType() {
        return new WorkerGoalType();
    }

    /**
     * Create an instance of {@link LocalTerminationReasonObjectType }
     * 
     */
    public LocalTerminationReasonObjectType createLocalTerminationReasonObjectType() {
        return new LocalTerminationReasonObjectType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupJobFamilyDataType }
     * 
     */
    public JobFamilyGroupJobFamilyDataType createJobFamilyGroupJobFamilyDataType() {
        return new JobFamilyGroupJobFamilyDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorObjectIDType }
     * 
     */
    public CollectiveAgreementFactorObjectIDType createCollectiveAgreementFactorObjectIDType() {
        return new CollectiveAgreementFactorObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeObjectIDType }
     * 
     */
    public CommitteeMembershipTypeObjectIDType createCommitteeMembershipTypeObjectIDType() {
        return new CommitteeMembershipTypeObjectIDType();
    }

    /**
     * Create an instance of {@link PersonContactInformationDataType }
     * 
     */
    public PersonContactInformationDataType createPersonContactInformationDataType() {
        return new PersonContactInformationDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyType }
     * 
     */
    public AcademicUnitHierarchyType createAcademicUnitHierarchyType() {
        return new AcademicUnitHierarchyType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorOptionObjectIDType }
     * 
     */
    public CollectiveAgreementFactorOptionObjectIDType createCollectiveAgreementFactorOptionObjectIDType() {
        return new CollectiveAgreementFactorOptionObjectIDType();
    }

    /**
     * Create an instance of {@link TravelAmountObjectType }
     * 
     */
    public TravelAmountObjectType createTravelAmountObjectType() {
        return new TravelAmountObjectType();
    }

    /**
     * Create an instance of {@link LanguageReferenceType }
     * 
     */
    public LanguageReferenceType createLanguageReferenceType() {
        return new LanguageReferenceType();
    }

    /**
     * Create an instance of {@link ExternalPayGroupReferenceType }
     * 
     */
    public ExternalPayGroupReferenceType createExternalPayGroupReferenceType() {
        return new ExternalPayGroupReferenceType();
    }

    /**
     * Create an instance of {@link LivesWithWorkerDataType }
     * 
     */
    public LivesWithWorkerDataType createLivesWithWorkerDataType() {
        return new LivesWithWorkerDataType();
    }

    /**
     * Create an instance of {@link GovernmentIdentifierReferenceObjectType }
     * 
     */
    public GovernmentIdentifierReferenceObjectType createGovernmentIdentifierReferenceObjectType() {
        return new GovernmentIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link WorkerRetirementSavingsDataType }
     * 
     */
    public WorkerRetirementSavingsDataType createWorkerRetirementSavingsDataType() {
        return new WorkerRetirementSavingsDataType();
    }

    /**
     * Create an instance of {@link WorkExperienceQualificationReplacementType }
     * 
     */
    public WorkExperienceQualificationReplacementType createWorkExperienceQualificationReplacementType() {
        return new WorkExperienceQualificationReplacementType();
    }

    /**
     * Create an instance of {@link SystemUserForWorkerDataType }
     * 
     */
    public SystemUserForWorkerDataType createSystemUserForWorkerDataType() {
        return new SystemUserForWorkerDataType();
    }

    /**
     * Create an instance of {@link PayGroupObjectType }
     * 
     */
    public PayGroupObjectType createPayGroupObjectType() {
        return new PayGroupObjectType();
    }

    /**
     * Create an instance of {@link WorkerTypeObjectIDType }
     * 
     */
    public WorkerTypeObjectIDType createWorkerTypeObjectIDType() {
        return new WorkerTypeObjectIDType();
    }

    /**
     * Create an instance of {@link LocationContextObjectType }
     * 
     */
    public LocationContextObjectType createLocationContextObjectType() {
        return new LocationContextObjectType();
    }

    /**
     * Create an instance of {@link JobFamilyObjectType }
     * 
     */
    public JobFamilyObjectType createJobFamilyObjectType() {
        return new JobFamilyObjectType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetObjectType }
     * 
     */
    public WorkStatusRuleSetObjectType createWorkStatusRuleSetObjectType() {
        return new WorkStatusRuleSetObjectType();
    }

    /**
     * Create an instance of {@link WorkerEmploymentInformationDataType }
     * 
     */
    public WorkerEmploymentInformationDataType createWorkerEmploymentInformationDataType() {
        return new WorkerEmploymentInformationDataType();
    }

    /**
     * Create an instance of {@link HolidayCalendarRequestReferencesType }
     * 
     */
    public HolidayCalendarRequestReferencesType createHolidayCalendarRequestReferencesType() {
        return new HolidayCalendarRequestReferencesType();
    }

    /**
     * Create an instance of {@link AchievableLevelObjectType }
     * 
     */
    public AchievableLevelObjectType createAchievableLevelObjectType() {
        return new AchievableLevelObjectType();
    }

    /**
     * Create an instance of {@link WorkerSpendingAccountPeriodDataType }
     * 
     */
    public WorkerSpendingAccountPeriodDataType createWorkerSpendingAccountPeriodDataType() {
        return new WorkerSpendingAccountPeriodDataType();
    }

    /**
     * Create an instance of {@link OrganizationObjectIDType }
     * 
     */
    public OrganizationObjectIDType createOrganizationObjectIDType() {
        return new OrganizationObjectIDType();
    }

    /**
     * Create an instance of {@link NameDataType }
     * 
     */
    public NameDataType createNameDataType() {
        return new NameDataType();
    }

    /**
     * Create an instance of {@link WorkShiftRequestReferencesType }
     * 
     */
    public WorkShiftRequestReferencesType createWorkShiftRequestReferencesType() {
        return new WorkShiftRequestReferencesType();
    }

    /**
     * Create an instance of {@link LocationHierarchyOrganizationAssignmentsResponseDataType }
     * 
     */
    public LocationHierarchyOrganizationAssignmentsResponseDataType createLocationHierarchyOrganizationAssignmentsResponseDataType() {
        return new LocationHierarchyOrganizationAssignmentsResponseDataType();
    }

    /**
     * Create an instance of {@link AllowedForTaxDeductionDataType }
     * 
     */
    public AllowedForTaxDeductionDataType createAllowedForTaxDeductionDataType() {
        return new AllowedForTaxDeductionDataType();
    }

    /**
     * Create an instance of {@link VeteranStatusIdentificationDataType }
     * 
     */
    public VeteranStatusIdentificationDataType createVeteranStatusIdentificationDataType() {
        return new VeteranStatusIdentificationDataType();
    }

    /**
     * Create an instance of {@link JobProfileCompensationDataType }
     * 
     */
    public JobProfileCompensationDataType createJobProfileCompensationDataType() {
        return new JobProfileCompensationDataType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupObjectType }
     * 
     */
    public JobClassificationGroupObjectType createJobClassificationGroupObjectType() {
        return new JobClassificationGroupObjectType();
    }

    /**
     * Create an instance of {@link TaxAuthorityFormTypeObjectIDType }
     * 
     */
    public TaxAuthorityFormTypeObjectIDType createTaxAuthorityFormTypeObjectIDType() {
        return new TaxAuthorityFormTypeObjectIDType();
    }

    /**
     * Create an instance of {@link AdditionalBenefitsCoverageTargetObjectType }
     * 
     */
    public AdditionalBenefitsCoverageTargetObjectType createAdditionalBenefitsCoverageTargetObjectType() {
        return new AdditionalBenefitsCoverageTargetObjectType();
    }

    /**
     * Create an instance of {@link EmployeeAllowancePlanAssignmentDataType }
     * 
     */
    public EmployeeAllowancePlanAssignmentDataType createEmployeeAllowancePlanAssignmentDataType() {
        return new EmployeeAllowancePlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link RelocationPreferenceDataType }
     * 
     */
    public RelocationPreferenceDataType createRelocationPreferenceDataType() {
        return new RelocationPreferenceDataType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountRequestCriteriaType }
     * 
     */
    public GetWorkdayAccountRequestCriteriaType createGetWorkdayAccountRequestCriteriaType() {
        return new GetWorkdayAccountRequestCriteriaType();
    }

    /**
     * Create an instance of {@link RoleObjectIDType }
     * 
     */
    public RoleObjectIDType createRoleObjectIDType() {
        return new RoleObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerRoleDataType }
     * 
     */
    public WorkerRoleDataType createWorkerRoleDataType() {
        return new WorkerRoleDataType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceWWSType }
     * 
     */
    public OrganizationReferenceWWSType createOrganizationReferenceWWSType() {
        return new OrganizationReferenceWWSType();
    }

    /**
     * Create an instance of {@link CommissionPlanObjectType }
     * 
     */
    public CommissionPlanObjectType createCommissionPlanObjectType() {
        return new CommissionPlanObjectType();
    }

    /**
     * Create an instance of {@link SexualOrientationRequestCriteriaType }
     * 
     */
    public SexualOrientationRequestCriteriaType createSexualOrientationRequestCriteriaType() {
        return new SexualOrientationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link FeedbackResponseType }
     * 
     */
    public FeedbackResponseType createFeedbackResponseType() {
        return new FeedbackResponseType();
    }

    /**
     * Create an instance of {@link ManageInstructorEligibilitySubBusinessProcessDataType }
     * 
     */
    public ManageInstructorEligibilitySubBusinessProcessDataType createManageInstructorEligibilitySubBusinessProcessDataType() {
        return new ManageInstructorEligibilitySubBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link LocationTypeObjectIDType }
     * 
     */
    public LocationTypeObjectIDType createLocationTypeObjectIDType() {
        return new LocationTypeObjectIDType();
    }

    /**
     * Create an instance of {@link BusinessSiteReferenceDataType }
     * 
     */
    public BusinessSiteReferenceDataType createBusinessSiteReferenceDataType() {
        return new BusinessSiteReferenceDataType();
    }

    /**
     * Create an instance of {@link ContingentWorkerTaxAuthorityFormInformationDataType }
     * 
     */
    public ContingentWorkerTaxAuthorityFormInformationDataType createContingentWorkerTaxAuthorityFormInformationDataType() {
        return new ContingentWorkerTaxAuthorityFormInformationDataType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarResponseDataType }
     * 
     */
    public WorkScheduleCalendarResponseDataType createWorkScheduleCalendarResponseDataType() {
        return new WorkScheduleCalendarResponseDataType();
    }

    /**
     * Create an instance of {@link EmailAddressInformationDataType }
     * 
     */
    public EmailAddressInformationDataType createEmailAddressInformationDataType() {
        return new EmailAddressInformationDataType();
    }

    /**
     * Create an instance of {@link DayOfTheMonthObjectType }
     * 
     */
    public DayOfTheMonthObjectType createDayOfTheMonthObjectType() {
        return new DayOfTheMonthObjectType();
    }

    /**
     * Create an instance of {@link AcademicLevelObjectType }
     * 
     */
    public AcademicLevelObjectType createAcademicLevelObjectType() {
        return new AcademicLevelObjectType();
    }

    /**
     * Create an instance of {@link CountryCityObjectType }
     * 
     */
    public CountryCityObjectType createCountryCityObjectType() {
        return new CountryCityObjectType();
    }

    /**
     * Create an instance of {@link PronounRequestCriteriaType }
     * 
     */
    public PronounRequestCriteriaType createPronounRequestCriteriaType() {
        return new PronounRequestCriteriaType();
    }

    /**
     * Create an instance of {@link AssignEmployeeCollectiveAgreementEventDataType }
     * 
     */
    public AssignEmployeeCollectiveAgreementEventDataType createAssignEmployeeCollectiveAgreementEventDataType() {
        return new AssignEmployeeCollectiveAgreementEventDataType();
    }

    /**
     * Create an instance of {@link ContributionAmountDataType }
     * 
     */
    public ContributionAmountDataType createContributionAmountDataType() {
        return new ContributionAmountDataType();
    }

    /**
     * Create an instance of {@link WorkerOrganizationRoleDataType }
     * 
     */
    public WorkerOrganizationRoleDataType createWorkerOrganizationRoleDataType() {
        return new WorkerOrganizationRoleDataType();
    }

    /**
     * Create an instance of {@link SpendingAccountCoverageDataType }
     * 
     */
    public SpendingAccountCoverageDataType createSpendingAccountCoverageDataType() {
        return new SpendingAccountCoverageDataType();
    }

    /**
     * Create an instance of {@link OrganizationGoalObjectType }
     * 
     */
    public OrganizationGoalObjectType createOrganizationGoalObjectType() {
        return new OrganizationGoalObjectType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsResponseGroupType }
     * 
     */
    public AssignUserBasedSecurityGroupsResponseGroupType createAssignUserBasedSecurityGroupsResponseGroupType() {
        return new AssignUserBasedSecurityGroupsResponseGroupType();
    }

    /**
     * Create an instance of {@link EthnicityType }
     * 
     */
    public EthnicityType createEthnicityType() {
        return new EthnicityType();
    }

    /**
     * Create an instance of {@link SearchSettingsDataType }
     * 
     */
    public SearchSettingsDataType createSearchSettingsDataType() {
        return new SearchSettingsDataType();
    }

    /**
     * Create an instance of {@link CompensationGradeProfileObjectType }
     * 
     */
    public CompensationGradeProfileObjectType createCompensationGradeProfileObjectType() {
        return new CompensationGradeProfileObjectType();
    }

    /**
     * Create an instance of {@link AssignEstablishmentDataType }
     * 
     */
    public AssignEstablishmentDataType createAssignEstablishmentDataType() {
        return new AssignEstablishmentDataType();
    }

    /**
     * Create an instance of {@link SkillItemDataType }
     * 
     */
    public SkillItemDataType createSkillItemDataType() {
        return new SkillItemDataType();
    }

    /**
     * Create an instance of {@link PersonNameDataType }
     * 
     */
    public PersonNameDataType createPersonNameDataType() {
        return new PersonNameDataType();
    }

    /**
     * Create an instance of {@link ContingentWorkerContractInfoDataType }
     * 
     */
    public ContingentWorkerContractInfoDataType createContingentWorkerContractInfoDataType() {
        return new ContingentWorkerContractInfoDataType();
    }

    /**
     * Create an instance of {@link GetCommitteeDefintionResponseGroupType }
     * 
     */
    public GetCommitteeDefintionResponseGroupType createGetCommitteeDefintionResponseGroupType() {
        return new GetCommitteeDefintionResponseGroupType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationType }
     * 
     */
    public LGBTIdentificationType createLGBTIdentificationType() {
        return new LGBTIdentificationType();
    }

    /**
     * Create an instance of {@link EventClassificationCategoryObjectType }
     * 
     */
    public EventClassificationCategoryObjectType createEventClassificationCategoryObjectType() {
        return new EventClassificationCategoryObjectType();
    }

    /**
     * Create an instance of {@link EmployeeTypeReferenceType }
     * 
     */
    public EmployeeTypeReferenceType createEmployeeTypeReferenceType() {
        return new EmployeeTypeReferenceType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingActionItemObjectIDType }
     * 
     */
    public CommitteeMeetingActionItemObjectIDType createCommitteeMeetingActionItemObjectIDType() {
        return new CommitteeMeetingActionItemObjectIDType();
    }

    /**
     * Create an instance of {@link PhoneCoreDataType }
     * 
     */
    public PhoneCoreDataType createPhoneCoreDataType() {
        return new PhoneCoreDataType();
    }

    /**
     * Create an instance of {@link RelatedPersonForWorkerObjectIDType }
     * 
     */
    public RelatedPersonForWorkerObjectIDType createRelatedPersonForWorkerObjectIDType() {
        return new RelatedPersonForWorkerObjectIDType();
    }

    /**
     * Create an instance of {@link FrequencyRequestReferencesType }
     * 
     */
    public FrequencyRequestReferencesType createFrequencyRequestReferencesType() {
        return new FrequencyRequestReferencesType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyObjectType }
     * 
     */
    public AcademicUnitHierarchyObjectType createAcademicUnitHierarchyObjectType() {
        return new AcademicUnitHierarchyObjectType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentResponseGroupType }
     * 
     */
    public ProvisioningGroupAssignmentResponseGroupType createProvisioningGroupAssignmentResponseGroupType() {
        return new ProvisioningGroupAssignmentResponseGroupType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceIDType }
     * 
     */
    public OrganizationReferenceIDType createOrganizationReferenceIDType() {
        return new OrganizationReferenceIDType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetDataType }
     * 
     */
    public WorkStatusRuleSetDataType createWorkStatusRuleSetDataType() {
        return new WorkStatusRuleSetDataType();
    }

    /**
     * Create an instance of {@link DisabilityObjectType }
     * 
     */
    public DisabilityObjectType createDisabilityObjectType() {
        return new DisabilityObjectType();
    }

    /**
     * Create an instance of {@link JobCategoryType }
     * 
     */
    public JobCategoryType createJobCategoryType() {
        return new JobCategoryType();
    }

    /**
     * Create an instance of {@link AcademicUnitDataType }
     * 
     */
    public AcademicUnitDataType createAcademicUnitDataType() {
        return new AcademicUnitDataType();
    }

    /**
     * Create an instance of {@link EmployeeReviewTemplateObjectIDType }
     * 
     */
    public EmployeeReviewTemplateObjectIDType createEmployeeReviewTemplateObjectIDType() {
        return new EmployeeReviewTemplateObjectIDType();
    }

    /**
     * Create an instance of {@link TaxAuthorityFormTypeObjectType }
     * 
     */
    public TaxAuthorityFormTypeObjectType createTaxAuthorityFormTypeObjectType() {
        return new TaxAuthorityFormTypeObjectType();
    }

    /**
     * Create an instance of {@link ChangeBusinessTitleBusinessProcessDataType }
     * 
     */
    public ChangeBusinessTitleBusinessProcessDataType createChangeBusinessTitleBusinessProcessDataType() {
        return new ChangeBusinessTitleBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link GenderReferenceType }
     * 
     */
    public GenderReferenceType createGenderReferenceType() {
        return new GenderReferenceType();
    }

    /**
     * Create an instance of {@link DependentType }
     * 
     */
    public DependentType createDependentType() {
        return new DependentType();
    }

    /**
     * Create an instance of {@link DocumentCategoryAllObjectIDType }
     * 
     */
    public DocumentCategoryAllObjectIDType createDocumentCategoryAllObjectIDType() {
        return new DocumentCategoryAllObjectIDType();
    }

    /**
     * Create an instance of {@link NationalIdentifierReferenceObjectType }
     * 
     */
    public NationalIdentifierReferenceObjectType createNationalIdentifierReferenceObjectType() {
        return new NationalIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link PayrollInterfaceContributionDataType }
     * 
     */
    public PayrollInterfaceContributionDataType createPayrollInterfaceContributionDataType() {
        return new PayrollInterfaceContributionDataType();
    }

    /**
     * Create an instance of {@link ExternalInstitutionGradingSchemeGradePointValueObjectIDType }
     * 
     */
    public ExternalInstitutionGradingSchemeGradePointValueObjectIDType createExternalInstitutionGradingSchemeGradePointValueObjectIDType() {
        return new ExternalInstitutionGradingSchemeGradePointValueObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeReviewDetailsDataType }
     * 
     */
    public EmployeeReviewDetailsDataType createEmployeeReviewDetailsDataType() {
        return new EmployeeReviewDetailsDataType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarDataType }
     * 
     */
    public WorkScheduleCalendarDataType createWorkScheduleCalendarDataType() {
        return new WorkScheduleCalendarDataType();
    }

    /**
     * Create an instance of {@link CompanyObjectIDType }
     * 
     */
    public CompanyObjectIDType createCompanyObjectIDType() {
        return new CompanyObjectIDType();
    }

    /**
     * Create an instance of {@link SpecialtyParentObjectType }
     * 
     */
    public SpecialtyParentObjectType createSpecialtyParentObjectType() {
        return new SpecialtyParentObjectType();
    }

    /**
     * Create an instance of {@link ManageCommitteeMembershipDataType }
     * 
     */
    public ManageCommitteeMembershipDataType createManageCommitteeMembershipDataType() {
        return new ManageCommitteeMembershipDataType();
    }

    /**
     * Create an instance of {@link BonusPlanObjectIDType }
     * 
     */
    public BonusPlanObjectIDType createBonusPlanObjectIDType() {
        return new BonusPlanObjectIDType();
    }

    /**
     * Create an instance of {@link RelatedPersonForWorkerObjectType }
     * 
     */
    public RelatedPersonForWorkerObjectType createRelatedPersonForWorkerObjectType() {
        return new RelatedPersonForWorkerObjectType();
    }

    /**
     * Create an instance of {@link AcademicTenureStatusObjectIDType }
     * 
     */
    public AcademicTenureStatusObjectIDType createAcademicTenureStatusObjectIDType() {
        return new AcademicTenureStatusObjectIDType();
    }

    /**
     * Create an instance of {@link StaffAllowedDataType }
     * 
     */
    public StaffAllowedDataType createStaffAllowedDataType() {
        return new StaffAllowedDataType();
    }

    /**
     * Create an instance of {@link RecruitingAssessmentTestObjectType }
     * 
     */
    public RecruitingAssessmentTestObjectType createRecruitingAssessmentTestObjectType() {
        return new RecruitingAssessmentTestObjectType();
    }

    /**
     * Create an instance of {@link JobProfileJobClassificationDataType }
     * 
     */
    public JobProfileJobClassificationDataType createJobProfileJobClassificationDataType() {
        return new JobProfileJobClassificationDataType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupResponseDataType }
     * 
     */
    public AssignUserBasedSecurityGroupResponseDataType createAssignUserBasedSecurityGroupResponseDataType() {
        return new AssignUserBasedSecurityGroupResponseDataType();
    }

    /**
     * Create an instance of {@link CommitteeSponsoringOrganizationObjectIDType }
     * 
     */
    public CommitteeSponsoringOrganizationObjectIDType createCommitteeSponsoringOrganizationObjectIDType() {
        return new CommitteeSponsoringOrganizationObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerPhotosResponseDataType }
     * 
     */
    public WorkerPhotosResponseDataType createWorkerPhotosResponseDataType() {
        return new WorkerPhotosResponseDataType();
    }

    /**
     * Create an instance of {@link HeadcountRestrictionsObjectIDType }
     * 
     */
    public HeadcountRestrictionsObjectIDType createHeadcountRestrictionsObjectIDType() {
        return new HeadcountRestrictionsObjectIDType();
    }

    /**
     * Create an instance of {@link EventClassificationSubcategoryObjectType }
     * 
     */
    public EventClassificationSubcategoryObjectType createEventClassificationSubcategoryObjectType() {
        return new EventClassificationSubcategoryObjectType();
    }

    /**
     * Create an instance of {@link COBRAEligibilityDataType }
     * 
     */
    public COBRAEligibilityDataType createCOBRAEligibilityDataType() {
        return new COBRAEligibilityDataType();
    }

    /**
     * Create an instance of {@link PersonInstantMessengerDataType }
     * 
     */
    public PersonInstantMessengerDataType createPersonInstantMessengerDataType() {
        return new PersonInstantMessengerDataType();
    }

    /**
     * Create an instance of {@link DisabilityCertificationAuthorityObjectType }
     * 
     */
    public DisabilityCertificationAuthorityObjectType createDisabilityCertificationAuthorityObjectType() {
        return new DisabilityCertificationAuthorityObjectType();
    }

    /**
     * Create an instance of {@link MobilityChoiceObjectType }
     * 
     */
    public MobilityChoiceObjectType createMobilityChoiceObjectType() {
        return new MobilityChoiceObjectType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeDataType }
     * 
     */
    public CompanyInsiderTypeDataType createCompanyInsiderTypeDataType() {
        return new CompanyInsiderTypeDataType();
    }

    /**
     * Create an instance of {@link HealthCareCoverageTargetObjectType }
     * 
     */
    public HealthCareCoverageTargetObjectType createHealthCareCoverageTargetObjectType() {
        return new HealthCareCoverageTargetObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemAttachmentObjectIDType }
     * 
     */
    public CommitteeMeetingAgendaItemAttachmentObjectIDType createCommitteeMeetingAgendaItemAttachmentObjectIDType() {
        return new CommitteeMeetingAgendaItemAttachmentObjectIDType();
    }

    /**
     * Create an instance of {@link RelatedPersonType }
     * 
     */
    public RelatedPersonType createRelatedPersonType() {
        return new RelatedPersonType();
    }

    /**
     * Create an instance of {@link QuestionnaireObjectIDType }
     * 
     */
    public QuestionnaireObjectIDType createQuestionnaireObjectIDType() {
        return new QuestionnaireObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeSponsoringOrganizationObjectType }
     * 
     */
    public CommitteeSponsoringOrganizationObjectType createCommitteeSponsoringOrganizationObjectType() {
        return new CommitteeSponsoringOrganizationObjectType();
    }

    /**
     * Create an instance of {@link GetChangeGovernmentIDsRequestReferencesType }
     * 
     */
    public GetChangeGovernmentIDsRequestReferencesType createGetChangeGovernmentIDsRequestReferencesType() {
        return new GetChangeGovernmentIDsRequestReferencesType();
    }

    /**
     * Create an instance of {@link OccupationDataType }
     * 
     */
    public OccupationDataType createOccupationDataType() {
        return new OccupationDataType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarEventDataType }
     * 
     */
    public WorkScheduleCalendarEventDataType createWorkScheduleCalendarEventDataType() {
        return new WorkScheduleCalendarEventDataType();
    }

    /**
     * Create an instance of {@link CountryReferenceType }
     * 
     */
    public CountryReferenceType createCountryReferenceType() {
        return new CountryReferenceType();
    }

    /**
     * Create an instance of {@link CustomIdentificationDataType }
     * 
     */
    public CustomIdentificationDataType createCustomIdentificationDataType() {
        return new CustomIdentificationDataType();
    }

    /**
     * Create an instance of {@link PronounObjectIDType }
     * 
     */
    public PronounObjectIDType createPronounObjectIDType() {
        return new PronounObjectIDType();
    }

    /**
     * Create an instance of {@link PositionTimeTypeObjectIDType }
     * 
     */
    public PositionTimeTypeObjectIDType createPositionTimeTypeObjectIDType() {
        return new PositionTimeTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerRelatedPersonsDataType }
     * 
     */
    public WorkerRelatedPersonsDataType createWorkerRelatedPersonsDataType() {
        return new WorkerRelatedPersonsDataType();
    }

    /**
     * Create an instance of {@link UnionMembershipDataType }
     * 
     */
    public UnionMembershipDataType createUnionMembershipDataType() {
        return new UnionMembershipDataType();
    }

    /**
     * Create an instance of {@link OneTimePaymentPlanObjectType }
     * 
     */
    public OneTimePaymentPlanObjectType createOneTimePaymentPlanObjectType() {
        return new OneTimePaymentPlanObjectType();
    }

    /**
     * Create an instance of {@link GlobalSetupDataMappingObjectType }
     * 
     */
    public GlobalSetupDataMappingObjectType createGlobalSetupDataMappingObjectType() {
        return new GlobalSetupDataMappingObjectType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeType }
     * 
     */
    public WorkersCompensationCodeType createWorkersCompensationCodeType() {
        return new WorkersCompensationCodeType();
    }

    /**
     * Create an instance of {@link JobLevelObjectType }
     * 
     */
    public JobLevelObjectType createJobLevelObjectType() {
        return new JobLevelObjectType();
    }

    /**
     * Create an instance of {@link GenderIdentityRequestCriteriaType }
     * 
     */
    public GenderIdentityRequestCriteriaType createGenderIdentityRequestCriteriaType() {
        return new GenderIdentityRequestCriteriaType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeRequestReferencesType }
     * 
     */
    public ServiceCenterRepresentativeRequestReferencesType createServiceCenterRepresentativeRequestReferencesType() {
        return new ServiceCenterRepresentativeRequestReferencesType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactor4DataType }
     * 
     */
    public CollectiveAgreementFactor4DataType createCollectiveAgreementFactor4DataType() {
        return new CollectiveAgreementFactor4DataType();
    }

    /**
     * Create an instance of {@link InternalProjectExperienceType }
     * 
     */
    public InternalProjectExperienceType createInternalProjectExperienceType() {
        return new InternalProjectExperienceType();
    }

    /**
     * Create an instance of {@link PayrollReportingCodeAllObjectIDType }
     * 
     */
    public PayrollReportingCodeAllObjectIDType createPayrollReportingCodeAllObjectIDType() {
        return new PayrollReportingCodeAllObjectIDType();
    }

    /**
     * Create an instance of {@link ApplicationInstanceRelatedExceptionsDataType }
     * 
     */
    public ApplicationInstanceRelatedExceptionsDataType createApplicationInstanceRelatedExceptionsDataType() {
        return new ApplicationInstanceRelatedExceptionsDataType();
    }

    /**
     * Create an instance of {@link JobFamilyRequestReferencesType }
     * 
     */
    public JobFamilyRequestReferencesType createJobFamilyRequestReferencesType() {
        return new JobFamilyRequestReferencesType();
    }

    /**
     * Create an instance of {@link FeedbackReceivedType }
     * 
     */
    public FeedbackReceivedType createFeedbackReceivedType() {
        return new FeedbackReceivedType();
    }

    /**
     * Create an instance of {@link CompensationGradeProfileReferenceType }
     * 
     */
    public CompensationGradeProfileReferenceType createCompensationGradeProfileReferenceType() {
        return new CompensationGradeProfileReferenceType();
    }

    /**
     * Create an instance of {@link EmployerContributionPercentageDataType }
     * 
     */
    public EmployerContributionPercentageDataType createEmployerContributionPercentageDataType() {
        return new EmployerContributionPercentageDataType();
    }

    /**
     * Create an instance of {@link SkillItemCategoryObjectType }
     * 
     */
    public SkillItemCategoryObjectType createSkillItemCategoryObjectType() {
        return new SkillItemCategoryObjectType();
    }

    /**
     * Create an instance of {@link WorkersResponseDataType }
     * 
     */
    public WorkersResponseDataType createWorkersResponseDataType() {
        return new WorkersResponseDataType();
    }

    /**
     * Create an instance of {@link PayComponentObjectIDType }
     * 
     */
    public PayComponentObjectIDType createPayComponentObjectIDType() {
        return new PayComponentObjectIDType();
    }

    /**
     * Create an instance of {@link StudentCourseTagObjectType }
     * 
     */
    public StudentCourseTagObjectType createStudentCourseTagObjectType() {
        return new StudentCourseTagObjectType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeType }
     * 
     */
    public ServiceCenterRepresentativeType createServiceCenterRepresentativeType() {
        return new ServiceCenterRepresentativeType();
    }

    /**
     * Create an instance of {@link ReorganizationObjectType }
     * 
     */
    public ReorganizationObjectType createReorganizationObjectType() {
        return new ReorganizationObjectType();
    }

    /**
     * Create an instance of {@link InternetEmailAddressDataType }
     * 
     */
    public InternetEmailAddressDataType createInternetEmailAddressDataType() {
        return new InternetEmailAddressDataType();
    }

    /**
     * Create an instance of {@link AwardObjectType }
     * 
     */
    public AwardObjectType createAwardObjectType() {
        return new AwardObjectType();
    }

    /**
     * Create an instance of {@link ChangeWorkContactInformationResponseWrapperType }
     * 
     */
    public ChangeWorkContactInformationResponseWrapperType createChangeWorkContactInformationResponseWrapperType() {
        return new ChangeWorkContactInformationResponseWrapperType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyDataType }
     * 
     */
    public AcademicUnitHierarchyDataType createAcademicUnitHierarchyDataType() {
        return new AcademicUnitHierarchyDataType();
    }

    /**
     * Create an instance of {@link EmployeeReferenceType }
     * 
     */
    public EmployeeReferenceType createEmployeeReferenceType() {
        return new EmployeeReferenceType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationBonusPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationBonusPlanAssignmentDataType createEmployeeCompensationBonusPlanAssignmentDataType() {
        return new EmployeeCompensationBonusPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link GenericMilitaryServiceSubDataType }
     * 
     */
    public GenericMilitaryServiceSubDataType createGenericMilitaryServiceSubDataType() {
        return new GenericMilitaryServiceSubDataType();
    }

    /**
     * Create an instance of {@link JobCategoryObjectIDType }
     * 
     */
    public JobCategoryObjectIDType createJobCategoryObjectIDType() {
        return new JobCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link IDType }
     * 
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link CountryPredefinedPersonNameComponentValueObjectType }
     * 
     */
    public CountryPredefinedPersonNameComponentValueObjectType createCountryPredefinedPersonNameComponentValueObjectType() {
        return new CountryPredefinedPersonNameComponentValueObjectType();
    }

    /**
     * Create an instance of {@link AdditionalNameDataType }
     * 
     */
    public AdditionalNameDataType createAdditionalNameDataType() {
        return new AdditionalNameDataType();
    }

    /**
     * Create an instance of {@link EmployeeObjectIDType }
     * 
     */
    public EmployeeObjectIDType createEmployeeObjectIDType() {
        return new EmployeeObjectIDType();
    }

    /**
     * Create an instance of {@link EthnicityRequestReferencesType }
     * 
     */
    public EthnicityRequestReferencesType createEthnicityRequestReferencesType() {
        return new EthnicityRequestReferencesType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodDetailDataType }
     * 
     */
    public EmployeeProbationPeriodDetailDataType createEmployeeProbationPeriodDetailDataType() {
        return new EmployeeProbationPeriodDetailDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitSubtypeObjectIDType }
     * 
     */
    public AcademicUnitSubtypeObjectIDType createAcademicUnitSubtypeObjectIDType() {
        return new AcademicUnitSubtypeObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupRequestCriteriaType }
     * 
     */
    public CommitteeClassificationGroupRequestCriteriaType createCommitteeClassificationGroupRequestCriteriaType() {
        return new CommitteeClassificationGroupRequestCriteriaType();
    }

    /**
     * Create an instance of {@link AllowanceValuePlanObjectIDType }
     * 
     */
    public AllowanceValuePlanObjectIDType createAllowanceValuePlanObjectIDType() {
        return new AllowanceValuePlanObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingObjectIDType }
     * 
     */
    public CommitteeMeetingObjectIDType createCommitteeMeetingObjectIDType() {
        return new CommitteeMeetingObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackAdditionalDataResponseDataType }
     * 
     */
    public AcademicAppointmentTrackAdditionalDataResponseDataType createAcademicAppointmentTrackAdditionalDataResponseDataType() {
        return new AcademicAppointmentTrackAdditionalDataResponseDataType();
    }

    /**
     * Create an instance of {@link StudentAwardSourceObjectIDType }
     * 
     */
    public StudentAwardSourceObjectIDType createStudentAwardSourceObjectIDType() {
        return new StudentAwardSourceObjectIDType();
    }

    /**
     * Create an instance of {@link ScheduleRequestTypeObjectIDType }
     * 
     */
    public ScheduleRequestTypeObjectIDType createScheduleRequestTypeObjectIDType() {
        return new ScheduleRequestTypeObjectIDType();
    }

    /**
     * Create an instance of {@link AddressLineInformationDataType }
     * 
     */
    public AddressLineInformationDataType createAddressLineInformationDataType() {
        return new AddressLineInformationDataType();
    }

    /**
     * Create an instance of {@link FormerWorkerRequestReferencesType }
     * 
     */
    public FormerWorkerRequestReferencesType createFormerWorkerRequestReferencesType() {
        return new FormerWorkerRequestReferencesType();
    }

    /**
     * Create an instance of {@link COBRAEligibilityReasonObjectIDType }
     * 
     */
    public COBRAEligibilityReasonObjectIDType createCOBRAEligibilityReasonObjectIDType() {
        return new COBRAEligibilityReasonObjectIDType();
    }

    /**
     * Create an instance of {@link EnrollmentPeriodDataType }
     * 
     */
    public EnrollmentPeriodDataType createEnrollmentPeriodDataType() {
        return new EnrollmentPeriodDataType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceIDRequestReferencesType }
     * 
     */
    public OrganizationReferenceIDRequestReferencesType createOrganizationReferenceIDRequestReferencesType() {
        return new OrganizationReferenceIDRequestReferencesType();
    }

    /**
     * Create an instance of {@link ExternalIntegrationIDReferenceDataType }
     * 
     */
    public ExternalIntegrationIDReferenceDataType createExternalIntegrationIDReferenceDataType() {
        return new ExternalIntegrationIDReferenceDataType();
    }

    /**
     * Create an instance of {@link ProficiencyRatingObjectIDType }
     * 
     */
    public ProficiencyRatingObjectIDType createProficiencyRatingObjectIDType() {
        return new ProficiencyRatingObjectIDType();
    }

    /**
     * Create an instance of {@link EffectiveDatedWebServiceAdditionalDataType }
     * 
     */
    public EffectiveDatedWebServiceAdditionalDataType createEffectiveDatedWebServiceAdditionalDataType() {
        return new EffectiveDatedWebServiceAdditionalDataType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationTypeAllObjectType }
     * 
     */
    public ProfessionalAffiliationTypeAllObjectType createProfessionalAffiliationTypeAllObjectType() {
        return new ProfessionalAffiliationTypeAllObjectType();
    }

    /**
     * Create an instance of {@link JobProfileExemptDataType }
     * 
     */
    public JobProfileExemptDataType createJobProfileExemptDataType() {
        return new JobProfileExemptDataType();
    }

    /**
     * Create an instance of {@link EmployeeContributionDataType }
     * 
     */
    public EmployeeContributionDataType createEmployeeContributionDataType() {
        return new EmployeeContributionDataType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordRequestReferencesType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordRequestReferencesType createExternalDisabilitySelfIdentificationRecordRequestReferencesType() {
        return new ExternalDisabilitySelfIdentificationRecordRequestReferencesType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierType }
     * 
     */
    public UniversalIdentifierType createUniversalIdentifierType() {
        return new UniversalIdentifierType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetRequestReferencesType }
     * 
     */
    public WorkStatusRuleSetRequestReferencesType createWorkStatusRuleSetRequestReferencesType() {
        return new WorkStatusRuleSetRequestReferencesType();
    }

    /**
     * Create an instance of {@link EmployeeContractsDataType }
     * 
     */
    public EmployeeContractsDataType createEmployeeContractsDataType() {
        return new EmployeeContractsDataType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarObjectIDType }
     * 
     */
    public WorkScheduleCalendarObjectIDType createWorkScheduleCalendarObjectIDType() {
        return new WorkScheduleCalendarObjectIDType();
    }

    /**
     * Create an instance of {@link LicenseIDTypeAllObjectIDType }
     * 
     */
    public LicenseIDTypeAllObjectIDType createLicenseIDTypeAllObjectIDType() {
        return new LicenseIDTypeAllObjectIDType();
    }

    /**
     * Create an instance of {@link AllowanceValuePlanObjectType }
     * 
     */
    public AllowanceValuePlanObjectType createAllowanceValuePlanObjectType() {
        return new AllowanceValuePlanObjectType();
    }

    /**
     * Create an instance of {@link DevelopmentItemStatusObjectIDType }
     * 
     */
    public DevelopmentItemStatusObjectIDType createDevelopmentItemStatusObjectIDType() {
        return new DevelopmentItemStatusObjectIDType();
    }

    /**
     * Create an instance of {@link SuccessionReadinessObjectIDType }
     * 
     */
    public SuccessionReadinessObjectIDType createSuccessionReadinessObjectIDType() {
        return new SuccessionReadinessObjectIDType();
    }

    /**
     * Create an instance of {@link BonusPlanObjectType }
     * 
     */
    public BonusPlanObjectType createBonusPlanObjectType() {
        return new BonusPlanObjectType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackObjectType }
     * 
     */
    public AcademicAppointmentTrackObjectType createAcademicAppointmentTrackObjectType() {
        return new AcademicAppointmentTrackObjectType();
    }

    /**
     * Create an instance of {@link HeadcountRestrictionsObjectType }
     * 
     */
    public HeadcountRestrictionsObjectType createHeadcountRestrictionsObjectType() {
        return new HeadcountRestrictionsObjectType();
    }

    /**
     * Create an instance of {@link DisabilityDataType }
     * 
     */
    public DisabilityDataType createDisabilityDataType() {
        return new DisabilityDataType();
    }

    /**
     * Create an instance of {@link MilitaryRankObjectType }
     * 
     */
    public MilitaryRankObjectType createMilitaryRankObjectType() {
        return new MilitaryRankObjectType();
    }

    /**
     * Create an instance of {@link HasHealthInsuranceDataType }
     * 
     */
    public HasHealthInsuranceDataType createHasHealthInsuranceDataType() {
        return new HasHealthInsuranceDataType();
    }

    /**
     * Create an instance of {@link HealthCareCoverageTargetObjectIDType }
     * 
     */
    public HealthCareCoverageTargetObjectIDType createHealthCareCoverageTargetObjectIDType() {
        return new HealthCareCoverageTargetObjectIDType();
    }

    /**
     * Create an instance of {@link DisabilityStatusSubDataType }
     * 
     */
    public DisabilityStatusSubDataType createDisabilityStatusSubDataType() {
        return new DisabilityStatusSubDataType();
    }

    /**
     * Create an instance of {@link ResponsibilityQualificationProfileReplacementDataType }
     * 
     */
    public ResponsibilityQualificationProfileReplacementDataType createResponsibilityQualificationProfileReplacementDataType() {
        return new ResponsibilityQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link MainTransactionLogEntryDataType }
     * 
     */
    public MainTransactionLogEntryDataType createMainTransactionLogEntryDataType() {
        return new MainTransactionLogEntryDataType();
    }

    /**
     * Create an instance of {@link CommitteeObjectIDType }
     * 
     */
    public CommitteeObjectIDType createCommitteeObjectIDType() {
        return new CommitteeObjectIDType();
    }

    /**
     * Create an instance of {@link CommonBooleanEnumerationObjectType }
     * 
     */
    public CommonBooleanEnumerationObjectType createCommonBooleanEnumerationObjectType() {
        return new CommonBooleanEnumerationObjectType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentResponseDataType }
     * 
     */
    public FormerWorkerAttachmentResponseDataType createFormerWorkerAttachmentResponseDataType() {
        return new FormerWorkerAttachmentResponseDataType();
    }

    /**
     * Create an instance of {@link WorkerCareerDataType }
     * 
     */
    public WorkerCareerDataType createWorkerCareerDataType() {
        return new WorkerCareerDataType();
    }

    /**
     * Create an instance of {@link CommitteeAttachmentDataType }
     * 
     */
    public CommitteeAttachmentDataType createCommitteeAttachmentDataType() {
        return new CommitteeAttachmentDataType();
    }

    /**
     * Create an instance of {@link AdditionalNameTypeObjectType }
     * 
     */
    public AdditionalNameTypeObjectType createAdditionalNameTypeObjectType() {
        return new AdditionalNameTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationResponseGroupType }
     * 
     */
    public CommitteeClassificationResponseGroupType createCommitteeClassificationResponseGroupType() {
        return new CommitteeClassificationResponseGroupType();
    }

    /**
     * Create an instance of {@link GetChangeHomeContactInformationRequestCriteriaType }
     * 
     */
    public GetChangeHomeContactInformationRequestCriteriaType createGetChangeHomeContactInformationRequestCriteriaType() {
        return new GetChangeHomeContactInformationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link TrainingTypeResponseDataType }
     * 
     */
    public TrainingTypeResponseDataType createTrainingTypeResponseDataType() {
        return new TrainingTypeResponseDataType();
    }

    /**
     * Create an instance of {@link OrganizationRequestReferencesType }
     * 
     */
    public OrganizationRequestReferencesType createOrganizationRequestReferencesType() {
        return new OrganizationRequestReferencesType();
    }

    /**
     * Create an instance of {@link AwardAndActivityTypeObjectIDType }
     * 
     */
    public AwardAndActivityTypeObjectIDType createAwardAndActivityTypeObjectIDType() {
        return new AwardAndActivityTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerProfileDataType }
     * 
     */
    public WorkerProfileDataType createWorkerProfileDataType() {
        return new WorkerProfileDataType();
    }

    /**
     * Create an instance of {@link PersonQualificationDataType }
     * 
     */
    public PersonQualificationDataType createPersonQualificationDataType() {
        return new PersonQualificationDataType();
    }

    /**
     * Create an instance of {@link LeaveTypeReasonObjectIDType }
     * 
     */
    public LeaveTypeReasonObjectIDType createLeaveTypeReasonObjectIDType() {
        return new LeaveTypeReasonObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerRetirementSavingsPeriodDataType }
     * 
     */
    public WorkerRetirementSavingsPeriodDataType createWorkerRetirementSavingsPeriodDataType() {
        return new WorkerRetirementSavingsPeriodDataType();
    }

    /**
     * Create an instance of {@link WorkerManagementChainDataType }
     * 
     */
    public WorkerManagementChainDataType createWorkerManagementChainDataType() {
        return new WorkerManagementChainDataType();
    }

    /**
     * Create an instance of {@link SkillObjectIDType }
     * 
     */
    public SkillObjectIDType createSkillObjectIDType() {
        return new SkillObjectIDType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationReferenceObjectIDType }
     * 
     */
    public ProfessionalAffiliationReferenceObjectIDType createProfessionalAffiliationReferenceObjectIDType() {
        return new ProfessionalAffiliationReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link SearchSettingsResponseDataType }
     * 
     */
    public SearchSettingsResponseDataType createSearchSettingsResponseDataType() {
        return new SearchSettingsResponseDataType();
    }

    /**
     * Create an instance of {@link SystemUserObjectType }
     * 
     */
    public SystemUserObjectType createSystemUserObjectType() {
        return new SystemUserObjectType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceIDResponseDataType }
     * 
     */
    public OrganizationReferenceIDResponseDataType createOrganizationReferenceIDResponseDataType() {
        return new OrganizationReferenceIDResponseDataType();
    }

    /**
     * Create an instance of {@link PassportIDTypeAllObjectType }
     * 
     */
    public PassportIDTypeAllObjectType createPassportIDTypeAllObjectType() {
        return new PassportIDTypeAllObjectType();
    }

    /**
     * Create an instance of {@link AddAcademicAppointmentDataType }
     * 
     */
    public AddAcademicAppointmentDataType createAddAcademicAppointmentDataType() {
        return new AddAcademicAppointmentDataType();
    }

    /**
     * Create an instance of {@link WorkerDocumentDataWWSType }
     * 
     */
    public WorkerDocumentDataWWSType createWorkerDocumentDataWWSType() {
        return new WorkerDocumentDataWWSType();
    }

    /**
     * Create an instance of {@link GenderIdentityResponseDataType }
     * 
     */
    public GenderIdentityResponseDataType createGenderIdentityResponseDataType() {
        return new GenderIdentityResponseDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountResponseGroupType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountResponseGroupType createServiceCenterRepresentativeWorkdayAccountResponseGroupType() {
        return new ServiceCenterRepresentativeWorkdayAccountResponseGroupType();
    }

    /**
     * Create an instance of {@link DifficultyToFillType }
     * 
     */
    public DifficultyToFillType createDifficultyToFillType() {
        return new DifficultyToFillType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackAdditionalDataRequestCriteriaType }
     * 
     */
    public AcademicAppointmentTrackAdditionalDataRequestCriteriaType createAcademicAppointmentTrackAdditionalDataRequestCriteriaType() {
        return new AcademicAppointmentTrackAdditionalDataRequestCriteriaType();
    }

    /**
     * Create an instance of {@link MilitaryServiceTypeObjectIDType }
     * 
     */
    public MilitaryServiceTypeObjectIDType createMilitaryServiceTypeObjectIDType() {
        return new MilitaryServiceTypeObjectIDType();
    }

    /**
     * Create an instance of {@link RelatedPersonDescriptorDataType }
     * 
     */
    public RelatedPersonDescriptorDataType createRelatedPersonDescriptorDataType() {
        return new RelatedPersonDescriptorDataType();
    }

    /**
     * Create an instance of {@link LeaveStatusDataType }
     * 
     */
    public LeaveStatusDataType createLeaveStatusDataType() {
        return new LeaveStatusDataType();
    }

    /**
     * Create an instance of {@link LocalLastNameDataType }
     * 
     */
    public LocalLastNameDataType createLocalLastNameDataType() {
        return new LocalLastNameDataType();
    }

    /**
     * Create an instance of {@link DifficultyToFillObjectIDType }
     * 
     */
    public DifficultyToFillObjectIDType createDifficultyToFillObjectIDType() {
        return new DifficultyToFillObjectIDType();
    }

    /**
     * Create an instance of {@link MilitaryServiceInformationDataType }
     * 
     */
    public MilitaryServiceInformationDataType createMilitaryServiceInformationDataType() {
        return new MilitaryServiceInformationDataType();
    }

    /**
     * Create an instance of {@link PhoneDeviceTypeObjectIDType }
     * 
     */
    public PhoneDeviceTypeObjectIDType createPhoneDeviceTypeObjectIDType() {
        return new PhoneDeviceTypeObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyObjectIDType }
     * 
     */
    public AcademicUnitHierarchyObjectIDType createAcademicUnitHierarchyObjectIDType() {
        return new AcademicUnitHierarchyObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalPayrollEntityObjectType }
     * 
     */
    public ExternalPayrollEntityObjectType createExternalPayrollEntityObjectType() {
        return new ExternalPayrollEntityObjectType();
    }

    /**
     * Create an instance of {@link PositionSetObjectType }
     * 
     */
    public PositionSetObjectType createPositionSetObjectType() {
        return new PositionSetObjectType();
    }

    /**
     * Create an instance of {@link StockVestingScheduleObjectType }
     * 
     */
    public StockVestingScheduleObjectType createStockVestingScheduleObjectType() {
        return new StockVestingScheduleObjectType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementDetailDataType }
     * 
     */
    public CollectiveAgreementDetailDataType createCollectiveAgreementDetailDataType() {
        return new CollectiveAgreementDetailDataType();
    }

    /**
     * Create an instance of {@link ChangeWorkContactInformationBusinessProcessDataType }
     * 
     */
    public ChangeWorkContactInformationBusinessProcessDataType createChangeWorkContactInformationBusinessProcessDataType() {
        return new ChangeWorkContactInformationBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link RecurrenceDataType }
     * 
     */
    public RecurrenceDataType createRecurrenceDataType() {
        return new RecurrenceDataType();
    }

    /**
     * Create an instance of {@link OrganizationTypeObjectIDType }
     * 
     */
    public OrganizationTypeObjectIDType createOrganizationTypeObjectIDType() {
        return new OrganizationTypeObjectIDType();
    }

    /**
     * Create an instance of {@link LeaveTypeReasonObjectType }
     * 
     */
    public LeaveTypeReasonObjectType createLeaveTypeReasonObjectType() {
        return new LeaveTypeReasonObjectType();
    }

    /**
     * Create an instance of {@link JobClassificationReferenceType }
     * 
     */
    public JobClassificationReferenceType createJobClassificationReferenceType() {
        return new JobClassificationReferenceType();
    }

    /**
     * Create an instance of {@link JobProfileSummaryDataType }
     * 
     */
    public JobProfileSummaryDataType createJobProfileSummaryDataType() {
        return new JobProfileSummaryDataType();
    }

    /**
     * Create an instance of {@link WorkersCompensationReplacementDataType }
     * 
     */
    public WorkersCompensationReplacementDataType createWorkersCompensationReplacementDataType() {
        return new WorkersCompensationReplacementDataType();
    }

    /**
     * Create an instance of {@link CertificationQualificationProfileReplacementDataType }
     * 
     */
    public CertificationQualificationProfileReplacementDataType createCertificationQualificationProfileReplacementDataType() {
        return new CertificationQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link LocationRequestReferencesType }
     * 
     */
    public LocationRequestReferencesType createLocationRequestReferencesType() {
        return new LocationRequestReferencesType();
    }

    /**
     * Create an instance of {@link CompensationGradeObjectIDType }
     * 
     */
    public CompensationGradeObjectIDType createCompensationGradeObjectIDType() {
        return new CompensationGradeObjectIDType();
    }

    /**
     * Create an instance of {@link InstanceObjectType }
     * 
     */
    public InstanceObjectType createInstanceObjectType() {
        return new InstanceObjectType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountRequestReferencesType }
     * 
     */
    public GetWorkdayAccountRequestReferencesType createGetWorkdayAccountRequestReferencesType() {
        return new GetWorkdayAccountRequestReferencesType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceType }
     * 
     */
    public OrganizationReferenceType createOrganizationReferenceType() {
        return new OrganizationReferenceType();
    }

    /**
     * Create an instance of {@link ChangeLegalNameBusinessProcessDataType }
     * 
     */
    public ChangeLegalNameBusinessProcessDataType createChangeLegalNameBusinessProcessDataType() {
        return new ChangeLegalNameBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupResponseGroupType }
     * 
     */
    public CommitteeClassificationGroupResponseGroupType createCommitteeClassificationGroupResponseGroupType() {
        return new CommitteeClassificationGroupResponseGroupType();
    }

    /**
     * Create an instance of {@link TrainingTypeObjectType }
     * 
     */
    public TrainingTypeObjectType createTrainingTypeObjectType() {
        return new TrainingTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeDefinitionDataType }
     * 
     */
    public CommitteeDefinitionDataType createCommitteeDefinitionDataType() {
        return new CommitteeDefinitionDataType();
    }

    /**
     * Create an instance of {@link ApplicantObjectIDType }
     * 
     */
    public ApplicantObjectIDType createApplicantObjectIDType() {
        return new ApplicantObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationAllowancePlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationAllowancePlanAssignmentDetailDataType createEmployeeCompensationAllowancePlanAssignmentDetailDataType() {
        return new EmployeeCompensationAllowancePlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentSetObjectIDType }
     * 
     */
    public AcademicAppointmentSetObjectIDType createAcademicAppointmentSetObjectIDType() {
        return new AcademicAppointmentSetObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentsDataType }
     * 
     */
    public OrganizationAssignmentsDataType createOrganizationAssignmentsDataType() {
        return new OrganizationAssignmentsDataType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupRequestReferencesType }
     * 
     */
    public JobClassificationGroupRequestReferencesType createJobClassificationGroupRequestReferencesType() {
        return new JobClassificationGroupRequestReferencesType();
    }

    /**
     * Create an instance of {@link LocationObjectType }
     * 
     */
    public LocationObjectType createLocationObjectType() {
        return new LocationObjectType();
    }

    /**
     * Create an instance of {@link EmergencyContactDataType }
     * 
     */
    public EmergencyContactDataType createEmergencyContactDataType() {
        return new EmergencyContactDataType();
    }

    /**
     * Create an instance of {@link LocalPersonNameDetailDataType }
     * 
     */
    public LocalPersonNameDetailDataType createLocalPersonNameDetailDataType() {
        return new LocalPersonNameDetailDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeRequestCriteriaType }
     * 
     */
    public CommitteeMembershipTypeRequestCriteriaType createCommitteeMembershipTypeRequestCriteriaType() {
        return new CommitteeMembershipTypeRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PositionManagementChainsDataType }
     * 
     */
    public PositionManagementChainsDataType createPositionManagementChainsDataType() {
        return new PositionManagementChainsDataType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationSkillObjectIDType }
     * 
     */
    public ProfessionalAffiliationSkillObjectIDType createProfessionalAffiliationSkillObjectIDType() {
        return new ProfessionalAffiliationSkillObjectIDType();
    }

    /**
     * Create an instance of {@link LeaveRequestEventObjectIDType }
     * 
     */
    public LeaveRequestEventObjectIDType createLeaveRequestEventObjectIDType() {
        return new LeaveRequestEventObjectIDType();
    }

    /**
     * Create an instance of {@link JobRequisitionObjectIDType }
     * 
     */
    public JobRequisitionObjectIDType createJobRequisitionObjectIDType() {
        return new JobRequisitionObjectIDType();
    }

    /**
     * Create an instance of {@link BenefitCoverageTypeObjectIDType }
     * 
     */
    public BenefitCoverageTypeObjectIDType createBenefitCoverageTypeObjectIDType() {
        return new BenefitCoverageTypeObjectIDType();
    }

    /**
     * Create an instance of {@link ProbationPeriodExtendedLengthDataType }
     * 
     */
    public ProbationPeriodExtendedLengthDataType createProbationPeriodExtendedLengthDataType() {
        return new ProbationPeriodExtendedLengthDataType();
    }

    /**
     * Create an instance of {@link DependentDataWWSType }
     * 
     */
    public DependentDataWWSType createDependentDataWWSType() {
        return new DependentDataWWSType();
    }

    /**
     * Create an instance of {@link ConditionRuleObjectType }
     * 
     */
    public ConditionRuleObjectType createConditionRuleObjectType() {
        return new ConditionRuleObjectType();
    }

    /**
     * Create an instance of {@link OrganizationResponseDataType }
     * 
     */
    public OrganizationResponseDataType createOrganizationResponseDataType() {
        return new OrganizationResponseDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingStatusObjectType }
     * 
     */
    public CommitteeMeetingStatusObjectType createCommitteeMeetingStatusObjectType() {
        return new CommitteeMeetingStatusObjectType();
    }

    /**
     * Create an instance of {@link SalaryPayPlanObjectType }
     * 
     */
    public SalaryPayPlanObjectType createSalaryPayPlanObjectType() {
        return new SalaryPayPlanObjectType();
    }

    /**
     * Create an instance of {@link ReviewTypeObjectIDType }
     * 
     */
    public ReviewTypeObjectIDType createReviewTypeObjectIDType() {
        return new ReviewTypeObjectIDType();
    }

    /**
     * Create an instance of {@link MonthObjectType }
     * 
     */
    public MonthObjectType createMonthObjectType() {
        return new MonthObjectType();
    }

    /**
     * Create an instance of {@link FrequencyReferenceDataType }
     * 
     */
    public FrequencyReferenceDataType createFrequencyReferenceDataType() {
        return new FrequencyReferenceDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeResponseDataType }
     * 
     */
    public ServiceCenterRepresentativeResponseDataType createServiceCenterRepresentativeResponseDataType() {
        return new ServiceCenterRepresentativeResponseDataType();
    }

    /**
     * Create an instance of {@link AdditionalBenefitsCoverageTargetObjectIDType }
     * 
     */
    public AdditionalBenefitsCoverageTargetObjectIDType createAdditionalBenefitsCoverageTargetObjectIDType() {
        return new AdditionalBenefitsCoverageTargetObjectIDType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentType }
     * 
     */
    public ProvisioningGroupAssignmentType createProvisioningGroupAssignmentType() {
        return new ProvisioningGroupAssignmentType();
    }

    /**
     * Create an instance of {@link SexualOrientationObjectIDType }
     * 
     */
    public SexualOrientationObjectIDType createSexualOrientationObjectIDType() {
        return new SexualOrientationObjectIDType();
    }

    /**
     * Create an instance of {@link TravelPreferenceDataType }
     * 
     */
    public TravelPreferenceDataType createTravelPreferenceDataType() {
        return new TravelPreferenceDataType();
    }

    /**
     * Create an instance of {@link PersonIdentificationDataType }
     * 
     */
    public PersonIdentificationDataType createPersonIdentificationDataType() {
        return new PersonIdentificationDataType();
    }

    /**
     * Create an instance of {@link CommitteeTypeRequestCriteriaType }
     * 
     */
    public CommitteeTypeRequestCriteriaType createCommitteeTypeRequestCriteriaType() {
        return new CommitteeTypeRequestCriteriaType();
    }

    /**
     * Create an instance of {@link EmergencyContactPriorityReferenceType }
     * 
     */
    public EmergencyContactPriorityReferenceType createEmergencyContactPriorityReferenceType() {
        return new EmergencyContactPriorityReferenceType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemAttachmentsType }
     * 
     */
    public CommitteeMeetingAgendaItemAttachmentsType createCommitteeMeetingAgendaItemAttachmentsType() {
        return new CommitteeMeetingAgendaItemAttachmentsType();
    }

    /**
     * Create an instance of {@link FormerWorkerDataType }
     * 
     */
    public FormerWorkerDataType createFormerWorkerDataType() {
        return new FormerWorkerDataType();
    }

    /**
     * Create an instance of {@link EducationAchievementDataType }
     * 
     */
    public EducationAchievementDataType createEducationAchievementDataType() {
        return new EducationAchievementDataType();
    }

    /**
     * Create an instance of {@link AllowanceUnitPlanObjectType }
     * 
     */
    public AllowanceUnitPlanObjectType createAllowanceUnitPlanObjectType() {
        return new AllowanceUnitPlanObjectType();
    }

    /**
     * Create an instance of {@link ComponentCompletionObjectIDType }
     * 
     */
    public ComponentCompletionObjectIDType createComponentCompletionObjectIDType() {
        return new ComponentCompletionObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerObjectType }
     * 
     */
    public FormerWorkerObjectType createFormerWorkerObjectType() {
        return new FormerWorkerObjectType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarObjectType }
     * 
     */
    public WorkScheduleCalendarObjectType createWorkScheduleCalendarObjectType() {
        return new WorkScheduleCalendarObjectType();
    }

    /**
     * Create an instance of {@link AcademicPeriodObjectType }
     * 
     */
    public AcademicPeriodObjectType createAcademicPeriodObjectType() {
        return new AcademicPeriodObjectType();
    }

    /**
     * Create an instance of {@link DisabilityStatusSubDataForRelatedPersonType }
     * 
     */
    public DisabilityStatusSubDataForRelatedPersonType createDisabilityStatusSubDataForRelatedPersonType() {
        return new DisabilityStatusSubDataForRelatedPersonType();
    }

    /**
     * Create an instance of {@link EmployeeReviewTemplateObjectType }
     * 
     */
    public EmployeeReviewTemplateObjectType createEmployeeReviewTemplateObjectType() {
        return new EmployeeReviewTemplateObjectType();
    }

    /**
     * Create an instance of {@link WorkHoursProfileObjectIDType }
     * 
     */
    public WorkHoursProfileObjectIDType createWorkHoursProfileObjectIDType() {
        return new WorkHoursProfileObjectIDType();
    }

    /**
     * Create an instance of {@link EducationQualificationProfileReplacementDataType }
     * 
     */
    public EducationQualificationProfileReplacementDataType createEducationQualificationProfileReplacementDataType() {
        return new EducationQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link CompensationMatrixObjectIDType }
     * 
     */
    public CompensationMatrixObjectIDType createCompensationMatrixObjectIDType() {
        return new CompensationMatrixObjectIDType();
    }

    /**
     * Create an instance of {@link SynonymWebserviceDataType }
     * 
     */
    public SynonymWebserviceDataType createSynonymWebserviceDataType() {
        return new SynonymWebserviceDataType();
    }

    /**
     * Create an instance of {@link ReviewTypeObjectType }
     * 
     */
    public ReviewTypeObjectType createReviewTypeObjectType() {
        return new ReviewTypeObjectType();
    }

    /**
     * Create an instance of {@link StockPlanObjectType }
     * 
     */
    public StockPlanObjectType createStockPlanObjectType() {
        return new StockPlanObjectType();
    }

    /**
     * Create an instance of {@link CompetencyAchievementDataV10Type }
     * 
     */
    public CompetencyAchievementDataV10Type createCompetencyAchievementDataV10Type() {
        return new CompetencyAchievementDataV10Type();
    }

    /**
     * Create an instance of {@link CountryRegionReferenceType }
     * 
     */
    public CountryRegionReferenceType createCountryRegionReferenceType() {
        return new CountryRegionReferenceType();
    }

    /**
     * Create an instance of {@link GenericMilitaryServiceInformationDataType }
     * 
     */
    public GenericMilitaryServiceInformationDataType createGenericMilitaryServiceInformationDataType() {
        return new GenericMilitaryServiceInformationDataType();
    }

    /**
     * Create an instance of {@link LocationSummaryDataType }
     * 
     */
    public LocationSummaryDataType createLocationSummaryDataType() {
        return new LocationSummaryDataType();
    }

    /**
     * Create an instance of {@link EmployeeObjectType }
     * 
     */
    public EmployeeObjectType createEmployeeObjectType() {
        return new EmployeeObjectType();
    }

    /**
     * Create an instance of {@link WorkerDocumentDetailsDataType }
     * 
     */
    public WorkerDocumentDetailsDataType createWorkerDocumentDetailsDataType() {
        return new WorkerDocumentDetailsDataType();
    }

    /**
     * Create an instance of {@link PositionTimeTypeReferenceType }
     * 
     */
    public PositionTimeTypeReferenceType createPositionTimeTypeReferenceType() {
        return new PositionTimeTypeReferenceType();
    }

    /**
     * Create an instance of {@link EthnicityObjectIDType }
     * 
     */
    public EthnicityObjectIDType createEthnicityObjectIDType() {
        return new EthnicityObjectIDType();
    }

    /**
     * Create an instance of {@link ProfessionalExperienceDataType }
     * 
     */
    public ProfessionalExperienceDataType createProfessionalExperienceDataType() {
        return new ProfessionalExperienceDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountResponseDataType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountResponseDataType createServiceCenterRepresentativeWorkdayAccountResponseDataType() {
        return new ServiceCenterRepresentativeWorkdayAccountResponseDataType();
    }

    /**
     * Create an instance of {@link SexualOrientationResponseDataType }
     * 
     */
    public SexualOrientationResponseDataType createSexualOrientationResponseDataType() {
        return new SexualOrientationResponseDataType();
    }

    /**
     * Create an instance of {@link LossImpactObjectType }
     * 
     */
    public LossImpactObjectType createLossImpactObjectType() {
        return new LossImpactObjectType();
    }

    /**
     * Create an instance of {@link DevelopmentItemStatusObjectType }
     * 
     */
    public DevelopmentItemStatusObjectType createDevelopmentItemStatusObjectType() {
        return new DevelopmentItemStatusObjectType();
    }

    /**
     * Create an instance of {@link EthnicityDataType }
     * 
     */
    public EthnicityDataType createEthnicityDataType() {
        return new EthnicityDataType();
    }

    /**
     * Create an instance of {@link NotificationSubCategoryConfigurationsForUsersType }
     * 
     */
    public NotificationSubCategoryConfigurationsForUsersType createNotificationSubCategoryConfigurationsForUsersType() {
        return new NotificationSubCategoryConfigurationsForUsersType();
    }

    /**
     * Create an instance of {@link CommunicationMethodUsageDataType }
     * 
     */
    public CommunicationMethodUsageDataType createCommunicationMethodUsageDataType() {
        return new CommunicationMethodUsageDataType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentRestrictionsRequestReferencesType }
     * 
     */
    public OrganizationAssignmentRestrictionsRequestReferencesType createOrganizationAssignmentRestrictionsRequestReferencesType() {
        return new OrganizationAssignmentRestrictionsRequestReferencesType();
    }

    /**
     * Create an instance of {@link ChangeWorkContactInformationResponseDataType }
     * 
     */
    public ChangeWorkContactInformationResponseDataType createChangeWorkContactInformationResponseDataType() {
        return new ChangeWorkContactInformationResponseDataType();
    }

    /**
     * Create an instance of {@link PersonNameSuffixDataType }
     * 
     */
    public PersonNameSuffixDataType createPersonNameSuffixDataType() {
        return new PersonNameSuffixDataType();
    }

    /**
     * Create an instance of {@link EstablishmentDataType }
     * 
     */
    public EstablishmentDataType createEstablishmentDataType() {
        return new EstablishmentDataType();
    }

    /**
     * Create an instance of {@link PayRateTypeObjectType }
     * 
     */
    public PayRateTypeObjectType createPayRateTypeObjectType() {
        return new PayRateTypeObjectType();
    }

    /**
     * Create an instance of {@link FrequencyResponseDataType }
     * 
     */
    public FrequencyResponseDataType createFrequencyResponseDataType() {
        return new FrequencyResponseDataType();
    }

    /**
     * Create an instance of {@link LeaveRequestEventObjectType }
     * 
     */
    public LeaveRequestEventObjectType createLeaveRequestEventObjectType() {
        return new LeaveRequestEventObjectType();
    }

    /**
     * Create an instance of {@link VisaIdentifierReferenceObjectIDType }
     * 
     */
    public VisaIdentifierReferenceObjectIDType createVisaIdentifierReferenceObjectIDType() {
        return new VisaIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAttachmentObjectType }
     * 
     */
    public CommitteeMeetingAttachmentObjectType createCommitteeMeetingAttachmentObjectType() {
        return new CommitteeMeetingAttachmentObjectType();
    }

    /**
     * Create an instance of {@link GetChangeHomeContactInformationRequestReferencesType }
     * 
     */
    public GetChangeHomeContactInformationRequestReferencesType createGetChangeHomeContactInformationRequestReferencesType() {
        return new GetChangeHomeContactInformationRequestReferencesType();
    }

    /**
     * Create an instance of {@link JobCategoryObjectType }
     * 
     */
    public JobCategoryObjectType createJobCategoryObjectType() {
        return new JobCategoryObjectType();
    }

    /**
     * Create an instance of {@link OrganizationRoleAssignmentForWorkerDataType }
     * 
     */
    public OrganizationRoleAssignmentForWorkerDataType createOrganizationRoleAssignmentForWorkerDataType() {
        return new OrganizationRoleAssignmentForWorkerDataType();
    }

    /**
     * Create an instance of {@link SuccessionProfileDataType }
     * 
     */
    public SuccessionProfileDataType createSuccessionProfileDataType() {
        return new SuccessionProfileDataType();
    }

    /**
     * Create an instance of {@link NationalIDTypeObjectType }
     * 
     */
    public NationalIDTypeObjectType createNationalIDTypeObjectType() {
        return new NationalIDTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemVoteObjectType }
     * 
     */
    public CommitteeMeetingAgendaItemVoteObjectType createCommitteeMeetingAgendaItemVoteObjectType() {
        return new CommitteeMeetingAgendaItemVoteObjectType();
    }

    /**
     * Create an instance of {@link SubregionDataType }
     * 
     */
    public SubregionDataType createSubregionDataType() {
        return new SubregionDataType();
    }

    /**
     * Create an instance of {@link EducationObjectType }
     * 
     */
    public EducationObjectType createEducationObjectType() {
        return new EducationObjectType();
    }

    /**
     * Create an instance of {@link CommunicationUsageBehaviorObjectIDType }
     * 
     */
    public CommunicationUsageBehaviorObjectIDType createCommunicationUsageBehaviorObjectIDType() {
        return new CommunicationUsageBehaviorObjectIDType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupResponseGroupType }
     * 
     */
    public ProvisioningGroupResponseGroupType createProvisioningGroupResponseGroupType() {
        return new ProvisioningGroupResponseGroupType();
    }

    /**
     * Create an instance of {@link EmergencyContactObjectIDType }
     * 
     */
    public EmergencyContactObjectIDType createEmergencyContactObjectIDType() {
        return new EmergencyContactObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeContractReasonObjectType }
     * 
     */
    public EmployeeContractReasonObjectType createEmployeeContractReasonObjectType() {
        return new EmployeeContractReasonObjectType();
    }

    /**
     * Create an instance of {@link CourseSubjectObjectIDType }
     * 
     */
    public CourseSubjectObjectIDType createCourseSubjectObjectIDType() {
        return new CourseSubjectObjectIDType();
    }

    /**
     * Create an instance of {@link EstablishmentObjectType }
     * 
     */
    public EstablishmentObjectType createEstablishmentObjectType() {
        return new EstablishmentObjectType();
    }

    /**
     * Create an instance of {@link PreviousSystemJobHistoryGetDataType }
     * 
     */
    public PreviousSystemJobHistoryGetDataType createPreviousSystemJobHistoryGetDataType() {
        return new PreviousSystemJobHistoryGetDataType();
    }

    /**
     * Create an instance of {@link SpecialtyChildObjectType }
     * 
     */
    public SpecialtyChildObjectType createSpecialtyChildObjectType() {
        return new SpecialtyChildObjectType();
    }

    /**
     * Create an instance of {@link AchievableLevelObjectIDType }
     * 
     */
    public AchievableLevelObjectIDType createAchievableLevelObjectIDType() {
        return new AchievableLevelObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingRequestReferencesType }
     * 
     */
    public CommitteeMeetingRequestReferencesType createCommitteeMeetingRequestReferencesType() {
        return new CommitteeMeetingRequestReferencesType();
    }

    /**
     * Create an instance of {@link MaritalStatusObjectIDType }
     * 
     */
    public MaritalStatusObjectIDType createMaritalStatusObjectIDType() {
        return new MaritalStatusObjectIDType();
    }

    /**
     * Create an instance of {@link LocationAttributeType }
     * 
     */
    public LocationAttributeType createLocationAttributeType() {
        return new LocationAttributeType();
    }

    /**
     * Create an instance of {@link CommonBooleanEnumerationObjectIDType }
     * 
     */
    public CommonBooleanEnumerationObjectIDType createCommonBooleanEnumerationObjectIDType() {
        return new CommonBooleanEnumerationObjectIDType();
    }

    /**
     * Create an instance of {@link SuccessionPlanCandidateDataType }
     * 
     */
    public SuccessionPlanCandidateDataType createSuccessionPlanCandidateDataType() {
        return new SuccessionPlanCandidateDataType();
    }

    /**
     * Create an instance of {@link TransactionLogEntryType }
     * 
     */
    public TransactionLogEntryType createTransactionLogEntryType() {
        return new TransactionLogEntryType();
    }

    /**
     * Create an instance of {@link CompensatableGuidelinesDataType }
     * 
     */
    public CompensatableGuidelinesDataType createCompensatableGuidelinesDataType() {
        return new CompensatableGuidelinesDataType();
    }

    /**
     * Create an instance of {@link JobFamilyType }
     * 
     */
    public JobFamilyType createJobFamilyType() {
        return new JobFamilyType();
    }

    /**
     * Create an instance of {@link WorkExperienceQualificationProfileReplacementDataType }
     * 
     */
    public WorkExperienceQualificationProfileReplacementDataType createWorkExperienceQualificationProfileReplacementDataType() {
        return new WorkExperienceQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link ApplicationInstanceExceptionsDataType }
     * 
     */
    public ApplicationInstanceExceptionsDataType createApplicationInstanceExceptionsDataType() {
        return new ApplicationInstanceExceptionsDataType();
    }

    /**
     * Create an instance of {@link ExceptionDataType }
     * 
     */
    public ExceptionDataType createExceptionDataType() {
        return new ExceptionDataType();
    }

    /**
     * Create an instance of {@link JobClassificationDataType }
     * 
     */
    public JobClassificationDataType createJobClassificationDataType() {
        return new JobClassificationDataType();
    }

    /**
     * Create an instance of {@link FrequencyObjectIDType }
     * 
     */
    public FrequencyObjectIDType createFrequencyObjectIDType() {
        return new FrequencyObjectIDType();
    }

    /**
     * Create an instance of {@link SelfIdentificationOfDisabilityStatusObjectType }
     * 
     */
    public SelfIdentificationOfDisabilityStatusObjectType createSelfIdentificationOfDisabilityStatusObjectType() {
        return new SelfIdentificationOfDisabilityStatusObjectType();
    }

    /**
     * Create an instance of {@link LegalNameDataType }
     * 
     */
    public LegalNameDataType createLegalNameDataType() {
        return new LegalNameDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountRequestCriteriaType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountRequestCriteriaType createServiceCenterRepresentativeWorkdayAccountRequestCriteriaType() {
        return new ServiceCenterRepresentativeWorkdayAccountRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkerHealthCarePeriodDataType }
     * 
     */
    public WorkerHealthCarePeriodDataType createWorkerHealthCarePeriodDataType() {
        return new WorkerHealthCarePeriodDataType();
    }

    /**
     * Create an instance of {@link WorkHoursProfileObjectType }
     * 
     */
    public WorkHoursProfileObjectType createWorkHoursProfileObjectType() {
        return new WorkHoursProfileObjectType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsDataType }
     * 
     */
    public AssignUserBasedSecurityGroupsDataType createAssignUserBasedSecurityGroupsDataType() {
        return new AssignUserBasedSecurityGroupsDataType();
    }

    /**
     * Create an instance of {@link JobClassificationObjectIDType }
     * 
     */
    public JobClassificationObjectIDType createJobClassificationObjectIDType() {
        return new JobClassificationObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationGoalObjectIDType }
     * 
     */
    public OrganizationGoalObjectIDType createOrganizationGoalObjectIDType() {
        return new OrganizationGoalObjectIDType();
    }

    /**
     * Create an instance of {@link PersonNamePrefixDataType }
     * 
     */
    public PersonNamePrefixDataType createPersonNamePrefixDataType() {
        return new PersonNamePrefixDataType();
    }

    /**
     * Create an instance of {@link ChangeEmergencyContactDataType }
     * 
     */
    public ChangeEmergencyContactDataType createChangeEmergencyContactDataType() {
        return new ChangeEmergencyContactDataType();
    }

    /**
     * Create an instance of {@link MeritPercentPlanObjectIDType }
     * 
     */
    public MeritPercentPlanObjectIDType createMeritPercentPlanObjectIDType() {
        return new MeritPercentPlanObjectIDType();
    }

    /**
     * Create an instance of {@link BeneficiaryObjectType }
     * 
     */
    public BeneficiaryObjectType createBeneficiaryObjectType() {
        return new BeneficiaryObjectType();
    }

    /**
     * Create an instance of {@link TrainingQualificationProfileReplacementDataType }
     * 
     */
    public TrainingQualificationProfileReplacementDataType createTrainingQualificationProfileReplacementDataType() {
        return new TrainingQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link PayRateTypeReferenceType }
     * 
     */
    public PayRateTypeReferenceType createPayRateTypeReferenceType() {
        return new PayRateTypeReferenceType();
    }

    /**
     * Create an instance of {@link JobFamilyResponseGroupType }
     * 
     */
    public JobFamilyResponseGroupType createJobFamilyResponseGroupType() {
        return new JobFamilyResponseGroupType();
    }

    /**
     * Create an instance of {@link JobFamilyBaseObjectIDType }
     * 
     */
    public JobFamilyBaseObjectIDType createJobFamilyBaseObjectIDType() {
        return new JobFamilyBaseObjectIDType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeRequestReferencesType }
     * 
     */
    public CompanyInsiderTypeRequestReferencesType createCompanyInsiderTypeRequestReferencesType() {
        return new CompanyInsiderTypeRequestReferencesType();
    }

    /**
     * Create an instance of {@link CIPCodeWorkdayOwnedObjectType }
     * 
     */
    public CIPCodeWorkdayOwnedObjectType createCIPCodeWorkdayOwnedObjectType() {
        return new CIPCodeWorkdayOwnedObjectType();
    }

    /**
     * Create an instance of {@link EmployeeBonusPlanAssignmentDataType }
     * 
     */
    public EmployeeBonusPlanAssignmentDataType createEmployeeBonusPlanAssignmentDataType() {
        return new EmployeeBonusPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link PositionWorkerTypeObjectType }
     * 
     */
    public PositionWorkerTypeObjectType createPositionWorkerTypeObjectType() {
        return new PositionWorkerTypeObjectType();
    }

    /**
     * Create an instance of {@link PrefixNameDataType }
     * 
     */
    public PrefixNameDataType createPrefixNameDataType() {
        return new PrefixNameDataType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyObjectType }
     * 
     */
    public AppointmentSpecialtyObjectType createAppointmentSpecialtyObjectType() {
        return new AppointmentSpecialtyObjectType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupReferenceDataType }
     * 
     */
    public JobClassificationGroupReferenceDataType createJobClassificationGroupReferenceDataType() {
        return new JobClassificationGroupReferenceDataType();
    }

    /**
     * Create an instance of {@link ReferenceLetterTemplateObjectType }
     * 
     */
    public ReferenceLetterTemplateObjectType createReferenceLetterTemplateObjectType() {
        return new ReferenceLetterTemplateObjectType();
    }

    /**
     * Create an instance of {@link TransactionTypeReferencesType }
     * 
     */
    public TransactionTypeReferencesType createTransactionTypeReferencesType() {
        return new TransactionTypeReferencesType();
    }

    /**
     * Create an instance of {@link GovernmentIdentifierDataType }
     * 
     */
    public GovernmentIdentifierDataType createGovernmentIdentifierDataType() {
        return new GovernmentIdentifierDataType();
    }

    /**
     * Create an instance of {@link EmployeeContributionPercentageDataType }
     * 
     */
    public EmployeeContributionPercentageDataType createEmployeeContributionPercentageDataType() {
        return new EmployeeContributionPercentageDataType();
    }

    /**
     * Create an instance of {@link TrainingTypeDataType }
     * 
     */
    public TrainingTypeDataType createTrainingTypeDataType() {
        return new TrainingTypeDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleRowSubdataType }
     * 
     */
    public WorkStatusRuleRowSubdataType createWorkStatusRuleRowSubdataType() {
        return new WorkStatusRuleRowSubdataType();
    }

    /**
     * Create an instance of {@link CurrencyObjectType }
     * 
     */
    public CurrencyObjectType createCurrencyObjectType() {
        return new CurrencyObjectType();
    }

    /**
     * Create an instance of {@link LocationResponseDataType }
     * 
     */
    public LocationResponseDataType createLocationResponseDataType() {
        return new LocationResponseDataType();
    }

    /**
     * Create an instance of {@link LicenseIDType }
     * 
     */
    public LicenseIDType createLicenseIDType() {
        return new LicenseIDType();
    }

    /**
     * Create an instance of {@link CompensationElementReferenceType }
     * 
     */
    public CompensationElementReferenceType createCompensationElementReferenceType() {
        return new CompensationElementReferenceType();
    }

    /**
     * Create an instance of {@link StaffObjectType }
     * 
     */
    public StaffObjectType createStaffObjectType() {
        return new StaffObjectType();
    }

    /**
     * Create an instance of {@link DemographicDataType }
     * 
     */
    public DemographicDataType createDemographicDataType() {
        return new DemographicDataType();
    }

    /**
     * Create an instance of {@link LocalNameDataType }
     * 
     */
    public LocalNameDataType createLocalNameDataType() {
        return new LocalNameDataType();
    }

    /**
     * Create an instance of {@link PreferredNameDataType }
     * 
     */
    public PreferredNameDataType createPreferredNameDataType() {
        return new PreferredNameDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingObjectType }
     * 
     */
    public CommitteeMeetingObjectType createCommitteeMeetingObjectType() {
        return new CommitteeMeetingObjectType();
    }

    /**
     * Create an instance of {@link LicenseIdentifierDataType }
     * 
     */
    public LicenseIdentifierDataType createLicenseIdentifierDataType() {
        return new LicenseIdentifierDataType();
    }

    /**
     * Create an instance of {@link CompensationStepObjectIDType }
     * 
     */
    public CompensationStepObjectIDType createCompensationStepObjectIDType() {
        return new CompensationStepObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeRequestReferencesType }
     * 
     */
    public AcademicAppointeeRequestReferencesType createAcademicAppointeeRequestReferencesType() {
        return new AcademicAppointeeRequestReferencesType();
    }

    /**
     * Create an instance of {@link RelativeNameReferenceObjectIDType }
     * 
     */
    public RelativeNameReferenceObjectIDType createRelativeNameReferenceObjectIDType() {
        return new RelativeNameReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link VisaIDTypeObjectIDType }
     * 
     */
    public VisaIDTypeObjectIDType createVisaIDTypeObjectIDType() {
        return new VisaIDTypeObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationAllowanceUnitPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationAllowanceUnitPlanAssignmentDataType createEmployeeCompensationAllowanceUnitPlanAssignmentDataType() {
        return new EmployeeCompensationAllowanceUnitPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyRequestCriteriaType }
     * 
     */
    public AppointmentSpecialtyRequestCriteriaType createAppointmentSpecialtyRequestCriteriaType() {
        return new AppointmentSpecialtyRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PersonDataType }
     * 
     */
    public PersonDataType createPersonDataType() {
        return new PersonDataType();
    }

    /**
     * Create an instance of {@link LicenseIdentifierReferenceObjectType }
     * 
     */
    public LicenseIdentifierReferenceObjectType createLicenseIdentifierReferenceObjectType() {
        return new LicenseIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link PhoneReferenceObjectType }
     * 
     */
    public PhoneReferenceObjectType createPhoneReferenceObjectType() {
        return new PhoneReferenceObjectType();
    }

    /**
     * Create an instance of {@link AddressReferenceObjectIDType }
     * 
     */
    public AddressReferenceObjectIDType createAddressReferenceObjectIDType() {
        return new AddressReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link LocationInstructionalSiteDataType }
     * 
     */
    public LocationInstructionalSiteDataType createLocationInstructionalSiteDataType() {
        return new LocationInstructionalSiteDataType();
    }

    /**
     * Create an instance of {@link PreferredCommunicationLanguagesType }
     * 
     */
    public PreferredCommunicationLanguagesType createPreferredCommunicationLanguagesType() {
        return new PreferredCommunicationLanguagesType();
    }

    /**
     * Create an instance of {@link PronounDataType }
     * 
     */
    public PronounDataType createPronounDataType() {
        return new PronounDataType();
    }

    /**
     * Create an instance of {@link EmployeeSalaryUnitPlanAssignmentDataType }
     * 
     */
    public EmployeeSalaryUnitPlanAssignmentDataType createEmployeeSalaryUnitPlanAssignmentDataType() {
        return new EmployeeSalaryUnitPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link PatternScheduleEventDataType }
     * 
     */
    public PatternScheduleEventDataType createPatternScheduleEventDataType() {
        return new PatternScheduleEventDataType();
    }

    /**
     * Create an instance of {@link PronounObjectType }
     * 
     */
    public PronounObjectType createPronounObjectType() {
        return new PronounObjectType();
    }

    /**
     * Create an instance of {@link ChangePersonalInformationDataType }
     * 
     */
    public ChangePersonalInformationDataType createChangePersonalInformationDataType() {
        return new ChangePersonalInformationDataType();
    }

    /**
     * Create an instance of {@link JobRequisitionObjectType }
     * 
     */
    public JobRequisitionObjectType createJobRequisitionObjectType() {
        return new JobRequisitionObjectType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationHourlyPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationHourlyPlanAssignmentDataType createEmployeeCompensationHourlyPlanAssignmentDataType() {
        return new EmployeeCompensationHourlyPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationObjectType }
     * 
     */
    public LGBTIdentificationObjectType createLGBTIdentificationObjectType() {
        return new LGBTIdentificationObjectType();
    }

    /**
     * Create an instance of {@link SupervisorReferenceType }
     * 
     */
    public SupervisorReferenceType createSupervisorReferenceType() {
        return new SupervisorReferenceType();
    }

    /**
     * Create an instance of {@link LanguageProficiencyObjectType }
     * 
     */
    public LanguageProficiencyObjectType createLanguageProficiencyObjectType() {
        return new LanguageProficiencyObjectType();
    }

    /**
     * Create an instance of {@link WorkerStatusDataType }
     * 
     */
    public WorkerStatusDataType createWorkerStatusDataType() {
        return new WorkerStatusDataType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountType }
     * 
     */
    public GetWorkdayAccountType createGetWorkdayAccountType() {
        return new GetWorkdayAccountType();
    }

    /**
     * Create an instance of {@link AcademicRankRequestReferencesType }
     * 
     */
    public AcademicRankRequestReferencesType createAcademicRankRequestReferencesType() {
        return new AcademicRankRequestReferencesType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationObjectIDType }
     * 
     */
    public LGBTIdentificationObjectIDType createLGBTIdentificationObjectIDType() {
        return new LGBTIdentificationObjectIDType();
    }

    /**
     * Create an instance of {@link WeekOfTheMonthObjectType }
     * 
     */
    public WeekOfTheMonthObjectType createWeekOfTheMonthObjectType() {
        return new WeekOfTheMonthObjectType();
    }

    /**
     * Create an instance of {@link GovernmentIDTypeAllObjectType }
     * 
     */
    public GovernmentIDTypeAllObjectType createGovernmentIDTypeAllObjectType() {
        return new GovernmentIDTypeAllObjectType();
    }

    /**
     * Create an instance of {@link TrainingAchievementDataType }
     * 
     */
    public TrainingAchievementDataType createTrainingAchievementDataType() {
        return new TrainingAchievementDataType();
    }

    /**
     * Create an instance of {@link CustomIdentifierReferenceObjectType }
     * 
     */
    public CustomIdentifierReferenceObjectType createCustomIdentifierReferenceObjectType() {
        return new CustomIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link CompensationGradeReferenceType }
     * 
     */
    public CompensationGradeReferenceType createCompensationGradeReferenceType() {
        return new CompensationGradeReferenceType();
    }

    /**
     * Create an instance of {@link CompensationPeriodObjectIDType }
     * 
     */
    public CompensationPeriodObjectIDType createCompensationPeriodObjectIDType() {
        return new CompensationPeriodObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalPayrollEmployeeTypeObjectIDType }
     * 
     */
    public ExternalPayrollEmployeeTypeObjectIDType createExternalPayrollEmployeeTypeObjectIDType() {
        return new ExternalPayrollEmployeeTypeObjectIDType();
    }

    /**
     * Create an instance of {@link SubscriberObjectIDType }
     * 
     */
    public SubscriberObjectIDType createSubscriberObjectIDType() {
        return new SubscriberObjectIDType();
    }

    /**
     * Create an instance of {@link DisabilityRequestReferencesType }
     * 
     */
    public DisabilityRequestReferencesType createDisabilityRequestReferencesType() {
        return new DisabilityRequestReferencesType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingRequestCriteriaType }
     * 
     */
    public CommitteeMeetingRequestCriteriaType createCommitteeMeetingRequestCriteriaType() {
        return new CommitteeMeetingRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkerPersonalDataType }
     * 
     */
    public WorkerPersonalDataType createWorkerPersonalDataType() {
        return new WorkerPersonalDataType();
    }

    /**
     * Create an instance of {@link CurrencyObjectIDType }
     * 
     */
    public CurrencyObjectIDType createCurrencyObjectIDType() {
        return new CurrencyObjectIDType();
    }

    /**
     * Create an instance of {@link ExtendedEmployeeContractDataType }
     * 
     */
    public ExtendedEmployeeContractDataType createExtendedEmployeeContractDataType() {
        return new ExtendedEmployeeContractDataType();
    }

    /**
     * Create an instance of {@link PositionElementObjectIDType }
     * 
     */
    public PositionElementObjectIDType createPositionElementObjectIDType() {
        return new PositionElementObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeTypeObjectIDType }
     * 
     */
    public CommitteeTypeObjectIDType createCommitteeTypeObjectIDType() {
        return new CommitteeTypeObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationAllowancePlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationAllowancePlanAssignmentDataType createEmployeeCompensationAllowancePlanAssignmentDataType() {
        return new EmployeeCompensationAllowancePlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link JobClassificationSummaryDataType }
     * 
     */
    public JobClassificationSummaryDataType createJobClassificationSummaryDataType() {
        return new JobClassificationSummaryDataType();
    }

    /**
     * Create an instance of {@link MilitaryInformationDataType }
     * 
     */
    public MilitaryInformationDataType createMilitaryInformationDataType() {
        return new MilitaryInformationDataType();
    }

    /**
     * Create an instance of {@link SexualOrientationRequestReferencesType }
     * 
     */
    public SexualOrientationRequestReferencesType createSexualOrientationRequestReferencesType() {
        return new SexualOrientationRequestReferencesType();
    }

    /**
     * Create an instance of {@link PerformanceReviewObjectIDType }
     * 
     */
    public PerformanceReviewObjectIDType createPerformanceReviewObjectIDType() {
        return new PerformanceReviewObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCommissionPlanAssignmentDataType }
     * 
     */
    public EmployeeCommissionPlanAssignmentDataType createEmployeeCommissionPlanAssignmentDataType() {
        return new EmployeeCommissionPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link VisaTypeReferenceType }
     * 
     */
    public VisaTypeReferenceType createVisaTypeReferenceType() {
        return new VisaTypeReferenceType();
    }

    /**
     * Create an instance of {@link EthnicityResponseDataType }
     * 
     */
    public EthnicityResponseDataType createEthnicityResponseDataType() {
        return new EthnicityResponseDataType();
    }

    /**
     * Create an instance of {@link ExternalInstitutionGradingSchemeGradePointValueObjectType }
     * 
     */
    public ExternalInstitutionGradingSchemeGradePointValueObjectType createExternalInstitutionGradingSchemeGradePointValueObjectType() {
        return new ExternalInstitutionGradingSchemeGradePointValueObjectType();
    }

    /**
     * Create an instance of {@link LocationAttributeObjectType }
     * 
     */
    public LocationAttributeObjectType createLocationAttributeObjectType() {
        return new LocationAttributeObjectType();
    }

    /**
     * Create an instance of {@link TimeProfileObjectIDType }
     * 
     */
    public TimeProfileObjectIDType createTimeProfileObjectIDType() {
        return new TimeProfileObjectIDType();
    }

    /**
     * Create an instance of {@link LicenseIDTypeAllObjectType }
     * 
     */
    public LicenseIDTypeAllObjectType createLicenseIDTypeAllObjectType() {
        return new LicenseIDTypeAllObjectType();
    }

    /**
     * Create an instance of {@link CommitteeDefinitionType }
     * 
     */
    public CommitteeDefinitionType createCommitteeDefinitionType() {
        return new CommitteeDefinitionType();
    }

    /**
     * Create an instance of {@link AcademicUnitObjectIDType }
     * 
     */
    public AcademicUnitObjectIDType createAcademicUnitObjectIDType() {
        return new AcademicUnitObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicRankType }
     * 
     */
    public AcademicRankType createAcademicRankType() {
        return new AcademicRankType();
    }

    /**
     * Create an instance of {@link OrganizationHierarchyDataType }
     * 
     */
    public OrganizationHierarchyDataType createOrganizationHierarchyDataType() {
        return new OrganizationHierarchyDataType();
    }

    /**
     * Create an instance of {@link UserBasedSecurityGroupRequestCriteriaType }
     * 
     */
    public UserBasedSecurityGroupRequestCriteriaType createUserBasedSecurityGroupRequestCriteriaType() {
        return new UserBasedSecurityGroupRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PositionPayrollReportingCodeDataType }
     * 
     */
    public PositionPayrollReportingCodeDataType createPositionPayrollReportingCodeDataType() {
        return new PositionPayrollReportingCodeDataType();
    }

    /**
     * Create an instance of {@link TrainingType }
     * 
     */
    public TrainingType createTrainingType() {
        return new TrainingType();
    }

    /**
     * Create an instance of {@link CompensationStepObjectType }
     * 
     */
    public CompensationStepObjectType createCompensationStepObjectType() {
        return new CompensationStepObjectType();
    }

    /**
     * Create an instance of {@link DifficultyToFillDataType }
     * 
     */
    public DifficultyToFillDataType createDifficultyToFillDataType() {
        return new DifficultyToFillDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingMinutesSubDataType }
     * 
     */
    public CommitteeMeetingMinutesSubDataType createCommitteeMeetingMinutesSubDataType() {
        return new CommitteeMeetingMinutesSubDataType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureObjectType }
     * 
     */
    public UnitOfMeasureObjectType createUnitOfMeasureObjectType() {
        return new UnitOfMeasureObjectType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentType }
     * 
     */
    public FormerWorkerAttachmentType createFormerWorkerAttachmentType() {
        return new FormerWorkerAttachmentType();
    }

    /**
     * Create an instance of {@link EthnicityObjectType }
     * 
     */
    public EthnicityObjectType createEthnicityObjectType() {
        return new EthnicityObjectType();
    }

    /**
     * Create an instance of {@link QuestionnaireObjectType }
     * 
     */
    public QuestionnaireObjectType createQuestionnaireObjectType() {
        return new QuestionnaireObjectType();
    }

    /**
     * Create an instance of {@link ReligionObjectIDType }
     * 
     */
    public ReligionObjectIDType createReligionObjectIDType() {
        return new ReligionObjectIDType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDsResponseDataType }
     * 
     */
    public ChangeGovernmentIDsResponseDataType createChangeGovernmentIDsResponseDataType() {
        return new ChangeGovernmentIDsResponseDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationObjectIDType }
     * 
     */
    public CommitteeClassificationObjectIDType createCommitteeClassificationObjectIDType() {
        return new CommitteeClassificationObjectIDType();
    }

    /**
     * Create an instance of {@link MilitaryServiceDataType }
     * 
     */
    public MilitaryServiceDataType createMilitaryServiceDataType() {
        return new MilitaryServiceDataType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupDataType }
     * 
     */
    public AssignUserBasedSecurityGroupDataType createAssignUserBasedSecurityGroupDataType() {
        return new AssignUserBasedSecurityGroupDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingActionItemObjectType }
     * 
     */
    public CommitteeMeetingActionItemObjectType createCommitteeMeetingActionItemObjectType() {
        return new CommitteeMeetingActionItemObjectType();
    }

    /**
     * Create an instance of {@link WebAddressCoreDataType }
     * 
     */
    public WebAddressCoreDataType createWebAddressCoreDataType() {
        return new WebAddressCoreDataType();
    }

    /**
     * Create an instance of {@link InternationalAssignmentTypeObjectType }
     * 
     */
    public InternationalAssignmentTypeObjectType createInternationalAssignmentTypeObjectType() {
        return new InternationalAssignmentTypeObjectType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordObjectType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordObjectType createExternalDisabilitySelfIdentificationRecordObjectType() {
        return new ExternalDisabilitySelfIdentificationRecordObjectType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupObjectType }
     * 
     */
    public ProvisioningGroupObjectType createProvisioningGroupObjectType() {
        return new ProvisioningGroupObjectType();
    }

    /**
     * Create an instance of {@link OrganizationWWSType }
     * 
     */
    public OrganizationWWSType createOrganizationWWSType() {
        return new OrganizationWWSType();
    }

    /**
     * Create an instance of {@link WorkShiftObjectIDType }
     * 
     */
    public WorkShiftObjectIDType createWorkShiftObjectIDType() {
        return new WorkShiftObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationSummaryDataType }
     * 
     */
    public OrganizationSummaryDataType createOrganizationSummaryDataType() {
        return new OrganizationSummaryDataType();
    }

    /**
     * Create an instance of {@link PerformanceReviewObjectType }
     * 
     */
    public PerformanceReviewObjectType createPerformanceReviewObjectType() {
        return new PerformanceReviewObjectType();
    }

    /**
     * Create an instance of {@link ChangePreferredNameBusinessProcessDataType }
     * 
     */
    public ChangePreferredNameBusinessProcessDataType createChangePreferredNameBusinessProcessDataType() {
        return new ChangePreferredNameBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarObjectIDType }
     * 
     */
    public PeriodReportingCalendarObjectIDType createPeriodReportingCalendarObjectIDType() {
        return new PeriodReportingCalendarObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationPeriodSalaryPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationPeriodSalaryPlanAssignmentDataType createEmployeeCompensationPeriodSalaryPlanAssignmentDataType() {
        return new EmployeeCompensationPeriodSalaryPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link JobProfileGetDataType }
     * 
     */
    public JobProfileGetDataType createJobProfileGetDataType() {
        return new JobProfileGetDataType();
    }

    /**
     * Create an instance of {@link JobLevelObjectIDType }
     * 
     */
    public JobLevelObjectIDType createJobLevelObjectIDType() {
        return new JobLevelObjectIDType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationRequestReferencesType }
     * 
     */
    public LGBTIdentificationRequestReferencesType createLGBTIdentificationRequestReferencesType() {
        return new LGBTIdentificationRequestReferencesType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeDataType }
     * 
     */
    public WorkersCompensationCodeDataType createWorkersCompensationCodeDataType() {
        return new WorkersCompensationCodeDataType();
    }

    /**
     * Create an instance of {@link BackgroundCheckEventDataType }
     * 
     */
    public BackgroundCheckEventDataType createBackgroundCheckEventDataType() {
        return new BackgroundCheckEventDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationRequestCriteriaType }
     * 
     */
    public CommitteeClassificationRequestCriteriaType createCommitteeClassificationRequestCriteriaType() {
        return new CommitteeClassificationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link EmployerContributionDataType }
     * 
     */
    public EmployerContributionDataType createEmployerContributionDataType() {
        return new EmployerContributionDataType();
    }

    /**
     * Create an instance of {@link GoalObjectType }
     * 
     */
    public GoalObjectType createGoalObjectType() {
        return new GoalObjectType();
    }

    /**
     * Create an instance of {@link DisciplinaryActionObjectIDType }
     * 
     */
    public DisciplinaryActionObjectIDType createDisciplinaryActionObjectIDType() {
        return new DisciplinaryActionObjectIDType();
    }

    /**
     * Create an instance of {@link UpdateAcademicAppointmentDataType }
     * 
     */
    public UpdateAcademicAppointmentDataType createUpdateAcademicAppointmentDataType() {
        return new UpdateAcademicAppointmentDataType();
    }

    /**
     * Create an instance of {@link CareerResponsibilityObjectIDType }
     * 
     */
    public CareerResponsibilityObjectIDType createCareerResponsibilityObjectIDType() {
        return new CareerResponsibilityObjectIDType();
    }

    /**
     * Create an instance of {@link PassportIDType }
     * 
     */
    public PassportIDType createPassportIDType() {
        return new PassportIDType();
    }

    /**
     * Create an instance of {@link DegreeCompletedObjectType }
     * 
     */
    public DegreeCompletedObjectType createDegreeCompletedObjectType() {
        return new DegreeCompletedObjectType();
    }

    /**
     * Create an instance of {@link WorkerRequestReferencesType }
     * 
     */
    public WorkerRequestReferencesType createWorkerRequestReferencesType() {
        return new WorkerRequestReferencesType();
    }

    /**
     * Create an instance of {@link GenericDisabilityInformationDataType }
     * 
     */
    public GenericDisabilityInformationDataType createGenericDisabilityInformationDataType() {
        return new GenericDisabilityInformationDataType();
    }

    /**
     * Create an instance of {@link HukouTypeObjectType }
     * 
     */
    public HukouTypeObjectType createHukouTypeObjectType() {
        return new HukouTypeObjectType();
    }

    /**
     * Create an instance of {@link DisabilityStatusInformationDataType }
     * 
     */
    public DisabilityStatusInformationDataType createDisabilityStatusInformationDataType() {
        return new DisabilityStatusInformationDataType();
    }

    /**
     * Create an instance of {@link SchoolTypeObjectType }
     * 
     */
    public SchoolTypeObjectType createSchoolTypeObjectType() {
        return new SchoolTypeObjectType();
    }

    /**
     * Create an instance of {@link ContractDetailsDataType }
     * 
     */
    public ContractDetailsDataType createContractDetailsDataType() {
        return new ContractDetailsDataType();
    }

    /**
     * Create an instance of {@link TimeProfileReferenceDataType }
     * 
     */
    public TimeProfileReferenceDataType createTimeProfileReferenceDataType() {
        return new TimeProfileReferenceDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyResponseDataType }
     * 
     */
    public AcademicUnitHierarchyResponseDataType createAcademicUnitHierarchyResponseDataType() {
        return new AcademicUnitHierarchyResponseDataType();
    }

    /**
     * Create an instance of {@link CommunicationMethodUsageInformationDataType }
     * 
     */
    public CommunicationMethodUsageInformationDataType createCommunicationMethodUsageInformationDataType() {
        return new CommunicationMethodUsageInformationDataType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeReferenceType }
     * 
     */
    public CompanyInsiderTypeReferenceType createCompanyInsiderTypeReferenceType() {
        return new CompanyInsiderTypeReferenceType();
    }

    /**
     * Create an instance of {@link DegreeCompletedObjectIDType }
     * 
     */
    public DegreeCompletedObjectIDType createDegreeCompletedObjectIDType() {
        return new DegreeCompletedObjectIDType();
    }

    /**
     * Create an instance of {@link SearchSettingsType }
     * 
     */
    public SearchSettingsType createSearchSettingsType() {
        return new SearchSettingsType();
    }

    /**
     * Create an instance of {@link ChangePassportsAndVisasBusinessProcessDataType }
     * 
     */
    public ChangePassportsAndVisasBusinessProcessDataType createChangePassportsAndVisasBusinessProcessDataType() {
        return new ChangePassportsAndVisasBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link OrganizationResponseGroupType }
     * 
     */
    public OrganizationResponseGroupType createOrganizationResponseGroupType() {
        return new OrganizationResponseGroupType();
    }

    /**
     * Create an instance of {@link NationalIDTypeObjectIDType }
     * 
     */
    public NationalIDTypeObjectIDType createNationalIDTypeObjectIDType() {
        return new NationalIDTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerDevelopmentItemType }
     * 
     */
    public WorkerDevelopmentItemType createWorkerDevelopmentItemType() {
        return new WorkerDevelopmentItemType();
    }

    /**
     * Create an instance of {@link WorkerInsuranceDataType }
     * 
     */
    public WorkerInsuranceDataType createWorkerInsuranceDataType() {
        return new WorkerInsuranceDataType();
    }

    /**
     * Create an instance of {@link WorkExperienceRatingObjectType }
     * 
     */
    public WorkExperienceRatingObjectType createWorkExperienceRatingObjectType() {
        return new WorkExperienceRatingObjectType();
    }

    /**
     * Create an instance of {@link ExternalURLObjectType }
     * 
     */
    public ExternalURLObjectType createExternalURLObjectType() {
        return new ExternalURLObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingVoteRecordDataSubeditType }
     * 
     */
    public CommitteeMeetingVoteRecordDataSubeditType createCommitteeMeetingVoteRecordDataSubeditType() {
        return new CommitteeMeetingVoteRecordDataSubeditType();
    }

    /**
     * Create an instance of {@link LanguageObjectType }
     * 
     */
    public LanguageObjectType createLanguageObjectType() {
        return new LanguageObjectType();
    }

    /**
     * Create an instance of {@link BusinessProcessAttachmentDataType }
     * 
     */
    public BusinessProcessAttachmentDataType createBusinessProcessAttachmentDataType() {
        return new BusinessProcessAttachmentDataType();
    }

    /**
     * Create an instance of {@link UserLanguageObjectType }
     * 
     */
    public UserLanguageObjectType createUserLanguageObjectType() {
        return new UserLanguageObjectType();
    }

    /**
     * Create an instance of {@link RetirementSavingsDataType }
     * 
     */
    public RetirementSavingsDataType createRetirementSavingsDataType() {
        return new RetirementSavingsDataType();
    }

    /**
     * Create an instance of {@link OrganizationOwnerObjectIDType }
     * 
     */
    public OrganizationOwnerObjectIDType createOrganizationOwnerObjectIDType() {
        return new OrganizationOwnerObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicUnitHierarchyRequestReferencesType }
     * 
     */
    public AcademicUnitHierarchyRequestReferencesType createAcademicUnitHierarchyRequestReferencesType() {
        return new AcademicUnitHierarchyRequestReferencesType();
    }

    /**
     * Create an instance of {@link EventTargetObjectIDType }
     * 
     */
    public EventTargetObjectIDType createEventTargetObjectIDType() {
        return new EventTargetObjectIDType();
    }

    /**
     * Create an instance of {@link LicenseIdentifierObjectIDType }
     * 
     */
    public LicenseIdentifierObjectIDType createLicenseIdentifierObjectIDType() {
        return new LicenseIdentifierObjectIDType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeObjectIDType }
     * 
     */
    public WorkersCompensationCodeObjectIDType createWorkersCompensationCodeObjectIDType() {
        return new WorkersCompensationCodeObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeTypeObjectType }
     * 
     */
    public CommitteeTypeObjectType createCommitteeTypeObjectType() {
        return new CommitteeTypeObjectType();
    }

    /**
     * Create an instance of {@link DisabilityCertificationBasisObjectIDType }
     * 
     */
    public DisabilityCertificationBasisObjectIDType createDisabilityCertificationBasisObjectIDType() {
        return new DisabilityCertificationBasisObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicRankMappingObjectIDType }
     * 
     */
    public AcademicRankMappingObjectIDType createAcademicRankMappingObjectIDType() {
        return new AcademicRankMappingObjectIDType();
    }

    /**
     * Create an instance of {@link GeneralEventSubcategoryObjectIDType }
     * 
     */
    public GeneralEventSubcategoryObjectIDType createGeneralEventSubcategoryObjectIDType() {
        return new GeneralEventSubcategoryObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodTypeObjectIDType }
     * 
     */
    public EmployeeProbationPeriodTypeObjectIDType createEmployeeProbationPeriodTypeObjectIDType() {
        return new EmployeeProbationPeriodTypeObjectIDType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryAmountHourlyDataType }
     * 
     */
    public CompensatableSummaryAmountHourlyDataType createCompensatableSummaryAmountHourlyDataType() {
        return new CompensatableSummaryAmountHourlyDataType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeObjectType }
     * 
     */
    public CommitteeMembershipTypeObjectType createCommitteeMembershipTypeObjectType() {
        return new CommitteeMembershipTypeObjectType();
    }

    /**
     * Create an instance of {@link GenderIdentityObjectType }
     * 
     */
    public GenderIdentityObjectType createGenderIdentityObjectType() {
        return new GenderIdentityObjectType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeObjectType }
     * 
     */
    public WorkersCompensationCodeObjectType createWorkersCompensationCodeObjectType() {
        return new WorkersCompensationCodeObjectType();
    }

    /**
     * Create an instance of {@link PrimaryBusinessSiteReferenceDataType }
     * 
     */
    public PrimaryBusinessSiteReferenceDataType createPrimaryBusinessSiteReferenceDataType() {
        return new PrimaryBusinessSiteReferenceDataType();
    }

    /**
     * Create an instance of {@link JobCategoryDataType }
     * 
     */
    public JobCategoryDataType createJobCategoryDataType() {
        return new JobCategoryDataType();
    }

    /**
     * Create an instance of {@link UniqueIdentifierObjectType }
     * 
     */
    public UniqueIdentifierObjectType createUniqueIdentifierObjectType() {
        return new UniqueIdentifierObjectType();
    }

    /**
     * Create an instance of {@link CompensationPackageObjectType }
     * 
     */
    public CompensationPackageObjectType createCompensationPackageObjectType() {
        return new CompensationPackageObjectType();
    }

    /**
     * Create an instance of {@link EmployeeContractObjectType }
     * 
     */
    public EmployeeContractObjectType createEmployeeContractObjectType() {
        return new EmployeeContractObjectType();
    }

    /**
     * Create an instance of {@link OrganizationSubtypeObjectIDType }
     * 
     */
    public OrganizationSubtypeObjectIDType createOrganizationSubtypeObjectIDType() {
        return new OrganizationSubtypeObjectIDType();
    }

    /**
     * Create an instance of {@link PassportIdentifierReferenceObjectType }
     * 
     */
    public PassportIdentifierReferenceObjectType createPassportIdentifierReferenceObjectType() {
        return new PassportIdentifierReferenceObjectType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentIdentifierObjectType }
     * 
     */
    public AcademicAppointmentIdentifierObjectType createAcademicAppointmentIdentifierObjectType() {
        return new AcademicAppointmentIdentifierObjectType();
    }

    /**
     * Create an instance of {@link EventAttachmentCategoryObjectType }
     * 
     */
    public EventAttachmentCategoryObjectType createEventAttachmentCategoryObjectType() {
        return new EventAttachmentCategoryObjectType();
    }

    /**
     * Create an instance of {@link CreateExternalCommitteeMemberDataType }
     * 
     */
    public CreateExternalCommitteeMemberDataType createCreateExternalCommitteeMemberDataType() {
        return new CreateExternalCommitteeMemberDataType();
    }

    /**
     * Create an instance of {@link CitizenshipStatusObjectIDType }
     * 
     */
    public CitizenshipStatusObjectIDType createCitizenshipStatusObjectIDType() {
        return new CitizenshipStatusObjectIDType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentDataType }
     * 
     */
    public ProvisioningGroupAssignmentDataType createProvisioningGroupAssignmentDataType() {
        return new ProvisioningGroupAssignmentDataType();
    }

    /**
     * Create an instance of {@link JobProfileUnionMembershipDataType }
     * 
     */
    public JobProfileUnionMembershipDataType createJobProfileUnionMembershipDataType() {
        return new JobProfileUnionMembershipDataType();
    }

    /**
     * Create an instance of {@link GovernmentIDTypeReferenceType }
     * 
     */
    public GovernmentIDTypeReferenceType createGovernmentIDTypeReferenceType() {
        return new GovernmentIDTypeReferenceType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationTypeAllObjectIDType }
     * 
     */
    public ProfessionalAffiliationTypeAllObjectIDType createProfessionalAffiliationTypeAllObjectIDType() {
        return new ProfessionalAffiliationTypeAllObjectIDType();
    }

    /**
     * Create an instance of {@link TrainingTypeRequestReferencesType }
     * 
     */
    public TrainingTypeRequestReferencesType createTrainingTypeRequestReferencesType() {
        return new TrainingTypeRequestReferencesType();
    }

    /**
     * Create an instance of {@link AssignableRoleObjectType }
     * 
     */
    public AssignableRoleObjectType createAssignableRoleObjectType() {
        return new AssignableRoleObjectType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationDataType }
     * 
     */
    public PoliticalAffiliationDataType createPoliticalAffiliationDataType() {
        return new PoliticalAffiliationDataType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodSummaryDataType }
     * 
     */
    public EmployeeProbationPeriodSummaryDataType createEmployeeProbationPeriodSummaryDataType() {
        return new EmployeeProbationPeriodSummaryDataType();
    }

    /**
     * Create an instance of {@link FieldAndParameterCriteriaDataType }
     * 
     */
    public FieldAndParameterCriteriaDataType createFieldAndParameterCriteriaDataType() {
        return new FieldAndParameterCriteriaDataType();
    }

    /**
     * Create an instance of {@link ChangeEmergencyContactsDataType }
     * 
     */
    public ChangeEmergencyContactsDataType createChangeEmergencyContactsDataType() {
        return new ChangeEmergencyContactsDataType();
    }

    /**
     * Create an instance of {@link AcademicTenureStatusObjectType }
     * 
     */
    public AcademicTenureStatusObjectType createAcademicTenureStatusObjectType() {
        return new AcademicTenureStatusObjectType();
    }

    /**
     * Create an instance of {@link ManagerEvaluationDetailDataType }
     * 
     */
    public ManagerEvaluationDetailDataType createManagerEvaluationDetailDataType() {
        return new ManagerEvaluationDetailDataType();
    }

    /**
     * Create an instance of {@link OrganizationObjectType }
     * 
     */
    public OrganizationObjectType createOrganizationObjectType() {
        return new OrganizationObjectType();
    }

    /**
     * Create an instance of {@link SubregionInformationDataType }
     * 
     */
    public SubregionInformationDataType createSubregionInformationDataType() {
        return new SubregionInformationDataType();
    }

    /**
     * Create an instance of {@link ReferenceLetterTemplateObjectIDType }
     * 
     */
    public ReferenceLetterTemplateObjectIDType createReferenceLetterTemplateObjectIDType() {
        return new ReferenceLetterTemplateObjectIDType();
    }

    /**
     * Create an instance of {@link GenericPersonalInformationDataType }
     * 
     */
    public GenericPersonalInformationDataType createGenericPersonalInformationDataType() {
        return new GenericPersonalInformationDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitSubtypeObjectType }
     * 
     */
    public AcademicUnitSubtypeObjectType createAcademicUnitSubtypeObjectType() {
        return new AcademicUnitSubtypeObjectType();
    }

    /**
     * Create an instance of {@link SubscriberObjectType }
     * 
     */
    public SubscriberObjectType createSubscriberObjectType() {
        return new SubscriberObjectType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupResponseDataType }
     * 
     */
    public JobClassificationGroupResponseDataType createJobClassificationGroupResponseDataType() {
        return new JobClassificationGroupResponseDataType();
    }

    /**
     * Create an instance of {@link NationalIDDataType }
     * 
     */
    public NationalIDDataType createNationalIDDataType() {
        return new NationalIDDataType();
    }

    /**
     * Create an instance of {@link DevelopmentItemVersionDataType }
     * 
     */
    public DevelopmentItemVersionDataType createDevelopmentItemVersionDataType() {
        return new DevelopmentItemVersionDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountRequestReferencesType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountRequestReferencesType createServiceCenterRepresentativeWorkdayAccountRequestReferencesType() {
        return new ServiceCenterRepresentativeWorkdayAccountRequestReferencesType();
    }

    /**
     * Create an instance of {@link OverallEvaluationDetailDataType }
     * 
     */
    public OverallEvaluationDetailDataType createOverallEvaluationDetailDataType() {
        return new OverallEvaluationDetailDataType();
    }

    /**
     * Create an instance of {@link OrganizationSupportingRoleDataType }
     * 
     */
    public OrganizationSupportingRoleDataType createOrganizationSupportingRoleDataType() {
        return new OrganizationSupportingRoleDataType();
    }

    /**
     * Create an instance of {@link SystemUserDataType }
     * 
     */
    public SystemUserDataType createSystemUserDataType() {
        return new SystemUserDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementSummaryDataType }
     * 
     */
    public CollectiveAgreementSummaryDataType createCollectiveAgreementSummaryDataType() {
        return new CollectiveAgreementSummaryDataType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryAmountDataType }
     * 
     */
    public CompensatableSummaryAmountDataType createCompensatableSummaryAmountDataType() {
        return new CompensatableSummaryAmountDataType();
    }

    /**
     * Create an instance of {@link OrganizationRoleAssignmentWWSDataType }
     * 
     */
    public OrganizationRoleAssignmentWWSDataType createOrganizationRoleAssignmentWWSDataType() {
        return new OrganizationRoleAssignmentWWSDataType();
    }

    /**
     * Create an instance of {@link ExternalPayGroupObjectType }
     * 
     */
    public ExternalPayGroupObjectType createExternalPayGroupObjectType() {
        return new ExternalPayGroupObjectType();
    }

    /**
     * Create an instance of {@link CustomIdentifierReferenceObjectIDType }
     * 
     */
    public CustomIdentifierReferenceObjectIDType createCustomIdentifierReferenceObjectIDType() {
        return new CustomIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link CompetencyObjectIDType }
     * 
     */
    public CompetencyObjectIDType createCompetencyObjectIDType() {
        return new CompetencyObjectIDType();
    }

    /**
     * Create an instance of {@link RelocationAreaObjectIDType }
     * 
     */
    public RelocationAreaObjectIDType createRelocationAreaObjectIDType() {
        return new RelocationAreaObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingMinutesObjectType }
     * 
     */
    public CommitteeMeetingMinutesObjectType createCommitteeMeetingMinutesObjectType() {
        return new CommitteeMeetingMinutesObjectType();
    }

    /**
     * Create an instance of {@link WorkExperienceDataType }
     * 
     */
    public WorkExperienceDataType createWorkExperienceDataType() {
        return new WorkExperienceDataType();
    }

    /**
     * Create an instance of {@link IntegrationSystemAuditedObjectType }
     * 
     */
    public IntegrationSystemAuditedObjectType createIntegrationSystemAuditedObjectType() {
        return new IntegrationSystemAuditedObjectType();
    }

    /**
     * Create an instance of {@link AdditionalNameTypeObjectIDType }
     * 
     */
    public AdditionalNameTypeObjectIDType createAdditionalNameTypeObjectIDType() {
        return new AdditionalNameTypeObjectIDType();
    }

    /**
     * Create an instance of {@link DisabilityStatusReferenceObjectIDType }
     * 
     */
    public DisabilityStatusReferenceObjectIDType createDisabilityStatusReferenceObjectIDType() {
        return new DisabilityStatusReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link LocationHierarchyOrganizationAssignmentsDataType }
     * 
     */
    public LocationHierarchyOrganizationAssignmentsDataType createLocationHierarchyOrganizationAssignmentsDataType() {
        return new LocationHierarchyOrganizationAssignmentsDataType();
    }

    /**
     * Create an instance of {@link AcademicPaySetupDataType }
     * 
     */
    public AcademicPaySetupDataType createAcademicPaySetupDataType() {
        return new AcademicPaySetupDataType();
    }

    /**
     * Create an instance of {@link TwentyFourHourTimeObjectType }
     * 
     */
    public TwentyFourHourTimeObjectType createTwentyFourHourTimeObjectType() {
        return new TwentyFourHourTimeObjectType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarType }
     * 
     */
    public WorkScheduleCalendarType createWorkScheduleCalendarType() {
        return new WorkScheduleCalendarType();
    }

    /**
     * Create an instance of {@link MeritPercentPlanObjectType }
     * 
     */
    public MeritPercentPlanObjectType createMeritPercentPlanObjectType() {
        return new MeritPercentPlanObjectType();
    }

    /**
     * Create an instance of {@link PayrollInterfaceProcessingDataType }
     * 
     */
    public PayrollInterfaceProcessingDataType createPayrollInterfaceProcessingDataType() {
        return new PayrollInterfaceProcessingDataType();
    }

    /**
     * Create an instance of {@link PersonPhotoDataType }
     * 
     */
    public PersonPhotoDataType createPersonPhotoDataType() {
        return new PersonPhotoDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeWorkdayAccountType }
     * 
     */
    public ServiceCenterRepresentativeWorkdayAccountType createServiceCenterRepresentativeWorkdayAccountType() {
        return new ServiceCenterRepresentativeWorkdayAccountType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationResponseDataType }
     * 
     */
    public LGBTIdentificationResponseDataType createLGBTIdentificationResponseDataType() {
        return new LGBTIdentificationResponseDataType();
    }

    /**
     * Create an instance of {@link CertificationObjectType }
     * 
     */
    public CertificationObjectType createCertificationObjectType() {
        return new CertificationObjectType();
    }

    /**
     * Create an instance of {@link LGBTIdentificationDataType }
     * 
     */
    public LGBTIdentificationDataType createLGBTIdentificationDataType() {
        return new LGBTIdentificationDataType();
    }

    /**
     * Create an instance of {@link PayrollReportingTypeObjectIDType }
     * 
     */
    public PayrollReportingTypeObjectIDType createPayrollReportingTypeObjectIDType() {
        return new PayrollReportingTypeObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentRequestCriteriaELType }
     * 
     */
    public FormerWorkerAttachmentRequestCriteriaELType createFormerWorkerAttachmentRequestCriteriaELType() {
        return new FormerWorkerAttachmentRequestCriteriaELType();
    }

    /**
     * Create an instance of {@link StartEndDataType }
     * 
     */
    public StartEndDataType createStartEndDataType() {
        return new StartEndDataType();
    }

    /**
     * Create an instance of {@link CreateAcademicAffiliateDataType }
     * 
     */
    public CreateAcademicAffiliateDataType createCreateAcademicAffiliateDataType() {
        return new CreateAcademicAffiliateDataType();
    }

    /**
     * Create an instance of {@link WorkerPersonalInfoDataType }
     * 
     */
    public WorkerPersonalInfoDataType createWorkerPersonalInfoDataType() {
        return new WorkerPersonalInfoDataType();
    }

    /**
     * Create an instance of {@link MilitaryServiceSubDataType }
     * 
     */
    public MilitaryServiceSubDataType createMilitaryServiceSubDataType() {
        return new MilitaryServiceSubDataType();
    }

    /**
     * Create an instance of {@link ConditionRuleObjectIDType }
     * 
     */
    public ConditionRuleObjectIDType createConditionRuleObjectIDType() {
        return new ConditionRuleObjectIDType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierRequestCriteriaType }
     * 
     */
    public UniversalIdentifierRequestCriteriaType createUniversalIdentifierRequestCriteriaType() {
        return new UniversalIdentifierRequestCriteriaType();
    }

    /**
     * Create an instance of {@link HolidayCalendarDataType }
     * 
     */
    public HolidayCalendarDataType createHolidayCalendarDataType() {
        return new HolidayCalendarDataType();
    }

    /**
     * Create an instance of {@link RoleObjectType }
     * 
     */
    public RoleObjectType createRoleObjectType() {
        return new RoleObjectType();
    }

    /**
     * Create an instance of {@link TrainingObjectType }
     * 
     */
    public TrainingObjectType createTrainingObjectType() {
        return new TrainingObjectType();
    }

    /**
     * Create an instance of {@link NamedProfessorshipObjectIDType }
     * 
     */
    public NamedProfessorshipObjectIDType createNamedProfessorshipObjectIDType() {
        return new NamedProfessorshipObjectIDType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarRowDataType }
     * 
     */
    public PeriodReportingCalendarRowDataType createPeriodReportingCalendarRowDataType() {
        return new PeriodReportingCalendarRowDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeType }
     * 
     */
    public AcademicAppointeeType createAcademicAppointeeType() {
        return new AcademicAppointeeType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationRelationshipTypeObjectIDType }
     * 
     */
    public ProfessionalAffiliationRelationshipTypeObjectIDType createProfessionalAffiliationRelationshipTypeObjectIDType() {
        return new ProfessionalAffiliationRelationshipTypeObjectIDType();
    }

    /**
     * Create an instance of {@link PhoneInformationDataType }
     * 
     */
    public PhoneInformationDataType createPhoneInformationDataType() {
        return new PhoneInformationDataType();
    }

    /**
     * Create an instance of {@link PreferredCommunicationLanguageDataType }
     * 
     */
    public PreferredCommunicationLanguageDataType createPreferredCommunicationLanguageDataType() {
        return new PreferredCommunicationLanguageDataType();
    }

    /**
     * Create an instance of {@link PersonEmailInformationDataType }
     * 
     */
    public PersonEmailInformationDataType createPersonEmailInformationDataType() {
        return new PersonEmailInformationDataType();
    }

    /**
     * Create an instance of {@link TerminationSubcategoryObjectIDType }
     * 
     */
    public TerminationSubcategoryObjectIDType createTerminationSubcategoryObjectIDType() {
        return new TerminationSubcategoryObjectIDType();
    }

    /**
     * Create an instance of {@link SalaryUnitPlanObjectIDType }
     * 
     */
    public SalaryUnitPlanObjectIDType createSalaryUnitPlanObjectIDType() {
        return new SalaryUnitPlanObjectIDType();
    }

    /**
     * Create an instance of {@link TrainingTypeObjectIDType }
     * 
     */
    public TrainingTypeObjectIDType createTrainingTypeObjectIDType() {
        return new TrainingTypeObjectIDType();
    }

    /**
     * Create an instance of {@link CustomIDTypeReferenceType }
     * 
     */
    public CustomIDTypeReferenceType createCustomIDTypeReferenceType() {
        return new CustomIDTypeReferenceType();
    }

    /**
     * Create an instance of {@link InternalProjectExperienceObjectIDType }
     * 
     */
    public InternalProjectExperienceObjectIDType createInternalProjectExperienceObjectIDType() {
        return new InternalProjectExperienceObjectIDType();
    }

    /**
     * Create an instance of {@link CountryRegionObjectIDType }
     * 
     */
    public CountryRegionObjectIDType createCountryRegionObjectIDType() {
        return new CountryRegionObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemObjectType }
     * 
     */
    public CommitteeMeetingAgendaItemObjectType createCommitteeMeetingAgendaItemObjectType() {
        return new CommitteeMeetingAgendaItemObjectType();
    }

    /**
     * Create an instance of {@link PayrollReportingTypeObjectType }
     * 
     */
    public PayrollReportingTypeObjectType createPayrollReportingTypeObjectType() {
        return new PayrollReportingTypeObjectType();
    }

    /**
     * Create an instance of {@link RelativeNameInformationDataType }
     * 
     */
    public RelativeNameInformationDataType createRelativeNameInformationDataType() {
        return new RelativeNameInformationDataType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationMeritPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationMeritPlanAssignmentDataType createEmployeeCompensationMeritPlanAssignmentDataType() {
        return new EmployeeCompensationMeritPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link PositionWorkerTypeObjectIDType }
     * 
     */
    public PositionWorkerTypeObjectIDType createPositionWorkerTypeObjectIDType() {
        return new PositionWorkerTypeObjectIDType();
    }

    /**
     * Create an instance of {@link TerminationStatusDataType }
     * 
     */
    public TerminationStatusDataType createTerminationStatusDataType() {
        return new TerminationStatusDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingResponseGroupType }
     * 
     */
    public CommitteeMeetingResponseGroupType createCommitteeMeetingResponseGroupType() {
        return new CommitteeMeetingResponseGroupType();
    }

    /**
     * Create an instance of {@link JobProfileWorkStudyDataType }
     * 
     */
    public JobProfileWorkStudyDataType createJobProfileWorkStudyDataType() {
        return new JobProfileWorkStudyDataType();
    }

    /**
     * Create an instance of {@link AssignableRoleObjectIDType }
     * 
     */
    public AssignableRoleObjectIDType createAssignableRoleObjectIDType() {
        return new AssignableRoleObjectIDType();
    }

    /**
     * Create an instance of {@link LicenseIDDataType }
     * 
     */
    public LicenseIDDataType createLicenseIDDataType() {
        return new LicenseIDDataType();
    }

    /**
     * Create an instance of {@link WorkerBenefitElectionDataType }
     * 
     */
    public WorkerBenefitElectionDataType createWorkerBenefitElectionDataType() {
        return new WorkerBenefitElectionDataType();
    }

    /**
     * Create an instance of {@link PersonalPreferencesDataType }
     * 
     */
    public PersonalPreferencesDataType createPersonalPreferencesDataType() {
        return new PersonalPreferencesDataType();
    }

    /**
     * Create an instance of {@link OrganizationAssignmentRestrictionsByTypeDataType }
     * 
     */
    public OrganizationAssignmentRestrictionsByTypeDataType createOrganizationAssignmentRestrictionsByTypeDataType() {
        return new OrganizationAssignmentRestrictionsByTypeDataType();
    }

    /**
     * Create an instance of {@link PerformanceImprovementPlanDataType }
     * 
     */
    public PerformanceImprovementPlanDataType createPerformanceImprovementPlanDataType() {
        return new PerformanceImprovementPlanDataType();
    }

    /**
     * Create an instance of {@link CountryObjectIDType }
     * 
     */
    public CountryObjectIDType createCountryObjectIDType() {
        return new CountryObjectIDType();
    }

    /**
     * Create an instance of {@link WorkdayAccountResponseGroupType }
     * 
     */
    public WorkdayAccountResponseGroupType createWorkdayAccountResponseGroupType() {
        return new WorkdayAccountResponseGroupType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetResponseGroupType }
     * 
     */
    public WorkStatusRuleSetResponseGroupType createWorkStatusRuleSetResponseGroupType() {
        return new WorkStatusRuleSetResponseGroupType();
    }

    /**
     * Create an instance of {@link WorkerEventHistoryDataType }
     * 
     */
    public WorkerEventHistoryDataType createWorkerEventHistoryDataType() {
        return new WorkerEventHistoryDataType();
    }

    /**
     * Create an instance of {@link WorkdayAccountForWorkerDataType }
     * 
     */
    public WorkdayAccountForWorkerDataType createWorkdayAccountForWorkerDataType() {
        return new WorkdayAccountForWorkerDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactorOptionsDataType }
     * 
     */
    public CollectiveAgreementFactorOptionsDataType createCollectiveAgreementFactorOptionsDataType() {
        return new CollectiveAgreementFactorOptionsDataType();
    }

    /**
     * Create an instance of {@link ContactInformationDataType }
     * 
     */
    public ContactInformationDataType createContactInformationDataType() {
        return new ContactInformationDataType();
    }

    /**
     * Create an instance of {@link VisaIDType }
     * 
     */
    public VisaIDType createVisaIDType() {
        return new VisaIDType();
    }

    /**
     * Create an instance of {@link BenefitProviderIdentifierTypeObjectType }
     * 
     */
    public BenefitProviderIdentifierTypeObjectType createBenefitProviderIdentifierTypeObjectType() {
        return new BenefitProviderIdentifierTypeObjectType();
    }

    /**
     * Create an instance of {@link AcademicUnitRequestReferencesType }
     * 
     */
    public AcademicUnitRequestReferencesType createAcademicUnitRequestReferencesType() {
        return new AcademicUnitRequestReferencesType();
    }

    /**
     * Create an instance of {@link EmailReferenceObjectType }
     * 
     */
    public EmailReferenceObjectType createEmailReferenceObjectType() {
        return new EmailReferenceObjectType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryAmountAnnualizedDataType }
     * 
     */
    public CompensatableSummaryAmountAnnualizedDataType createCompensatableSummaryAmountAnnualizedDataType() {
        return new CompensatableSummaryAmountAnnualizedDataType();
    }

    /**
     * Create an instance of {@link VisaIdentifierDataType }
     * 
     */
    public VisaIdentifierDataType createVisaIdentifierDataType() {
        return new VisaIdentifierDataType();
    }

    /**
     * Create an instance of {@link PronounResponseDataType }
     * 
     */
    public PronounResponseDataType createPronounResponseDataType() {
        return new PronounResponseDataType();
    }

    /**
     * Create an instance of {@link LocationResponseGroupType }
     * 
     */
    public LocationResponseGroupType createLocationResponseGroupType() {
        return new LocationResponseGroupType();
    }

    /**
     * Create an instance of {@link RelativeNameReferenceObjectType }
     * 
     */
    public RelativeNameReferenceObjectType createRelativeNameReferenceObjectType() {
        return new RelativeNameReferenceObjectType();
    }

    /**
     * Create an instance of {@link LanguageAbilityProfileDataType }
     * 
     */
    public LanguageAbilityProfileDataType createLanguageAbilityProfileDataType() {
        return new LanguageAbilityProfileDataType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingActionItemSubDataType }
     * 
     */
    public CommitteeMeetingActionItemSubDataType createCommitteeMeetingActionItemSubDataType() {
        return new CommitteeMeetingActionItemSubDataType();
    }

    /**
     * Create an instance of {@link FrequencyBehaviorObjectIDType }
     * 
     */
    public FrequencyBehaviorObjectIDType createFrequencyBehaviorObjectIDType() {
        return new FrequencyBehaviorObjectIDType();
    }

    /**
     * Create an instance of {@link PayComponentObjectType }
     * 
     */
    public PayComponentObjectType createPayComponentObjectType() {
        return new PayComponentObjectType();
    }

    /**
     * Create an instance of {@link BackgroundCheckStatusObjectIDType }
     * 
     */
    public BackgroundCheckStatusObjectIDType createBackgroundCheckStatusObjectIDType() {
        return new BackgroundCheckStatusObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerTypeObjectType }
     * 
     */
    public WorkerTypeObjectType createWorkerTypeObjectType() {
        return new WorkerTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationType }
     * 
     */
    public CommitteeClassificationType createCommitteeClassificationType() {
        return new CommitteeClassificationType();
    }

    /**
     * Create an instance of {@link JobProfileRequestReferencesType }
     * 
     */
    public JobProfileRequestReferencesType createJobProfileRequestReferencesType() {
        return new JobProfileRequestReferencesType();
    }

    /**
     * Create an instance of {@link CountrySubregionObjectType }
     * 
     */
    public CountrySubregionObjectType createCountrySubregionObjectType() {
        return new CountrySubregionObjectType();
    }

    /**
     * Create an instance of {@link DependentCoverageDataType }
     * 
     */
    public DependentCoverageDataType createDependentCoverageDataType() {
        return new DependentCoverageDataType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierResponseDataType }
     * 
     */
    public UniversalIdentifierResponseDataType createUniversalIdentifierResponseDataType() {
        return new UniversalIdentifierResponseDataType();
    }

    /**
     * Create an instance of {@link PhoneReferenceObjectIDType }
     * 
     */
    public PhoneReferenceObjectIDType createPhoneReferenceObjectIDType() {
        return new PhoneReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link AwardAndActivityType }
     * 
     */
    public AwardAndActivityType createAwardAndActivityType() {
        return new AwardAndActivityType();
    }

    /**
     * Create an instance of {@link TransactionLogTypeObjectIDType }
     * 
     */
    public TransactionLogTypeObjectIDType createTransactionLogTypeObjectIDType() {
        return new TransactionLogTypeObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicLevelObjectIDType }
     * 
     */
    public AcademicLevelObjectIDType createAcademicLevelObjectIDType() {
        return new AcademicLevelObjectIDType();
    }

    /**
     * Create an instance of {@link TrainingQualificationReplacementType }
     * 
     */
    public TrainingQualificationReplacementType createTrainingQualificationReplacementType() {
        return new TrainingQualificationReplacementType();
    }

    /**
     * Create an instance of {@link EmployeeContractReasonObjectIDType }
     * 
     */
    public EmployeeContractReasonObjectIDType createEmployeeContractReasonObjectIDType() {
        return new EmployeeContractReasonObjectIDType();
    }

    /**
     * Create an instance of {@link ContingentWorkerDataType }
     * 
     */
    public ContingentWorkerDataType createContingentWorkerDataType() {
        return new ContingentWorkerDataType();
    }

    /**
     * Create an instance of {@link CourseDefinitionObjectType }
     * 
     */
    public CourseDefinitionObjectType createCourseDefinitionObjectType() {
        return new CourseDefinitionObjectType();
    }

    /**
     * Create an instance of {@link WorkerOrganizationMembershipDataType }
     * 
     */
    public WorkerOrganizationMembershipDataType createWorkerOrganizationMembershipDataType() {
        return new WorkerOrganizationMembershipDataType();
    }

    /**
     * Create an instance of {@link PositionReferenceType }
     * 
     */
    public PositionReferenceType createPositionReferenceType() {
        return new PositionReferenceType();
    }

    /**
     * Create an instance of {@link OrganizationRequestCriteriaType }
     * 
     */
    public OrganizationRequestCriteriaType createOrganizationRequestCriteriaType() {
        return new OrganizationRequestCriteriaType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityObjectType }
     * 
     */
    public SocialBenefitsLocalityObjectType createSocialBenefitsLocalityObjectType() {
        return new SocialBenefitsLocalityObjectType();
    }

    /**
     * Create an instance of {@link SkillItemObjectType }
     * 
     */
    public SkillItemObjectType createSkillItemObjectType() {
        return new SkillItemObjectType();
    }

    /**
     * Create an instance of {@link DisabilityInformationDataForRelatedPersonType }
     * 
     */
    public DisabilityInformationDataForRelatedPersonType createDisabilityInformationDataForRelatedPersonType() {
        return new DisabilityInformationDataForRelatedPersonType();
    }

    /**
     * Create an instance of {@link AcademicUnitObjectType }
     * 
     */
    public AcademicUnitObjectType createAcademicUnitObjectType() {
        return new AcademicUnitObjectType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryAmountInTargetFrequencyDataType }
     * 
     */
    public CompensatableSummaryAmountInTargetFrequencyDataType createCompensatableSummaryAmountInTargetFrequencyDataType() {
        return new CompensatableSummaryAmountInTargetFrequencyDataType();
    }

    /**
     * Create an instance of {@link RelatedPersonDataType }
     * 
     */
    public RelatedPersonDataType createRelatedPersonDataType() {
        return new RelatedPersonDataType();
    }

    /**
     * Create an instance of {@link BiographicDataType }
     * 
     */
    public BiographicDataType createBiographicDataType() {
        return new BiographicDataType();
    }

    /**
     * Create an instance of {@link SkillQualificationProfileReplacementDataType }
     * 
     */
    public SkillQualificationProfileReplacementDataType createSkillQualificationProfileReplacementDataType() {
        return new SkillQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link CommitteeDefinitionResponseDataType }
     * 
     */
    public CommitteeDefinitionResponseDataType createCommitteeDefinitionResponseDataType() {
        return new CommitteeDefinitionResponseDataType();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link SalaryPayPlanObjectIDType }
     * 
     */
    public SalaryPayPlanObjectIDType createSalaryPayPlanObjectIDType() {
        return new SalaryPayPlanObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerDocumentWWSType }
     * 
     */
    public WorkerDocumentWWSType createWorkerDocumentWWSType() {
        return new WorkerDocumentWWSType();
    }

    /**
     * Create an instance of {@link DifficultyToFillObjectType }
     * 
     */
    public DifficultyToFillObjectType createDifficultyToFillObjectType() {
        return new DifficultyToFillObjectType();
    }

    /**
     * Create an instance of {@link GenderObjectType }
     * 
     */
    public GenderObjectType createGenderObjectType() {
        return new GenderObjectType();
    }

    /**
     * Create an instance of {@link WorkerType }
     * 
     */
    public WorkerType createWorkerType() {
        return new WorkerType();
    }

    /**
     * Create an instance of {@link CommitteeDefinitionSnapshotDataType }
     * 
     */
    public CommitteeDefinitionSnapshotDataType createCommitteeDefinitionSnapshotDataType() {
        return new CommitteeDefinitionSnapshotDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleObjectType }
     * 
     */
    public WorkStatusRuleObjectType createWorkStatusRuleObjectType() {
        return new WorkStatusRuleObjectType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackCustomObjectDataType }
     * 
     */
    public AcademicAppointmentTrackCustomObjectDataType createAcademicAppointmentTrackCustomObjectDataType() {
        return new AcademicAppointmentTrackCustomObjectDataType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationSalaryUnitPlanAssignmentDataType }
     * 
     */
    public EmployeeCompensationSalaryUnitPlanAssignmentDataType createEmployeeCompensationSalaryUnitPlanAssignmentDataType() {
        return new EmployeeCompensationSalaryUnitPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link LicenseTypeReferenceType }
     * 
     */
    public LicenseTypeReferenceType createLicenseTypeReferenceType() {
        return new LicenseTypeReferenceType();
    }

    /**
     * Create an instance of {@link TalentTagObjectType }
     * 
     */
    public TalentTagObjectType createTalentTagObjectType() {
        return new TalentTagObjectType();
    }

    /**
     * Create an instance of {@link ApplicantObjectType }
     * 
     */
    public ApplicantObjectType createApplicantObjectType() {
        return new ApplicantObjectType();
    }

    /**
     * Create an instance of {@link CIPCodeWorkdayOwnedObjectIDType }
     * 
     */
    public CIPCodeWorkdayOwnedObjectIDType createCIPCodeWorkdayOwnedObjectIDType() {
        return new CIPCodeWorkdayOwnedObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerContractDetailDataType }
     * 
     */
    public WorkerContractDetailDataType createWorkerContractDetailDataType() {
        return new WorkerContractDetailDataType();
    }

    /**
     * Create an instance of {@link EventTargetTransactionLogEntryDataType }
     * 
     */
    public EventTargetTransactionLogEntryDataType createEventTargetTransactionLogEntryDataType() {
        return new EventTargetTransactionLogEntryDataType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryDataType }
     * 
     */
    public CompensatableSummaryDataType createCompensatableSummaryDataType() {
        return new CompensatableSummaryDataType();
    }

    /**
     * Create an instance of {@link PersonInstantMessengerInformationDataType }
     * 
     */
    public PersonInstantMessengerInformationDataType createPersonInstantMessengerInformationDataType() {
        return new PersonInstantMessengerInformationDataType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarRequestReferencesType }
     * 
     */
    public WorkScheduleCalendarRequestReferencesType createWorkScheduleCalendarRequestReferencesType() {
        return new WorkScheduleCalendarRequestReferencesType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeResponseDataType }
     * 
     */
    public CompanyInsiderTypeResponseDataType createCompanyInsiderTypeResponseDataType() {
        return new CompanyInsiderTypeResponseDataType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationType }
     * 
     */
    public PoliticalAffiliationType createPoliticalAffiliationType() {
        return new PoliticalAffiliationType();
    }

    /**
     * Create an instance of {@link ValidationErrorType }
     * 
     */
    public ValidationErrorType createValidationErrorType() {
        return new ValidationErrorType();
    }

    /**
     * Create an instance of {@link USVeteranStatusTenantedObjectType }
     * 
     */
    public USVeteranStatusTenantedObjectType createUSVeteranStatusTenantedObjectType() {
        return new USVeteranStatusTenantedObjectType();
    }

    /**
     * Create an instance of {@link LocationAttributeRequestReferencesType }
     * 
     */
    public LocationAttributeRequestReferencesType createLocationAttributeRequestReferencesType() {
        return new LocationAttributeRequestReferencesType();
    }

    /**
     * Create an instance of {@link PassportIdentifierReferenceObjectIDType }
     * 
     */
    public PassportIdentifierReferenceObjectIDType createPassportIdentifierReferenceObjectIDType() {
        return new PassportIdentifierReferenceObjectIDType();
    }

    /**
     * Create an instance of {@link LocaleObjectType }
     * 
     */
    public LocaleObjectType createLocaleObjectType() {
        return new LocaleObjectType();
    }

    /**
     * Create an instance of {@link AuthorityObjectIDType }
     * 
     */
    public AuthorityObjectIDType createAuthorityObjectIDType() {
        return new AuthorityObjectIDType();
    }

    /**
     * Create an instance of {@link RoleAssignerObjectType }
     * 
     */
    public RoleAssignerObjectType createRoleAssignerObjectType() {
        return new RoleAssignerObjectType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarResponseGroupType }
     * 
     */
    public PeriodReportingCalendarResponseGroupType createPeriodReportingCalendarResponseGroupType() {
        return new PeriodReportingCalendarResponseGroupType();
    }

    /**
     * Create an instance of {@link HealthSavingsAccountCoverageDataType }
     * 
     */
    public HealthSavingsAccountCoverageDataType createHealthSavingsAccountCoverageDataType() {
        return new HealthSavingsAccountCoverageDataType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyResponseGroupType }
     * 
     */
    public AppointmentSpecialtyResponseGroupType createAppointmentSpecialtyResponseGroupType() {
        return new AppointmentSpecialtyResponseGroupType();
    }

    /**
     * Create an instance of {@link WorkShiftDataType }
     * 
     */
    public WorkShiftDataType createWorkShiftDataType() {
        return new WorkShiftDataType();
    }

    /**
     * Create an instance of {@link CoverageLevelValueDataType }
     * 
     */
    public CoverageLevelValueDataType createCoverageLevelValueDataType() {
        return new CoverageLevelValueDataType();
    }

    /**
     * Create an instance of {@link EndAcademicAppointmentDataType }
     * 
     */
    public EndAcademicAppointmentDataType createEndAcademicAppointmentDataType() {
        return new EndAcademicAppointmentDataType();
    }

    /**
     * Create an instance of {@link CompensationStepReferenceDataType }
     * 
     */
    public CompensationStepReferenceDataType createCompensationStepReferenceDataType() {
        return new CompensationStepReferenceDataType();
    }

    /**
     * Create an instance of {@link BackgroundCheckOverallStatusDataType }
     * 
     */
    public BackgroundCheckOverallStatusDataType createBackgroundCheckOverallStatusDataType() {
        return new BackgroundCheckOverallStatusDataType();
    }

    /**
     * Create an instance of {@link SpecialtyObjectType }
     * 
     */
    public SpecialtyObjectType createSpecialtyObjectType() {
        return new SpecialtyObjectType();
    }

    /**
     * Create an instance of {@link StaffObjectIDType }
     * 
     */
    public StaffObjectIDType createStaffObjectIDType() {
        return new StaffObjectIDType();
    }

    /**
     * Create an instance of {@link GetWorkdayAccountResponseDataType }
     * 
     */
    public GetWorkdayAccountResponseDataType createGetWorkdayAccountResponseDataType() {
        return new GetWorkdayAccountResponseDataType();
    }

    /**
     * Create an instance of {@link EducationQualificationReplacementType }
     * 
     */
    public EducationQualificationReplacementType createEducationQualificationReplacementType() {
        return new EducationQualificationReplacementType();
    }

    /**
     * Create an instance of {@link WorkScheduleCalendarRequestCriteriaType }
     * 
     */
    public WorkScheduleCalendarRequestCriteriaType createWorkScheduleCalendarRequestCriteriaType() {
        return new WorkScheduleCalendarRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkStatusObjectType }
     * 
     */
    public WorkStatusObjectType createWorkStatusObjectType() {
        return new WorkStatusObjectType();
    }

    /**
     * Create an instance of {@link LanguageAbilityDataType }
     * 
     */
    public LanguageAbilityDataType createLanguageAbilityDataType() {
        return new LanguageAbilityDataType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierDataHVType }
     * 
     */
    public UniversalIdentifierDataHVType createUniversalIdentifierDataHVType() {
        return new UniversalIdentifierDataHVType();
    }

    /**
     * Create an instance of {@link RetentionObjectType }
     * 
     */
    public RetentionObjectType createRetentionObjectType() {
        return new RetentionObjectType();
    }

    /**
     * Create an instance of {@link EmployerContributionAmountDataType }
     * 
     */
    public EmployerContributionAmountDataType createEmployerContributionAmountDataType() {
        return new EmployerContributionAmountDataType();
    }

    /**
     * Create an instance of {@link AwardAndActivityAchievementDataType }
     * 
     */
    public AwardAndActivityAchievementDataType createAwardAndActivityAchievementDataType() {
        return new AwardAndActivityAchievementDataType();
    }

    /**
     * Create an instance of {@link TimeProfileObjectType }
     * 
     */
    public TimeProfileObjectType createTimeProfileObjectType() {
        return new TimeProfileObjectType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleRowObjectIDType }
     * 
     */
    public WorkStatusRuleRowObjectIDType createWorkStatusRuleRowObjectIDType() {
        return new WorkStatusRuleRowObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeAllowanceUnitPlanAssignmentDataType }
     * 
     */
    public EmployeeAllowanceUnitPlanAssignmentDataType createEmployeeAllowanceUnitPlanAssignmentDataType() {
        return new EmployeeAllowanceUnitPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link EstablishmentResponseDataType }
     * 
     */
    public EstablishmentResponseDataType createEstablishmentResponseDataType() {
        return new EstablishmentResponseDataType();
    }

    /**
     * Create an instance of {@link AcademicRankObjectIDType }
     * 
     */
    public AcademicRankObjectIDType createAcademicRankObjectIDType() {
        return new AcademicRankObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAttachmentObjectIDType }
     * 
     */
    public CommitteeMeetingAttachmentObjectIDType createCommitteeMeetingAttachmentObjectIDType() {
        return new CommitteeMeetingAttachmentObjectIDType();
    }

    /**
     * Create an instance of {@link ProbationPeriodLengthDataType }
     * 
     */
    public ProbationPeriodLengthDataType createProbationPeriodLengthDataType() {
        return new ProbationPeriodLengthDataType();
    }

    /**
     * Create an instance of {@link BeneficiaryObjectIDType }
     * 
     */
    public BeneficiaryObjectIDType createBeneficiaryObjectIDType() {
        return new BeneficiaryObjectIDType();
    }

    /**
     * Create an instance of {@link SupplierObjectIDType }
     * 
     */
    public SupplierObjectIDType createSupplierObjectIDType() {
        return new SupplierObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerGoalDataType }
     * 
     */
    public WorkerGoalDataType createWorkerGoalDataType() {
        return new WorkerGoalDataType();
    }

    /**
     * Create an instance of {@link CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType }
     * 
     */
    public CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType createCompensatableSummaryAmountAnnualizedInReportingCurrencyDataType() {
        return new CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType();
    }

    /**
     * Create an instance of {@link ExternalPayrollEmployeeTypeObjectType }
     * 
     */
    public ExternalPayrollEmployeeTypeObjectType createExternalPayrollEmployeeTypeObjectType() {
        return new ExternalPayrollEmployeeTypeObjectType();
    }

    /**
     * Create an instance of {@link CountryOfBirthReferenceType }
     * 
     */
    public CountryOfBirthReferenceType createCountryOfBirthReferenceType() {
        return new CountryOfBirthReferenceType();
    }

    /**
     * Create an instance of {@link GovernmentIDDataType }
     * 
     */
    public GovernmentIDDataType createGovernmentIDDataType() {
        return new GovernmentIDDataType();
    }

    /**
     * Create an instance of {@link DisabilityInformationDataType }
     * 
     */
    public DisabilityInformationDataType createDisabilityInformationDataType() {
        return new DisabilityInformationDataType();
    }

    /**
     * Create an instance of {@link PassportsAndVisasIdentificationDataType }
     * 
     */
    public PassportsAndVisasIdentificationDataType createPassportsAndVisasIdentificationDataType() {
        return new PassportsAndVisasIdentificationDataType();
    }

    /**
     * Create an instance of {@link ManageEmployeeProbationPeriodsEventDataType }
     * 
     */
    public ManageEmployeeProbationPeriodsEventDataType createManageEmployeeProbationPeriodsEventDataType() {
        return new ManageEmployeeProbationPeriodsEventDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleObjectIDType }
     * 
     */
    public WorkStatusRuleObjectIDType createWorkStatusRuleObjectIDType() {
        return new WorkStatusRuleObjectIDType();
    }

    /**
     * Create an instance of {@link ChangeHomeContactInformationResponseDataType }
     * 
     */
    public ChangeHomeContactInformationResponseDataType createChangeHomeContactInformationResponseDataType() {
        return new ChangeHomeContactInformationResponseDataType();
    }

    /**
     * Create an instance of {@link AcademicUnitResponseGroupType }
     * 
     */
    public AcademicUnitResponseGroupType createAcademicUnitResponseGroupType() {
        return new AcademicUnitResponseGroupType();
    }

    /**
     * Create an instance of {@link LocationHierarchyOrganizationAssignmentsRequestReferencesType }
     * 
     */
    public LocationHierarchyOrganizationAssignmentsRequestReferencesType createLocationHierarchyOrganizationAssignmentsRequestReferencesType() {
        return new LocationHierarchyOrganizationAssignmentsRequestReferencesType();
    }

    /**
     * Create an instance of {@link OrganizationWWSDataType }
     * 
     */
    public OrganizationWWSDataType createOrganizationWWSDataType() {
        return new OrganizationWWSDataType();
    }

    /**
     * Create an instance of {@link SkillQualificationReplacementType }
     * 
     */
    public SkillQualificationReplacementType createSkillQualificationReplacementType() {
        return new SkillQualificationReplacementType();
    }

    /**
     * Create an instance of {@link FieldOfStudyObjectIDType }
     * 
     */
    public FieldOfStudyObjectIDType createFieldOfStudyObjectIDType() {
        return new FieldOfStudyObjectIDType();
    }

    /**
     * Create an instance of {@link HukouTypeObjectIDType }
     * 
     */
    public HukouTypeObjectIDType createHukouTypeObjectIDType() {
        return new HukouTypeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerDocumentObjectType }
     * 
     */
    public WorkerDocumentObjectType createWorkerDocumentObjectType() {
        return new WorkerDocumentObjectType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationResponseDataType }
     * 
     */
    public PoliticalAffiliationResponseDataType createPoliticalAffiliationResponseDataType() {
        return new PoliticalAffiliationResponseDataType();
    }

    /**
     * Create an instance of {@link LanguageQualificationProfileReplacementDataType }
     * 
     */
    public LanguageQualificationProfileReplacementDataType createLanguageQualificationProfileReplacementDataType() {
        return new LanguageQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link PronounRequestReferencesType }
     * 
     */
    public PronounRequestReferencesType createPronounRequestReferencesType() {
        return new PronounRequestReferencesType();
    }

    /**
     * Create an instance of {@link CertificationAttachmentDataType }
     * 
     */
    public CertificationAttachmentDataType createCertificationAttachmentDataType() {
        return new CertificationAttachmentDataType();
    }

    /**
     * Create an instance of {@link EditNamedProfessorshipDataType }
     * 
     */
    public EditNamedProfessorshipDataType createEditNamedProfessorshipDataType() {
        return new EditNamedProfessorshipDataType();
    }

    /**
     * Create an instance of {@link WorkerObjectType }
     * 
     */
    public WorkerObjectType createWorkerObjectType() {
        return new WorkerObjectType();
    }

    /**
     * Create an instance of {@link ContainerOrganizationReferenceDataType }
     * 
     */
    public ContainerOrganizationReferenceDataType createContainerOrganizationReferenceDataType() {
        return new ContainerOrganizationReferenceDataType();
    }

    /**
     * Create an instance of {@link UserLanguageSettingResponseGroupType }
     * 
     */
    public UserLanguageSettingResponseGroupType createUserLanguageSettingResponseGroupType() {
        return new UserLanguageSettingResponseGroupType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemTypeObjectIDType }
     * 
     */
    public CommitteeMeetingAgendaItemTypeObjectIDType createCommitteeMeetingAgendaItemTypeObjectIDType() {
        return new CommitteeMeetingAgendaItemTypeObjectIDType();
    }

    /**
     * Create an instance of {@link JobFamilyObjectIDType }
     * 
     */
    public JobFamilyObjectIDType createJobFamilyObjectIDType() {
        return new JobFamilyObjectIDType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyObjectIDType }
     * 
     */
    public AppointmentSpecialtyObjectIDType createAppointmentSpecialtyObjectIDType() {
        return new AppointmentSpecialtyObjectIDType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentRequestReferencesType }
     * 
     */
    public FormerWorkerAttachmentRequestReferencesType createFormerWorkerAttachmentRequestReferencesType() {
        return new FormerWorkerAttachmentRequestReferencesType();
    }

    /**
     * Create an instance of {@link BeneficiaryAllocationDataType }
     * 
     */
    public BeneficiaryAllocationDataType createBeneficiaryAllocationDataType() {
        return new BeneficiaryAllocationDataType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupDataType }
     * 
     */
    public ProvisioningGroupDataType createProvisioningGroupDataType() {
        return new ProvisioningGroupDataType();
    }

    /**
     * Create an instance of {@link RetentionObjectIDType }
     * 
     */
    public RetentionObjectIDType createRetentionObjectIDType() {
        return new RetentionObjectIDType();
    }

    /**
     * Create an instance of {@link ManageEducationSubBusinessProcessDataType }
     * 
     */
    public ManageEducationSubBusinessProcessDataType createManageEducationSubBusinessProcessDataType() {
        return new ManageEducationSubBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link IntegrationDocumentFieldObjectType }
     * 
     */
    public IntegrationDocumentFieldObjectType createIntegrationDocumentFieldObjectType() {
        return new IntegrationDocumentFieldObjectType();
    }

    /**
     * Create an instance of {@link EducationalTaxonomyCodeObjectType }
     * 
     */
    public EducationalTaxonomyCodeObjectType createEducationalTaxonomyCodeObjectType() {
        return new EducationalTaxonomyCodeObjectType();
    }

    /**
     * Create an instance of {@link FormerWorkerResponseGroupType }
     * 
     */
    public FormerWorkerResponseGroupType createFormerWorkerResponseGroupType() {
        return new FormerWorkerResponseGroupType();
    }

    /**
     * Create an instance of {@link MilitaryServiceReferenceObjectType }
     * 
     */
    public MilitaryServiceReferenceObjectType createMilitaryServiceReferenceObjectType() {
        return new MilitaryServiceReferenceObjectType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeRequestCriteriaType }
     * 
     */
    public WorkersCompensationCodeRequestCriteriaType createWorkersCompensationCodeRequestCriteriaType() {
        return new WorkersCompensationCodeRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationObjectIDType }
     * 
     */
    public PoliticalAffiliationObjectIDType createPoliticalAffiliationObjectIDType() {
        return new PoliticalAffiliationObjectIDType();
    }

    /**
     * Create an instance of {@link EstablishmentRequestReferencesType }
     * 
     */
    public EstablishmentRequestReferencesType createEstablishmentRequestReferencesType() {
        return new EstablishmentRequestReferencesType();
    }

    /**
     * Create an instance of {@link JobFamilyBaseObjectType }
     * 
     */
    public JobFamilyBaseObjectType createJobFamilyBaseObjectType() {
        return new JobFamilyBaseObjectType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeObjectIDType }
     * 
     */
    public CompanyInsiderTypeObjectIDType createCompanyInsiderTypeObjectIDType() {
        return new CompanyInsiderTypeObjectIDType();
    }

    /**
     * Create an instance of {@link ProvsioningGroupAssignmentRequestReferencesType }
     * 
     */
    public ProvsioningGroupAssignmentRequestReferencesType createProvsioningGroupAssignmentRequestReferencesType() {
        return new ProvsioningGroupAssignmentRequestReferencesType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeObjectType }
     * 
     */
    public ServiceCenterRepresentativeObjectType createServiceCenterRepresentativeObjectType() {
        return new ServiceCenterRepresentativeObjectType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationSalaryPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationSalaryPlanAssignmentDetailDataType createEmployeeCompensationSalaryPlanAssignmentDetailDataType() {
        return new EmployeeCompensationSalaryPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link EmployeeContractStatusObjectIDType }
     * 
     */
    public EmployeeContractStatusObjectIDType createEmployeeContractStatusObjectIDType() {
        return new EmployeeContractStatusObjectIDType();
    }

    /**
     * Create an instance of {@link CustomIdentifierDataType }
     * 
     */
    public CustomIdentifierDataType createCustomIdentifierDataType() {
        return new CustomIdentifierDataType();
    }

    /**
     * Create an instance of {@link UserLanguageSettingRequestCriteriaType }
     * 
     */
    public UserLanguageSettingRequestCriteriaType createUserLanguageSettingRequestCriteriaType() {
        return new UserLanguageSettingRequestCriteriaType();
    }

    /**
     * Create an instance of {@link AcademicUnitRequestCriteriaType }
     * 
     */
    public AcademicUnitRequestCriteriaType createAcademicUnitRequestCriteriaType() {
        return new AcademicUnitRequestCriteriaType();
    }

    /**
     * Create an instance of {@link FuturePaymentPlanAssignmentDataType }
     * 
     */
    public FuturePaymentPlanAssignmentDataType createFuturePaymentPlanAssignmentDataType() {
        return new FuturePaymentPlanAssignmentDataType();
    }

    /**
     * Create an instance of {@link ReviewRatingObjectIDType }
     * 
     */
    public ReviewRatingObjectIDType createReviewRatingObjectIDType() {
        return new ReviewRatingObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeRequestReferencesType }
     * 
     */
    public CommitteeMembershipTypeRequestReferencesType createCommitteeMembershipTypeRequestReferencesType() {
        return new CommitteeMembershipTypeRequestReferencesType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureReferenceType }
     * 
     */
    public UnitOfMeasureReferenceType createUnitOfMeasureReferenceType() {
        return new UnitOfMeasureReferenceType();
    }

    /**
     * Create an instance of {@link AcademicTrackTypeObjectType }
     * 
     */
    public AcademicTrackTypeObjectType createAcademicTrackTypeObjectType() {
        return new AcademicTrackTypeObjectType();
    }

    /**
     * Create an instance of {@link VolumeDataType }
     * 
     */
    public VolumeDataType createVolumeDataType() {
        return new VolumeDataType();
    }

    /**
     * Create an instance of {@link TransactionLogDataType }
     * 
     */
    public TransactionLogDataType createTransactionLogDataType() {
        return new TransactionLogDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationDataType }
     * 
     */
    public CommitteeClassificationDataType createCommitteeClassificationDataType() {
        return new CommitteeClassificationDataType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentDataType }
     * 
     */
    public FormerWorkerAttachmentDataType createFormerWorkerAttachmentDataType() {
        return new FormerWorkerAttachmentDataType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarRequestReferencesType }
     * 
     */
    public PeriodReportingCalendarRequestReferencesType createPeriodReportingCalendarRequestReferencesType() {
        return new PeriodReportingCalendarRequestReferencesType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsType }
     * 
     */
    public AssignUserBasedSecurityGroupsType createAssignUserBasedSecurityGroupsType() {
        return new AssignUserBasedSecurityGroupsType();
    }

    /**
     * Create an instance of {@link CustomIDDataType }
     * 
     */
    public CustomIDDataType createCustomIDDataType() {
        return new CustomIDDataType();
    }

    /**
     * Create an instance of {@link CompensationGradeObjectType }
     * 
     */
    public CompensationGradeObjectType createCompensationGradeObjectType() {
        return new CompensationGradeObjectType();
    }

    /**
     * Create an instance of {@link ChangeBusinessTitleDataType }
     * 
     */
    public ChangeBusinessTitleDataType createChangeBusinessTitleDataType() {
        return new ChangeBusinessTitleDataType();
    }

    /**
     * Create an instance of {@link JobPreviousSystemHistoryObjectType }
     * 
     */
    public JobPreviousSystemHistoryObjectType createJobPreviousSystemHistoryObjectType() {
        return new JobPreviousSystemHistoryObjectType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationMeritPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationMeritPlanAssignmentDetailDataType createEmployeeCompensationMeritPlanAssignmentDetailDataType() {
        return new EmployeeCompensationMeritPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link BenefitProviderIdentifierTypeObjectIDType }
     * 
     */
    public BenefitProviderIdentifierTypeObjectIDType createBenefitProviderIdentifierTypeObjectIDType() {
        return new BenefitProviderIdentifierTypeObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMembershipTypeResponseGroupType }
     * 
     */
    public CommitteeMembershipTypeResponseGroupType createCommitteeMembershipTypeResponseGroupType() {
        return new CommitteeMembershipTypeResponseGroupType();
    }

    /**
     * Create an instance of {@link SpecialtyChildObjectIDType }
     * 
     */
    public SpecialtyChildObjectIDType createSpecialtyChildObjectIDType() {
        return new SpecialtyChildObjectIDType();
    }

    /**
     * Create an instance of {@link FieldOfStudyObjectType }
     * 
     */
    public FieldOfStudyObjectType createFieldOfStudyObjectType() {
        return new FieldOfStudyObjectType();
    }

    /**
     * Create an instance of {@link LeaveOfAbsenceTypeReferenceType }
     * 
     */
    public LeaveOfAbsenceTypeReferenceType createLeaveOfAbsenceTypeReferenceType() {
        return new LeaveOfAbsenceTypeReferenceType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeObjectIDType }
     * 
     */
    public ServiceCenterRepresentativeObjectIDType createServiceCenterRepresentativeObjectIDType() {
        return new ServiceCenterRepresentativeObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerReferenceType }
     * 
     */
    public WorkerReferenceType createWorkerReferenceType() {
        return new WorkerReferenceType();
    }

    /**
     * Create an instance of {@link DayBreakerDividerObjectIDType }
     * 
     */
    public DayBreakerDividerObjectIDType createDayBreakerDividerObjectIDType() {
        return new DayBreakerDividerObjectIDType();
    }

    /**
     * Create an instance of {@link WorkStatusObjectIDType }
     * 
     */
    public WorkStatusObjectIDType createWorkStatusObjectIDType() {
        return new WorkStatusObjectIDType();
    }

    /**
     * Create an instance of {@link MobilityChoiceObjectIDType }
     * 
     */
    public MobilityChoiceObjectIDType createMobilityChoiceObjectIDType() {
        return new MobilityChoiceObjectIDType();
    }

    /**
     * Create an instance of {@link InsuranceCoverageLevelDataType }
     * 
     */
    public InsuranceCoverageLevelDataType createInsuranceCoverageLevelDataType() {
        return new InsuranceCoverageLevelDataType();
    }

    /**
     * Create an instance of {@link AcademicRankDataType }
     * 
     */
    public AcademicRankDataType createAcademicRankDataType() {
        return new AcademicRankDataType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierObjectIDType }
     * 
     */
    public UniversalIdentifierObjectIDType createUniversalIdentifierObjectIDType() {
        return new UniversalIdentifierObjectIDType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupResponseDataType }
     * 
     */
    public ProvisioningGroupResponseDataType createProvisioningGroupResponseDataType() {
        return new ProvisioningGroupResponseDataType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceIDRequestCriteriaType }
     * 
     */
    public OrganizationReferenceIDRequestCriteriaType createOrganizationReferenceIDRequestCriteriaType() {
        return new OrganizationReferenceIDRequestCriteriaType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupResponseGroupType }
     * 
     */
    public JobFamilyGroupResponseGroupType createJobFamilyGroupResponseGroupType() {
        return new JobFamilyGroupResponseGroupType();
    }

    /**
     * Create an instance of {@link PersonDisabilityStatusDataType }
     * 
     */
    public PersonDisabilityStatusDataType createPersonDisabilityStatusDataType() {
        return new PersonDisabilityStatusDataType();
    }

    /**
     * Create an instance of {@link GenderIdentityObjectIDType }
     * 
     */
    public GenderIdentityObjectIDType createGenderIdentityObjectIDType() {
        return new GenderIdentityObjectIDType();
    }

    /**
     * Create an instance of {@link InternationalAssignmentTypeObjectIDType }
     * 
     */
    public InternationalAssignmentTypeObjectIDType createInternationalAssignmentTypeObjectIDType() {
        return new InternationalAssignmentTypeObjectIDType();
    }

    /**
     * Create an instance of {@link LocationHierarchyObjectIDType }
     * 
     */
    public LocationHierarchyObjectIDType createLocationHierarchyObjectIDType() {
        return new LocationHierarchyObjectIDType();
    }

    /**
     * Create an instance of {@link VendorReferenceType }
     * 
     */
    public VendorReferenceType createVendorReferenceType() {
        return new VendorReferenceType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemDataSubeditType }
     * 
     */
    public CommitteeMeetingAgendaItemDataSubeditType createCommitteeMeetingAgendaItemDataSubeditType() {
        return new CommitteeMeetingAgendaItemDataSubeditType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemVoteDataSubeditType }
     * 
     */
    public CommitteeMeetingAgendaItemVoteDataSubeditType createCommitteeMeetingAgendaItemVoteDataSubeditType() {
        return new CommitteeMeetingAgendaItemVoteDataSubeditType();
    }

    /**
     * Create an instance of {@link SpecialtyParentObjectIDType }
     * 
     */
    public SpecialtyParentObjectIDType createSpecialtyParentObjectIDType() {
        return new SpecialtyParentObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerRequestCriteriaType }
     * 
     */
    public WorkerRequestCriteriaType createWorkerRequestCriteriaType() {
        return new WorkerRequestCriteriaType();
    }

    /**
     * Create an instance of {@link CustomIDType }
     * 
     */
    public CustomIDType createCustomIDType() {
        return new CustomIDType();
    }

    /**
     * Create an instance of {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     */
    public QualifiedDomesticRelationsOrderReplacementDataType createQualifiedDomesticRelationsOrderReplacementDataType() {
        return new QualifiedDomesticRelationsOrderReplacementDataType();
    }

    /**
     * Create an instance of {@link DisciplinaryActionObjectType }
     * 
     */
    public DisciplinaryActionObjectType createDisciplinaryActionObjectType() {
        return new DisciplinaryActionObjectType();
    }

    /**
     * Create an instance of {@link CreateWorkdayAccountSubBusinessProcessType }
     * 
     */
    public CreateWorkdayAccountSubBusinessProcessType createCreateWorkdayAccountSubBusinessProcessType() {
        return new CreateWorkdayAccountSubBusinessProcessType();
    }

    /**
     * Create an instance of {@link EmployeeContractStatusObjectType }
     * 
     */
    public EmployeeContractStatusObjectType createEmployeeContractStatusObjectType() {
        return new EmployeeContractStatusObjectType();
    }

    /**
     * Create an instance of {@link SpecialtyAchievementDataType }
     * 
     */
    public SpecialtyAchievementDataType createSpecialtyAchievementDataType() {
        return new SpecialtyAchievementDataType();
    }

    /**
     * Create an instance of {@link PersonAddressDataType }
     * 
     */
    public PersonAddressDataType createPersonAddressDataType() {
        return new PersonAddressDataType();
    }

    /**
     * Create an instance of {@link DependentDataType }
     * 
     */
    public DependentDataType createDependentDataType() {
        return new DependentDataType();
    }

    /**
     * Create an instance of {@link WorkerBenefitEnrollmentDataType }
     * 
     */
    public WorkerBenefitEnrollmentDataType createWorkerBenefitEnrollmentDataType() {
        return new WorkerBenefitEnrollmentDataType();
    }

    /**
     * Create an instance of {@link CurrencyReferenceDataType }
     * 
     */
    public CurrencyReferenceDataType createCurrencyReferenceDataType() {
        return new CurrencyReferenceDataType();
    }

    /**
     * Create an instance of {@link ManagementLevelObjectIDType }
     * 
     */
    public ManagementLevelObjectIDType createManagementLevelObjectIDType() {
        return new ManagementLevelObjectIDType();
    }

    /**
     * Create an instance of {@link GiftObjectIDType }
     * 
     */
    public GiftObjectIDType createGiftObjectIDType() {
        return new GiftObjectIDType();
    }

    /**
     * Create an instance of {@link LeaveStatusDetailDataType }
     * 
     */
    public LeaveStatusDetailDataType createLeaveStatusDetailDataType() {
        return new LeaveStatusDetailDataType();
    }

    /**
     * Create an instance of {@link DevelopmentItemCategoryObjectType }
     * 
     */
    public DevelopmentItemCategoryObjectType createDevelopmentItemCategoryObjectType() {
        return new DevelopmentItemCategoryObjectType();
    }

    /**
     * Create an instance of {@link BackgroundCheckStatusObjectType }
     * 
     */
    public BackgroundCheckStatusObjectType createBackgroundCheckStatusObjectType() {
        return new BackgroundCheckStatusObjectType();
    }

    /**
     * Create an instance of {@link TravelAmountObjectIDType }
     * 
     */
    public TravelAmountObjectIDType createTravelAmountObjectIDType() {
        return new TravelAmountObjectIDType();
    }

    /**
     * Create an instance of {@link DegreeObjectType }
     * 
     */
    public DegreeObjectType createDegreeObjectType() {
        return new DegreeObjectType();
    }

    /**
     * Create an instance of {@link JobProfilePayRateDataType }
     * 
     */
    public JobProfilePayRateDataType createJobProfilePayRateDataType() {
        return new JobProfilePayRateDataType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentResponseDataType }
     * 
     */
    public ProvisioningGroupAssignmentResponseDataType createProvisioningGroupAssignmentResponseDataType() {
        return new ProvisioningGroupAssignmentResponseDataType();
    }

    /**
     * Create an instance of {@link ContactInformationForPersonEventDataType }
     * 
     */
    public ContactInformationForPersonEventDataType createContactInformationForPersonEventDataType() {
        return new ContactInformationForPersonEventDataType();
    }

    /**
     * Create an instance of {@link StartEndMinuteSupportDataType }
     * 
     */
    public StartEndMinuteSupportDataType createStartEndMinuteSupportDataType() {
        return new StartEndMinuteSupportDataType();
    }

    /**
     * Create an instance of {@link InsuranceCoverageTargetObjectType }
     * 
     */
    public InsuranceCoverageTargetObjectType createInsuranceCoverageTargetObjectType() {
        return new InsuranceCoverageTargetObjectType();
    }

    /**
     * Create an instance of {@link EventClassificationSubcategoryObjectIDType }
     * 
     */
    public EventClassificationSubcategoryObjectIDType createEventClassificationSubcategoryObjectIDType() {
        return new EventClassificationSubcategoryObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeReviewDataType }
     * 
     */
    public EmployeeReviewDataType createEmployeeReviewDataType() {
        return new EmployeeReviewDataType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyResponseDataType }
     * 
     */
    public AppointmentSpecialtyResponseDataType createAppointmentSpecialtyResponseDataType() {
        return new AppointmentSpecialtyResponseDataType();
    }

    /**
     * Create an instance of {@link CertificationAchievementType }
     * 
     */
    public CertificationAchievementType createCertificationAchievementType() {
        return new CertificationAchievementType();
    }

    /**
     * Create an instance of {@link IntegrationSystemAuditedObjectIDType }
     * 
     */
    public IntegrationSystemAuditedObjectIDType createIntegrationSystemAuditedObjectIDType() {
        return new IntegrationSystemAuditedObjectIDType();
    }

    /**
     * Create an instance of {@link ExternalDisabilitySelfIdentificationRecordDataType }
     * 
     */
    public ExternalDisabilitySelfIdentificationRecordDataType createExternalDisabilitySelfIdentificationRecordDataType() {
        return new ExternalDisabilitySelfIdentificationRecordDataType();
    }

    /**
     * Create an instance of {@link CompanyObjectType }
     * 
     */
    public CompanyObjectType createCompanyObjectType() {
        return new CompanyObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingVoteRecordObjectType }
     * 
     */
    public CommitteeMeetingVoteRecordObjectType createCommitteeMeetingVoteRecordObjectType() {
        return new CommitteeMeetingVoteRecordObjectType();
    }

    /**
     * Create an instance of {@link FuturePaymentPlanObjectIDType }
     * 
     */
    public FuturePaymentPlanObjectIDType createFuturePaymentPlanObjectIDType() {
        return new FuturePaymentPlanObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerAdditionalBenefitsCoverageDataType }
     * 
     */
    public WorkerAdditionalBenefitsCoverageDataType createWorkerAdditionalBenefitsCoverageDataType() {
        return new WorkerAdditionalBenefitsCoverageDataType();
    }

    /**
     * Create an instance of {@link ChangeHomeContactInformationBusinessProcessDataType }
     * 
     */
    public ChangeHomeContactInformationBusinessProcessDataType createChangeHomeContactInformationBusinessProcessDataType() {
        return new ChangeHomeContactInformationBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link TransactionLogObjectIDType }
     * 
     */
    public TransactionLogObjectIDType createTransactionLogObjectIDType() {
        return new TransactionLogObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeContributionAmountDataType }
     * 
     */
    public EmployeeContributionAmountDataType createEmployeeContributionAmountDataType() {
        return new EmployeeContributionAmountDataType();
    }

    /**
     * Create an instance of {@link OrganizationTypeReferenceDataType }
     * 
     */
    public OrganizationTypeReferenceDataType createOrganizationTypeReferenceDataType() {
        return new OrganizationTypeReferenceDataType();
    }

    /**
     * Create an instance of {@link LastNameDataType }
     * 
     */
    public LastNameDataType createLastNameDataType() {
        return new LastNameDataType();
    }

    /**
     * Create an instance of {@link EffectiveAndUpdatedDateTimeDataType }
     * 
     */
    public EffectiveAndUpdatedDateTimeDataType createEffectiveAndUpdatedDateTimeDataType() {
        return new EffectiveAndUpdatedDateTimeDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentIdentifierObjectIDType }
     * 
     */
    public AcademicAppointmentIdentifierObjectIDType createAcademicAppointmentIdentifierObjectIDType() {
        return new AcademicAppointmentIdentifierObjectIDType();
    }

    /**
     * Create an instance of {@link ChangeEmergencyContactsBusinessProcessDataType }
     * 
     */
    public ChangeEmergencyContactsBusinessProcessDataType createChangeEmergencyContactsBusinessProcessDataType() {
        return new ChangeEmergencyContactsBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link NamedProfessorshipObjectType }
     * 
     */
    public NamedProfessorshipObjectType createNamedProfessorshipObjectType() {
        return new NamedProfessorshipObjectType();
    }

    /**
     * Create an instance of {@link JobProfileDataType }
     * 
     */
    public JobProfileDataType createJobProfileDataType() {
        return new JobProfileDataType();
    }

    /**
     * Create an instance of {@link FormerWorkerAttachmentObjectIDType }
     * 
     */
    public FormerWorkerAttachmentObjectIDType createFormerWorkerAttachmentObjectIDType() {
        return new FormerWorkerAttachmentObjectIDType();
    }

    /**
     * Create an instance of {@link PositionOrganizationDataType }
     * 
     */
    public PositionOrganizationDataType createPositionOrganizationDataType() {
        return new PositionOrganizationDataType();
    }

    /**
     * Create an instance of {@link PeriodReportingCalendarDataType }
     * 
     */
    public PeriodReportingCalendarDataType createPeriodReportingCalendarDataType() {
        return new PeriodReportingCalendarDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationObjectType }
     * 
     */
    public CommitteeClassificationObjectType createCommitteeClassificationObjectType() {
        return new CommitteeClassificationObjectType();
    }

    /**
     * Create an instance of {@link OrganizationRoleForWorkerDataType }
     * 
     */
    public OrganizationRoleForWorkerDataType createOrganizationRoleForWorkerDataType() {
        return new OrganizationRoleForWorkerDataType();
    }

    /**
     * Create an instance of {@link PayrollReportingCodeAllObjectType }
     * 
     */
    public PayrollReportingCodeAllObjectType createPayrollReportingCodeAllObjectType() {
        return new PayrollReportingCodeAllObjectType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityDataType }
     * 
     */
    public SocialBenefitsLocalityDataType createSocialBenefitsLocalityDataType() {
        return new SocialBenefitsLocalityDataType();
    }

    /**
     * Create an instance of {@link DisabilityType }
     * 
     */
    public DisabilityType createDisabilityType() {
        return new DisabilityType();
    }

    /**
     * Create an instance of {@link UniversalIdentifierObjectType }
     * 
     */
    public UniversalIdentifierObjectType createUniversalIdentifierObjectType() {
        return new UniversalIdentifierObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemTypeObjectType }
     * 
     */
    public CommitteeMeetingAgendaItemTypeObjectType createCommitteeMeetingAgendaItemTypeObjectType() {
        return new CommitteeMeetingAgendaItemTypeObjectType();
    }

    /**
     * Create an instance of {@link LanguageQualificationReplacementType }
     * 
     */
    public LanguageQualificationReplacementType createLanguageQualificationReplacementType() {
        return new LanguageQualificationReplacementType();
    }

    /**
     * Create an instance of {@link TransactionLogObjectType }
     * 
     */
    public TransactionLogObjectType createTransactionLogObjectType() {
        return new TransactionLogObjectType();
    }

    /**
     * Create an instance of {@link ManageProfessionalAffiliationSubBusinessProcessDataType }
     * 
     */
    public ManageProfessionalAffiliationSubBusinessProcessDataType createManageProfessionalAffiliationSubBusinessProcessDataType() {
        return new ManageProfessionalAffiliationSubBusinessProcessDataType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeResponseGroupType }
     * 
     */
    public AcademicAppointeeResponseGroupType createAcademicAppointeeResponseGroupType() {
        return new AcademicAppointeeResponseGroupType();
    }

    /**
     * Create an instance of {@link CountryPredefinedPersonNameComponentValueObjectIDType }
     * 
     */
    public CountryPredefinedPersonNameComponentValueObjectIDType createCountryPredefinedPersonNameComponentValueObjectIDType() {
        return new CountryPredefinedPersonNameComponentValueObjectIDType();
    }

    /**
     * Create an instance of {@link TimeZoneObjectIDType }
     * 
     */
    public TimeZoneObjectIDType createTimeZoneObjectIDType() {
        return new TimeZoneObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicRankResponseDataType }
     * 
     */
    public AcademicRankResponseDataType createAcademicRankResponseDataType() {
        return new AcademicRankResponseDataType();
    }

    /**
     * Create an instance of {@link ResponsibilityQualificationReplacementType }
     * 
     */
    public ResponsibilityQualificationReplacementType createResponsibilityQualificationReplacementType() {
        return new ResponsibilityQualificationReplacementType();
    }

    /**
     * Create an instance of {@link JobHistoryType }
     * 
     */
    public JobHistoryType createJobHistoryType() {
        return new JobHistoryType();
    }

    /**
     * Create an instance of {@link SocialBenefitsLocalityType }
     * 
     */
    public SocialBenefitsLocalityType createSocialBenefitsLocalityType() {
        return new SocialBenefitsLocalityType();
    }

    /**
     * Create an instance of {@link GetCommitteeDefintionRequestReferencesType }
     * 
     */
    public GetCommitteeDefintionRequestReferencesType createGetCommitteeDefintionRequestReferencesType() {
        return new GetCommitteeDefintionRequestReferencesType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupObjectIDType }
     * 
     */
    public ProvisioningGroupObjectIDType createProvisioningGroupObjectIDType() {
        return new ProvisioningGroupObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupRequestReferencesType }
     * 
     */
    public CommitteeClassificationGroupRequestReferencesType createCommitteeClassificationGroupRequestReferencesType() {
        return new CommitteeClassificationGroupRequestReferencesType();
    }

    /**
     * Create an instance of {@link EmailCoreDataType }
     * 
     */
    public EmailCoreDataType createEmailCoreDataType() {
        return new EmailCoreDataType();
    }

    /**
     * Create an instance of {@link SupervisoryOrganizationObjectType }
     * 
     */
    public SupervisoryOrganizationObjectType createSupervisoryOrganizationObjectType() {
        return new SupervisoryOrganizationObjectType();
    }

    /**
     * Create an instance of {@link ProvisioningGroupAssignmentForPersonDataType }
     * 
     */
    public ProvisioningGroupAssignmentForPersonDataType createProvisioningGroupAssignmentForPersonDataType() {
        return new ProvisioningGroupAssignmentForPersonDataType();
    }

    /**
     * Create an instance of {@link PronounType }
     * 
     */
    public PronounType createPronounType() {
        return new PronounType();
    }

    /**
     * Create an instance of {@link DeliveryModeObjectIDType }
     * 
     */
    public DeliveryModeObjectIDType createDeliveryModeObjectIDType() {
        return new DeliveryModeObjectIDType();
    }

    /**
     * Create an instance of {@link ProficiencyRatingObjectType }
     * 
     */
    public ProficiencyRatingObjectType createProficiencyRatingObjectType() {
        return new ProficiencyRatingObjectType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeEnabledObjectIDType }
     * 
     */
    public AcademicAppointeeEnabledObjectIDType createAcademicAppointeeEnabledObjectIDType() {
        return new AcademicAppointeeEnabledObjectIDType();
    }

    /**
     * Create an instance of {@link DisabilityCertificationBasisObjectType }
     * 
     */
    public DisabilityCertificationBasisObjectType createDisabilityCertificationBasisObjectType() {
        return new DisabilityCertificationBasisObjectType();
    }

    /**
     * Create an instance of {@link CompetencyQualificationProfileReplacementDataType }
     * 
     */
    public CompetencyQualificationProfileReplacementDataType createCompetencyQualificationProfileReplacementDataType() {
        return new CompetencyQualificationProfileReplacementDataType();
    }

    /**
     * Create an instance of {@link UserPreferredCommunicationLanguageReferencesType }
     * 
     */
    public UserPreferredCommunicationLanguageReferencesType createUserPreferredCommunicationLanguageReferencesType() {
        return new UserPreferredCommunicationLanguageReferencesType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationRequestReferencesType }
     * 
     */
    public PoliticalAffiliationRequestReferencesType createPoliticalAffiliationRequestReferencesType() {
        return new PoliticalAffiliationRequestReferencesType();
    }

    /**
     * Create an instance of {@link BackgroundCheckEventObjectType }
     * 
     */
    public BackgroundCheckEventObjectType createBackgroundCheckEventObjectType() {
        return new BackgroundCheckEventObjectType();
    }

    /**
     * Create an instance of {@link PassportTypeReferenceType }
     * 
     */
    public PassportTypeReferenceType createPassportTypeReferenceType() {
        return new PassportTypeReferenceType();
    }

    /**
     * Create an instance of {@link DevelopmentPlanObjectIDType }
     * 
     */
    public DevelopmentPlanObjectIDType createDevelopmentPlanObjectIDType() {
        return new DevelopmentPlanObjectIDType();
    }

    /**
     * Create an instance of {@link GenericMilitaryInformationDataType }
     * 
     */
    public GenericMilitaryInformationDataType createGenericMilitaryInformationDataType() {
        return new GenericMilitaryInformationDataType();
    }

    /**
     * Create an instance of {@link SexualOrientationDataType }
     * 
     */
    public SexualOrientationDataType createSexualOrientationDataType() {
        return new SexualOrientationDataType();
    }

    /**
     * Create an instance of {@link JobProfileBasicDataType }
     * 
     */
    public JobProfileBasicDataType createJobProfileBasicDataType() {
        return new JobProfileBasicDataType();
    }

    /**
     * Create an instance of {@link EmergencyContactPersonalInformationDataType }
     * 
     */
    public EmergencyContactPersonalInformationDataType createEmergencyContactPersonalInformationDataType() {
        return new EmergencyContactPersonalInformationDataType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupType }
     * 
     */
    public AssignUserBasedSecurityGroupType createAssignUserBasedSecurityGroupType() {
        return new AssignUserBasedSecurityGroupType();
    }

    /**
     * Create an instance of {@link UnionObjectIDType }
     * 
     */
    public UnionObjectIDType createUnionObjectIDType() {
        return new UnionObjectIDType();
    }

    /**
     * Create an instance of {@link JobClassificationType }
     * 
     */
    public JobClassificationType createJobClassificationType() {
        return new JobClassificationType();
    }

    /**
     * Create an instance of {@link DevelopmentItemCategoryObjectIDType }
     * 
     */
    public DevelopmentItemCategoryObjectIDType createDevelopmentItemCategoryObjectIDType() {
        return new DevelopmentItemCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link SchoolTypeReferenceType }
     * 
     */
    public SchoolTypeReferenceType createSchoolTypeReferenceType() {
        return new SchoolTypeReferenceType();
    }

    /**
     * Create an instance of {@link MaritalStatusReferenceType }
     * 
     */
    public MaritalStatusReferenceType createMaritalStatusReferenceType() {
        return new MaritalStatusReferenceType();
    }

    /**
     * Create an instance of {@link MilitaryStatusObjectType }
     * 
     */
    public MilitaryStatusObjectType createMilitaryStatusObjectType() {
        return new MilitaryStatusObjectType();
    }

    /**
     * Create an instance of {@link JobFamilyResponseDataType }
     * 
     */
    public JobFamilyResponseDataType createJobFamilyResponseDataType() {
        return new JobFamilyResponseDataType();
    }

    /**
     * Create an instance of {@link EmployeePhotoDataType }
     * 
     */
    public EmployeePhotoDataType createEmployeePhotoDataType() {
        return new EmployeePhotoDataType();
    }

    /**
     * Create an instance of {@link PositionTimeTypeObjectType }
     * 
     */
    public PositionTimeTypeObjectType createPositionTimeTypeObjectType() {
        return new PositionTimeTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupDataType }
     * 
     */
    public CommitteeClassificationGroupDataType createCommitteeClassificationGroupDataType() {
        return new CommitteeClassificationGroupDataType();
    }

    /**
     * Create an instance of {@link PoliticalAffiliationObjectType }
     * 
     */
    public PoliticalAffiliationObjectType createPoliticalAffiliationObjectType() {
        return new PoliticalAffiliationObjectType();
    }

    /**
     * Create an instance of {@link USProtectedVeteranStatusTypeObjectIDType }
     * 
     */
    public USProtectedVeteranStatusTypeObjectIDType createUSProtectedVeteranStatusTypeObjectIDType() {
        return new USProtectedVeteranStatusTypeObjectIDType();
    }

    /**
     * Create an instance of {@link JobHistorySkillObjectIDType }
     * 
     */
    public JobHistorySkillObjectIDType createJobHistorySkillObjectIDType() {
        return new JobHistorySkillObjectIDType();
    }

    /**
     * Create an instance of {@link AcademicAppointmentTrackAdditionalDataRequestReferencesType }
     * 
     */
    public AcademicAppointmentTrackAdditionalDataRequestReferencesType createAcademicAppointmentTrackAdditionalDataRequestReferencesType() {
        return new AcademicAppointmentTrackAdditionalDataRequestReferencesType();
    }

    /**
     * Create an instance of {@link LocationTypeReferenceDataType }
     * 
     */
    public LocationTypeReferenceDataType createLocationTypeReferenceDataType() {
        return new LocationTypeReferenceDataType();
    }

    /**
     * Create an instance of {@link CollectiveAgreementFactor3DataType }
     * 
     */
    public CollectiveAgreementFactor3DataType createCollectiveAgreementFactor3DataType() {
        return new CollectiveAgreementFactor3DataType();
    }

    /**
     * Create an instance of {@link HealthSavingsAccountElectionInfoDataType }
     * 
     */
    public HealthSavingsAccountElectionInfoDataType createHealthSavingsAccountElectionInfoDataType() {
        return new HealthSavingsAccountElectionInfoDataType();
    }

    /**
     * Create an instance of {@link ChangeAdditionalNameDataType }
     * 
     */
    public ChangeAdditionalNameDataType createChangeAdditionalNameDataType() {
        return new ChangeAdditionalNameDataType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeRequestReferencesType }
     * 
     */
    public WorkersCompensationCodeRequestReferencesType createWorkersCompensationCodeRequestReferencesType() {
        return new WorkersCompensationCodeRequestReferencesType();
    }

    /**
     * Create an instance of {@link GetChangeWorkContactInformationRequestReferencesType }
     * 
     */
    public GetChangeWorkContactInformationRequestReferencesType createGetChangeWorkContactInformationRequestReferencesType() {
        return new GetChangeWorkContactInformationRequestReferencesType();
    }

    /**
     * Create an instance of {@link EmployeeCompensationCommissionPlanAssignmentDetailDataType }
     * 
     */
    public EmployeeCompensationCommissionPlanAssignmentDetailDataType createEmployeeCompensationCommissionPlanAssignmentDetailDataType() {
        return new EmployeeCompensationCommissionPlanAssignmentDetailDataType();
    }

    /**
     * Create an instance of {@link CreateNamedProfessorshipDataType }
     * 
     */
    public CreateNamedProfessorshipDataType createCreateNamedProfessorshipDataType() {
        return new CreateNamedProfessorshipDataType();
    }

    /**
     * Create an instance of {@link WorkerHealthCareDataType }
     * 
     */
    public WorkerHealthCareDataType createWorkerHealthCareDataType() {
        return new WorkerHealthCareDataType();
    }

    /**
     * Create an instance of {@link CommitteeAttachmentObjectType }
     * 
     */
    public CommitteeAttachmentObjectType createCommitteeAttachmentObjectType() {
        return new CommitteeAttachmentObjectType();
    }

    /**
     * Create an instance of {@link PreviousSystemJobHistoryType }
     * 
     */
    public PreviousSystemJobHistoryType createPreviousSystemJobHistoryType() {
        return new PreviousSystemJobHistoryType();
    }

    /**
     * Create an instance of {@link AssignUserBasedSecurityGroupsRequestReferencesType }
     * 
     */
    public AssignUserBasedSecurityGroupsRequestReferencesType createAssignUserBasedSecurityGroupsRequestReferencesType() {
        return new AssignUserBasedSecurityGroupsRequestReferencesType();
    }

    /**
     * Create an instance of {@link MaritalStatusObjectType }
     * 
     */
    public MaritalStatusObjectType createMaritalStatusObjectType() {
        return new MaritalStatusObjectType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupDataType }
     * 
     */
    public JobClassificationGroupDataType createJobClassificationGroupDataType() {
        return new JobClassificationGroupDataType();
    }

    /**
     * Create an instance of {@link UnionObjectType }
     * 
     */
    public UnionObjectType createUnionObjectType() {
        return new UnionObjectType();
    }

    /**
     * Create an instance of {@link WorkExperienceRatingObjectIDType }
     * 
     */
    public WorkExperienceRatingObjectIDType createWorkExperienceRatingObjectIDType() {
        return new WorkExperienceRatingObjectIDType();
    }

    /**
     * Create an instance of {@link JobProfileQuestionnaireDataType }
     * 
     */
    public JobProfileQuestionnaireDataType createJobProfileQuestionnaireDataType() {
        return new JobProfileQuestionnaireDataType();
    }

    /**
     * Create an instance of {@link TwentyFourHourTimeObjectIDType }
     * 
     */
    public TwentyFourHourTimeObjectIDType createTwentyFourHourTimeObjectIDType() {
        return new TwentyFourHourTimeObjectIDType();
    }

    /**
     * Create an instance of {@link PhoneDeviceTypeObjectType }
     * 
     */
    public PhoneDeviceTypeObjectType createPhoneDeviceTypeObjectType() {
        return new PhoneDeviceTypeObjectType();
    }

    /**
     * Create an instance of {@link GoalDetailDataType }
     * 
     */
    public GoalDetailDataType createGoalDetailDataType() {
        return new GoalDetailDataType();
    }

    /**
     * Create an instance of {@link BenefitProviderObjectType }
     * 
     */
    public BenefitProviderObjectType createBenefitProviderObjectType() {
        return new BenefitProviderObjectType();
    }

    /**
     * Create an instance of {@link CompanyInsiderTypeObjectType }
     * 
     */
    public CompanyInsiderTypeObjectType createCompanyInsiderTypeObjectType() {
        return new CompanyInsiderTypeObjectType();
    }

    /**
     * Create an instance of {@link WorkerResponseGroupType }
     * 
     */
    public WorkerResponseGroupType createWorkerResponseGroupType() {
        return new WorkerResponseGroupType();
    }

    /**
     * Create an instance of {@link CompensationGradeProfileObjectIDType }
     * 
     */
    public CompensationGradeProfileObjectIDType createCompensationGradeProfileObjectIDType() {
        return new CompensationGradeProfileObjectIDType();
    }

    /**
     * Create an instance of {@link DevelopmentItemObjectIDType }
     * 
     */
    public DevelopmentItemObjectIDType createDevelopmentItemObjectIDType() {
        return new DevelopmentItemObjectIDType();
    }

    /**
     * Create an instance of {@link TalentTagObjectIDType }
     * 
     */
    public TalentTagObjectIDType createTalentTagObjectIDType() {
        return new TalentTagObjectIDType();
    }

    /**
     * Create an instance of {@link NotificationCategorizableObjectType }
     * 
     */
    public NotificationCategorizableObjectType createNotificationCategorizableObjectType() {
        return new NotificationCategorizableObjectType();
    }

    /**
     * Create an instance of {@link LocationReferenceWWSType }
     * 
     */
    public LocationReferenceWWSType createLocationReferenceWWSType() {
        return new LocationReferenceWWSType();
    }

    /**
     * Create an instance of {@link OrganizationSubtypeObjectType }
     * 
     */
    public OrganizationSubtypeObjectType createOrganizationSubtypeObjectType() {
        return new OrganizationSubtypeObjectType();
    }

    /**
     * Create an instance of {@link ExternalPayrollEntityObjectIDType }
     * 
     */
    public ExternalPayrollEntityObjectIDType createExternalPayrollEntityObjectIDType() {
        return new ExternalPayrollEntityObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerSpendingAccountDataType }
     * 
     */
    public WorkerSpendingAccountDataType createWorkerSpendingAccountDataType() {
        return new WorkerSpendingAccountDataType();
    }

    /**
     * Create an instance of {@link JobProfileRequestCriteriaType }
     * 
     */
    public JobProfileRequestCriteriaType createJobProfileRequestCriteriaType() {
        return new JobProfileRequestCriteriaType();
    }

    /**
     * Create an instance of {@link PersonWebAddressDataType }
     * 
     */
    public PersonWebAddressDataType createPersonWebAddressDataType() {
        return new PersonWebAddressDataType();
    }

    /**
     * Create an instance of {@link JobPreviousSystemHistoryObjectIDType }
     * 
     */
    public JobPreviousSystemHistoryObjectIDType createJobPreviousSystemHistoryObjectIDType() {
        return new JobPreviousSystemHistoryObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationVisibilityReferenceDataType }
     * 
     */
    public OrganizationVisibilityReferenceDataType createOrganizationVisibilityReferenceDataType() {
        return new OrganizationVisibilityReferenceDataType();
    }

    /**
     * Create an instance of {@link LocationAttributeObjectIDType }
     * 
     */
    public LocationAttributeObjectIDType createLocationAttributeObjectIDType() {
        return new LocationAttributeObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingVoteRecordObjectIDType }
     * 
     */
    public CommitteeMeetingVoteRecordObjectIDType createCommitteeMeetingVoteRecordObjectIDType() {
        return new CommitteeMeetingVoteRecordObjectIDType();
    }

    /**
     * Create an instance of {@link SkillItemObjectIDType }
     * 
     */
    public SkillItemObjectIDType createSkillItemObjectIDType() {
        return new SkillItemObjectIDType();
    }

    /**
     * Create an instance of {@link PersonSkillSourceCategoryObjectType }
     * 
     */
    public PersonSkillSourceCategoryObjectType createPersonSkillSourceCategoryObjectType() {
        return new PersonSkillSourceCategoryObjectType();
    }

    /**
     * Create an instance of {@link ComponentCompletionObjectType }
     * 
     */
    public ComponentCompletionObjectType createComponentCompletionObjectType() {
        return new ComponentCompletionObjectType();
    }

    /**
     * Create an instance of {@link StudentCourseTagObjectIDType }
     * 
     */
    public StudentCourseTagObjectIDType createStudentCourseTagObjectIDType() {
        return new StudentCourseTagObjectIDType();
    }

    /**
     * Create an instance of {@link DayBreakerDividerObjectType }
     * 
     */
    public DayBreakerDividerObjectType createDayBreakerDividerObjectType() {
        return new DayBreakerDividerObjectType();
    }

    /**
     * Create an instance of {@link RelatedPersonRelationshipObjectIDType }
     * 
     */
    public RelatedPersonRelationshipObjectIDType createRelatedPersonRelationshipObjectIDType() {
        return new RelatedPersonRelationshipObjectIDType();
    }

    /**
     * Create an instance of {@link PeriodSalaryPlanObjectIDType }
     * 
     */
    public PeriodSalaryPlanObjectIDType createPeriodSalaryPlanObjectIDType() {
        return new PeriodSalaryPlanObjectIDType();
    }

    /**
     * Create an instance of {@link DisciplinaryActionReasonObjectIDType }
     * 
     */
    public DisciplinaryActionReasonObjectIDType createDisciplinaryActionReasonObjectIDType() {
        return new DisciplinaryActionReasonObjectIDType();
    }

    /**
     * Create an instance of {@link PositionGroupRestrictionSummaryDataType }
     * 
     */
    public PositionGroupRestrictionSummaryDataType createPositionGroupRestrictionSummaryDataType() {
        return new PositionGroupRestrictionSummaryDataType();
    }

    /**
     * Create an instance of {@link MilitaryRankObjectIDType }
     * 
     */
    public MilitaryRankObjectIDType createMilitaryRankObjectIDType() {
        return new MilitaryRankObjectIDType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationOrganizationDataType }
     * 
     */
    public ProfessionalAffiliationOrganizationDataType createProfessionalAffiliationOrganizationDataType() {
        return new ProfessionalAffiliationOrganizationDataType();
    }

    /**
     * Create an instance of {@link ServiceCenterRepresentativeRequestCriteriaType }
     * 
     */
    public ServiceCenterRepresentativeRequestCriteriaType createServiceCenterRepresentativeRequestCriteriaType() {
        return new ServiceCenterRepresentativeRequestCriteriaType();
    }

    /**
     * Create an instance of {@link BloodTypeObjectIDType }
     * 
     */
    public BloodTypeObjectIDType createBloodTypeObjectIDType() {
        return new BloodTypeObjectIDType();
    }

    /**
     * Create an instance of {@link ProfessionalAffiliationReferenceObjectType }
     * 
     */
    public ProfessionalAffiliationReferenceObjectType createProfessionalAffiliationReferenceObjectType() {
        return new ProfessionalAffiliationReferenceObjectType();
    }

    /**
     * Create an instance of {@link SchoolTypeObjectIDType }
     * 
     */
    public SchoolTypeObjectIDType createSchoolTypeObjectIDType() {
        return new SchoolTypeObjectIDType();
    }

    /**
     * Create an instance of {@link SupervisoryOrganizationObjectIDType }
     * 
     */
    public SupervisoryOrganizationObjectIDType createSupervisoryOrganizationObjectIDType() {
        return new SupervisoryOrganizationObjectIDType();
    }

    /**
     * Create an instance of {@link SkillObjectType }
     * 
     */
    public SkillObjectType createSkillObjectType() {
        return new SkillObjectType();
    }

    /**
     * Create an instance of {@link LocationHierarchyOrganizationAssignmentsType }
     * 
     */
    public LocationHierarchyOrganizationAssignmentsType createLocationHierarchyOrganizationAssignmentsType() {
        return new LocationHierarchyOrganizationAssignmentsType();
    }

    /**
     * Create an instance of {@link GetWorkersResponseType }
     * 
     */
    public GetWorkersResponseType createGetWorkersResponseType() {
        return new GetWorkersResponseType();
    }

    /**
     * Create an instance of {@link ReferenceLetterEventDataType }
     * 
     */
    public ReferenceLetterEventDataType createReferenceLetterEventDataType() {
        return new ReferenceLetterEventDataType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleRowObjectType }
     * 
     */
    public WorkStatusRuleRowObjectType createWorkStatusRuleRowObjectType() {
        return new WorkStatusRuleRowObjectType();
    }

    /**
     * Create an instance of {@link PassportIdentifierDataType }
     * 
     */
    public PassportIdentifierDataType createPassportIdentifierDataType() {
        return new PassportIdentifierDataType();
    }

    /**
     * Create an instance of {@link SkillItemCategoryObjectIDType }
     * 
     */
    public SkillItemCategoryObjectIDType createSkillItemCategoryObjectIDType() {
        return new SkillItemCategoryObjectIDType();
    }

    /**
     * Create an instance of {@link EmergencyContactObjectType }
     * 
     */
    public EmergencyContactObjectType createEmergencyContactObjectType() {
        return new EmergencyContactObjectType();
    }

    /**
     * Create an instance of {@link PassportIDTypeAllObjectIDType }
     * 
     */
    public PassportIDTypeAllObjectIDType createPassportIDTypeAllObjectIDType() {
        return new PassportIDTypeAllObjectIDType();
    }

    /**
     * Create an instance of {@link WorkShiftResponseDataType }
     * 
     */
    public WorkShiftResponseDataType createWorkShiftResponseDataType() {
        return new WorkShiftResponseDataType();
    }

    /**
     * Create an instance of {@link CountryObjectType }
     * 
     */
    public CountryObjectType createCountryObjectType() {
        return new CountryObjectType();
    }

    /**
     * Create an instance of {@link PositionSetObjectIDType }
     * 
     */
    public PositionSetObjectIDType createPositionSetObjectIDType() {
        return new PositionSetObjectIDType();
    }

    /**
     * Create an instance of {@link PersonNameDetailDataType }
     * 
     */
    public PersonNameDetailDataType createPersonNameDetailDataType() {
        return new PersonNameDetailDataType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupResponseDataType }
     * 
     */
    public JobFamilyGroupResponseDataType createJobFamilyGroupResponseDataType() {
        return new JobFamilyGroupResponseDataType();
    }

    /**
     * Create an instance of {@link IntegrationDocumentFieldObjectIDType }
     * 
     */
    public IntegrationDocumentFieldObjectIDType createIntegrationDocumentFieldObjectIDType() {
        return new IntegrationDocumentFieldObjectIDType();
    }

    /**
     * Create an instance of {@link OrganizationTypeObjectType }
     * 
     */
    public OrganizationTypeObjectType createOrganizationTypeObjectType() {
        return new OrganizationTypeObjectType();
    }

    /**
     * Create an instance of {@link PersonMilitaryServiceDataType }
     * 
     */
    public PersonMilitaryServiceDataType createPersonMilitaryServiceDataType() {
        return new PersonMilitaryServiceDataType();
    }

    /**
     * Create an instance of {@link LocationIDataType }
     * 
     */
    public LocationIDataType createLocationIDataType() {
        return new LocationIDataType();
    }

    /**
     * Create an instance of {@link AssignEmployeeCollectiveAgreementDataType }
     * 
     */
    public AssignEmployeeCollectiveAgreementDataType createAssignEmployeeCollectiveAgreementDataType() {
        return new AssignEmployeeCollectiveAgreementDataType();
    }

    /**
     * Create an instance of {@link StockVestingScheduleObjectIDType }
     * 
     */
    public StockVestingScheduleObjectIDType createStockVestingScheduleObjectIDType() {
        return new StockVestingScheduleObjectIDType();
    }

    /**
     * Create an instance of {@link PersonPhoneDataType }
     * 
     */
    public PersonPhoneDataType createPersonPhoneDataType() {
        return new PersonPhoneDataType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupType }
     * 
     */
    public CommitteeClassificationGroupType createCommitteeClassificationGroupType() {
        return new CommitteeClassificationGroupType();
    }

    /**
     * Create an instance of {@link BeneficiaryType }
     * 
     */
    public BeneficiaryType createBeneficiaryType() {
        return new BeneficiaryType();
    }

    /**
     * Create an instance of {@link AuthorityReferenceType }
     * 
     */
    public AuthorityReferenceType createAuthorityReferenceType() {
        return new AuthorityReferenceType();
    }

    /**
     * Create an instance of {@link NotificationSubTypeConfigurationType }
     * 
     */
    public NotificationSubTypeConfigurationType createNotificationSubTypeConfigurationType() {
        return new NotificationSubTypeConfigurationType();
    }

    /**
     * Create an instance of {@link LicenseIdentifierObjectType }
     * 
     */
    public LicenseIdentifierObjectType createLicenseIdentifierObjectType() {
        return new LicenseIdentifierObjectType();
    }

    /**
     * Create an instance of {@link StaffingInterfaceObjectType }
     * 
     */
    public StaffingInterfaceObjectType createStaffingInterfaceObjectType() {
        return new StaffingInterfaceObjectType();
    }

    /**
     * Create an instance of {@link CommitteeMemberEnabledObjectType }
     * 
     */
    public CommitteeMemberEnabledObjectType createCommitteeMemberEnabledObjectType() {
        return new CommitteeMemberEnabledObjectType();
    }

    /**
     * Create an instance of {@link WorkerStatusDetailDataType }
     * 
     */
    public WorkerStatusDetailDataType createWorkerStatusDetailDataType() {
        return new WorkerStatusDetailDataType();
    }

    /**
     * Create an instance of {@link InternalProjectExperienceObjectType }
     * 
     */
    public InternalProjectExperienceObjectType createInternalProjectExperienceObjectType() {
        return new InternalProjectExperienceObjectType();
    }

    /**
     * Create an instance of {@link InstructorEligibilityLineDataType }
     * 
     */
    public InstructorEligibilityLineDataType createInstructorEligibilityLineDataType() {
        return new InstructorEligibilityLineDataType();
    }

    /**
     * Create an instance of {@link BeneficiaryDataWWSType }
     * 
     */
    public BeneficiaryDataWWSType createBeneficiaryDataWWSType() {
        return new BeneficiaryDataWWSType();
    }

    /**
     * Create an instance of {@link LocationAttributeDataType }
     * 
     */
    public LocationAttributeDataType createLocationAttributeDataType() {
        return new LocationAttributeDataType();
    }

    /**
     * Create an instance of {@link CertificationObjectIDType }
     * 
     */
    public CertificationObjectIDType createCertificationObjectIDType() {
        return new CertificationObjectIDType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingAgendaItemObjectIDType }
     * 
     */
    public CommitteeMeetingAgendaItemObjectIDType createCommitteeMeetingAgendaItemObjectIDType() {
        return new CommitteeMeetingAgendaItemObjectIDType();
    }

    /**
     * Create an instance of {@link HolidayCalendarObjectIDType }
     * 
     */
    public HolidayCalendarObjectIDType createHolidayCalendarObjectIDType() {
        return new HolidayCalendarObjectIDType();
    }

    /**
     * Create an instance of {@link HolidayCalendarType }
     * 
     */
    public HolidayCalendarType createHolidayCalendarType() {
        return new HolidayCalendarType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureObjectIDType }
     * 
     */
    public UnitOfMeasureObjectIDType createUnitOfMeasureObjectIDType() {
        return new UnitOfMeasureObjectIDType();
    }

    /**
     * Create an instance of {@link EmployeeProbationPeriodReasonObjectIDType }
     * 
     */
    public EmployeeProbationPeriodReasonObjectIDType createEmployeeProbationPeriodReasonObjectIDType() {
        return new EmployeeProbationPeriodReasonObjectIDType();
    }

    /**
     * Create an instance of {@link HolidayCalendarRequestCriteriaType }
     * 
     */
    public HolidayCalendarRequestCriteriaType createHolidayCalendarRequestCriteriaType() {
        return new HolidayCalendarRequestCriteriaType();
    }

    /**
     * Create an instance of {@link WorkStatusRuleSetObjectIDType }
     * 
     */
    public WorkStatusRuleSetObjectIDType createWorkStatusRuleSetObjectIDType() {
        return new WorkStatusRuleSetObjectIDType();
    }

    /**
     * Create an instance of {@link AppointmentSpecialtyType }
     * 
     */
    public AppointmentSpecialtyType createAppointmentSpecialtyType() {
        return new AppointmentSpecialtyType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingResponseDataType }
     * 
     */
    public CommitteeMeetingResponseDataType createCommitteeMeetingResponseDataType() {
        return new CommitteeMeetingResponseDataType();
    }

    /**
     * Create an instance of {@link QualificationDataForPositionRestrictionOrJobProfileType }
     * 
     */
    public QualificationDataForPositionRestrictionOrJobProfileType createQualificationDataForPositionRestrictionOrJobProfileType() {
        return new QualificationDataForPositionRestrictionOrJobProfileType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupResponseDataType }
     * 
     */
    public CommitteeClassificationGroupResponseDataType createCommitteeClassificationGroupResponseDataType() {
        return new CommitteeClassificationGroupResponseDataType();
    }

    /**
     * Create an instance of {@link JobFamilyGroupJobFamilyType }
     * 
     */
    public JobFamilyGroupJobFamilyType createJobFamilyGroupJobFamilyType() {
        return new JobFamilyGroupJobFamilyType();
    }

    /**
     * Create an instance of {@link AcademicAppointeeResponseDataType }
     * 
     */
    public AcademicAppointeeResponseDataType createAcademicAppointeeResponseDataType() {
        return new AcademicAppointeeResponseDataType();
    }

    /**
     * Create an instance of {@link AwardAndActivityTypeObjectType }
     * 
     */
    public AwardAndActivityTypeObjectType createAwardAndActivityTypeObjectType() {
        return new AwardAndActivityTypeObjectType();
    }

    /**
     * Create an instance of {@link CommitteeClassificationGroupObjectIDType }
     * 
     */
    public CommitteeClassificationGroupObjectIDType createCommitteeClassificationGroupObjectIDType() {
        return new CommitteeClassificationGroupObjectIDType();
    }

    /**
     * Create an instance of {@link EstablishmentLegalEntityObjectIDType }
     * 
     */
    public EstablishmentLegalEntityObjectIDType createEstablishmentLegalEntityObjectIDType() {
        return new EstablishmentLegalEntityObjectIDType();
    }

    /**
     * Create an instance of {@link CommunicationUsageBehaviorObjectType }
     * 
     */
    public CommunicationUsageBehaviorObjectType createCommunicationUsageBehaviorObjectType() {
        return new CommunicationUsageBehaviorObjectType();
    }

    /**
     * Create an instance of {@link BloodTypeObjectType }
     * 
     */
    public BloodTypeObjectType createBloodTypeObjectType() {
        return new BloodTypeObjectType();
    }

    /**
     * Create an instance of {@link LocaleObjectIDType }
     * 
     */
    public LocaleObjectIDType createLocaleObjectIDType() {
        return new LocaleObjectIDType();
    }

    /**
     * Create an instance of {@link WorkerBasicDataType }
     * 
     */
    public WorkerBasicDataType createWorkerBasicDataType() {
        return new WorkerBasicDataType();
    }

    /**
     * Create an instance of {@link WorkersCompensationCodeResponseDataType }
     * 
     */
    public WorkersCompensationCodeResponseDataType createWorkersCompensationCodeResponseDataType() {
        return new WorkersCompensationCodeResponseDataType();
    }

    /**
     * Create an instance of {@link DependentObjectType }
     * 
     */
    public DependentObjectType createDependentObjectType() {
        return new DependentObjectType();
    }

    /**
     * Create an instance of {@link GetCommitteeDefintionRequestCriteriaType }
     * 
     */
    public GetCommitteeDefintionRequestCriteriaType createGetCommitteeDefintionRequestCriteriaType() {
        return new GetCommitteeDefintionRequestCriteriaType();
    }

    /**
     * Create an instance of {@link OrganizationSupportRoleType }
     * 
     */
    public OrganizationSupportRoleType createOrganizationSupportRoleType() {
        return new OrganizationSupportRoleType();
    }

    /**
     * Create an instance of {@link CommitteeMeetingTypeObjectIDType }
     * 
     */
    public CommitteeMeetingTypeObjectIDType createCommitteeMeetingTypeObjectIDType() {
        return new CommitteeMeetingTypeObjectIDType();
    }

    /**
     * Create an instance of {@link CustomIDTypeObjectIDType }
     * 
     */
    public CustomIDTypeObjectIDType createCustomIDTypeObjectIDType() {
        return new CustomIDTypeObjectIDType();
    }

    /**
     * Create an instance of {@link ChangeGovernmentIDRequestCriteriaType }
     * 
     */
    public ChangeGovernmentIDRequestCriteriaType createChangeGovernmentIDRequestCriteriaType() {
        return new ChangeGovernmentIDRequestCriteriaType();
    }

    /**
     * Create an instance of {@link CountryCityObjectIDType }
     * 
     */
    public CountryCityObjectIDType createCountryCityObjectIDType() {
        return new CountryCityObjectIDType();
    }

    /**
     * Create an instance of {@link JobClassificationGroupResponseGroupType }
     * 
     */
    public JobClassificationGroupResponseGroupType createJobClassificationGroupResponseGroupType() {
        return new JobClassificationGroupResponseGroupType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePersonalInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Personal_Info")
    public JAXBElement<EmployeePersonalInfoType> createEmployeePersonalInfo(EmployeePersonalInfoType value) {
        return new JAXBElement<EmployeePersonalInfoType>(_EmployeePersonalInfo_QNAME, EmployeePersonalInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeEmploymentInfoGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Employment_Info_Get")
    public JAXBElement<EmployeeEmploymentInfoGetType> createEmployeeEmploymentInfoGet(EmployeeEmploymentInfoGetType value) {
        return new JAXBElement<EmployeeEmploymentInfoGetType>(_EmployeeEmploymentInfoGet_QNAME, EmployeeEmploymentInfoGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobFamilyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Family_Request")
    public JAXBElement<PutJobFamilyRequestType> createPutJobFamilyRequest(PutJobFamilyRequestType value) {
        return new JAXBElement<PutJobFamilyRequestType>(_PutJobFamilyRequest_QNAME, PutJobFamilyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBusinessTitleRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Business_Title_Request")
    public JAXBElement<ChangeBusinessTitleRequestType> createChangeBusinessTitleRequest(ChangeBusinessTitleRequestType value) {
        return new JAXBElement<ChangeBusinessTitleRequestType>(_ChangeBusinessTitleRequest_QNAME, ChangeBusinessTitleRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicRanksResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Ranks_Response")
    public JAXBElement<GetAcademicRanksResponseType> createGetAcademicRanksResponse(GetAcademicRanksResponseType value) {
        return new JAXBElement<GetAcademicRanksResponseType>(_GetAcademicRanksResponse_QNAME, GetAcademicRanksResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicUnitHierarchyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Unit_Hierarchy_Response")
    public JAXBElement<PutAcademicUnitHierarchyResponseType> createPutAcademicUnitHierarchyResponse(PutAcademicUnitHierarchyResponseType value) {
        return new JAXBElement<PutAcademicUnitHierarchyResponseType>(_PutAcademicUnitHierarchyResponse_QNAME, PutAcademicUnitHierarchyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignEstablishmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Establishment_Response")
    public JAXBElement<AssignEstablishmentResponseType> createAssignEstablishmentResponse(AssignEstablishmentResponseType value) {
        return new JAXBElement<AssignEstablishmentResponseType>(_AssignEstablishmentResponse_QNAME, AssignEstablishmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerPersonalInfoGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Personal_Info_Get")
    public JAXBElement<ContingentWorkerPersonalInfoGetType> createContingentWorkerPersonalInfoGet(ContingentWorkerPersonalInfoGetType value) {
        return new JAXBElement<ContingentWorkerPersonalInfoGetType>(_ContingentWorkerPersonalInfoGet_QNAME, ContingentWorkerPersonalInfoGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeMembershipTypesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Membership_Types_Request")
    public JAXBElement<GetCommitteeMembershipTypesRequestType> createGetCommitteeMembershipTypesRequest(GetCommitteeMembershipTypesRequestType value) {
        return new JAXBElement<GetCommitteeMembershipTypesRequestType>(_GetCommitteeMembershipTypesRequest_QNAME, GetCommitteeMembershipTypesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLicensesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Licenses_Response")
    public JAXBElement<ChangeLicensesResponseType> createChangeLicensesResponse(ChangeLicensesResponseType value) {
        return new JAXBElement<ChangeLicensesResponseType>(_ChangeLicensesResponse_QNAME, ChangeLicensesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Get")
    public JAXBElement<EmployeeGetType> createEmployeeGet(EmployeeGetType value) {
        return new JAXBElement<EmployeeGetType>(_EmployeeGet_QNAME, EmployeeGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Get")
    public JAXBElement<OrganizationGetType> createOrganizationGet(OrganizationGetType value) {
        return new JAXBElement<OrganizationGetType>(_OrganizationGet_QNAME, OrganizationGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPoliticalAffiliationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Political_Affiliation_Response")
    public JAXBElement<PutPoliticalAffiliationResponseType> createPutPoliticalAffiliationResponse(PutPoliticalAffiliationResponseType value) {
        return new JAXBElement<PutPoliticalAffiliationResponseType>(_PutPoliticalAffiliationResponse_QNAME, PutPoliticalAffiliationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSexualOrientationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Sexual_Orientation_Request")
    public JAXBElement<PutSexualOrientationRequestType> createPutSexualOrientationRequest(PutSexualOrientationRequestType value) {
        return new JAXBElement<PutSexualOrientationRequestType>(_PutSexualOrientationRequest_QNAME, PutSexualOrientationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkdayAccountForWorkerAddType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Workday_Account_for_Worker_Add")
    public JAXBElement<WorkdayAccountForWorkerAddType> createWorkdayAccountForWorkerAdd(WorkdayAccountForWorkerAddType value) {
        return new JAXBElement<WorkdayAccountForWorkerAddType>(_WorkdayAccountForWorkerAdd_QNAME, WorkdayAccountForWorkerAddType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutOrganizationAssignmentRestrictionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Organization_Assignment_Restrictions_Response")
    public JAXBElement<PutOrganizationAssignmentRestrictionsResponseType> createPutOrganizationAssignmentRestrictionsResponse(PutOrganizationAssignmentRestrictionsResponseType value) {
        return new JAXBElement<PutOrganizationAssignmentRestrictionsResponseType>(_PutOrganizationAssignmentRestrictionsResponse_QNAME, PutOrganizationAssignmentRestrictionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkerPhotoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Worker_Photo_Request")
    public JAXBElement<PutWorkerPhotoRequestType> createPutWorkerPhotoRequest(PutWorkerPhotoRequestType value) {
        return new JAXBElement<PutWorkerPhotoRequestType>(_PutWorkerPhotoRequest_QNAME, PutWorkerPhotoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerTimestampGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Server_Timestamp_Get")
    public JAXBElement<ServerTimestampGetType> createServerTimestampGet(ServerTimestampGetType value) {
        return new JAXBElement<ServerTimestampGetType>(_ServerTimestampGet_QNAME, ServerTimestampGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHolidayCalendarsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Holiday_Calendars_Request")
    public JAXBElement<GetHolidayCalendarsRequestType> createGetHolidayCalendarsRequest(GetHolidayCalendarsRequestType value) {
        return new JAXBElement<GetHolidayCalendarsRequestType>(_GetHolidayCalendarsRequest_QNAME, GetHolidayCalendarsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobCategoriesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Categories_Response")
    public JAXBElement<GetJobCategoriesResponseType> createGetJobCategoriesResponse(GetJobCategoriesResponseType value) {
        return new JAXBElement<GetJobCategoriesResponseType>(_GetJobCategoriesResponse_QNAME, GetJobCategoriesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutUniversalIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Universal_Identifier_Request")
    public JAXBElement<PutUniversalIdentifierRequestType> createPutUniversalIdentifierRequest(PutUniversalIdentifierRequestType value) {
        return new JAXBElement<PutUniversalIdentifierRequestType>(_PutUniversalIdentifierRequest_QNAME, PutUniversalIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerEventHistoryGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Worker_Event_History_Get")
    public JAXBElement<WorkerEventHistoryGetType> createWorkerEventHistoryGet(WorkerEventHistoryGetType value) {
        return new JAXBElement<WorkerEventHistoryGetType>(_WorkerEventHistoryGet_QNAME, WorkerEventHistoryGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workers_Request")
    public JAXBElement<GetWorkersRequestType> createGetWorkersRequest(GetWorkersRequestType value) {
        return new JAXBElement<GetWorkersRequestType>(_GetWorkersRequest_QNAME, GetWorkersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormerWorkerDocumentsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Former_Worker_Documents_Response")
    public JAXBElement<GetFormerWorkerDocumentsResponseType> createGetFormerWorkerDocumentsResponse(GetFormerWorkerDocumentsResponseType value) {
        return new JAXBElement<GetFormerWorkerDocumentsResponseType>(_GetFormerWorkerDocumentsResponse_QNAME, GetFormerWorkerDocumentsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutGenderIdentityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Gender_Identity_Response")
    public JAXBElement<PutGenderIdentityResponseType> createPutGenderIdentityResponse(PutGenderIdentityResponseType value) {
        return new JAXBElement<PutGenderIdentityResponseType>(_PutGenderIdentityResponse_QNAME, PutGenderIdentityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPreferredCommunicationLanguageResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Preferred_Communication_Language_Response")
    public JAXBElement<PutPreferredCommunicationLanguageResponseType> createPutPreferredCommunicationLanguageResponse(PutPreferredCommunicationLanguageResponseType value) {
        return new JAXBElement<PutPreferredCommunicationLanguageResponseType>(_PutPreferredCommunicationLanguageResponse_QNAME, PutPreferredCommunicationLanguageResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageCommitteeMembershipResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Committee_Membership_Response")
    public JAXBElement<ManageCommitteeMembershipResponseType> createManageCommitteeMembershipResponse(ManageCommitteeMembershipResponseType value) {
        return new JAXBElement<ManageCommitteeMembershipResponseType>(_ManageCommitteeMembershipResponse_QNAME, ManageCommitteeMembershipResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFrequenciesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Frequencies_Request")
    public JAXBElement<GetFrequenciesRequestType> createGetFrequenciesRequest(GetFrequenciesRequestType value) {
        return new JAXBElement<GetFrequenciesRequestType>(_GetFrequenciesRequest_QNAME, GetFrequenciesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobFamiliesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Families_Request")
    public JAXBElement<GetJobFamiliesRequestType> createGetJobFamiliesRequest(GetJobFamiliesRequestType value) {
        return new JAXBElement<GetJobFamiliesRequestType>(_GetJobFamiliesRequest_QNAME, GetJobFamiliesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Profile_Request")
    public JAXBElement<PutJobProfileRequestType> createPutJobProfileRequest(PutJobProfileRequestType value) {
        return new JAXBElement<PutJobProfileRequestType>(_PutJobProfileRequest_QNAME, PutJobProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobFamilyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Family_Response")
    public JAXBElement<PutJobFamilyResponseType> createPutJobFamilyResponse(PutJobFamilyResponseType value) {
        return new JAXBElement<PutJobFamilyResponseType>(_PutJobFamilyResponse_QNAME, PutJobFamilyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignMembersToCustomOrganizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Members_to_Custom_Organization_Request")
    public JAXBElement<AssignMembersToCustomOrganizationRequestType> createAssignMembersToCustomOrganizationRequest(AssignMembersToCustomOrganizationRequestType value) {
        return new JAXBElement<AssignMembersToCustomOrganizationRequestType>(_AssignMembersToCustomOrganizationRequest_QNAME, AssignMembersToCustomOrganizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutProvisioningGroupAssignmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Provisioning_Group_Assignment_Request")
    public JAXBElement<PutProvisioningGroupAssignmentRequestType> createPutProvisioningGroupAssignmentRequest(PutProvisioningGroupAssignmentRequestType value) {
        return new JAXBElement<PutProvisioningGroupAssignmentRequestType>(_PutProvisioningGroupAssignmentRequest_QNAME, PutProvisioningGroupAssignmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPronounRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Pronoun_Request")
    public JAXBElement<PutPronounRequestType> createPutPronounRequest(PutPronounRequestType value) {
        return new JAXBElement<PutPronounRequestType>(_PutPronounRequest_QNAME, PutPronounRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCenterRepresentativesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Service_Center_Representatives_Response")
    public JAXBElement<GetServiceCenterRepresentativesResponseType> createGetServiceCenterRepresentativesResponse(GetServiceCenterRepresentativesResponseType value) {
        return new JAXBElement<GetServiceCenterRepresentativesResponseType>(_GetServiceCenterRepresentativesResponse_QNAME, GetServiceCenterRepresentativesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageCommitteeMembershipRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Committee_Membership_Request")
    public JAXBElement<ManageCommitteeMembershipRequestType> createManageCommitteeMembershipRequest(ManageCommitteeMembershipRequestType value) {
        return new JAXBElement<ManageCommitteeMembershipRequestType>(_ManageCommitteeMembershipRequest_QNAME, ManageCommitteeMembershipRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobProfilesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Profiles_Request")
    public JAXBElement<GetJobProfilesRequestType> createGetJobProfilesRequest(GetJobProfilesRequestType value) {
        return new JAXBElement<GetJobProfilesRequestType>(_GetJobProfilesRequest_QNAME, GetJobProfilesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeImageUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Image_Update")
    public JAXBElement<EmployeeImageUpdateType> createEmployeeImageUpdate(EmployeeImageUpdateType value) {
        return new JAXBElement<EmployeeImageUpdateType>(_EmployeeImageUpdate_QNAME, EmployeeImageUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Response")
    public JAXBElement<PutLocationResponseType> createPutLocationResponse(PutLocationResponseType value) {
        return new JAXBElement<PutLocationResponseType>(_PutLocationResponse_QNAME, PutLocationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationFindType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Find")
    public JAXBElement<OrganizationFindType> createOrganizationFind(OrganizationFindType value) {
        return new JAXBElement<OrganizationFindType>(_OrganizationFind_QNAME, OrganizationFindType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicUnitHierarchiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Unit_Hierarchies_Request")
    public JAXBElement<GetAcademicUnitHierarchiesRequestType> createGetAcademicUnitHierarchiesRequest(GetAcademicUnitHierarchiesRequestType value) {
        return new JAXBElement<GetAcademicUnitHierarchiesRequestType>(_GetAcademicUnitHierarchiesRequest_QNAME, GetAcademicUnitHierarchiesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeVeteranStatusIdentificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Veteran_Status_Identification_Request")
    public JAXBElement<ChangeVeteranStatusIdentificationRequestType> createChangeVeteranStatusIdentificationRequest(ChangeVeteranStatusIdentificationRequestType value) {
        return new JAXBElement<ChangeVeteranStatusIdentificationRequestType>(_ChangeVeteranStatusIdentificationRequest_QNAME, ChangeVeteranStatusIdentificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDisabilitiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Disabilities_Response")
    public JAXBElement<GetDisabilitiesResponseType> createGetDisabilitiesResponse(GetDisabilitiesResponseType value) {
        return new JAXBElement<GetDisabilitiesResponseType>(_GetDisabilitiesResponse_QNAME, GetDisabilitiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPronounResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Pronoun_Response")
    public JAXBElement<PutPronounResponseType> createPutPronounResponse(PutPronounResponseType value) {
        return new JAXBElement<PutPronounResponseType>(_PutPronounResponse_QNAME, PutPronounResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkStatusRuleSetsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Status_Rule_Sets_Request")
    public JAXBElement<GetWorkStatusRuleSetsRequestType> createGetWorkStatusRuleSetsRequest(GetWorkStatusRuleSetsRequestType value) {
        return new JAXBElement<GetWorkStatusRuleSetsRequestType>(_GetWorkStatusRuleSetsRequest_QNAME, GetWorkStatusRuleSetsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCenterRepresentativeWorkdayAccountsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Service_Center_Representative_Workday_Accounts_Request")
    public JAXBElement<GetServiceCenterRepresentativeWorkdayAccountsRequestType> createGetServiceCenterRepresentativeWorkdayAccountsRequest(GetServiceCenterRepresentativeWorkdayAccountsRequestType value) {
        return new JAXBElement<GetServiceCenterRepresentativeWorkdayAccountsRequestType>(_GetServiceCenterRepresentativeWorkdayAccountsRequest_QNAME, GetServiceCenterRepresentativeWorkdayAccountsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobClassificationGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Classification_Group_Response")
    public JAXBElement<PutJobClassificationGroupResponseType> createPutJobClassificationGroupResponse(PutJobClassificationGroupResponseType value) {
        return new JAXBElement<PutJobClassificationGroupResponseType>(_PutJobClassificationGroupResponse_QNAME, PutJobClassificationGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutServiceCenterRepresentativeWorkdayAccountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Service_Center_Representative_Workday_Account_Response")
    public JAXBElement<PutServiceCenterRepresentativeWorkdayAccountResponseType> createPutServiceCenterRepresentativeWorkdayAccountResponse(PutServiceCenterRepresentativeWorkdayAccountResponseType value) {
        return new JAXBElement<PutServiceCenterRepresentativeWorkdayAccountResponseType>(_PutServiceCenterRepresentativeWorkdayAccountResponse_QNAME, PutServiceCenterRepresentativeWorkdayAccountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutProvisioningGroupAssignmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Provisioning_Group_Assignment_Response")
    public JAXBElement<PutProvisioningGroupAssignmentResponseType> createPutProvisioningGroupAssignmentResponse(PutProvisioningGroupAssignmentResponseType value) {
        return new JAXBElement<PutProvisioningGroupAssignmentResponseType>(_PutProvisioningGroupAssignmentResponse_QNAME, PutProvisioningGroupAssignmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutEstablishmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Establishment_Response")
    public JAXBElement<PutEstablishmentResponseType> createPutEstablishmentResponse(PutEstablishmentResponseType value) {
        return new JAXBElement<PutEstablishmentResponseType>(_PutEstablishmentResponse_QNAME, PutEstablishmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignUserBasedSecurityGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Assign_User-Based_Security_Groups_Request")
    public JAXBElement<GetAssignUserBasedSecurityGroupsRequestType> createGetAssignUserBasedSecurityGroupsRequest(GetAssignUserBasedSecurityGroupsRequestType value) {
        return new JAXBElement<GetAssignUserBasedSecurityGroupsRequestType>(_GetAssignUserBasedSecurityGroupsRequest_QNAME, GetAssignUserBasedSecurityGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeMeetingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Meeting_Response")
    public JAXBElement<PutCommitteeMeetingResponseType> createPutCommitteeMeetingResponse(PutCommitteeMeetingResponseType value) {
        return new JAXBElement<PutCommitteeMeetingResponseType>(_PutCommitteeMeetingResponse_QNAME, PutCommitteeMeetingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationReferencesRootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_References")
    public JAXBElement<OrganizationReferencesRootType> createOrganizationReferences(OrganizationReferencesRootType value) {
        return new JAXBElement<OrganizationReferencesRootType>(_OrganizationReferences_QNAME, OrganizationReferencesRootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEthnicitiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Ethnicities_Request")
    public JAXBElement<GetEthnicitiesRequestType> createGetEthnicitiesRequest(GetEthnicitiesRequestType value) {
        return new JAXBElement<GetEthnicitiesRequestType>(_GetEthnicitiesRequest_QNAME, GetEthnicitiesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeImageGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Image_Get")
    public JAXBElement<EmployeeImageGetType> createEmployeeImageGet(EmployeeImageGetType value) {
        return new JAXBElement<EmployeeImageGetType>(_EmployeeImageGet_QNAME, EmployeeImageGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobProfilesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Profiles_Response")
    public JAXBElement<GetJobProfilesResponseType> createGetJobProfilesResponse(GetJobProfilesResponseType value) {
        return new JAXBElement<GetJobProfilesResponseType>(_GetJobProfilesResponse_QNAME, GetJobProfilesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFrequenciesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Frequencies_Response")
    public JAXBElement<GetFrequenciesResponseType> createGetFrequenciesResponse(GetFrequenciesResponseType value) {
        return new JAXBElement<GetFrequenciesResponseType>(_GetFrequenciesResponse_QNAME, GetFrequenciesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkersCompensationCodesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workers_Compensation_Codes_Request")
    public JAXBElement<GetWorkersCompensationCodesRequestType> createGetWorkersCompensationCodesRequest(GetWorkersCompensationCodesRequestType value) {
        return new JAXBElement<GetWorkersCompensationCodesRequestType>(_GetWorkersCompensationCodesRequest_QNAME, GetWorkersCompensationCodesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerContractInfoGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Contract_Info_Get")
    public JAXBElement<ContingentWorkerContractInfoGetType> createContingentWorkerContractInfoGet(ContingentWorkerContractInfoGetType value) {
        return new JAXBElement<ContingentWorkerContractInfoGetType>(_ContingentWorkerContractInfoGet_QNAME, ContingentWorkerContractInfoGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainContactInformationForPersonEventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Maintain_Contact_Information_for_Person_Event_Response")
    public JAXBElement<MaintainContactInformationForPersonEventResponseType> createMaintainContactInformationForPersonEventResponse(MaintainContactInformationForPersonEventResponseType value) {
        return new JAXBElement<MaintainContactInformationForPersonEventResponseType>(_MaintainContactInformationForPersonEventResponse_QNAME, MaintainContactInformationForPersonEventResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkScheduleCalendarResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Schedule_Calendar_Response")
    public JAXBElement<PutWorkScheduleCalendarResponseType> createPutWorkScheduleCalendarResponse(PutWorkScheduleCalendarResponseType value) {
        return new JAXBElement<PutWorkScheduleCalendarResponseType>(_PutWorkScheduleCalendarResponse_QNAME, PutWorkScheduleCalendarResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeMeetingsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Meetings_Request")
    public JAXBElement<GetCommitteeMeetingsRequestType> createGetCommitteeMeetingsRequest(GetCommitteeMeetingsRequestType value) {
        return new JAXBElement<GetCommitteeMeetingsRequestType>(_GetCommitteeMeetingsRequest_QNAME, GetCommitteeMeetingsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWorkSpaceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Work_Space_Response")
    public JAXBElement<ChangeWorkSpaceResponseType> createChangeWorkSpaceResponse(ChangeWorkSpaceResponseType value) {
        return new JAXBElement<ChangeWorkSpaceResponseType>(_ChangeWorkSpaceResponse_QNAME, ChangeWorkSpaceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkdayCommonHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Workday_Common_Header")
    public JAXBElement<WorkdayCommonHeaderType> createWorkdayCommonHeader(WorkdayCommonHeaderType value) {
        return new JAXBElement<WorkdayCommonHeaderType>(_WorkdayCommonHeader_QNAME, WorkdayCommonHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutHolidayCalendarResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Holiday_Calendar_Response")
    public JAXBElement<PutHolidayCalendarResponseType> createPutHolidayCalendarResponse(PutHolidayCalendarResponseType value) {
        return new JAXBElement<PutHolidayCalendarResponseType>(_PutHolidayCalendarResponse_QNAME, PutHolidayCalendarResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLGBTIdentificationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_LGBT_Identifications_Response")
    public JAXBElement<GetLGBTIdentificationsResponseType> createGetLGBTIdentificationsResponse(GetLGBTIdentificationsResponseType value) {
        return new JAXBElement<GetLGBTIdentificationsResponseType>(_GetLGBTIdentificationsResponse_QNAME, GetLGBTIdentificationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeMeetingRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Meeting_Request")
    public JAXBElement<PutCommitteeMeetingRequestType> createPutCommitteeMeetingRequest(PutCommitteeMeetingRequestType value) {
        return new JAXBElement<PutCommitteeMeetingRequestType>(_PutCommitteeMeetingRequest_QNAME, PutCommitteeMeetingRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSexualOrientationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Sexual_Orientations_Response")
    public JAXBElement<GetSexualOrientationsResponseType> createGetSexualOrientationsResponse(GetSexualOrientationsResponseType value) {
        return new JAXBElement<GetSexualOrientationsResponseType>(_GetSexualOrientationsResponse_QNAME, GetSexualOrientationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignEmployeeCollectiveAgreementEventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Employee_Collective_Agreement_Event_Response")
    public JAXBElement<AssignEmployeeCollectiveAgreementEventResponseType> createAssignEmployeeCollectiveAgreementEventResponse(AssignEmployeeCollectiveAgreementEventResponseType value) {
        return new JAXBElement<AssignEmployeeCollectiveAgreementEventResponseType>(_AssignEmployeeCollectiveAgreementEventResponse_QNAME, AssignEmployeeCollectiveAgreementEventResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutServiceCenterRepresentativeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Service_Center_Representative_Response")
    public JAXBElement<PutServiceCenterRepresentativeResponseType> createPutServiceCenterRepresentativeResponse(PutServiceCenterRepresentativeResponseType value) {
        return new JAXBElement<PutServiceCenterRepresentativeResponseType>(_PutServiceCenterRepresentativeResponse_QNAME, PutServiceCenterRepresentativeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerTimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Server_Timestamp")
    public JAXBElement<ServerTimestampType> createServerTimestamp(ServerTimestampType value) {
        return new JAXBElement<ServerTimestampType>(_ServerTimestamp_QNAME, ServerTimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassportsAndVisasResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Passports_and_Visas_Response")
    public JAXBElement<ChangePassportsAndVisasResponseType> createChangePassportsAndVisasResponse(ChangePassportsAndVisasResponseType value) {
        return new JAXBElement<ChangePassportsAndVisasResponseType>(_ChangePassportsAndVisasResponse_QNAME, ChangePassportsAndVisasResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker")
    public JAXBElement<ContingentWorkerType> createContingentWorker(ContingentWorkerType value) {
        return new JAXBElement<ContingentWorkerType>(_ContingentWorker_QNAME, ContingentWorkerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactivateOrganizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Reactivate_Organization_Response")
    public JAXBElement<ReactivateOrganizationResponseType> createReactivateOrganizationResponse(ReactivateOrganizationResponseType value) {
        return new JAXBElement<ReactivateOrganizationResponseType>(_ReactivateOrganizationResponse_QNAME, ReactivateOrganizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicAppointeeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Appointee_Request")
    public JAXBElement<GetAcademicAppointeeRequestType> createGetAcademicAppointeeRequest(GetAcademicAppointeeRequestType value) {
        return new JAXBElement<GetAcademicAppointeeRequestType>(_GetAcademicAppointeeRequest_QNAME, GetAcademicAppointeeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutProvisioningGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Provisioning_Group_Request")
    public JAXBElement<PutProvisioningGroupRequestType> createPutProvisioningGroupRequest(PutProvisioningGroupRequestType value) {
        return new JAXBElement<PutProvisioningGroupRequestType>(_PutProvisioningGroupRequest_QNAME, PutProvisioningGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeDefinitionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Definition_Request")
    public JAXBElement<GetCommitteeDefinitionRequestType> createGetCommitteeDefinitionRequest(GetCommitteeDefinitionRequestType value) {
        return new JAXBElement<GetCommitteeDefinitionRequestType>(_GetCommitteeDefinitionRequest_QNAME, GetCommitteeDefinitionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPoliticalAffiliationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Political_Affiliation_Request")
    public JAXBElement<PutPoliticalAffiliationRequestType> createPutPoliticalAffiliationRequest(PutPoliticalAffiliationRequestType value) {
        return new JAXBElement<PutPoliticalAffiliationRequestType>(_PutPoliticalAffiliationRequest_QNAME, PutPoliticalAffiliationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstablishmentsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Establishments_Request")
    public JAXBElement<GetEstablishmentsRequestType> createGetEstablishmentsRequest(GetEstablishmentsRequestType value) {
        return new JAXBElement<GetEstablishmentsRequestType>(_GetEstablishmentsRequest_QNAME, GetEstablishmentsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerProfileGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Worker_Profile_Get")
    public JAXBElement<WorkerProfileGetType> createWorkerProfileGet(WorkerProfileGetType value) {
        return new JAXBElement<WorkerProfileGetType>(_WorkerProfileGet_QNAME, WorkerProfileGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkdayAccountForWorkerUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Workday_Account_for_Worker_Update")
    public JAXBElement<WorkdayAccountForWorkerUpdateType> createWorkdayAccountForWorkerUpdate(WorkdayAccountForWorkerUpdateType value) {
        return new JAXBElement<WorkdayAccountForWorkerUpdateType>(_WorkdayAccountForWorkerUpdate_QNAME, WorkdayAccountForWorkerUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLGBTIdentificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_LGBT_Identification_Response")
    public JAXBElement<PutLGBTIdentificationResponseType> createPutLGBTIdentificationResponse(PutLGBTIdentificationResponseType value) {
        return new JAXBElement<PutLGBTIdentificationResponseType>(_PutLGBTIdentificationResponse_QNAME, PutLGBTIdentificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkersResponseRootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workers_Response")
    public JAXBElement<GetWorkersResponseRootType> createGetWorkersResponse(GetWorkersResponseRootType value) {
        return new JAXBElement<GetWorkersResponseRootType>(_GetWorkersResponse_QNAME, GetWorkersResponseRootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEmergencyContactsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Emergency_Contacts_Request")
    public JAXBElement<ChangeEmergencyContactsRequestType> createChangeEmergencyContactsRequest(ChangeEmergencyContactsRequestType value) {
        return new JAXBElement<ChangeEmergencyContactsRequestType>(_ChangeEmergencyContactsRequest_QNAME, ChangeEmergencyContactsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPreviousSystemJobHistoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Previous_System_Job_History_Request")
    public JAXBElement<PutPreviousSystemJobHistoryRequestType> createPutPreviousSystemJobHistoryRequest(PutPreviousSystemJobHistoryRequestType value) {
        return new JAXBElement<PutPreviousSystemJobHistoryRequestType>(_PutPreviousSystemJobHistoryRequest_QNAME, PutPreviousSystemJobHistoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFrequencyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Frequency_Response")
    public JAXBElement<PutFrequencyResponseType> createPutFrequencyResponse(PutFrequencyResponseType value) {
        return new JAXBElement<PutFrequencyResponseType>(_PutFrequencyResponse_QNAME, PutFrequencyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationReferenceRootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Reference")
    public JAXBElement<OrganizationReferenceRootType> createOrganizationReference(OrganizationReferenceRootType value) {
        return new JAXBElement<OrganizationReferenceRootType>(_OrganizationReference_QNAME, OrganizationReferenceRootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndCollectiveAgreementAssignmentEventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "End_Collective_Agreement_Assignment_Event_Response")
    public JAXBElement<EndCollectiveAgreementAssignmentEventResponseType> createEndCollectiveAgreementAssignmentEventResponse(EndCollectiveAgreementAssignmentEventResponseType value) {
        return new JAXBElement<EndCollectiveAgreementAssignmentEventResponseType>(_EndCollectiveAgreementAssignmentEventResponse_QNAME, EndCollectiveAgreementAssignmentEventResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenderIdentitiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Gender_Identities_Response")
    public JAXBElement<GetGenderIdentitiesResponseType> createGetGenderIdentitiesResponse(GetGenderIdentitiesResponseType value) {
        return new JAXBElement<GetGenderIdentitiesResponseType>(_GetGenderIdentitiesResponse_QNAME, GetGenderIdentitiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPeriodReportingCalendarResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Period_Reporting_Calendar_Response")
    public JAXBElement<PutPeriodReportingCalendarResponseType> createPutPeriodReportingCalendarResponse(PutPeriodReportingCalendarResponseType value) {
        return new JAXBElement<PutPeriodReportingCalendarResponseType>(_PutPeriodReportingCalendarResponse_QNAME, PutPeriodReportingCalendarResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPronounsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Pronouns_Response")
    public JAXBElement<GetPronounsResponseType> createGetPronounsResponse(GetPronounsResponseType value) {
        return new JAXBElement<GetPronounsResponseType>(_GetPronounsResponse_QNAME, GetPronounsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeWorkContactInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Work_Contact_Information_Response")
    public JAXBElement<GetChangeWorkContactInformationResponseType> createGetChangeWorkContactInformationResponse(GetChangeWorkContactInformationResponseType value) {
        return new JAXBElement<GetChangeWorkContactInformationResponseType>(_GetChangeWorkContactInformationResponse_QNAME, GetChangeWorkContactInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDifficultyToFillRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Difficulty_to_Fill_Request")
    public JAXBElement<PutDifficultyToFillRequestType> createPutDifficultyToFillRequest(PutDifficultyToFillRequestType value) {
        return new JAXBElement<PutDifficultyToFillRequestType>(_PutDifficultyToFillRequest_QNAME, PutDifficultyToFillRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Locations_Response")
    public JAXBElement<GetLocationsResponseType> createGetLocationsResponse(GetLocationsResponseType value) {
        return new JAXBElement<GetLocationsResponseType>(_GetLocationsResponse_QNAME, GetLocationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobClassificationGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Classification_Group_Request")
    public JAXBElement<PutJobClassificationGroupRequestType> createPutJobClassificationGroupRequest(PutJobClassificationGroupRequestType value) {
        return new JAXBElement<PutJobClassificationGroupRequestType>(_PutJobClassificationGroupRequest_QNAME, PutJobClassificationGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationAttributeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Attribute_Request")
    public JAXBElement<PutLocationAttributeRequestType> createPutLocationAttributeRequest(PutLocationAttributeRequestType value) {
        return new JAXBElement<PutLocationAttributeRequestType>(_PutLocationAttributeRequest_QNAME, PutLocationAttributeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeClassificationGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Classification_Group_Response")
    public JAXBElement<PutCommitteeClassificationGroupResponseType> createPutCommitteeClassificationGroupResponse(PutCommitteeClassificationGroupResponseType value) {
        return new JAXBElement<PutCommitteeClassificationGroupResponseType>(_PutCommitteeClassificationGroupResponse_QNAME, PutCommitteeClassificationGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFrequencyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Frequency_Request")
    public JAXBElement<PutFrequencyRequestType> createPutFrequencyRequest(PutFrequencyRequestType value) {
        return new JAXBElement<PutFrequencyRequestType>(_PutFrequencyRequest_QNAME, PutFrequencyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkerPhotoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Worker_Photo_Response")
    public JAXBElement<PutWorkerPhotoResponseType> createPutWorkerPhotoResponse(PutWorkerPhotoResponseType value) {
        return new JAXBElement<PutWorkerPhotoResponseType>(_PutWorkerPhotoResponse_QNAME, PutWorkerPhotoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeGovernmentIDsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Government_IDs_Response")
    public JAXBElement<ChangeGovernmentIDsResponseType> createChangeGovernmentIDsResponse(ChangeGovernmentIDsResponseType value) {
        return new JAXBElement<ChangeGovernmentIDsResponseType>(_ChangeGovernmentIDsResponse_QNAME, ChangeGovernmentIDsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentSpecialtiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Appointment_Specialties_Response")
    public JAXBElement<GetAppointmentSpecialtiesResponseType> createGetAppointmentSpecialtiesResponse(GetAppointmentSpecialtiesResponseType value) {
        return new JAXBElement<GetAppointmentSpecialtiesResponseType>(_GetAppointmentSpecialtiesResponse_QNAME, GetAppointmentSpecialtiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkersCompensationCodeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Workers_Compensation_Code_Response")
    public JAXBElement<PutWorkersCompensationCodeResponseType> createPutWorkersCompensationCodeResponse(PutWorkersCompensationCodeResponseType value) {
        return new JAXBElement<PutWorkersCompensationCodeResponseType>(_PutWorkersCompensationCodeResponse_QNAME, PutWorkersCompensationCodeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeGovernmentIDsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Government_IDs_Request")
    public JAXBElement<GetChangeGovernmentIDsRequestType> createGetChangeGovernmentIDsRequest(GetChangeGovernmentIDsRequestType value) {
        return new JAXBElement<GetChangeGovernmentIDsRequestType>(_GetChangeGovernmentIDsRequest_QNAME, GetChangeGovernmentIDsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReassignSuperiorToInactiveOrganizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Reassign_Superior_to_Inactive_Organization_Response")
    public JAXBElement<ReassignSuperiorToInactiveOrganizationResponseType> createReassignSuperiorToInactiveOrganizationResponse(ReassignSuperiorToInactiveOrganizationResponseType value) {
        return new JAXBElement<ReassignSuperiorToInactiveOrganizationResponseType>(_ReassignSuperiorToInactiveOrganizationResponse_QNAME, ReassignSuperiorToInactiveOrganizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobClassificationGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Classification_Groups_Response")
    public JAXBElement<GetJobClassificationGroupsResponseType> createGetJobClassificationGroupsResponse(GetJobClassificationGroupsResponseType value) {
        return new JAXBElement<GetJobClassificationGroupsResponseType>(_GetJobClassificationGroupsResponse_QNAME, GetJobClassificationGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWorkContactInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Work_Contact_Information_Request")
    public JAXBElement<ChangeWorkContactInformationRequestType> createChangeWorkContactInformationRequest(ChangeWorkContactInformationRequestType value) {
        return new JAXBElement<ChangeWorkContactInformationRequestType>(_ChangeWorkContactInformationRequest_QNAME, ChangeWorkContactInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicRankResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Rank_Response")
    public JAXBElement<PutAcademicRankResponseType> createPutAcademicRankResponse(PutAcademicRankResponseType value) {
        return new JAXBElement<PutAcademicRankResponseType>(_PutAcademicRankResponse_QNAME, PutAcademicRankResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeClassificationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Classifications_Request")
    public JAXBElement<GetCommitteeClassificationsRequestType> createGetCommitteeClassificationsRequest(GetCommitteeClassificationsRequestType value) {
        return new JAXBElement<GetCommitteeClassificationsRequestType>(_GetCommitteeClassificationsRequest_QNAME, GetCommitteeClassificationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSexualOrientationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Sexual_Orientation_Response")
    public JAXBElement<PutSexualOrientationResponseType> createPutSexualOrientationResponse(PutSexualOrientationResponseType value) {
        return new JAXBElement<PutSexualOrientationResponseType>(_PutSexualOrientationResponse_QNAME, PutSexualOrientationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeGovernmentIDsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Government_IDs_Response")
    public JAXBElement<GetChangeGovernmentIDsResponseType> createGetChangeGovernmentIDsResponse(GetChangeGovernmentIDsResponseType value) {
        return new JAXBElement<GetChangeGovernmentIDsResponseType>(_GetChangeGovernmentIDsResponse_QNAME, GetChangeGovernmentIDsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Get")
    public JAXBElement<ContingentWorkerGetType> createContingentWorkerGet(ContingentWorkerGetType value) {
        return new JAXBElement<ContingentWorkerGetType>(_ContingentWorkerGet_QNAME, ContingentWorkerGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDifficultyToFillResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Difficulty_to_Fill_Response")
    public JAXBElement<GetDifficultyToFillResponseType> createGetDifficultyToFillResponse(GetDifficultyToFillResponseType value) {
        return new JAXBElement<GetDifficultyToFillResponseType>(_GetDifficultyToFillResponse_QNAME, GetDifficultyToFillResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicUnitResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Unit_Response")
    public JAXBElement<PutAcademicUnitResponseType> createPutAcademicUnitResponse(PutAcademicUnitResponseType value) {
        return new JAXBElement<PutAcademicUnitResponseType>(_PutAcademicUnitResponse_QNAME, PutAcademicUnitResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormerWorkerDocumentsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Former_Worker_Documents_Request")
    public JAXBElement<GetFormerWorkerDocumentsRequestType> createGetFormerWorkerDocumentsRequest(GetFormerWorkerDocumentsRequestType value) {
        return new JAXBElement<GetFormerWorkerDocumentsRequestType>(_GetFormerWorkerDocumentsRequest_QNAME, GetFormerWorkerDocumentsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrainingTypesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Training_Types_Request")
    public JAXBElement<GetTrainingTypesRequestType> createGetTrainingTypesRequest(GetTrainingTypesRequestType value) {
        return new JAXBElement<GetTrainingTypesRequestType>(_GetTrainingTypesRequest_QNAME, GetTrainingTypesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutOrganizationAssignmentRestrictionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Organization_Assignment_Restrictions_Request")
    public JAXBElement<PutOrganizationAssignmentRestrictionsRequestType> createPutOrganizationAssignmentRestrictionsRequest(PutOrganizationAssignmentRestrictionsRequestType value) {
        return new JAXBElement<PutOrganizationAssignmentRestrictionsRequestType>(_PutOrganizationAssignmentRestrictionsRequest_QNAME, PutOrganizationAssignmentRestrictionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSiteFindType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Business_Site_Find")
    public JAXBElement<BusinessSiteFindType> createBusinessSiteFind(BusinessSiteFindType value) {
        return new JAXBElement<BusinessSiteFindType>(_BusinessSiteFind_QNAME, BusinessSiteFindType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndCollectiveAgreementAssignmentEventRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "End_Collective_Agreement_Assignment_Event_Request")
    public JAXBElement<EndCollectiveAgreementAssignmentEventRequestType> createEndCollectiveAgreementAssignmentEventRequest(EndCollectiveAgreementAssignmentEventRequestType value) {
        return new JAXBElement<EndCollectiveAgreementAssignmentEventRequestType>(_EndCollectiveAgreementAssignmentEventRequest_QNAME, EndCollectiveAgreementAssignmentEventRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeHomeContactInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Home_Contact_Information_Response")
    public JAXBElement<ChangeHomeContactInformationResponseType> createChangeHomeContactInformationResponse(ChangeHomeContactInformationResponseType value) {
        return new JAXBElement<ChangeHomeContactInformationResponseType>(_ChangeHomeContactInformationResponse_QNAME, ChangeHomeContactInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee")
    public JAXBElement<EmployeeType> createEmployee(EmployeeType value) {
        return new JAXBElement<EmployeeType>(_Employee_QNAME, EmployeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageUnionMembershipResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Union_Membership_Response")
    public JAXBElement<ManageUnionMembershipResponseType> createManageUnionMembershipResponse(ManageUnionMembershipResponseType value) {
        return new JAXBElement<ManageUnionMembershipResponseType>(_ManageUnionMembershipResponse_QNAME, ManageUnionMembershipResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerPhotosResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Worker_Photos_Response")
    public JAXBElement<GetWorkerPhotosResponseType> createGetWorkerPhotosResponse(GetWorkerPhotosResponseType value) {
        return new JAXBElement<GetWorkerPhotosResponseType>(_GetWorkerPhotosResponse_QNAME, GetWorkerPhotosResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPoliticalAffiliationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Political_Affiliations_Request")
    public JAXBElement<GetPoliticalAffiliationsRequestType> createGetPoliticalAffiliationsRequest(GetPoliticalAffiliationsRequestType value) {
        return new JAXBElement<GetPoliticalAffiliationsRequestType>(_GetPoliticalAffiliationsRequest_QNAME, GetPoliticalAffiliationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFormerWorkerDocumentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Former_Worker_Document_Response")
    public JAXBElement<PutFormerWorkerDocumentResponseType> createPutFormerWorkerDocumentResponse(PutFormerWorkerDocumentResponseType value) {
        return new JAXBElement<PutFormerWorkerDocumentResponseType>(_PutFormerWorkerDocumentResponse_QNAME, PutFormerWorkerDocumentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationHierarchyOrganizationAssignmentsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Hierarchy_Organization_Assignments_Request")
    public JAXBElement<PutLocationHierarchyOrganizationAssignmentsRequestType> createPutLocationHierarchyOrganizationAssignmentsRequest(PutLocationHierarchyOrganizationAssignmentsRequestType value) {
        return new JAXBElement<PutLocationHierarchyOrganizationAssignmentsRequestType>(_PutLocationHierarchyOrganizationAssignmentsRequest_QNAME, PutLocationHierarchyOrganizationAssignmentsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicUnitHierarchiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Unit_Hierarchies_Response")
    public JAXBElement<GetAcademicUnitHierarchiesResponseType> createGetAcademicUnitHierarchiesResponse(GetAcademicUnitHierarchiesResponseType value) {
        return new JAXBElement<GetAcademicUnitHierarchiesResponseType>(_GetAcademicUnitHierarchiesResponse_QNAME, GetAcademicUnitHierarchiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeDefinitionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Definition_Response")
    public JAXBElement<GetCommitteeDefinitionResponseType> createGetCommitteeDefinitionResponse(GetCommitteeDefinitionResponseType value) {
        return new JAXBElement<GetCommitteeDefinitionResponseType>(_GetCommitteeDefinitionResponse_QNAME, GetCommitteeDefinitionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePersonalInfoUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Personal_Info_Update")
    public JAXBElement<EmployeePersonalInfoUpdateType> createEmployeePersonalInfoUpdate(EmployeePersonalInfoUpdateType value) {
        return new JAXBElement<EmployeePersonalInfoUpdateType>(_EmployeePersonalInfoUpdate_QNAME, EmployeePersonalInfoUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationReferenceIDsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organization_Reference_IDs_Response")
    public JAXBElement<GetOrganizationReferenceIDsResponseType> createGetOrganizationReferenceIDsResponse(GetOrganizationReferenceIDsResponseType value) {
        return new JAXBElement<GetOrganizationReferenceIDsResponseType>(_GetOrganizationReferenceIDsResponse_QNAME, GetOrganizationReferenceIDsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisioningGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Provisioning_Groups_Response")
    public JAXBElement<ProvisioningGroupsResponseType> createProvisioningGroupsResponse(ProvisioningGroupsResponseType value) {
        return new JAXBElement<ProvisioningGroupsResponseType>(_ProvisioningGroupsResponse_QNAME, ProvisioningGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicAppointmentTrackAdditionalDataRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Appointment_Track_Additional_Data_Request")
    public JAXBElement<GetAcademicAppointmentTrackAdditionalDataRequestType> createGetAcademicAppointmentTrackAdditionalDataRequest(GetAcademicAppointmentTrackAdditionalDataRequestType value) {
        return new JAXBElement<GetAcademicAppointmentTrackAdditionalDataRequestType>(_GetAcademicAppointmentTrackAdditionalDataRequest_QNAME, GetAcademicAppointmentTrackAdditionalDataRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationAddUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Add_Update")
    public JAXBElement<OrganizationAddUpdateType> createOrganizationAddUpdate(OrganizationAddUpdateType value) {
        return new JAXBElement<OrganizationAddUpdateType>(_OrganizationAddUpdate_QNAME, OrganizationAddUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutOrganizationReferenceIDRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Organization_Reference_ID_Request")
    public JAXBElement<PutOrganizationReferenceIDRequestType> createPutOrganizationReferenceIDRequest(PutOrganizationReferenceIDRequestType value) {
        return new JAXBElement<PutOrganizationReferenceIDRequestType>(_PutOrganizationReferenceIDRequest_QNAME, PutOrganizationReferenceIDRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferredCommunicationLanguageResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Preferred_Communication_Language_Response")
    public JAXBElement<GetPreferredCommunicationLanguageResponseType> createGetPreferredCommunicationLanguageResponse(GetPreferredCommunicationLanguageResponseType value) {
        return new JAXBElement<GetPreferredCommunicationLanguageResponseType>(_GetPreferredCommunicationLanguageResponse_QNAME, GetPreferredCommunicationLanguageResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeEmploymentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Employment_Info")
    public JAXBElement<EmployeeEmploymentInfoType> createEmployeeEmploymentInfo(EmployeeEmploymentInfoType value) {
        return new JAXBElement<EmployeeEmploymentInfoType>(_EmployeeEmploymentInfo_QNAME, EmployeeEmploymentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutExternalDisabilitySelfIdentificationRecordResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_External_Disability_Self_Identification_Record_Response")
    public JAXBElement<PutExternalDisabilitySelfIdentificationRecordResponseType> createPutExternalDisabilitySelfIdentificationRecordResponse(PutExternalDisabilitySelfIdentificationRecordResponseType value) {
        return new JAXBElement<PutExternalDisabilitySelfIdentificationRecordResponseType>(_PutExternalDisabilitySelfIdentificationRecordResponse_QNAME, PutExternalDisabilitySelfIdentificationRecordResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDifficultyToFillRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Difficulty_to_Fill_Request")
    public JAXBElement<GetDifficultyToFillRequestType> createGetDifficultyToFillRequest(GetDifficultyToFillRequestType value) {
        return new JAXBElement<GetDifficultyToFillRequestType>(_GetDifficultyToFillRequest_QNAME, GetDifficultyToFillRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutServiceCenterRepresentativeWorkdayAccountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Service_Center_Representative_Workday_Account_Request")
    public JAXBElement<PutServiceCenterRepresentativeWorkdayAccountRequestType> createPutServiceCenterRepresentativeWorkdayAccountRequest(PutServiceCenterRepresentativeWorkdayAccountRequestType value) {
        return new JAXBElement<PutServiceCenterRepresentativeWorkdayAccountRequestType>(_PutServiceCenterRepresentativeWorkdayAccountRequest_QNAME, PutServiceCenterRepresentativeWorkdayAccountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobCategoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Category_Request")
    public JAXBElement<PutJobCategoryRequestType> createPutJobCategoryRequest(PutJobCategoryRequestType value) {
        return new JAXBElement<PutJobCategoryRequestType>(_PutJobCategoryRequest_QNAME, PutJobCategoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSearchSettingsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Search_Settings_Response")
    public JAXBElement<PutSearchSettingsResponseType> createPutSearchSettingsResponse(PutSearchSettingsResponseType value) {
        return new JAXBElement<PutSearchSettingsResponseType>(_PutSearchSettingsResponse_QNAME, PutSearchSettingsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutServiceCenterRepresentativeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Service_Center_Representative_Request")
    public JAXBElement<PutServiceCenterRepresentativeRequestType> createPutServiceCenterRepresentativeRequest(PutServiceCenterRepresentativeRequestType value) {
        return new JAXBElement<PutServiceCenterRepresentativeRequestType>(_PutServiceCenterRepresentativeRequest_QNAME, PutServiceCenterRepresentativeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Locations_Request")
    public JAXBElement<GetLocationsRequestType> createGetLocationsRequest(GetLocationsRequestType value) {
        return new JAXBElement<GetLocationsRequestType>(_GetLocationsRequest_QNAME, GetLocationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAssignUserBasedSecurityGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Assign_User-Based_Security_Groups_Response")
    public JAXBElement<PutAssignUserBasedSecurityGroupsResponseType> createPutAssignUserBasedSecurityGroupsResponse(PutAssignUserBasedSecurityGroupsResponseType value) {
        return new JAXBElement<PutAssignUserBasedSecurityGroupsResponseType>(_PutAssignUserBasedSecurityGroupsResponse_QNAME, PutAssignUserBasedSecurityGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalDisabilitySelfIdentificationRecordsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_External_Disability_Self_Identification_Records_Request")
    public JAXBElement<GetExternalDisabilitySelfIdentificationRecordsRequestType> createGetExternalDisabilitySelfIdentificationRecordsRequest(GetExternalDisabilitySelfIdentificationRecordsRequestType value) {
        return new JAXBElement<GetExternalDisabilitySelfIdentificationRecordsRequestType>(_GetExternalDisabilitySelfIdentificationRecordsRequest_QNAME, GetExternalDisabilitySelfIdentificationRecordsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutProvisioningGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Provisioning_Group_Response")
    public JAXBElement<PutProvisioningGroupResponseType> createPutProvisioningGroupResponse(PutProvisioningGroupResponseType value) {
        return new JAXBElement<PutProvisioningGroupResponseType>(_PutProvisioningGroupResponse_QNAME, PutProvisioningGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutOrganizationReferenceIDResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Organization_Reference_ID_Response")
    public JAXBElement<PutOrganizationReferenceIDResponseType> createPutOrganizationReferenceIDResponse(PutOrganizationReferenceIDResponseType value) {
        return new JAXBElement<PutOrganizationReferenceIDResponseType>(_PutOrganizationReferenceIDResponse_QNAME, PutOrganizationReferenceIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSiteGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Business_Site_Get")
    public JAXBElement<BusinessSiteGetType> createBusinessSiteGet(BusinessSiteGetType value) {
        return new JAXBElement<BusinessSiteGetType>(_BusinessSiteGet_QNAME, BusinessSiteGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicUnitRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Unit_Request")
    public JAXBElement<PutAcademicUnitRequestType> createPutAcademicUnitRequest(PutAcademicUnitRequestType value) {
        return new JAXBElement<PutAcademicUnitRequestType>(_PutAcademicUnitRequest_QNAME, PutAcademicUnitRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutHolidayCalendarRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Holiday_Calendar_Request")
    public JAXBElement<PutHolidayCalendarRequestType> createPutHolidayCalendarRequest(PutHolidayCalendarRequestType value) {
        return new JAXBElement<PutHolidayCalendarRequestType>(_PutHolidayCalendarRequest_QNAME, PutHolidayCalendarRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Request")
    public JAXBElement<PutLocationRequestType> createPutLocationRequest(PutLocationRequestType value) {
        return new JAXBElement<PutLocationRequestType>(_PutLocationRequest_QNAME, PutLocationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Processing_Fault")
    public JAXBElement<ProcessingFaultType> createProcessingFault(ProcessingFaultType value) {
        return new JAXBElement<ProcessingFaultType>(_ProcessingFault_QNAME, ProcessingFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAppointmentSpecialtyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Appointment_Specialty_Response")
    public JAXBElement<PutAppointmentSpecialtyResponseType> createPutAppointmentSpecialtyResponse(PutAppointmentSpecialtyResponseType value) {
        return new JAXBElement<PutAppointmentSpecialtyResponseType>(_PutAppointmentSpecialtyResponse_QNAME, PutAppointmentSpecialtyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyInsiderTypesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Company_Insider_Types_Response")
    public JAXBElement<GetCompanyInsiderTypesResponseType> createGetCompanyInsiderTypesResponse(GetCompanyInsiderTypesResponseType value) {
        return new JAXBElement<GetCompanyInsiderTypesResponseType>(_GetCompanyInsiderTypesResponse_QNAME, GetCompanyInsiderTypesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicUnitHierarchyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Unit_Hierarchy_Request")
    public JAXBElement<PutAcademicUnitHierarchyRequestType> createPutAcademicUnitHierarchyRequest(PutAcademicUnitHierarchyRequestType value) {
        return new JAXBElement<PutAcademicUnitHierarchyRequestType>(_PutAcademicUnitHierarchyRequest_QNAME, PutAcademicUnitHierarchyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEmergencyContactsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Emergency_Contacts_Response")
    public JAXBElement<ChangeEmergencyContactsResponseType> createChangeEmergencyContactsResponse(ChangeEmergencyContactsResponseType value) {
        return new JAXBElement<ChangeEmergencyContactsResponseType>(_ChangeEmergencyContactsResponse_QNAME, ChangeEmergencyContactsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkStatusRuleSetRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Status_Rule_Set_Request")
    public JAXBElement<PutWorkStatusRuleSetRequestType> createPutWorkStatusRuleSetRequest(PutWorkStatusRuleSetRequestType value) {
        return new JAXBElement<PutWorkStatusRuleSetRequestType>(_PutWorkStatusRuleSetRequest_QNAME, PutWorkStatusRuleSetRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNamedProfessorshipRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Create_Named_Professorship_Request")
    public JAXBElement<CreateNamedProfessorshipRequestType> createCreateNamedProfessorshipRequest(CreateNamedProfessorshipRequestType value) {
        return new JAXBElement<CreateNamedProfessorshipRequestType>(_CreateNamedProfessorshipRequest_QNAME, CreateNamedProfessorshipRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobFamilyGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Family_Groups_Request")
    public JAXBElement<GetJobFamilyGroupsRequestType> createGetJobFamilyGroupsRequest(GetJobFamilyGroupsRequestType value) {
        return new JAXBElement<GetJobFamilyGroupsRequestType>(_GetJobFamilyGroupsRequest_QNAME, GetJobFamilyGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutExternalDisabilitySelfIdentificationRecordRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_External_Disability_Self_Identification_Record_Request")
    public JAXBElement<PutExternalDisabilitySelfIdentificationRecordRequestType> createPutExternalDisabilitySelfIdentificationRecordRequest(PutExternalDisabilitySelfIdentificationRecordRequestType value) {
        return new JAXBElement<PutExternalDisabilitySelfIdentificationRecordRequestType>(_PutExternalDisabilitySelfIdentificationRecordRequest_QNAME, PutExternalDisabilitySelfIdentificationRecordRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAcademicRankRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Academic_Rank_Request")
    public JAXBElement<PutAcademicRankRequestType> createPutAcademicRankRequest(PutAcademicRankRequestType value) {
        return new JAXBElement<PutAcademicRankRequestType>(_PutAcademicRankRequest_QNAME, PutAcademicRankRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeClassificationGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Classification_Groups_Response")
    public JAXBElement<GetCommitteeClassificationGroupsResponseType> createGetCommitteeClassificationGroupsResponse(GetCommitteeClassificationGroupsResponseType value) {
        return new JAXBElement<GetCommitteeClassificationGroupsResponseType>(_GetCommitteeClassificationGroupsResponse_QNAME, GetCommitteeClassificationGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBusinessTitleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Business_Title_Response")
    public JAXBElement<ChangeBusinessTitleResponseType> createChangeBusinessTitleResponse(ChangeBusinessTitleResponseType value) {
        return new JAXBElement<ChangeBusinessTitleResponseType>(_ChangeBusinessTitleResponse_QNAME, ChangeBusinessTitleResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSocialBenefitsLocalityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Social_Benefits_Locality_Response")
    public JAXBElement<PutSocialBenefitsLocalityResponseType> createPutSocialBenefitsLocalityResponse(PutSocialBenefitsLocalityResponseType value) {
        return new JAXBElement<PutSocialBenefitsLocalityResponseType>(_PutSocialBenefitsLocalityResponse_QNAME, PutSocialBenefitsLocalityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreviousSystemJobHistoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Previous_System_Job_History_Request")
    public JAXBElement<GetPreviousSystemJobHistoryRequestType> createGetPreviousSystemJobHistoryRequest(GetPreviousSystemJobHistoryRequestType value) {
        return new JAXBElement<GetPreviousSystemJobHistoryRequestType>(_GetPreviousSystemJobHistoryRequest_QNAME, GetPreviousSystemJobHistoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerContractInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Contract_Info")
    public JAXBElement<ContingentWorkerContractInfoType> createContingentWorkerContractInfo(ContingentWorkerContractInfoType value) {
        return new JAXBElement<ContingentWorkerContractInfoType>(_ContingentWorkerContractInfo_QNAME, ContingentWorkerContractInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicAppointmentTrackAdditionalDataResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Appointment_Track_Additional_Data_Response")
    public JAXBElement<GetAcademicAppointmentTrackAdditionalDataResponseType> createGetAcademicAppointmentTrackAdditionalDataResponse(GetAcademicAppointmentTrackAdditionalDataResponseType value) {
        return new JAXBElement<GetAcademicAppointmentTrackAdditionalDataResponseType>(_GetAcademicAppointmentTrackAdditionalDataResponse_QNAME, GetAcademicAppointmentTrackAdditionalDataResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkersCompensationCodeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Workers_Compensation_Code_Request")
    public JAXBElement<PutWorkersCompensationCodeRequestType> createPutWorkersCompensationCodeRequest(PutWorkersCompensationCodeRequestType value) {
        return new JAXBElement<PutWorkersCompensationCodeRequestType>(_PutWorkersCompensationCodeRequest_QNAME, PutWorkersCompensationCodeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePersonalInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Personal_Information_Response")
    public JAXBElement<ChangePersonalInformationResponseType> createChangePersonalInformationResponse(ChangePersonalInformationResponseType value) {
        return new JAXBElement<ChangePersonalInformationResponseType>(_ChangePersonalInformationResponse_QNAME, ChangePersonalInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeHomeContactInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Home_Contact_Information_Request")
    public JAXBElement<GetChangeHomeContactInformationRequestType> createGetChangeHomeContactInformationRequest(GetChangeHomeContactInformationRequestType value) {
        return new JAXBElement<GetChangeHomeContactInformationRequestType>(_GetChangeHomeContactInformationRequest_QNAME, GetChangeHomeContactInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDependentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Dependent_Request")
    public JAXBElement<PutDependentRequestType> createPutDependentRequest(PutDependentRequestType value) {
        return new JAXBElement<PutDependentRequestType>(_PutDependentRequest_QNAME, PutDependentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFormerWorkerDocumentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Former_Worker_Document_Request")
    public JAXBElement<PutFormerWorkerDocumentRequestType> createPutFormerWorkerDocumentRequest(PutFormerWorkerDocumentRequestType value) {
        return new JAXBElement<PutFormerWorkerDocumentRequestType>(_PutFormerWorkerDocumentRequest_QNAME, PutFormerWorkerDocumentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCompanyInsiderTypeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Company_Insider_Type_Request")
    public JAXBElement<PutCompanyInsiderTypeRequestType> createPutCompanyInsiderTypeRequest(PutCompanyInsiderTypeRequestType value) {
        return new JAXBElement<PutCompanyInsiderTypeRequestType>(_PutCompanyInsiderTypeRequest_QNAME, PutCompanyInsiderTypeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreferredCommunicationLanguageRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Preferred_Communication_Language_Request")
    public JAXBElement<GetPreferredCommunicationLanguageRequestType> createGetPreferredCommunicationLanguageRequest(GetPreferredCommunicationLanguageRequestType value) {
        return new JAXBElement<GetPreferredCommunicationLanguageRequestType>(_GetPreferredCommunicationLanguageRequest_QNAME, GetPreferredCommunicationLanguageRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkersCompensationCodesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workers_Compensation_Codes_Response")
    public JAXBElement<GetWorkersCompensationCodesResponseType> createGetWorkersCompensationCodesResponse(GetWorkersCompensationCodesResponseType value) {
        return new JAXBElement<GetWorkersCompensationCodesResponseType>(_GetWorkersCompensationCodesResponse_QNAME, GetWorkersCompensationCodesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicUnitsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Units_Request")
    public JAXBElement<GetAcademicUnitsRequestType> createGetAcademicUnitsRequest(GetAcademicUnitsRequestType value) {
        return new JAXBElement<GetAcademicUnitsRequestType>(_GetAcademicUnitsRequest_QNAME, GetAcademicUnitsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeClassificationGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Classification_Group_Request")
    public JAXBElement<PutCommitteeClassificationGroupRequestType> createPutCommitteeClassificationGroupRequest(PutCommitteeClassificationGroupRequestType value) {
        return new JAXBElement<PutCommitteeClassificationGroupRequestType>(_PutCommitteeClassificationGroupRequest_QNAME, PutCommitteeClassificationGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLGBTIdentificationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_LGBT_Identifications_Request")
    public JAXBElement<GetLGBTIdentificationsRequestType> createGetLGBTIdentificationsRequest(GetLGBTIdentificationsRequestType value) {
        return new JAXBElement<GetLGBTIdentificationsRequestType>(_GetLGBTIdentificationsRequest_QNAME, GetLGBTIdentificationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReferenceLetterForWorkerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Create_Reference_Letter_for_Worker_Response")
    public JAXBElement<CreateReferenceLetterForWorkerResponseType> createCreateReferenceLetterForWorkerResponse(CreateReferenceLetterForWorkerResponseType value) {
        return new JAXBElement<CreateReferenceLetterForWorkerResponseType>(_CreateReferenceLetterForWorkerResponse_QNAME, CreateReferenceLetterForWorkerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkShiftResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Shift_Response")
    public JAXBElement<PutWorkShiftResponseType> createPutWorkShiftResponse(PutWorkShiftResponseType value) {
        return new JAXBElement<PutWorkShiftResponseType>(_PutWorkShiftResponse_QNAME, PutWorkShiftResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutEstablishmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Establishment_Request")
    public JAXBElement<PutEstablishmentRequestType> createPutEstablishmentRequest(PutEstablishmentRequestType value) {
        return new JAXBElement<PutEstablishmentRequestType>(_PutEstablishmentRequest_QNAME, PutEstablishmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organizations_Response")
    public JAXBElement<GetOrganizationsResponseType> createGetOrganizationsResponse(GetOrganizationsResponseType value) {
        return new JAXBElement<GetOrganizationsResponseType>(_GetOrganizationsResponse_QNAME, GetOrganizationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignEmployeeCollectiveAgreementEventRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Employee_Collective_Agreement_Event_Request")
    public JAXBElement<AssignEmployeeCollectiveAgreementEventRequestType> createAssignEmployeeCollectiveAgreementEventRequest(AssignEmployeeCollectiveAgreementEventRequestType value) {
        return new JAXBElement<AssignEmployeeCollectiveAgreementEventRequestType>(_AssignEmployeeCollectiveAgreementEventRequest_QNAME, AssignEmployeeCollectiveAgreementEventRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPreferredCommunicationLanguageRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Preferred_Communication_Language_Request")
    public JAXBElement<PutPreferredCommunicationLanguageRequestType> createPutPreferredCommunicationLanguageRequest(PutPreferredCommunicationLanguageRequestType value) {
        return new JAXBElement<PutPreferredCommunicationLanguageRequestType>(_PutPreferredCommunicationLanguageRequest_QNAME, PutPreferredCommunicationLanguageRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageEmployeeProbationPeriodsEventRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Employee_Probation_Periods_Event_Request")
    public JAXBElement<ManageEmployeeProbationPeriodsEventRequestType> createManageEmployeeProbationPeriodsEventRequest(ManageEmployeeProbationPeriodsEventRequestType value) {
        return new JAXBElement<ManageEmployeeProbationPeriodsEventRequestType>(_ManageEmployeeProbationPeriodsEventRequest_QNAME, ManageEmployeeProbationPeriodsEventRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageUnionMembershipRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Union_Membership_Request")
    public JAXBElement<ManageUnionMembershipRequestType> createManageUnionMembershipRequest(ManageUnionMembershipRequestType value) {
        return new JAXBElement<ManageUnionMembershipRequestType>(_ManageUnionMembershipRequest_QNAME, ManageUnionMembershipRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeClassificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Classification_Request")
    public JAXBElement<PutCommitteeClassificationRequestType> createPutCommitteeClassificationRequest(PutCommitteeClassificationRequestType value) {
        return new JAXBElement<PutCommitteeClassificationRequestType>(_PutCommitteeClassificationRequest_QNAME, PutCommitteeClassificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkShiftsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Shifts_Request")
    public JAXBElement<GetWorkShiftsRequestType> createGetWorkShiftsRequest(GetWorkShiftsRequestType value) {
        return new JAXBElement<GetWorkShiftsRequestType>(_GetWorkShiftsRequest_QNAME, GetWorkShiftsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNamedProfessorshipResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Create_Named_Professorship_Response")
    public JAXBElement<CreateNamedProfessorshipResponseType> createCreateNamedProfessorshipResponse(CreateNamedProfessorshipResponseType value) {
        return new JAXBElement<CreateNamedProfessorshipResponseType>(_CreateNamedProfessorshipResponse_QNAME, CreateNamedProfessorshipResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAdditionalNamesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Additional_Names_Response")
    public JAXBElement<ChangeAdditionalNamesResponseType> createChangeAdditionalNamesResponse(ChangeAdditionalNamesResponseType value) {
        return new JAXBElement<ChangeAdditionalNamesResponseType>(_ChangeAdditionalNamesResponse_QNAME, ChangeAdditionalNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeTypeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Type_Response")
    public JAXBElement<PutCommitteeTypeResponseType> createPutCommitteeTypeResponse(PutCommitteeTypeResponseType value) {
        return new JAXBElement<PutCommitteeTypeResponseType>(_PutCommitteeTypeResponse_QNAME, PutCommitteeTypeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisioningGroupAssignmentsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Provisioning_Group_Assignments_Response")
    public JAXBElement<ProvisioningGroupAssignmentsResponseType> createProvisioningGroupAssignmentsResponse(ProvisioningGroupAssignmentsResponseType value) {
        return new JAXBElement<ProvisioningGroupAssignmentsResponseType>(_ProvisioningGroupAssignmentsResponse_QNAME, ProvisioningGroupAssignmentsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodReportingCalendarsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Period_Reporting_Calendars_Response")
    public JAXBElement<GetPeriodReportingCalendarsResponseType> createGetPeriodReportingCalendarsResponse(GetPeriodReportingCalendarsResponseType value) {
        return new JAXBElement<GetPeriodReportingCalendarsResponseType>(_GetPeriodReportingCalendarsResponse_QNAME, GetPeriodReportingCalendarsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPronounsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Pronouns_Request")
    public JAXBElement<GetPronounsRequestType> createGetPronounsRequest(GetPronounsRequestType value) {
        return new JAXBElement<GetPronounsRequestType>(_GetPronounsRequest_QNAME, GetPronounsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicRanksRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Ranks_Request")
    public JAXBElement<GetAcademicRanksRequestType> createGetAcademicRanksRequest(GetAcademicRanksRequestType value) {
        return new JAXBElement<GetAcademicRanksRequestType>(_GetAcademicRanksRequest_QNAME, GetAcademicRanksRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeMembershipTypeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Membership_Type_Request")
    public JAXBElement<PutCommitteeMembershipTypeRequestType> createPutCommitteeMembershipTypeRequest(PutCommitteeMembershipTypeRequestType value) {
        return new JAXBElement<PutCommitteeMembershipTypeRequestType>(_PutCommitteeMembershipTypeRequest_QNAME, PutCommitteeMembershipTypeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutGenderIdentityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Gender_Identity_Request")
    public JAXBElement<PutGenderIdentityRequestType> createPutGenderIdentityRequest(PutGenderIdentityRequestType value) {
        return new JAXBElement<PutGenderIdentityRequestType>(_PutGenderIdentityRequest_QNAME, PutGenderIdentityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchSettingsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Search_Settings_Response")
    public JAXBElement<GetSearchSettingsResponseType> createGetSearchSettingsResponse(GetSearchSettingsResponseType value) {
        return new JAXBElement<GetSearchSettingsResponseType>(_GetSearchSettingsResponse_QNAME, GetSearchSettingsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationInactivateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Inactivate")
    public JAXBElement<OrganizationInactivateType> createOrganizationInactivate(OrganizationInactivateType value) {
        return new JAXBElement<OrganizationInactivateType>(_OrganizationInactivate_QNAME, OrganizationInactivateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFormerWorkerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Former_Worker_Response")
    public JAXBElement<PutFormerWorkerResponseType> createPutFormerWorkerResponse(PutFormerWorkerResponseType value) {
        return new JAXBElement<PutFormerWorkerResponseType>(_PutFormerWorkerResponse_QNAME, PutFormerWorkerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutTrainingTypeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Training_Type_Response")
    public JAXBElement<PutTrainingTypeResponseType> createPutTrainingTypeResponse(PutTrainingTypeResponseType value) {
        return new JAXBElement<PutTrainingTypeResponseType>(_PutTrainingTypeResponse_QNAME, PutTrainingTypeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAssignUserBasedSecurityGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Assign_User-Based_Security_Group_Response")
    public JAXBElement<PutAssignUserBasedSecurityGroupResponseType> createPutAssignUserBasedSecurityGroupResponse(PutAssignUserBasedSecurityGroupResponseType value) {
        return new JAXBElement<PutAssignUserBasedSecurityGroupResponseType>(_PutAssignUserBasedSecurityGroupResponse_QNAME, PutAssignUserBasedSecurityGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerPersonalInfoUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Personal_Info_Update")
    public JAXBElement<ContingentWorkerPersonalInfoUpdateType> createContingentWorkerPersonalInfoUpdate(ContingentWorkerPersonalInfoUpdateType value) {
        return new JAXBElement<ContingentWorkerPersonalInfoUpdateType>(_ContingentWorkerPersonalInfoUpdate_QNAME, ContingentWorkerPersonalInfoUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPoliticalAffiliationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Political_Affiliations_Response")
    public JAXBElement<GetPoliticalAffiliationsResponseType> createGetPoliticalAffiliationsResponse(GetPoliticalAffiliationsResponseType value) {
        return new JAXBElement<GetPoliticalAffiliationsResponseType>(_GetPoliticalAffiliationsResponse_QNAME, GetPoliticalAffiliationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLegalNameResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Legal_Name_Response")
    public JAXBElement<ChangeLegalNameResponseType> createChangeLegalNameResponse(ChangeLegalNameResponseType value) {
        return new JAXBElement<ChangeLegalNameResponseType>(_ChangeLegalNameResponse_QNAME, ChangeLegalNameResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLicensesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Licenses_Request")
    public JAXBElement<ChangeLicensesRequestType> createChangeLicensesRequest(ChangeLicensesRequestType value) {
        return new JAXBElement<ChangeLicensesRequestType>(_ChangeLicensesRequest_QNAME, ChangeLicensesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerEventHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Worker_Event_History")
    public JAXBElement<WorkerEventHistoryType> createWorkerEventHistory(WorkerEventHistoryType value) {
        return new JAXBElement<WorkerEventHistoryType>(_WorkerEventHistory_QNAME, WorkerEventHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationHierarchyOrganizationAssignmentsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Location_Hierarchy_Organization_Assignments_Request")
    public JAXBElement<GetLocationHierarchyOrganizationAssignmentsRequestType> createGetLocationHierarchyOrganizationAssignmentsRequest(GetLocationHierarchyOrganizationAssignmentsRequestType value) {
        return new JAXBElement<GetLocationHierarchyOrganizationAssignmentsRequestType>(_GetLocationHierarchyOrganizationAssignmentsRequest_QNAME, GetLocationHierarchyOrganizationAssignmentsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAdditionalNamesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Additional_Names_Request")
    public JAXBElement<ChangeAdditionalNamesRequestType> createChangeAdditionalNamesRequest(ChangeAdditionalNamesRequestType value) {
        return new JAXBElement<ChangeAdditionalNamesRequestType>(_ChangeAdditionalNamesRequest_QNAME, ChangeAdditionalNamesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreviousSystemJobHistoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Previous_System_Job_History_Response")
    public JAXBElement<GetPreviousSystemJobHistoryResponseType> createGetPreviousSystemJobHistoryResponse(GetPreviousSystemJobHistoryResponseType value) {
        return new JAXBElement<GetPreviousSystemJobHistoryResponseType>(_GetPreviousSystemJobHistoryResponse_QNAME, GetPreviousSystemJobHistoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAddressesForCountryFormatExtensionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Addresses_for_Country_Format_Extension_Response")
    public JAXBElement<PutAddressesForCountryFormatExtensionResponseType> createPutAddressesForCountryFormatExtensionResponse(PutAddressesForCountryFormatExtensionResponseType value) {
        return new JAXBElement<PutAddressesForCountryFormatExtensionResponseType>(_PutAddressesForCountryFormatExtensionResponse_QNAME, PutAddressesForCountryFormatExtensionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobFamilyGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Family_Group_Response")
    public JAXBElement<PutJobFamilyGroupResponseType> createPutJobFamilyGroupResponse(PutJobFamilyGroupResponseType value) {
        return new JAXBElement<PutJobFamilyGroupResponseType>(_PutJobFamilyGroupResponse_QNAME, PutJobFamilyGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvisioningGroupAssignmentsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Provisioning_Group_Assignments_Request")
    public JAXBElement<GetProvisioningGroupAssignmentsRequestType> createGetProvisioningGroupAssignmentsRequest(GetProvisioningGroupAssignmentsRequestType value) {
        return new JAXBElement<GetProvisioningGroupAssignmentsRequestType>(_GetProvisioningGroupAssignmentsRequest_QNAME, GetProvisioningGroupAssignmentsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactivateOrganizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Reactivate_Organization_Request")
    public JAXBElement<ReactivateOrganizationRequestType> createReactivateOrganizationRequest(ReactivateOrganizationRequestType value) {
        return new JAXBElement<ReactivateOrganizationRequestType>(_ReactivateOrganizationRequest_QNAME, ReactivateOrganizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenderIdentitiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Gender_Identities_Request")
    public JAXBElement<GetGenderIdentitiesRequestType> createGetGenderIdentitiesRequest(GetGenderIdentitiesRequestType value) {
        return new JAXBElement<GetGenderIdentitiesRequestType>(_GetGenderIdentitiesRequest_QNAME, GetGenderIdentitiesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCompanyInsiderTypeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Company_Insider_Type_Response")
    public JAXBElement<PutCompanyInsiderTypeResponseType> createPutCompanyInsiderTypeResponse(PutCompanyInsiderTypeResponseType value) {
        return new JAXBElement<PutCompanyInsiderTypeResponseType>(_PutCompanyInsiderTypeResponse_QNAME, PutCompanyInsiderTypeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSearchSettingsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Search_Settings_Request")
    public JAXBElement<PutSearchSettingsRequestType> createPutSearchSettingsRequest(PutSearchSettingsRequestType value) {
        return new JAXBElement<PutSearchSettingsRequestType>(_PutSearchSettingsRequest_QNAME, PutSearchSettingsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBackgroundCheckStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Background_Check_Status_Response")
    public JAXBElement<ChangeBackgroundCheckStatusResponseType> createChangeBackgroundCheckStatusResponse(ChangeBackgroundCheckStatusResponseType value) {
        return new JAXBElement<ChangeBackgroundCheckStatusResponseType>(_ChangeBackgroundCheckStatusResponse_QNAME, ChangeBackgroundCheckStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobFamilyGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Family_Group_Request")
    public JAXBElement<PutJobFamilyGroupRequestType> createPutJobFamilyGroupRequest(PutJobFamilyGroupRequestType value) {
        return new JAXBElement<PutJobFamilyGroupRequestType>(_PutJobFamilyGroupRequest_QNAME, PutJobFamilyGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePersonalInfoGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Personal_Info_Get")
    public JAXBElement<EmployeePersonalInfoGetType> createEmployeePersonalInfoGet(EmployeePersonalInfoGetType value) {
        return new JAXBElement<EmployeePersonalInfoGetType>(_EmployeePersonalInfoGet_QNAME, EmployeePersonalInfoGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBackgroundCheckStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Background_Check_Status_Request")
    public JAXBElement<ChangeBackgroundCheckStatusRequestType> createChangeBackgroundCheckStatusRequest(ChangeBackgroundCheckStatusRequestType value) {
        return new JAXBElement<ChangeBackgroundCheckStatusRequestType>(_ChangeBackgroundCheckStatusRequest_QNAME, ChangeBackgroundCheckStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeVeteranStatusIdentificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Veteran_Status_Identification_Response")
    public JAXBElement<ChangeVeteranStatusIdentificationResponseType> createChangeVeteranStatusIdentificationResponse(ChangeVeteranStatusIdentificationResponseType value) {
        return new JAXBElement<ChangeVeteranStatusIdentificationResponseType>(_ChangeVeteranStatusIdentificationResponse_QNAME, ChangeVeteranStatusIdentificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationAttributesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Location_Attributes_Request")
    public JAXBElement<GetLocationAttributesRequestType> createGetLocationAttributesRequest(GetLocationAttributesRequestType value) {
        return new JAXBElement<GetLocationAttributesRequestType>(_GetLocationAttributesRequest_QNAME, GetLocationAttributesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeHomeContactInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Home_Contact_Information_Response")
    public JAXBElement<GetChangeHomeContactInformationResponseType> createGetChangeHomeContactInformationResponse(GetChangeHomeContactInformationResponseType value) {
        return new JAXBElement<GetChangeHomeContactInformationResponseType>(_GetChangeHomeContactInformationResponse_QNAME, GetChangeHomeContactInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassportsAndVisasRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Passports_and_Visas_Request")
    public JAXBElement<ChangePassportsAndVisasRequestType> createChangePassportsAndVisasRequest(ChangePassportsAndVisasRequestType value) {
        return new JAXBElement<ChangePassportsAndVisasRequestType>(_ChangePassportsAndVisasRequest_QNAME, ChangePassportsAndVisasRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcademicAppointmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Update_Academic_Appointment_Request")
    public JAXBElement<UpdateAcademicAppointmentRequestType> createUpdateAcademicAppointmentRequest(UpdateAcademicAppointmentRequestType value) {
        return new JAXBElement<UpdateAcademicAppointmentRequestType>(_UpdateAcademicAppointmentRequest_QNAME, UpdateAcademicAppointmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePersonalInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Personal_Information_Request")
    public JAXBElement<ChangePersonalInformationRequestType> createChangePersonalInformationRequest(ChangePersonalInformationRequestType value) {
        return new JAXBElement<ChangePersonalInformationRequestType>(_ChangePersonalInformationRequest_QNAME, ChangePersonalInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUniversalIdentifiersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Universal_Identifiers_Response")
    public JAXBElement<GetUniversalIdentifiersResponseType> createGetUniversalIdentifiersResponse(GetUniversalIdentifiersResponseType value) {
        return new JAXBElement<GetUniversalIdentifiersResponseType>(_GetUniversalIdentifiersResponse_QNAME, GetUniversalIdentifiersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeTypesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Types_Request")
    public JAXBElement<GetCommitteeTypesRequestType> createGetCommitteeTypesRequest(GetCommitteeTypesRequestType value) {
        return new JAXBElement<GetCommitteeTypesRequestType>(_GetCommitteeTypesRequest_QNAME, GetCommitteeTypesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobFamilyGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Family_Groups_Response")
    public JAXBElement<GetJobFamilyGroupsResponseType> createGetJobFamilyGroupsResponse(GetJobFamilyGroupsResponseType value) {
        return new JAXBElement<GetJobFamilyGroupsResponseType>(_GetJobFamilyGroupsResponse_QNAME, GetJobFamilyGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchSettingsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Search_Settings_Request")
    public JAXBElement<GetSearchSettingsRequestType> createGetSearchSettingsRequest(GetSearchSettingsRequestType value) {
        return new JAXBElement<GetSearchSettingsRequestType>(_GetSearchSettingsRequest_QNAME, GetSearchSettingsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkdayAccountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workday_Account_Response")
    public JAXBElement<GetWorkdayAccountResponseType> createGetWorkdayAccountResponse(GetWorkdayAccountResponseType value) {
        return new JAXBElement<GetWorkdayAccountResponseType>(_GetWorkdayAccountResponse_QNAME, GetWorkdayAccountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAcademicAppointmentTrackAdditionalDataResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Edit_Academic_Appointment_Track_Additional_Data_Response")
    public JAXBElement<EditAcademicAppointmentTrackAdditionalDataResponseType> createEditAcademicAppointmentTrackAdditionalDataResponse(EditAcademicAppointmentTrackAdditionalDataResponseType value) {
        return new JAXBElement<EditAcademicAppointmentTrackAdditionalDataResponseType>(_EditAcademicAppointmentTrackAdditionalDataResponse_QNAME, EditAcademicAppointmentTrackAdditionalDataResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrainingTypesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Training_Types_Response")
    public JAXBElement<GetTrainingTypesResponseType> createGetTrainingTypesResponse(GetTrainingTypesResponseType value) {
        return new JAXBElement<GetTrainingTypesResponseType>(_GetTrainingTypesResponse_QNAME, GetTrainingTypesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndAcademicAppointmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "End_Academic_Appointment_Request")
    public JAXBElement<EndAcademicAppointmentRequestType> createEndAcademicAppointmentRequest(EndAcademicAppointmentRequestType value) {
        return new JAXBElement<EndAcademicAppointmentRequestType>(_EndAcademicAppointmentRequest_QNAME, EndAcademicAppointmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeClassificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Classification_Response")
    public JAXBElement<PutCommitteeClassificationResponseType> createPutCommitteeClassificationResponse(PutCommitteeClassificationResponseType value) {
        return new JAXBElement<PutCommitteeClassificationResponseType>(_PutCommitteeClassificationResponse_QNAME, PutCommitteeClassificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCenterRepresentativesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Service_Center_Representatives_Request")
    public JAXBElement<GetServiceCenterRepresentativesRequestType> createGetServiceCenterRepresentativesRequest(GetServiceCenterRepresentativesRequestType value) {
        return new JAXBElement<GetServiceCenterRepresentativesRequestType>(_GetServiceCenterRepresentativesRequest_QNAME, GetServiceCenterRepresentativesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDisabilityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Disability_Response")
    public JAXBElement<PutDisabilityResponseType> createPutDisabilityResponse(PutDisabilityResponseType value) {
        return new JAXBElement<PutDisabilityResponseType>(_PutDisabilityResponse_QNAME, PutDisabilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignUserBasedSecurityGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Assign_User-Based_Security_Group_Request")
    public JAXBElement<GetAssignUserBasedSecurityGroupRequestType> createGetAssignUserBasedSecurityGroupRequest(GetAssignUserBasedSecurityGroupRequestType value) {
        return new JAXBElement<GetAssignUserBasedSecurityGroupRequestType>(_GetAssignUserBasedSecurityGroupRequest_QNAME, GetAssignUserBasedSecurityGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainCommitteeDefinitionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Maintain_Committee_Definition_Response")
    public JAXBElement<MaintainCommitteeDefinitionResponseType> createMaintainCommitteeDefinitionResponse(MaintainCommitteeDefinitionResponseType value) {
        return new JAXBElement<MaintainCommitteeDefinitionResponseType>(_MaintainCommitteeDefinitionResponse_QNAME, MaintainCommitteeDefinitionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHolidayCalendarsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Holiday_Calendars_Response")
    public JAXBElement<GetHolidayCalendarsResponseType> createGetHolidayCalendarsResponse(GetHolidayCalendarsResponseType value) {
        return new JAXBElement<GetHolidayCalendarsResponseType>(_GetHolidayCalendarsResponse_QNAME, GetHolidayCalendarsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Profile_Response")
    public JAXBElement<PutJobProfileResponseType> createPutJobProfileResponse(PutJobProfileResponseType value) {
        return new JAXBElement<PutJobProfileResponseType>(_PutJobProfileResponse_QNAME, PutJobProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRelatedPersonsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Related_Persons")
    public JAXBElement<EmployeeRelatedPersonsType> createEmployeeRelatedPersons(EmployeeRelatedPersonsType value) {
        return new JAXBElement<EmployeeRelatedPersonsType>(_EmployeeRelatedPersons_QNAME, EmployeeRelatedPersonsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAppointmentSpecialtyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Appointment_Specialty_Request")
    public JAXBElement<PutAppointmentSpecialtyRequestType> createPutAppointmentSpecialtyRequest(PutAppointmentSpecialtyRequestType value) {
        return new JAXBElement<PutAppointmentSpecialtyRequestType>(_PutAppointmentSpecialtyRequest_QNAME, PutAppointmentSpecialtyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportUniversalIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Import_Universal_Identifier_Request")
    public JAXBElement<ImportUniversalIdentifierRequestType> createImportUniversalIdentifierRequest(ImportUniversalIdentifierRequestType value) {
        return new JAXBElement<ImportUniversalIdentifierRequestType>(_ImportUniversalIdentifierRequest_QNAME, ImportUniversalIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodReportingCalendarsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Period_Reporting_Calendars_Request")
    public JAXBElement<GetPeriodReportingCalendarsRequestType> createGetPeriodReportingCalendarsRequest(GetPeriodReportingCalendarsRequestType value) {
        return new JAXBElement<GetPeriodReportingCalendarsRequestType>(_GetPeriodReportingCalendarsRequest_QNAME, GetPeriodReportingCalendarsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageEmployeeProbationPeriodsEventResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Manage_Employee_Probation_Periods_Event_Response")
    public JAXBElement<ManageEmployeeProbationPeriodsEventResponseType> createManageEmployeeProbationPeriodsEventResponse(ManageEmployeeProbationPeriodsEventResponseType value) {
        return new JAXBElement<ManageEmployeeProbationPeriodsEventResponseType>(_ManageEmployeeProbationPeriodsEventResponse_QNAME, ManageEmployeeProbationPeriodsEventResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkStatusRuleSetsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Status_Rule_Sets_Response")
    public JAXBElement<GetWorkStatusRuleSetsResponseType> createGetWorkStatusRuleSetsResponse(GetWorkStatusRuleSetsResponseType value) {
        return new JAXBElement<GetWorkStatusRuleSetsResponseType>(_GetWorkStatusRuleSetsResponse_QNAME, GetWorkStatusRuleSetsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyInsiderTypesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Company_Insider_Types_Request")
    public JAXBElement<GetCompanyInsiderTypesRequestType> createGetCompanyInsiderTypesRequest(GetCompanyInsiderTypesRequestType value) {
        return new JAXBElement<GetCompanyInsiderTypesRequestType>(_GetCompanyInsiderTypesRequest_QNAME, GetCompanyInsiderTypesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobCategoriesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Categories_Request")
    public JAXBElement<GetJobCategoriesRequestType> createGetJobCategoriesRequest(GetJobCategoriesRequestType value) {
        return new JAXBElement<GetJobCategoriesRequestType>(_GetJobCategoriesRequest_QNAME, GetJobCategoriesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPreviousSystemJobHistoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Previous_System_Job_History_Response")
    public JAXBElement<PutPreviousSystemJobHistoryResponseType> createPutPreviousSystemJobHistoryResponse(PutPreviousSystemJobHistoryResponseType value) {
        return new JAXBElement<PutPreviousSystemJobHistoryResponseType>(_PutPreviousSystemJobHistoryResponse_QNAME, PutPreviousSystemJobHistoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWorkSpaceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Work_Space_Request")
    public JAXBElement<ChangeWorkSpaceRequestType> createChangeWorkSpaceRequest(ChangeWorkSpaceRequestType value) {
        return new JAXBElement<ChangeWorkSpaceRequestType>(_ChangeWorkSpaceRequest_QNAME, ChangeWorkSpaceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLGBTIdentificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_LGBT_Identification_Request")
    public JAXBElement<PutLGBTIdentificationRequestType> createPutLGBTIdentificationRequest(PutLGBTIdentificationRequestType value) {
        return new JAXBElement<PutLGBTIdentificationRequestType>(_PutLGBTIdentificationRequest_QNAME, PutLGBTIdentificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAssignUserBasedSecurityGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Assign_User-Based_Security_Groups_Request")
    public JAXBElement<PutAssignUserBasedSecurityGroupsRequestType> createPutAssignUserBasedSecurityGroupsRequest(PutAssignUserBasedSecurityGroupsRequestType value) {
        return new JAXBElement<PutAssignUserBasedSecurityGroupsRequestType>(_PutAssignUserBasedSecurityGroupsRequest_QNAME, PutAssignUserBasedSecurityGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvisioningGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Provisioning_Groups_Request")
    public JAXBElement<GetProvisioningGroupsRequestType> createGetProvisioningGroupsRequest(GetProvisioningGroupsRequestType value) {
        return new JAXBElement<GetProvisioningGroupsRequestType>(_GetProvisioningGroupsRequest_QNAME, GetProvisioningGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditNamedProfessorshipRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Edit_Named_Professorship_Request")
    public JAXBElement<EditNamedProfessorshipRequestType> createEditNamedProfessorshipRequest(EditNamedProfessorshipRequestType value) {
        return new JAXBElement<EditNamedProfessorshipRequestType>(_EditNamedProfessorshipRequest_QNAME, EditNamedProfessorshipRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAcademicAppointmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Add_Academic_Appointment_Request")
    public JAXBElement<AddAcademicAppointmentRequestType> createAddAcademicAppointmentRequest(AddAcademicAppointmentRequestType value) {
        return new JAXBElement<AddAcademicAppointmentRequestType>(_AddAcademicAppointmentRequest_QNAME, AddAcademicAppointmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormerWorkersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Former_Workers_Request")
    public JAXBElement<GetFormerWorkersRequestType> createGetFormerWorkersRequest(GetFormerWorkersRequestType value) {
        return new JAXBElement<GetFormerWorkersRequestType>(_GetFormerWorkersRequest_QNAME, GetFormerWorkersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkShiftRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Shift_Request")
    public JAXBElement<PutWorkShiftRequestType> createPutWorkShiftRequest(PutWorkShiftRequestType value) {
        return new JAXBElement<PutWorkShiftRequestType>(_PutWorkShiftRequest_QNAME, PutWorkShiftRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationAttributesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Location_Attributes_Response")
    public JAXBElement<GetLocationAttributesResponseType> createGetLocationAttributesResponse(GetLocationAttributesResponseType value) {
        return new JAXBElement<GetLocationAttributesResponseType>(_GetLocationAttributesResponse_QNAME, GetLocationAttributesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationAssignmentRestrictionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organization_Assignment_Restrictions_Request")
    public JAXBElement<GetOrganizationAssignmentRestrictionsRequestType> createGetOrganizationAssignmentRestrictionsRequest(GetOrganizationAssignmentRestrictionsRequestType value) {
        return new JAXBElement<GetOrganizationAssignmentRestrictionsRequestType>(_GetOrganizationAssignmentRestrictionsRequest_QNAME, GetOrganizationAssignmentRestrictionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceCenterRepresentativeWorkdayAccountsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Service_Center_Representative_Workday_Accounts_Response")
    public JAXBElement<GetServiceCenterRepresentativeWorkdayAccountsResponseType> createGetServiceCenterRepresentativeWorkdayAccountsResponse(GetServiceCenterRepresentativeWorkdayAccountsResponseType value) {
        return new JAXBElement<GetServiceCenterRepresentativeWorkdayAccountsResponseType>(_GetServiceCenterRepresentativeWorkdayAccountsResponse_QNAME, GetServiceCenterRepresentativeWorkdayAccountsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEthnicitiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Ethnicities_Response")
    public JAXBElement<GetEthnicitiesResponseType> createGetEthnicitiesResponse(GetEthnicitiesResponseType value) {
        return new JAXBElement<GetEthnicitiesResponseType>(_GetEthnicitiesResponse_QNAME, GetEthnicitiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeTypesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Types_Response")
    public JAXBElement<GetCommitteeTypesResponseType> createGetCommitteeTypesResponse(GetCommitteeTypesResponseType value) {
        return new JAXBElement<GetCommitteeTypesResponseType>(_GetCommitteeTypesResponse_QNAME, GetCommitteeTypesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organizations_Request")
    public JAXBElement<GetOrganizationsRequestType> createGetOrganizationsRequest(GetOrganizationsRequestType value) {
        return new JAXBElement<GetOrganizationsRequestType>(_GetOrganizationsRequest_QNAME, GetOrganizationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutImportProcessResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Import_Process_Response")
    public JAXBElement<PutImportProcessResponseType> createPutImportProcessResponse(PutImportProcessResponseType value) {
        return new JAXBElement<PutImportProcessResponseType>(_PutImportProcessResponse_QNAME, PutImportProcessResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOtherIDsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Other_IDs_Request")
    public JAXBElement<ChangeOtherIDsRequestType> createChangeOtherIDsRequest(ChangeOtherIDsRequestType value) {
        return new JAXBElement<ChangeOtherIDsRequestType>(_ChangeOtherIDsRequest_QNAME, ChangeOtherIDsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDisabilityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Disability_Request")
    public JAXBElement<PutDisabilityRequestType> createPutDisabilityRequest(PutDisabilityRequestType value) {
        return new JAXBElement<PutDisabilityRequestType>(_PutDisabilityRequest_QNAME, PutDisabilityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignMembersToCustomOrganizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Members_to_Custom_Organization_Response")
    public JAXBElement<AssignMembersToCustomOrganizationResponseType> createAssignMembersToCustomOrganizationResponse(AssignMembersToCustomOrganizationResponseType value) {
        return new JAXBElement<AssignMembersToCustomOrganizationResponseType>(_AssignMembersToCustomOrganizationResponse_QNAME, AssignMembersToCustomOrganizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkStatusRuleSetResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Status_Rule_Set_Response")
    public JAXBElement<PutWorkStatusRuleSetResponseType> createPutWorkStatusRuleSetResponse(PutWorkStatusRuleSetResponseType value) {
        return new JAXBElement<PutWorkStatusRuleSetResponseType>(_PutWorkStatusRuleSetResponse_QNAME, PutWorkStatusRuleSetResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationAttributeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Attribute_Response")
    public JAXBElement<PutLocationAttributeResponseType> createPutLocationAttributeResponse(PutLocationAttributeResponseType value) {
        return new JAXBElement<PutLocationAttributeResponseType>(_PutLocationAttributeResponse_QNAME, PutLocationAttributeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicUnitsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Units_Response")
    public JAXBElement<GetAcademicUnitsResponseType> createGetAcademicUnitsResponse(GetAcademicUnitsResponseType value) {
        return new JAXBElement<GetAcademicUnitsResponseType>(_GetAcademicUnitsResponse_QNAME, GetAcademicUnitsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReferenceLetterForWorkerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Create_Reference_Letter_for_Worker_Request")
    public JAXBElement<CreateReferenceLetterForWorkerRequestType> createCreateReferenceLetterForWorkerRequest(CreateReferenceLetterForWorkerRequestType value) {
        return new JAXBElement<CreateReferenceLetterForWorkerRequestType>(_CreateReferenceLetterForWorkerRequest_QNAME, CreateReferenceLetterForWorkerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationReferenceIDsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organization_Reference_IDs_Request")
    public JAXBElement<GetOrganizationReferenceIDsRequestType> createGetOrganizationReferenceIDsRequest(GetOrganizationReferenceIDsRequestType value) {
        return new JAXBElement<GetOrganizationReferenceIDsRequestType>(_GetOrganizationReferenceIDsRequest_QNAME, GetOrganizationReferenceIDsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutUniversalIdentifierResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Universal_Identifier_Response")
    public JAXBElement<PutUniversalIdentifierResponseType> createPutUniversalIdentifierResponse(PutUniversalIdentifierResponseType value) {
        return new JAXBElement<PutUniversalIdentifierResponseType>(_PutUniversalIdentifierResponse_QNAME, PutUniversalIdentifierResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationAssignmentRestrictionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Organization_Assignment_Restrictions_Response")
    public JAXBElement<GetOrganizationAssignmentRestrictionsResponseType> createGetOrganizationAssignmentRestrictionsResponse(GetOrganizationAssignmentRestrictionsResponseType value) {
        return new JAXBElement<GetOrganizationAssignmentRestrictionsResponseType>(_GetOrganizationAssignmentRestrictionsResponse_QNAME, GetOrganizationAssignmentRestrictionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainContactInformationForPersonEventRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Maintain_Contact_Information_for_Person_Event_Request")
    public JAXBElement<MaintainContactInformationForPersonEventRequestType> createMaintainContactInformationForPersonEventRequest(MaintainContactInformationForPersonEventRequestType value) {
        return new JAXBElement<MaintainContactInformationForPersonEventRequestType>(_MaintainContactInformationForPersonEventRequest_QNAME, MaintainContactInformationForPersonEventRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutPeriodReportingCalendarRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Period_Reporting_Calendar_Request")
    public JAXBElement<PutPeriodReportingCalendarRequestType> createPutPeriodReportingCalendarRequest(PutPeriodReportingCalendarRequestType value) {
        return new JAXBElement<PutPeriodReportingCalendarRequestType>(_PutPeriodReportingCalendarRequest_QNAME, PutPeriodReportingCalendarRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobFamiliesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Families_Response")
    public JAXBElement<GetJobFamiliesResponseType> createGetJobFamiliesResponse(GetJobFamiliesResponseType value) {
        return new JAXBElement<GetJobFamiliesResponseType>(_GetJobFamiliesResponse_QNAME, GetJobFamiliesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePreferredNameResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Preferred_Name_Response")
    public JAXBElement<ChangePreferredNameResponseType> createChangePreferredNameResponse(ChangePreferredNameResponseType value) {
        return new JAXBElement<ChangePreferredNameResponseType>(_ChangePreferredNameResponse_QNAME, ChangePreferredNameResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRelatedPersonsGetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Related_Persons_Get")
    public JAXBElement<EmployeeRelatedPersonsGetType> createEmployeeRelatedPersonsGet(EmployeeRelatedPersonsGetType value) {
        return new JAXBElement<EmployeeRelatedPersonsGetType>(_EmployeeRelatedPersonsGet_QNAME, EmployeeRelatedPersonsGetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAssignUserBasedSecurityGroupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Assign_User-Based_Security_Group_Request")
    public JAXBElement<PutAssignUserBasedSecurityGroupRequestType> createPutAssignUserBasedSecurityGroupRequest(PutAssignUserBasedSecurityGroupRequestType value) {
        return new JAXBElement<PutAssignUserBasedSecurityGroupRequestType>(_PutAssignUserBasedSecurityGroupRequest_QNAME, PutAssignUserBasedSecurityGroupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLegalNameRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Legal_Name_Request")
    public JAXBElement<ChangeLegalNameRequestType> createChangeLegalNameRequest(ChangeLegalNameRequestType value) {
        return new JAXBElement<ChangeLegalNameRequestType>(_ChangeLegalNameRequest_QNAME, ChangeLegalNameRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSocialBenefitsLocalitiesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Social_Benefits_Localities_Response")
    public JAXBElement<GetSocialBenefitsLocalitiesResponseType> createGetSocialBenefitsLocalitiesResponse(GetSocialBenefitsLocalitiesResponseType value) {
        return new JAXBElement<GetSocialBenefitsLocalitiesResponseType>(_GetSocialBenefitsLocalitiesResponse_QNAME, GetSocialBenefitsLocalitiesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstablishmentsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Establishments_Response")
    public JAXBElement<GetEstablishmentsResponseType> createGetEstablishmentsResponse(GetEstablishmentsResponseType value) {
        return new JAXBElement<GetEstablishmentsResponseType>(_GetEstablishmentsResponse_QNAME, GetEstablishmentsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationHierarchyOrganizationAssignmentsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Location_Hierarchy_Organization_Assignments_Response")
    public JAXBElement<GetLocationHierarchyOrganizationAssignmentsResponseType> createGetLocationHierarchyOrganizationAssignmentsResponse(GetLocationHierarchyOrganizationAssignmentsResponseType value) {
        return new JAXBElement<GetLocationHierarchyOrganizationAssignmentsResponseType>(_GetLocationHierarchyOrganizationAssignmentsResponse_QNAME, GetLocationHierarchyOrganizationAssignmentsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeClassificationGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Classification_Groups_Request")
    public JAXBElement<GetCommitteeClassificationGroupsRequestType> createGetCommitteeClassificationGroupsRequest(GetCommitteeClassificationGroupsRequestType value) {
        return new JAXBElement<GetCommitteeClassificationGroupsRequestType>(_GetCommitteeClassificationGroupsRequest_QNAME, GetCommitteeClassificationGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeHomeContactInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Home_Contact_Information_Request")
    public JAXBElement<ChangeHomeContactInformationRequestType> createChangeHomeContactInformationRequest(ChangeHomeContactInformationRequestType value) {
        return new JAXBElement<ChangeHomeContactInformationRequestType>(_ChangeHomeContactInformationRequest_QNAME, ChangeHomeContactInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkerPhotosRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Worker_Photos_Request")
    public JAXBElement<GetWorkerPhotosRequestType> createGetWorkerPhotosRequest(GetWorkerPhotosRequestType value) {
        return new JAXBElement<GetWorkerPhotosRequestType>(_GetWorkerPhotosRequest_QNAME, GetWorkerPhotosRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormerWorkersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Former_Workers_Response")
    public JAXBElement<GetFormerWorkersResponseType> createGetFormerWorkersResponse(GetFormerWorkersResponseType value) {
        return new JAXBElement<GetFormerWorkersResponseType>(_GetFormerWorkersResponse_QNAME, GetFormerWorkersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalDisabilitySelfIdentificationRecordsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_External_Disability_Self_Identification_Records_Response")
    public JAXBElement<GetExternalDisabilitySelfIdentificationRecordsResponseType> createGetExternalDisabilitySelfIdentificationRecordsResponse(GetExternalDisabilitySelfIdentificationRecordsResponseType value) {
        return new JAXBElement<GetExternalDisabilitySelfIdentificationRecordsResponseType>(_GetExternalDisabilitySelfIdentificationRecordsResponse_QNAME, GetExternalDisabilitySelfIdentificationRecordsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutSocialBenefitsLocalityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Social_Benefits_Locality_Request")
    public JAXBElement<PutSocialBenefitsLocalityRequestType> createPutSocialBenefitsLocalityRequest(PutSocialBenefitsLocalityRequestType value) {
        return new JAXBElement<PutSocialBenefitsLocalityRequestType>(_PutSocialBenefitsLocalityRequest_QNAME, PutSocialBenefitsLocalityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkdayAccountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Workday_Account_Request")
    public JAXBElement<GetWorkdayAccountRequestType> createGetWorkdayAccountRequest(GetWorkdayAccountRequestType value) {
        return new JAXBElement<GetWorkdayAccountRequestType>(_GetWorkdayAccountRequest_QNAME, GetWorkdayAccountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcademicAppointeeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Academic_Appointee_Response")
    public JAXBElement<GetAcademicAppointeeResponseType> createGetAcademicAppointeeResponse(GetAcademicAppointeeResponseType value) {
        return new JAXBElement<GetAcademicAppointeeResponseType>(_GetAcademicAppointeeResponse_QNAME, GetAcademicAppointeeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainCommitteeDefinitionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Maintain_Committee_Definition_Request")
    public JAXBElement<MaintainCommitteeDefinitionRequestType> createMaintainCommitteeDefinitionRequest(MaintainCommitteeDefinitionRequestType value) {
        return new JAXBElement<MaintainCommitteeDefinitionRequestType>(_MaintainCommitteeDefinitionRequest_QNAME, MaintainCommitteeDefinitionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignEstablishmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Assign_Establishment_Request")
    public JAXBElement<AssignEstablishmentRequestType> createAssignEstablishmentRequest(AssignEstablishmentRequestType value) {
        return new JAXBElement<AssignEstablishmentRequestType>(_AssignEstablishmentRequest_QNAME, AssignEstablishmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkScheduleCalendarsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Schedule_Calendars_Request")
    public JAXBElement<GetWorkScheduleCalendarsRequestType> createGetWorkScheduleCalendarsRequest(GetWorkScheduleCalendarsRequestType value) {
        return new JAXBElement<GetWorkScheduleCalendarsRequestType>(_GetWorkScheduleCalendarsRequest_QNAME, GetWorkScheduleCalendarsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutEthnicityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Ethnicity_Request")
    public JAXBElement<PutEthnicityRequestType> createPutEthnicityRequest(PutEthnicityRequestType value) {
        return new JAXBElement<PutEthnicityRequestType>(_PutEthnicityRequest_QNAME, PutEthnicityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutFormerWorkerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Former_Worker_Request")
    public JAXBElement<PutFormerWorkerRequestType> createPutFormerWorkerRequest(PutFormerWorkerRequestType value) {
        return new JAXBElement<PutFormerWorkerRequestType>(_PutFormerWorkerRequest_QNAME, PutFormerWorkerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContingentWorkerPersonalInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Contingent_Worker_Personal_Info")
    public JAXBElement<ContingentWorkerPersonalInfoType> createContingentWorkerPersonalInfo(ContingentWorkerPersonalInfoType value) {
        return new JAXBElement<ContingentWorkerPersonalInfoType>(_ContingentWorkerPersonalInfo_QNAME, ContingentWorkerPersonalInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Validation_Fault")
    public JAXBElement<ValidationFaultType> createValidationFault(ValidationFaultType value) {
        return new JAXBElement<ValidationFaultType>(_ValidationFault_QNAME, ValidationFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeMembershipTypeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Membership_Type_Response")
    public JAXBElement<PutCommitteeMembershipTypeResponseType> createPutCommitteeMembershipTypeResponse(PutCommitteeMembershipTypeResponseType value) {
        return new JAXBElement<PutCommitteeMembershipTypeResponseType>(_PutCommitteeMembershipTypeResponse_QNAME, PutCommitteeMembershipTypeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignUserBasedSecurityGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Assign_User-Based_Security_Group_Response")
    public JAXBElement<GetAssignUserBasedSecurityGroupResponseType> createGetAssignUserBasedSecurityGroupResponse(GetAssignUserBasedSecurityGroupResponseType value) {
        return new JAXBElement<GetAssignUserBasedSecurityGroupResponseType>(_GetAssignUserBasedSecurityGroupResponse_QNAME, GetAssignUserBasedSecurityGroupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangeWorkContactInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Change_Work_Contact_Information_Request")
    public JAXBElement<GetChangeWorkContactInformationRequestType> createGetChangeWorkContactInformationRequest(GetChangeWorkContactInformationRequestType value) {
        return new JAXBElement<GetChangeWorkContactInformationRequestType>(_GetChangeWorkContactInformationRequest_QNAME, GetChangeWorkContactInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationStructureDissolveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization_Structure_Dissolve")
    public JAXBElement<OrganizationStructureDissolveType> createOrganizationStructureDissolve(OrganizationStructureDissolveType value) {
        return new JAXBElement<OrganizationStructureDissolveType>(_OrganizationStructureDissolve_QNAME, OrganizationStructureDissolveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSiteReferencesRootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Business_Site_References")
    public JAXBElement<BusinessSiteReferencesRootType> createBusinessSiteReferences(BusinessSiteReferencesRootType value) {
        return new JAXBElement<BusinessSiteReferencesRootType>(_BusinessSiteReferences_QNAME, BusinessSiteReferencesRootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeMeetingsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Meetings_Response")
    public JAXBElement<GetCommitteeMeetingsResponseType> createGetCommitteeMeetingsResponse(GetCommitteeMeetingsResponseType value) {
        return new JAXBElement<GetCommitteeMeetingsResponseType>(_GetCommitteeMeetingsResponse_QNAME, GetCommitteeMeetingsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSexualOrientationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Sexual_Orientations_Request")
    public JAXBElement<GetSexualOrientationsRequestType> createGetSexualOrientationsRequest(GetSexualOrientationsRequestType value) {
        return new JAXBElement<GetSexualOrientationsRequestType>(_GetSexualOrientationsRequest_QNAME, GetSexualOrientationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkShiftsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Shifts_Response")
    public JAXBElement<GetWorkShiftsResponseType> createGetWorkShiftsResponse(GetWorkShiftsResponseType value) {
        return new JAXBElement<GetWorkShiftsResponseType>(_GetWorkShiftsResponse_QNAME, GetWorkShiftsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutTrainingTypeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Training_Type_Request")
    public JAXBElement<PutTrainingTypeRequestType> createPutTrainingTypeRequest(PutTrainingTypeRequestType value) {
        return new JAXBElement<PutTrainingTypeRequestType>(_PutTrainingTypeRequest_QNAME, PutTrainingTypeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeClassificationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Classifications_Response")
    public JAXBElement<GetCommitteeClassificationsResponseType> createGetCommitteeClassificationsResponse(GetCommitteeClassificationsResponseType value) {
        return new JAXBElement<GetCommitteeClassificationsResponseType>(_GetCommitteeClassificationsResponse_QNAME, GetCommitteeClassificationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Worker_Profile")
    public JAXBElement<WorkerProfileType> createWorkerProfile(WorkerProfileType value) {
        return new JAXBElement<WorkerProfileType>(_WorkerProfile_QNAME, WorkerProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDifficultyToFillResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Difficulty_to_Fill_Response")
    public JAXBElement<PutDifficultyToFillResponseType> createPutDifficultyToFillResponse(PutDifficultyToFillResponseType value) {
        return new JAXBElement<PutDifficultyToFillResponseType>(_PutDifficultyToFillResponse_QNAME, PutDifficultyToFillResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Employee_Image")
    public JAXBElement<EmployeeImageType> createEmployeeImage(EmployeeImageType value) {
        return new JAXBElement<EmployeeImageType>(_EmployeeImage_QNAME, EmployeeImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReassignSuperiorToInactiveOrganizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Reassign_Superior_to_Inactive_Organization_Request")
    public JAXBElement<ReassignSuperiorToInactiveOrganizationRequestType> createReassignSuperiorToInactiveOrganizationRequest(ReassignSuperiorToInactiveOrganizationRequestType value) {
        return new JAXBElement<ReassignSuperiorToInactiveOrganizationRequestType>(_ReassignSuperiorToInactiveOrganizationRequest_QNAME, ReassignSuperiorToInactiveOrganizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommitteeMembershipTypesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Committee_Membership_Types_Response")
    public JAXBElement<GetCommitteeMembershipTypesResponseType> createGetCommitteeMembershipTypesResponse(GetCommitteeMembershipTypesResponseType value) {
        return new JAXBElement<GetCommitteeMembershipTypesResponseType>(_GetCommitteeMembershipTypesResponse_QNAME, GetCommitteeMembershipTypesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Business_Site")
    public JAXBElement<BusinessSiteType> createBusinessSite(BusinessSiteType value) {
        return new JAXBElement<BusinessSiteType>(_BusinessSite_QNAME, BusinessSiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkScheduleCalendarsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Work_Schedule_Calendars_Response")
    public JAXBElement<GetWorkScheduleCalendarsResponseType> createGetWorkScheduleCalendarsResponse(GetWorkScheduleCalendarsResponseType value) {
        return new JAXBElement<GetWorkScheduleCalendarsResponseType>(_GetWorkScheduleCalendarsResponse_QNAME, GetWorkScheduleCalendarsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditNamedProfessorshipResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Edit_Named_Professorship_Response")
    public JAXBElement<EditNamedProfessorshipResponseType> createEditNamedProfessorshipResponse(EditNamedProfessorshipResponseType value) {
        return new JAXBElement<EditNamedProfessorshipResponseType>(_EditNamedProfessorshipResponse_QNAME, EditNamedProfessorshipResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutAddressesForCountryFormatExtensionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Addresses_for_Country_Format_Extension_Request")
    public JAXBElement<PutAddressesForCountryFormatExtensionRequestType> createPutAddressesForCountryFormatExtensionRequest(PutAddressesForCountryFormatExtensionRequestType value) {
        return new JAXBElement<PutAddressesForCountryFormatExtensionRequestType>(_PutAddressesForCountryFormatExtensionRequest_QNAME, PutAddressesForCountryFormatExtensionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutEthnicityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Ethnicity_Response")
    public JAXBElement<PutEthnicityResponseType> createPutEthnicityResponse(PutEthnicityResponseType value) {
        return new JAXBElement<PutEthnicityResponseType>(_PutEthnicityResponse_QNAME, PutEthnicityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOtherIDsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Other_IDs_Response")
    public JAXBElement<ChangeOtherIDsResponseType> createChangeOtherIDsResponse(ChangeOtherIDsResponseType value) {
        return new JAXBElement<ChangeOtherIDsResponseType>(_ChangeOtherIDsResponse_QNAME, ChangeOtherIDsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDisabilitiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Disabilities_Request")
    public JAXBElement<GetDisabilitiesRequestType> createGetDisabilitiesRequest(GetDisabilitiesRequestType value) {
        return new JAXBElement<GetDisabilitiesRequestType>(_GetDisabilitiesRequest_QNAME, GetDisabilitiesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePreferredNameRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Preferred_Name_Request")
    public JAXBElement<ChangePreferredNameRequestType> createChangePreferredNameRequest(ChangePreferredNameRequestType value) {
        return new JAXBElement<ChangePreferredNameRequestType>(_ChangePreferredNameRequest_QNAME, ChangePreferredNameRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDependentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Dependent_Response")
    public JAXBElement<PutDependentResponseType> createPutDependentResponse(PutDependentResponseType value) {
        return new JAXBElement<PutDependentResponseType>(_PutDependentResponse_QNAME, PutDependentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCommitteeTypeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Committee_Type_Request")
    public JAXBElement<PutCommitteeTypeRequestType> createPutCommitteeTypeRequest(PutCommitteeTypeRequestType value) {
        return new JAXBElement<PutCommitteeTypeRequestType>(_PutCommitteeTypeRequest_QNAME, PutCommitteeTypeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobClassificationGroupsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Job_Classification_Groups_Request")
    public JAXBElement<GetJobClassificationGroupsRequestType> createGetJobClassificationGroupsRequest(GetJobClassificationGroupsRequestType value) {
        return new JAXBElement<GetJobClassificationGroupsRequestType>(_GetJobClassificationGroupsRequest_QNAME, GetJobClassificationGroupsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutWorkScheduleCalendarRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Work_Schedule_Calendar_Request")
    public JAXBElement<PutWorkScheduleCalendarRequestType> createPutWorkScheduleCalendarRequest(PutWorkScheduleCalendarRequestType value) {
        return new JAXBElement<PutWorkScheduleCalendarRequestType>(_PutWorkScheduleCalendarRequest_QNAME, PutWorkScheduleCalendarRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeGovernmentIDsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Government_IDs_Request")
    public JAXBElement<ChangeGovernmentIDsRequestType> createChangeGovernmentIDsRequest(ChangeGovernmentIDsRequestType value) {
        return new JAXBElement<ChangeGovernmentIDsRequestType>(_ChangeGovernmentIDsRequest_QNAME, ChangeGovernmentIDsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAcademicAppointmentTrackAdditionalDataRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Edit_Academic_Appointment_Track_Additional_Data_Request")
    public JAXBElement<EditAcademicAppointmentTrackAdditionalDataRequestType> createEditAcademicAppointmentTrackAdditionalDataRequest(EditAcademicAppointmentTrackAdditionalDataRequestType value) {
        return new JAXBElement<EditAcademicAppointmentTrackAdditionalDataRequestType>(_EditAcademicAppointmentTrackAdditionalDataRequest_QNAME, EditAcademicAppointmentTrackAdditionalDataRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUniversalIdentifiersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Universal_Identifiers_Request")
    public JAXBElement<GetUniversalIdentifiersRequestType> createGetUniversalIdentifiersRequest(GetUniversalIdentifiersRequestType value) {
        return new JAXBElement<GetUniversalIdentifiersRequestType>(_GetUniversalIdentifiersRequest_QNAME, GetUniversalIdentifiersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcademicAppointmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Academic_Appointment_Response")
    public JAXBElement<AcademicAppointmentResponseType> createAcademicAppointmentResponse(AcademicAppointmentResponseType value) {
        return new JAXBElement<AcademicAppointmentResponseType>(_AcademicAppointmentResponse_QNAME, AcademicAppointmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutLocationHierarchyOrganizationAssignmentsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Location_Hierarchy_Organization_Assignments_Response")
    public JAXBElement<PutLocationHierarchyOrganizationAssignmentsResponseType> createPutLocationHierarchyOrganizationAssignmentsResponse(PutLocationHierarchyOrganizationAssignmentsResponseType value) {
        return new JAXBElement<PutLocationHierarchyOrganizationAssignmentsResponseType>(_PutLocationHierarchyOrganizationAssignmentsResponse_QNAME, PutLocationHierarchyOrganizationAssignmentsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentSpecialtiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Appointment_Specialties_Request")
    public JAXBElement<GetAppointmentSpecialtiesRequestType> createGetAppointmentSpecialtiesRequest(GetAppointmentSpecialtiesRequestType value) {
        return new JAXBElement<GetAppointmentSpecialtiesRequestType>(_GetAppointmentSpecialtiesRequest_QNAME, GetAppointmentSpecialtiesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWorkContactInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Change_Work_Contact_Information_Response")
    public JAXBElement<ChangeWorkContactInformationResponseType> createChangeWorkContactInformationResponse(ChangeWorkContactInformationResponseType value) {
        return new JAXBElement<ChangeWorkContactInformationResponseType>(_ChangeWorkContactInformationResponse_QNAME, ChangeWorkContactInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutJobCategoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Put_Job_Category_Response")
    public JAXBElement<PutJobCategoryResponseType> createPutJobCategoryResponse(PutJobCategoryResponseType value) {
        return new JAXBElement<PutJobCategoryResponseType>(_PutJobCategoryResponse_QNAME, PutJobCategoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignUserBasedSecurityGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Assign_User-Based_Security_Groups_Response")
    public JAXBElement<GetAssignUserBasedSecurityGroupsResponseType> createGetAssignUserBasedSecurityGroupsResponse(GetAssignUserBasedSecurityGroupsResponseType value) {
        return new JAXBElement<GetAssignUserBasedSecurityGroupsResponseType>(_GetAssignUserBasedSecurityGroupsResponse_QNAME, GetAssignUserBasedSecurityGroupsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSocialBenefitsLocalitiesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.workday/bsvc", name = "Get_Social_Benefits_Localities_Request")
    public JAXBElement<GetSocialBenefitsLocalitiesRequestType> createGetSocialBenefitsLocalitiesRequest(GetSocialBenefitsLocalitiesRequestType value) {
        return new JAXBElement<GetSocialBenefitsLocalitiesRequestType>(_GetSocialBenefitsLocalitiesRequest_QNAME, GetSocialBenefitsLocalitiesRequestType.class, null, value);
    }

}
