package com.AzizHuss.ArabicRehaper;

public class ArabicTextWithCursor{
	
	private boolean arabic;
	private String connectedArabic;
	private int cursorIndex;
	
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



	
	public int getCursorIndex() {
		return cursorIndex;
	}


	public void setCursorIndex(int cursorIndex) {
		this.cursorIndex = cursorIndex;
	}


	public  ArabicTextWithCursor(){
		arabic=false;
	}
	
	
}