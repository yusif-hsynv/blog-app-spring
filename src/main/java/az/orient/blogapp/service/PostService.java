package az.orient.blogapp.service;

import az.orient.blogapp.dto.CreatePostRequest;
import az.orient.blogapp.dto.PostDto;
import az.orient.blogapp.dto.UpdatePostRequest;
import az.orient.blogapp.entity.Post;
import az.orient.blogapp.entity.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);

    List<Post> getAllPosts(UUID categoryId, UUID tagId);

    List<Post> getDraftPosts(User user);

    Post createPost(User user, CreatePostRequest createPostRequest);

    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);

    void deletePost(UUID id);
}
