package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RemoveUserFromGroupActivity_Factory
    implements Factory<RemoveUserFromGroupActivity> {
  private final Provider<GroupMembershipDao> groupMembershipDaoProvider;

  public RemoveUserFromGroupActivity_Factory(
      Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    this.groupMembershipDaoProvider = groupMembershipDaoProvider;
  }

  @Override
  public RemoveUserFromGroupActivity get() {
    return new RemoveUserFromGroupActivity(groupMembershipDaoProvider.get());
  }

  public static RemoveUserFromGroupActivity_Factory create(
      Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    return new RemoveUserFromGroupActivity_Factory(groupMembershipDaoProvider);
  }
}
