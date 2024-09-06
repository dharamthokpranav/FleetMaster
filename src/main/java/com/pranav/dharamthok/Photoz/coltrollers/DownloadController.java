package com.pranav.dharamthok.Photoz.coltrollers;

import com.pranav.dharamthok.Photoz.service.PhotosService;
import com.pranav.dharamthok.Photoz.model.PhotoModel;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.nio.charset.StandardCharsets;

@RestController
public class DownloadController {

    private final PhotosService photosService;

    public DownloadController(PhotosService photosService) {
        this.photosService = photosService;
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadPhoto(@PathVariable Integer id){
        PhotoModel photo = photosService.get(id);
        if(photo==null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        byte[] data = photo.getData();

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.valueOf(photo.getContentType()));
        String encodedFilename = java.net.URLEncoder.encode(photo.getFileName(), StandardCharsets.UTF_8);

        ContentDisposition build = ContentDisposition.builder("attachment").filename(encodedFilename).build();
        headers.setContentDisposition(build);
        return new ResponseEntity<>(data, headers, HttpStatus.OK);

    }
}

