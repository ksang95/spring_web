package com.bit.gangnam.contr;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadTestController {
	@RequestMapping("/file/fileUpload")
	public String fileUpload() {
		return "file/fileUploadTest";
	}
	@RequestMapping(value="/file/fileUploadProc",method=RequestMethod.POST)
	public String fileUploadProc(MultipartFile file, String title, HttpServletRequest request, Model model) {
		String fileName=file.getOriginalFilename();
		System.out.println(fileName);
		String rootdir=request.getSession().getServletContext().getRealPath("/");
		System.out.println(rootdir);
		File dir=new File(rootdir+"upload");  //디렉토리 생성
		File uploadfile=new File(dir,fileName); //해당 디렉토리+넘겨받은 파일 이름으로 File객체 생성
		
		try {
			file.transferTo(uploadfile); //넘겨받은 파일을 업로드
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("img", "/upload/"+uploadfile.getName());
		
		return "file/fileUploadResult";
	}
}
