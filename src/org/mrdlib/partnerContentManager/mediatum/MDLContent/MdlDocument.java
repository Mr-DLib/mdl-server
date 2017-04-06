package org.mrdlib.partnerContentManager.mediatum.MDLContent;

import java.util.Date;

public class MdlDocument {

	long document_id;
	String id_original;
	long collection_id;
	String title;
	String title_clean;
	String published_in;
	String language;
	int publication_year;
	MdlDocumentType type;
	String keywords;
	Date added;
	
	public MdlDocument() {
		super();
	}
	
	public MdlDocument(long document_id, String id_original, long collection_id, String title, String title_clean,
			String published_in, String language, int publication_year, MdlDocumentType type, String keywords,
			Date added) {
		super();
		this.document_id = document_id;
		this.id_original = id_original;
		this.collection_id = collection_id;
		this.title = title;
		this.title_clean = title_clean;
		this.published_in = published_in;
		this.language = language;
		this.publication_year = publication_year;
		this.type = type;
		this.keywords = keywords;
		this.added = added;
	}
	
	public long getDocument_id() {
		return document_id;
	}
	
	public void setDocument_id(long document_id) {
		this.document_id = document_id;
	}
	
	public String getId_original() {
		return id_original;
	}
	
	public void setId_original(String id_original) {
		this.id_original = id_original;
	}
	
	public long getCollection_id() {
		return collection_id;
	}
	
	public void setCollection_id(long collection_id) {
		this.collection_id = collection_id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle_clean() {
		return title_clean;
	}
	
	public void setTitle_clean(String title_clean) {
		this.title_clean = title_clean;
	}
	
	public String getPublished_in() {
		return published_in;
	}
	
	public void setPublished_in(String published_in) {
		this.published_in = published_in;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getPublication_year() {
		return publication_year;
	}
	
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	
	public MdlDocumentType getType() {
		return type;
	}
	
	public void setType(MdlDocumentType type) {
		this.type = type;
	}
	
	public String getKeywords() {
		return keywords;
	}
	
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	public Date getAdded() {
		return added;
	}
	
	public void setAdded(Date added) {
		this.added = added;
	}
	
}