package com.faforever.api.error;

import lombok.Getter;
import lombok.ToString;

import java.text.MessageFormat;

@Getter
@ToString
public class Error {

  private final ErrorCode errorCode;
  private final Object[] args;

  public Error(ErrorCode errorCode, Object... args) {
    this.errorCode = errorCode;
    this.args = args;
  }

  public String getErrorDetailMessage() {
    return MessageFormat.format(errorCode.getDetail(), args);
  }
}
