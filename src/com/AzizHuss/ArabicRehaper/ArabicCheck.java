package com.AzizHuss.ArabicRehaper;

public class ArabicCheck{
	
	public boolean isArabic() {
		return arabic;
	}


	public void setArabic(boolean hasArabic) {
		this.arabic = hasArabic;
	}


	public String getConnectedArabic() {
		return connectedArabic;
	}


	public void setConnectedArabic(String connectedArabic) {
		this.connectedArabic = connectedArabic;
	}


	private boolean arabic;
	private String connectedArabic;
	private int cursorIndex;
	
	public int getCursorIndex() {
		return cursorIndex;
	}


	public void setCursorIndex(int cursorIndex) {
		this.cursorIndex = cursorIndex;
	}


	public  ArabicCheck(){
		arabic=false;
	}
	
	
}