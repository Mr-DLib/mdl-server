package org.mrdlib.api.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import org.mrdlib.api.manager.Constants;

/**
 * 
 * @author Millah
 * 
 *         This class handles the representation of the document information of
 *         one document. The XML format is automatically generated through the
 *         class structure.
 *
 */

public class DisplayDocument implements Serializable {

	private static final long serialVersionUID = 1L;

	// attributes
	private String recommendationId;
	private String documentId;
	private String originalDocumentId;

	// elements
	private List<Snippet> snippetList = new ArrayList<Snippet>();
	private String clickUrl;
	private String fallbackUrl;
	private String language;
	private DebugDetails debugDetails = new DebugDetails();

	private String title;
	private String authorNames;
	private String publishedIn;
	private int year;
	private String cleanTitle;
	private String keywords;
	private String docAbstract;

	private int suggestedRank;
	private String collectionShortName;
	private Long collectionId;

	public DisplayDocument() {
	}

	public DisplayDocument(String title, String documentId, String originalDocumentId) {
		this.documentId = documentId;
		this.originalDocumentId = originalDocumentId;
		this.title = title;
	}

	public DisplayDocument(String documentId, String originalDocumentId, String title, String publishedIn, int year,
			String collectionShortName, Constants constants) {
		this.documentId = documentId;
		this.originalDocumentId = originalDocumentId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.year = year;
		this.collectionShortName = collectionShortName;
	}

	public DisplayDocument(String recommendationId, String documentId, String originalDocumentId, int suggestedRank,
			String title, String authorNames, String publishedIn, String docAbstract, String keywords, int year,
			String clickUrl, String fallbackUrl, String collectionShortName, Constants constants) {
		this.recommendationId = recommendationId;
		this.documentId = documentId;
		this.originalDocumentId = originalDocumentId;
		this.suggestedRank = suggestedRank;
		this.title = title;
		this.authorNames = authorNames;
		this.publishedIn = publishedIn;
		setKeywords(keywords);
		setDocAbstract(docAbstract);
		this.year = year;
		this.snippetList.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_plain"));
		this.snippetList.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_fully_formatted"));
		this.snippetList.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_and_css"));
		this.clickUrl = clickUrl;
		this.fallbackUrl = fallbackUrl;
		this.collectionShortName = collectionShortName;
	}

	/**
	 * 
	 * calculate cleanTitle of a Document, only letters are valid characters
	 * 
	 * @return String, cleanTitle
	 */
	public String calculateCleanTitle() {
		String cleanTitle = "";
		cleanTitle = this.getTitle().replaceAll("[^a-zA-Z]", "");
		cleanTitle = cleanTitle.toLowerCase();
		return cleanTitle;
	}

	public String getCleanTitle() {
		return this.cleanTitle;
	}

	public void reCalculateSnippets() {
		List<Snippet> temp = new ArrayList<Snippet>();
		temp.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_plain"));
		temp.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_fully_formatted"));
		temp.add(new Snippet(clickUrl, title, authorNames, publishedIn, year, "html_and_css"));
		this.setSnippetList(temp);
	}

	@XmlTransient
	public void setCleanTitle(String cleanTitle) {
		this.cleanTitle = cleanTitle;
	}

	public int getBibDocId() {
		return this.debugDetails.getBibDocId();
	}

	@XmlTransient
	public void setBibDocId(int bibDocId) {
		this.debugDetails.setBibDocId(bibDocId);
	}

	public DebugDetails getDebugDetails() {
		return debugDetails;
	}

	@XmlElement(name = "debug_details")
	public void setDebugDetails(DebugDetails debugDetails) {
		this.debugDetails = debugDetails;
	}

	public void setTitle(String title) {
		this.title = title.replaceAll("[<>]", "");
	}

	@XmlElement(name = "authors")
	public void setAuthorNames(String authorNames) {
		this.authorNames = authorNames.replaceAll("[<>]", "");
	}

	@XmlElement(name = "published_in")
	public void setPublishedIn(String publishedIn) {
		this.publishedIn = publishedIn.replaceAll("[<>]", "");
	}

	@XmlElement(name = "abstract")
	public void setDocAbstract(String docAbstract) {
		if (docAbstract != null && !docAbstract.equals("")) {
			this.docAbstract = "<![CDATA[" + docAbstract.replaceAll("[<>]", "") + "]]>";
		} else
			this.docAbstract = null;
	}

	@XmlElement(name = "keywords")
	public void setKeywords(String keywords) {
		if (keywords != null && keywords.length()>0) {
			this.keywords = "<![CDATA[" + keywords.replaceAll("[<>]", "") + "]]>";
		}
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorNames() {
		return authorNames;
	}

	public String getPublishedIn() {
		return publishedIn;
	}

	public String getKeywords() {
		return keywords;
	}

	public String getDocAbstract() {
		return docAbstract;
	}

	public int getYear() {
		return year;
	}

	public Long getCollectionId() {
		return collectionId;
	}

	@XmlTransient
	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}

