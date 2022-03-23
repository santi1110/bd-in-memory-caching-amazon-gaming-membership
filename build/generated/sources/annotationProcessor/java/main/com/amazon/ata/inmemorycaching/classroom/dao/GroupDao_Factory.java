package com.amazon.ata.inmemorycaching.classroom.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupDao_Factory implements Factory<GroupDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public GroupDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public GroupDao get() {
    return new GroupDao(mapperProvider.get());
  }

  public static GroupDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new GroupDao_Factory(mapperProvider);
  }
}
