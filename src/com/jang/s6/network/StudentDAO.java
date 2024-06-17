package com.jang.s6.network;

public class StudentDAO {
	
	public String studentList() throws Exception{
		
		String names = "1-동국-170-남성-2-철수-160-여성-3-둘리-150-남성-4-또희-140-여성";
		
//		StringTokenizer st = new StringTokenizer(names, "-");
//		
//		String name = "";
//		
//		while(st.hasMoreTokens()) {
//			name = st.nextToken();
//		}
		return names;
		
//		File file = new File("C:\\study\\st1.txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		
//		StudentDTO stDto = new StudentDTO();
//		
//		boolean flag = true;
//		
//		while(flag) {
//			String s = br.readLine();
//			if ( s == null ) {
//				break;
//			}
//			String[] ar = s.split("-");
//			stDto.setNum(Integer.parseInt(ar[0].trim()));
//			stDto.setName(ar[1].trim());
//			stDto.setHeight(Integer.parseInt(ar[2].trim()));
//			stDto.setGender(ar[3].trim());
//			
//		}
		
	}
}
