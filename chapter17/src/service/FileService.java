package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
//사용자가 지정한 저장 폴더가 없을 경우 새롭게 만들어주는 메서드
	public void makeBasePath(String path){
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdirs(); // 예) /fileUpload/data/
		}
	}
	// 파일을 저장하는 메서드
	
	// 임시저장소에 있는 파일을 내가 원하는 위치로 파일을 복사하기 위해
	public String saveFile(File file, String basePath, String fileName) throws Exception{
		if(file == null){
			return null;
		}
		makeBasePath(basePath);
		String serverFullPath=
				basePath + System.getProperty("file.separator")+fileName;
		                                   //separator 운영체제마다 경로가 달라 경로를 알려줌.
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(serverFullPath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		System.out.println("service : " + serverFullPath);
		
		int readSize=0;
		while((readSize= bis.read()) != -1){
			bos.write(readSize);
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();
		return serverFullPath;		
	}
}
