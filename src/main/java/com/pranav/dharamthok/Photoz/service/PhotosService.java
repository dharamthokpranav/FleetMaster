package com.pranav.dharamthok.Photoz.service;


import com.pranav.dharamthok.Photoz.model.PhotoModel;
import com.pranav.dharamthok.Photoz.repository.PhotosRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotosService {

    private final PhotosRepository photosRepository;

//    private final
//    private Map<String, PhotoModel> db = new HashMap<String, PhotoModel>(){{
//        put("1", new PhotoModel("1", "photo1.jpg"));
//    }};

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<PhotoModel> get() {
       return photosRepository.findAll();
    }

    public PhotoModel get(Integer  id) {
        return photosRepository.findById(id).orElse(null);
    }

    public PhotoModel remove(Integer id) {
        photosRepository.deleteById(id);
        return null;
    }

    public PhotoModel save(String fileName, String contentType, byte[] data) {
        PhotoModel photo = new PhotoModel();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosRepository.save(photo);

        return photo;
    }


//    private List<PhotoModel> db = List.of(new PhotoModel("1", "photo1.jpg"));


}
