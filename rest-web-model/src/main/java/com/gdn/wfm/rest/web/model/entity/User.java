package com.gdn.wfm.rest.web.model.entity;

 import com.fasterxml.jackson.annotation.JsonInclude;
 import java.io.Serializable;
 import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String userName;
    private String email;
    private String contactNumber;
    private Long reportingManager;
    private List<String> hubNames;
    private String firstName;
    private String middleName;
    private String lastName;
   // private List<Role> role;
    private Boolean isActive;
    private String address1;
    private String address2;
    private String locality;
    private String city;
    private String zipCode;
    private long countryId;
    private String designation;
    private String userType;
    private String userSource;
    private String timeZone;

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setReportingManager(Long reportingManager) {
        this.reportingManager = reportingManager;
    }

    public void setHubNames(List<String> hubNames) {
        this.hubNames = hubNames;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public void setRole(List<Role> role) {
//        this.role = role;
//    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    private User(Builder builder) {
        setId(builder.id);
        setUserName(builder.userName);
        setEmail(builder.email);
        setContactNumber(builder.contactNumber);
        setReportingManager(builder.reportingManager);
        setHubNames(builder.hubNames);
        setFirstName(builder.firstName);
        setMiddleName(builder.middleName);
        setLastName(builder.lastName);
        /*setRole(builder.role);*/
        isActive = builder.isActive;
        setAddress1(builder.address1);
        setAddress2(builder.address2);
        setLocality(builder.locality);
        setCity(builder.city);
        setZipCode(builder.zipCode);
        setCountryId(builder.countryId);
        setDesignation(builder.designation);
        setUserType(builder.userType);
        setUserSource(builder.userSource);
        setTimeZone(builder.timeZone);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    //public List<Role> getRole() { return role;  }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public Long getReportingManager() {
        return reportingManager;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getHubNames() {
        return hubNames;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getActive() { return isActive; }

    public static final class Builder {
        private long id;
        private String userName;
        private String email;
        private String contactNumber;
        private Long reportingManager;
        private List<String> hubNames;
        private String firstName;
        private String middleName;
        private String lastName;
        /*private List<Role> role;*/
        private Boolean isActive;
        private String address1;
        private String address2;
        private String locality;
        private String city;
        private String zipCode;
        private long countryId;
        private String designation;
        private String userType;
        private String userSource;
        private String timeZone;

        private Builder() {
        }

        public Builder withId(long val) {
            id = val;
            return this;
        }

        public Builder withUserName(String val) {
            userName = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withContactNumber(String val) {
            contactNumber = val;
            return this;
        }

        public Builder withReportingManager(Long val) {
            reportingManager = val;
            return this;
        }

        public Builder withHubNames(List<String> val) {
            hubNames = val;
            return this;
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withMiddleName(String val) {
            middleName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

//        public Builder withRole(List<Role> val) {
//            role = val;
//            return this;
//        }

        public Builder withIsActive(Boolean val) {
            isActive = val;
            return this;
        }

        public Builder withAddress1(String val) {
            address1 = val;
            return this;
        }

        public Builder withAddress2(String val) {
            address2 = val;
            return this;
        }

        public Builder withLocality(String val) {
            locality = val;
            return this;
        }

        public Builder withCity(String val) {
            city = val;
            return this;
        }

        public Builder withZipCode(String val) {
            zipCode = val;
            return this;
        }

        public Builder withCountryId(long val) {
            countryId = val;
            return this;
        }

        public Builder withDesignation(String val) {
            designation = val;
            return this;
        }

        public Builder withUserType(String val) {
            userType = val;
            return this;
        }

        public Builder withUserSource(String val) {
            userSource = val;
            return this;
        }

        public Builder withTimeZone(String val) {
            timeZone = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
