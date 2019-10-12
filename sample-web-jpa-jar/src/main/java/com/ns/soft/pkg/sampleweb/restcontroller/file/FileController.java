package com.ns.soft.pkg.sampleweb.restcontroller.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@PathVariable("file") MultipartFile file) {
		File uploadedFile = new File("C://Personal//Work//Temp//tmp//" + file.getOriginalFilename());
		try {
			uploadedFile.createNewFile();
			FileOutputStream outputStream = new FileOutputStream(uploadedFile);
			outputStream.write(file.getBytes());
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "File Upload Successfully";
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<Object> downloadFile() {
		String filename = "C://Personal//Work//Temp//tmp//SpringFileUploadTest.txt";
		File file = new File(filename);
		//		InputStreamSource inputStreamSource = new InputStreamSource() {
		//			@Override
		//			public InputStream getInputStream() throws IOException {
		//				// TODO Auto-generated method stub
		//				return new FileInputStream(file);
		//			}
		//		};
		Path path = Paths.get(file.getAbsolutePath());
		ByteArrayResource resource = null;
		try {
			resource = new ByteArrayResource(Files.readAllBytes(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");
		ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
		return responseEntity;
	}
}
