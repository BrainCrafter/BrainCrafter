/**
 * 
 */
package com.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.beans.Rating;
import com.beans.Item;
import com.beans.Source;

/**
 * @author n0j00am
 *
 */
public class ItemReviewDetailDao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	/**
	 * 
	 */
	public ItemReviewDetailDao() {
		// TODO Auto-generated constructor stub
	}

	public Item getItemReviewDetailById(String itemdesc ){  
	   
		String sql=	"select itm.itemdesc, itm.avg_rating, itm.avg_sentiment, itm.feedback, itm.no_of_reviews,src.source_website,src.price,"
				+ " src.avg_rating, src.avg_sentiment, src.no_of_reviews from item_dtls itm, rating_dtls rating , source_dtls src"
				+ "where itm.item_key=src.itemkey and src.source_dtl_key= rating.source_dtl_key and itm.itemdesc='Cuisinart 9-Speed 220-Watt Power Advantage";
		
	/*	List<Map<String, Object>> rows =	template.queryForList(sql);
	for( Map row:rows) {
		row.get(key)
	}*/
		
		//	String sql="select * from Emp99 where id=?";  
	    return template.queryForObject(sql, new Object[]{itemdesc},new BeanPropertyRowMapper<Item>(Item.class));  
	}  
	
	
	public List<Item> getItemReviewDetail(){  
	   
		String sql=	"select itm.itemdesc, itm.avg_rating, itm.avg_sentiment, itm.feedback, itm.no_of_reviews,src.source_website,src.price,"
				+ " src.avg_rating, src.avg_sentiment, src.no_of_reviews from item_dtls itm, rating_dtls rating , source_dtls src"
				+ "where itm.item_key=src.itemkey and src.source_dtl_key= rating.source_dtl_key";
		// and itm.itemdesc='Cuisinart 9-Speed 220-Watt Power Advantage";
//return template.query("select * from Emp99",new RowMapper<Item>(){ 
		
		
		return template.query(sql,new RowMapper<Item>(){  
	        public Item mapRow(ResultSet rs, int row) throws SQLException {  
	        	Item e=new Item();  
	            e.setItemDesc(rs.getString(1));  
	            e.setAvgRating(rs.getInt(2));  
	            e.setAvgSentiments(rs.getInt(3));  
	            e.setFeedback(rs.getString(4));  
	            e.setNoOfReviews(rs.getInt(5));
	            Source  source=new Source();
	            source.setSource_website(rs.getString(6));
	            source.setPrice(rs.getInt(7));
	            source.setAvgRating(rs.getInt(8));
	            source.setAvgSentiments(rs.getInt(9));
	            source.setNoOfReviews(rs.getInt(10));
	            e.setSource(source);
	             return e;  
	        }  
	    });  
	}  
	
	
	
	/*select itm.itemdesc, itm.avg_rating, itm.avg_sentiment, itm.feedback, itm.no_of_reviews,src.source_website,src.price, src.avg_rating, src.avg_sentiment, src.no_of_reviews from item_dtls itm, rating_dtls rating , source_dtls src
	where itm.item_key=src.itemkey
	and src.source_dtl_key= rating.source_dtl_key
	and itm.itemdesc='Cuisinart 9-Speed 220-Watt Power Advantage';*/
}
