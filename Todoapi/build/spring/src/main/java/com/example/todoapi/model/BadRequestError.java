package com.example.todoapi.model;

import java.net.URI;
import java.util.Objects;
import com.example.todoapi.model.InvalidParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * リクエストが不正
 */

@Schema(name = "BadRequestError", description = "リクエストが不正")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-08T17:14:28.754630300+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
public class BadRequestError {

  private String title = "Bad Request";

  private String detail = "リクエストが不正です。正しいリクエストでリトライしてください";

  @Valid
  private List<@Valid InvalidParam> invalidParams = new ArrayList<>();

  public BadRequestError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BadRequestError(String title, String detail, List<@Valid InvalidParam> invalidParams) {
    this.title = title;
    this.detail = detail;
    this.invalidParams = invalidParams;
  }

  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * エラーのタイトル
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "エラーのタイトル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BadRequestError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * エラーの詳細
   * @return detail
  */
  @NotNull 
  @Schema(name = "detail", description = "エラーの詳細", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public BadRequestError invalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestError addInvalidParamsItem(InvalidParam invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

  /**
   * Get invalidParams
   * @return invalidParams
  */
  @NotNull @Valid 
  @Schema(name = "invalid-params", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invalid-params")
  public List<@Valid InvalidParam> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(this.title, badRequestError.title) &&
        Objects.equals(this.detail, badRequestError.detail) &&
        Objects.equals(this.invalidParams, badRequestError.invalidParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, invalidParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestError {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
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

