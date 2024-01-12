package myblog.myblog.service;
import myblog.myblog.entity.Post;
import myblog.myblog.exception.ResourceNotFoundException;
import myblog.myblog.payload.PostDto;
import myblog.myblog.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post  savePost = postRepository.save(post);

        PostDto dto=new PostDto();
        postDto.setContent(savePost.getContent());
        postDto.setDescription(savePost.getDescription());
        postDto.setTitle(savePost.getTitle());

        return dto;
    }

    @Override
    public PostDto getPostByid(long id) {
        Post post = postRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("post not found with id:" + id));

        PostDto dto=new PostDto();
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        dto.setTitle(post.getTitle());

        return dto;
    }
}
