package com.imageuploadtest.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface ImageUploadService {

    //method to upload image in a folder

    String uploadImage(String path, MultipartFile file) throws IOException;

    InputStream getImage(String path,String fileName) throws FileNotFoundException;

}
