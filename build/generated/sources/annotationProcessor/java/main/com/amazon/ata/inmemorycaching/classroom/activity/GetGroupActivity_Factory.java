package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetGroupActivity_Factory implements Factory<GetGroupActivity> {
  private final Provider<GroupDao> groupDaoProvider;

  public GetGroupActivity_Factory(Provider<GroupDao> groupDaoProvider) {
    this.groupDaoProvider = groupDaoProvider;
  }

  @Override
  public GetGroupActivity get() {
    return new GetGroupActivity(groupDaoProvider.get());
  }

  public static GetGroupActivity_Factory create(Provider<GroupDao> groupDaoProvider) {
    return new GetGroupActivity_Factory(groupDaoProvider);
  }
}
