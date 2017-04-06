package org.mrdlib.partnerContentManager.mediatum.MDLContent;

public class MdlDocumentTitleSearches {

	long document_title_search_id;
	String clean_search_string;
	String original_search_string;
	
	public MdlDocumentTitleSearches() {
		super();
	}
	
	public MdlDocumentTitleSearches(long document_title_search_id, String clean_search_string,
			String original_search_string) {
		super();
		this.document_title_search_id = document_title_search_id;
		this.clean_search_string = clean_search_string;
		this.original_search_string = original_search_string;
	}
	
	public long getDocument_title_search_id() {
		return document_title_search_id;
	}
	
	public void setDocument_title_search_id(long document_title_search_id) {
		this.document_title_search_id = document_title_search_id;
	}
	
	public String getClean_search_string() {
		return clean_search_string;
	}
	
	public void setClean_search_string(String clean_search_string) {
		this.clean_search_string = clean_search_string;
	}
	
	public String getOriginal_search_string() {
		return original_search_string;
	}
	
	public void setOriginal_search_string(String original_search_string) {
		this.original_search_string = original_search_string;
	}
	
}