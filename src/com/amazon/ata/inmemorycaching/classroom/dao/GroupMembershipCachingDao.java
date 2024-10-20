package com.amazon.ata.inmemorycaching.classroom.dao;

import com.amazon.ata.inmemorycaching.classroom.dao.models.GroupMembershipCacheKey;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

public class GroupMembershipCachingDao {

    LoadingCache<GroupMembershipCacheKey,Boolean> theCache;

    @Inject
    public GroupMembershipCachingDao(final GroupMembershipDao delegateDao) {

      this.theCache = CacheBuilder.newBuilder()
              .maximumSize(20000)
              .expireAfterWrite(3, TimeUnit.HOURS)
              .build(CacheLoader.from(delegateDao::isUserInGroup));

    }

    public boolean isUserInGroup(String userId, String groupId){

      return theCache.getUnchecked(new GroupMembershipCacheKey(userId, groupId));
    }

}
