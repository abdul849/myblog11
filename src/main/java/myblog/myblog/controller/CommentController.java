package myblog.myblog.controller;
import myblog.myblog.payload.CommentDto;
import myblog.myblog.service.CommentService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController{
    @Autowired
    private CommentService commentService;

//http://localhost:8080?api/comments?postId=1
@PostMapping
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @RequestParam long postId){
    CommentDto dto = commentService.createComment(commentDto, postId);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
}

}
