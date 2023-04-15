package com.bilgeadam.photo.controller;

import com.bilgeadam.photo.common.controller.BaseController;
import com.bilgeadam.photo.dto.PhotoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoController extends BaseController {

    @GetMapping
    public ResponseEntity<List<PhotoDto>> getAll() {
        //içi doldurulacak. null olmayacak
        return null;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<PhotoDto> getById(@PathVariable Long id) {
//        //içi doldurulacak. null olmayacak
//        return null;
//    }

    @PostMapping
    public ResponseEntity<PhotoDto> create(@RequestBody PhotoDto photoDTO) {
        //içi doldurulacak. null olmayacak
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhotoDto> update(@PathVariable Long id, @RequestBody PhotoDto photoDTO) {
        //içi doldurulacak. null olmayacak
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        //içi doldurulacak. null olmayacak
        return null;
    }
}
