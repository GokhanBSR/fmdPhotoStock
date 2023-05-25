package com.bilgeadam.photo.controller;


import com.bilgeadam.photo.common.controller.BaseController;
import com.bilgeadam.photo.dto.TagDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/tags")
public class TagController extends BaseController {

    //...

    @GetMapping("/photo/{photoId}")
    public ResponseEntity<List<TagDto>> getByPhotoId(@PathVariable Long photoId) {
        //içi doldurulacak null dönmeyecek
        return null;
    }

    @GetMapping("/{name}")
    public ResponseEntity<TagDto> getByName(@PathVariable String name) {
        //içi doldurulacak null dönmeyecek
        return null;
    }
}
