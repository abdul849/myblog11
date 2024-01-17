package myblog.myblog.service;
import myblog.myblog.payload.PostDto;
import java.util.List;


public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostByid(long id);

    public List<PostDto> getAllPosts(int pageNo, int pageSize);
}
