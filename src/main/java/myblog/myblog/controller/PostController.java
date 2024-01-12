package myblog.myblog.controller;
import myblog.myblog.payload.PostDto;
import myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
      @PostMapping
    public ResponseEntity<PostDto> creatPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<PostDto> getPostByid(@RequestParam long id){
        PostDto dto = postService.getPostByid(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
