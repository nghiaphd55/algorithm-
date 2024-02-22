package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {

		// Tạo biến đếm
		int count = 0;
		
		// khai báo 1 chuỗi có giá trị
		String str = "Thăng ân lông";
		
		// thay thế tất cả ký tự ă=aw, â=aa, đ=dd, ê=ee, ô=oo, ơ=ow, ư=w
		str = str.replace("ă", "aw");
		str = str.replace("â", "aa");
		str = str.replace("đ", "dd");
		str = str.replace("ê", "ee");
		str = str.replace("ô", "oo");
		str = str.replace("ơ", "ow");
		str = str.replace("ư", "uw");

		// Tìm kiếm các chữ cái Tiếng Việt có thể được tạo thành trong 1 chuỗi chữ cái latin
		  if (str.contains("aw")) {
			  count++;
		  }
		  if (str.contains("aa")) {
			  count++;
		  }
		  if (str.contains("dd")) {
			  count++;
		  }
		  if (str.contains("ee")) {
			  count++;
		  }
		  if (str.contains("oo")) {
			  count++;
		  }
		  if (str.contains("ow")) {
			  count++;
		  }
		  if (str.contains("uw")) {
			  count++;
		  }
		  
		  System.out.println(str);
		  System.out.println(count);
	}
	
}
