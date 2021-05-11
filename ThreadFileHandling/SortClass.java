package com.src.java.thread.filehandler.filehandler;

import java.util.Comparator;

public class SortClass implements Comparator<ContentFile>{

	@Override
	public int compare(ContentFile o1, ContentFile o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}



}
