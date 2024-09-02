package com.pranav.dharamthok.Photoz.web;

import com.pranav.dharamthok.Photoz.service.PhotosService;
import com.pranav.dharamthok.Photoz.model.PhotoModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
public class PhotozController {

 private final PhotosService photosService;

    public PhotozController(PhotosService photosService) {
        this.photosService = photosService;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }


    @GetMapping("/photos")
    public Iterable<PhotoModel> get(){
        return photosService.get();

    }

    @GetMapping("/photos/{id}")
    public PhotoModel get(@PathVariable Integer id){
        PhotoModel photo = photosService.get(id);

        if(photo == null ) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return photo;
    }

    @DeleteMapping("/photos/{id}")
    public void delete(@PathVariable Integer id)
    {
        PhotoModel photo = photosService.remove(id);
        if(photo == null) throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/photos")
    public PhotoModel create(@RequestPart("data") MultipartFile file) throws IOException {

        return photosService.save(file.getOriginalFilename(), file.getContentType() , file.getBytes());
    }
//    @PostMapping("/photos")
//    public PhotoModel create(@RequestBody @Valid PhotoModel photo)
//    {
//        photo.setId(UUID.randomUUID().toString());
//        db.put(photo.getId(), photo);
//        return photo;
//    }
}
