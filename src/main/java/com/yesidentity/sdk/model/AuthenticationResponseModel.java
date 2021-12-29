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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuthenticationResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-01T07:44:54.268733600+01:00[Europe/Stockholm]")
public class AuthenticationResponseModel {
  public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth_token";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private String authToken;

  public static final String SERIALIZED_NAME_AUTH_REQ_ID = "auth_req_id";
  @SerializedName(SERIALIZED_NAME_AUTH_REQ_ID)
  private String authReqId;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Integer interval;

  public AuthenticationResponseModel() { 
  }

  public AuthenticationResponseModel authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Authentication token
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token")

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public AuthenticationResponseModel authReqId(String authReqId) {
    
    this.authReqId = authReqId;
    return this;
  }

   /**
   * Authentication request id
   * @return authReqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication request id")

  public String getAuthReqId() {
    return authReqId;
  }


  public void setAuthReqId(String authReqId) {
    this.authReqId = authReqId;
  }


  public AuthenticationResponseModel expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Expiration time of the &#39;auth_req_id&#39;
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration time of the 'auth_req_id'")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AuthenticationResponseModel interval(Integer interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Indicates the minimum amount of time in seconds that the client must wait between polling requests to the token endpoint
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the minimum amount of time in seconds that the client must wait between polling requests to the token endpoint")

  public Integer getInterval() {
    return interval;
  }


  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResponseModel authenticationResponse = (AuthenticationResponseModel) o;
    return Objects.equals(this.authToken, authenticationResponse.authToken) &&
        Objects.equals(this.authReqId, authenticationResponse.authReqId) &&
        Objects.equals(this.expiresIn, authenticationResponse.expiresIn) &&
        Objects.equals(this.interval, authenticationResponse.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authToken, authReqId, expiresIn, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResponseModel {\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    authReqId: ").append(toIndentedString(authReqId)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
