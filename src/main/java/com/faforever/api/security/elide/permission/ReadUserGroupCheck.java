package com.faforever.api.security.elide.permission;

import com.faforever.api.data.domain.GroupPermission;
import com.faforever.api.security.OAuthScope;
import com.yahoo.elide.security.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadUserGroupCheck extends FafUserCheck {
  public static final String EXPRESSION = "ReadUserGroup";

  @Override
  public boolean ok(User user) {
    return checkOAuthScopes(OAuthScope.READ_SENSIBLE_USERDATA) &&
      checkUserPermission(user, GroupPermission.ROLE_READ_USER_GROUP);
  }
}
