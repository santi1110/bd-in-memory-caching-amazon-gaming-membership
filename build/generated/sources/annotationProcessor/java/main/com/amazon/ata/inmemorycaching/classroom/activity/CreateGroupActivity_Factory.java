package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateGroupActivity_Factory implements Factory<CreateGroupActivity> {
  private final Provider<GroupDao> groupDaoProvider;

  public CreateGroupActivity_Factory(Provider<GroupDao> groupDaoProvider) {
    this.groupDaoProvider = groupDaoProvider;
  }

  @Override
  public CreateGroupActivity get() {
    return new CreateGroupActivity(groupDaoProvider.get());
  }

  public static CreateGroupActivity_Factory create(Provider<GroupDao> groupDaoProvider) {
    return new CreateGroupActivity_Factory(groupDaoProvider);
  }
}
