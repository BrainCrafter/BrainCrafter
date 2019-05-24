/**
 * 
 */
package com.beans;


/**
 * @author n0j00am
 *
 */
public class Item {

private String item_key;
private Source source;
	
	private	String itemDesc;
	
	
	private	String feedback;
	
	
	private String itemURL;
	
	
	private int avgRating;

	private int avgSentiments;
	
	private int noOfReviews;

	/**
	 * @return the item_key
	 */
	public String getItem_key() {
		return item_key;
	}

	/**
	 * @param item_key the item_key to set
	 */
	public void setItem_key(String item_key) {
		this.item_key = item_key;
	}

	/**
	 * @return the itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}

	/**
	 * @param itemDesc the itemDesc to set
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	/**
	 * @return the itemURL
	 */
	public String getItemURL() {
		return itemURL;
	}

	/**
	 * @param itemURL the itemURL to set
	 */
	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;
	}

	/**
	 * @return the avgRating
	 */
	public int getAvgRating() {
		return avgRating;
	}

	/**
	 * @param avgRating the avgRating to set
	 */
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	/**
	 * @return the avgSentiments
	 */
	public int getAvgSentiments() {
		return avgSentiments;
	}

	/**
	 * @param avgSentiments the avgSentiments to set
	 */
	public void setAvgSentiments(int avgSentiments) {
		this.avgSentiments = avgSentiments;
	}

	/**
	 * @return the noOfReviews
	 */
	public int getNoOfReviews() {
		return noOfReviews;
	}

	/**
	 * @param noOfReviews the noOfReviews to set
	 */
	public void setNoOfReviews(int noOfReviews) {
		this.noOfReviews = noOfReviews;
	}

	/**
	 * @return the source
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Source source) {
		this.source = source;
	}

}
