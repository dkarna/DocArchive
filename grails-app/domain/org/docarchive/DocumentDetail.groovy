package org.docarchive

import java.util.Date;

class DocumentDetail {

   static hasMany = [documentmetadata: DocumentMetadata]
	Integer docID
	String docName
	String docType
	String docPurpose
	Float docSize
	String filePath
	String createdBy
	Date createdDate
	String modifiedBy
	Date modifiedDate
	
	static constraints = {
		id name: 'docID'
    }
}
