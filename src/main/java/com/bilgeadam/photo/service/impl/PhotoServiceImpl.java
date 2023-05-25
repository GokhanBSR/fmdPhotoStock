package com.bilgeadam.photo.service.impl;

import com.bilgeadam.photo.common.service.impl.BaseService;
import com.bilgeadam.photo.dto.PhotoDto;
import com.bilgeadam.photo.model.Photo;
import com.bilgeadam.photo.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PhotoServiceImpl extends BaseService<PhotoRepository, PhotoMapper, Photo, PhotoDto> implements PhotoService {

    private final PhotoRepository photoRepository;
    private final PhotoMapper photoMapper;

    @Autowired
    public PhotoServiceImpl(PhotoMapper mapper, PhotoRepository repository, PhotoRepository photoRepository, PhotoMapper photoMapper) {
        super(mapper, repository);
        this.photoRepository = photoRepository;
        this.photoMapper = photoMapper;
    }

    @Override
    public PhotoDto save(PhotoDto dto) {
        return super.save(dto);
    }

    @Override
    public List<PhotoDto> saveAll(List<PhotoDto> dtoList) {
        return super.saveAll(dtoList);
    }

    @Override
    public List<PhotoDto> findAll() {
        return super.findAll();
    }

    @Override
    public PhotoDto findById(UUID uuid) {
        return super.findById(uuid);
    }

    @Override
    public void delete(PhotoDto PhotoDto) {
        super.delete(PhotoDto);
    }

    @Override
    public void deleteById(UUID uuid) {
        super.deleteById(uuid);
    }

    @Override
    public void deleteAll(List<PhotoDto> photoDtos) {
        super.deleteAll(photoDtos);
    }
    //    @Override
//    public PhotoDto addPhoto(PhotoDto photoDto) {
//        return super.save(Photodto);
//    }
//
//    @Override
//    public List<PhotoDto> saveAll(List<PhotoDto> dtoList) {
//        return super.saveAll(dtoList);
//    }


}
