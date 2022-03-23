package com.amazon.ata.inmemorycaching.classroom.dao;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupMembershipCachingDao_Factory implements Factory<GroupMembershipCachingDao> {
  private final Provider<GroupMembershipDao> delegateDaoProvider;

  public GroupMembershipCachingDao_Factory(Provider<GroupMembershipDao> delegateDaoProvider) {
    this.delegateDaoProvider = delegateDaoProvider;
  }

  @Override
  public GroupMembershipCachingDao get() {
    return new GroupMembershipCachingDao(delegateDaoProvider.get());
  }

  public static GroupMembershipCachingDao_Factory create(
      Provider<GroupMembershipDao> delegateDaoProvider) {
    return new GroupMembershipCachingDao_Factory(delegateDaoProvider);
  }
}
