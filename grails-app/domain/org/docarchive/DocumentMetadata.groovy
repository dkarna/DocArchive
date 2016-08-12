package org.docarchive

import java.util.Date;

class DocumentMetadata {
	static belongsTo = [documentdetails: DocumentDetail]
	Integer docLineID
	//Integer docID
	String metaValue
	String createdBy
	Date createdDate
	String modifiedBy
	Date modifiedDate

	static constraints = {
		id name: 'docLineID'
	}
}
