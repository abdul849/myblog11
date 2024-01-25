package myblog.myblog.service.impl;
import myblog.myblog.entity.Comment;
import myblog.myblog.entity.Post;
import myblog.myblog.exception.ResourceNotFoundException;
import myblog.myblog.payload.CommentDto;
import myblog.myblog.repository.CommentRepository;
import myblog.myblog.repository.PostRepository;
import myblog.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;


    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("post not found with id:" + postId));


        Comment comment=new Comment();

        comment.setEmail(commentDto.getEmail());
        comment.setText(commentDto.getText());
        comment.setPost(post);

        Comment save = commentRepository.save(comment);

        CommentDto dto=new CommentDto();
        dto.setEmail(save.getEmail());
        dto.setText(save.getText());
        dto.setId(save.getId());


        return dto;
    }
}
