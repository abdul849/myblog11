package myblog.myblog.payload;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostDto {

    private long id;
    private String title;
    private String description;
    private String content;

}
