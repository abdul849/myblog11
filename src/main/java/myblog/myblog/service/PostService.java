package myblog.myblog.service;
import myblog.myblog.payload.PostDto;



public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostByid(long id);
}
