package com.sb.basic.cattesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Java_Exception_CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_Exception_CheckedException obj= new Java_Exception_CheckedException();
		try {
			obj.readContentsFromTextFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readContentsFromTextFile() throws FileNotFoundException
    {
    	File fileObj = new File("./resources/TestOrderNumbers.txt");
        FileInputStream fisObj = new FileInputStream(fileObj);
    }

}
