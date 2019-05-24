/**
 * 
 */
package com.beans;


/**
 * @author n0j00am
 *
 */
public class Rating {

	
	String user;
	
	String review;
	
	int avgRating;
	
	float avgSentiments;
	
	String  rating_dtls_key;
	String  source_dtls_key ;
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}
	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
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
	public float getAvgSentiments() {
		return avgSentiments;
	}
	/**
	 * @param avgSentiments the avgSentiments to set
	 */
	public void setAvgSentiments(float avgSentiments) {
		this.avgSentiments = avgSentiments;
	}
	/**
	 * @return the rating_dtls_key
	 */
	public String getRating_dtls_key() {
		return rating_dtls_key;
	}
	/**
	 * @param rating_dtls_key the rating_dtls_key to set
	 */
	public void setRating_dtls_key(String rating_dtls_key) {
		this.rating_dtls_key = rating_dtls_key;
	}
	/**
	 * @return the source_dtls_key
	 */
	public String getSource_dtls_key() {
		return source_dtls_key;
	}
	/**
	 * @param source_dtls_key the source_dtls_key to set
	 */
	public void setSource_dtls_key(String source_dtls_key) {
		this.source_dtls_key = source_dtls_key;
	}
	
	
}
