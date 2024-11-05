package socialmedia.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

@Autowired
private PostRepository postRepository;

    public Post create(Post myPost) {
        return postRepository.save(myPost);
    }
}
