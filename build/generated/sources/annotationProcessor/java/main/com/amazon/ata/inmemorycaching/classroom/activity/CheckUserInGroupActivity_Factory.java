package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CheckUserInGroupActivity_Factory implements Factory<CheckUserInGroupActivity> {
  private final Provider<GroupMembershipDao> groupMembershipDaoProvider;

  public CheckUserInGroupActivity_Factory(Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    this.groupMembershipDaoProvider = groupMembershipDaoProvider;
  }

  @Override
  public CheckUserInGroupActivity get() {
    return new CheckUserInGroupActivity(groupMembershipDaoProvider.get());
  }

  public static CheckUserInGroupActivity_Factory create(
      Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    return new CheckUserInGroupActivity_Factory(groupMembershipDaoProvider);
  }
}