	public String getCollectionShortName() {
		return collectionShortName;
	}

	@XmlTransient
	public void setCollectionShortName(String collectionShortName) {
		this.collectionShortName = collectionShortName;
	}

	public String getRecommendationId() {
		return recommendationId;
	}

	@XmlAttribute(name = "recommendation_id")
	public void setRecommendationId(String recommendationId) {
		this.recommendationId = recommendationId;
	}

	public String getDocumentId() {
		return documentId;
	}

	@XmlAttribute(name = "document_id")
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getOriginalDocumentId() {
		return originalDocumentId;
	}

	@XmlAttribute(name = "original_document_id")
	public void setOriginalDocumentId(String originalDocumentId) {
		this.originalDocumentId = originalDocumentId;
	}

	public int getSuggestedRank() {
		return suggestedRank;
	}

	@XmlElement(name = "suggested_rank")
	public void setSuggestedRank(int suggestedRank) {
		this.suggestedRank = suggestedRank;
	}

	public List<Snippet> getSnippetList() {
		return snippetList;
	}

	@XmlElement(name = "snippet")
	public void setSnippetList(List<Snippet> snippetList) {
		this.snippetList = snippetList;
	}

	public String getClickUrl() {
		return clickUrl;
	}

	@XmlElement(name = "click_url")
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
		for (int i = 0; i < snippetList.size(); i++)
			this.snippetList.get(i).setClickUrl(clickUrl);
	}

	public String getFallbackUrl() {
		return fallbackUrl;
	}

	@XmlElement(name = "fallback_url")
	public void setFallbackUrl(String fallbackUrl) {
		this.fallbackUrl = fallbackUrl;
	}

	
	private String languageDetected;

	public String getLanguageDetected() {
		return languageDetected;
	}

	public void setLanguageDetected(String languageDetected) {
		this.languageDetected = languageDetected;
	}


	public String getLanguage() {
		return language;
	}

	@XmlTransient
	public void setLanguage(String language) {
		this.language = language;
	}

	public int getRankAfterAlgorithm() {
		return this.debugDetails.getRankAfterAlgorithm();
	}

	@XmlTransient
	public void setRankAfterAlgorithm(int rankAfterAlgorithm) {
		this.debugDetails.setRankAfterAlgorithm(rankAfterAlgorithm);
	}

	public int getRankAfterReRanking() {
		return this.debugDetails.getRankAfterReRanking();
	}

	@XmlTransient
	public void setRankAfterReRanking(int rankAfterReRanking) {
		this.debugDetails.setRankAfterReRanking(rankAfterReRanking);
	}

	public int getRankAfterShuffling() {
		return this.debugDetails.getRankAfterShuffling();
	}

	@XmlTransient
	public void setRankAfterShuffling(int rankAfterShuffling) {
		this.debugDetails.setRankAfterShuffling(rankAfterShuffling);
	}

	public int getRankDelivered() {
		return this.debugDetails.getRankDelivered();
	}

	@XmlTransient
	public void setRankDelivered(int rankDelivered) {
		this.debugDetails.setRankDelivered(rankDelivered);
	}

	public double getRelevanceScoreFromAlgorithm() {
		return this.debugDetails.getRelevanceScoreFromAlgorithm();
	}

	@XmlTransient
	public void setRelevanceScoreFromAlgorithm(double relevanceScoreFromAlgorithm) {
		this.debugDetails.setRelevanceScoreFromAlgorithm(relevanceScoreFromAlgorithm);
	}

	public double getBibScore() {
		return this.debugDetails.getBibScore();
	}

	@XmlTransient
	public void setBibScore(double bibScore) {
		this.debugDetails.setBibScore(bibScore);
	}

	public double getFinalScore() {
		return this.debugDetails.getFinalScore();
	}

	@XmlTransient
	public void setFinalScore(double finalScore) {
		this.debugDetails.setFinalScore(finalScore);
	}

    @Override
    public String toString(){
	return String.format("title=%s, authors=%s, year=%d, docId=%s, id_org=%s",
			     getTitle(), getAuthorNames(), getYear(), getDocumentId(), getOriginalDocumentId());
    }

	
	private Date added;

	public Date getAdded() {
		return added;
	}

	@XmlTransient
	public void setAdded(Date added) {
		this.added = added;
	}

	
	private Date deleted;

	@XmlTransient
	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	
	private Date checked;

	public Date getChecked() {
		return checked;
	}

	@XmlTransient
	public void setChecked(Date checked) {
		this.checked = checked;
	}
	
}
