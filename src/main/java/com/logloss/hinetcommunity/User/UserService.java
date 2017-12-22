package com.logloss.hinetcommunity.User;

import com.logloss.hinetcommunity.Comment.Comment;
import com.logloss.hinetcommunity.Comment.CommentService;
import com.logloss.hinetcommunity.Like.Like;
import com.logloss.hinetcommunity.Like.LikeService;
import com.logloss.hinetcommunity.Post.Post;
import com.logloss.hinetcommunity.Post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    CommentService commentService;

    @Autowired
    PostService postService;

    @Autowired
    LikeService likeService;

    public List<Comment> getAllComments(String userId) {
        return commentService.getCommentsByUserId(userId);
    }

    public List<Post> getAllPosts(String userId) {
        return postService.getPostsByUserId(userId);
    }

    public List<Like> getAllLikes(String userId) {
        return likeService.getLikesByUserId(userId);
    }

}
