package myblog.myblog.service;

import myblog.myblog.payload.CommentDto;


public interface CommentService {
 CommentDto   createComment(CommentDto commentDto,long postId);
}
