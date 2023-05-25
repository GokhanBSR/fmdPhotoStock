package com.bilgeadam.photo.controller;


import com.bilgeadam.photo.dto.TagDto;
import com.bilgeadam.photo.service.TagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping("/add-tag")
    ResponseEntity<TagDto> addTag(@RequestBody TagDto tagDto) {
        return new ResponseEntity<>(tagService.addTag(tagDto), HttpStatus.CREATED)
    }

    @GetMapping("/get-tag")
    ResponseEntity<TagDto> getTag(@RequestBody TagDto tagDto) {
        return new ResponseEntity<>(tagService.getTag(tagDto), HttpStatus.OK);
    }

    @GetMapping("/update-tag")
    ResponseEntity<TagDto> updateTag(@RequestBody TagDto tagDto) {
        return new ResponseEntity<>(tagService.updateTag(tagDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete-tag")
    void deleteTag(@RequestBody TagDto tagDto) {
        tagService.deleteTag(tagDto);
    }


}
