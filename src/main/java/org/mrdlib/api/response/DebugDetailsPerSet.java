package org.mrdlib.api.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

import org.mrdlib.recommendation.algorithm.AlgorithmDetails;

/**
 * 
 * @author Millah
 * 
 *         This class handles the representation for the DebugDetails, the
 *         algorithms parameter per recommendation set. The XML format is
 *         automatically generated through the class structure.
 */
public class DebugDetailsPerSet {
	private String recommendationApproach;

	private List<Statistics> rankStats = new ArrayList<Statistics>();

	private boolean bibliometricReRanking = true;

	private int numberOfCandidatesToReRank;
	private String reRankingCombination;
	private String rankingOrder;
	private int bibliometricId = -1;
	private String bibliometric;
	private String bibType;
	private String bibSource;
	private boolean fallbackRanking = false;

	private AlgorithmDetails algoDetails = new AlgorithmDetails();
	private long numberOfReturnedResults;
	private int desiredNumberFromAlgorithm;
	private int numberOfDisplayedRecommendations = 1;

	private boolean shuffled = false;

	private Long startTime;
	private Long algorithmChoosingTime;
	private Long userModelTime;
	private Long algorithmExecutionTime;
	private Long rerankTime;

	private String accessKeyHash;
	private String originatingIp;

	private String externalRecommendationSetId;
	private String externalAlgorithmId;

	private String requestingPartnerId;
	private String requestingAppId;
	private String appVersion;
	private String appLang;

	// NEED timestamps: end?

	public DebugDetailsPerSet() {
	}

	public boolean isFallbackRanking() {
		return fallbackRanking;
	}

	public void setFallbackRanking(boolean fallbackRanking) {
		this.fallbackRanking = fallbackRanking;
	}

	public void addRankingStats(Statistics stats) {
		this.rankStats.add(stats);
	}

	public List<Statistics> getRankStats() {
		return rankStats;
	}

