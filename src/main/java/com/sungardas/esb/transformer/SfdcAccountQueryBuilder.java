package com.sungardas.esb.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.api.transport.PropertyScope;


/**
 * Transformer to build the SFDC query lookup for Account retrieval
 * 
 * @author srata
 * 
 */

public class SfdcAccountQueryBuilder  extends AbstractMessageTransformer  {
	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

		String searchCriteria=null;
		StringBuilder sb=null;
		
		if (message.getProperty("email", PropertyScope.INVOCATION ).toString()!=null) {
        	searchCriteria = message.getProperty("email", PropertyScope.INVOCATION ).toString();
        	sb = new StringBuilder("select Id, Email, Workday_Employee_Number__c, pse__Is_Resource_Active__c from Contact where Email like (");
		}
		
		if (message.getProperty("companyName", PropertyScope.INVOCATION ).toString()!=null) {
        	searchCriteria = message.getProperty("companyName", PropertyScope.INVOCATION ).toString();
        	sb = new StringBuilder("select Name, AccountNumber, DomainName_c__c from Account where Name like (");
		} 

    	if (searchCriteria!=null) {
    		System.out.println("Found email/companyName: " + searchCriteria);
            sb.append('\'');
            sb.append('%');
            sb.append(searchCriteria);
            sb.append('%');
            sb.append("',");
    	}
    	else {
    		// RAML should have caught that, but just in case...
    		System.out.println("Neither email or companyName was passed as Search Criteria: " + searchCriteria);
    		return null;
    	}
        
        sb.append(')');

        System.out.println("Account query: " + sb);

        return sb.toString();
	}
	

}
