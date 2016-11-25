package org.mrdlib.recommendation.algorithm;

import java.util.Random;

import org.mrdlib.api.response.DisplayDocument;
import org.mrdlib.api.response.DocumentSet;
import org.mrdlib.database.DBConnection;

public class RandomDocumentRecommenderLanguageRestricted extends RandomDocumentRecommender {
	/**
	 * Creates a new Recommender that returns random documents which share same
	 * language as <code>requestDoc</code>
	 * 
	 * @param con
	 *            DatabaseConnection instance through which the database methods
	 *            can be accessed
	 * @throws Exception
	 *             if solrConnection cannot be created in the super-class
	 */
	public RandomDocumentRecommenderLanguageRestricted(DBConnection con) throws Exception {
		super(con);
		algorithmLoggingInfo.setName("RandomDocumentRecommenderLanguageRestricted");
		algorithmLoggingInfo.setLanguageRestriction(true);
	}

	@Override
	/**
	 * calls the <code>getRelatedDocumentSet(DisplayDocument, int)</code>
	 * requesting the default number of documents.
	 * 
	 */
	public DocumentSet getRelatedDocumentSet(DisplayDocument requestDoc) throws Exception {
		return getRelatedDocumentSet(requestDoc, 10);
	}

	/**
	 * Returns <code>numberOfRelatedDocs</code> number which share the same
	 * language as <code>requestDoc</code> of documents randomly selected from
	 * the collection. Addresses the Simplest case that all documents of same
	 * collection are consecutive in the database
	 * 
	 */
	@Override
	public DocumentSet getRelatedDocumentSet(DisplayDocument requestDoc, int numberOfRelatedDocs) throws Exception {
		Random random = new Random();
		long randomSeed = random.nextLong();
		random.setSeed(randomSeed);
		String seed = Integer.toString(random.nextInt());

		try {
			return scon.getRandomDocumentSet(requestDoc, numberOfRelatedDocs, true, seed);
		} catch (Exception e) {
			throw e;
		} /*finally {
		if (scon != null)
		scon.close();
}*/
	}

}
