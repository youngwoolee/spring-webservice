package com.joeylee.webservice.web;

import com.joeylee.webservice.domain.posts.PostsRepository;
import com.joeylee.webservice.dto.posts.PostsSaveRequestDto;
import com.joeylee.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
* 스프링프레임워크에선 Bean 을 주입받는 방식들이 아래와 같이 있는데요.
@Autowired
setter
생성자
이중 가장 권장하는 방식이 생성자로 주입받는 방식입니다.
* */
@RestController
@AllArgsConstructor
public class WebRestController {

    PostsService postsService;


    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
