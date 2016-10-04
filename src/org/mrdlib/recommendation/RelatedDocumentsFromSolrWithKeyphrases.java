package org.mrdlib.recommendation;

import org.mrdlib.display.DisplayDocument;
import org.mrdlib.display.DocumentSet;
import org.mrdlib.solrHandler.NoRelatedDocumentsException;

public class RelatedDocumentsFromSolrWithKeyphrases extends RelatedDocumentsFromSolr {
	public RelatedDocumentsFromSolrWithKeyphrases() throws Exception {
		super();
		loggingInfo.replace("name", "RelatedDocumentsFromSolrWithKeyphrases");
		loggingInfo.replace("cbf_feature_type", "keyphrase_(bigram)");
	}

	@Override
	public DocumentSet getRelatedDocumentSet(DisplayDocument requestDoc, int numberOfRelatedDocs) throws Exception {
		try {
			return scon.getRelatedDocumentSetUsingKeyphrases(requestDoc, numberOfRelatedDocs);
		} catch (NoRelatedDocumentsException f) {
			System.out.println("No related documents for doc_id " + requestDoc.getDocumentId());
			throw f;
		} catch(Exception e){
			e.printStackTrace();
			throw e;
		} finally{
			if(scon!=null) scon.close();
			if(con!=null) con.close();
		}
	}
}
