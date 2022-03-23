package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetUsersInGroupActivity_Factory implements Factory<GetUsersInGroupActivity> {
  private final Provider<GroupMembershipDao> groupMembershipDaoProvider;

  public GetUsersInGroupActivity_Factory(Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    this.groupMembershipDaoProvider = groupMembershipDaoProvider;
  }

  @Override
  public GetUsersInGroupActivity get() {
    return new GetUsersInGroupActivity(groupMembershipDaoProvider.get());
  }

  public static GetUsersInGroupActivity_Factory create(
      Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    return new GetUsersInGroupActivity_Factory(groupMembershipDaoProvider);
  }
}
