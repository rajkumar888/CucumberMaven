package excelData;

import dataLibraryPack.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		try
		{		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Driver\\TestDataFile2007.xlsx");
		
		
		String result=excel.getData(0, 0, 0);
			
		System.out.println(result);
	}

	 catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
