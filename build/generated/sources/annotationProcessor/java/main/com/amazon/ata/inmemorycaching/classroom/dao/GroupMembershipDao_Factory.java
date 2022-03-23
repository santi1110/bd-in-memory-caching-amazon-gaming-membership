package com.amazon.ata.inmemorycaching.classroom.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupMembershipDao_Factory implements Factory<GroupMembershipDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public GroupMembershipDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public GroupMembershipDao get() {
    return new GroupMembershipDao(mapperProvider.get());
  }

  public static GroupMembershipDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new GroupMembershipDao_Factory(mapperProvider);
  }
}
