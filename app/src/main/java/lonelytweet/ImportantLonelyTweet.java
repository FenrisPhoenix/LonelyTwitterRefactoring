package lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		// FIX: Simplified isValid by removing unessecary if-else statement
		return tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20;
	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}