package myblog.myblog.controller;
import myblog.myblog.payload.PostDto;
import myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public ResponseEntity<PostDto> getPostByid(@RequestParam long id){
        PostDto dto = postService.getPostByid(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }


    @GetMapping
    public List<PostDto> getAllPosts(@RequestParam(name="PageNo",required=false,defaultValue="0") int pageNo,
                                     @RequestParam(name="Pagesize",required=false,defaultValue="3") int pageSize){
        List<PostDto> postDtos = postService.getAllPosts(pageNo,pageSize);
        return postDtos;
    }
}
