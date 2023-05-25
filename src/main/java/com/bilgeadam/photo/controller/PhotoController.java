package com.bilgeadam.photo.controller;

import com.bilgeadam.photo.dto.PhotoDto;
import com.bilgeadam.photo.service.PhotoService;
import com.bilgeadam.photo.service.TagService;
import com.bilgeadam.photo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Controller
public class PhotoController {

    private final PhotoService photoService;
    private final UserService userService;
    private final TagService tagService;

    public PhotoController(PhotoService photoService, UserService userService, TagService tagService) {
        this.photoService = photoService;
        this.userService = userService;
        this.tagService = tagService;
    }

    @PostMapping("/save")
    public ResponseEntity<PhotoDto> save(@RequestBody PhotoDto photoDTO) {
        return new ResponseEntity<>(photoService.save(photoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/get-photo")
    ResponseEntity<PhotoDto> getPhoto(@RequestBody PhotoDto photoDto) {
        return new ResponseEntity<>(photoService.getPhoto(photoDto), HttpStatus.OK);
    }
//    @GetMapping ("/find-all")
//    public ResponseEntity<List<PhotoDto>> findAll(@RequestBody PhotoDto photoDto) {
//        return new ResponseEntity<>(photoService.findAll(PhotoDto), HttpStatus.OK);
//    }
//    @GetMapping("/find-category")
//    public ResponseEntity<List<PhotoDto>>findByCategory (@RequestBody PhotoDto photoDto){
//        return new ResponseEntity<>(PhotoService.findByCategory(PhotoDto), HttpStatus.OK);
//    }
//    @GetMapping("/find-by-user-name")
//    public ResponseEntity<List<PhotoDto>>findByUserName(@RequestBody PhotoDto photoDto){
//        return new ResponseEntity<>(PhotoService.findByUsername(PhotoDto), HttpStatus.OK);
//    }
//    @GetMapping("/find-Price")
//    public ResponseEntity<List<PhotoDto>>findByPrice(@RequestBody PhotoDto photoDto){
//        return new ResponseEntity<>(PhotoService.findByPrice(PhotoDto), HttpStatus.OK);
//    }
//    @GetMapping("/find-tag")
//    public ResponseEntity<List<PhotoDto>>findBytag (@RequestBody PhotoDto photoDto){
//        return new ResponseEntity<>(PhotoService.findByTag(PhotoDto), HttpStatus.OK);
//    }

    @DeleteMapping("/delete")
    void deletePhoto(@RequestBody PhotoDto photoDto) {
        photoService.delete(photoDto);
    }

    @DeleteMapping("/delete-id")
    void deletePhoto(@RequestBody UUID uuid) {
        photoService.deleteById(uuid);
    }

    @DeleteMapping("/delete-all")
    void deletePhoto(@RequestBody List<PhotoDto> photoDtos) {
        photoService.deleteAll(photoDtos);
    }

    @GetMapping("/return-photo")
    RequestEntity<PhotoDto> returnPhoto(@RequestBody PhotoDto photoDto) {
        return new RequestEntity<>(photoService.returnPhoto(PhotoDto), HttpStatus.OK);
    }
}
