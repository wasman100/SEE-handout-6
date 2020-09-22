package files;

import java.awt.FileDialog;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

import acm.graphics.*;
import acm.program.*;

public class flipImage extends GraphicsProgram {
	public void run(){
		
		String path =selectImage();
		
		GImage pic =new GImage(path);
		add(pic, 0 , 0);
		
		int flipped [] [] =flipImage(pic);
		GImage trial =new GImage(flipped);
		
		add(trial, 1000, 0);
	}

	private int[][] flipImage(GImage pic) {
		// TODO Auto-generated method stub
		int [] [] pixels = pic.getPixelArray();
		int height = pixels[0].length;
		int length = pixels.length;
		int [] [] copypixels = new int[length][height];;
		for(int row = 0; row < pixels.length; row++) {
			for(int col =0; col < pixels[row].length; col++) { 
				int NHeight = height-col -1;
				  copypixels[row][NHeight] =pixels[row][col];
				

			}

		}
		return copypixels;
	}

	private String selectImage() {
		// TODO Auto-generated method stub
		println("Please select the Image you want to see");
		FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
	    dialog.setMode(FileDialog.LOAD);
	    dialog.setVisible(true);
	   String path = dialog.getDirectory();
	   path += dialog.getFile();
	   return path;

	}
	

}
