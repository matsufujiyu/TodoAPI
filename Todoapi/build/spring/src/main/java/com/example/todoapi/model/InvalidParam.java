package com.example.todoapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 不正なリクエストについての詳細
 */

@Schema(name = "InvalidParam", description = "不正なリクエストについての詳細")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-08T17:14:28.754630300+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class InvalidParam {

  private String name;

  private String reason;

  public InvalidParam() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InvalidParam(String name, String reason) {
    this.name = name;
    this.reason = reason;
  }

  public InvalidParam name(String name) {
    this.name = name;
    return this;
  }

  /**
   * エラーが発生したフィールド名
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "エラーが発生したフィールド名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InvalidParam reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * エラーの理由
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", description = "エラーの理由", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidParam invalidParam = (InvalidParam) o;
    return Objects.equals(this.name, invalidParam.name) &&
        Objects.equals(this.reason, invalidParam.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidParam {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

