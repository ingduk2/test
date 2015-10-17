package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
//����ڰ� ������ ���� ������ ���� ��� ���Ӱ� ������ִ� �޼���
	public void makeBasePath(String path){
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdirs(); // ��) /fileUpload/data/
		}
	}
	// ������ �����ϴ� �޼���
	
	// �ӽ�����ҿ� �ִ� ������ ���� ���ϴ� ��ġ�� ������ �����ϱ� ����
	public String saveFile(File file, String basePath, String fileName) throws Exception{
		if(file == null){
			return null;
		}
		makeBasePath(basePath);
		String serverFullPath=
				basePath + System.getProperty("file.separator")+fileName;
		                                   //separator �ü������ ��ΰ� �޶� ��θ� �˷���.
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
