/**
 * 
 */
package com.beans;


/**
 * @author n0j00am
 *
 */
public class Source {
	
	
	String source_website;
	int price;
	
	int avgRating;
	
	int avgSentiments;

	int noOfReviews;
	String item_key;
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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
	 * @return the source_website
	 */
	public String getSource_website() {
		return source_website;
	}
	/**
	 * @param source_website the source_website to set
	 */
	public void setSource_website(String source_website) {
		this.source_website = source_website;
	}

}
