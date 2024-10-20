package com.amazon.ata.inmemorycaching.classroom.activity;

import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipCachingDao;
import com.amazon.ata.inmemorycaching.classroom.dao.GroupMembershipDao;

import javax.inject.Inject;

/**
 * Handles requests to check if a user is in a group.
 */
public class CheckUserInGroupActivity {

   private final GroupMembershipCachingDao groupMembershipDao;


    @Inject
    public CheckUserInGroupActivity(final GroupMembershipCachingDao groupMembershipDao){
        this.groupMembershipDao = groupMembershipDao;
    }


    public boolean handleRequest(final String userId, final String groupId) {
        return groupMembershipDao.isUserInGroup(userId, groupId);
    }
}
