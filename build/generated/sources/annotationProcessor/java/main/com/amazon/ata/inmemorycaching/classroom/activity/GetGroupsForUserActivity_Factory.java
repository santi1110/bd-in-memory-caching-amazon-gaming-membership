package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetGroupsForUserActivity_Factory implements Factory<GetGroupsForUserActivity> {
  private final Provider<GroupMembershipDao> groupMembershipDaoProvider;

  public GetGroupsForUserActivity_Factory(Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    this.groupMembershipDaoProvider = groupMembershipDaoProvider;
  }

  @Override
  public GetGroupsForUserActivity get() {
    return new GetGroupsForUserActivity(groupMembershipDaoProvider.get());
  }

  public static GetGroupsForUserActivity_Factory create(
      Provider<GroupMembershipDao> groupMembershipDaoProvider) {
    return new GetGroupsForUserActivity_Factory(groupMembershipDaoProvider);
  }
}
