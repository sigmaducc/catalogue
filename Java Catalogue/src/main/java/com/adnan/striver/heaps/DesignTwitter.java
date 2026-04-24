package com.adnan.striver.heaps;

import java.util.*;

// LeetCode 355: MEDIUM
// https://leetcode.com/problems/design-twitter/

// Approach: getNewsFeed is going through the tweets of each follower and
// making a list of 10 most recent tweets. For most recent we are using heap.
// Since, tweet list can be thought of like a sorted list so the problem boils
// down to merge K sorted list.

class Tweet {
    int id;
    int time;
    Tweet next;

    public Tweet(int id, int time) {
        this.id = id;
        this.time = time;
        this.next = null;
    }
}

// Space Complexity: O(T(u) + F(u))
class User {
    int id;
    Tweet tweetHead;
    Set<Integer> followees;

    public User(int id) {
        this.id = id;
        this.tweetHead = null;
        this.followees = new HashSet<>();
        this.followees.add(id);
    }

    public void follow(Integer userId) {
        this.followees.add(userId);
    }

    public void unfollow(Integer userId) {
        if(userId != this.id)
            this.followees.remove(userId);
    }

    public void postTweet(Tweet tweet) {
        tweet.next = tweetHead;
        tweetHead = tweet;
    }
}

// Space Complexity: O(U + T + F)
public class DesignTwitter {
    int time;
    Map<Integer, User> users;

    public DesignTwitter() {
        this.time = 0;
        this.users = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        getUser(userId).postTweet(new Tweet(tweetId, this.time++));
    }

    // Time Complexity: O(F(u) log F(u) + 10 * 2 * log F(u)) ~ O(F(u) log F(u))
    // Space Complexity: O(F(u) + 10) ~ O(F(u))
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> heap = new PriorityQueue<>((a, b) -> b.time - a.time);
        for(Integer uId: getUser(userId).followees) {
            User user = this.users.get(uId);
            if(user.tweetHead != null) {
                heap.add(user.tweetHead);
            }
        }

        List<Integer> list = new ArrayList<>();
        while(list.size() < 10 && !heap.isEmpty()) {
            Tweet tweet = heap.poll();
            list.add(tweet.id);

            if(tweet.next != null)
                heap.add(tweet.next);
        }

        return list;
    }

    public void follow(int followerId, int followeeId) {
        getUser(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        getUser(followerId).unfollow(followeeId);
    }

    private User getUser(int userId) {
        if(!this.users.containsKey(userId))
            this.users.put(userId, new User(userId));

        return this.users.get(userId);
    }
}

//    Your Twitter object will be instantiated and called as such:
//    Twitter obj = new Twitter();
//    obj.postTweet(userId,tweetId);
//    List<Integer> param_2 = obj.getNewsFeed(userId);
//    obj.follow(followerId,followeeId);
//    obj.unfollow(followerId,followeeId);