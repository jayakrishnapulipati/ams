package com.jk.ams.utils;

import java.io.FileOutputStream;
import java.util.Calendar;

import javax.xml.ws.WebServiceException;

import org.apache.tomcat.util.codec.binary.Base64;

import com.jk.ams.dto.FileUpload;

public class FileUploadHelper {

	public static String uploadFile(String filePath, FileUpload fileUpload) {
		String fileNameString = null;
		try {
			fileNameString = fileUpload.getFileName() + Calendar.getInstance().getTimeInMillis();
			byte[] imageByte = Base64.decodeBase64(fileUpload.getImage());

			FileOutputStream fos = new FileOutputStream(filePath + fileNameString);
			fos.write(imageByte);
			fos.close();

		} catch (Exception ex) {
			System.err.println(ex);
			throw new WebServiceException(ex);
		}

		return fileNameString;
	}
}
