/*
 * Yes Identity
 * Welcome to Yes Identity API documentation.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.yesidentity.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.yesidentity.sdk.model.ClientAssertionTypeModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TokenRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-01T07:44:54.268733600+01:00[Europe/Stockholm]")
public class TokenRequestModel {
  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private String grantType;

  public static final String SERIALIZED_NAME_AUTH_REQ_ID = "auth_req_id";
  @SerializedName(SERIALIZED_NAME_AUTH_REQ_ID)
  private String authReqId;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_ASSERTION = "client_assertion";
  @SerializedName(SERIALIZED_NAME_CLIENT_ASSERTION)
  private String clientAssertion;

  public static final String SERIALIZED_NAME_CLIENT_ASSERTION_TYPE = "client_assertion_type";
  @SerializedName(SERIALIZED_NAME_CLIENT_ASSERTION_TYPE)
  private ClientAssertionTypeModel clientAssertionType;

  public TokenRequestModel() { 
  }

  public TokenRequestModel grantType(String grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * Grant type
   * @return grantType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Grant type")

  public String getGrantType() {
    return grantType;
  }


  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  public TokenRequestModel authReqId(String authReqId) {
    
    this.authReqId = authReqId;
    return this;
  }

   /**
   * Unique id to identify the authentications request
   * @return authReqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique id to identify the authentications request")

  public String getAuthReqId() {
    return authReqId;
  }


  public void setAuthReqId(String authReqId) {
    this.authReqId = authReqId;
  }


  public TokenRequestModel scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the access request
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the access request")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public TokenRequestModel clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The client id
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client id")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public TokenRequestModel clientAssertion(String clientAssertion) {
    
    this.clientAssertion = clientAssertion;
    return this;
  }

   /**
   * The value of the client token
   * @return clientAssertion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the client token")

  public String getClientAssertion() {
    return clientAssertion;
  }


  public void setClientAssertion(String clientAssertion) {
    this.clientAssertion = clientAssertion;
  }


  public TokenRequestModel clientAssertionType(ClientAssertionTypeModel clientAssertionType) {
    
    this.clientAssertionType = clientAssertionType;
    return this;
  }

   /**
   * Get clientAssertionType
   * @return clientAssertionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientAssertionTypeModel getClientAssertionType() {
    return clientAssertionType;
  }


  public void setClientAssertionType(ClientAssertionTypeModel clientAssertionType) {
    this.clientAssertionType = clientAssertionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequestModel tokenRequest = (TokenRequestModel) o;
    return Objects.equals(this.grantType, tokenRequest.grantType) &&
        Objects.equals(this.authReqId, tokenRequest.authReqId) &&
        Objects.equals(this.scope, tokenRequest.scope) &&
        Objects.equals(this.clientId, tokenRequest.clientId) &&
        Objects.equals(this.clientAssertion, tokenRequest.clientAssertion) &&
        Objects.equals(this.clientAssertionType, tokenRequest.clientAssertionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, authReqId, scope, clientId, clientAssertion, clientAssertionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequestModel {\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    authReqId: ").append(toIndentedString(authReqId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientAssertion: ").append(toIndentedString(clientAssertion)).append("\n");
    sb.append("    clientAssertionType: ").append(toIndentedString(clientAssertionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
