package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupDao;
import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddUserToGroupActivity_Factory implements Factory<AddUserToGroupActivity> {
  private final Provider<GroupMembershipDao> groupMembershipDaoProvider;

  private final Provider<GroupDao> groupDaoProvider;

  public AddUserToGroupActivity_Factory(
      Provider<GroupMembershipDao> groupMembershipDaoProvider,
      Provider<GroupDao> groupDaoProvider) {
    this.groupMembershipDaoProvider = groupMembershipDaoProvider;
    this.groupDaoProvider = groupDaoProvider;
  }

  @Override
  public AddUserToGroupActivity get() {
    return new AddUserToGroupActivity(groupMembershipDaoProvider.get(), groupDaoProvider.get());
  }

  public static AddUserToGroupActivity_Factory create(
      Provider<GroupMembershipDao> groupMembershipDaoProvider,
      Provider<GroupDao> groupDaoProvider) {
    return new AddUserToGroupActivity_Factory(groupMembershipDaoProvider, groupDaoProvider);
  }
}