	public void setRankStats(List<Statistics> rankStats) {
		this.rankStats = rankStats;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getAlgorithmChoosingTime() {
		return algorithmChoosingTime;
	}

	public void setAlgorithmChoosingTime(Long afterAlgorithmChoosingTime) {
		this.algorithmChoosingTime = afterAlgorithmChoosingTime;
	}

	public Long getUserModelTime() {
		return userModelTime;
	}

	public void setUserModelTime(Long afterUserModelTime) {
		this.userModelTime = afterUserModelTime;
	}

	public Long getAlgorithmExecutionTime() {
		return algorithmExecutionTime;
	}

	public void setAlgorithmExecutionTime(Long afterAlgorithmExecutionTime) {
		this.algorithmExecutionTime = afterAlgorithmExecutionTime;
	}

	public Long getRerankTime() {
		return rerankTime;
	}

	public void setRerankTime(Long afterRerankTime) {
		this.rerankTime = afterRerankTime;
	}

	public String getBibliometric() {
		return bibliometric;
	}

	public void setBibliometric(String bibliometric) {
		this.bibliometric = bibliometric;
	}

	public String getBibType() {
		return bibType;
	}

	public void setBibType(String bibType) {
		this.bibType = bibType;
	}

	public String getBibSource() {
		return bibSource;
	}

	public void setBibSource(String bibSource) {
		this.bibSource = bibSource;
	}

	public int getNumberOfDisplayedRecommendations() {
		return numberOfDisplayedRecommendations;
	}

	public void setNumberOfDisplayedRecommendations(int numberOfDisplayedRecommendations) {
		this.numberOfDisplayedRecommendations = numberOfDisplayedRecommendations;
	}

	public int getDesiredNumberFromAlgorithm() {
		return desiredNumberFromAlgorithm;
	}

	public void setDesiredNumberFromAlgorithm(int desiredNumberFromAlgorithm) {
		this.desiredNumberFromAlgorithm = desiredNumberFromAlgorithm;
	}

	public boolean isShuffled() {
		return shuffled;
	}

	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	public int getNumberOfCandidatesToReRank() {
		return numberOfCandidatesToReRank;
	}

	public void setNumberOfCandidatesToReRank(int numberOfCandidatesToReRank) {
		this.numberOfCandidatesToReRank = numberOfCandidatesToReRank;
	}

	public String getReRankingCombination() {
		return reRankingCombination;
	}

	public void setReRankingCombination(String reRankingCombination) {
		this.reRankingCombination = reRankingCombination;
	}

	public String getRankingOrder() {
		return rankingOrder;
	}

	public void setRankingOrder(String rankingOrder) {
		this.rankingOrder = rankingOrder;
	}

	public long getNumberOfReturnedResults() {
		return numberOfReturnedResults;
	}

	public void setNumberOfReturnedResults(long numberOfReturnedResults) {
		this.numberOfReturnedResults = numberOfReturnedResults;
	}

	public boolean isFallback() {
		return this.algoDetails.isFallback();
	}

	public void setFallback(boolean fallback) {
		this.algoDetails.setFallback(fallback);
		;
	}

	public String getRecommendationAlgorithmId() {
		return Integer.toString(this.algoDetails.getRecommendationAlgorithmId());
	}

	public void setRecommendationAlgorithmId(int recommendationAlgorithmId) {
		this.algoDetails.setRecommendationAlgorithmId(recommendationAlgorithmId);
	}

	public int getBibliometricId() {
		return bibliometricId;
	}

	public void setBibliometricId(int bibliometricId) {
		this.bibliometricId = bibliometricId;
	}

	public boolean isBibliometricReRanking() {
		return bibliometricReRanking;
	}

	public void setBibliometricReRanking(boolean bibliometricReRanking) {
		this.bibliometricReRanking = bibliometricReRanking;
	}

	public String getRecommendationApproach() {
		return recommendationApproach;
	}

	public void setRecommendationApproach(String recommendationApproach) {
		this.recommendationApproach = recommendationApproach;
	}

	/**
	 * @return the accessKeyHash
	 */
	public String getAccessKeyHash() {
		return accessKeyHash;
	}

	/**
	 * @param accessKeyHash
	 *            the accessKeyHash to set
	 */
	public void setAccessKeyHash(String accessKeyHash) {
		this.accessKeyHash = accessKeyHash;
	}

	public AlgorithmDetails getAlgoDetails() {
		return algoDetails;
	}

	public void setAlgoDetails(AlgorithmDetails details) {
		this.algoDetails = details;
	}

	public String getOriginatingIp() {
		return originatingIp;
	}

	@XmlTransient
	public void setOriginatingIp(String originatingIp) {
		this.originatingIp = originatingIp;
	}

	public String getRequestingPartnerId() {
		return requestingPartnerId;
	}

	@XmlTransient
	public void setRequestingPartnerId(String partnerId) {
		this.requestingPartnerId = partnerId;
	}

	public String getRequestingAppId() {
		return requestingAppId;
	}

	@XmlTransient
	public void setRequestingAppId(String appId) {
		this.requestingAppId = appId;
	}

	public String getAppVersion() {
		return appVersion;
	}

	@XmlTransient
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppLang() {
		return appLang;
	}

	@XmlTransient
	public void setAppLang(String appLang) {
		this.appLang = appLang;
	}

	public String getExternalRecommendationSetId() {
		return externalRecommendationSetId;
	}

	@XmlTransient
	public void setExternalRecommendationSetId(String externalRecommendationSetId) {
		this.externalRecommendationSetId = externalRecommendationSetId;
	}

	public String getExternalAlgorithmId() {
		return externalAlgorithmId;
	}

	@XmlTransient
	public void setExternalAlgorithmId(String externalAlgorithmId) {
		this.externalAlgorithmId = externalAlgorithmId;
	}

}
